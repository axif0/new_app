package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;

/* renamed from: g.d.a.c.f.f.k7 */
public class C4636k7 extends IOException {
    public C4636k7(String str) {
        super(str);
    }

    /* renamed from: a */
    static C4636k7 m19823a() {
        return new C4636k7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C4636k7 m19824b() {
        return new C4636k7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C4636k7 m19825c() {
        return new C4636k7("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static C4618j7 m19826d() {
        return new C4618j7("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static C4636k7 m19827e() {
        return new C4636k7("Failed to parse the message.");
    }

    /* renamed from: f */
    static C4636k7 m19828f() {
        return new C4636k7("Protocol message had invalid UTF-8.");
    }
}
