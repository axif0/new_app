package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.C1492f;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import p148g.p189d.p190a.p191a.p192i.C3749h;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
final class C1485a extends C1492f {

    /* renamed from: a */
    private final Iterable<C3749h> f5049a;

    /* renamed from: b */
    private final byte[] f5050b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    static final class C1487b extends C1492f.C1493a {

        /* renamed from: a */
        private Iterable<C3749h> f5051a;

        /* renamed from: b */
        private byte[] f5052b;

        C1487b() {
        }

        /* renamed from: a */
        public C1492f mo6123a() {
            Iterable<C3749h> iterable = this.f5051a;
            String str = BuildConfig.FLAVOR;
            if (iterable == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C1485a(this.f5051a, this.f5052b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C1492f.C1493a mo6124b(Iterable<C3749h> iterable) {
            if (iterable != null) {
                this.f5051a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: c */
        public C1492f.C1493a mo6125c(byte[] bArr) {
            this.f5052b = bArr;
            return this;
        }
    }

    private C1485a(Iterable<C3749h> iterable, byte[] bArr) {
        this.f5049a = iterable;
        this.f5050b = bArr;
    }

    /* renamed from: b */
    public Iterable<C3749h> mo6118b() {
        return this.f5049a;
    }

    /* renamed from: c */
    public byte[] mo6119c() {
        return this.f5050b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1492f)) {
            return false;
        }
        C1492f fVar = (C1492f) obj;
        if (this.f5049a.equals(fVar.mo6118b())) {
            if (Arrays.equals(this.f5050b, fVar instanceof C1485a ? ((C1485a) fVar).f5050b : fVar.mo6119c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5049a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5050b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5049a + ", extras=" + Arrays.toString(this.f5050b) + "}";
    }
}
