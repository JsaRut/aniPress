package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.text.AbstractC1475z;
import com.facebook.react.views.text.C1468s;
import com.facebook.react.views.text.C1474y;
import com.facebook.react.views.text.InterfaceC1462m;
import com.facebook.react.views.view.C1514f;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.views.textinput.d */
/* loaded from: classes.dex */
public class C1483d extends EditText {

    /* renamed from: a */
    private static final KeyListener f5476a = QwertyKeyListener.getInstanceForFullKeyboard();

    /* renamed from: b */
    private final InputMethodManager f5477b;

    /* renamed from: c */
    private boolean f5478c;

    /* renamed from: d */
    private boolean f5479d;

    /* renamed from: e */
    private int f5480e;

    /* renamed from: f */
    private int f5481f;

    /* renamed from: g */
    private int f5482g;

    /* renamed from: h */
    private int f5483h;

    /* renamed from: i */
    private ArrayList<TextWatcher> f5484i;

    /* renamed from: j */
    private b f5485j;

    /* renamed from: k */
    private int f5486k;

    /* renamed from: l */
    private boolean f5487l;

    /* renamed from: m */
    private Boolean f5488m;

    /* renamed from: n */
    private boolean f5489n;

    /* renamed from: o */
    private String f5490o;

    /* renamed from: p */
    private InterfaceC1499t f5491p;

    /* renamed from: q */
    private InterfaceC1480a f5492q;

    /* renamed from: r */
    private InterfaceC1498s f5493r;

    /* renamed from: s */
    private final a f5494s;

    /* renamed from: t */
    private boolean f5495t;

    /* renamed from: u */
    private boolean f5496u;

    /* renamed from: v */
    private C1474y f5497v;

    /* renamed from: w */
    private C1514f f5498w;

    /* renamed from: com.facebook.react.views.textinput.d$a */
    /* loaded from: classes.dex */
    public static class a implements KeyListener {

        /* renamed from: a */
        private int f5499a = 0;

        /* renamed from: a */
        public void m6265a(int i) {
            this.f5499a = i;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i) {
            C1483d.f5476a.clearMetaKeyState(view, editable, i);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f5499a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return C1483d.f5476a.onKeyDown(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return C1483d.f5476a.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return C1483d.f5476a.onKeyUp(view, editable, i, keyEvent);
        }
    }

    /* renamed from: com.facebook.react.views.textinput.d$b */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        private b() {
        }

