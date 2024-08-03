package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.C0200g;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.AbstractC0242c;
import android.support.v4.media.session.InterfaceC0241b;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 implements InterfaceC0243d {

    /* renamed from: a */
    final Object f1013a;

    /* renamed from: b */
    private final List<AbstractC0242c> f1014b;

    /* renamed from: c */
    private HashMap<AbstractC0242c, BinderC0239a> f1015c;

    /* renamed from: d */
    final MediaSessionCompat.Token f1016d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f1017a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f1017a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f1013a) {
                mediaControllerCompat$MediaControllerImplApi21.f1016d.m1276a(InterfaceC0241b.a.m1287a(C0200g.m884a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f1016d.m1275a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.m1264a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: classes.dex */
    public static class BinderC0239a extends AbstractC0242c.c {
        BinderC0239a(AbstractC0242c abstractC0242c) {
            super(abstractC0242c);
        }

        @Override // android.support.v4.media.session.AbstractC0242c.c, android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1265a() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0242c.c, android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1266a(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0242c.c, android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1267a(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0242c.c, android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1268a(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0242c.c, android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1269a(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0242c.c, android.support.v4.media.session.InterfaceC0240a
        /* renamed from: a */
        public void mo1270a(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    void m1264a() {
        if (this.f1016d.m1274a() == null) {
            return;
        }
        for (AbstractC0242c abstractC0242c : this.f1014b) {
            BinderC0239a binderC0239a = new BinderC0239a(abstractC0242c);
            this.f1015c.put(abstractC0242c, binderC0239a);
            abstractC0242c.f1050c = binderC0239a;
            try {
                this.f1016d.m1274a().mo1286a(binderC0239a);
                abstractC0242c.m1289a(13, null, null);
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
            }
        }
        this.f1014b.clear();
    }
}
