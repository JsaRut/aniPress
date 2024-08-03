package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.AbstractC0290h;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p005b.p009c.p019h.AbstractC0088c;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0115d;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0118g;
import p000a.p005b.p022d.p023a.C0119h;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p029e.InterfaceC0132c;

/* loaded from: classes.dex */
public class SearchView extends C0416Q implements InterfaceC0132c {

    /* renamed from: p */
    static final C0418a f2127p = new C0418a();

    /* renamed from: A */
    private Rect f2128A;

    /* renamed from: B */
    private Rect f2129B;

    /* renamed from: C */
    private int[] f2130C;

    /* renamed from: D */
    private int[] f2131D;

    /* renamed from: E */
    private final ImageView f2132E;

    /* renamed from: F */
    private final Drawable f2133F;

    /* renamed from: G */
    private final int f2134G;

    /* renamed from: H */
    private final int f2135H;

    /* renamed from: I */
    private final Intent f2136I;

    /* renamed from: J */
    private final Intent f2137J;

    /* renamed from: K */
    private final CharSequence f2138K;

    /* renamed from: L */
    private InterfaceC0420c f2139L;

    /* renamed from: M */
    private InterfaceC0419b f2140M;

    /* renamed from: N */
    View.OnFocusChangeListener f2141N;

    /* renamed from: O */
    private InterfaceC0421d f2142O;

    /* renamed from: P */
    private View.OnClickListener f2143P;

    /* renamed from: Q */
    private boolean f2144Q;

    /* renamed from: R */
    private boolean f2145R;

    /* renamed from: S */
    AbstractC0290h f2146S;

    /* renamed from: T */
    private boolean f2147T;

    /* renamed from: U */
    private CharSequence f2148U;

    /* renamed from: V */
    private boolean f2149V;

    /* renamed from: W */
    private boolean f2150W;

    /* renamed from: aa */
    private int f2151aa;

    /* renamed from: ba */
    private boolean f2152ba;

    /* renamed from: ca */
    private CharSequence f2153ca;

    /* renamed from: da */
    private CharSequence f2154da;

    /* renamed from: ea */
    private boolean f2155ea;

    /* renamed from: fa */
    private int f2156fa;

    /* renamed from: ga */
    SearchableInfo f2157ga;

    /* renamed from: ha */
    private Bundle f2158ha;

    /* renamed from: ia */
    private final Runnable f2159ia;

    /* renamed from: ja */
    private Runnable f2160ja;

    /* renamed from: ka */
    private final WeakHashMap<String, Drawable.ConstantState> f2161ka;

    /* renamed from: la */
    private final View.OnClickListener f2162la;

    /* renamed from: ma */
    View.OnKeyListener f2163ma;

    /* renamed from: na */
    private final TextView.OnEditorActionListener f2164na;

    /* renamed from: oa */
    private final AdapterView.OnItemClickListener f2165oa;

    /* renamed from: pa */
    private final AdapterView.OnItemSelectedListener f2166pa;

    /* renamed from: q */
    final SearchAutoComplete f2167q;

    /* renamed from: qa */
    private TextWatcher f2168qa;

    /* renamed from: r */
    private final View f2169r;

    /* renamed from: s */
    private final View f2170s;

    /* renamed from: t */
    private final View f2171t;

    /* renamed from: u */
    final ImageView f2172u;

    /* renamed from: v */
    final ImageView f2173v;

    /* renamed from: w */
    final ImageView f2174w;

    /* renamed from: x */
    final ImageView f2175x;

    /* renamed from: y */
    private final View f2176y;

