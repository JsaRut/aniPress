package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import com.facebook.react.views.text.AbstractC1457h;
import com.facebook.yoga.C1553a;

/* loaded from: classes.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends AbstractC1457h> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @InterfaceC1295b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1469t c1469t, int i, Integer num) {
        c1469t.m6186a(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1469t c1469t, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        if (i == 0) {
            c1469t.setBorderRadius(f);
        } else {
            c1469t.m6184a(f, i - 1);
        }
    }

    @InterfaceC1294a(name = "borderStyle")
    public void setBorderStyle(C1469t c1469t, String str) {
        c1469t.setBorderStyle(str);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1469t c1469t, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        c1469t.m6185a(SPACING_TYPES[i], f);
    }

    @InterfaceC1294a(defaultBoolean = false, name = "disabled")
    public void setDisabled(C1469t c1469t, boolean z) {
        c1469t.setEnabled(!z);
    }

    @InterfaceC1294a(name = "ellipsizeMode")
    public void setEllipsizeMode(C1469t c1469t, String str) {
        TextUtils.TruncateAt truncateAt;
        if (str == null || str.equals("tail")) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (str.equals("head")) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (str.equals("middle")) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (!str.equals("clip")) {
                throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
            }
            truncateAt = null;
        }
        c1469t.setEllipsizeLocation(truncateAt);
    }

    @InterfaceC1294a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C1469t c1469t, boolean z) {
        c1469t.setIncludeFontPadding(z);
    }

    @InterfaceC1294a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(C1469t c1469t, int i) {
        c1469t.setNumberOfLines(i);
    }

    @InterfaceC1294a(name = "selectable")
    public void setSelectable(C1469t c1469t, boolean z) {
        c1469t.setTextIsSelectable(z);
    }

    @InterfaceC1294a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C1469t c1469t, Integer num) {
        c1469t.setHighlightColor(num == null ? C1451d.m6141b(c1469t.getContext()) : num.intValue());
    }

    @InterfaceC1294a(name = "textAlignVertical")
    public void setTextAlignVertical(C1469t c1469t, String str) {
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
        c1469t.setGravityVertical(i);
    }
}
