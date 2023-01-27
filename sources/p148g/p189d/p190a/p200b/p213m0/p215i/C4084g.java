package p148g.p189d.p190a.p200b.p213m0.p215i;

import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.C4062b;
import p148g.p189d.p190a.p200b.p213m0.C4066e;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.m0.i.g */
public final class C4084g implements C4062b {

    /* renamed from: b */
    public static final int f12888b = C4284w.m18249o("ID3");

    /* renamed from: a */
    private final C4085a f12889a;

    /* renamed from: g.d.a.b.m0.i.g$a */
    public interface C4085a {
        /* renamed from: a */
        boolean mo12749a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: g.d.a.b.m0.i.g$b */
    private static final class C4086b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f12890a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f12891b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f12892c;

        public C4086b(int i, boolean z, int i2) {
            this.f12890a = i;
            this.f12891b = z;
            this.f12892c = i2;
        }
    }

    public C4084g() {
        this((C4085a) null);
    }

    public C4084g(C4085a aVar) {
        this.f12889a = aVar;
    }

    /* renamed from: b */
    private static byte[] m17271b(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: d */
    private static C4072a m17272d(C4274m mVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int x = mVar.mo13479x();
        String s = m17287s(x);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        mVar.mo13462g(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + C4284w.m18233F(new String(bArr, 0, 3, "ISO-8859-1"));
            if (str.equals("image/jpg")) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m17290v(bArr, 0);
            String F = C4284w.m18233F(new String(bArr, 0, i3, "ISO-8859-1"));
            if (F.indexOf(47) == -1) {
                str = "image/" + F;
            } else {
                str = F;
            }
        }
        int i5 = i3 + 2;
        int u = m17289u(bArr, i5, x);
        return new C4072a(str, new String(bArr, i5, u - i5, s), bArr[i3 + 1] & 255, m17271b(bArr, u + m17286r(x), i4));
    }

    /* renamed from: e */
    private static C4074b m17273e(C4274m mVar, int i, String str) {
        byte[] bArr = new byte[i];
        mVar.mo13462g(bArr, 0, i);
        return new C4074b(str, bArr);
    }

    /* renamed from: f */
    private static C4076c m17274f(C4274m mVar, int i, int i2, boolean z, int i3, C4085a aVar) throws UnsupportedEncodingException {
        C4274m mVar2 = mVar;
        int c = mVar.mo13458c();
        int v = m17290v(mVar2.f13643a, c);
        String str = new String(mVar2.f13643a, c, v - c, "ISO-8859-1");
        mVar.mo13454J(v + 1);
        int i4 = mVar.mo13464i();
        int i5 = mVar.mo13464i();
        long z2 = mVar.mo13481z();
        long j = z2 == 4294967295L ? -1 : z2;
        long z3 = mVar.mo13481z();
        long j2 = z3 == 4294967295L ? -1 : z3;
        ArrayList arrayList = new ArrayList();
        int i6 = c + i;
        while (mVar.mo13458c() < i6) {
            C4087h i7 = m17277i(i2, mVar, z, i3, aVar);
            if (i7 != null) {
                arrayList.add(i7);
            }
        }
        C4087h[] hVarArr = new C4087h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C4076c(str, i4, i5, j, j2, hVarArr);
    }

    /* renamed from: g */
    private static C4078d m17275g(C4274m mVar, int i, int i2, boolean z, int i3, C4085a aVar) throws UnsupportedEncodingException {
        C4274m mVar2 = mVar;
        int c = mVar.mo13458c();
        int v = m17290v(mVar2.f13643a, c);
        String str = new String(mVar2.f13643a, c, v - c, "ISO-8859-1");
        mVar.mo13454J(v + 1);
        int x = mVar.mo13479x();
        boolean z2 = (x & 2) != 0;
        boolean z3 = (x & 1) != 0;
        int x2 = mVar.mo13479x();
        String[] strArr = new String[x2];
        for (int i4 = 0; i4 < x2; i4++) {
            int c2 = mVar.mo13458c();
            int v2 = m17290v(mVar2.f13643a, c2);
            strArr[i4] = new String(mVar2.f13643a, c2, v2 - c2, "ISO-8859-1");
            mVar.mo13454J(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c + i;
        while (mVar.mo13458c() < i5) {
            C4087h i6 = m17277i(i2, mVar, z, i3, aVar);
            if (i6 != null) {
                arrayList.add(i6);
            }
        }
        C4087h[] hVarArr = new C4087h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C4078d(str, z2, z3, strArr, hVarArr);
    }

    /* renamed from: h */
    private static C4080e m17276h(C4274m mVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int x = mVar.mo13479x();
        String s = m17287s(x);
        byte[] bArr = new byte[3];
        mVar.mo13462g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        mVar.mo13462g(bArr2, 0, i2);
        int u = m17289u(bArr2, 0, x);
        String str2 = new String(bArr2, 0, u, s);
        int r = u + m17286r(x);
        return new C4080e(str, str2, m17281m(bArr2, r, m17289u(bArr2, r, x), s));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p148g.p189d.p190a.p200b.p213m0.p215i.C4087h m17277i(int r19, p148g.p189d.p190a.p200b.p230r0.C4274m r20, boolean r21, int r22, p148g.p189d.p190a.p200b.p213m0.p215i.C4084g.C4085a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo13479x()
            int r9 = r20.mo13479x()
            int r10 = r20.mo13479x()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo13479x()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo13446B()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo13446B()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo13445A()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo13448D()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo13459d()
            r7.mo13454J(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo13458c()
            int r5 = r1 + r15
            int r1 = r20.mo13459d()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r4, r0)
            int r0 = r20.mo13459d()
            r7.mo13454J(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.mo12749a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo13454J(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0215
            if (r4 == 0) goto L_0x00f8
            goto L_0x0215
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.mo13455K(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.mo13455K(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = m17291w(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            g.d.a.b.m0.i.j r1 = m17283o(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = m17288t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            g.d.a.b.m0.i.j r1 = m17282n(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x012e:
            r0 = move-exception
            goto L_0x0211
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            g.d.a.b.m0.i.k r1 = m17285q(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = m17288t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            g.d.a.b.m0.i.k r1 = m17284p(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            g.d.a.b.m0.i.i r1 = m17280l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            g.d.a.b.m0.i.f r1 = m17278j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0197
            if (r9 != r3) goto L_0x0197
            if (r10 != r11) goto L_0x0197
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0197
            if (r9 != r4) goto L_0x0197
            if (r10 != r3) goto L_0x0197
            if (r13 != r11) goto L_0x0197
        L_0x0192:
            g.d.a.b.m0.i.a r1 = m17272d(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0197:
            if (r8 != r11) goto L_0x01a8
            if (r9 != r6) goto L_0x01a8
            r3 = 77
            if (r10 != r3) goto L_0x01a8
            if (r13 == r3) goto L_0x01a3
            if (r0 != r2) goto L_0x01a8
        L_0x01a3:
            g.d.a.b.m0.i.e r1 = m17276h(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x01a8:
            if (r8 != r11) goto L_0x01c2
            r2 = 72
            if (r9 != r2) goto L_0x01c2
            if (r10 != r5) goto L_0x01c2
            if (r13 != r4) goto L_0x01c2
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            g.d.a.b.m0.i.c r1 = m17274f(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x01c2:
            if (r8 != r11) goto L_0x01da
            if (r9 != r1) goto L_0x01da
            if (r10 != r6) goto L_0x01da
            if (r13 != r11) goto L_0x01da
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            g.d.a.b.m0.i.d r1 = m17275g(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x01da:
            java.lang.String r1 = m17288t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            g.d.a.b.m0.i.b r1 = m17273e(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
        L_0x01e2:
            if (r1 != 0) goto L_0x0204
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r0 = m17288t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            android.util.Log.w(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
        L_0x0204:
            r7.mo13454J(r14)
            return r1
        L_0x0208:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r12, r0)     // Catch:{ all -> 0x012e }
            r7.mo13454J(r14)
            return r16
        L_0x0211:
            r7.mo13454J(r14)
            throw r0
        L_0x0215:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r12, r0)
            r7.mo13454J(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p213m0.p215i.C4084g.m17277i(int, g.d.a.b.r0.m, boolean, int, g.d.a.b.m0.i.g$a):g.d.a.b.m0.i.h");
    }

    /* renamed from: j */
    private static C4082f m17278j(C4274m mVar, int i) throws UnsupportedEncodingException {
        int x = mVar.mo13479x();
        String s = m17287s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo13462g(bArr, 0, i2);
        int v = m17290v(bArr, 0);
        String str = new String(bArr, 0, v, "ISO-8859-1");
        int i3 = v + 1;
        int u = m17289u(bArr, i3, x);
        String m = m17281m(bArr, i3, u, s);
        int r = u + m17286r(x);
        int u2 = m17289u(bArr, r, x);
        return new C4082f(str, m, m17281m(bArr, r, u2, s), m17271b(bArr, u2 + m17286r(x), i2));
    }

    /* renamed from: k */
    private static C4086b m17279k(C4274m mVar) {
        StringBuilder sb;
        String str;
        String str2;
        if (mVar.mo13456a() < 10) {
            str2 = "Data too short to be an ID3 tag";
        } else {
            int A = mVar.mo13445A();
            if (A != f12888b) {
                sb = new StringBuilder();
                str = "Unexpected first three bytes of ID3 tag header: ";
            } else {
                A = mVar.mo13479x();
                boolean z = true;
                mVar.mo13455K(1);
                int x = mVar.mo13479x();
                int w = mVar.mo13478w();
                if (A == 2) {
                    if ((x & 64) != 0) {
                        str2 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (A == 3) {
                    if ((x & 64) != 0) {
                        int i = mVar.mo13464i();
                        mVar.mo13455K(i);
                        w -= i + 4;
                    }
                } else if (A == 4) {
                    if ((x & 64) != 0) {
                        int w2 = mVar.mo13478w();
                        mVar.mo13455K(w2 - 4);
                        w -= w2;
                    }
                    if ((x & 16) != 0) {
                        w -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Skipped ID3 tag with unsupported majorVersion=";
                }
                if (A >= 4 || (x & 128) == 0) {
                    z = false;
                }
                return new C4086b(A, z, w);
            }
            sb.append(str);
            sb.append(A);
            str2 = sb.toString();
        }
        Log.w("Id3Decoder", str2);
        return null;
    }

    /* renamed from: l */
    private static C4088i m17280l(C4274m mVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        mVar.mo13462g(bArr, 0, i);
        int v = m17290v(bArr, 0);
        return new C4088i(new String(bArr, 0, v, "ISO-8859-1"), m17271b(bArr, v + 1, i));
    }

    /* renamed from: m */
    private static String m17281m(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: n */
    private static C4090j m17282n(C4274m mVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int x = mVar.mo13479x();
        String s = m17287s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo13462g(bArr, 0, i2);
        return new C4090j(str, (String) null, new String(bArr, 0, m17289u(bArr, 0, x), s));
    }

    /* renamed from: o */
    private static C4090j m17283o(C4274m mVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int x = mVar.mo13479x();
        String s = m17287s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo13462g(bArr, 0, i2);
        int u = m17289u(bArr, 0, x);
        String str = new String(bArr, 0, u, s);
        int r = u + m17286r(x);
        return new C4090j("TXXX", str, m17281m(bArr, r, m17289u(bArr, r, x), s));
    }

    /* renamed from: p */
    private static C4092k m17284p(C4274m mVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        mVar.mo13462g(bArr, 0, i);
        return new C4092k(str, (String) null, new String(bArr, 0, m17290v(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: q */
    private static C4092k m17285q(C4274m mVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int x = mVar.mo13479x();
        String s = m17287s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.mo13462g(bArr, 0, i2);
        int u = m17289u(bArr, 0, x);
        String str = new String(bArr, 0, u, s);
        int r = u + m17286r(x);
        return new C4092k("WXXX", str, m17281m(bArr, r, m17290v(bArr, r), "ISO-8859-1"));
    }

    /* renamed from: r */
    private static int m17286r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: s */
    private static String m17287s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: t */
    private static String m17288t(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: u */
    private static int m17289u(byte[] bArr, int i, int i2) {
        int v = m17290v(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if (v % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = m17290v(bArr, v + 1);
        }
        return bArr.length;
    }

    /* renamed from: v */
    private static int m17290v(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: w */
    private static int m17291w(C4274m mVar, int i) {
        byte[] bArr = mVar.f13643a;
        int c = mVar.mo13458c();
        while (true) {
            int i2 = c + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[c] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, c + 2, bArr, i2, (i - c) - 2);
                i--;
            }
            c = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC, Splitter:B:49:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0097 A[SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m17292x(p148g.p189d.p190a.p200b.p230r0.C4274m r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo13458c()
        L_0x0008:
            int r3 = r18.mo13456a()     // Catch:{ all -> 0x00b2 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo13464i()     // Catch:{ all -> 0x00b2 }
            long r8 = r18.mo13481z()     // Catch:{ all -> 0x00b2 }
            int r10 = r18.mo13448D()     // Catch:{ all -> 0x00b2 }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo13445A()     // Catch:{ all -> 0x00b2 }
            int r8 = r18.mo13445A()     // Catch:{ all -> 0x00b2 }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo13454J(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo13454J(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0089
        L_0x0078:
            r7 = 1
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x0078
        L_0x0088:
            r3 = 0
        L_0x0089:
            r7 = 0
        L_0x008a:
            if (r3 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r7 == 0) goto L_0x0092
            int r4 = r4 + 4
        L_0x0092:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r1.mo13454J(r2)
            return r6
        L_0x009b:
            int r3 = r18.mo13456a()     // Catch:{ all -> 0x00b2 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a8
            r1.mo13454J(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.mo13455K(r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0008
        L_0x00ae:
            r1.mo13454J(r2)
            return r4
        L_0x00b2:
            r0 = move-exception
            r1.mo13454J(r2)
            goto L_0x00b8
        L_0x00b7:
            throw r0
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p213m0.p215i.C4084g.m17292x(g.d.a.b.r0.m, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public C4059a mo12951a(C4066e eVar) {
        ByteBuffer byteBuffer = eVar.f11822h;
        return mo13006c(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: c */
    public C4059a mo13006c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C4274m mVar = new C4274m(bArr, i);
        C4086b k = m17279k(mVar);
        if (k == null) {
            return null;
        }
        int c = mVar.mo13458c();
        int i2 = k.f12890a == 2 ? 6 : 10;
        int b = k.f12892c;
        if (k.f12891b) {
            b = m17291w(mVar, k.f12892c);
        }
        mVar.mo13453I(c + b);
        boolean z = false;
        if (!m17292x(mVar, k.f12890a, i2, false)) {
            if (k.f12890a != 4 || !m17292x(mVar, 4, i2, true)) {
                Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + k.f12890a);
                return null;
            }
            z = true;
        }
        while (mVar.mo13456a() >= i2) {
            C4087h i3 = m17277i(k.f12890a, mVar, z, i2, this.f12889a);
            if (i3 != null) {
                arrayList.add(i3);
            }
        }
        return new C4059a((List<? extends C4059a.C4061b>) arrayList);
    }
}
