package p148g.p189d.p296d.p314w;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p148g.p189d.p296d.C5371c;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5379k;
import p148g.p189d.p296d.C5380l;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5382n;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.k */
public abstract class C5457k implements C5379k {
    /* renamed from: e */
    private C5381m m22505e(C5371c cVar, Map<C5373e, ?> map) throws C5377i {
        int i;
        Map<C5373e, ?> map2;
        EnumMap enumMap = map;
        int d = cVar.mo15591d();
        int c = cVar.mo15590c();
        C5411a aVar = new C5411a(d);
        char c2 = 0;
        int i2 = 1;
        boolean z = enumMap != null && enumMap.containsKey(C5373e.TRY_HARDER);
        int max = Math.max(1, c >> (z ? 8 : 5));
        int i3 = z ? c : 15;
        int i4 = c / 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if (!((i5 & 1) == 0)) {
                i7 = -i7;
            }
            int i8 = (i7 * max) + i4;
            if (i8 < 0 || i8 >= c) {
                break;
            }
            try {
                aVar = cVar.mo15589b(i8, aVar);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i2) {
                        aVar.mo15658n();
                        if (enumMap != null && enumMap.containsKey(C5373e.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap2 = new EnumMap(C5373e.class);
                            enumMap2.putAll(enumMap);
                            enumMap2.remove(C5373e.NEED_RESULT_POINT_CALLBACK);
                            enumMap = enumMap2;
                        }
                    }
                    try {
                        C5381m d2 = mo15752d(i8, aVar, enumMap);
                        if (i9 == i2) {
                            d2.mo15616h(C5382n.ORIENTATION, 180);
                            C5383o[] e = d2.mo15613e();
                            if (e != null) {
                                map2 = enumMap;
                                float f = (float) d;
                                try {
                                    i = d;
                                } catch (C5380l unused) {
                                    i = d;
                                    i9++;
                                    enumMap = map2;
                                    d = i;
                                    c2 = 0;
                                    i2 = 1;
                                }
                                try {
                                    e[0] = new C5383o((f - e[c2].mo15618c()) - 1.0f, e[c2].mo15619d());
                                    try {
                                        e[1] = new C5383o((f - e[1].mo15618c()) - 1.0f, e[1].mo15619d());
                                    } catch (C5380l unused2) {
                                        continue;
                                    }
                                } catch (C5380l unused3) {
                                    i9++;
                                    enumMap = map2;
                                    d = i;
                                    c2 = 0;
                                    i2 = 1;
                                }
                            }
                        }
                        return d2;
                    } catch (C5380l unused4) {
                        map2 = enumMap;
                        i = d;
                        i9++;
                        enumMap = map2;
                        d = i;
                        c2 = 0;
                        i2 = 1;
                    }
                }
                continue;
            } catch (C5377i unused5) {
            }
            i5 = i6;
            d = d;
            c2 = 0;
            i2 = 1;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: f */
    protected static float m22506f(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: g */
    protected static void m22507g(C5411a aVar, int i, int[] iArr) throws C5377i {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i3 = aVar.mo15656i();
        if (i < i3) {
            boolean z = !aVar.mo15650d(i);
            while (i < i3) {
                if (aVar.mo15650d(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != i3) {
                throw C5377i.m22193a();
            }
            return;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: h */
    protected static void m22508h(C5411a aVar, int i, int[] iArr) throws C5377i {
        int length = iArr.length;
        boolean d = aVar.mo15650d(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo15650d(i) != d) {
                length--;
                d = !d;
            }
        }
        if (length < 0) {
            m22507g(aVar, i + 1, iArr);
            return;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: a */
    public C5381m mo15603a(C5371c cVar, Map<C5373e, ?> map) throws C5377i, C5374f {
        try {
            return m22505e(cVar, map);
        } catch (C5377i e) {
            if (!(map != null && map.containsKey(C5373e.TRY_HARDER)) || !cVar.mo15592e()) {
                throw e;
            }
            cVar.mo15593f();
            throw null;
        }
    }

    /* renamed from: b */
    public void mo15604b() {
    }

    /* renamed from: c */
    public C5381m mo15605c(C5371c cVar) throws C5377i, C5374f {
        return mo15603a(cVar, (Map<C5373e, ?>) null);
    }

    /* renamed from: d */
    public abstract C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f;
}
