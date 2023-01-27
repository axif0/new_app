package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.p041a3.C2321a;
import p148g.p189d.p190a.p271e.p272a.p280g.C5164q;

/* renamed from: com.google.android.play.core.assetpacks.a */
public class C2317a extends C5164q {
    C2317a(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), C2321a.m10800a(i)}));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
