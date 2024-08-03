package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.f */
/* loaded from: classes.dex */
class C0245f {

    /* renamed from: android.support.v4.media.session.f$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo1297a();

        /* renamed from: a */
        void mo1298a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo1299a(Bundle bundle);

        /* renamed from: a */
        void mo1300a(CharSequence charSequence);

        /* renamed from: a */
        void mo1301a(Object obj);

        /* renamed from: a */
        void mo1302a(String str, Bundle bundle);

        /* renamed from: a */
        void mo1303a(List<?> list);

        /* renamed from: b */
        void mo1304b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.f$b */
    /* loaded from: classes.dex */
    static class b<T extends a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f1058a;

        public b(T t) {
            this.f1058a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f1058a.mo1298a(playbackInfo.getPlaybackType(), c.m1308b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m1271a(bundle);
            this.f1058a.mo1299a(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1058a.mo1301a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1058a.mo1304b(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f1058a.mo1303a(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1058a.mo1300a(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f1058a.mo1297a();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m1271a(bundle);
            this.f1058a.mo1302a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.f$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        private static int m1306a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m1307a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m1308b(Object obj) {
            return m1306a(m1307a(obj));
        }
    }

    /* renamed from: a */
    public static Object m1305a(a aVar) {
        return new b(aVar);
    }
}
