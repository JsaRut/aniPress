package p139d.p225c.p226a.p227a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p139d.p225c.p226a.p227a.p229b.C2157B;
import p139d.p225c.p226a.p227a.p229b.C2174k;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2179p;
import p139d.p225c.p226a.p227a.p231d.C2219s;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p244g.InterfaceC2343e;
import p139d.p225c.p226a.p227a.p245h.C2396h;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2395g;
import p139d.p225c.p226a.p227a.p259k.C2565m;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2564l;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p271o.C2667o;
import p139d.p225c.p226a.p227a.p271o.InterfaceC2672t;
import p139d.p225c.p226a.p227a.p271o.p272a.C2653b;

/* renamed from: d.c.a.a.i */
/* loaded from: classes.dex */
public class C2397i implements InterfaceC2146K {

    /* renamed from: a */
    private final Context f9376a;

    /* renamed from: b */
    private final InterfaceC2215o<C2219s> f9377b;

    /* renamed from: c */
    private final int f9378c;

    /* renamed from: d */
    private final long f9379d;

    public C2397i(Context context) {
        this(context, 0);
    }

    public C2397i(Context context, int i) {
        this(context, i, 5000L);
    }

    public C2397i(Context context, int i, long j) {
        this.f9376a = context;
        this.f9378c = i;
        this.f9379d = j;
        this.f9377b = null;
    }

    /* renamed from: a */
    protected void m9862a(Context context, int i, ArrayList<InterfaceC2143H> arrayList) {
        arrayList.add(new C2653b());
    }

    /* renamed from: a */
    protected void m9863a(Context context, Handler handler, int i, ArrayList<InterfaceC2143H> arrayList) {
    }

    /* renamed from: a */
    protected void m9864a(Context context, InterfaceC2215o<C2219s> interfaceC2215o, long j, Handler handler, InterfaceC2672t interfaceC2672t, int i, ArrayList<InterfaceC2143H> arrayList) {
        arrayList.add(new C2667o(context, InterfaceC2343e.f9252a, j, interfaceC2215o, false, handler, interfaceC2672t, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            arrayList.add(size, (InterfaceC2143H) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, InterfaceC2672t.class, Integer.TYPE).newInstance(true, Long.valueOf(j), handler, interfaceC2672t, 50));
            C2638o.m11159c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating VP9 extension", e2);
        }
    }

    /* renamed from: a */
    protected void m9865a(Context context, InterfaceC2215o<C2219s> interfaceC2215o, InterfaceC2178o[] interfaceC2178oArr, Handler handler, InterfaceC2179p interfaceC2179p, int i, ArrayList<InterfaceC2143H> arrayList) {
        int i2;
        int i3;
        arrayList.add(new C2157B(context, InterfaceC2343e.f9252a, interfaceC2215o, false, handler, interfaceC2179p, C2174k.m8859a(context), interfaceC2178oArr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (InterfaceC2143H) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC2179p.class, InterfaceC2178o[].class).newInstance(handler, interfaceC2179p, interfaceC2178oArr));
                    C2638o.m11159c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating Opus extension", e2);
            }
        } catch (ClassNotFoundException unused2) {
            i2 = size;
        }
        try {
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (InterfaceC2143H) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC2179p.class, InterfaceC2178o[].class).newInstance(handler, interfaceC2179p, interfaceC2178oArr));
                    C2638o.m11159c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                }
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FLAC extension", e3);
            }
        } catch (ClassNotFoundException unused4) {
            i3 = i2;
        }
        try {
            arrayList.add(i3, (InterfaceC2143H) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC2179p.class, InterfaceC2178o[].class).newInstance(handler, interfaceC2179p, interfaceC2178oArr));
            C2638o.m11159c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused5) {
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e4);
        }
    }

    /* renamed from: a */
    protected void m9866a(Context context, InterfaceC2395g interfaceC2395g, Looper looper, int i, ArrayList<InterfaceC2143H> arrayList) {
        arrayList.add(new C2396h(interfaceC2395g, looper));
    }

    /* renamed from: a */
    protected void m9867a(Context context, InterfaceC2564l interfaceC2564l, Looper looper, int i, ArrayList<InterfaceC2143H> arrayList) {
        arrayList.add(new C2565m(interfaceC2564l, looper));
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2146K
    /* renamed from: a */
    public InterfaceC2143H[] mo8578a(Handler handler, InterfaceC2672t interfaceC2672t, InterfaceC2179p interfaceC2179p, InterfaceC2564l interfaceC2564l, InterfaceC2395g interfaceC2395g, InterfaceC2215o<C2219s> interfaceC2215o) {
        InterfaceC2215o<C2219s> interfaceC2215o2 = interfaceC2215o == null ? this.f9377b : interfaceC2215o;
        ArrayList<InterfaceC2143H> arrayList = new ArrayList<>();
        InterfaceC2215o<C2219s> interfaceC2215o3 = interfaceC2215o2;
        m9864a(this.f9376a, interfaceC2215o3, this.f9379d, handler, interfaceC2672t, this.f9378c, arrayList);
        m9865a(this.f9376a, interfaceC2215o3, m9868a(), handler, interfaceC2179p, this.f9378c, arrayList);
        m9867a(this.f9376a, interfaceC2564l, handler.getLooper(), this.f9378c, arrayList);
        m9866a(this.f9376a, interfaceC2395g, handler.getLooper(), this.f9378c, arrayList);
        m9862a(this.f9376a, this.f9378c, arrayList);
        m9863a(this.f9376a, handler, this.f9378c, arrayList);
        return (InterfaceC2143H[]) arrayList.toArray(new InterfaceC2143H[arrayList.size()]);
    }

    /* renamed from: a */
    protected InterfaceC2178o[] m9868a() {
        return new InterfaceC2178o[0];
    }
}
