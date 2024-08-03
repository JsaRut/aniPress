package p139d.p143b.p169g.p175c;

import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p169g.p181h.InterfaceC1815a;

/* renamed from: d.b.g.c.d */
/* loaded from: classes.dex */
public class C1776d<IMAGE> implements InterfaceC1694m<InterfaceC1736e<IMAGE>> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1815a f6477a;

    /* renamed from: b */
    final /* synthetic */ String f6478b;

    /* renamed from: c */
    final /* synthetic */ Object f6479c;

    /* renamed from: d */
    final /* synthetic */ Object f6480d;

    /* renamed from: e */
    final /* synthetic */ AbstractC1777e.a f6481e;

    /* renamed from: f */
    final /* synthetic */ AbstractC1777e f6482f;

    public C1776d(AbstractC1777e abstractC1777e, InterfaceC1815a interfaceC1815a, String str, Object obj, Object obj2, AbstractC1777e.a aVar) {
        this.f6482f = abstractC1777e;
        this.f6477a = interfaceC1815a;
        this.f6478b = str;
        this.f6479c = obj;
        this.f6480d = obj2;
        this.f6481e = aVar;
    }

    @Override // p139d.p143b.p148c.p152d.InterfaceC1694m
    public InterfaceC1736e<IMAGE> get() {
        return this.f6482f.mo7239a(this.f6477a, this.f6478b, this.f6479c, this.f6480d, this.f6481e);
    }

    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        m6961a.m6967a("request", this.f6479c.toString());
        return m6961a.toString();
    }
}
