package android.support.p004v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaMetadataCompat;
import android.support.p004v4.media.session.C0222b;
import android.support.p004v4.media.session.C0225c;
import android.support.p004v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0570d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f706a;

    /* renamed from: b */
    private final List<C0225c> f707b;

    /* renamed from: c */
    private HashMap<C0225c, C0213a> f708c;

    /* renamed from: d */
    final MediaSessionCompat.Token f709d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: f */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f710f;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f710f.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f706a) {
                    mediaControllerCompat$MediaControllerImplApi21.f709d.mo653b(C0222b.C0223a.m826n(C0570d.m2655a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f709d.mo654c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.mo631a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0213a extends C0225c.C0228c {
        C0213a(C0225c cVar) {
            super(cVar);
        }

        /* renamed from: K */
        public void mo633K(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: R0 */
        public void mo634R0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: i */
        public void mo635i(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: j */
        public void mo636j() throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: p */
        public void mo637p(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: q */
        public void mo638q(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo631a() {
        if (this.f709d.mo652a() != null) {
            for (C0225c next : this.f707b) {
                C0213a aVar = new C0213a(next);
                this.f708c.put(next, aVar);
                next.f742c = aVar;
                try {
                    this.f709d.mo652a().mo692G(aVar);
                    next.mo703i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f707b.clear();
        }
    }
}
