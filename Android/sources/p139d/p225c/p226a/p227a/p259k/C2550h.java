package p139d.p225c.p226a.p227a.p259k;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p259k.p260a.C2519a;
import p139d.p225c.p226a.p227a.p259k.p260a.C2521c;
import p139d.p225c.p226a.p227a.p259k.p261b.C2528a;
import p139d.p225c.p226a.p227a.p259k.p262c.C2532a;
import p139d.p225c.p226a.p227a.p259k.p263d.C2535a;
import p139d.p225c.p226a.p227a.p259k.p264e.C2538a;
import p139d.p225c.p226a.p227a.p259k.p265f.C2541a;
import p139d.p225c.p226a.p227a.p259k.p266g.C2548a;
import p139d.p225c.p226a.p227a.p259k.p267h.C2552b;
import p139d.p225c.p226a.p227a.p259k.p267h.C2558h;

/* renamed from: d.c.a.a.k.h */
/* loaded from: classes.dex */
class C2550h implements InterfaceC2561i {
    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2561i
    /* renamed from: a */
    public boolean mo10715a(C2676s c2676s) {
        String str = c2676s.f11182g;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2561i
    /* renamed from: b */
    public InterfaceC2540f mo10716b(C2676s c2676s) {
        char c2;
        String str = c2676s.f11182g;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals("application/dvbsubs")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248334819:
                if (str.equals("application/pgs")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1026075066:
                if (str.equals("application/x-mp4-vtt")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (str.equals("text/vtt")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 691401887:
                if (str.equals("application/x-quicktime-tx3g")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 822864842:
                if (str.equals("text/x-ssa")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 930165504:
                if (str.equals("application/x-mp4-cea-608")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1566015601:
                if (str.equals("application/cea-608")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1566016562:
                if (str.equals("application/cea-708")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1668750253:
                if (str.equals("application/x-subrip")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1693976202:
                if (str.equals("application/ttml+xml")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new C2558h();
            case 1:
                return new C2535a(c2676s.f11184i);
            case 2:
                return new C2552b();
            case 3:
                return new C2541a();
            case 4:
                return new C2538a();
            case 5:
                return new C2548a(c2676s.f11184i);
            case 6:
            case 7:
                return new C2519a(c2676s.f11182g, c2676s.f11174A);
            case '\b':
                return new C2521c(c2676s.f11174A, c2676s.f11184i);
            case '\t':
                return new C2528a(c2676s.f11184i);
            case '\n':
                return new C2532a();
            default:
                throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
        }
    }
}
