package com.facebook.react.uimanager.p129c;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.uimanager.c.h */
/* loaded from: classes.dex */
public class C1308h {

    /* renamed from: a */
    private final AbstractC1301a f4835a = new C1312l();

    /* renamed from: b */
    private final AbstractC1301a f4836b = new C1315o();

    /* renamed from: c */
    private final AbstractC1301a f4837c = new C1313m();

    /* renamed from: d */
    private final SparseArray<InterfaceC1314n> f4838d = new SparseArray<>(0);

    /* renamed from: e */
    private boolean f4839e;

    /* renamed from: b */
    private void m5688b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5688b(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: a */
    public void m5689a() {
        this.f4835a.m5681b();
        this.f4836b.m5681b();
        this.f4837c.m5681b();
        this.f4839e = false;
    }

    /* renamed from: a */
    public void m5690a(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        InterfaceC1314n interfaceC1314n = this.f4838d.get(id);
        if (interfaceC1314n != null) {
            interfaceC1314n.mo5696a(i, i2, i3, i4);
            return;
        }
        Animation m5677a = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.f4835a : this.f4836b).m5677a(view, i, i2, i3, i4);
        if (m5677a instanceof InterfaceC1314n) {
            m5677a.setAnimationListener(new AnimationAnimationListenerC1306f(this, id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (m5677a != null) {
            view.startAnimation(m5677a);
        }
    }

    /* renamed from: a */
    public void m5691a(View view, InterfaceC1309i interfaceC1309i) {
        UiThreadUtil.assertOnUiThread();
        Animation m5677a = this.f4837c.m5677a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (m5677a == null) {
            interfaceC1309i.mo5694a();
            return;
        }
        m5688b(view);
        m5677a.setAnimationListener(new AnimationAnimationListenerC1307g(this, interfaceC1309i));
        view.startAnimation(m5677a);
    }

    /* renamed from: a */
    public void m5692a(ReadableMap readableMap) {
        if (readableMap == null) {
            m5689a();
            return;
        }
        this.f4839e = false;
        int i = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        if (readableMap.hasKey(EnumC1311k.m5695a(EnumC1311k.CREATE))) {
            this.f4835a.m5678a(readableMap.getMap(EnumC1311k.m5695a(EnumC1311k.CREATE)), i);
            this.f4839e = true;
        }
        if (readableMap.hasKey(EnumC1311k.m5695a(EnumC1311k.UPDATE))) {
            this.f4836b.m5678a(readableMap.getMap(EnumC1311k.m5695a(EnumC1311k.UPDATE)), i);
            this.f4839e = true;
        }
        if (readableMap.hasKey(EnumC1311k.m5695a(EnumC1311k.DELETE))) {
            this.f4837c.m5678a(readableMap.getMap(EnumC1311k.m5695a(EnumC1311k.DELETE)), i);
            this.f4839e = true;
        }
    }

    /* renamed from: a */
    public boolean m5693a(View view) {
        return (this.f4839e && view.getParent() != null) || this.f4838d.get(view.getId()) != null;
    }
}
