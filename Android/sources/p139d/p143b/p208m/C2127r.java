package p139d.p143b.p208m;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.core.InterfaceC1167f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.r */
/* loaded from: classes.dex */
public class C2127r implements Callback {

    /* renamed from: a */
    final /* synthetic */ int f7607a;

    /* renamed from: b */
    final /* synthetic */ String[] f7608b;

    /* renamed from: c */
    final /* synthetic */ int[] f7609c;

    /* renamed from: d */
    final /* synthetic */ C2128s f7610d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2127r(C2128s c2128s, int i, String[] strArr, int[] iArr) {
        this.f7610d = c2128s;
        this.f7607a = i;
        this.f7608b = strArr;
        this.f7609c = iArr;
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        InterfaceC1167f interfaceC1167f;
        InterfaceC1167f interfaceC1167f2;
        interfaceC1167f = this.f7610d.f7615e;
        if (interfaceC1167f != null) {
            interfaceC1167f2 = this.f7610d.f7615e;
            if (interfaceC1167f2.onRequestPermissionsResult(this.f7607a, this.f7608b, this.f7609c)) {
                this.f7610d.f7615e = null;
            }
        }
    }
}
