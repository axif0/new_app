package com.bumptech.glide.p022n;

import com.bumptech.glide.p029s.C1402k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.n.a */
class C1324a implements C1333h {

    /* renamed from: a */
    private final Set<C1334i> f4621a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f4622b;

    /* renamed from: c */
    private boolean f4623c;

    C1324a() {
    }

    /* renamed from: a */
    public void mo5695a(C1334i iVar) {
        this.f4621a.add(iVar);
        if (this.f4623c) {
            iVar.mo5095k();
        } else if (this.f4622b) {
            iVar.mo5093a();
        } else {
            iVar.mo5094e();
        }
    }

    /* renamed from: b */
    public void mo5696b(C1334i iVar) {
        this.f4621a.remove(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5697c() {
        this.f4623c = true;
        for (T k : C1402k.m6982i(this.f4621a)) {
            k.mo5095k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5698d() {
        this.f4622b = true;
        for (T a : C1402k.m6982i(this.f4621a)) {
            a.mo5093a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5699e() {
        this.f4622b = false;
        for (T e : C1402k.m6982i(this.f4621a)) {
            e.mo5094e();
        }
    }
}
