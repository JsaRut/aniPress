package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import java.util.Iterator;
import java.util.List;

/* renamed from: d.b.m.M */
/* loaded from: classes.dex */
public class C2053M implements Iterable<ModuleHolder> {

    /* renamed from: a */
    final /* synthetic */ List f7471a;

    public C2053M(List list) {
        this.f7471a = list;
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleHolder> iterator() {
        return new C2052L(this);
    }
}
