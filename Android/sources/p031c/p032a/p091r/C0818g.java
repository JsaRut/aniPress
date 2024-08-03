package p031c.p032a.p091r;

import android.util.SparseArray;
import p000a.p005b.p022d.p023a.C0121j;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.g */
/* loaded from: classes.dex */
public final class C0818g {

    /* renamed from: a */
    private static final SparseArray<String> f3555a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f3555a = sparseArray;
        sparseArray.put(0, "OK");
        f3555a.put(-1001, "Exceed buffer size. Please contact support.");
        f3555a.put(-1000, "Connection failed. Please check your connection and retry later!");
        f3555a.put(-998, "Sending failed or timeout. Please Retry later!");
        f3555a.put(-997, "Receiving failed or timeout. Please Retry later!");
        f3555a.put(-996, "Connection is closed. Please Retry later!");
        f3555a.put(-994, "Response timeout. Please Retry later!");
        f3555a.put(-993, "Invalid socket. Please Retry later!");
        f3555a.put(11, "Failed to register!");
        f3555a.put(1005, "Your appKey and android package name are not matched. Please double check them according to Application you created on Portal.");
        f3555a.put(1006, "You android package name is not exist, Please register your pacakge name in Portal.");
        f3555a.put(1007, "Invalid Imei, Register again.");
        f3555a.put(1008, "Invalid appKey, Please get your Appkey from JIGUANG web console!");
        f3555a.put(1009, "Your appKey is related to a non-Android App.Please use your Android App's appKey, or add an Android app for this appKey.");
        f3555a.put(10000, "Receiver data parse error");
        f3555a.put(C0121j.AppCompatTheme_textAppearanceSearchResultTitle, "102 - Incorrect password");
        f3555a.put(C0121j.AppCompatTheme_tooltipForegroundColor, "108 - Incorrect uid");
        f3555a.put(1012, "Server reject this connection, will clear cache and restart connect.");
    }

    /* renamed from: a */
    public static String m3988a(int i) {
        if (f3555a.get(i) != null) {
            return f3555a.get(i);
        }
        C0675a.m3469c("StatusCode", "Unknown error code - " + i);
        return null;
    }
}
