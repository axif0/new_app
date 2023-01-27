package com.google.android.youtube.player.p042f;

import android.content.Context;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.google.android.youtube.player.p042f.C2492o;

/* renamed from: com.google.android.youtube.player.f.b */
public abstract class C2462b {

    /* renamed from: a */
    private static final C2462b f8112a = m11150d();

    /* renamed from: b */
    public static C2462b m11149b() {
        return f8112a;
    }

    /* renamed from: d */
    private static C2462b m11150d() {
        try {
            return (C2462b) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(C2462b.class).newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException(e2);
        } catch (ClassNotFoundException unused) {
            return new C2464d();
        }
    }

    /* renamed from: a */
    public abstract C2461a mo9313a(C2465e eVar, YouTubeThumbnailView youTubeThumbnailView);

    /* renamed from: c */
    public abstract C2465e mo9314c(Context context, String str, C2492o.C2493a aVar, C2492o.C2494b bVar);
}
