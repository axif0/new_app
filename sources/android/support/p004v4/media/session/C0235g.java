package android.support.p004v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.g */
class C0235g {

    /* renamed from: android.support.v4.media.session.g$a */
    static final class C0236a {
        /* renamed from: a */
        public static String m881a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static Bundle m882b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        /* renamed from: c */
        public static int m883c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static CharSequence m884d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }
    }

    /* renamed from: a */
    public static long m872a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: b */
    public static long m873b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: c */
    public static long m874c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static List<Object> m875d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: e */
    public static CharSequence m876e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: f */
    public static long m877f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: g */
    public static float m878g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: h */
    public static long m879h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: i */
    public static int m880i(Object obj) {
        return ((PlaybackState) obj).getState();
    }
}
