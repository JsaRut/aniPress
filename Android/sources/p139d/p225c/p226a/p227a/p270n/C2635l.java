package p139d.p225c.p226a.p227a.p270n;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p139d.p225c.p226a.p227a.p270n.C2635l;

/* renamed from: d.c.a.a.n.l */
/* loaded from: classes.dex */
public final class C2635l<T> {

    /* renamed from: a */
    private final CopyOnWriteArrayList<b<T>> f10960a = new CopyOnWriteArrayList<>();

    /* renamed from: d.c.a.a.n.l$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        void mo9049a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.n.l$b */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a */
        private final Handler f10961a;

        /* renamed from: b */
        private final T f10962b;

        /* renamed from: c */
        private boolean f10963c;

        public b(Handler handler, T t) {
            this.f10961a = handler;
            this.f10962b = t;
        }

        /* renamed from: a */
        public void m11149a() {
            this.f10963c = true;
        }

        /* renamed from: a */
        public void m11150a(final a<T> aVar) {
            this.f10961a.post(new Runnable() { // from class: d.c.a.a.n.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2635l.b.this.m11151b(aVar);
                }
            });
        }

        /* renamed from: b */
        public /* synthetic */ void m11151b(a aVar) {
            if (this.f10963c) {
                return;
            }
            aVar.mo9049a(this.f10962b);
        }
    }

    /* renamed from: a */
    public void m11145a(Handler handler, T t) {
        C2628e.m11111a((handler == null || t == null) ? false : true);
        m11147a((C2635l<T>) t);
        this.f10960a.add(new b<>(handler, t));
    }

    /* renamed from: a */
    public void m11146a(a<T> aVar) {
        Iterator<b<T>> it = this.f10960a.iterator();
        while (it.hasNext()) {
            it.next().m11150a(aVar);
        }
    }

    /* renamed from: a */
    public void m11147a(T t) {
        Iterator<b<T>> it = this.f10960a.iterator();
        while (it.hasNext()) {
            b<T> next = it.next();
            if (((b) next).f10962b == t) {
                next.m11149a();
                this.f10960a.remove(next);
            }
        }
    }
}
