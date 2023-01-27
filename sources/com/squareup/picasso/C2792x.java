package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2789w;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.x */
public class C2792x {

    /* renamed from: m */
    private static final AtomicInteger f8943m = new AtomicInteger();

    /* renamed from: a */
    private final C2776t f8944a;

    /* renamed from: b */
    private final C2789w.C2791b f8945b;

    /* renamed from: c */
    private boolean f8946c;

    /* renamed from: d */
    private boolean f8947d;

    /* renamed from: e */
    private boolean f8948e = true;

    /* renamed from: f */
    private int f8949f;

    /* renamed from: g */
    private int f8950g;

    /* renamed from: h */
    private int f8951h;

    /* renamed from: i */
    private int f8952i;

    /* renamed from: j */
    private Drawable f8953j;

    /* renamed from: k */
    private Drawable f8954k;

    /* renamed from: l */
    private Object f8955l;

    C2792x(C2776t tVar, Uri uri, int i) {
        if (!tVar.f8872o) {
            this.f8944a = tVar;
            this.f8945b = new C2789w.C2791b(uri, i, tVar.f8869l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: b */
    private C2789w m12259b(long j) {
        int andIncrement = f8943m.getAndIncrement();
        C2789w a = this.f8945b.mo10126a();
        a.f8906a = andIncrement;
        a.f8907b = j;
        boolean z = this.f8944a.f8871n;
        if (z) {
            C2748d0.m12157t("Main", "created", a.mo10124g(), a.toString());
        }
        this.f8944a.mo10103n(a);
        if (a != a) {
            a.f8906a = andIncrement;
            a.f8907b = j;
            if (z) {
                String d = a.mo10121d();
                C2748d0.m12157t("Main", "changed", d, "into " + a);
            }
        }
        return a;
    }

    /* renamed from: d */
    private Drawable m12260d() {
        int i = this.f8949f;
        if (i == 0) {
            return this.f8953j;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return this.f8944a.f8862e.getDrawable(i);
        }
        if (i2 >= 16) {
            return this.f8944a.f8862e.getResources().getDrawable(this.f8949f);
        }
        TypedValue typedValue = new TypedValue();
        this.f8944a.f8862e.getResources().getValue(this.f8949f, typedValue, true);
        return this.f8944a.f8862e.getResources().getDrawable(typedValue.resourceId);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2792x mo10130a() {
        this.f8955l = null;
        return this;
    }

    /* renamed from: c */
    public C2792x mo10131c(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.f8954k == null) {
            this.f8950g = i;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    /* renamed from: e */
    public void mo10132e(ImageView imageView, C2752e eVar) {
        Bitmap k;
        ImageView imageView2 = imageView;
        C2752e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        C2748d0.m12140c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f8945b.mo10127b()) {
            this.f8944a.mo10093b(imageView2);
            if (this.f8948e) {
                C2786u.m12244d(imageView2, m12260d());
            }
        } else {
            if (this.f8947d) {
                if (!this.f8945b.mo10128c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f8948e) {
                            C2786u.m12244d(imageView2, m12260d());
                        }
                        this.f8944a.mo10095d(imageView2, new C2755h(this, imageView2, eVar2));
                        return;
                    }
                    this.f8945b.mo10129d(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C2789w b = m12259b(nanoTime);
            String f = C2748d0.m12143f(b);
            if (!C2770p.m12211e(this.f8951h) || (k = this.f8944a.mo10100k(f)) == null) {
                if (this.f8948e) {
                    C2786u.m12244d(imageView2, m12260d());
                }
                this.f8944a.mo10096f(new C2763l(this.f8944a, imageView, b, this.f8951h, this.f8952i, this.f8950g, this.f8954k, f, this.f8955l, eVar, this.f8946c));
                return;
            }
            this.f8944a.mo10093b(imageView2);
            C2776t tVar = this.f8944a;
            C2786u.m12243c(imageView, tVar.f8862e, k, C2776t.C2782e.MEMORY, this.f8946c, tVar.f8870m);
            if (this.f8944a.f8871n) {
                String g = b.mo10124g();
                C2748d0.m12157t("Main", "completed", g, "from " + C2776t.C2782e.MEMORY);
            }
            if (eVar2 != null) {
                eVar.mo10046b();
            }
        }
    }

    /* renamed from: f */
    public C2792x mo10133f(int i) {
        if (!this.f8948e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f8953j == null) {
            this.f8949f = i;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* renamed from: g */
    public C2792x mo10134g(int i, int i2) {
        this.f8945b.mo10129d(i, i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2792x mo10135h() {
        this.f8947d = false;
        return this;
    }
}
