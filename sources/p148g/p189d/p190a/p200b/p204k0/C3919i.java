package p148g.p189d.p190a.p200b.p204k0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4080e;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4084g;

/* renamed from: g.d.a.b.k0.i */
public final class C3919i {

    /* renamed from: c */
    public static final C4084g.C4085a f11891c = new C3920a();

    /* renamed from: d */
    private static final Pattern f11892d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f11893a = -1;

    /* renamed from: b */
    public int f11894b = -1;

    /* renamed from: g.d.a.b.k0.i$a */
    static class C3920a implements C4084g.C4085a {
        C3920a() {
        }

        /* renamed from: a */
        public boolean mo12749a(int i, int i2, int i3, int i4, int i5) {
            return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
        }
    }

    /* renamed from: b */
    private boolean m16464b(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f11892d.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f11893a = parseInt;
                    this.f11894b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo12746a() {
        return (this.f11893a == -1 || this.f11894b == -1) ? false : true;
    }

    /* renamed from: c */
    public boolean mo12747c(C4059a aVar) {
        for (int i = 0; i < aVar.mo12942b(); i++) {
            C4059a.C4061b a = aVar.mo12941a(i);
            if (a instanceof C4080e) {
                C4080e eVar = (C4080e) a;
                if (m16464b(eVar.f12882h, eVar.f12883i)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo12748d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f11893a = i2;
        this.f11894b = i3;
        return true;
    }
}
