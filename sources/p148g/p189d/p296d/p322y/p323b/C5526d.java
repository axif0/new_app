package p148g.p189d.p296d.p322y.p323b;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.p304s.C5413c;
import p148g.p189d.p296d.p304s.C5414d;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p304s.C5422l;

/* renamed from: g.d.d.y.b.d */
final class C5526d {

    /* renamed from: a */
    private static final char[] f15972a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: g.d.d.y.b.d$a */
    static /* synthetic */ class C5527a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15973a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                g.d.d.y.b.h[] r0 = p148g.p189d.p296d.p322y.p323b.C5531h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15973a = r0
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x003e }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x0049 }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x0054 }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x0060 }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x006c }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f15973a     // Catch:{ NoSuchFieldError -> 0x0078 }
                g.d.d.y.b.h r1 = p148g.p189d.p296d.p322y.p323b.C5531h.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p322y.p323b.C5526d.C5527a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static C5415e m22840a(byte[] bArr, C5533j jVar, C5529f fVar, Map<C5373e, ?> map) throws C5374f {
        C5531h hVar;
        C5533j jVar2 = jVar;
        C5413c cVar = new C5413c(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i = 1;
        ArrayList arrayList = new ArrayList(1);
        C5414d dVar = null;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            try {
                C5531h e = cVar.mo15680a() < 4 ? C5531h.TERMINATOR : C5531h.m22857e(cVar.mo15683d(4));
                switch (C5527a.f15973a[e.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        hVar = e;
                        z = true;
                        break;
                    case 8:
                        if (cVar.mo15680a() >= 16) {
                            int d = cVar.mo15683d(8);
                            i3 = cVar.mo15683d(8);
                            i2 = d;
                            break;
                        } else {
                            throw C5374f.m22179a();
                        }
                    case 9:
                        dVar = C5414d.m22318e(m22846g(cVar));
                        if (dVar == null) {
                            throw C5374f.m22179a();
                        }
                        break;
                    case 10:
                        int d2 = cVar.mo15683d(4);
                        int d3 = cVar.mo15683d(e.mo15926g(jVar2));
                        if (d2 == i) {
                            m22843d(cVar, sb, d3);
                            break;
                        }
                        break;
                    default:
                        int d4 = cVar.mo15683d(e.mo15926g(jVar2));
                        int i4 = C5527a.f15973a[e.ordinal()];
                        if (i4 != i) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    hVar = e;
                                    m22842c(cVar, sb, d4, dVar, arrayList, map);
                                    break;
                                } else if (i4 == 4) {
                                    m22844e(cVar, sb, d4);
                                    break;
                                } else {
                                    throw C5374f.m22179a();
                                }
                            } else {
                                hVar = e;
                                m22841b(cVar, sb, d4, z);
                                break;
                            }
                        } else {
                            hVar = e;
                            m22845f(cVar, sb, d4);
                            break;
                        }
                }
                hVar = e;
                if (hVar == C5531h.TERMINATOR) {
                    return new C5415e(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i2, i3);
                }
                i = 1;
            } catch (IllegalArgumentException unused) {
                throw C5374f.m22179a();
            }
        }
    }

    /* renamed from: b */
    private static void m22841b(C5413c cVar, StringBuilder sb, int i, boolean z) throws C5374f {
        while (i > 1) {
            if (cVar.mo15680a() >= 11) {
                int d = cVar.mo15683d(11);
                sb.append(m22847h(d / 45));
                sb.append(m22847h(d % 45));
                i -= 2;
            } else {
                throw C5374f.m22179a();
            }
        }
        if (i == 1) {
            if (cVar.mo15680a() >= 6) {
                sb.append(m22847h(cVar.mo15683d(6)));
            } else {
                throw C5374f.m22179a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m22842c(C5413c cVar, StringBuilder sb, int i, C5414d dVar, Collection<byte[]> collection, Map<C5373e, ?> map) throws C5374f {
        if ((i << 3) <= cVar.mo15680a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo15683d(8);
            }
            try {
                sb.append(new String(bArr, dVar == null ? C5422l.m22355a(bArr, map) : dVar.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C5374f.m22179a();
            }
        } else {
            throw C5374f.m22179a();
        }
    }

    /* renamed from: d */
    private static void m22843d(C5413c cVar, StringBuilder sb, int i) throws C5374f {
        if (i * 13 <= cVar.mo15680a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo15683d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C5374f.m22179a();
            }
        } else {
            throw C5374f.m22179a();
        }
    }

    /* renamed from: e */
    private static void m22844e(C5413c cVar, StringBuilder sb, int i) throws C5374f {
        if (i * 13 <= cVar.mo15680a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo15683d(13);
                int i3 = (d % 192) | ((d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C5374f.m22179a();
            }
        } else {
            throw C5374f.m22179a();
        }
    }

    /* renamed from: f */
    private static void m22845f(C5413c cVar, StringBuilder sb, int i) throws C5374f {
        while (i >= 3) {
            if (cVar.mo15680a() >= 10) {
                int d = cVar.mo15683d(10);
                if (d < 1000) {
                    sb.append(m22847h(d / 100));
                    sb.append(m22847h((d / 10) % 10));
                    sb.append(m22847h(d % 10));
                    i -= 3;
                } else {
                    throw C5374f.m22179a();
                }
            } else {
                throw C5374f.m22179a();
            }
        }
        if (i == 2) {
            if (cVar.mo15680a() >= 7) {
                int d2 = cVar.mo15683d(7);
                if (d2 < 100) {
                    sb.append(m22847h(d2 / 10));
                    sb.append(m22847h(d2 % 10));
                    return;
                }
                throw C5374f.m22179a();
            }
            throw C5374f.m22179a();
        } else if (i != 1) {
        } else {
            if (cVar.mo15680a() >= 4) {
                int d3 = cVar.mo15683d(4);
                if (d3 < 10) {
                    sb.append(m22847h(d3));
                    return;
                }
                throw C5374f.m22179a();
            }
            throw C5374f.m22179a();
        }
    }

    /* renamed from: g */
    private static int m22846g(C5413c cVar) throws C5374f {
        int d = cVar.mo15683d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & 192) == 128) {
            return cVar.mo15683d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo15683d(16) | ((d & 31) << 16);
        }
        throw C5374f.m22179a();
    }

    /* renamed from: h */
    private static char m22847h(int i) throws C5374f {
        char[] cArr = f15972a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C5374f.m22179a();
    }
}
