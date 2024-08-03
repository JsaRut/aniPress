package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.jni.b */
/* loaded from: classes.dex */
public class C1016b {

    /* renamed from: b */
    private static c f4201b = new c(null);

    /* renamed from: c */
    private static ReferenceQueue f4202c = new ReferenceQueue();

    /* renamed from: a */
    private static b f4200a = new b();

    /* renamed from: d */
    private static Thread f4203d = new C1015a("HybridData DestructorThread");

    /* renamed from: com.facebook.jni.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends PhantomReference<Object> {

        /* renamed from: a */
        private a f4204a;

        /* renamed from: b */
        private a f4205b;

        private a() {
            super(null, C1016b.f4202c);
        }

        /* synthetic */ a(C1015a c1015a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Object obj) {
            super(obj, C1016b.f4202c);
            C1016b.f4201b.m5103a(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo5091a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.jni.b$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private a f4206a;

        public b() {
            C1015a c1015a = null;
            this.f4206a = new d(c1015a);
            this.f4206a.f4204a = new d(c1015a);
            this.f4206a.f4204a.f4205b = this.f4206a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m5100c(a aVar) {
            aVar.f4204a.f4205b = aVar.f4205b;
            aVar.f4205b.f4204a = aVar.f4204a;
        }

        /* renamed from: b */
        public void m5101b(a aVar) {
            aVar.f4204a = this.f4206a.f4204a;
            this.f4206a.f4204a = aVar;
            aVar.f4204a.f4205b = aVar;
            aVar.f4205b = this.f4206a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.jni.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private AtomicReference<a> f4207a;

        private c() {
            this.f4207a = new AtomicReference<>();
        }

        /* synthetic */ c(C1015a c1015a) {
            this();
        }

        /* renamed from: a */
        public void m5102a() {
            a andSet = this.f4207a.getAndSet(null);
            while (andSet != null) {
                a aVar = andSet.f4204a;
                C1016b.f4200a.m5101b(andSet);
                andSet = aVar;
            }
        }

        /* renamed from: a */
        public void m5103a(a aVar) {
            a aVar2;
            do {
                aVar2 = this.f4207a.get();
                aVar.f4204a = aVar2;
            } while (!this.f4207a.compareAndSet(aVar2, aVar));
        }
    }

    /* renamed from: com.facebook.jni.b$d */
    /* loaded from: classes.dex */
    private static class d extends a {
        private d() {
            super((C1015a) null);
        }

        /* synthetic */ d(C1015a c1015a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.facebook.jni.C1016b.a
        /* renamed from: a */
        public void mo5091a() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        f4203d.start();
    }
}
