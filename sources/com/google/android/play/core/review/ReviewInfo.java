package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ReviewInfo implements Parcelable {
    /* renamed from: b */
    public static ReviewInfo m11098b(PendingIntent pendingIntent) {
        return new C2442c(pendingIntent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract PendingIntent mo9282a();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo9282a(), 0);
    }
}
