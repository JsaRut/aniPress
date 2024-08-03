package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.events.C1338k;
import com.facebook.react.uimanager.events.C1339l;
import com.facebook.react.uimanager.events.EnumC1341n;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.uimanager.l */
/* loaded from: classes.dex */
public class C1355l {

    /* renamed from: e */
    private final ViewGroup f5017e;

    /* renamed from: a */
    private int f5013a = -1;

    /* renamed from: b */
    private final float[] f5014b = new float[2];

    /* renamed from: c */
    private boolean f5015c = false;

    /* renamed from: d */
    private long f5016d = Long.MIN_VALUE;

    /* renamed from: f */
    private final C1339l f5018f = new C1339l();

    public C1355l(ViewGroup viewGroup) {
        this.f5017e = viewGroup;
    }

    /* renamed from: a */
    private int m5845a(MotionEvent motionEvent) {
        return C1279O.m5599a(motionEvent.getX(), motionEvent.getY(), this.f5017e, this.f5014b, (int[]) null);
    }

    /* renamed from: c */
    private void m5846c(MotionEvent motionEvent, C1333f c1333f) {
        if (this.f5013a == -1) {
            C1700a.m7015d("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        C2038a.m8321a(!this.f5015c, "Expected to not have already sent a cancel for this gesture");
        C2038a.m8318a(c1333f);
        int i = this.f5013a;
        EnumC1341n enumC1341n = EnumC1341n.CANCEL;
        long j = this.f5016d;
        float[] fArr = this.f5014b;
        c1333f.m5753a(C1338k.m5763a(i, enumC1341n, motionEvent, j, fArr[0], fArr[1], this.f5018f));
    }

    /* renamed from: a */
    public void m5847a(MotionEvent motionEvent, C1333f c1333f) {
        EnumC1341n enumC1341n;
        long j;
        float f;
        float f2;
        C1338k m5763a;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (this.f5015c) {
                return;
            }
            int i = this.f5013a;
            if (i == -1) {
                C1700a.m7006b("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
                return;
            }
            if (action == 1) {
                m5845a(motionEvent);
                int i2 = this.f5013a;
                EnumC1341n enumC1341n2 = EnumC1341n.END;
                long j2 = this.f5016d;
                float[] fArr = this.f5014b;
                c1333f.m5753a(C1338k.m5763a(i2, enumC1341n2, motionEvent, j2, fArr[0], fArr[1], this.f5018f));
            } else if (action == 2) {
                m5845a(motionEvent);
                int i3 = this.f5013a;
                EnumC1341n enumC1341n3 = EnumC1341n.MOVE;
                long j3 = this.f5016d;
                float[] fArr2 = this.f5014b;
                m5763a = C1338k.m5763a(i3, enumC1341n3, motionEvent, j3, fArr2[0], fArr2[1], this.f5018f);
            } else {
                if (action == 5) {
                    enumC1341n = EnumC1341n.START;
                    j = this.f5016d;
                    float[] fArr3 = this.f5014b;
                    f = fArr3[0];
                    f2 = fArr3[1];
                } else if (action == 6) {
                    enumC1341n = EnumC1341n.END;
                    j = this.f5016d;
                    float[] fArr4 = this.f5014b;
                    f = fArr4[0];
                    f2 = fArr4[1];
                } else {
                    if (action != 3) {
                        C1700a.m7015d("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f5013a);
                        return;
                    }
                    if (this.f5018f.m5770c(motionEvent.getDownTime())) {
                        m5846c(motionEvent, c1333f);
                    } else {
                        C1700a.m7006b("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                    }
                }
                m5763a = C1338k.m5763a(i, enumC1341n, motionEvent, j, f, f2, this.f5018f);
            }
            this.f5013a = -1;
            this.f5016d = Long.MIN_VALUE;
            return;
        }
        if (this.f5013a != -1) {
            C1700a.m7006b("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
        }
        this.f5015c = false;
        this.f5016d = motionEvent.getEventTime();
        this.f5013a = m5845a(motionEvent);
        int i4 = this.f5013a;
        EnumC1341n enumC1341n4 = EnumC1341n.START;
        long j4 = this.f5016d;
        float[] fArr5 = this.f5014b;
        m5763a = C1338k.m5763a(i4, enumC1341n4, motionEvent, j4, fArr5[0], fArr5[1], this.f5018f);
        c1333f.m5753a(m5763a);
    }

    /* renamed from: b */
    public void m5848b(MotionEvent motionEvent, C1333f c1333f) {
        if (this.f5015c) {
            return;
        }
        m5846c(motionEvent, c1333f);
        this.f5015c = true;
        this.f5013a = -1;
    }
}
