package com.google.android.play.core.review;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.review.c */
final class C2442c extends ReviewInfo {

    /* renamed from: f */
    private final PendingIntent f8070f;

    C2442c(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.f8070f = pendingIntent;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo9282a() {
        return this.f8070f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f8070f.equals(((ReviewInfo) obj).mo9282a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f8070f.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8070f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