        /* synthetic */ b(C1483d c1483d, C1482c c1482c) {
            this();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C1483d.this.f5478c || C1483d.this.f5484i == null) {
                return;
            }
            Iterator it = C1483d.this.f5484i.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1483d.this.f5478c || C1483d.this.f5484i == null) {
                return;
            }
            Iterator it = C1483d.this.f5484i.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!C1483d.this.f5478c && C1483d.this.f5484i != null) {
                Iterator it = C1483d.this.f5484i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            C1483d.this.m6252j();
        }
    }

    public C1483d(Context context) {
        super(context);
        this.f5495t = false;
        this.f5496u = false;
        setFocusableInTouchMode(false);
        this.f5498w = new C1514f(this);
        Object systemService = getContext().getSystemService("input_method");
        C2038a.m8318a(systemService);
        this.f5477b = (InputMethodManager) systemService;
        this.f5480e = getGravity() & 8388615;
        this.f5481f = getGravity() & C0121j.AppCompatTheme_windowActionBarOverlay;
        this.f5482g = 0;
        this.f5483h = 0;
        this.f5478c = false;
        this.f5479d = false;
        this.f5488m = null;
        this.f5489n = false;
        this.f5484i = null;
        this.f5485j = null;
        this.f5486k = getInputType();
        this.f5494s = new a();
        this.f5493r = null;
        this.f5497v = new C1474y();
        m6260b();
    }

    /* renamed from: a */
    private void m6244a(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i = 0; i < spans.length; i++) {
            if (spans[i] instanceof InterfaceC1462m) {
                getText().removeSpan(spans[i]);
            }
            if ((getText().getSpanFlags(spans[i]) & 33) == 33) {
                Object obj = spans[i];
                int spanStart = getText().getSpanStart(spans[i]);
                int spanEnd = getText().getSpanEnd(spans[i]);
                int spanFlags = getText().getSpanFlags(spans[i]);
                getText().removeSpan(spans[i]);
                if (m6245a(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m6245a(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: g */
    private void m6249g() {
        this.f5477b.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private b getTextWatcherDelegator() {
        if (this.f5485j == null) {
            this.f5485j = new b();
        }
        return this.f5485j;
    }

    /* renamed from: h */
    private boolean m6250h() {
        return (getInputType() & 131072) != 0;
    }

    /* renamed from: i */
    private boolean m6251i() {
        return (getInputType() & 144) != 0;
    }

    /* renamed from: j */
    public void m6252j() {
        InterfaceC1480a interfaceC1480a = this.f5492q;
        if (interfaceC1480a != null) {
            interfaceC1480a.mo6239a();
        }
        m6253k();
    }

    /* renamed from: k */
    private void m6253k() {
        ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new C1491l(this));
    }

    /* renamed from: l */
    private boolean m6254l() {
        return this.f5477b.showSoftInput(this, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6255m() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f5490o
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 5
            r5 = 2
            r6 = 6
            if (r0 == 0) goto L68
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L4f;
                case -906336856: goto L45;
                case 3304: goto L3b;
                case 3089282: goto L31;
                case 3377907: goto L27;
                case 3387192: goto L1d;
                case 3526536: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 5
            goto L5a
        L1d:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 2
            goto L5a
        L27:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L31:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 6
            goto L5a
        L3b:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 0
            goto L5a
        L45:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 4
            goto L5a
        L4f:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L59
            r0 = 3
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L66;
                case 1: goto L64;
                case 2: goto L62;
                case 3: goto L60;
                case 4: goto L5e;
                case 5: goto L69;
                case 6: goto L68;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            r1 = 3
            goto L69
        L60:
            r1 = 7
            goto L69
        L62:
            r1 = 1
            goto L69
        L64:
            r1 = 5
            goto L69
        L66:
            r1 = 2
            goto L69
        L68:
            r1 = 6
        L69:
            boolean r0 = r9.f5489n
            if (r0 == 0) goto L74
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            goto L77
        L74:
            r9.setImeOptions(r1)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.C1483d.m6255m():void");
    }

    /* renamed from: a */
    public void m6256a(float f, int i) {
        this.f5498w.m6330a(f, i);
    }

    /* renamed from: a */
    public void m6257a(int i, float f) {
        this.f5498w.m6332a(i, f);
    }

    /* renamed from: a */
    public void m6258a(int i, float f, float f2) {
        this.f5498w.m6333a(i, f, f2);
    }

    /* renamed from: a */
    public void m6259a(C1468s c1468s) {
        if (m6251i() && TextUtils.equals(getText(), c1468s.m6181h())) {
            return;
        }
        this.f5483h = c1468s.m6175b();
        if (this.f5483h < this.f5482g) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1468s.m6181h());
        m6244a(spannableStringBuilder);
        this.f5487l = c1468s.m6174a();
        this.f5478c = true;
        getText().replace(0, length(), spannableStringBuilder);
        this.f5478c = false;
        if (Build.VERSION.SDK_INT < 23 || getBreakStrategy() == c1468s.m6183j()) {
            return;
        }
        setBreakStrategy(c1468s.m6183j());
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f5484i == null) {
            this.f5484i = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f5484i.add(textWatcher);
    }

    /* renamed from: b */
    protected void m6260b() {
        setTextSize(0, this.f5497v.m6224b());
        if (Build.VERSION.SDK_INT >= 21) {
            float m6226c = this.f5497v.m6226c();
            if (Float.isNaN(m6226c)) {
                return;
            }
            setLetterSpacing(m6226c);
        }
    }

    /* renamed from: c */
    public void m6261c() {
        clearFocus();
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        m6249g();
    }

    /* renamed from: d */
    public void m6262d() {
        if (getInputType() != this.f5486k) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f5486k);
            setSelection(selectionStart, selectionEnd);
        }
    }

    /* renamed from: e */
    public int m6263e() {
        int i = this.f5482g + 1;
        this.f5482g = i;
        return i;
    }

    /* renamed from: f */
    public void m6264f() {
        this.f5479d = true;
        requestFocus();
        this.f5479d = false;
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.f5488m;
        return bool == null ? !m6250h() : bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.f5489n;
    }

    public String getReturnKeyType() {
        return this.f5490o;
    }

    public int getStagedInputType() {
        return this.f5486k;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f5487l) {
            Editable text = getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) text.getSpans(0, text.length(), AbstractC1475z.class)) {
                if (abstractC1475z.mo6150a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5487l) {
            Editable text = getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) text.getSpans(0, text.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6153c();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = (ReactContext) getContext();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.f5496u) {
            onCreateInputConnection = new C1484e(onCreateInputConnection, reactContext, this);
        }
        if (m6250h() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5487l) {
            Editable text = getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) text.getSpans(0, text.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6154d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f5487l) {
            Editable text = getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) text.getSpans(0, text.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6155e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        InterfaceC1499t interfaceC1499t;
        super.onFocusChanged(z, i, rect);
        if (!z || (interfaceC1499t = this.f5491p) == null) {
            return;
        }
        interfaceC1499t.mo6241a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || m6250h()) {
            return super.onKeyUp(i, keyEvent);
        }
        m6249g();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m6252j();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1498s interfaceC1498s = this.f5493r;
        if (interfaceC1498s != null) {
            interfaceC1498s.mo6240a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f5491p == null || !hasFocus()) {
            return;
        }
        this.f5491p.mo6241a(i, i2);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f5487l) {
            Editable text = getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) text.getSpans(0, text.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6156f();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5495t = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f5495t) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f5495t = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.f5484i;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f5484i.isEmpty()) {
                this.f5484i = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (!this.f5479d) {
            return false;
        }
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(i, rect);
        m6254l();
        return requestFocus;
    }

    public void setAllowFontScaling(boolean z) {
        if (this.f5497v.m6223a() != z) {
            this.f5497v.m6222a(z);
            m6260b();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f5498w.m6331a(i);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.f5488m = bool;
    }

    public void setBorderRadius(float f) {
        this.f5498w.m6329a(f);
    }

    public void setBorderStyle(String str) {
        this.f5498w.m6334a(str);
    }

    public void setContentSizeWatcher(InterfaceC1480a interfaceC1480a) {
        this.f5492q = interfaceC1480a;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.f5489n = z;
        m6255m();
    }

    public void setFontSize(float f) {
        this.f5497v.m6220a(f);
        m6260b();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f5480e;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f5481f;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.f5486k = i;
        super.setTypeface(typeface);
        this.f5494s.m6265a(i);
        setKeyListener(this.f5494s);
    }

    public void setLetterSpacingPt(float f) {
        this.f5497v.m6227c(f);
        m6260b();
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.f5497v.m6236j()) {
            this.f5497v.m6231e(f);
            m6260b();
        }
    }

    public void setMostRecentEventCount(int i) {
        this.f5483h = i;
    }

    public void setOnKeyPress(boolean z) {
        this.f5496u = z;
    }

    public void setReturnKeyType(String str) {
        this.f5490o = str;
        m6255m();
    }

    public void setScrollWatcher(InterfaceC1498s interfaceC1498s) {
        this.f5493r = interfaceC1498s;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        if (this.f5483h < this.f5482g) {
            return;
        }
        super.setSelection(i, i2);
    }

    public void setSelectionWatcher(InterfaceC1499t interfaceC1499t) {
        this.f5491p = interfaceC1499t;
    }

    public void setStagedInputType(int i) {
        this.f5486k = i;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f5487l) {
            Editable text = getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) text.getSpans(0, text.length(), AbstractC1475z.class)) {
                if (abstractC1475z.mo6150a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
