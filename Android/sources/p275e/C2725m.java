package p275e;

import java.util.concurrent.TimeUnit;

/* renamed from: e.m */
/* loaded from: classes.dex */
public class C2725m extends C2711F {

    /* renamed from: a */
    private C2711F f11403a;

    public C2725m(C2711F c2711f) {
        if (c2711f == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f11403a = c2711f;
    }

    /* renamed from: a */
    public final C2711F m11729a() {
        return this.f11403a;
    }

    /* renamed from: a */
    public final C2725m m11730a(C2711F c2711f) {
        if (c2711f == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f11403a = c2711f;
        return this;
    }

    @Override // p275e.C2711F
    public C2711F clearDeadline() {
        return this.f11403a.clearDeadline();
    }

    @Override // p275e.C2711F
    public C2711F clearTimeout() {
        return this.f11403a.clearTimeout();
    }

    @Override // p275e.C2711F
    public long deadlineNanoTime() {
        return this.f11403a.deadlineNanoTime();
    }

    @Override // p275e.C2711F
    public C2711F deadlineNanoTime(long j) {
        return this.f11403a.deadlineNanoTime(j);
    }

    @Override // p275e.C2711F
    public boolean hasDeadline() {
        return this.f11403a.hasDeadline();
    }

    @Override // p275e.C2711F
    public void throwIfReached() {
        this.f11403a.throwIfReached();
    }

    @Override // p275e.C2711F
    public C2711F timeout(long j, TimeUnit timeUnit) {
        return this.f11403a.timeout(j, timeUnit);
    }

    @Override // p275e.C2711F
    public long timeoutNanos() {
        return this.f11403a.timeoutNanos();
    }
}
