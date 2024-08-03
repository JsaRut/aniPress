package p000a.p005b.p007b.p008a;

import android.graphics.drawable.Drawable;

/* renamed from: a.b.b.a.c */
/* loaded from: classes.dex */
public class C0013c implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ C0014d f34a;

    public C0013c(C0014d c0014d) {
        this.f34a = c0014d;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.f34a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f34a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f34a.unscheduleSelf(runnable);
    }
}
