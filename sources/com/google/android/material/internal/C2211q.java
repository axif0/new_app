package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.q */
public class C2211q extends ImageButton {

    /* renamed from: f */
    private int f7319f;

    /* renamed from: b */
    public final void mo8613b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f7319f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7319f;
    }

    public void setVisibility(int i) {
        mo8613b(i, true);
    }
}
