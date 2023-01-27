package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
public final class C0996e extends IOException {
    public C0996e(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public C0996e(String str) {
        this(str, -1);
    }

    public C0996e(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public C0996e(String str, int i, Throwable th) {
        super(str, th);
    }
}
