package p148g.p189d.p190a.p200b.p219o0.p220m;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p219o0.C4160i;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.m.a */
public final class C4164a extends C4171d {

    /* renamed from: s */
    private static final int[] f13209s = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: t */
    private static final int[] f13210t = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: u */
    private static final int[] f13211u = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: v */
    private static final int[] f13212v = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: w */
    private static final int[] f13213w = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: x */
    private static final int[] f13214x = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: y */
    private static final int[] f13215y = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: g */
    private final C4274m f13216g = new C4274m();

    /* renamed from: h */
    private final int f13217h;

    /* renamed from: i */
    private final int f13218i;

    /* renamed from: j */
    private final ArrayList<C4165a> f13219j = new ArrayList<>();

    /* renamed from: k */
    private C4165a f13220k = new C4165a(0, 4);

    /* renamed from: l */
    private List<C4152b> f13221l;

    /* renamed from: m */
    private List<C4152b> f13222m;

    /* renamed from: n */
    private int f13223n;

    /* renamed from: o */
    private int f13224o;

    /* renamed from: p */
    private boolean f13225p;

    /* renamed from: q */
    private byte f13226q;

    /* renamed from: r */
    private byte f13227r;

    /* renamed from: g.d.a.b.o0.m.a$a */
    private static class C4165a {

        /* renamed from: a */
        private final List<CharacterStyle> f13228a = new ArrayList();

        /* renamed from: b */
        private final List<C4166a> f13229b = new ArrayList();

        /* renamed from: c */
        private final List<SpannableString> f13230c = new ArrayList();

        /* renamed from: d */
        private final SpannableStringBuilder f13231d = new SpannableStringBuilder();

        /* renamed from: e */
        private int f13232e;

        /* renamed from: f */
        private int f13233f;

        /* renamed from: g */
        private int f13234g;

        /* renamed from: h */
        private int f13235h;

        /* renamed from: i */
        private int f13236i;

        /* renamed from: j */
        private int f13237j;

        /* renamed from: g.d.a.b.o0.m.a$a$a */
        private static class C4166a {

            /* renamed from: a */
            public final CharacterStyle f13238a;

            /* renamed from: b */
            public final int f13239b;

            /* renamed from: c */
            public final int f13240c;

            public C4166a(CharacterStyle characterStyle, int i, int i2) {
                this.f13238a = characterStyle;
                this.f13239b = i;
                this.f13240c = i2;
            }
        }

        public C4165a(int i, int i2) {
            mo13211g(i);
            mo13213i(i2);
        }

        /* renamed from: a */
        public void mo13205a(char c) {
            this.f13231d.append(c);
        }

        /* renamed from: b */
        public void mo13206b() {
            int length = this.f13231d.length();
            if (length > 0) {
                this.f13231d.delete(length - 1, length);
            }
        }

