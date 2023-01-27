package com.bumptech.glide.p029s.p030l;

/* renamed from: com.bumptech.glide.s.l.c */
public abstract class C1413c {

    /* renamed from: com.bumptech.glide.s.l.c$b */
    private static class C1415b extends C1413c {

        /* renamed from: a */
        private volatile boolean f4805a;

        C1415b() {
            super();
        }

        /* renamed from: b */
        public void mo5910b(boolean z) {
            this.f4805a = z;
        }

        /* renamed from: c */
        public void mo5911c() {
            if (this.f4805a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private C1413c() {
    }

    /* renamed from: a */
    public static C1413c m7013a() {
        return new C1415b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo5910b(boolean z);

    /* renamed from: c */
    public abstract void mo5911c();
}
