package com.facebook.react.uimanager.events;

import android.support.v4.util.C0267m;
import android.view.MotionEvent;
import com.facebook.react.bridge.SoftAssertions;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.uimanager.events.k */
/* loaded from: classes.dex */
public class C1338k extends AbstractC1330c<C1338k> {

    /* renamed from: f */
    private static final C0267m<C1338k> f4894f = new C0267m<>(3);

    /* renamed from: g */
    private MotionEvent f4895g;

    /* renamed from: h */
    private EnumC1341n f4896h;

    /* renamed from: i */
    private short f4897i;

    /* renamed from: j */
    private float f4898j;

    /* renamed from: k */
    private float f4899k;

    private C1338k() {
    }

    /* renamed from: a */
    public static C1338k m5763a(int i, EnumC1341n enumC1341n, MotionEvent motionEvent, long j, float f, float f2, C1339l c1339l) {
        C1338k mo1326a = f4894f.mo1326a();
        if (mo1326a == null) {
            mo1326a = new C1338k();
        }
        mo1326a.m5764b(i, enumC1341n, motionEvent, j, f, f2, c1339l);
        return mo1326a;
    }

    /* renamed from: b */
    private void m5764b(int i, EnumC1341n enumC1341n, MotionEvent motionEvent, long j, float f, float f2, C1339l c1339l) {
        super.m5717a(i);
        short s = 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    s = c1339l.m5769b(j);
                } else if (action != 3) {
                    if (action != 5 && action != 6) {
                        throw new RuntimeException("Unhandled MotionEvent action: " + action);
                    }
                    c1339l.m5771d(j);
                }
            }
            c1339l.m5772e(j);
        } else {
            c1339l.m5768a(j);
        }
        this.f4896h = enumC1341n;
        this.f4895g = MotionEvent.obtain(motionEvent);
        this.f4897i = s;
        this.f4898j = f;
        this.f4899k = f2;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        EnumC1341n enumC1341n = this.f4896h;
        C2038a.m8318a(enumC1341n);
        C1342o.m5775a(rCTEventEmitter, enumC1341n, m5723g(), this);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        int[] iArr = C1337j.f4893a;
        EnumC1341n enumC1341n = this.f4896h;
        C2038a.m8318a(enumC1341n);
        int i = iArr[enumC1341n.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f4896h);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return this.f4897i;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        EnumC1341n enumC1341n = this.f4896h;
        C2038a.m8318a(enumC1341n);
        return EnumC1341n.m5773a(enumC1341n);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: i */
    public void mo5725i() {
        MotionEvent motionEvent = this.f4895g;
        C2038a.m8318a(motionEvent);
        motionEvent.recycle();
        this.f4895g = null;
        f4894f.mo1327a(this);
    }

    /* renamed from: j */
    public MotionEvent m5765j() {
        C2038a.m8318a(this.f4895g);
        return this.f4895g;
    }

    /* renamed from: k */
    public float m5766k() {
        return this.f4898j;
    }

    /* renamed from: l */
    public float m5767l() {
        return this.f4899k;
    }
}
