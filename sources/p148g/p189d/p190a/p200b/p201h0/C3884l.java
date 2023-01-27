package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import p148g.p189d.p190a.p200b.p201h0.C3856d;

/* renamed from: g.d.a.b.h0.l */
final class C3884l implements C3856d {

    /* renamed from: b */
    private int f11744b = -1;

    /* renamed from: c */
    private int f11745c = -1;

    /* renamed from: d */
    private int f11746d = 0;

    /* renamed from: e */
    private ByteBuffer f11747e;

    /* renamed from: f */
    private ByteBuffer f11748f;

    /* renamed from: g */
    private boolean f11749g;

    public C3884l() {
        ByteBuffer byteBuffer = C3856d.f11609a;
        this.f11747e = byteBuffer;
        this.f11748f = byteBuffer;
    }

    /* renamed from: b */
    public void mo12576b() {
        flush();
        this.f11747e = C3856d.f11609a;
        this.f11744b = -1;
        this.f11745c = -1;
        this.f11746d = 0;
    }

    /* renamed from: c */
    public boolean mo12577c() {
        return this.f11749g && this.f11748f == C3856d.f11609a;
    }

    /* renamed from: d */
    public boolean mo12578d() {
        int i = this.f11746d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: e */
    public ByteBuffer mo12579e() {
        ByteBuffer byteBuffer = this.f11748f;
        this.f11748f = C3856d.f11609a;
        return byteBuffer;
    }

    /* renamed from: f */
    public void mo12580f() {
        this.f11749g = true;
    }

    public void flush() {
        this.f11748f = C3856d.f11609a;
        this.f11749g = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12582g(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f11746d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f11747e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f11747e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f11747e
            r2.clear()
        L_0x003f:
            int r2 = r7.f11746d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11747e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11747e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11747e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11747e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11747e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11747e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f11747e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f11747e
            r7.f11748f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p201h0.C3884l.mo12582g(java.nio.ByteBuffer):void");
    }

    /* renamed from: h */
    public int mo12583h() {
        return this.f11745c;
    }

    /* renamed from: i */
    public boolean mo12584i(int i, int i2, int i3) throws C3856d.C3857a {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C3856d.C3857a(i, i2, i3);
        } else if (this.f11744b == i && this.f11745c == i2 && this.f11746d == i3) {
            return false;
        } else {
            this.f11744b = i;
            this.f11745c = i2;
            this.f11746d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f11747e = C3856d.f11609a;
            return true;
        }
    }

    /* renamed from: j */
    public int mo12585j() {
        return this.f11744b;
    }

    /* renamed from: k */
    public int mo12586k() {
        return 2;
    }
}
