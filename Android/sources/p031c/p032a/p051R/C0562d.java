package p031c.p032a.p051R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import java.util.List;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p052S.C0569a;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0820i;

@SuppressLint({"MissingPermission"})
/* renamed from: c.a.R.d */
/* loaded from: classes.dex */
public final class C0562d {

    /* renamed from: a */
    private Context f2716a;

    /* renamed from: b */
    private final TelephonyManager f2717b;

    /* renamed from: c */
    private C0569a f2718c;

    public C0562d(Context context) {
        this.f2716a = context;
        this.f2717b = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: a */
    public final C0569a m2940a() {
        return this.f2718c;
    }

    /* renamed from: b */
    public final void m2941b() {
        if (this.f2717b == null) {
            C0675a.m3475g("JLocationCell", "get telephonyManager failed");
            return;
        }
        this.f2718c = new C0569a();
        this.f2718c.f2733a = C0557c.m2916j(this.f2716a);
        String networkOperator = this.f2717b.getNetworkOperator();
        if (networkOperator.length() > 3) {
            this.f2718c.f2734b = Integer.parseInt(networkOperator.substring(0, 3));
            this.f2718c.f2735c = Integer.parseInt(networkOperator.substring(3));
        }
        this.f2718c.f2741i = this.f2717b.getNetworkOperatorName();
        C0569a c0569a = this.f2718c;
        int networkType = this.f2717b.getNetworkType();
        C0675a.m3465a("TeleonyManagerUtils", "getRadioType - networkType:" + networkType);
        String str = (networkType == 4 || networkType == 7 || networkType == 5 || networkType == 6 || networkType == 12 || networkType == 14) ? "cdma" : networkType == 13 ? "lte" : "gsm";
        C0675a.m3465a("TeleonyManagerUtils", "getRadioType - radioType:" + str);
        c0569a.f2739g = str;
        this.f2718c.f2740h = C0820i.m4003a(this.f2716a, this.f2717b.getNetworkType());
        if (Build.VERSION.SDK_INT <= 17) {
            this.f2717b.listen(new C0563e(this, (byte) 0), 256);
            return;
        }
        List<CellInfo> allCellInfo = this.f2717b.getAllCellInfo();
        if (allCellInfo == null || allCellInfo.size() <= 0) {
            return;
        }
        for (CellInfo cellInfo : allCellInfo) {
            if (cellInfo != null) {
                if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
                    CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
                    this.f2718c.f2738f = cellSignalStrength.getDbm();
                    this.f2718c.f2737e = cellIdentity.getCi();
                    this.f2718c.f2736d = cellIdentity.getTac();
                    if (this.f2718c.f2737e < 268435455) {
                        return;
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellSignalStrengthGsm cellSignalStrength2 = cellInfoGsm.getCellSignalStrength();
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    this.f2718c.f2738f = cellSignalStrength2.getDbm();
                    this.f2718c.f2737e = cellIdentity2.getCid();
                    this.f2718c.f2736d = cellIdentity2.getLac();
                    if (this.f2718c.f2737e < 65535) {
                        return;
                    }
                } else if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    CellSignalStrengthCdma cellSignalStrength3 = cellInfoCdma.getCellSignalStrength();
                    CellIdentityCdma cellIdentity3 = cellInfoCdma.getCellIdentity();
                    this.f2718c.f2738f = cellSignalStrength3.getDbm();
                    this.f2718c.f2737e = cellIdentity3.getBasestationId();
                    this.f2718c.f2736d = cellIdentity3.getNetworkId();
                    if (this.f2718c.f2737e < 65535) {
                        return;
                    }
                } else if (cellInfo instanceof CellInfoWcdma) {
                    CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                    CellSignalStrengthWcdma cellSignalStrength4 = cellInfoWcdma.getCellSignalStrength();
                    CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                    this.f2718c.f2738f = cellSignalStrength4.getDbm();
                    this.f2718c.f2737e = cellIdentity4.getCid();
                    this.f2718c.f2736d = cellIdentity4.getLac();
                    if (this.f2718c.f2737e < 268435455) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
