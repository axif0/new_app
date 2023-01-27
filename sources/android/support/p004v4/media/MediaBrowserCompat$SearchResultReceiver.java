package android.support.p004v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p004v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p082e.p083a.p084a.p085a.C3119b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends C3119b {

    /* renamed from: h */
    private final String f681h;

    /* renamed from: i */
    private final Bundle f682i;

    /* renamed from: j */
    private final C0207c f683j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo586a(int i, Bundle bundle) {
        MediaSessionCompat.m792a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f683j.mo629a(this.f681h, this.f682i);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f683j.mo630b(this.f681h, this.f682i, arrayList);
    }
}
