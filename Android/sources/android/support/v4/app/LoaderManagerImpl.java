package android.support.v4.app;

import android.arch.lifecycle.AbstractC0157q;
import android.arch.lifecycle.C0153m;
import android.arch.lifecycle.C0158r;
import android.arch.lifecycle.C0159s;
import android.arch.lifecycle.InterfaceC0146f;
import android.arch.lifecycle.InterfaceC0154n;
import android.os.Bundle;
import android.support.v4.util.C0260f;
import android.support.v4.util.C0270p;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p005b.p009c.p010a.C0033c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LoaderManagerImpl extends AbstractC0186X {

    /* renamed from: a */
    static boolean f670a = false;

    /* renamed from: b */
    private final InterfaceC0146f f671b;

    /* renamed from: c */
    private final LoaderViewModel f672c;

    /* loaded from: classes.dex */
    static class LoaderViewModel extends AbstractC0157q {

        /* renamed from: a */
        private static final C0158r.a f673a = new C0187Y();

        /* renamed from: b */
        private C0270p<C0174a> f674b = new C0270p<>();

        /* renamed from: c */
        private boolean f675c = false;

        /* renamed from: a */
        static LoaderViewModel m774a(C0159s c0159s) {
            return (LoaderViewModel) new C0158r(c0159s, f673a).m746a(LoaderViewModel.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.arch.lifecycle.AbstractC0157q
        /* renamed from: a */
        public void mo745a() {
            super.mo745a();
            if (this.f674b.m1402b() <= 0) {
                this.f674b.m1399a();
            } else {
                this.f674b.m1408e(0).m777a(true);
                throw null;
            }
        }

        /* renamed from: a */
        public void m775a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f674b.m1402b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f674b.m1402b() <= 0) {
                    return;
                }
                C0174a m1408e = this.f674b.m1408e(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f674b.m1405c(0));
                printWriter.print(": ");
                printWriter.println(m1408e.toString());
                m1408e.m778a(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        /* renamed from: b */
        void m776b() {
            int m1402b = this.f674b.m1402b();
            for (int i = 0; i < m1402b; i++) {
                this.f674b.m1408e(i).m779d();
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    /* loaded from: classes.dex */
    public static class C0174a<D> extends C0153m<D> implements C0033c.a<D> {

        /* renamed from: k */
        private final int f676k;

        /* renamed from: l */
        private final Bundle f677l;

        /* renamed from: m */
        private final C0033c<D> f678m;

        /* renamed from: n */
        private InterfaceC0146f f679n;

        /* renamed from: o */
        private C0175b<D> f680o;

        /* renamed from: p */
        private C0033c<D> f681p;

        /* renamed from: a */
        C0033c<D> m777a(boolean z) {
            if (LoaderManagerImpl.f670a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f678m.m164a();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        /* renamed from: a */
        public void mo693a(InterfaceC0154n<? super D> interfaceC0154n) {
            super.mo693a((InterfaceC0154n) interfaceC0154n);
            this.f679n = null;
            this.f680o = null;
        }

        @Override // android.arch.lifecycle.C0153m, android.arch.lifecycle.LiveData
        /* renamed from: a */
        public void mo694a(D d2) {
            super.mo694a((C0174a<D>) d2);
            C0033c<D> c0033c = this.f681p;
            if (c0033c == null) {
                return;
            }
            c0033c.m165b();
            throw null;
        }

        /* renamed from: a */
        public void m778a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f676k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f677l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f678m);
            this.f678m.m163a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        /* renamed from: b */
        protected void mo695b() {
            if (LoaderManagerImpl.f670a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f678m.m166c();
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        /* renamed from: c */
        protected void mo696c() {
            if (LoaderManagerImpl.f670a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f678m.m167d();
            throw null;
        }

        /* renamed from: d */
        void m779d() {
            InterfaceC0146f interfaceC0146f = this.f679n;
            C0175b<D> c0175b = this.f680o;
            if (interfaceC0146f == null || c0175b == null) {
                return;
            }
            super.mo693a((InterfaceC0154n) c0175b);
            m692a(interfaceC0146f, c0175b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f676k);
            sb.append(" : ");
            C0260f.m1353a(this.f678m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    /* loaded from: classes.dex */
    public static class C0175b<D> implements InterfaceC0154n<D> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoaderManagerImpl(InterfaceC0146f interfaceC0146f, C0159s c0159s) {
        this.f671b = interfaceC0146f;
        this.f672c = LoaderViewModel.m774a(c0159s);
    }

    @Override // android.support.v4.app.AbstractC0186X
    /* renamed from: a */
    public void mo772a() {
        this.f672c.m776b();
    }

    @Override // android.support.v4.app.AbstractC0186X
    @Deprecated
    /* renamed from: a */
    public void mo773a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f672c.m775a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0260f.m1353a(this.f671b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
