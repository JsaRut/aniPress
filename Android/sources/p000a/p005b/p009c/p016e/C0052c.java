package p000a.p005b.p009c.p016e;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p005b.p009c.p016e.InterfaceC0050a;

/* renamed from: a.b.c.e.c */
/* loaded from: classes.dex */
public class C0052c implements Parcelable {
    public static final Parcelable.Creator<C0052c> CREATOR = new C0051b();

    /* renamed from: a */
    final boolean f169a = false;

    /* renamed from: b */
    final Handler f170b = null;

    /* renamed from: c */
    InterfaceC0050a f171c;

    /* renamed from: a.b.c.e.c$a */
    /* loaded from: classes.dex */
    class a extends InterfaceC0050a.a {
        a() {
        }

        @Override // p000a.p005b.p009c.p016e.InterfaceC0050a
        /* renamed from: a */
        public void mo232a(int i, Bundle bundle) {
            C0052c c0052c = C0052c.this;
            Handler handler = c0052c.f170b;
            if (handler != null) {
                handler.post(new b(i, bundle));
            } else {
                c0052c.mo234a(i, bundle);
            }
        }
    }

    /* renamed from: a.b.c.e.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final int f173a;

        /* renamed from: b */
        final Bundle f174b;

        b(int i, Bundle bundle) {
            this.f173a = i;
            this.f174b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0052c.this.mo234a(this.f173a, this.f174b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0052c(Parcel parcel) {
        this.f171c = InterfaceC0050a.a.m233a(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo234a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f171c == null) {
                this.f171c = new a();
            }
            parcel.writeStrongBinder(this.f171c.asBinder());
        }
    }
}
