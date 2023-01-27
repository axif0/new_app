package com.bumptech.glide.p022n;

import com.bumptech.glide.p025q.p026j.C1377h;
import com.bumptech.glide.p029s.C1402k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.n.p */
public final class C1345p implements C1334i {

    /* renamed from: f */
    private final Set<C1377h<?>> f4653f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void mo5093a() {
        for (T a : C1402k.m6982i(this.f4653f)) {
            a.mo5093a();
        }
    }

    /* renamed from: e */
    public void mo5094e() {
        for (T e : C1402k.m6982i(this.f4653f)) {
            e.mo5094e();
        }
    }

    /* renamed from: k */
    public void mo5095k() {
        for (T k : C1402k.m6982i(this.f4653f)) {
            k.mo5095k();
        }
    }

    /* renamed from: l */
    public void mo5739l() {
        this.f4653f.clear();
    }

    /* renamed from: m */
    public List<C1377h<?>> mo5740m() {
        return C1402k.m6982i(this.f4653f);
    }

    /* renamed from: n */
    public void mo5741n(C1377h<?> hVar) {
        this.f4653f.add(hVar);
    }

    /* renamed from: o */
    public void mo5742o(C1377h<?> hVar) {
        this.f4653f.remove(hVar);
    }
}
