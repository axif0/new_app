package android.support.p004v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.p004v4.media.MediaMetadataCompat;
import android.support.p004v4.media.session.C0220a;
import android.support.p004v4.media.session.C0230e;
import android.support.p004v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C0225c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f740a;

    /* renamed from: b */
    C0226a f741b;

    /* renamed from: c */
    C0220a f742c;

    /* renamed from: android.support.v4.media.session.c$a */
    private class C0226a extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$b */
    private static class C0227b implements C0230e.C0231a {

        /* renamed from: a */
        private final WeakReference<C0225c> f743a;

        C0227b(C0225c cVar) {
            this.f743a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo704a(Object obj) {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar != null) {
                cVar.mo697c(MediaMetadataCompat.m752a(obj));
            }
        }

        /* renamed from: b */
        public void mo705b(int i, int i2, int i3, int i4, int i5) {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar != null) {
                cVar.mo694a(new C0229d(i, i2, i3, i4, i5));
            }
        }

        /* renamed from: c */
        public void mo706c(Object obj) {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar != null && cVar.f742c == null) {
                cVar.mo698d(PlaybackStateCompat.m806a(obj));
            }
        }

        /* renamed from: d */
        public void mo707d(String str, Bundle bundle) {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f742c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.mo702h(str, bundle);
            }
        }

        /* renamed from: i */
        public void mo708i(CharSequence charSequence) {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar != null) {
                cVar.mo700f(charSequence);
            }
        }

        /* renamed from: j */
        public void mo709j() {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar != null) {
                cVar.mo701g();
            }
        }

        /* renamed from: p */
        public void mo710p(Bundle bundle) {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar != null) {
                cVar.mo695b(bundle);
            }
        }

        /* renamed from: q */
        public void mo711q(List<?> list) {
            C0225c cVar = (C0225c) this.f743a.get();
            if (cVar != null) {
                cVar.mo699e(MediaSessionCompat.QueueItem.m794b(list));
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    private static class C0228c extends C0220a.C0221a {

        /* renamed from: a */
        private final WeakReference<C0225c> f744a;

        C0228c(C0225c cVar) {
            this.f744a = new WeakReference<>(cVar);
        }

        /* renamed from: B0 */
        public void mo683B0(boolean z) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        /* renamed from: K */
        public void mo633K(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        /* renamed from: M0 */
        public void mo684M0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(2, playbackStateCompat, (Bundle) null);
            }
        }

        /* renamed from: N0 */
        public void mo685N0(String str, Bundle bundle) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(1, str, bundle);
            }
        }

        /* renamed from: R0 */
        public void mo634R0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(4, parcelableVolumeInfo != null ? new C0229d(parcelableVolumeInfo.f717f, parcelableVolumeInfo.f718g, parcelableVolumeInfo.f719h, parcelableVolumeInfo.f720i, parcelableVolumeInfo.f721j) : null, (Bundle) null);
            }
        }

        /* renamed from: f0 */
        public void mo686f0(int i) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: g0 */
        public void mo687g0() throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(13, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: i */
        public void mo635i(CharSequence charSequence) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(6, charSequence, (Bundle) null);
            }
        }

        /* renamed from: j */
        public void mo636j() throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(8, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: m */
        public void mo688m(int i) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: p */
        public void mo637p(Bundle bundle) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(7, bundle, (Bundle) null);
            }
        }

        /* renamed from: q */
        public void mo638q(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            C0225c cVar = (C0225c) this.f744a.get();
            if (cVar != null) {
                cVar.mo703i(5, list, (Bundle) null);
            }
        }

        /* renamed from: z */
        public void mo689z(boolean z) throws RemoteException {
        }
    }

    public C0225c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f740a = C0230e.m858a(new C0227b(this));
        } else {
            this.f742c = new C0228c(this);
        }
    }

    /* renamed from: a */
    public void mo694a(C0229d dVar) {
    }

    /* renamed from: b */
    public void mo695b(Bundle bundle) {
    }

    public void binderDied() {
        mo703i(8, (Object) null, (Bundle) null);
    }

    /* renamed from: c */
    public void mo697c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void mo698d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void mo699e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void mo700f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void mo701g() {
    }

    /* renamed from: h */
    public void mo702h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo703i(int i, Object obj, Bundle bundle) {
        C0226a aVar = this.f741b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