        /* renamed from: c */
        public C4152b mo13207c() {
            int i;
            float f;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f13230c.size(); i4++) {
                spannableStringBuilder.append(this.f13230c.get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(mo13208d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.f13233f + this.f13234g;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (this.f13235h == 2 && (Math.abs(i6) < 3 || length < 0)) {
                f = 0.5f;
                i = 1;
            } else if (this.f13235h != 2 || i6 <= 0) {
                f = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
                i = 0;
            } else {
                f = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                i = 2;
            }
            if (this.f13235h == 1 || (i3 = this.f13232e) > 7) {
                i3 = (this.f13232e - 15) - 2;
                i2 = 2;
            } else {
                i2 = 0;
            }
            return new C4152b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f, i, Float.MIN_VALUE);
        }

        /* renamed from: d */
        public SpannableString mo13208d() {
            int length = this.f13231d.length();
            int i = 0;
            for (int i2 = 0; i2 < this.f13228a.size(); i2++) {
                this.f13231d.setSpan(this.f13228a.get(i2), 0, length, 33);
            }
            while (i < this.f13229b.size()) {
                C4166a aVar = this.f13229b.get(i);
                int size = this.f13229b.size();
                int i3 = aVar.f13240c;
                this.f13231d.setSpan(aVar.f13238a, aVar.f13239b, i < size - i3 ? this.f13229b.get(i3 + i).f13239b : length, 33);
                i++;
            }
            if (this.f13237j != -1) {
                this.f13231d.setSpan(new UnderlineSpan(), this.f13237j, length, 33);
            }
            return new SpannableString(this.f13231d);
        }

        /* renamed from: e */
        public int mo13209e() {
            return this.f13232e;
        }

        /* renamed from: f */
        public boolean mo13210f() {
            return this.f13228a.isEmpty() && this.f13229b.isEmpty() && this.f13230c.isEmpty() && this.f13231d.length() == 0;
        }

        /* renamed from: g */
        public void mo13211g(int i) {
            this.f13235h = i;
            this.f13228a.clear();
            this.f13229b.clear();
            this.f13230c.clear();
            this.f13231d.clear();
            this.f13232e = 15;
            this.f13233f = 0;
            this.f13234g = 0;
            this.f13237j = -1;
        }

        /* renamed from: h */
        public void mo13212h() {
            this.f13230c.add(mo13208d());
            this.f13231d.clear();
            this.f13228a.clear();
            this.f13229b.clear();
            this.f13237j = -1;
            int min = Math.min(this.f13236i, this.f13232e);
            while (this.f13230c.size() >= min) {
                this.f13230c.remove(0);
            }
        }

        /* renamed from: i */
        public void mo13213i(int i) {
            this.f13236i = i;
        }

        /* renamed from: j */
        public void mo13214j(int i) {
            this.f13233f = i;
        }

        /* renamed from: k */
        public void mo13215k(CharacterStyle characterStyle, int i) {
            this.f13229b.add(new C4166a(characterStyle, this.f13231d.length(), i));
        }

        /* renamed from: l */
        public void mo13216l(CharacterStyle characterStyle) {
            this.f13228a.add(characterStyle);
        }

        /* renamed from: m */
        public void mo13217m(int i) {
            this.f13232e = i;
        }

        /* renamed from: n */
        public void mo13218n(int i) {
            this.f13234g = i;
        }

        /* renamed from: o */
        public void mo13219o(boolean z) {
            if (z) {
                this.f13237j = this.f13231d.length();
            } else if (this.f13237j != -1) {
                this.f13231d.setSpan(new UnderlineSpan(), this.f13237j, this.f13231d.length(), 33);
                this.f13237j = -1;
            }
        }

        public String toString() {
            return this.f13231d.toString();
        }
    }

    public C4164a(String str, int i) {
        this.f13217h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 3 || i == 4) {
            this.f13218i = 2;
        } else {
            this.f13218i = 1;
        }
        m17612C(0);
        m17611B();
    }

    /* renamed from: A */
    private static boolean m17610A(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: B */
    private void m17611B() {
        this.f13220k.mo13211g(this.f13223n);
        this.f13219j.clear();
        this.f13219j.add(this.f13220k);
    }

    /* renamed from: C */
    private void m17612C(int i) {
        int i2 = this.f13223n;
        if (i2 != i) {
            this.f13223n = i;
            m17611B();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f13221l = null;
            }
        }
    }

    /* renamed from: D */
    private void m17613D(int i) {
        this.f13224o = i;
        this.f13220k.mo13213i(i);
    }

