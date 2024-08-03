package p031c.p032a.p072p.p073a.p077c;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p075b.AbstractC0716h;
import p031c.p032a.p072p.p073a.p075b.EnumC0714f;
import p031c.p032a.p072p.p073a.p075b.InterfaceC0715g;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0763e;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.c.b */
/* loaded from: classes.dex */
public final class C0723b implements InterfaceC0722a {

    /* renamed from: a */
    private AbstractC0716h f3267a;

    /* renamed from: b */
    private int f3268b;

    /* renamed from: c */
    private int f3269c = 1;

    /* renamed from: d */
    private int f3270d;

    @Override // p031c.p032a.p072p.p073a.p077c.InterfaceC0722a
    /* renamed from: a */
    public final JSONObject mo3661a() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        C0830f.m4050a(jSONObject, (String) null);
        try {
            if (this.f3267a != null) {
                JSONObject m3807a = C0763e.m3807a((Map) this.f3267a.m3643c());
                if (C0763e.m3809a(m3807a)) {
                    m3807a = new JSONObject();
                }
                for (Class<?> cls = this.f3267a.getClass(); cls != null; cls = cls.getSuperclass()) {
                    C0732b.m3716a("EventEntity", "acls =" + cls.getCanonicalName());
                    boolean equals = cls.getCanonicalName().equals(AbstractC0716h.class.getCanonicalName());
                    for (Field field : cls.getDeclaredFields()) {
                        field.setAccessible(true);
                        InterfaceC0715g interfaceC0715g = (InterfaceC0715g) field.getAnnotation(InterfaceC0715g.class);
                        if (interfaceC0715g == null) {
                            str2 = "EVENTFIELD  is null:" + field.getName();
                        } else {
                            String value = interfaceC0715g.value();
                            C0732b.m3716a("EventEntity", "field annotation name :" + value);
                            if (!TextUtils.isEmpty(value)) {
                                Object obj = field.get(this.f3267a);
                                if (obj == null) {
                                    C0732b.m3716a("EventEntity", "o is null with field name:" + field.getName() + ", type:" + field.getType());
                                    if (field.getType().equals(String.class)) {
                                        C0732b.m3716a("EventEntity", "o type is String");
                                        obj = "";
                                    }
                                }
                                if (!(obj instanceof Map)) {
                                    if (equals) {
                                        try {
                                            jSONObject.put(value, obj);
                                        } catch (Exception unused) {
                                            str = "unexcepted - unsupport type:" + obj.getClass().getCanonicalName();
                                            C0732b.m3723f("EventEntity", str);
                                            str2 = "event field value is not map:" + field.getName();
                                            C0732b.m3716a("EventEntity", str2);
                                        }
                                    } else {
                                        try {
                                            if (obj instanceof EnumC0714f) {
                                                m3807a.put(value, ((EnumC0714f) obj).name());
                                            } else {
                                                m3807a.put(value, obj);
                                            }
                                        } catch (Exception unused2) {
                                            str = "unexcepted - unsupport type:" + obj.getClass().getCanonicalName();
                                            C0732b.m3723f("EventEntity", str);
                                            str2 = "event field value is not map:" + field.getName();
                                            C0732b.m3716a("EventEntity", str2);
                                        }
                                    }
                                    str2 = "event field value is not map:" + field.getName();
                                } else if (equals) {
                                    C0763e.m3808a(m3807a, (Map) obj);
                                }
                            }
                        }
                        C0732b.m3716a("EventEntity", str2);
                    }
                    if (equals) {
                        break;
                    }
                }
                jSONObject.put("attributes", m3807a);
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void m3662a(int i) {
        this.f3268b = 1;
    }

    /* renamed from: a */
    public final void m3663a(AbstractC0716h abstractC0716h) {
        this.f3267a = abstractC0716h;
    }

    /* renamed from: b */
    public final AbstractC0716h m3664b() {
        return this.f3267a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0723b.class != obj.getClass()) {
            return false;
        }
        return this.f3267a.equals(((C0723b) obj).f3267a);
    }

    public final int hashCode() {
        return this.f3267a.hashCode();
    }

    public final String toString() {
        return "EventEntity{event=" + this.f3267a + ", sum=" + this.f3269c + ", du=" + this.f3270d + ", type=" + this.f3268b + '}';
    }
}
