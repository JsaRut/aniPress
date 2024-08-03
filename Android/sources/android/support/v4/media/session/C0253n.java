package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.n */
/* loaded from: classes.dex */
class C0253n {

    /* renamed from: android.support.v4.media.session.n$a */
    /* loaded from: classes.dex */
    static final class a {
        /* renamed from: a */
        public static String m1320a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static Bundle m1321b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        /* renamed from: c */
        public static int m1322c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static CharSequence m1323d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }
    }

    /* renamed from: a */
    public static long m1311a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: b */
    public static long m1312b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: c */
    public static long m1313c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static List<Object> m1314d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: e */
    public static CharSequence m1315e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: f */
    public static long m1316f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: g */
    public static float m1317g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: h */
    public static long m1318h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: i */
    public static int m1319i(Object obj) {
        return ((PlaybackState) obj).getState();
    }
}
