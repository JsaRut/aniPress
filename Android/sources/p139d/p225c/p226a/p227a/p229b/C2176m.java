package p139d.p225c.p226a.p227a.p229b;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.b.m */
/* loaded from: classes.dex */
public final class C2176m {

    /* renamed from: a */
    private final AudioManager f7872a;

    /* renamed from: b */
    private final a f7873b;

    /* renamed from: c */
    private final b f7874c;

    /* renamed from: d */
    private C2173j f7875d;

    /* renamed from: e */
    private int f7876e;

    /* renamed from: f */
    private int f7877f;

    /* renamed from: g */
    private float f7878g = 1.0f;

    /* renamed from: h */
    private AudioFocusRequest f7879h;

    /* renamed from: i */
    private boolean f7880i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.b.m$a */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        private a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i != -3) {
                if (i != -2) {
                    if (i == -1) {
                        C2176m.this.f7876e = -1;
                    } else {
                        if (i != 1) {
                            C2638o.m11160d("AudioFocusManager", "Unknown focus change type: " + i);
                            return;
                        }
                        C2176m.this.f7876e = 1;
                    }
                }
                C2176m.this.f7876e = 2;
            } else {
                if (!C2176m.this.m8878i()) {
                    C2176m.this.f7876e = 3;
                }
                C2176m.this.f7876e = 2;
            }
            int i2 = C2176m.this.f7876e;
            if (i2 == -1) {
                C2176m.this.f7874c.mo8622a(-1);
                C2176m.this.m8867b(true);
            } else if (i2 != 0) {
                if (i2 == 1) {
                    C2176m.this.f7874c.mo8622a(1);
                } else if (i2 == 2) {
                    C2176m.this.f7874c.mo8622a(0);
                } else if (i2 != 3) {
                    throw new IllegalStateException("Unknown audio focus state: " + C2176m.this.f7876e);
                }
            }
            float f = C2176m.this.f7876e == 3 ? 0.2f : 1.0f;
            if (C2176m.this.f7878g != f) {
                C2176m.this.f7878g = f;
                C2176m.this.f7874c.mo8621a(f);
            }
        }
    }

    /* renamed from: d.c.a.a.b.m$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo8621a(float f);

        /* renamed from: a */
        void mo8622a(int i);
    }

    public C2176m(Context context, b bVar) {
        this.f7872a = context == null ? null : (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f7874c = bVar;
        this.f7873b = new a();
        this.f7876e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8867b(boolean z) {
        if (this.f7877f == 0 && this.f7876e == 0) {
            return;
        }
        if (this.f7877f != 1 || this.f7876e == -1 || z) {
            if (C2622I.f10916a >= 26) {
                m8874e();
            } else {
                m8873d();
            }
            this.f7876e = 0;
        }
    }

    /* renamed from: c */
    private int m8869c(boolean z) {
        return z ? 1 : -1;
    }

    /* renamed from: c */
    private void m8871c() {
        m8867b(false);
    }

    /* renamed from: d */
    private void m8873d() {
        AudioManager audioManager = this.f7872a;
        C2628e.m11110a(audioManager);
        audioManager.abandonAudioFocus(this.f7873b);
    }

    /* renamed from: e */
    private void m8874e() {
        if (this.f7879h != null) {
            AudioManager audioManager = this.f7872a;
            C2628e.m11110a(audioManager);
            audioManager.abandonAudioFocusRequest(this.f7879h);
        }
    }

    /* renamed from: f */
    private int m8875f() {
        if (this.f7877f == 0) {
            if (this.f7876e != 0) {
                m8867b(true);
            }
            return 1;
        }
        if (this.f7876e == 0) {
            this.f7876e = (C2622I.f10916a >= 26 ? m8877h() : m8876g()) == 1 ? 1 : 0;
        }
        int i = this.f7876e;
        if (i == 0) {
            return -1;
        }
        return i == 2 ? 0 : 1;
    }

    /* renamed from: g */
    private int m8876g() {
        AudioManager audioManager = this.f7872a;
        C2628e.m11110a(audioManager);
        a aVar = this.f7873b;
        C2173j c2173j = this.f7875d;
        C2628e.m11110a(c2173j);
        return audioManager.requestAudioFocus(aVar, C2622I.m11087d(c2173j.f7864d), this.f7877f);
    }

    /* renamed from: h */
    private int m8877h() {
        if (this.f7879h == null || this.f7880i) {
            AudioFocusRequest audioFocusRequest = this.f7879h;
            AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f7877f) : new AudioFocusRequest.Builder(audioFocusRequest);
            boolean m8878i = m8878i();
            C2173j c2173j = this.f7875d;
            C2628e.m11110a(c2173j);
            this.f7879h = builder.setAudioAttributes(c2173j.m8857a()).setWillPauseWhenDucked(m8878i).setOnAudioFocusChangeListener(this.f7873b).build();
            this.f7880i = false;
        }
        AudioManager audioManager = this.f7872a;
        C2628e.m11110a(audioManager);
        return audioManager.requestAudioFocus(this.f7879h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public boolean m8878i() {
        C2173j c2173j = this.f7875d;
        return c2173j != null && c2173j.f7862b == 1;
    }

    /* renamed from: a */
    public float m8879a() {
        return this.f7878g;
    }

    /* renamed from: a */
    public int m8880a(boolean z) {
        if (this.f7872a == null) {
            return 1;
        }
        if (z) {
            return m8875f();
        }
        return -1;
    }

    /* renamed from: a */
    public int m8881a(boolean z, int i) {
        if (this.f7872a == null) {
            return 1;
        }
        if (z) {
            return i == 1 ? m8869c(z) : m8875f();
        }
        m8871c();
        return -1;
    }

    /* renamed from: b */
    public void m8882b() {
        if (this.f7872a == null) {
            return;
        }
        m8867b(true);
    }
}
