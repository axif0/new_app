package com.bumptech.glide;

import com.bumptech.glide.C0982k;
import com.bumptech.glide.p025q.p027k.C1381a;
import com.bumptech.glide.p025q.p027k.C1385c;

/* renamed from: com.bumptech.glide.k */
public abstract class C0982k<CHILD extends C0982k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: f */
    private C1385c<? super TranscodeType> f3902f = C1381a.m6930b();

    /* renamed from: b */
    public final CHILD clone() {
        try {
            return (C0982k) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C1385c<? super TranscodeType> mo5118c() {
        return this.f3902f;
    }
}
