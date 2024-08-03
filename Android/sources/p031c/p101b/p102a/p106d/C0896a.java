package p031c.p101b.p102a.p106d;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: c.b.a.d.a */
/* loaded from: classes.dex */
public class C0896a implements Serializable {

    /* renamed from: a */
    public String f3804a;

    /* renamed from: b */
    public String f3805b;

    public C0896a() {
    }

    public C0896a(C0899d c0899d) {
        this.f3804a = c0899d.f3837c;
        this.f3805b = c0899d.f3843f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0896a)) {
            return false;
        }
        C0896a c0896a = (C0896a) obj;
        if (TextUtils.isEmpty(this.f3804a) || TextUtils.isEmpty(c0896a.f3804a) || !TextUtils.equals(this.f3804a, c0896a.f3804a)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f3805b) && TextUtils.isEmpty(c0896a.f3805b)) {
            return true;
        }
        return (TextUtils.isEmpty(this.f3805b) || TextUtils.isEmpty(c0896a.f3805b) || !TextUtils.equals(this.f3805b, c0896a.f3805b)) ? false : true;
    }

    public String toString() {
        return "msg_id = " + this.f3804a + ",  override_msg_id = " + this.f3805b;
    }
}
