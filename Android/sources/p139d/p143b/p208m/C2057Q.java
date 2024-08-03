package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.Map;
import p139d.p143b.p208m.AbstractC2059T;

/* renamed from: d.b.m.Q */
/* loaded from: classes.dex */
class C2057Q implements Iterator<ModuleHolder> {

    /* renamed from: a */
    final /* synthetic */ C2058S f7494a;

    public C2057Q(C2058S c2058s) {
        this.f7494a = c2058s;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7494a.f7495a.hasNext();
    }

    @Override // java.util.Iterator
    public ModuleHolder next() {
        Map.Entry entry = (Map.Entry) this.f7494a.f7495a.next();
        String str = (String) entry.getKey();
        ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
        C2058S c2058s = this.f7494a;
        return new ModuleHolder(reactModuleInfo, new AbstractC2059T.a(str, c2058s.f7496b));
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
}
