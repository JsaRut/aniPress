package com.facebook.react.views.textinput;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.TextView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import com.facebook.react.views.scroll.C1429j;
import com.facebook.react.views.scroll.EnumC1431l;
import com.facebook.react.views.text.AbstractC1475z;
import com.facebook.react.views.text.C1451d;
import com.facebook.react.views.text.C1459j;
import com.facebook.react.views.text.C1468s;
import com.facebook.yoga.C1553a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import p000a.p005b.p009c.p010a.C0022a;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p139d.p143b.p208m.p222j.p224b.C2119d;

@InterfaceC2073a(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextInputManager extends BaseViewManager<C1483d, C1359n> {
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final int KEYBOARD_TYPE_FLAGS = 12339;
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    protected static final String REACT_CLASS = "AndroidTextInput";
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$a */
    /* loaded from: classes.dex */
    private class C1476a implements InterfaceC1480a {

        /* renamed from: a */
        private C1483d f5455a;

        /* renamed from: b */
        private C1333f f5456b;

        /* renamed from: c */
        private int f5457c = 0;

        /* renamed from: d */
        private int f5458d = 0;

        public C1476a(C1483d c1483d) {
            this.f5455a = c1483d;
            this.f5456b = ((UIManagerModule) ((ReactContext) c1483d.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.InterfaceC1480a
        /* renamed from: a */
        public void mo6239a() {
            int width = this.f5455a.getWidth();
            int height = this.f5455a.getHeight();
            if (this.f5455a.getLayout() != null) {
                width = this.f5455a.getCompoundPaddingLeft() + this.f5455a.getLayout().getWidth() + this.f5455a.getCompoundPaddingRight();
                height = this.f5455a.getCompoundPaddingTop() + this.f5455a.getLayout().getHeight() + this.f5455a.getCompoundPaddingBottom();
            }
            if (width == this.f5457c && height == this.f5458d) {
                return;
            }
            this.f5458d = height;
            this.f5457c = width;
            this.f5456b.m5753a(new C1481b(this.f5455a.getId(), C1374w.m5957a(width), C1374w.m5957a(height)));
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$b */
    /* loaded from: classes.dex */
    private class C1477b implements InterfaceC1498s {

        /* renamed from: a */
        private C1483d f5460a;

        /* renamed from: b */
        private C1333f f5461b;

        /* renamed from: c */
        private int f5462c;

        /* renamed from: d */
        private int f5463d;

        public C1477b(C1483d c1483d) {
            this.f5460a = c1483d;
            this.f5461b = ((UIManagerModule) ((ReactContext) c1483d.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.InterfaceC1498s
        /* renamed from: a */
        public void mo6240a(int i, int i2, int i3, int i4) {
            if (this.f5462c == i && this.f5463d == i2) {
                return;
            }
            this.f5461b.m5753a(C1429j.m6102a(this.f5460a.getId(), EnumC1431l.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.f5460a.getWidth(), this.f5460a.getHeight()));
            this.f5462c = i;
            this.f5463d = i2;
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$c */
    /* loaded from: classes.dex */
    private class C1478c implements InterfaceC1499t {

        /* renamed from: a */
        private C1483d f5465a;

        /* renamed from: b */
        private C1333f f5466b;

        /* renamed from: c */
        private int f5467c;

        /* renamed from: d */
        private int f5468d;

        public C1478c(C1483d c1483d) {
            this.f5465a = c1483d;
            this.f5466b = ((UIManagerModule) ((ReactContext) c1483d.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.InterfaceC1499t
        /* renamed from: a */
        public void mo6241a(int i, int i2) {
            if (this.f5467c == i && this.f5468d == i2) {
                return;
            }
            this.f5466b.m5753a(new C1495p(this.f5465a.getId(), i, i2));
            this.f5467c = i;
            this.f5468d = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$d */
    /* loaded from: classes.dex */
    public class C1479d implements TextWatcher {

        /* renamed from: a */
        private C1333f f5470a;

        /* renamed from: b */
        private C1483d f5471b;

        /* renamed from: c */
        private String f5472c = null;

        public C1479d(ReactContext reactContext, C1483d c1483d) {
            this.f5470a = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.f5471b = c1483d;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f5472c = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 0 && i2 == 0) {
                return;
            }
            C2038a.m8318a(this.f5472c);
            String substring = charSequence.toString().substring(i, i + i3);
            int i4 = i + i2;
            String substring2 = this.f5472c.substring(i, i4);
            if (i3 == i2 && substring.equals(substring2)) {
                return;
            }
            this.f5470a.m5753a(new C1485f(this.f5471b.getId(), charSequence.toString(), this.f5471b.m6263e()));
            this.f5470a.m5753a(new C1488i(this.f5471b.getId(), substring, substring2, i, i4));
        }
    }

    private static void checkPasswordType(C1483d c1483d) {
        if ((c1483d.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (c1483d.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(c1483d, 128, 16);
    }

    private static int parseNumericFontWeight(String str) {
        return (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') ? UNSET : (str.charAt(0) - '0') * 100;
    }

    private void setCursorColor(C1483d c1483d, Integer num) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(c1483d);
            if (i == 0) {
                return;
            }
            Drawable m92c = C0022a.m92c(c1483d.getContext(), i);
            if (num != null) {
                m92c.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
            Drawable[] drawableArr = {m92c, m92c};
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c1483d);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    private static void updateStagedInputTypeFlag(C1483d c1483d, int i, int i2) {
        c1483d.setStagedInputType(((i ^ UNSET) & c1483d.getStagedInputType()) | i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1483d c1483d) {
        c1483d.addTextChangedListener(new C1479d(c1278n, c1483d));
        c1483d.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1493n(this, c1278n, c1483d));
        c1483d.setOnEditorActionListener(new C1494o(this, c1483d, c1278n));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1359n createShadowNodeInstance() {
        return new C1496q();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1483d createViewInstance(C1278N c1278n) {
        C1483d c1483d = new C1483d(c1278n);
        c1483d.setInputType(c1483d.getInputType() & (-131073));
        c1483d.setReturnKeyType("done");
        return c1483d;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return C1104f.m5177a("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a("topSubmitEditing", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture")));
        m5175a.m5184a("topEndEditing", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onEndEditing", "captured", "onEndEditingCapture")));
        m5175a.m5184a("topTextInput", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onTextInput", "captured", "onTextInputCapture")));
        m5175a.m5184a("topFocus", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onFocus", "captured", "onFocusCapture")));
        m5175a.m5184a("topBlur", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onBlur", "captured", "onBlurCapture")));
        m5175a.m5184a("topKeyPress", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onKeyPress", "captured", "onKeyPressCapture")));
        return m5175a.m5185a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a(EnumC1431l.m6105a(EnumC1431l.SCROLL), C1104f.m5176a("registrationName", "onScroll"));
        return m5175a.m5185a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return C1104f.m5176a("AutoCapitalizationType", C1104f.m5179a("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends C1359n> getShadowNodeClass() {
        return C1496q.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1483d c1483d) {
        super.onAfterUpdateTransaction((ReactTextInputManager) c1483d);
        c1483d.m6262d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1483d c1483d, int i, ReadableArray readableArray) {
        if (i == 1) {
            c1483d.m6264f();
        } else {
            if (i != 2) {
                return;
            }
            c1483d.m6261c();
        }
    }

    @InterfaceC1294a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C1483d c1483d, boolean z) {
        c1483d.setAllowFontScaling(z);
    }

    @InterfaceC1294a(name = "autoCapitalize")
    public void setAutoCapitalize(C1483d c1483d, int i) {
        updateStagedInputTypeFlag(c1483d, 28672, i);
    }

    @InterfaceC1294a(name = "autoCorrect")
    public void setAutoCorrect(C1483d c1483d, Boolean bool) {
        updateStagedInputTypeFlag(c1483d, 557056, bool != null ? bool.booleanValue() ? 32768 : 524288 : 0);
    }

    @InterfaceC1294a(name = "blurOnSubmit")
    public void setBlurOnSubmit(C1483d c1483d, Boolean bool) {
        c1483d.setBlurOnSubmit(bool);
    }

    @InterfaceC1295b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1483d c1483d, int i, Integer num) {
        c1483d.m6258a(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1483d c1483d, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        if (i == 0) {
            c1483d.setBorderRadius(f);
        } else {
            c1483d.m6256a(f, i + UNSET);
        }
    }

    @InterfaceC1294a(name = "borderStyle")
    public void setBorderStyle(C1483d c1483d, String str) {
        c1483d.setBorderStyle(str);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1483d c1483d, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        c1483d.m6257a(SPACING_TYPES[i], f);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C1483d c1483d, boolean z) {
        c1483d.setCursorVisible(!z);
    }

    @InterfaceC1294a(customType = "Color", name = "color")
    public void setColor(C1483d c1483d, Integer num) {
        if (num == null) {
            c1483d.setTextColor(C1451d.m6139a(c1483d.getContext()));
        } else {
            c1483d.setTextColor(num.intValue());
        }
    }

    @InterfaceC1294a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C1483d c1483d, boolean z) {
        c1483d.setOnLongClickListener(new ViewOnLongClickListenerC1492m(this, z));
    }

    @InterfaceC1294a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C1483d c1483d, boolean z) {
        c1483d.setDisableFullscreenUI(z);
    }

    @InterfaceC1294a(defaultBoolean = true, name = "editable")
    public void setEditable(C1483d c1483d, boolean z) {
        c1483d.setEnabled(z);
    }

    @InterfaceC1294a(name = "fontFamily")
    public void setFontFamily(C1483d c1483d, String str) {
        c1483d.setTypeface(C1459j.m6161a().m6163a(str, c1483d.getTypeface() != null ? c1483d.getTypeface().getStyle() : 0, c1483d.getContext().getAssets()));
    }

    @InterfaceC1294a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C1483d c1483d, float f) {
        c1483d.setFontSize(f);
    }

    @InterfaceC1294a(name = "fontStyle")
    public void setFontStyle(C1483d c1483d, String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : UNSET;
        Typeface typeface = c1483d.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            c1483d.setTypeface(typeface, i);
        }
    }

    @InterfaceC1294a(name = "fontWeight")
    public void setFontWeight(C1483d c1483d, String str) {
        int i = UNSET;
        int parseNumericFontWeight = str != null ? parseNumericFontWeight(str) : UNSET;
        if (parseNumericFontWeight >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (parseNumericFontWeight != UNSET && parseNumericFontWeight < 500)) {
            i = 0;
        }
        Typeface typeface = c1483d.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            c1483d.setTypeface(typeface, i);
        }
    }

    @InterfaceC1294a(name = "importantForAutofill")
    public void setImportantForAutofill(C1483d c1483d, String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        int i = 0;
        if ("no".equals(str)) {
            i = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i = 8;
        } else if ("yes".equals(str)) {
            i = 1;
        } else if ("yesExcludeDescendants".equals(str)) {
            i = 4;
        }
        c1483d.setImportantForAutofill(i);
    }

    @InterfaceC1294a(name = "inlineImageLeft")
    public void setInlineImageLeft(C1483d c1483d, String str) {
        c1483d.setCompoundDrawablesWithIntrinsicBounds(C2119d.m8468a().m8470b(c1483d.getContext(), str), 0, 0, 0);
    }

    @InterfaceC1294a(name = "inlineImagePadding")
    public void setInlineImagePadding(C1483d c1483d, int i) {
        c1483d.setCompoundDrawablePadding(i);
    }

    @InterfaceC1294a(name = "keyboardType")
    public void setKeyboardType(C1483d c1483d, String str) {
        updateStagedInputTypeFlag(c1483d, KEYBOARD_TYPE_FLAGS, KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str) ? INPUT_TYPE_KEYBOARD_NUMBERED : KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str) ? 2 : KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str) ? INPUT_TYPE_KEYBOARD_DECIMAL_PAD : KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str) ? 33 : KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : 1);
        checkPasswordType(c1483d);
    }

    @InterfaceC1294a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C1483d c1483d, float f) {
        c1483d.setLetterSpacingPt(f);
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C1483d c1483d, float f) {
        c1483d.setMaxFontSizeMultiplier(f);
    }

    @InterfaceC1294a(name = "maxLength")
    public void setMaxLength(C1483d c1483d, Integer num) {
        InputFilter[] filters = c1483d.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < filters.length; i++) {
                    if (!(filters[i] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i2 = 0; i2 < filters.length; i2++) {
                if (filters[i2] instanceof InputFilter.LengthFilter) {
                    filters[i2] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (z) {
                inputFilterArr = filters;
            } else {
                inputFilterArr = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
            }
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        c1483d.setFilters(inputFilterArr);
    }

    @InterfaceC1294a(defaultInt = 0, name = "mostRecentEventCount")
    public void setMostRecentEventCount(C1483d c1483d, int i) {
        c1483d.setMostRecentEventCount(i);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "multiline")
    public void setMultiline(C1483d c1483d, boolean z) {
        updateStagedInputTypeFlag(c1483d, z ? 0 : 131072, z ? 131072 : 0);
    }

    @InterfaceC1294a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C1483d c1483d, int i) {
        c1483d.setLines(i);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C1483d c1483d, boolean z) {
        c1483d.setContentSizeWatcher(z ? new C1476a(c1483d) : null);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C1483d c1483d, boolean z) {
        c1483d.setOnKeyPress(z);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C1483d c1483d, boolean z) {
        c1483d.setScrollWatcher(z ? new C1477b(c1483d) : null);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C1483d c1483d, boolean z) {
        c1483d.setSelectionWatcher(z ? new C1478c(c1483d) : null);
    }

    @InterfaceC1294a(name = "placeholder")
    public void setPlaceholder(C1483d c1483d, String str) {
        c1483d.setHint(str);
    }

    @InterfaceC1294a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C1483d c1483d, Integer num) {
        if (num == null) {
            c1483d.setHintTextColor(C1451d.m6142c(c1483d.getContext()));
        } else {
            c1483d.setHintTextColor(num.intValue());
        }
    }

    @InterfaceC1294a(name = "returnKeyLabel")
    public void setReturnKeyLabel(C1483d c1483d, String str) {
        c1483d.setImeActionLabel(str, IME_ACTION_ID);
    }

    @InterfaceC1294a(name = "returnKeyType")
    public void setReturnKeyType(C1483d c1483d, String str) {
        c1483d.setReturnKeyType(str);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C1483d c1483d, boolean z) {
        updateStagedInputTypeFlag(c1483d, z ? 0 : 144, z ? 128 : 0);
        checkPasswordType(c1483d);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C1483d c1483d, boolean z) {
        c1483d.setSelectAllOnFocus(z);
    }

    @InterfaceC1294a(name = "selection")
    public void setSelection(C1483d c1483d, ReadableMap readableMap) {
        if (readableMap != null && readableMap.hasKey("start") && readableMap.hasKey("end")) {
            c1483d.setSelection(readableMap.getInt("start"), readableMap.getInt("end"));
        }
    }

    @InterfaceC1294a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C1483d c1483d, Integer num) {
        c1483d.setHighlightColor(num == null ? C1451d.m6141b(c1483d.getContext()) : num.intValue());
        setCursorColor(c1483d, num);
    }

    @InterfaceC1294a(name = "textAlign")
    public void setTextAlign(C1483d c1483d, String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c1483d.setJustificationMode(0);
            }
            if (str == null || "auto".equals(str)) {
                c1483d.setGravityHorizontal(0);
                return;
            }
            if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    c1483d.setGravityHorizontal(5);
                    return;
                } else {
                    if ("center".equals(str)) {
                        c1483d.setGravityHorizontal(1);
                        return;
                    }
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            c1483d.setJustificationMode(1);
        }
        c1483d.setGravityHorizontal(3);
    }

    @InterfaceC1294a(name = "textAlignVertical")
    public void setTextAlignVertical(C1483d c1483d, String str) {
        int i;
        if (str == null || "auto".equals(str)) {
            i = 0;
        } else if ("top".equals(str)) {
            i = 48;
        } else if ("bottom".equals(str)) {
            i = 80;
        } else {
            if (!"center".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
            }
            i = 16;
        }
        c1483d.setGravityVertical(i);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @InterfaceC1294a(name = "autoComplete")
    public void setTextContentType(C1483d c1483d, String str) {
        String[] strArr;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (str != null) {
            if ("username".equals(str)) {
                strArr = new String[]{"username"};
            } else if ("password".equals(str)) {
                strArr = new String[]{"password"};
            } else if ("email".equals(str)) {
                strArr = new String[]{"emailAddress"};
            } else if ("name".equals(str)) {
                strArr = new String[]{"name"};
            } else if ("tel".equals(str)) {
                strArr = new String[]{"phone"};
            } else if ("street-address".equals(str)) {
                strArr = new String[]{"postalAddress"};
            } else if ("postal-code".equals(str)) {
                strArr = new String[]{"postalCode"};
            } else if ("cc-number".equals(str)) {
                strArr = new String[]{"creditCardNumber"};
            } else if ("cc-csc".equals(str)) {
                strArr = new String[]{"creditCardSecurityCode"};
            } else if ("cc-exp".equals(str)) {
                strArr = new String[]{"creditCardExpirationDate"};
            } else if ("cc-exp-month".equals(str)) {
                strArr = new String[]{"creditCardExpirationMonth"};
            } else if ("cc-exp-year".equals(str)) {
                strArr = new String[]{"creditCardExpirationYear"};
            } else if (!"off".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid autocomplete option: " + str);
            }
            c1483d.setAutofillHints(strArr);
            return;
        }
        c1483d.setImportantForAutofill(2);
    }

    @InterfaceC1294a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C1483d c1483d, Integer num) {
        Drawable background = c1483d.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e2) {
                C1700a.m6998a(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e2);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C1483d c1483d, Object obj) {
        if (obj instanceof C1468s) {
            C1468s c1468s = (C1468s) obj;
            c1483d.setPadding((int) c1468s.m6178e(), (int) c1468s.m6180g(), (int) c1468s.m6179f(), (int) c1468s.m6177d());
            if (c1468s.m6174a()) {
                AbstractC1475z.m6238a(c1468s.m6181h(), c1483d);
            }
            c1483d.m6259a(c1468s);
        }
    }
}
