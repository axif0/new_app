package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: g.d.a.c.f.f.s5 */
public abstract class C4773s5 implements Serializable, Iterable<Byte> {

    /* renamed from: g */
    public static final C4773s5 f14473g = new C4469b6(C4470b7.f13994b);

    /* renamed from: h */
    private static final C4856x5 f14474h = (C4724p5.m20110b() ? new C4524e6((C4807u5) null) : new C4823v5((C4807u5) null));

    /* renamed from: f */
    private int f14475f = 0;

    C4773s5() {
    }

    /* renamed from: j */
    public static C4773s5 m20337j(String str) {
        return new C4469b6(str.getBytes(C4470b7.f13993a));
    }

    /* renamed from: m */
    public static C4773s5 m20338m(byte[] bArr, int i, int i2) {
        m20339r(i, i + i2, bArr.length);
        return new C4469b6(f14474h.mo14087a(bArr, i, i2));
    }

    /* renamed from: r */
    static int m20339r(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: u */
    static C4894z5 m20340u(int i) {
        return new C4894z5(i, (C4807u5) null);
    }

    /* renamed from: c */
    public abstract byte mo13853c(int i);

    /* renamed from: d */
    public abstract int mo13854d();

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo13856f(int i, int i2, int i3);

    /* renamed from: h */
    public abstract C4773s5 mo13857h(int i, int i2);

    public final int hashCode() {
        int i = this.f14475f;
        if (i == 0) {
            int d = mo13854d();
            i = mo13856f(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.f14475f = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C4807u5(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo13858o(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo13859p(C4790t5 t5Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract byte mo13860q(int i);

    /* renamed from: t */
    public final String mo14605t() {
        return mo13854d() == 0 ? BuildConfig.FLAVOR : mo13858o(C4470b7.f13993a);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo13854d());
        objArr[2] = mo13854d() <= 50 ? C4712o9.m20058a(this) : String.valueOf(C4712o9.m20058a(mo13857h(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public abstract boolean mo13861w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo14607x() {
        return this.f14475f;
    }
}
