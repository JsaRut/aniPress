package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.i18nmanager.C1190a;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;

/* renamed from: com.facebook.react.uimanager.n */
/* loaded from: classes.dex */
public class C1359n extends C1270F {

    /* renamed from: v */
    private final a f5023v = new a(null);

    /* renamed from: com.facebook.react.uimanager.n$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        float f5024a;

        /* renamed from: b */
        YogaUnit f5025b;

        private a() {
        }

        /* synthetic */ a(C1357m c1357m) {
            this();
        }

        /* renamed from: a */
        void m5855a(Dynamic dynamic) {
            float m5956a;
            YogaUnit yogaUnit;
            if (!dynamic.isNull()) {
                if (dynamic.getType() == ReadableType.String) {
                    String asString = dynamic.asString();
                    if (asString.equals("auto")) {
                        yogaUnit = YogaUnit.AUTO;
                    } else {
                        if (!asString.endsWith("%")) {
                            throw new IllegalArgumentException("Unknown value: " + asString);
                        }
                        this.f5025b = YogaUnit.PERCENT;
                        m5956a = Float.parseFloat(asString.substring(0, asString.length() - 1));
                    }
                } else {
                    this.f5025b = YogaUnit.POINT;
                    m5956a = C1374w.m5956a(dynamic.asDouble());
                }
                this.f5024a = m5956a;
                return;
            }
            yogaUnit = YogaUnit.UNDEFINED;
            this.f5025b = yogaUnit;
            this.f5024a = Float.NaN;
        }
    }

    /* renamed from: i */
    private int m5854i(int i) {
        if (!C1190a.m5346a().m5353a(mo5513p())) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return i;
        }
        return 5;
    }

    @InterfaceC1294a(name = "alignContent")
    public void setAlignContent(String str) {
        YogaAlign yogaAlign;
        if (mo5507j()) {
            return;
        }
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    yogaAlign = YogaAlign.AUTO;
                    break;
                case 1:
                    break;
                case 2:
                    yogaAlign = YogaAlign.CENTER;
                    break;
                case 3:
                    yogaAlign = YogaAlign.FLEX_END;
                    break;
                case 4:
                    yogaAlign = YogaAlign.STRETCH;
                    break;
                case 5:
                    yogaAlign = YogaAlign.BASELINE;
                    break;
                case 6:
                    yogaAlign = YogaAlign.SPACE_BETWEEN;
                    break;
                case 7:
                    yogaAlign = YogaAlign.SPACE_AROUND;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
            }
            m5540a(yogaAlign);
        }
        yogaAlign = YogaAlign.FLEX_START;
        m5540a(yogaAlign);
    }

    @InterfaceC1294a(name = "alignItems")
    public void setAlignItems(String str) {
        YogaAlign yogaAlign;
        if (mo5507j()) {
            return;
        }
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    yogaAlign = YogaAlign.AUTO;
                    break;
                case 1:
                    yogaAlign = YogaAlign.FLEX_START;
                    break;
                case 2:
                    yogaAlign = YogaAlign.CENTER;
                    break;
                case 3:
                    yogaAlign = YogaAlign.FLEX_END;
                    break;
                case 4:
                    break;
                case 5:
                    yogaAlign = YogaAlign.BASELINE;
                    break;
                case 6:
                    yogaAlign = YogaAlign.SPACE_BETWEEN;
                    break;
                case 7:
                    yogaAlign = YogaAlign.SPACE_AROUND;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
            }
            m5549b(yogaAlign);
        }
        yogaAlign = YogaAlign.STRETCH;
        m5549b(yogaAlign);
    }

    @InterfaceC1294a(name = "alignSelf")
    public void setAlignSelf(String str) {
        YogaAlign yogaAlign;
        if (mo5507j()) {
            return;
        }
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    break;
                case 1:
                    yogaAlign = YogaAlign.FLEX_START;
                    break;
                case 2:
                    yogaAlign = YogaAlign.CENTER;
                    break;
                case 3:
                    yogaAlign = YogaAlign.FLEX_END;
                    break;
                case 4:
                    yogaAlign = YogaAlign.STRETCH;
                    break;
                case 5:
                    yogaAlign = YogaAlign.BASELINE;
                    break;
                case 6:
                    yogaAlign = YogaAlign.SPACE_BETWEEN;
                    break;
                case 7:
                    yogaAlign = YogaAlign.SPACE_AROUND;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
            }
            m5551c(yogaAlign);
        }
        yogaAlign = YogaAlign.AUTO;
        m5551c(yogaAlign);
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        m5558g(f);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (mo5507j()) {
            return;
        }
        m5538a(m5854i(C1368ra.f5058a[i]), C1374w.m5959b(f));
    }

    @InterfaceC1294a(name = "display")
    public void setDisplay(String str) {
        YogaDisplay yogaDisplay;
        if (mo5507j()) {
            return;
        }
        if (str == null) {
            m5541a(YogaDisplay.FLEX);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3145721) {
            if (hashCode == 3387192 && str.equals("none")) {
                c2 = 1;
            }
        } else if (str.equals("flex")) {
            c2 = 0;
        }
        if (c2 == 0) {
            yogaDisplay = YogaDisplay.FLEX;
        } else {
            if (c2 != 1) {
                throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
            }
            yogaDisplay = YogaDisplay.NONE;
        }
        m5541a(yogaDisplay);
    }

    @Override // com.facebook.react.uimanager.C1270F
    @InterfaceC1294a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (mo5507j()) {
            return;
        }
        super.setFlex(f);
    }

    @InterfaceC1294a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        this.f5023v.m5855a(dynamic);
        int i = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i == 1 || i == 2) {
            m5553e(this.f5023v.f5024a);
        } else if (i == 3) {
            m5537M();
        } else if (i == 4) {
            m5556f(this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "flexDirection")
    public void setFlexDirection(String str) {
        YogaFlexDirection yogaFlexDirection;
        if (mo5507j()) {
            return;
        }
        if (str == null) {
            m5542a(YogaFlexDirection.COLUMN);
            return;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1448970769:
                if (str.equals("row-reverse")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c2 = 0;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1272730475:
                if (str.equals("column-reverse")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            yogaFlexDirection = YogaFlexDirection.COLUMN;
        } else if (c2 == 1) {
            yogaFlexDirection = YogaFlexDirection.COLUMN_REVERSE;
        } else if (c2 == 2) {
            yogaFlexDirection = YogaFlexDirection.ROW;
        } else {
            if (c2 != 3) {
                throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
            }
            yogaFlexDirection = YogaFlexDirection.ROW_REVERSE;
        }
        m5542a(yogaFlexDirection);
    }

    @Override // com.facebook.react.uimanager.C1270F
    @InterfaceC1294a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (mo5507j()) {
            return;
        }
        super.setFlexGrow(f);
    }

    @Override // com.facebook.react.uimanager.C1270F
    @InterfaceC1294a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (mo5507j()) {
            return;
        }
        super.setFlexShrink(f);
    }

    @InterfaceC1294a(name = "flexWrap")
    public void setFlexWrap(String str) {
        YogaWrap yogaWrap;
        if (mo5507j()) {
            return;
        }
        if (str == null) {
            m5547a(YogaWrap.NO_WRAP);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1039592053) {
            if (hashCode != -749527969) {
                if (hashCode == 3657802 && str.equals("wrap")) {
                    c2 = 1;
                }
            } else if (str.equals("wrap-reverse")) {
                c2 = 2;
            }
        } else if (str.equals("nowrap")) {
            c2 = 0;
        }
        if (c2 == 0) {
            yogaWrap = YogaWrap.NO_WRAP;
        } else if (c2 == 1) {
            yogaWrap = YogaWrap.WRAP;
        } else {
            if (c2 != 2) {
                throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
            }
            yogaWrap = YogaWrap.WRAP_REVERSE;
        }
        m5547a(yogaWrap);
    }

    @InterfaceC1294a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        this.f5023v.m5855a(dynamic);
        int i = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i == 1 || i == 2) {
            mo5490b(this.f5023v.f5024a);
        } else if (i == 3) {
            mo5516s();
        } else if (i == 4) {
            m5561h(this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "justifyContent")
    public void setJustifyContent(String str) {
        YogaJustify yogaJustify;
        if (mo5507j()) {
            return;
        }
        if (str == null) {
            m5543a(YogaJustify.FLEX_START);
            return;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 1;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c2 = 0;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2055030478:
                if (str.equals("space-evenly")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            yogaJustify = YogaJustify.FLEX_START;
        } else if (c2 == 1) {
            yogaJustify = YogaJustify.CENTER;
        } else if (c2 == 2) {
            yogaJustify = YogaJustify.FLEX_END;
        } else if (c2 == 3) {
            yogaJustify = YogaJustify.SPACE_BETWEEN;
        } else if (c2 == 4) {
            yogaJustify = YogaJustify.SPACE_AROUND;
        } else {
            if (c2 != 5) {
                throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
            }
            yogaJustify = YogaJustify.SPACE_EVENLY;
        }
        m5543a(yogaJustify);
    }

    @InterfaceC1295b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        int m5854i = m5854i(C1368ra.f5059b[i]);
        this.f5023v.m5855a(dynamic);
        int i2 = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            m5550c(m5854i, this.f5023v.f5024a);
        } else if (i2 == 3) {
            m5559g(m5854i);
        } else if (i2 == 4) {
            m5552d(m5854i, this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        this.f5023v.m5855a(dynamic);
        int i = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i == 1 || i == 2) {
            mo5495c(this.f5023v.f5024a);
        } else if (i == 4) {
            m5563i(this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        this.f5023v.m5855a(dynamic);
        int i = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i == 1 || i == 2) {
            mo5479a(this.f5023v.f5024a);
        } else if (i == 4) {
            m5564j(this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        this.f5023v.m5855a(dynamic);
        int i = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i == 1 || i == 2) {
            m5565k(this.f5023v.f5024a);
        } else if (i == 4) {
            m5566l(this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        this.f5023v.m5855a(dynamic);
        int i = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i == 1 || i == 2) {
            m5567m(this.f5023v.f5024a);
        } else if (i == 4) {
            m5568n(this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "overflow")
    public void setOverflow(String str) {
        YogaOverflow yogaOverflow;
        if (mo5507j()) {
            return;
        }
        if (str == null) {
            m5545a(YogaOverflow.VISIBLE);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1217487446) {
            if (hashCode != -907680051) {
                if (hashCode == 466743410 && str.equals("visible")) {
                    c2 = 0;
                }
            } else if (str.equals("scroll")) {
                c2 = 2;
            }
        } else if (str.equals("hidden")) {
            c2 = 1;
        }
        if (c2 == 0) {
            yogaOverflow = YogaOverflow.VISIBLE;
        } else if (c2 == 1) {
            yogaOverflow = YogaOverflow.HIDDEN;
        } else {
            if (c2 != 2) {
                throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
            }
            yogaOverflow = YogaOverflow.SCROLL;
        }
        m5545a(yogaOverflow);
    }

    @InterfaceC1295b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        int m5854i = m5854i(C1368ra.f5059b[i]);
        this.f5023v.m5855a(dynamic);
        int i2 = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            mo5554e(m5854i, this.f5023v.f5024a);
        } else if (i2 == 4) {
            m5557f(m5854i, this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @InterfaceC1294a(name = "position")
    public void setPosition(String str) {
        YogaPositionType yogaPositionType;
        if (mo5507j()) {
            return;
        }
        if (str == null) {
            m5546a(YogaPositionType.RELATIVE);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -554435892) {
            if (hashCode == 1728122231 && str.equals("absolute")) {
                c2 = 1;
            }
        } else if (str.equals("relative")) {
            c2 = 0;
        }
        if (c2 == 0) {
            yogaPositionType = YogaPositionType.RELATIVE;
        } else {
            if (c2 != 1) {
                throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
            }
            yogaPositionType = YogaPositionType.ABSOLUTE;
        }
        m5546a(yogaPositionType);
    }

    @InterfaceC1295b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        int m5854i = m5854i(new int[]{4, 5, 0, 2, 1, 3}[i]);
        this.f5023v.m5855a(dynamic);
        int i2 = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            m5560g(m5854i, this.f5023v.f5024a);
        } else if (i2 == 4) {
            m5562h(m5854i, this.f5023v.f5024a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.C1270F
    @InterfaceC1294a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @InterfaceC1294a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (mo5507j()) {
            return;
        }
        this.f5023v.m5855a(dynamic);
        int i = C1357m.f5022a[this.f5023v.f5025b.ordinal()];
        if (i == 1 || i == 2) {
            mo5498d(this.f5023v.f5024a);
        } else if (i == 3) {
            mo5522y();
        } else if (i == 4) {
            m5569o(this.f5023v.f5024a);
        }
        dynamic.recycle();
    }
}
