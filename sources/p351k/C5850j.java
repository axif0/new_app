package p351k;

import java.io.Serializable;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.j */
public final class C5850j<T> implements Serializable {

    /* renamed from: f */
    public static final C5851a f16880f = new C5851a((C5954e) null);

    /* renamed from: k.j$a */
    public static final class C5851a {
        private C5851a() {
        }

        public /* synthetic */ C5851a(C5954e eVar) {
            this();
        }
    }

    /* renamed from: k.j$b */
    public static final class C5852b implements Serializable {

        /* renamed from: f */
        public final Throwable f16881f;

        public C5852b(Throwable th) {
            C5956g.m24500e(th, "exception");
            this.f16881f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5852b) && C5956g.m24496a(this.f16881f, ((C5852b) obj).f16881f);
        }

        public int hashCode() {
            return this.f16881f.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f16881f + ')';
        }
    }

    /* renamed from: a */
    public static Object m24363a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m24364b(Object obj) {
        if (obj instanceof C5852b) {
            return ((C5852b) obj).f16881f;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m24365c(Object obj) {
        return obj instanceof C5852b;
    }

    /* renamed from: d */
    public static final boolean m24366d(Object obj) {
        return !(obj instanceof C5852b);
    }
}
