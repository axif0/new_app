package p148g.p189d.p190a.p191a.p192i;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import p148g.p189d.p190a.p191a.C3729d;
import p148g.p189d.p190a.p191a.p192i.C3755l;

/* renamed from: g.d.a.a.i.c */
final class C3740c extends C3755l {

    /* renamed from: a */
    private final String f11392a;

    /* renamed from: b */
    private final byte[] f11393b;

    /* renamed from: c */
    private final C3729d f11394c;

    /* renamed from: g.d.a.a.i.c$b */
    static final class C3742b extends C3755l.C3756a {

        /* renamed from: a */
        private String f11395a;

        /* renamed from: b */
        private byte[] f11396b;

        /* renamed from: c */
        private C3729d f11397c;

        C3742b() {
        }

        /* renamed from: a */
        public C3755l mo12324a() {
            String str = this.f11395a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = str2 + " backendName";
            }
            if (this.f11397c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new C3740c(this.f11395a, this.f11396b, this.f11397c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C3755l.C3756a mo12325b(String str) {
            if (str != null) {
                this.f11395a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public C3755l.C3756a mo12326c(byte[] bArr) {
            this.f11396b = bArr;
            return this;
        }

        /* renamed from: d */
        public C3755l.C3756a mo12327d(C3729d dVar) {
            if (dVar != null) {
                this.f11397c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    private C3740c(String str, byte[] bArr, C3729d dVar) {
        this.f11392a = str;
        this.f11393b = bArr;
        this.f11394c = dVar;
    }

    /* renamed from: b */
    public String mo12319b() {
        return this.f11392a;
    }

    /* renamed from: c */
    public byte[] mo12320c() {
        return this.f11393b;
    }

    /* renamed from: d */
    public C3729d mo12321d() {
        return this.f11394c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3755l)) {
            return false;
        }
        C3755l lVar = (C3755l) obj;
        if (this.f11392a.equals(lVar.mo12319b())) {
            return Arrays.equals(this.f11393b, lVar instanceof C3740c ? ((C3740c) lVar).f11393b : lVar.mo12320c()) && this.f11394c.equals(lVar.mo12321d());
        }
    }

    public int hashCode() {
        return ((((this.f11392a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11393b)) * 1000003) ^ this.f11394c.hashCode();
    }
}
