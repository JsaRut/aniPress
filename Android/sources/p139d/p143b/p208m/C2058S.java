package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.S */
/* loaded from: classes.dex */
public class C2058S implements Iterable<ModuleHolder> {

    /* renamed from: a */
    final /* synthetic */ Iterator f7495a;

    /* renamed from: b */
    final /* synthetic */ ReactApplicationContext f7496b;

    /* renamed from: c */
    final /* synthetic */ AbstractC2059T f7497c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2058S(AbstractC2059T abstractC2059T, Iterator it, ReactApplicationContext reactApplicationContext) {
        this.f7497c = abstractC2059T;
        this.f7495a = it;
        this.f7496b = reactApplicationContext;
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleHolder> iterator() {
        return new C2057Q(this);
    }
}
