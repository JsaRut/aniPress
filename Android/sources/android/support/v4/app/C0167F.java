package android.support.v4.app;

import android.arch.lifecycle.C0159s;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.app.F */
/* loaded from: classes.dex */
public final class C0167F implements Parcelable {
    public static final Parcelable.Creator<C0167F> CREATOR = new C0166E();

    /* renamed from: a */
    final String f625a;

    /* renamed from: b */
    final int f626b;

    /* renamed from: c */
    final boolean f627c;

    /* renamed from: d */
    final int f628d;

    /* renamed from: e */
    final int f629e;

    /* renamed from: f */
    final String f630f;

    /* renamed from: g */
    final boolean f631g;

    /* renamed from: h */
    final boolean f632h;

    /* renamed from: i */
    final Bundle f633i;

    /* renamed from: j */
    final boolean f634j;

    /* renamed from: k */
    Bundle f635k;

    /* renamed from: l */
    ComponentCallbacksC0205l f636l;

    public C0167F(Parcel parcel) {
        this.f625a = parcel.readString();
        this.f626b = parcel.readInt();
        this.f627c = parcel.readInt() != 0;
        this.f628d = parcel.readInt();
        this.f629e = parcel.readInt();
        this.f630f = parcel.readString();
        this.f631g = parcel.readInt() != 0;
        this.f632h = parcel.readInt() != 0;
        this.f633i = parcel.readBundle();
        this.f634j = parcel.readInt() != 0;
        this.f635k = parcel.readBundle();
    }

    public C0167F(ComponentCallbacksC0205l componentCallbacksC0205l) {
        this.f625a = componentCallbacksC0205l.getClass().getName();
        this.f626b = componentCallbacksC0205l.f811g;
        this.f627c = componentCallbacksC0205l.f819o;
        this.f628d = componentCallbacksC0205l.f830z;
        this.f629e = componentCallbacksC0205l.f783A;
        this.f630f = componentCallbacksC0205l.f784B;
        this.f631g = componentCallbacksC0205l.f787E;
        this.f632h = componentCallbacksC0205l.f786D;
        this.f633i = componentCallbacksC0205l.f813i;
        this.f634j = componentCallbacksC0205l.f785C;
    }

    /* renamed from: a */
    public ComponentCallbacksC0205l m761a(AbstractC0211r abstractC0211r, AbstractC0209p abstractC0209p, ComponentCallbacksC0205l componentCallbacksC0205l, C0161A c0161a, C0159s c0159s) {
        if (this.f636l == null) {
            Context m1053c = abstractC0211r.m1053c();
            Bundle bundle = this.f633i;
            if (bundle != null) {
                bundle.setClassLoader(m1053c.getClassLoader());
            }
            this.f636l = abstractC0209p != null ? abstractC0209p.mo902a(m1053c, this.f625a, this.f633i) : ComponentCallbacksC0205l.m905a(m1053c, this.f625a, this.f633i);
            Bundle bundle2 = this.f635k;
            if (bundle2 != null) {
                bundle2.setClassLoader(m1053c.getClassLoader());
                this.f636l.f808d = this.f635k;
            }
            this.f636l.m937a(this.f626b, componentCallbacksC0205l);
            ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f636l;
            componentCallbacksC0205l2.f819o = this.f627c;
            componentCallbacksC0205l2.f821q = true;
            componentCallbacksC0205l2.f830z = this.f628d;
            componentCallbacksC0205l2.f783A = this.f629e;
            componentCallbacksC0205l2.f784B = this.f630f;
            componentCallbacksC0205l2.f787E = this.f631g;
            componentCallbacksC0205l2.f786D = this.f632h;
            componentCallbacksC0205l2.f785C = this.f634j;
            componentCallbacksC0205l2.f824t = abstractC0211r.f872e;
            if (LayoutInflaterFactory2C0219z.f887a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f636l);
            }
        }
        ComponentCallbacksC0205l componentCallbacksC0205l3 = this.f636l;
        componentCallbacksC0205l3.f827w = c0161a;
        componentCallbacksC0205l3.f828x = c0159s;
        return componentCallbacksC0205l3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f625a);
        parcel.writeInt(this.f626b);
        parcel.writeInt(this.f627c ? 1 : 0);
        parcel.writeInt(this.f628d);
        parcel.writeInt(this.f629e);
        parcel.writeString(this.f630f);
        parcel.writeInt(this.f631g ? 1 : 0);
        parcel.writeInt(this.f632h ? 1 : 0);
        parcel.writeBundle(this.f633i);
        parcel.writeInt(this.f634j ? 1 : 0);
        parcel.writeBundle(this.f635k);
    }
}
