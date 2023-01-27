package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.youtube.player.d */
public final class C2457d {
    /* renamed from: a */
    private static Intent m11135a(Intent intent, Activity activity, String str, int i, boolean z, boolean z2) {
        C2456c.m11128a(intent, activity);
        intent.putExtra("developer_key", str).putExtra("autoplay", z).putExtra("lightbox_mode", z2).putExtra("start_time_millis", i).putExtra("window_has_status_bar", (activity.getWindow().getAttributes().flags & 1024) == 0);
        return intent;
    }

    /* renamed from: b */
    public static Intent m11136b(Activity activity, String str, String str2, int i, boolean z, boolean z2) {
        if (str2 == null) {
            throw new NullPointerException("The videoId cannot be null");
        } else if (str != null) {
            Intent putExtra = new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", str2);
            m11135a(putExtra, activity, str, i, z, z2);
            return putExtra;
        } else {
            throw new NullPointerException("The developerKey cannot be null");
        }
    }
}