    /* renamed from: n */
    private static char m17614n(byte b) {
        return (char) f13212v[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: o */
    private List<C4152b> m17615o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f13219j.size(); i++) {
            C4152b c = this.f13219j.get(i).mo13207c();
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    private static char m17616p(byte b) {
        return (char) f13214x[b & 31];
    }

    /* renamed from: q */
    private static char m17617q(byte b) {
        return (char) f13215y[b & 31];
    }

    /* renamed from: r */
    private static char m17618r(byte b) {
        return (char) f13213w[b & 15];
    }

    /* renamed from: s */
    private boolean m17619s(byte b, byte b2) {
        boolean z = m17626z(b);
        if (z) {
            if (this.f13225p && this.f13226q == b && this.f13227r == b2) {
                this.f13225p = false;
                return true;
            }
            this.f13225p = true;
            this.f13226q = b;
            this.f13227r = b2;
        }
        if (m17623w(b, b2)) {
            m17620t(b2);
        } else if (m17625y(b, b2)) {
            m17622v(b, b2);
        } else if (m17610A(b, b2)) {
            this.f13220k.mo13218n(b2 - 32);
        } else if (m17624x(b, b2)) {
            m17621u(b2);
        }
        return z;
    }

    /* renamed from: t */
    private void m17620t(byte b) {
        this.f13220k.mo13219o((b & 1) == 1);
        int i = (b >> 1) & 15;
        if (i == 7) {
            this.f13220k.mo13215k(new StyleSpan(2), 2);
            this.f13220k.mo13215k(new ForegroundColorSpan(-1), 1);
            return;
        }
        this.f13220k.mo13215k(new ForegroundColorSpan(f13211u[i]), 1);
    }

    /* renamed from: u */
    private void m17621u(byte b) {
        if (b == 32) {
            m17612C(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m17612C(1);
                    m17613D(2);
                    return;
                case 38:
                    m17612C(1);
                    m17613D(3);
                    return;
                case 39:
                    m17612C(1);
                    m17613D(4);
                    return;
                default:
                    int i = this.f13223n;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f13221l = null;
                                    if (!(i == 1 || i == 3)) {
                                        return;
                                    }
                                case 45:
                                    if (i == 1 && !this.f13220k.mo13210f()) {
                                        this.f13220k.mo13212h();
                                        return;
                                    }
                                    return;
                                case 46:
                                    break;
                                case 47:
                                    this.f13221l = m17615o();
                                    break;
                                default:
                                    return;
                            }
                            m17611B();
                            return;
                        }
                        this.f13220k.mo13206b();
                        return;
                    }
                    return;
            }
        } else {
            m17612C(3);
        }
    }

    /* renamed from: v */
    private void m17622v(byte b, byte b2) {
        int i = f13209s[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f13220k.mo13209e()) {
            if (this.f13223n != 1 && !this.f13220k.mo13210f()) {
                C4165a aVar = new C4165a(this.f13223n, this.f13224o);
                this.f13220k = aVar;
                this.f13219j.add(aVar);
            }
            this.f13220k.mo13217m(i);
        }
        if ((b2 & 1) == 1) {
            this.f13220k.mo13216l(new UnderlineSpan());
        }
        int i2 = (b2 >> 1) & 15;
        if (i2 > 7) {
            this.f13220k.mo13214j(f13210t[i2 & 7]);
        } else if (i2 == 7) {
            this.f13220k.mo13216l(new StyleSpan(2));
            this.f13220k.mo13216l(new ForegroundColorSpan(-1));
        } else {
            this.f13220k.mo13216l(new ForegroundColorSpan(f13211u[i2]));
        }
    }

    /* renamed from: w */
    private static boolean m17623w(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: x */
    private static boolean m17624x(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: y */
    private static boolean m17625y(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: z */
    private static boolean m17626z(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: a */
    public void mo12664a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4155e mo13202f() {
        List<C4152b> list = this.f13221l;
        this.f13222m = list;
        return new C4175e(list);
    }

    public void flush() {
        super.flush();
        this.f13221l = null;
        this.f13222m = null;
        m17612C(0);
        m17613D(4);
        m17611B();
        this.f13225p = false;
        this.f13226q = 0;
        this.f13227r = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo13203g(C4160i iVar) {
        C4165a aVar;
        char n;
        this.f13216g.mo13452H(iVar.f11822h.array(), iVar.f11822h.limit());
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int a = this.f13216g.mo13456a();
            int i = this.f13217h;
            if (a < i) {
                break;
            }
            byte x = i == 2 ? -4 : (byte) this.f13216g.mo13479x();
            byte x2 = (byte) (this.f13216g.mo13479x() & 127);
            byte x3 = (byte) (this.f13216g.mo13479x() & 127);
            if ((x & 6) == 4 && ((this.f13218i != 1 || (x & 1) == 0) && ((this.f13218i != 2 || (x & 1) == 1) && !(x2 == 0 && x3 == 0)))) {
                if ((x2 & 247) == 17 && (x3 & 240) == 48) {
                    aVar = this.f13220k;
                    n = m17618r(x3);
                } else if ((x2 & 246) == 18 && (x3 & 224) == 32) {
                    this.f13220k.mo13206b();
                    if ((x2 & 1) == 0) {
                        aVar = this.f13220k;
                        n = m17616p(x3);
                    } else {
                        aVar = this.f13220k;
                        n = m17617q(x3);
                    }
                } else {
                    if ((x2 & 224) == 0) {
                        z2 = m17619s(x2, x3);
                    } else {
                        this.f13220k.mo13205a(m17614n(x2));
                        if ((x3 & 224) != 0) {
                            aVar = this.f13220k;
                            n = m17614n(x3);
                        }
                    }
                    z = true;
                }
                aVar.mo13205a(n);
                z = true;
            }
        }
        if (z) {
            if (!z2) {
                this.f13225p = false;
            }
            int i2 = this.f13223n;
            if (i2 == 1 || i2 == 3) {
                this.f13221l = m17615o();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo13204j() {
        return this.f13221l != this.f13222m;
    }
}
