package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0245f;
import android.support.v4.media.session.InterfaceC0240a;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0242c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f1048a;

    /* renamed from: b */
    a f1049b;

    /* renamed from: c */
    InterfaceC0240a f1050c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    private static class b implements C0245f.a {

        /* renamed from: a */
        private final WeakReference<AbstractC0242c> f1051a;

        b(AbstractC0242c abstractC0242c) {
            this.f1051a = new WeakReference<>(abstractC0242c);
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: a */
        public void mo1297a() {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1288a();
            }
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: a */
        public void mo1298a(int i, int i2, int i3, int i4, int i5) {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1293a(new C0244e(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: a */
        public void mo1299a(Bundle bundle) {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1290a(bundle);
            }
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: a */
        public void mo1300a(CharSequence charSequence) {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1294a(charSequence);
            }
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: a */
        public void mo1301a(Object obj) {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1291a(MediaMetadataCompat.m1231a(obj));
            }
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: a */
        public void mo1302a(String str, Bundle bundle) {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c != null) {
                if (abstractC0242c.f1050c == null || Build.VERSION.SDK_INT >= 23) {
                    abstractC0242c.m1295a(str, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: a */
        public void mo1303a(List<?> list) {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1296a(MediaSessionCompat.QueueItem.m1273a(list));
            }
        }

        @Override // android.support.v4.media.session.C0245f.a
        /* renamed from: b */
        public void mo1304b(Object obj) {
            AbstractC0242c abstractC0242c = this.f1051a.get();
            if (abstractC0242c == null || abstractC0242c.f1050c != null) {
                return;
            }
            abstractC0242c.m1292a(PlaybackStateCompat.m1277a(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$c */
    /* loaded from: classes.dex */
    public static class c extends InterfaceC0240a.a {

        /* renamed from: a */
        private final WeakReference<AbstractC0242c> f1052a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(AbstractC0242c abstractC0242c) {
            this.f1052a = new WeakReference<>(abstractC0242c);
        }

        /* renamed from: a */
        public void mo1265a() {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1279a(int i) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(9, Integer.valueOf(i), null);
            }
        }

        /* renamed from: a */
        public void mo1266a(Bundle bundle) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(7, bundle, null);
            }
        }

        /* renamed from: a */
        public void mo1267a(MediaMetadataCompat mediaMetadataCompat) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(3, mediaMetadataCompat, null);
            }
        }

        /* renamed from: a */
        public void mo1268a(ParcelableVolumeInfo parcelableVolumeInfo) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(4, parcelableVolumeInfo != null ? new C0244e(parcelableVolumeInfo.f1025a, parcelableVolumeInfo.f1026b, parcelableVolumeInfo.f1027c, parcelableVolumeInfo.f1028d, parcelableVolumeInfo.f1029e) : null, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1280a(PlaybackStateCompat playbackStateCompat) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(2, playbackStateCompat, null);
            }
        }

        /* renamed from: a */
        public void mo1269a(CharSequence charSequence) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1281a(String str, Bundle bundle) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(1, str, bundle);
            }
        }

        /* renamed from: a */
        public void mo1270a(List<MediaSessionCompat.QueueItem> list) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1282a(boolean z) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0240a
        /* renamed from: b */
        public void mo1283b() {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0240a
        /* renamed from: b */
        public void mo1284b(int i) {
            AbstractC0242c abstractC0242c = this.f1052a.get();
            if (abstractC0242c != null) {
                abstractC0242c.m1289a(12, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0240a
        /* renamed from: b */
        public void mo1285b(boolean z) {
        }
    }

    public AbstractC0242c() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 21) {
            obj = C0245f.m1305a(new b(this));
        } else {
            c cVar = new c(this);
            this.f1050c = cVar;
            obj = cVar;
        }
        this.f1048a = obj;
    }

    /* renamed from: a */
    public void m1288a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1289a(int i, Object obj, Bundle bundle) {
        a aVar = this.f1049b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: a */
    public void m1290a(Bundle bundle) {
    }

    /* renamed from: a */
    public void m1291a(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: a */
    public void m1292a(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: a */
    public void m1293a(C0244e c0244e) {
    }

    /* renamed from: a */
    public void m1294a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void m1295a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public void m1296a(List<MediaSessionCompat.QueueItem> list) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m1289a(8, null, null);
    }
}
