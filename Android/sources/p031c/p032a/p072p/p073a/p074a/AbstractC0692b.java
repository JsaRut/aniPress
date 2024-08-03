package p031c.p032a.p072p.p073a.p074a;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p077c.InterfaceC0722a;
import p031c.p032a.p072p.p073a.p080f.p087g.C0763e;

/* renamed from: c.a.p.a.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0692b {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static JSONArray m3565a(List<? extends InterfaceC0722a> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (InterfaceC0722a interfaceC0722a : list) {
            if (interfaceC0722a != null) {
                JSONObject mo3661a = interfaceC0722a.mo3661a();
                if (!C0763e.m3809a(mo3661a)) {
                    jSONArray.put(mo3661a);
                }
            }
        }
        if (C0763e.m3809a(jSONArray)) {
            return null;
        }
        return jSONArray;
    }

    /* renamed from: a */
    public abstract Object mo3566a();
}
