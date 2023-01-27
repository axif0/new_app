package p148g.p189d.p296d;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p296d.p304s.C5411a;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.c */
public final class C5371c {

    /* renamed from: a */
    private final C5370b f15528a;

    /* renamed from: b */
    private C5412b f15529b;

    public C5371c(C5370b bVar) {
        if (bVar != null) {
            this.f15528a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C5412b mo15588a() throws C5377i {
        if (this.f15529b == null) {
            this.f15529b = this.f15528a.mo15583a();
        }
        return this.f15529b;
    }

    /* renamed from: b */
    public C5411a mo15589b(int i, C5411a aVar) throws C5377i {
        return this.f15528a.mo15584b(i, aVar);
    }

    /* renamed from: c */
    public int mo15590c() {
        return this.f15528a.mo15585c();
    }

    /* renamed from: d */
    public int mo15591d() {
        return this.f15528a.mo15587e();
    }

    /* renamed from: e */
    public boolean mo15592e() {
        return this.f15528a.mo15586d().mo15600e();
    }

    /* renamed from: f */
    public C5371c mo15593f() {
        this.f15528a.mo15586d().mo15601f();
        throw null;
    }

    public String toString() {
        try {
            return mo15588a().toString();
        } catch (C5377i unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
