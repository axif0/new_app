package com.bumptech.glide.load.p008o.p009a0;

import android.graphics.Bitmap;
import com.bumptech.glide.p029s.C1402k;

/* renamed from: com.bumptech.glide.load.o.a0.c */
class C1043c implements C1059l {

    /* renamed from: a */
    private final C1045b f4016a = new C1045b();

    /* renamed from: b */
    private final C1050h<C1044a, Bitmap> f4017b = new C1050h<>();

    /* renamed from: com.bumptech.glide.load.o.a0.c$a */
    static class C1044a implements C1060m {

        /* renamed from: a */
        private final C1045b f4018a;

        /* renamed from: b */
        private int f4019b;

        /* renamed from: c */
        private int f4020c;

        /* renamed from: d */
        private Bitmap.Config f4021d;

        public C1044a(C1045b bVar) {
            this.f4018a = bVar;
        }

        /* renamed from: a */
        public void mo5236a() {
            this.f4018a.mo5245c(this);
        }

        /* renamed from: b */
        public void mo5237b(int i, int i2, Bitmap.Config config) {
            this.f4019b = i;
            this.f4020c = i2;
            this.f4021d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1044a)) {
                return false;
            }
            C1044a aVar = (C1044a) obj;
            return this.f4019b == aVar.f4019b && this.f4020c == aVar.f4020c && this.f4021d == aVar.f4021d;
        }

        public int hashCode() {
            int i = ((this.f4019b * 31) + this.f4020c) * 31;
            Bitmap.Config config = this.f4021d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1043c.m5671g(this.f4019b, this.f4020c, this.f4021d);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.c$b */
    static class C1045b extends C1046d<C1044a> {
        C1045b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1044a mo5241a() {
            return new C1044a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1044a mo5243e(int i, int i2, Bitmap.Config config) {
            C1044a aVar = (C1044a) mo5244b();
            aVar.mo5237b(i, i2, config);
            return aVar;
        }
    }

    C1043c() {
    }

    /* renamed from: g */
    static String m5671g(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: h */
    private static String m5672h(Bitmap bitmap) {
        return m5671g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public String mo5229a(int i, int i2, Bitmap.Config config) {
        return m5671g(i, i2, config);
    }

    /* renamed from: b */
    public int mo5230b(Bitmap bitmap) {
        return C1402k.m6980g(bitmap);
    }

    /* renamed from: c */
    public Bitmap mo5231c(int i, int i2, Bitmap.Config config) {
        return this.f4017b.mo5253a(this.f4016a.mo5243e(i, i2, config));
    }

    /* renamed from: d */
    public void mo5232d(Bitmap bitmap) {
        this.f4017b.mo5254d(this.f4016a.mo5243e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: e */
    public Bitmap mo5233e() {
        return this.f4017b.mo5255f();
    }

    /* renamed from: f */
    public String mo5234f(Bitmap bitmap) {
        return m5672h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f4017b;
    }
}
