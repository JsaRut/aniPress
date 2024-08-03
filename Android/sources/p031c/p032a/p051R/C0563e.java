package p031c.p032a.p051R;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import p031c.p032a.p052S.C0569a;

/* renamed from: c.a.R.e */
/* loaded from: classes.dex */
final class C0563e extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ C0562d f2719a;

    private C0563e(C0562d c0562d) {
        this.f2719a = c0562d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C0563e(C0562d c0562d, byte b2) {
        this(c0562d);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        C0569a m2938a;
        int networkId;
        try {
            super.onSignalStrengthsChanged(signalStrength);
            C0562d.m2938a(this.f2719a).f2738f = signalStrength.getGsmSignalStrength();
            CellLocation cellLocation = C0562d.m2939b(this.f2719a).getCellLocation();
            if (cellLocation == null) {
                return;
            }
            if (!(cellLocation instanceof GsmCellLocation)) {
                if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    C0562d.m2938a(this.f2719a).f2737e = cdmaCellLocation.getBaseStationId();
                    m2938a = C0562d.m2938a(this.f2719a);
                    networkId = cdmaCellLocation.getNetworkId();
                }
                C0562d.m2939b(this.f2719a).listen(this, 0);
            }
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            C0562d.m2938a(this.f2719a).f2737e = gsmCellLocation.getCid();
            m2938a = C0562d.m2938a(this.f2719a);
            networkId = gsmCellLocation.getLac();
            m2938a.f2736d = networkId;
            C0562d.m2939b(this.f2719a).listen(this, 0);
        } catch (Throwable unused) {
        }
    }
}
