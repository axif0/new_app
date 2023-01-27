package p374m.p375g0.p380i;

import p374m.C6255s;
import p374m.p375g0.C6130c;
import p385n.C6282f;

/* renamed from: m.g0.i.c */
public final class C6180c {

    /* renamed from: d */
    public static final C6282f f17387d = C6282f.m25891n(":");

    /* renamed from: e */
    public static final C6282f f17388e = C6282f.m25891n(":status");

    /* renamed from: f */
    public static final C6282f f17389f = C6282f.m25891n(":method");

    /* renamed from: g */
    public static final C6282f f17390g = C6282f.m25891n(":path");

    /* renamed from: h */
    public static final C6282f f17391h = C6282f.m25891n(":scheme");

    /* renamed from: i */
    public static final C6282f f17392i = C6282f.m25891n(":authority");

    /* renamed from: a */
    public final C6282f f17393a;

    /* renamed from: b */
    public final C6282f f17394b;

    /* renamed from: c */
    final int f17395c;

    /* renamed from: m.g0.i.c$a */
    interface C6181a {
        /* renamed from: a */
        void mo17463a(C6255s sVar);
    }

    public C6180c(String str, String str2) {
        this(C6282f.m25891n(str), C6282f.m25891n(str2));
    }

    public C6180c(C6282f fVar, String str) {
        this(fVar, C6282f.m25891n(str));
    }

    public C6180c(C6282f fVar, C6282f fVar2) {
        this.f17393a = fVar;
        this.f17394b = fVar2;
        this.f17395c = fVar.mo17892x() + 32 + fVar2.mo17892x();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6180c)) {
            return false;
        }
        C6180c cVar = (C6180c) obj;
        return this.f17393a.equals(cVar.f17393a) && this.f17394b.equals(cVar.f17394b);
    }

    public int hashCode() {
        return ((527 + this.f17393a.hashCode()) * 31) + this.f17394b.hashCode();
    }

    public String toString() {
        return C6130c.m25055r("%s: %s", this.f17393a.mo17877D(), this.f17394b.mo17877D());
    }
}
