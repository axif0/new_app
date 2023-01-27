package com.journeyapps.barcodescanner;

import android.os.Looper;

/* renamed from: com.journeyapps.barcodescanner.n */
public class C2694n {
    /* renamed from: a */
    public static void m11984a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
