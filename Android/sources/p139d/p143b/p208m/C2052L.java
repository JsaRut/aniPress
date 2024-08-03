package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: d.b.m.L */
/* loaded from: classes.dex */
class C2052L implements Iterator<ModuleHolder> {

    /* renamed from: a */
    int f7469a = 0;

    /* renamed from: b */
    final /* synthetic */ C2053M f7470b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2052L(C2053M c2053m) {
        this.f7470b = c2053m;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7469a < this.f7470b.f7471a.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public ModuleHolder next() {
        List list = this.f7470b.f7471a;
        int i = this.f7469a;
        this.f7469a = i + 1;
        return new ModuleHolder((NativeModule) list.get(i));
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove methods ");
    }
}
