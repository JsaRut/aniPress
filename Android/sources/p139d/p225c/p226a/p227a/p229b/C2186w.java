package p139d.p225c.p226a.p227a.p229b;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.b.w */
/* loaded from: classes.dex */
public class C2186w extends Thread {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f7935a;

    /* renamed from: b */
    final /* synthetic */ C2187x f7936b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2186w(C2187x c2187x, AudioTrack audioTrack) {
        this.f7936b = c2187x;
        this.f7935a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f7935a.release();
    }
}
