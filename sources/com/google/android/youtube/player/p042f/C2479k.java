package com.google.android.youtube.player.p042f;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.youtube.player.f.k */
public final class C2479k {

    /* renamed from: a */
    public final String f8116a;

    /* renamed from: b */
    public final String f8117b;

    /* renamed from: c */
    public final String f8118c;

    /* renamed from: d */
    public final String f8119d;

    /* renamed from: e */
    public final String f8120e;

    /* renamed from: f */
    public final String f8121f;

    /* renamed from: g */
    public final String f8122g;

    /* renamed from: h */
    public final String f8123h;

    /* renamed from: i */
    public final String f8124i;

    public C2479k(Context context) {
        Resources resources = context.getResources();
        Map<String, String> a = C2495p.m11224a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        String str = a.get("error_initializing_player");
        this.f8116a = a.get("get_youtube_app_title");
        this.f8117b = a.get("get_youtube_app_text");
        this.f8118c = a.get("get_youtube_app_action");
        this.f8119d = a.get("enable_youtube_app_title");
        this.f8120e = a.get("enable_youtube_app_text");
        this.f8121f = a.get("enable_youtube_app_action");
        this.f8122g = a.get("update_youtube_app_title");
        this.f8123h = a.get("update_youtube_app_text");
        this.f8124i = a.get("update_youtube_app_action");
    }
}
