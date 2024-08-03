package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.r */
/* loaded from: classes.dex */
public class C1005r implements InterfaceC1011x {

    /* renamed from: a */
    private static C1005r f4163a;

    private C1005r() {
    }

    /* renamed from: c */
    public static synchronized C1005r m5044c() {
        C1005r c1005r;
        synchronized (C1005r.class) {
            if (f4163a == null) {
                f4163a = new C1005r();
            }
            c1005r = f4163a;
        }
        return c1005r;
    }

    @Override // com.facebook.imagepipeline.memory.InterfaceC1011x
    /* renamed from: a */
    public void mo5045a() {
    }

    @Override // com.facebook.imagepipeline.memory.InterfaceC1011x
    /* renamed from: a */
    public void mo5046a(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.InterfaceC1011x
    /* renamed from: a */
    public void mo5047a(AbstractC0988a abstractC0988a) {
    }

    @Override // com.facebook.imagepipeline.memory.InterfaceC1011x
    /* renamed from: b */
    public void mo5048b() {
    }

    @Override // com.facebook.imagepipeline.memory.InterfaceC1011x
    /* renamed from: b */
    public void mo5049b(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.InterfaceC1011x
    /* renamed from: c */
    public void mo5050c(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.InterfaceC1011x
    /* renamed from: d */
    public void mo5051d(int i) {
    }
}
