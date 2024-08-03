package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0241b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0241b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C2797a implements InterfaceC0241b {

            /* renamed from: a */
            private IBinder f1047a;

            C2797a(IBinder iBinder) {
                this.f1047a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0241b
            /* renamed from: a */
            public void mo1286a(InterfaceC0240a interfaceC0240a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0240a != null ? interfaceC0240a.asBinder() : null);
                    this.f1047a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1047a;
            }
        }

        /* renamed from: a */
        public static InterfaceC0241b m1287a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0241b)) ? new C2797a(iBinder) : (InterfaceC0241b) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo1286a(InterfaceC0240a interfaceC0240a);
}
