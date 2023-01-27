package android.support.p004v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0230e {

    /* renamed from: android.support.v4.media.session.e$a */
    public interface C0231a {
        /* renamed from: a */
        void mo704a(Object obj);

        /* renamed from: b */
        void mo705b(int i, int i2, int i3, int i4, int i5);

        /* renamed from: c */
        void mo706c(Object obj);

        /* renamed from: d */
        void mo707d(String str, Bundle bundle);

        /* renamed from: i */
        void mo708i(CharSequence charSequence);

        /* renamed from: j */
        void mo709j();

        /* renamed from: p */
        void mo710p(Bundle bundle);

        /* renamed from: q */
        void mo711q(List<?> list);
    }

    /* renamed from: android.support.v4.media.session.e$b */
    static class C0232b<T extends C0231a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f745a;

        public C0232b(T t) {
            this.f745a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f745a.mo705b(playbackInfo.getPlaybackType(), C0233c.m868b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m792a(bundle);
            this.f745a.mo710p(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f745a.mo704a(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f745a.mo706c(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f745a.mo711q(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f745a.mo708i(charSequence);
        }

        public void onSessionDestroyed() {
            this.f745a.mo709j();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m792a(bundle);
            this.f745a.mo707d(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    public static class C0233c {
        /* renamed from: a */
        public static AudioAttributes m867a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m868b(Object obj) {
            return m869c(m867a(obj));
        }

        /* renamed from: c */
        private static int m869c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
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
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m858a(C0231a aVar) {
        return new C0232b(aVar);
    }
}
