package p031c.p032a.p099y;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.y.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0864b extends Binder implements InterfaceC0863a {
    public AbstractBinderC0864b() {
        attachInterface(this, "cn.jiguang.android.IDataShare");
    }

    /* renamed from: a */
    public static InterfaceC0863a m4198a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("cn.jiguang.android.IDataShare");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0863a)) ? new C0865c(iBinder) : (InterfaceC0863a) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("cn.jiguang.android.IDataShare");
            IBinder mo4195a = mo4195a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(mo4195a);
            return true;
        }
        if (i == 2) {
            parcel.enforceInterface("cn.jiguang.android.IDataShare");
            mo4197b(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 3) {
            parcel.enforceInterface("cn.jiguang.android.IDataShare");
            Bundle mo4194a = mo4194a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (mo4194a != null) {
                parcel2.writeInt(1);
                mo4194a.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
        if (i != 4) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("cn.jiguang.android.IDataShare");
            return true;
        }
        parcel.enforceInterface("cn.jiguang.android.IDataShare");
        String mo4196a = mo4196a(m4198a(parcel.readStrongBinder()), parcel.readString());
        parcel2.writeNoException();
        parcel2.writeString(mo4196a);
        return true;
    }
}
