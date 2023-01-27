package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.C2776t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.w */
public final class C2789w {

    /* renamed from: u */
    private static final long f8905u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f8906a;

    /* renamed from: b */
    long f8907b;

    /* renamed from: c */
    int f8908c;

    /* renamed from: d */
    public final Uri f8909d;

    /* renamed from: e */
    public final int f8910e;

    /* renamed from: f */
    public final String f8911f;

    /* renamed from: g */
    public final List<C2746c0> f8912g;

    /* renamed from: h */
    public final int f8913h;

    /* renamed from: i */
    public final int f8914i;

    /* renamed from: j */
    public final boolean f8915j;

    /* renamed from: k */
    public final int f8916k;

    /* renamed from: l */
    public final boolean f8917l;

    /* renamed from: m */
    public final boolean f8918m;

    /* renamed from: n */
    public final float f8919n;

    /* renamed from: o */
    public final float f8920o;

    /* renamed from: p */
    public final float f8921p;

    /* renamed from: q */
    public final boolean f8922q;

    /* renamed from: r */
    public final boolean f8923r;

    /* renamed from: s */
    public final Bitmap.Config f8924s;

    /* renamed from: t */
    public final C2776t.C2783f f8925t;

    /* renamed from: com.squareup.picasso.w$b */
    public static final class C2791b {

        /* renamed from: a */
        private Uri f8926a;

        /* renamed from: b */
        private int f8927b;

        /* renamed from: c */
        private String f8928c;

        /* renamed from: d */
        private int f8929d;

        /* renamed from: e */
        private int f8930e;

        /* renamed from: f */
        private boolean f8931f;

        /* renamed from: g */
        private int f8932g;

        /* renamed from: h */
        private boolean f8933h;

        /* renamed from: i */
        private boolean f8934i;

        /* renamed from: j */
        private float f8935j;

        /* renamed from: k */
        private float f8936k;

        /* renamed from: l */
        private float f8937l;

        /* renamed from: m */
        private boolean f8938m;

        /* renamed from: n */
        private boolean f8939n;

        /* renamed from: o */
        private List<C2746c0> f8940o;

        /* renamed from: p */
        private Bitmap.Config f8941p;

        /* renamed from: q */
        private C2776t.C2783f f8942q;

        C2791b(Uri uri, int i, Bitmap.Config config) {
            this.f8926a = uri;
            this.f8927b = i;
            this.f8941p = config;
        }

        /* renamed from: a */
        public C2789w mo10126a() {
            if (this.f8933h && this.f8931f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f8931f && this.f8929d == 0 && this.f8930e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f8933h && this.f8929d == 0 && this.f8930e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f8942q == null) {
                    this.f8942q = C2776t.C2783f.NORMAL;
                }
                C2789w wVar = r2;
                C2789w wVar2 = new C2789w(this.f8926a, this.f8927b, this.f8928c, this.f8940o, this.f8929d, this.f8930e, this.f8931f, this.f8933h, this.f8932g, this.f8934i, this.f8935j, this.f8936k, this.f8937l, this.f8938m, this.f8939n, this.f8941p, this.f8942q);
                return wVar;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo10127b() {
            return (this.f8926a == null && this.f8927b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo10128c() {
            return (this.f8929d == 0 && this.f8930e == 0) ? false : true;
        }

        /* renamed from: d */
        public C2791b mo10129d(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f8929d = i;
                this.f8930e = i2;
                return this;
            }
        }
    }

    private C2789w(Uri uri, int i, String str, List<C2746c0> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, C2776t.C2783f fVar) {
        this.f8909d = uri;
        this.f8910e = i;
        this.f8911f = str;
        this.f8912g = list == null ? null : Collections.unmodifiableList(list);
        this.f8913h = i2;
        this.f8914i = i3;
        this.f8915j = z;
        this.f8917l = z2;
        this.f8916k = i4;
        this.f8918m = z3;
        this.f8919n = f;
        this.f8920o = f2;
        this.f8921p = f3;
        this.f8922q = z4;
        this.f8923r = z5;
        this.f8924s = config;
        this.f8925t = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10118a() {
        Uri uri = this.f8909d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f8910e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10119b() {
        return this.f8912g != null;
    }

    /* renamed from: c */
    public boolean mo10120c() {
        return (this.f8913h == 0 && this.f8914i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo10121d() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f8907b;
        if (nanoTime > f8905u) {
            sb.append(mo10124g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(mo10124g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10122e() {
        return mo10120c() || this.f8919n != 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10123f() {
        return mo10122e() || mo10119b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo10124g() {
        return "[R" + this.f8906a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f8910e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f8909d);
        }
        List<C2746c0> list = this.f8912g;
        if (list != null && !list.isEmpty()) {
            for (C2746c0 key : this.f8912g) {
                sb.append(' ');
                sb.append(key.key());
            }
        }
        if (this.f8911f != null) {
            sb.append(" stableKey(");
            sb.append(this.f8911f);
            sb.append(')');
        }
        if (this.f8913h > 0) {
            sb.append(" resize(");
            sb.append(this.f8913h);
            sb.append(',');
            sb.append(this.f8914i);
            sb.append(')');
        }
        if (this.f8915j) {
            sb.append(" centerCrop");
        }
        if (this.f8917l) {
            sb.append(" centerInside");
        }
        if (this.f8919n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f8919n);
            if (this.f8922q) {
                sb.append(" @ ");
                sb.append(this.f8920o);
                sb.append(',');
                sb.append(this.f8921p);
            }
            sb.append(')');
        }
        if (this.f8923r) {
            sb.append(" purgeable");
        }
        if (this.f8924s != null) {
            sb.append(' ');
            sb.append(this.f8924s);
        }
        sb.append('}');
        return sb.toString();
    }
}
