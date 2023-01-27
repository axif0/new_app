package p148g.p189d.p190a.p200b.p204k0;

/* renamed from: g.d.a.b.k0.j */
public final class C3921j {

    /* renamed from: h */
    private static final String[] f11895h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    private static final int[] f11896i = {44100, 48000, 32000};

    /* renamed from: j */
    private static final int[] f11897j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* renamed from: k */
    private static final int[] f11898k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    private static final int[] f11899l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    private static final int[] f11900m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* renamed from: n */
    private static final int[] f11901n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f11902a;

    /* renamed from: b */
    public String f11903b;

    /* renamed from: c */
    public int f11904c;

    /* renamed from: d */
    public int f11905d;

    /* renamed from: e */
    public int f11906e;

    /* renamed from: f */
    public int f11907f;

    /* renamed from: g */
    public int f11908g;

    /* renamed from: a */
    public static int m16469a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f11896i[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f11897j[i4 - 1] : f11898k[i4 - 1]) * 12000) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f11899l[i4 - 1] : f11900m[i4 - 1] : f11901n[i4 - 1];
        int i9 = 144000;
        if (i2 == 3) {
            return ((i8 * 144000) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72000;
        }
        return ((i9 * i8) / i6) + i7;
    }

    /* renamed from: b */
    public static boolean m16470b(int i, C3921j jVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = f11896i[i5];
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i10 = i9;
        int i11 = (i >>> 9) & 1;
        int i12 = 1152;
        if (i3 == 3) {
            i8 = i2 == 3 ? f11897j[i4 - 1] : f11898k[i4 - 1];
            i7 = (((i8 * 12000) / i10) + i11) * 4;
            i6 = 384;
        } else {
            int i13 = 144000;
            if (i2 == 3) {
                i8 = i3 == 2 ? f11899l[i4 - 1] : f11900m[i4 - 1];
                i7 = ((144000 * i8) / i10) + i11;
                i6 = 1152;
            } else {
                i8 = f11901n[i4 - 1];
                if (i3 == 1) {
                    i12 = 576;
                }
                if (i3 == 1) {
                    i13 = 72000;
                }
                i7 = ((i13 * i8) / i10) + i11;
                i6 = i12;
            }
        }
        jVar.m16471c(i2, f11895h[3 - i3], i7, i10, ((i >> 6) & 3) == 3 ? 1 : 2, i8 * 1000, i6);
        return true;
    }

    /* renamed from: c */
    private void m16471c(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f11902a = i;
        this.f11903b = str;
        this.f11904c = i2;
        this.f11905d = i3;
        this.f11906e = i4;
        this.f11907f = i5;
        this.f11908g = i6;
    }
}
