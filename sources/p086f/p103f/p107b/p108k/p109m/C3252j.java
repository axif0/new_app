package p086f.p103f.p107b.p108k.p109m;

import java.util.List;
import p086f.p103f.p107b.p108k.C3226d;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.C3235h;
import p086f.p103f.p107b.p108k.p109m.C3247f;
import p086f.p103f.p107b.p108k.p109m.C3257m;

/* renamed from: f.f.b.k.m.j */
public class C3252j extends C3257m {

    /* renamed from: k */
    private static int[] f10468k = new int[2];

    /* renamed from: f.f.b.k.m.j$a */
    static /* synthetic */ class C3253a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10469a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                f.f.b.k.m.m$b[] r0 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10469a = r0
                f.f.b.k.m.m$b r1 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10469a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.k.m.m$b r1 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10469a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.k.m.m$b r1 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3252j.C3253a.<clinit>():void");
        }
    }

    public C3252j(C3229e eVar) {
        super(eVar);
        this.f10484h.f10450e = C3247f.C3248a.LEFT;
        this.f10485i.f10450e = C3247f.C3248a.RIGHT;
        this.f10482f = 0;
    }

    /* renamed from: q */
    private void m14038q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029f, code lost:
        if (r14 != 1) goto L_0x02f7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11388a(p086f.p103f.p107b.p108k.p109m.C3245d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p086f.p103f.p107b.p108k.p109m.C3252j.C3253a.f10469a
            f.f.b.k.m.m$b r1 = r8.f10486j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.d r1 = r0.f10388y
            f.f.b.k.d r0 = r0.f10333A
            r3 = r17
            r8.mo11420n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo11421o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo11422p(r17)
        L_0x002e:
            f.f.b.k.m.g r0 = r8.f10481e
            boolean r0 = r0.f10455j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02f7
            f.f.b.k.e$b r0 = r8.f10480d
            f.f.b.k.e$b r3 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02f7
            f.f.b.k.e r0 = r8.f10478b
            int r3 = r0.f10373j
            if (r3 == r1) goto L_0x02d9
            if (r3 == r2) goto L_0x0046
            goto L_0x02f7
        L_0x0046:
            int r1 = r0.f10374k
            r3 = -1
            if (r1 == 0) goto L_0x007d
            if (r1 != r2) goto L_0x004e
            goto L_0x007d
        L_0x004e:
            int r0 = r0.mo11334s()
            if (r0 == r3) goto L_0x006a
            if (r0 == 0) goto L_0x005b
            if (r0 == r9) goto L_0x006a
            r0 = 0
            goto L_0x02f2
        L_0x005b:
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r1 = r0.f10367e
            f.f.b.k.m.g r1 = r1.f10481e
            int r1 = r1.f10452g
            float r1 = (float) r1
            float r0 = r0.mo11332r()
            float r1 = r1 / r0
            goto L_0x0079
        L_0x006a:
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r1 = r0.f10367e
            f.f.b.k.m.g r1 = r1.f10481e
            int r1 = r1.f10452g
            float r1 = (float) r1
            float r0 = r0.mo11332r()
            float r1 = r1 * r0
        L_0x0079:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x02f2
        L_0x007d:
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r1 = r0.f10367e
            f.f.b.k.m.f r12 = r1.f10484h
            f.f.b.k.m.f r13 = r1.f10485i
            f.f.b.k.d r0 = r0.f10388y
            f.f.b.k.d r0 = r0.f10317d
            if (r0 == 0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            f.f.b.k.e r1 = r8.f10478b
            f.f.b.k.d r1 = r1.f10389z
            f.f.b.k.d r1 = r1.f10317d
            if (r1 == 0) goto L_0x0098
            r1 = 1
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            f.f.b.k.e r2 = r8.f10478b
            f.f.b.k.d r2 = r2.f10333A
            f.f.b.k.d r2 = r2.f10317d
            if (r2 == 0) goto L_0x00a3
            r2 = 1
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            f.f.b.k.e r4 = r8.f10478b
            f.f.b.k.d r4 = r4.f10334B
            f.f.b.k.d r4 = r4.f10317d
            if (r4 == 0) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            f.f.b.k.e r5 = r8.f10478b
            int r14 = r5.mo11334s()
            if (r0 == 0) goto L_0x01f5
            if (r1 == 0) goto L_0x01f5
            if (r2 == 0) goto L_0x01f5
            if (r4 == 0) goto L_0x01f5
            f.f.b.k.e r0 = r8.f10478b
            float r15 = r0.mo11332r()
            boolean r0 = r12.f10455j
            if (r0 == 0) goto L_0x0126
            boolean r0 = r13.f10455j
            if (r0 == 0) goto L_0x0126
            f.f.b.k.m.f r0 = r8.f10484h
            boolean r1 = r0.f10448c
            if (r1 == 0) goto L_0x0125
            f.f.b.k.m.f r1 = r8.f10485i
            boolean r1 = r1.f10448c
            if (r1 != 0) goto L_0x00d8
            goto L_0x0125
        L_0x00d8:
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            f.f.b.k.m.f r1 = r8.f10484h
            int r1 = r1.f10451f
            int r2 = r0 + r1
            f.f.b.k.m.f r0 = r8.f10485i
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            f.f.b.k.m.f r1 = r8.f10485i
            int r1 = r1.f10451f
            int r3 = r0 - r1
            int r0 = r12.f10452g
            int r1 = r12.f10451f
            int r4 = r0 + r1
            int r0 = r13.f10452g
            int r1 = r13.f10451f
            int r5 = r0 - r1
            int[] r1 = f10468k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m14038q(r1, r2, r3, r4, r5, r6, r7)
            f.f.b.k.m.g r0 = r8.f10481e
            int[] r1 = f10468k
            r1 = r1[r10]
            r0.mo11406d(r1)
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.g r0 = r0.f10481e
            int[] r1 = f10468k
            r1 = r1[r9]
            r0.mo11406d(r1)
        L_0x0125:
            return
        L_0x0126:
            f.f.b.k.m.f r0 = r8.f10484h
            boolean r1 = r0.f10455j
            if (r1 == 0) goto L_0x0183
            f.f.b.k.m.f r1 = r8.f10485i
            boolean r2 = r1.f10455j
            if (r2 == 0) goto L_0x0183
            boolean r2 = r12.f10448c
            if (r2 == 0) goto L_0x0182
            boolean r2 = r13.f10448c
            if (r2 != 0) goto L_0x013b
            goto L_0x0182
        L_0x013b:
            int r2 = r0.f10452g
            int r0 = r0.f10451f
            int r2 = r2 + r0
            int r0 = r1.f10452g
            int r1 = r1.f10451f
            int r3 = r0 - r1
            java.util.List<f.f.b.k.m.f> r0 = r12.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            int r1 = r12.f10451f
            int r4 = r0 + r1
            java.util.List<f.f.b.k.m.f> r0 = r13.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            int r1 = r13.f10451f
            int r5 = r0 - r1
            int[] r1 = f10468k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m14038q(r1, r2, r3, r4, r5, r6, r7)
            f.f.b.k.m.g r0 = r8.f10481e
            int[] r1 = f10468k
            r1 = r1[r10]
            r0.mo11406d(r1)
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.g r0 = r0.f10481e
            int[] r1 = f10468k
            r1 = r1[r9]
            r0.mo11406d(r1)
            goto L_0x0183
        L_0x0182:
            return
        L_0x0183:
            f.f.b.k.m.f r0 = r8.f10484h
            boolean r1 = r0.f10448c
            if (r1 == 0) goto L_0x01f4
            f.f.b.k.m.f r1 = r8.f10485i
            boolean r1 = r1.f10448c
            if (r1 == 0) goto L_0x01f4
            boolean r1 = r12.f10448c
            if (r1 == 0) goto L_0x01f4
            boolean r1 = r13.f10448c
            if (r1 != 0) goto L_0x0198
            goto L_0x01f4
        L_0x0198:
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            f.f.b.k.m.f r1 = r8.f10484h
            int r1 = r1.f10451f
            int r2 = r0 + r1
            f.f.b.k.m.f r0 = r8.f10485i
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            f.f.b.k.m.f r1 = r8.f10485i
            int r1 = r1.f10451f
            int r3 = r0 - r1
            java.util.List<f.f.b.k.m.f> r0 = r12.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            int r1 = r12.f10451f
            int r4 = r0 + r1
            java.util.List<f.f.b.k.m.f> r0 = r13.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            int r0 = r0.f10452g
            int r1 = r13.f10451f
            int r5 = r0 - r1
            int[] r1 = f10468k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m14038q(r1, r2, r3, r4, r5, r6, r7)
            f.f.b.k.m.g r0 = r8.f10481e
            int[] r1 = f10468k
            r1 = r1[r10]
            r0.mo11406d(r1)
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.g r0 = r0.f10481e
            int[] r1 = f10468k
            r1 = r1[r9]
            goto L_0x02d4
        L_0x01f4:
            return
        L_0x01f5:
            if (r0 == 0) goto L_0x026e
            if (r2 == 0) goto L_0x026e
            f.f.b.k.m.f r0 = r8.f10484h
            boolean r0 = r0.f10448c
            if (r0 == 0) goto L_0x026d
            f.f.b.k.m.f r0 = r8.f10485i
            boolean r0 = r0.f10448c
            if (r0 != 0) goto L_0x0206
            goto L_0x026d
        L_0x0206:
            f.f.b.k.e r0 = r8.f10478b
            float r0 = r0.mo11332r()
            f.f.b.k.m.f r1 = r8.f10484h
            java.util.List<f.f.b.k.m.f> r1 = r1.f10457l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.k.m.f r1 = (p086f.p103f.p107b.p108k.p109m.C3247f) r1
            int r1 = r1.f10452g
            f.f.b.k.m.f r2 = r8.f10484h
            int r2 = r2.f10451f
            int r1 = r1 + r2
            f.f.b.k.m.f r2 = r8.f10485i
            java.util.List<f.f.b.k.m.f> r2 = r2.f10457l
            java.lang.Object r2 = r2.get(r10)
            f.f.b.k.m.f r2 = (p086f.p103f.p107b.p108k.p109m.C3247f) r2
            int r2 = r2.f10452g
            f.f.b.k.m.f r4 = r8.f10485i
            int r4 = r4.f10451f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0249
            if (r14 == 0) goto L_0x0249
            if (r14 == r9) goto L_0x0236
            goto L_0x02f7
        L_0x0236:
            int r2 = r2 - r1
            int r1 = r8.mo11416g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo11416g(r2, r9)
            if (r2 == r3) goto L_0x025d
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x025b
        L_0x0249:
            int r2 = r2 - r1
            int r1 = r8.mo11416g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo11416g(r2, r9)
            if (r2 == r3) goto L_0x025d
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x025b:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x025d:
            f.f.b.k.m.g r0 = r8.f10481e
            r0.mo11406d(r1)
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.g r0 = r0.f10481e
            r0.mo11406d(r3)
            goto L_0x02f7
        L_0x026d:
            return
        L_0x026e:
            if (r1 == 0) goto L_0x02f7
            if (r4 == 0) goto L_0x02f7
            boolean r0 = r12.f10448c
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r13.f10448c
            if (r0 != 0) goto L_0x027b
            goto L_0x02d8
        L_0x027b:
            f.f.b.k.e r0 = r8.f10478b
            float r0 = r0.mo11332r()
            java.util.List<f.f.b.k.m.f> r1 = r12.f10457l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.k.m.f r1 = (p086f.p103f.p107b.p108k.p109m.C3247f) r1
            int r1 = r1.f10452g
            int r2 = r12.f10451f
            int r1 = r1 + r2
            java.util.List<f.f.b.k.m.f> r2 = r13.f10457l
            java.lang.Object r2 = r2.get(r10)
            f.f.b.k.m.f r2 = (p086f.p103f.p107b.p108k.p109m.C3247f) r2
            int r2 = r2.f10452g
            int r4 = r13.f10451f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02b5
            if (r14 == 0) goto L_0x02a2
            if (r14 == r9) goto L_0x02b5
            goto L_0x02f7
        L_0x02a2:
            int r2 = r2 - r1
            int r1 = r8.mo11416g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo11416g(r2, r10)
            if (r2 == r3) goto L_0x02c9
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02c7
        L_0x02b5:
            int r2 = r2 - r1
            int r1 = r8.mo11416g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo11416g(r2, r10)
            if (r2 == r3) goto L_0x02c9
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02c7:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02c9:
            f.f.b.k.m.g r0 = r8.f10481e
            r0.mo11406d(r3)
            f.f.b.k.e r0 = r8.f10478b
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.g r0 = r0.f10481e
        L_0x02d4:
            r0.mo11406d(r1)
            goto L_0x02f7
        L_0x02d8:
            return
        L_0x02d9:
            f.f.b.k.e r0 = r0.mo11281E()
            if (r0 == 0) goto L_0x02f7
            f.f.b.k.m.j r0 = r0.f10365d
            f.f.b.k.m.g r0 = r0.f10481e
            boolean r1 = r0.f10455j
            if (r1 == 0) goto L_0x02f7
            f.f.b.k.e r1 = r8.f10478b
            float r1 = r1.f10378o
            int r0 = r0.f10452g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x02f2:
            f.f.b.k.m.g r1 = r8.f10481e
            r1.mo11406d(r0)
        L_0x02f7:
            f.f.b.k.m.f r0 = r8.f10484h
            boolean r1 = r0.f10448c
            if (r1 == 0) goto L_0x0419
            f.f.b.k.m.f r1 = r8.f10485i
            boolean r2 = r1.f10448c
            if (r2 != 0) goto L_0x0305
            goto L_0x0419
        L_0x0305:
            boolean r0 = r0.f10455j
            if (r0 == 0) goto L_0x0314
            boolean r0 = r1.f10455j
            if (r0 == 0) goto L_0x0314
            f.f.b.k.m.g r0 = r8.f10481e
            boolean r0 = r0.f10455j
            if (r0 == 0) goto L_0x0314
            return
        L_0x0314:
            f.f.b.k.m.g r0 = r8.f10481e
            boolean r0 = r0.f10455j
            if (r0 != 0) goto L_0x035e
            f.f.b.k.e$b r0 = r8.f10480d
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x035e
            f.f.b.k.e r0 = r8.f10478b
            int r1 = r0.f10373j
            if (r1 != 0) goto L_0x035e
            boolean r0 = r0.mo11298T()
            if (r0 != 0) goto L_0x035e
            f.f.b.k.m.f r0 = r8.f10484h
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            f.f.b.k.m.f r1 = r8.f10485i
            java.util.List<f.f.b.k.m.f> r1 = r1.f10457l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.k.m.f r1 = (p086f.p103f.p107b.p108k.p109m.C3247f) r1
            int r0 = r0.f10452g
            f.f.b.k.m.f r2 = r8.f10484h
            int r3 = r2.f10451f
            int r0 = r0 + r3
            int r1 = r1.f10452g
            f.f.b.k.m.f r3 = r8.f10485i
            int r3 = r3.f10451f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo11406d(r0)
            f.f.b.k.m.f r0 = r8.f10485i
            r0.mo11406d(r1)
            f.f.b.k.m.g r0 = r8.f10481e
            r0.mo11406d(r3)
            return
        L_0x035e:
            f.f.b.k.m.g r0 = r8.f10481e
            boolean r0 = r0.f10455j
            if (r0 != 0) goto L_0x03c2
            f.f.b.k.e$b r0 = r8.f10480d
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03c2
            int r0 = r8.f10477a
            if (r0 != r9) goto L_0x03c2
            f.f.b.k.m.f r0 = r8.f10484h
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03c2
            f.f.b.k.m.f r0 = r8.f10485i
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03c2
            f.f.b.k.m.f r0 = r8.f10484h
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            f.f.b.k.m.f r1 = r8.f10485i
            java.util.List<f.f.b.k.m.f> r1 = r1.f10457l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.k.m.f r1 = (p086f.p103f.p107b.p108k.p109m.C3247f) r1
            int r0 = r0.f10452g
            f.f.b.k.m.f r2 = r8.f10484h
            int r2 = r2.f10451f
            int r0 = r0 + r2
            int r1 = r1.f10452g
            f.f.b.k.m.f r2 = r8.f10485i
            int r2 = r2.f10451f
            int r1 = r1 + r2
            int r1 = r1 - r0
            f.f.b.k.m.g r0 = r8.f10481e
            int r0 = r0.f10467m
            int r0 = java.lang.Math.min(r1, r0)
            f.f.b.k.e r1 = r8.f10478b
            int r2 = r1.f10377n
            int r1 = r1.f10376m
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03bd
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03bd:
            f.f.b.k.m.g r1 = r8.f10481e
            r1.mo11406d(r0)
        L_0x03c2:
            f.f.b.k.m.g r0 = r8.f10481e
            boolean r0 = r0.f10455j
            if (r0 != 0) goto L_0x03c9
            return
        L_0x03c9:
            f.f.b.k.m.f r0 = r8.f10484h
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.k.m.f r0 = (p086f.p103f.p107b.p108k.p109m.C3247f) r0
            f.f.b.k.m.f r1 = r8.f10485i
            java.util.List<f.f.b.k.m.f> r1 = r1.f10457l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.k.m.f r1 = (p086f.p103f.p107b.p108k.p109m.C3247f) r1
            int r2 = r0.f10452g
            f.f.b.k.m.f r3 = r8.f10484h
            int r3 = r3.f10451f
            int r2 = r2 + r3
            int r3 = r1.f10452g
            f.f.b.k.m.f r4 = r8.f10485i
            int r4 = r4.f10451f
            int r3 = r3 + r4
            f.f.b.k.e r4 = r8.f10478b
            float r4 = r4.mo11338u()
            if (r0 != r1) goto L_0x03f9
            int r2 = r0.f10452g
            int r3 = r1.f10452g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x03f9:
            int r3 = r3 - r2
            f.f.b.k.m.g r0 = r8.f10481e
            int r0 = r0.f10452g
            int r3 = r3 - r0
            f.f.b.k.m.f r0 = r8.f10484h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo11406d(r1)
            f.f.b.k.m.f r0 = r8.f10485i
            f.f.b.k.m.f r1 = r8.f10484h
            int r1 = r1.f10452g
            f.f.b.k.m.g r2 = r8.f10481e
            int r2 = r2.f10452g
            int r1 = r1 + r2
            r0.mo11406d(r1)
        L_0x0419:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3252j.mo11388a(f.f.b.k.m.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11389d() {
        C3226d dVar;
        C3247f fVar;
        C3247f fVar2;
        C3247f fVar3;
        Object obj;
        List list;
        C3247f fVar4;
        int i;
        C3247f fVar5;
        C3247f fVar6;
        C3229e E;
        C3229e E2;
        C3229e eVar = this.f10478b;
        if (eVar.f10359a) {
            this.f10481e.mo11406d(eVar.mo11293N());
        }
        if (!this.f10481e.f10455j) {
            C3229e.C3231b w = this.f10478b.mo11342w();
            this.f10480d = w;
            if (w != C3229e.C3231b.MATCH_CONSTRAINT) {
                if (w == C3229e.C3231b.MATCH_PARENT && (((E2 = this.f10478b.mo11281E()) != null && E2.mo11342w() == C3229e.C3231b.FIXED) || E2.mo11342w() == C3229e.C3231b.MATCH_PARENT)) {
                    int N = (E2.mo11293N() - this.f10478b.f10388y.mo11261b()) - this.f10478b.f10333A.mo11261b();
                    mo11414b(this.f10484h, E2.f10365d.f10484h, this.f10478b.f10388y.mo11261b());
                    mo11414b(this.f10485i, E2.f10365d.f10485i, -this.f10478b.f10333A.mo11261b());
                    this.f10481e.mo11406d(N);
                    return;
                } else if (this.f10480d == C3229e.C3231b.FIXED) {
                    this.f10481e.mo11406d(this.f10478b.mo11293N());
                }
            }
        } else if (this.f10480d == C3229e.C3231b.MATCH_PARENT && (((E = this.f10478b.mo11281E()) != null && E.mo11342w() == C3229e.C3231b.FIXED) || E.mo11342w() == C3229e.C3231b.MATCH_PARENT)) {
            mo11414b(this.f10484h, E.f10365d.f10484h, this.f10478b.f10388y.mo11261b());
            mo11414b(this.f10485i, E.f10365d.f10485i, -this.f10478b.f10333A.mo11261b());
            return;
        }
        int i2 = 1;
        if (this.f10481e.f10455j) {
            C3229e eVar2 = this.f10478b;
            if (eVar2.f10359a) {
                C3226d[] dVarArr = eVar2.f10339G;
                if (dVarArr[0].f10317d == null || dVarArr[1].f10317d == null) {
                    C3229e eVar3 = this.f10478b;
                    C3226d[] dVarArr2 = eVar3.f10339G;
                    if (dVarArr2[0].f10317d != null) {
                        C3247f h = mo11417h(dVarArr2[0]);
                        if (h != null) {
                            mo11414b(this.f10484h, h, this.f10478b.f10339G[0].mo11261b());
                        } else {
                            return;
                        }
                    } else if (dVarArr2[1].f10317d != null) {
                        C3247f h2 = mo11417h(dVarArr2[1]);
                        if (h2 != null) {
                            mo11414b(this.f10485i, h2, -this.f10478b.f10339G[1].mo11261b());
                            fVar6 = this.f10484h;
                            fVar5 = this.f10485i;
                            i = -this.f10481e.f10452g;
                            mo11414b(fVar6, fVar5, i);
                            return;
                        }
                        return;
                    } else if (!(eVar3 instanceof C3235h) && eVar3.mo11281E() != null && this.f10478b.mo11318k(C3226d.C3228b.CENTER).f10317d == null) {
                        mo11414b(this.f10484h, this.f10478b.mo11281E().f10365d.f10484h, this.f10478b.mo11294O());
                    } else {
                        return;
                    }
                    fVar6 = this.f10485i;
                    fVar5 = this.f10484h;
                    i = this.f10481e.f10452g;
                    mo11414b(fVar6, fVar5, i);
                    return;
                } else if (eVar2.mo11298T()) {
                    this.f10484h.f10451f = this.f10478b.f10339G[0].mo11261b();
                    fVar = this.f10485i;
                    dVar = this.f10478b.f10339G[1];
                    fVar.f10451f = -dVar.mo11261b();
                } else {
                    C3247f h3 = mo11417h(this.f10478b.f10339G[0]);
                    if (h3 != null) {
                        mo11414b(this.f10484h, h3, this.f10478b.f10339G[0].mo11261b());
                    }
                    C3247f h4 = mo11417h(this.f10478b.f10339G[1]);
                    if (h4 != null) {
                        mo11414b(this.f10485i, h4, -this.f10478b.f10339G[1].mo11261b());
                    }
                    this.f10484h.f10447b = true;
                    this.f10485i.f10447b = true;
                    return;
                }
            }
        }
        if (this.f10480d == C3229e.C3231b.MATCH_CONSTRAINT) {
            C3229e eVar4 = this.f10478b;
            int i3 = eVar4.f10373j;
            if (i3 == 2) {
                C3229e E3 = eVar4.mo11281E();
                if (E3 != null) {
                    C3249g gVar = E3.f10367e.f10481e;
                    this.f10481e.f10457l.add(gVar);
                    gVar.f10456k.add(this.f10481e);
                    C3249g gVar2 = this.f10481e;
                    gVar2.f10447b = true;
                    gVar2.f10456k.add(this.f10484h);
                    list = this.f10481e.f10456k;
                    obj = this.f10485i;
                }
            } else if (i3 == 3) {
                if (eVar4.f10374k == 3) {
                    this.f10484h.f10446a = this;
                    this.f10485i.f10446a = this;
                    C3255l lVar = eVar4.f10367e;
                    lVar.f10484h.f10446a = this;
                    lVar.f10485i.f10446a = this;
                    this.f10481e.f10446a = this;
                    if (eVar4.mo11300V()) {
                        this.f10481e.f10457l.add(this.f10478b.f10367e.f10481e);
                        this.f10478b.f10367e.f10481e.f10456k.add(this.f10481e);
                        C3255l lVar2 = this.f10478b.f10367e;
                        lVar2.f10481e.f10446a = this;
                        this.f10481e.f10457l.add(lVar2.f10484h);
                        this.f10481e.f10457l.add(this.f10478b.f10367e.f10485i);
                        this.f10478b.f10367e.f10484h.f10456k.add(this.f10481e);
                        list = this.f10478b.f10367e.f10485i.f10456k;
                        obj = this.f10481e;
                    } else if (this.f10478b.mo11298T()) {
                        this.f10478b.f10367e.f10481e.f10457l.add(this.f10481e);
                        list = this.f10481e.f10456k;
                        obj = this.f10478b.f10367e.f10481e;
                    } else {
                        fVar4 = this.f10478b.f10367e.f10481e;
                    }
                } else {
                    C3249g gVar3 = eVar4.f10367e.f10481e;
                    this.f10481e.f10457l.add(gVar3);
                    gVar3.f10456k.add(this.f10481e);
                    this.f10478b.f10367e.f10484h.f10456k.add(this.f10481e);
                    this.f10478b.f10367e.f10485i.f10456k.add(this.f10481e);
                    C3249g gVar4 = this.f10481e;
                    gVar4.f10447b = true;
                    gVar4.f10456k.add(this.f10484h);
                    this.f10481e.f10456k.add(this.f10485i);
                    this.f10484h.f10457l.add(this.f10481e);
                    fVar4 = this.f10485i;
                }
                list = fVar4.f10457l;
                obj = this.f10481e;
            }
            list.add(obj);
        }
        C3229e eVar5 = this.f10478b;
        C3226d[] dVarArr3 = eVar5.f10339G;
        if (dVarArr3[0].f10317d == null || dVarArr3[1].f10317d == null) {
            C3229e eVar6 = this.f10478b;
            C3226d[] dVarArr4 = eVar6.f10339G;
            if (dVarArr4[0].f10317d != null) {
                C3247f h5 = mo11417h(dVarArr4[0]);
                if (h5 != null) {
                    mo11414b(this.f10484h, h5, this.f10478b.f10339G[0].mo11261b());
                } else {
                    return;
                }
            } else if (dVarArr4[1].f10317d != null) {
                C3247f h6 = mo11417h(dVarArr4[1]);
                if (h6 != null) {
                    mo11414b(this.f10485i, h6, -this.f10478b.f10339G[1].mo11261b());
                    fVar3 = this.f10484h;
                    fVar2 = this.f10485i;
                    i2 = -1;
                    mo11415c(fVar3, fVar2, i2, this.f10481e);
                }
                return;
            } else if (!(eVar6 instanceof C3235h) && eVar6.mo11281E() != null) {
                mo11414b(this.f10484h, this.f10478b.mo11281E().f10365d.f10484h, this.f10478b.mo11294O());
            } else {
                return;
            }
            fVar3 = this.f10485i;
            fVar2 = this.f10484h;
            mo11415c(fVar3, fVar2, i2, this.f10481e);
        } else if (eVar5.mo11298T()) {
            this.f10484h.f10451f = this.f10478b.f10339G[0].mo11261b();
            fVar = this.f10485i;
            dVar = this.f10478b.f10339G[1];
            fVar.f10451f = -dVar.mo11261b();
        } else {
            C3247f h7 = mo11417h(this.f10478b.f10339G[0]);
            C3247f h8 = mo11417h(this.f10478b.f10339G[1]);
            h7.mo11404b(this);
            h8.mo11404b(this);
            this.f10486j = C3257m.C3259b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo11390e() {
        C3247f fVar = this.f10484h;
        if (fVar.f10455j) {
            this.f10478b.mo11278C0(fVar.f10452g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11391f() {
        this.f10479c = null;
        this.f10484h.mo11405c();
        this.f10485i.mo11405c();
        this.f10481e.mo11405c();
        this.f10483g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo11393m() {
        return this.f10480d != C3229e.C3231b.MATCH_CONSTRAINT || this.f10478b.f10373j == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo11408r() {
        this.f10483g = false;
        this.f10484h.mo11405c();
        this.f10484h.f10455j = false;
        this.f10485i.mo11405c();
        this.f10485i.f10455j = false;
        this.f10481e.f10455j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f10478b.mo11328p();
    }
}
