package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.h0.a */
public final class C3849a {

    /* renamed from: a */
    private static final int[] f11587a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f11588b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f11589c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f11590d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f11591e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f11592f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g.d.a.b.h0.a$b */
    public static final class C3851b {

        /* renamed from: a */
        public final String f11593a;

        /* renamed from: b */
        public final int f11594b;

        /* renamed from: c */
        public final int f11595c;

        /* renamed from: d */
        public final int f11596d;

        /* renamed from: e */
        public final int f11597e;

        private C3851b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f11593a = str;
            this.f11595c = i2;
            this.f11594b = i3;
            this.f11596d = i4;
            this.f11597e = i5;
        }
    }

    /* renamed from: a */
    public static int m16077a() {
        return 1536;
    }

    /* renamed from: b */
    private static int m16078b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f11588b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f11592f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f11591e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: c */
    public static C4109n m16079c(C4274m mVar, String str, String str2, C3900a aVar) {
        int i = f11588b[(mVar.mo13479x() & 192) >> 6];
        int x = mVar.mo13479x();
        int i2 = f11590d[(x & 56) >> 3];
        if ((x & 4) != 0) {
            i2++;
        }
        return C4109n.m17338h(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, aVar, 0, str2);
    }

    /* renamed from: d */
    public static C3851b m16080d(C4273l lVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        C4273l lVar2 = lVar;
        int e = lVar.mo13433e();
        lVar2.mo13443o(40);
        boolean z = lVar2.mo13436h(5) == 16;
        lVar2.mo13441m(e);
        if (z) {
            lVar2.mo13443o(16);
            int h = lVar2.mo13436h(2);
            lVar2.mo13443o(3);
            int h2 = (lVar2.mo13436h(11) + 1) * 2;
            int h3 = lVar2.mo13436h(2);
            if (h3 == 3) {
                i6 = f11589c[lVar2.mo13436h(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = lVar2.mo13436h(2);
                i7 = f11587a[i8];
                i6 = f11588b[h3];
            }
            int i10 = i7 * 256;
            int h4 = lVar2.mo13436h(3);
            boolean g = lVar.mo13435g();
            int i11 = f11590d[h4] + (g ? 1 : 0);
            lVar2.mo13443o(10);
            if (lVar.mo13435g()) {
                lVar2.mo13443o(8);
            }
            if (h4 == 0) {
                lVar2.mo13443o(5);
                if (lVar.mo13435g()) {
                    lVar2.mo13443o(8);
                }
            }
            if (h == 1 && lVar.mo13435g()) {
                lVar2.mo13443o(16);
            }
            if (lVar.mo13435g()) {
                if (h4 > 2) {
                    lVar2.mo13443o(2);
                }
                if ((h4 & 1) != 0 && h4 > 2) {
                    lVar2.mo13443o(6);
                }
                if ((h4 & 4) != 0) {
                    lVar2.mo13443o(6);
                }
                if (g && lVar.mo13435g()) {
                    lVar2.mo13443o(5);
                }
                if (h == 0) {
                    if (lVar.mo13435g()) {
                        lVar2.mo13443o(6);
                    }
                    if (h4 == 0 && lVar.mo13435g()) {
                        lVar2.mo13443o(6);
                    }
                    if (lVar.mo13435g()) {
                        lVar2.mo13443o(6);
                    }
                    int h5 = lVar2.mo13436h(2);
                    if (h5 == 1) {
                        lVar2.mo13443o(5);
                    } else if (h5 == 2) {
                        lVar2.mo13443o(12);
                    } else if (h5 == 3) {
                        int h6 = lVar2.mo13436h(5);
                        if (lVar.mo13435g()) {
                            lVar2.mo13443o(5);
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(4);
                            }
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(4);
                            }
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(4);
                            }
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(4);
                            }
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(4);
                            }
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(4);
                            }
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(4);
                            }
                            if (lVar.mo13435g()) {
                                if (lVar.mo13435g()) {
                                    lVar2.mo13443o(4);
                                }
                                if (lVar.mo13435g()) {
                                    lVar2.mo13443o(4);
                                }
                            }
                        }
                        if (lVar.mo13435g()) {
                            lVar2.mo13443o(5);
                            if (lVar.mo13435g()) {
                                lVar2.mo13443o(7);
                                if (lVar.mo13435g()) {
                                    lVar2.mo13443o(8);
                                }
                            }
                        }
                        lVar2.mo13443o((h6 + 2) * 8);
                        lVar.mo13431c();
                    }
                    if (h4 < 2) {
                        if (lVar.mo13435g()) {
                            lVar2.mo13443o(14);
                        }
                        if (h4 == 0 && lVar.mo13435g()) {
                            lVar2.mo13443o(14);
                        }
                    }
                    if (lVar.mo13435g()) {
                        if (i8 == 0) {
                            lVar2.mo13443o(5);
                        } else {
                            for (int i12 = 0; i12 < i7; i12++) {
                                if (lVar.mo13435g()) {
                                    lVar2.mo13443o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (lVar.mo13435g()) {
                lVar2.mo13443o(5);
                if (h4 == 2) {
                    lVar2.mo13443o(4);
                }
                if (h4 >= 6) {
                    lVar2.mo13443o(2);
                }
                if (lVar.mo13435g()) {
                    lVar2.mo13443o(8);
                }
                if (h4 == 0 && lVar.mo13435g()) {
                    lVar2.mo13443o(8);
                }
                i9 = 3;
                if (h3 < 3) {
                    lVar.mo13442n();
                }
            } else {
                i9 = 3;
            }
            if (h == 0 && i8 != i9) {
                lVar.mo13442n();
            }
            if (h == 2 && (i8 == i9 || lVar.mo13435g())) {
                lVar2.mo13443o(6);
            }
            str = (lVar.mo13435g() && lVar2.mo13436h(6) == 1 && lVar2.mo13436h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = h;
            i2 = h2;
            i3 = i6;
            i = i10;
            i4 = i11;
        } else {
            lVar2.mo13443o(32);
            int h7 = lVar2.mo13436h(2);
            int b = m16078b(h7, lVar2.mo13436h(6));
            lVar2.mo13443o(8);
            int h8 = lVar2.mo13436h(3);
            if (!((h8 & 1) == 0 || h8 == 1)) {
                lVar2.mo13443o(2);
            }
            if ((h8 & 4) != 0) {
                lVar2.mo13443o(2);
            }
            if (h8 == 2) {
                lVar2.mo13443o(2);
            }
            str = "audio/ac3";
            i2 = b;
            i3 = f11588b[h7];
            i4 = f11590d[h8] + (lVar.mo13435g() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new C3851b(str, i5, i4, i3, i2, i);
    }

    /* renamed from: e */
    public static int m16081e(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return m16078b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: f */
    public static C4109n m16082f(C4274m mVar, String str, String str2, C3900a aVar) {
        C4274m mVar2 = mVar;
        mVar.mo13455K(2);
        int i = f11588b[(mVar.mo13479x() & 192) >> 6];
        int x = mVar.mo13479x();
        int i2 = f11590d[(x & 14) >> 1];
        if ((x & 1) != 0) {
            i2++;
        }
        if (((mVar.mo13479x() & 30) >> 1) > 0 && (2 & mVar.mo13479x()) != 0) {
            i2 += 2;
        }
        return C4109n.m17338h(str, (mVar.mo13456a() <= 0 || (mVar.mo13479x() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, (List<byte[]>) null, aVar, 0, str2);
    }

    /* renamed from: g */
    public static int m16083g(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f11587a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: h */
    public static int m16084h(ByteBuffer byteBuffer) {
        if (byteBuffer.getInt(byteBuffer.position() + 4) != -1167101192) {
            return 0;
        }
        return 40 << (byteBuffer.get(byteBuffer.position() + 8) & 7);
    }

    /* renamed from: i */
    public static int m16085i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && bArr[7] == -70) {
            return 40 << (bArr[8] & 7);
        }
        return 0;
    }
}