    /* renamed from: z */
    private C0423f f2177z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0452i {

        /* renamed from: d */
        private int f2178d;

        /* renamed from: e */
        private SearchView f2179e;

        /* renamed from: f */
        private boolean f2180f;

        /* renamed from: g */
        final Runnable f2181g;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0112a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2181g = new RunnableC0461ma(this);
            this.f2178d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m2344a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m2345b() {
            if (this.f2180f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2180f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f2178d <= 0 || super.enoughToFilter();
        }

        @Override // android.support.v7.widget.C0452i, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2180f) {
                removeCallbacks(this.f2181g);
                post(this.f2181g);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2179e.m2341g();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2179e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2179e.hasFocus() && getVisibility() == 0) {
                this.f2180f = true;
                if (SearchView.m2313a(getContext())) {
                    SearchView.f2127p.m2347a(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2180f = false;
                removeCallbacks(this.f2181g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2180f = true;
                    return;
                }
                this.f2180f = false;
                removeCallbacks(this.f2181g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f2179e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2178d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.SearchView$a */
    /* loaded from: classes.dex */
    public static class C0418a {

        /* renamed from: a */
        private Method f2182a;

        /* renamed from: b */
        private Method f2183b;

        /* renamed from: c */
        private Method f2184c;

        C0418a() {
            try {
                this.f2182a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2182a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f2183b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2183b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f2184c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f2184c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        void m2346a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2183b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        void m2347a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f2184c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m2348b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2182a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0419b {
        boolean onClose();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0420c {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0421d {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.SearchView$e */
    /* loaded from: classes.dex */
    public static class C0422e extends AbstractC0088c {
        public static final Parcelable.Creator<C0422e> CREATOR = new C0459la();

        /* renamed from: a */
        boolean f2185a;

        public C0422e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2185a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0422e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2185a + "}";
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0088c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2185a));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    /* loaded from: classes.dex */
    private static class C0423f extends TouchDelegate {

        /* renamed from: a */
        private final View f2186a;

        /* renamed from: b */
        private final Rect f2187b;

        /* renamed from: c */
        private final Rect f2188c;

        /* renamed from: d */
        private final Rect f2189d;

        /* renamed from: e */
        private final int f2190e;

        /* renamed from: f */
        private boolean f2191f;

        public C0423f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2190e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f2187b = new Rect();
            this.f2189d = new Rect();
            this.f2188c = new Rect();
            m2349a(rect, rect2);
            this.f2186a = view;
        }

        /* renamed from: a */
        public void m2349a(Rect rect, Rect rect2) {
            this.f2187b.set(rect);
            this.f2189d.set(rect);
            Rect rect3 = this.f2189d;
            int i = this.f2190e;
            rect3.inset(-i, -i);
            this.f2188c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action == 0) {
                if (this.f2187b.contains(x, y)) {
                    this.f2191f = true;
                    z = true;
                }
                z = false;
            } else if (action == 1 || action == 2) {
                z = this.f2191f;
                if (z && !this.f2189d.contains(x, y)) {
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z = this.f2191f;
                    this.f2191f = false;
                }
                z = false;
            }
            if (!z) {
                return false;
            }
            if (!z2 || this.f2188c.contains(x, y)) {
                Rect rect = this.f2188c;
                f = x - rect.left;
                i = y - rect.top;
            } else {
                f = this.f2186a.getWidth() / 2;
                i = this.f2186a.getHeight() / 2;
            }
            motionEvent.setLocation(f, i);
            return this.f2186a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2128A = new Rect();
        this.f2129B = new Rect();
        this.f2130C = new int[2];
        this.f2131D = new int[2];
        this.f2159ia = new RunnableC0441ca(this);
        this.f2160ja = new RunnableC0443da(this);
        this.f2161ka = new WeakHashMap<>();
        this.f2162la = new ViewOnClickListenerC0449ga(this);
        this.f2163ma = new ViewOnKeyListenerC0451ha(this);
        this.f2164na = new C0453ia(this);
        this.f2165oa = new C0455ja(this);
        this.f2166pa = new C0457ka(this);
        this.f2168qa = new C0439ba(this);
        C0479va m2571a = C0479va.m2571a(context, attributeSet, C0121j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(m2571a.m2588g(C0121j.SearchView_layout, C0118g.abc_search_view), (ViewGroup) this, true);
        this.f2167q = (SearchAutoComplete) findViewById(C0117f.search_src_text);
        this.f2167q.setSearchView(this);
        this.f2169r = findViewById(C0117f.search_edit_frame);
        this.f2170s = findViewById(C0117f.search_plate);
        this.f2171t = findViewById(C0117f.submit_area);
        this.f2172u = (ImageView) findViewById(C0117f.search_button);
        this.f2173v = (ImageView) findViewById(C0117f.search_go_btn);
        this.f2174w = (ImageView) findViewById(C0117f.search_close_btn);
        this.f2175x = (ImageView) findViewById(C0117f.search_voice_btn);
        this.f2132E = (ImageView) findViewById(C0117f.search_mag_icon);
        C0107v.m500a(this.f2170s, m2571a.m2579b(C0121j.SearchView_queryBackground));
        C0107v.m500a(this.f2171t, m2571a.m2579b(C0121j.SearchView_submitBackground));
        this.f2172u.setImageDrawable(m2571a.m2579b(C0121j.SearchView_searchIcon));
        this.f2173v.setImageDrawable(m2571a.m2579b(C0121j.SearchView_goIcon));
        this.f2174w.setImageDrawable(m2571a.m2579b(C0121j.SearchView_closeIcon));
        this.f2175x.setImageDrawable(m2571a.m2579b(C0121j.SearchView_voiceIcon));
        this.f2132E.setImageDrawable(m2571a.m2579b(C0121j.SearchView_searchIcon));
        this.f2133F = m2571a.m2579b(C0121j.SearchView_searchHintIcon);
        C0396Da.m2193a(this.f2172u, getResources().getString(C0119h.abc_searchview_description_search));
        this.f2134G = m2571a.m2588g(C0121j.SearchView_suggestionRowLayout, C0118g.abc_search_dropdown_item_icons_2line);
        this.f2135H = m2571a.m2588g(C0121j.SearchView_commitIcon, 0);
        this.f2172u.setOnClickListener(this.f2162la);
        this.f2174w.setOnClickListener(this.f2162la);
        this.f2173v.setOnClickListener(this.f2162la);
        this.f2175x.setOnClickListener(this.f2162la);
        this.f2167q.setOnClickListener(this.f2162la);
        this.f2167q.addTextChangedListener(this.f2168qa);
        this.f2167q.setOnEditorActionListener(this.f2164na);
        this.f2167q.setOnItemClickListener(this.f2165oa);
        this.f2167q.setOnItemSelectedListener(this.f2166pa);
        this.f2167q.setOnKeyListener(this.f2163ma);
        this.f2167q.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0445ea(this));
        setIconifiedByDefault(m2571a.m2577a(C0121j.SearchView_iconifiedByDefault, true));
        int m2580c = m2571a.m2580c(C0121j.SearchView_android_maxWidth, -1);
        if (m2580c != -1) {
            setMaxWidth(m2580c);
        }
        this.f2138K = m2571a.m2585e(C0121j.SearchView_defaultQueryHint);
        this.f2148U = m2571a.m2585e(C0121j.SearchView_queryHint);
        int m2582d = m2571a.m2582d(C0121j.SearchView_android_imeOptions, -1);
        if (m2582d != -1) {
            setImeOptions(m2582d);
        }
        int m2582d2 = m2571a.m2582d(C0121j.SearchView_android_inputType, -1);
        if (m2582d2 != -1) {
            setInputType(m2582d2);
        }
        setFocusable(m2571a.m2577a(C0121j.SearchView_android_focusable, true));
        m2571a.m2576a();
        this.f2136I = new Intent("android.speech.action.WEB_SEARCH");
        this.f2136I.addFlags(268435456);
        this.f2136I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f2137J = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2137J.addFlags(268435456);
        this.f2176y = findViewById(this.f2167q.getDropDownAnchor());
        View view = this.f2176y;
        if (view != null) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0447fa(this));
        }
        m2315b(this.f2144Q);
        m2325o();
    }

    /* renamed from: a */
    private Intent m2307a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2158ha;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m2308a(Cursor cursor, int i, String str) {
        int i2;
        String m2485a;
        try {
            String m2485a2 = ViewOnClickListenerC0463na.m2485a(cursor, "suggest_intent_action");
            if (m2485a2 == null) {
                m2485a2 = this.f2157ga.getSuggestIntentAction();
            }
            if (m2485a2 == null) {
                m2485a2 = "android.intent.action.SEARCH";
            }
            String str2 = m2485a2;
            String m2485a3 = ViewOnClickListenerC0463na.m2485a(cursor, "suggest_intent_data");
            if (m2485a3 == null) {
                m2485a3 = this.f2157ga.getSuggestIntentData();
            }
            if (m2485a3 != null && (m2485a = ViewOnClickListenerC0463na.m2485a(cursor, "suggest_intent_data_id")) != null) {
                m2485a3 = m2485a3 + "/" + Uri.encode(m2485a);
            }
            return m2309a(str2, m2485a3 == null ? null : Uri.parse(m2485a3), ViewOnClickListenerC0463na.m2485a(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0463na.m2485a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e2) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e2);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m2309a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2154da);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2158ha;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2157ga.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m2310a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    /* renamed from: a */
    private void m2311a(View view, Rect rect) {
        view.getLocationInWindow(this.f2130C);
        getLocationInWindow(this.f2131D);
        int[] iArr = this.f2130C;
        int i = iArr[1];
        int[] iArr2 = this.f2131D;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m2312a(boolean z) {
        this.f2173v.setVisibility((this.f2147T && m2322l() && hasFocus() && (z || !this.f2152ba)) ? 0 : 8);
    }

    /* renamed from: a */
    static boolean m2313a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m2314b(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: b */
    private void m2315b(boolean z) {
        this.f2145R = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f2167q.getText());
        this.f2172u.setVisibility(i2);
        m2312a(z2);
        this.f2169r.setVisibility(z ? 8 : 0);
        if (this.f2132E.getDrawable() != null && !this.f2144Q) {
            i = 0;
        }
        this.f2132E.setVisibility(i);
        m2324n();
        m2318c(z2 ? false : true);
        m2327q();
    }

    /* renamed from: b */
    private boolean m2316b(int i, int i2, String str) {
        Cursor mo1619a = this.f2146S.mo1619a();
        if (mo1619a == null || !mo1619a.moveToPosition(i)) {
            return false;
        }
        m2310a(m2308a(mo1619a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m2317c(CharSequence charSequence) {
        if (!this.f2144Q || this.f2133F == null) {
            return charSequence;
        }
        double textSize = this.f2167q.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f2133F.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2133F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m2318c(boolean z) {
        int i;
        if (this.f2152ba && !m2336c() && z) {
            i = 0;
            this.f2173v.setVisibility(8);
        } else {
            i = 8;
        }
        this.f2175x.setVisibility(i);
    }

    /* renamed from: e */
    private void m2319e(int i) {
        CharSequence convertToString;
        Editable text = this.f2167q.getText();
        Cursor mo1619a = this.f2146S.mo1619a();
        if (mo1619a == null) {
            return;
        }
        if (!mo1619a.moveToPosition(i) || (convertToString = this.f2146S.convertToString(mo1619a)) == null) {
            setQuery(text);
        } else {
            setQuery(convertToString);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0115d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0115d.abc_search_view_preferred_width);
    }

    /* renamed from: j */
    private void m2320j() {
        this.f2167q.dismissDropDown();
    }

    /* renamed from: k */
    private boolean m2321k() {
        SearchableInfo searchableInfo = this.f2157ga;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f2157ga.getVoiceSearchLaunchWebSearch()) {
            intent = this.f2136I;
        } else if (this.f2157ga.getVoiceSearchLaunchRecognizer()) {
            intent = this.f2137J;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: l */
    private boolean m2322l() {
        return (this.f2147T || this.f2152ba) && !m2336c();
    }

    /* renamed from: m */
    private void m2323m() {
        post(this.f2159ia);
    }

    /* renamed from: n */
    private void m2324n() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2167q.getText());
        if (!z2 && (!this.f2144Q || this.f2155ea)) {
            z = false;
        }
        this.f2174w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f2174w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: o */
    private void m2325o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2167q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2317c(queryHint));
    }

    /* renamed from: p */
    private void m2326p() {
        this.f2167q.setThreshold(this.f2157ga.getSuggestThreshold());
        this.f2167q.setImeOptions(this.f2157ga.getImeOptions());
        int inputType = this.f2157ga.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2157ga.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f2167q.setInputType(inputType);
        AbstractC0290h abstractC0290h = this.f2146S;
        if (abstractC0290h != null) {
            abstractC0290h.mo1622a((Cursor) null);
        }
        if (this.f2157ga.getSuggestAuthority() != null) {
            this.f2146S = new ViewOnClickListenerC0463na(getContext(), this, this.f2157ga, this.f2161ka);
            this.f2167q.setAdapter(this.f2146S);
            ((ViewOnClickListenerC0463na) this.f2146S).m2499a(this.f2149V ? 2 : 1);
        }
    }

    /* renamed from: q */
    private void m2327q() {
        this.f2171t.setVisibility((m2322l() && (this.f2173v.getVisibility() == 0 || this.f2175x.getVisibility() == 0)) ? 0 : 8);
    }

    private void setQuery(CharSequence charSequence) {
        this.f2167q.setText(charSequence);
        this.f2167q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2328a() {
        if (this.f2176y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f2170s.getPaddingLeft();
            Rect rect = new Rect();
            boolean m2259a = C0408Ja.m2259a(this);
            int dimensionPixelSize = this.f2144Q ? resources.getDimensionPixelSize(C0115d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0115d.abc_dropdownitem_text_padding_left) : 0;
            this.f2167q.getDropDownBackground().getPadding(rect);
            this.f2167q.setDropDownHorizontalOffset(m2259a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f2167q.setDropDownWidth((((this.f2176y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2329a(int i, String str, String str2) {
        getContext().startActivity(m2309a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2330a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void m2331a(CharSequence charSequence, boolean z) {
        this.f2167q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f2167q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f2154da = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m2340f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m2332a(int i, int i2, String str) {
        InterfaceC0421d interfaceC0421d = this.f2142O;
        if (interfaceC0421d != null && interfaceC0421d.onSuggestionClick(i)) {
            return false;
        }
        m2316b(i, 0, null);
        this.f2167q.setImeVisibility(false);
        m2320j();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m2333a(View view, int i, KeyEvent keyEvent) {
        if (this.f2157ga != null && this.f2146S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m2332a(this.f2167q.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f2167q.setSelection(i == 21 ? 0 : this.f2167q.length());
                this.f2167q.setListSelection(0);
                this.f2167q.clearListSelection();
                f2127p.m2347a(this.f2167q, true);
                return true;
            }
            if (i != 19 || this.f2167q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2334b() {
        f2127p.m2348b(this.f2167q);
        f2127p.m2346a(this.f2167q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2335b(CharSequence charSequence) {
        Editable text = this.f2167q.getText();
        this.f2154da = text;
        boolean z = !TextUtils.isEmpty(text);
        m2312a(z);
        m2318c(z ? false : true);
        m2324n();
        m2327q();
        if (this.f2139L != null && !TextUtils.equals(charSequence, this.f2153ca)) {
            this.f2139L.onQueryTextChange(charSequence.toString());
        }
        this.f2153ca = charSequence.toString();
    }

    /* renamed from: c */
    public boolean m2336c() {
        return this.f2145R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f2150W = true;
        super.clearFocus();
        this.f2167q.clearFocus();
        this.f2167q.setImeVisibility(false);
        this.f2150W = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2337d() {
        if (!TextUtils.isEmpty(this.f2167q.getText())) {
            this.f2167q.setText("");
            this.f2167q.requestFocus();
            this.f2167q.setImeVisibility(true);
        } else if (this.f2144Q) {
            InterfaceC0419b interfaceC0419b = this.f2140M;
            if (interfaceC0419b == null || !interfaceC0419b.onClose()) {
                clearFocus();
                m2315b(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m2338d(int i) {
        InterfaceC0421d interfaceC0421d = this.f2142O;
        if (interfaceC0421d != null && interfaceC0421d.onSuggestionSelect(i)) {
            return false;
        }
        m2319e(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2339e() {
        m2315b(false);
        this.f2167q.requestFocus();
        this.f2167q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2143P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2340f() {
        Editable text = this.f2167q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0420c interfaceC0420c = this.f2139L;
        if (interfaceC0420c == null || !interfaceC0420c.onQueryTextSubmit(text.toString())) {
            if (this.f2157ga != null) {
                m2329a(0, (String) null, text.toString());
            }
            this.f2167q.setImeVisibility(false);
            m2320j();
        }
    }

    /* renamed from: g */
    void m2341g() {
        m2315b(m2336c());
        m2323m();
        if (this.f2167q.hasFocus()) {
            m2334b();
        }
    }

    public int getImeOptions() {
        return this.f2167q.getImeOptions();
    }

    public int getInputType() {
        return this.f2167q.getInputType();
    }

    public int getMaxWidth() {
        return this.f2151aa;
    }

    public CharSequence getQuery() {
        return this.f2167q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2148U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2157ga;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2138K : getContext().getText(this.f2157ga.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f2135H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f2134G;
    }

    public AbstractC0290h getSuggestionsAdapter() {
        return this.f2146S;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2342h() {
        Intent m2307a;
        SearchableInfo searchableInfo = this.f2157ga;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                m2307a = m2314b(this.f2136I, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                m2307a = m2307a(this.f2137J, searchableInfo);
            }
            getContext().startActivity(m2307a);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m2343i() {
        int[] iArr = this.f2167q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2170s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2171t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // p000a.p005b.p022d.p029e.InterfaceC0132c
    public void onActionViewCollapsed() {
        m2331a("", false);
        clearFocus();
        m2315b(true);
        this.f2167q.setImeOptions(this.f2156fa);
        this.f2155ea = false;
    }

    @Override // p000a.p005b.p022d.p029e.InterfaceC0132c
    public void onActionViewExpanded() {
        if (this.f2155ea) {
            return;
        }
        this.f2155ea = true;
        this.f2156fa = this.f2167q.getImeOptions();
        this.f2167q.setImeOptions(this.f2156fa | 33554432);
        this.f2167q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f2159ia);
        post(this.f2160ja);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.C0416Q, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2311a(this.f2167q, this.f2128A);
            Rect rect = this.f2129B;
            Rect rect2 = this.f2128A;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0423f c0423f = this.f2177z;
            if (c0423f != null) {
                c0423f.m2349a(this.f2129B, this.f2128A);
            } else {
                this.f2177z = new C0423f(this.f2129B, this.f2128A, this.f2167q);
                setTouchDelegate(this.f2177z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:            if (r0 <= 0) goto L23;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // android.support.v7.widget.C0416Q, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.m2336c()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f2151aa
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f2151aa
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f2151aa
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0422e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0422e c0422e = (C0422e) parcelable;
        super.onRestoreInstanceState(c0422e.m411a());
        m2315b(c0422e.f2185a);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0422e c0422e = new C0422e(super.onSaveInstanceState());
        c0422e.f2185a = m2336c();
        return c0422e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2323m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f2150W || !isFocusable()) {
            return false;
        }
        if (m2336c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f2167q.requestFocus(i, rect);
        if (requestFocus) {
            m2315b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2158ha = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m2337d();
        } else {
            m2339e();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2144Q == z) {
            return;
        }
        this.f2144Q = z;
        m2315b(z);
        m2325o();
    }

    public void setImeOptions(int i) {
        this.f2167q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2167q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2151aa = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0419b interfaceC0419b) {
        this.f2140M = interfaceC0419b;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2141N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0420c interfaceC0420c) {
        this.f2139L = interfaceC0420c;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2143P = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0421d interfaceC0421d) {
        this.f2142O = interfaceC0421d;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2148U = charSequence;
        m2325o();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2149V = z;
        AbstractC0290h abstractC0290h = this.f2146S;
        if (abstractC0290h instanceof ViewOnClickListenerC0463na) {
            ((ViewOnClickListenerC0463na) abstractC0290h).m2499a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2157ga = searchableInfo;
        if (this.f2157ga != null) {
            m2326p();
            m2325o();
        }
        this.f2152ba = m2321k();
        if (this.f2152ba) {
            this.f2167q.setPrivateImeOptions("nm");
        }
        m2315b(m2336c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2147T = z;
        m2315b(m2336c());
    }

    public void setSuggestionsAdapter(AbstractC0290h abstractC0290h) {
        this.f2146S = abstractC0290h;
        this.f2167q.setAdapter(this.f2146S);
    }
}
