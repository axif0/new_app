package com.bumptech.glide.load.p008o.p009a0;

import com.bumptech.glide.load.p008o.p009a0.C1060m;
import com.bumptech.glide.p029s.C1402k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.o.a0.d */
abstract class C1046d<T extends C1060m> {

    /* renamed from: a */
    private final Queue<T> f4022a = C1402k.m6978e(20);

    C1046d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo5241a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public T mo5244b() {
        T t = (C1060m) this.f4022a.poll();
        return t == null ? mo5241a() : t;
    }

    /* renamed from: c */
    public void mo5245c(T t) {
        if (this.f4022a.size() < 20) {
            this.f4022a.offer(t);
        }
    }
}
