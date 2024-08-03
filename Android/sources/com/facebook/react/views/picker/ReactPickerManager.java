package com.facebook.react.views.picker;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.views.picker.C1417c;
import com.facebook.react.views.picker.p132a.C1415a;
import p139d.p143b.p204k.p205a.C2038a;

/* loaded from: classes.dex */
public abstract class ReactPickerManager extends SimpleViewManager<C1417c> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.picker.ReactPickerManager$a */
    /* loaded from: classes.dex */
    public static class C1412a implements C1417c.a {

        /* renamed from: a */
        private final C1417c f5187a;

        /* renamed from: b */
        private final C1333f f5188b;

        public C1412a(C1417c c1417c, C1333f c1333f) {
            this.f5187a = c1417c;
            this.f5188b = c1333f;
        }

        @Override // com.facebook.react.views.picker.C1417c.a
        /* renamed from: a */
        public void mo6036a(int i) {
            this.f5188b.m5753a(new C1415a(this.f5187a.getId(), i));
        }
    }

    /* renamed from: com.facebook.react.views.picker.ReactPickerManager$b */
    /* loaded from: classes.dex */
    private static class C1413b extends ArrayAdapter<ReadableMap> {

        /* renamed from: a */
        private final LayoutInflater f5189a;

        /* renamed from: b */
        private Integer f5190b;

        public C1413b(Context context, ReadableMap[] readableMapArr) {
            super(context, 0, readableMapArr);
            Object systemService = context.getSystemService("layout_inflater");
            C2038a.m8318a(systemService);
            this.f5189a = (LayoutInflater) systemService;
        }

        /* renamed from: a */
        private View m6037a(int i, View view, ViewGroup viewGroup, boolean z) {
            int i2;
            Integer num;
            ReadableMap item = getItem(i);
            if (view == null) {
                view = this.f5189a.inflate(z ? R.layout.simple_spinner_dropdown_item : R.layout.simple_spinner_item, viewGroup, false);
            }
            TextView textView = (TextView) view;
            textView.setText(item.getString("label"));
            if (z || (num = this.f5190b) == null) {
                if (item.hasKey("color") && !item.isNull("color")) {
                    i2 = item.getInt("color");
                }
                return view;
            }
            i2 = num.intValue();
            textView.setTextColor(i2);
            return view;
        }

        /* renamed from: a */
        public void m6038a(Integer num) {
            this.f5190b = num;
            notifyDataSetChanged();
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return m6037a(i, view, viewGroup, true);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return m6037a(i, view, viewGroup, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1417c c1417c) {
        c1417c.setOnSelectListener(new C1412a(c1417c, ((UIManagerModule) c1278n.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1417c c1417c) {
        super.onAfterUpdateTransaction((ReactPickerManager) c1417c);
        c1417c.m6041a();
    }

    @InterfaceC1294a(customType = "Color", name = "color")
    public void setColor(C1417c c1417c, Integer num) {
        c1417c.setPrimaryColor(num);
        C1413b c1413b = (C1413b) c1417c.getAdapter();
        if (c1413b != null) {
            c1413b.m6038a(num);
        }
    }

    @InterfaceC1294a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1417c c1417c, boolean z) {
        c1417c.setEnabled(z);
    }

    @InterfaceC1294a(name = "items")
    public void setItems(C1417c c1417c, ReadableArray readableArray) {
        C1413b c1413b;
        if (readableArray != null) {
            ReadableMap[] readableMapArr = new ReadableMap[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                readableMapArr[i] = readableArray.getMap(i);
            }
            c1413b = new C1413b(c1417c.getContext(), readableMapArr);
            c1413b.m6038a(c1417c.getPrimaryColor());
        } else {
            c1413b = null;
        }
        c1417c.setAdapter((SpinnerAdapter) c1413b);
    }

    @InterfaceC1294a(name = "prompt")
    public void setPrompt(C1417c c1417c, String str) {
        c1417c.setPrompt(str);
    }

    @InterfaceC1294a(name = "selected")
    public void setSelected(C1417c c1417c, int i) {
        c1417c.setStagedSelection(i);
    }
}
