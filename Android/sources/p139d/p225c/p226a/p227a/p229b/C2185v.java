package p139d.p225c.p226a.p227a.p229b;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.b.v */
/* loaded from: classes.dex */
public class C2185v extends Thread {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f7933a;

    /* renamed from: b */
    final /* synthetic */ C2187x f7934b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2185v(C2187x c2187x, AudioTrack audioTrack) {
        this.f7934b = c2187x;
        this.f7933a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ConditionVariable conditionVariable;
        try {
            this.f7933a.flush();
            this.f7933a.release();
        } finally {
            conditionVariable = this.f7934b.f7974j;
            conditionVariable.open();
        }
    }
}
