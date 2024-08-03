package p031c.p032a.p099y;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.a.y.c */
/* loaded from: classes.dex */
final class C0865c implements InterfaceC0863a {

    /* renamed from: a */
    private IBinder f3636a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0865c(IBinder iBinder) {
        this.f3636a = iBinder;
    }

    @Override // p031c.p032a.p099y.InterfaceC0863a
    /* renamed from: a */
    public final Bundle mo4194a(String str, String str2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("cn.jiguang.android.IDataShare");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3636a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p031c.p032a.p099y.InterfaceC0863a
    /* renamed from: a */
    public final String mo4196a(InterfaceC0863a interfaceC0863a, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("cn.jiguang.android.IDataShare");
            obtain.writeStrongBinder(interfaceC0863a != null ? interfaceC0863a.asBinder() : null);
            obtain.writeString(str);
            this.f3636a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3636a;
    }

    @Override // p031c.p032a.p099y.InterfaceC0863a
    /* renamed from: b */
    public final void mo4197b(String str, String str2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("cn.jiguang.android.IDataShare");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3636a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
