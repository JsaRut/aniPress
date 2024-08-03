package p000a.p005b.p009c.p016e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a.b.c.e.a */
/* loaded from: classes.dex */
public interface InterfaceC0050a extends IInterface {

    /* renamed from: a.b.c.e.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0050a {

        /* renamed from: a.b.c.e.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C2795a implements InterfaceC0050a {

            /* renamed from: a */
            private IBinder f168a;

            C2795a(IBinder iBinder) {
                this.f168a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f168a;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static InterfaceC0050a m233a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0050a)) ? new C2795a(iBinder) : (InterfaceC0050a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo232a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    /* renamed from: a */
    void mo232a(int i, Bundle bundle);
}
