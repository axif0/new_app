package p374m;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jsoup.helper.HttpConnection;
import p374m.p375g0.C6130c;
import p385n.C6280d;
import p385n.C6282f;

/* renamed from: m.w */
public final class C6262w extends C6103b0 {

    /* renamed from: e */
    public static final C6261v f17674e = C6261v.m25703b("multipart/mixed");

    /* renamed from: f */
    public static final C6261v f17675f = C6261v.m25703b(HttpConnection.MULTIPART_FORM_DATA);

    /* renamed from: g */
    private static final byte[] f17676g = {58, 32};

    /* renamed from: h */
    private static final byte[] f17677h = {13, 10};

    /* renamed from: i */
    private static final byte[] f17678i = {45, 45};

    /* renamed from: a */
    private final C6282f f17679a;

    /* renamed from: b */
    private final C6261v f17680b;

    /* renamed from: c */
    private final List<C6264b> f17681c;

    /* renamed from: d */
    private long f17682d = -1;

    /* renamed from: m.w$a */
    public static final class C6263a {

        /* renamed from: a */
        private final C6282f f17683a;

        /* renamed from: b */
        private C6261v f17684b;

        /* renamed from: c */
        private final List<C6264b> f17685c;

        public C6263a() {
            this(UUID.randomUUID().toString());
        }

        public C6263a(String str) {
            this.f17684b = C6262w.f17674e;
            this.f17685c = new ArrayList();
            this.f17683a = C6282f.m25891n(str);
        }

        /* renamed from: a */
        public C6263a mo17735a(C6255s sVar, C6103b0 b0Var) {
            mo17736b(C6264b.m25715a(sVar, b0Var));
            return this;
        }

        /* renamed from: b */
        public C6263a mo17736b(C6264b bVar) {
            if (bVar != null) {
                this.f17685c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: c */
        public C6262w mo17737c() {
            if (!this.f17685c.isEmpty()) {
                return new C6262w(this.f17683a, this.f17684b, this.f17685c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        /* renamed from: d */
        public C6263a mo17738d(C6261v vVar) {
            if (vVar == null) {
                throw new NullPointerException("type == null");
            } else if (vVar.mo17731d().equals("multipart")) {
                this.f17684b = vVar;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + vVar);
            }
        }
    }

    /* renamed from: m.w$b */
    public static final class C6264b {

        /* renamed from: a */
        final C6255s f17686a;

        /* renamed from: b */
        final C6103b0 f17687b;

        private C6264b(C6255s sVar, C6103b0 b0Var) {
            this.f17686a = sVar;
            this.f17687b = b0Var;
        }

        /* renamed from: a */
        public static C6264b m25715a(C6255s sVar, C6103b0 b0Var) {
            if (b0Var == null) {
                throw new NullPointerException("body == null");
            } else if (sVar != null && sVar.mo17681c(HttpConnection.CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (sVar == null || sVar.mo17681c("Content-Length") == null) {
                return new C6264b(sVar, b0Var);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }
    }

    static {
        C6261v.m25703b("multipart/alternative");
        C6261v.m25703b("multipart/digest");
        C6261v.m25703b("multipart/parallel");
    }

    C6262w(C6282f fVar, C6261v vVar, List<C6264b> list) {
        this.f17679a = fVar;
        this.f17680b = C6261v.m25703b(vVar + "; boundary=" + fVar.mo17877D());
        this.f17681c = C6130c.m25057t(list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: n.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: n.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: n.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: n.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: n.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m25707g(p385n.C6280d r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            n.c r13 = new n.c
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<m.w$b> r1 = r12.f17681c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a6
            java.util.List<m.w$b> r6 = r12.f17681c
            java.lang.Object r6 = r6.get(r5)
            m.w$b r6 = (p374m.C6262w.C6264b) r6
            m.s r7 = r6.f17686a
            m.b0 r6 = r6.f17687b
            byte[] r8 = f17678i
            r13.mo17800G(r8)
            n.f r8 = r12.f17679a
            r13.mo17801I(r8)
            byte[] r8 = f17677h
            r13.mo17800G(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.mo17685h()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.mo17682e(r9)
            n.d r10 = r13.mo17810Y(r10)
            byte[] r11 = f17676g
            n.d r10 = r10.mo17800G(r11)
            java.lang.String r11 = r7.mo17687i(r9)
            n.d r10 = r10.mo17810Y(r11)
            byte[] r11 = f17677h
            r10.mo17800G(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            m.v r7 = r6.mo17234b()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            n.d r8 = r13.mo17810Y(r8)
            java.lang.String r7 = r7.toString()
            n.d r7 = r8.mo17810Y(r7)
            byte[] r8 = f17677h
            r7.mo17800G(r8)
        L_0x0071:
            long r7 = r6.mo17233a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            n.d r9 = r13.mo17810Y(r9)
            n.d r9 = r9.mo17811Z(r7)
            byte[] r10 = f17677h
            r9.mo17800G(r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.mo17840q()
            return r9
        L_0x0091:
            byte[] r9 = f17677h
            r13.mo17800G(r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.mo17235f(r13)
        L_0x009d:
            byte[] r6 = f17677h
            r13.mo17800G(r6)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a6:
            byte[] r1 = f17678i
            r13.mo17800G(r1)
            n.f r1 = r12.f17679a
            r13.mo17801I(r1)
            byte[] r1 = f17678i
            r13.mo17800G(r1)
            byte[] r1 = f17677h
            r13.mo17800G(r1)
            if (r14 == 0) goto L_0x00c4
            long r13 = r0.mo17834l0()
            long r3 = r3 + r13
            r0.mo17840q()
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.C6262w.m25707g(n.d, boolean):long");
    }

    /* renamed from: a */
    public long mo17233a() throws IOException {
        long j = this.f17682d;
        if (j != -1) {
            return j;
        }
        long g = m25707g((C6280d) null, true);
        this.f17682d = g;
        return g;
    }

    /* renamed from: b */
    public C6261v mo17234b() {
        return this.f17680b;
    }

    /* renamed from: f */
    public void mo17235f(C6280d dVar) throws IOException {
        m25707g(dVar, false);
    }
}
