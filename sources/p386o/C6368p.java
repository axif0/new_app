package p386o;

import java.io.IOException;
import java.util.regex.Pattern;
import org.jsoup.helper.HttpConnection;
import p374m.C6099a0;
import p374m.C6103b0;
import p374m.C6252q;
import p374m.C6255s;
import p374m.C6257t;
import p374m.C6261v;
import p374m.C6262w;
import p385n.C6277c;
import p385n.C6280d;

/* renamed from: o.p */
final class C6368p {

    /* renamed from: l */
    private static final char[] f17923l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    private static final Pattern f17924m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f17925a;

    /* renamed from: b */
    private final C6257t f17926b;

    /* renamed from: c */
    private String f17927c;

    /* renamed from: d */
    private C6257t.C6258a f17928d;

    /* renamed from: e */
    private final C6099a0.C6100a f17929e = new C6099a0.C6100a();

    /* renamed from: f */
    private final C6255s.C6256a f17930f;

    /* renamed from: g */
    private C6261v f17931g;

    /* renamed from: h */
    private final boolean f17932h;

    /* renamed from: i */
    private C6262w.C6263a f17933i;

    /* renamed from: j */
    private C6252q.C6253a f17934j;

    /* renamed from: k */
    private C6103b0 f17935k;

    /* renamed from: o.p$a */
    private static class C6369a extends C6103b0 {

        /* renamed from: a */
        private final C6103b0 f17936a;

        /* renamed from: b */
        private final C6261v f17937b;

        C6369a(C6103b0 b0Var, C6261v vVar) {
            this.f17936a = b0Var;
            this.f17937b = vVar;
        }

        /* renamed from: a */
        public long mo17233a() throws IOException {
            return this.f17936a.mo17233a();
        }

        /* renamed from: b */
        public C6261v mo17234b() {
            return this.f17937b;
        }

        /* renamed from: f */
        public void mo17235f(C6280d dVar) throws IOException {
            this.f17936a.mo17235f(dVar);
        }
    }

    C6368p(String str, C6257t tVar, String str2, C6255s sVar, C6261v vVar, boolean z, boolean z2, boolean z3) {
        this.f17925a = str;
        this.f17926b = tVar;
        this.f17927c = str2;
        this.f17931g = vVar;
        this.f17932h = z;
        this.f17930f = sVar != null ? sVar.mo17684f() : new C6255s.C6256a();
        if (z2) {
            this.f17934j = new C6252q.C6253a();
        } else if (z3) {
            C6262w.C6263a aVar = new C6262w.C6263a();
            this.f17933i = aVar;
            aVar.mo17738d(C6262w.f17675f);
        }
    }

    /* renamed from: g */
    private static String m26159g(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C6277c cVar = new C6277c();
                cVar.mo17795A0(str, 0, i);
                m26160h(cVar, str, i, length, z);
                return cVar.mo17827i0();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: h */
    private static void m26160h(C6277c cVar, String str, int i, int i2, boolean z) {
        C6277c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new C6277c();
                    }
                    cVar2.mo17797B0(codePointAt);
                    while (!cVar2.mo17794A()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo17852t0(37);
                        cVar.mo17852t0(f17923l[(readByte >> 4) & 15]);
                        cVar.mo17852t0(f17923l[readByte & 15]);
                    }
                } else {
                    cVar.mo17797B0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17984a(String str, String str2, boolean z) {
        if (z) {
            this.f17934j.mo17673b(str, str2);
        } else {
            this.f17934j.mo17672a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17985b(String str, String str2) {
        if (HttpConnection.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f17931g = C6261v.m25703b(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f17930f.mo17690a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17986c(C6255s sVar, C6103b0 b0Var) {
        this.f17933i.mo17735a(sVar, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo17987d(C6262w.C6264b bVar) {
        this.f17933i.mo17736b(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17988e(String str, String str2, boolean z) {
        if (this.f17927c != null) {
            String g = m26159g(str2, z);
            String str3 = this.f17927c;
            String replace = str3.replace("{" + str + "}", g);
            if (!f17924m.matcher(replace).matches()) {
                this.f17927c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17989f(String str, String str2, boolean z) {
        String str3 = this.f17927c;
        if (str3 != null) {
            C6257t.C6258a q = this.f17926b.mo17712q(str3);
            this.f17928d = q;
            if (q != null) {
                this.f17927c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f17926b + ", Relative: " + this.f17927c);
            }
        }
        if (z) {
            this.f17928d.mo17717a(str, str2);
        } else {
            this.f17928d.mo17718b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C6099a0.C6100a mo17990i() {
        C6257t tVar;
        C6257t.C6258a aVar = this.f17928d;
        if (aVar != null) {
            tVar = aVar.mo17719c();
        } else {
            tVar = this.f17926b.mo17698C(this.f17927c);
            if (tVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f17926b + ", Relative: " + this.f17927c);
            }
        }
        C6369a aVar2 = this.f17935k;
        if (aVar2 == null) {
            C6252q.C6253a aVar3 = this.f17934j;
            if (aVar3 != null) {
                aVar2 = aVar3.mo17674c();
            } else {
                C6262w.C6263a aVar4 = this.f17933i;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo17737c();
                } else if (this.f17932h) {
                    aVar2 = C6103b0.m24900d((C6261v) null, new byte[0]);
                }
            }
        }
        C6261v vVar = this.f17931g;
        if (vVar != null) {
            if (aVar2 != null) {
                aVar2 = new C6369a(aVar2, vVar);
            } else {
                this.f17930f.mo17690a(HttpConnection.CONTENT_TYPE, vVar.toString());
            }
        }
        C6099a0.C6100a aVar5 = this.f17929e;
        aVar5.mo17231i(tVar);
        aVar5.mo17226d(this.f17930f.mo17693d());
        aVar5.mo17227e(this.f17925a, aVar2);
        return aVar5;
    }
}
