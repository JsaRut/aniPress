package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.i */
/* loaded from: classes.dex */
public class C2112i implements Iterable<ModuleHolder> {

    /* renamed from: a */
    final /* synthetic */ List f7589a;

    /* renamed from: b */
    final /* synthetic */ Map f7590b;

    /* renamed from: c */
    final /* synthetic */ AbstractC2114j f7591c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2112i(AbstractC2114j abstractC2114j, List list, Map map) {
        this.f7591c = abstractC2114j;
        this.f7589a = list;
        this.f7590b = map;
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleHolder> iterator() {
        return new C2110h(this);
    }
}
