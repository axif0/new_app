package org.jsoup.parser;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

public final class CharacterReader {

    /* renamed from: a */
    private final char[] f18135a;

    /* renamed from: b */
    private final Reader f18136b;

    /* renamed from: c */
    private int f18137c;

    /* renamed from: d */
    private int f18138d;

    /* renamed from: e */
    private int f18139e;

    /* renamed from: f */
    private int f18140f;

    /* renamed from: g */
    private int f18141g;

    /* renamed from: h */
    private final String[] f18142h;

    public CharacterReader(Reader reader) {
        this(reader, 32768);
    }

    public CharacterReader(Reader reader, int i) {
        this.f18141g = -1;
        this.f18142h = new String[512];
        Validate.notNull(reader);
        Validate.isTrue(reader.markSupported());
        this.f18136b = reader;
        this.f18135a = new char[(i > 32768 ? 32768 : i)];
        m26392a();
        if (mo18441n()) {
            throw new UncheckedIOException("Input is binary and unsupported");
        }
    }

    public CharacterReader(String str) {
        this(new StringReader(str), str.length());
    }

    /* renamed from: B */
    static boolean m26391B(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* renamed from: a */
    private void m26392a() {
        int i = this.f18139e;
        if (i >= this.f18138d) {
            try {
                this.f18136b.skip((long) i);
                this.f18136b.mark(32768);
                int read = this.f18136b.read(this.f18135a);
                this.f18136b.reset();
                if (read != -1) {
                    this.f18137c = read;
                    this.f18140f += i;
                    this.f18139e = 0;
                    this.f18141g = -1;
                    if (read > 24576) {
                        read = 24576;
                    }
                    this.f18138d = read;
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    /* renamed from: b */
    private static String m26393b(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return BuildConfig.FLAVOR;
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        } else if (m26391B(cArr, i, i2, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i, i2);
            strArr[length] = str3;
            return str3;
        }
    }

    /* renamed from: o */
    private boolean m26394o() {
        return this.f18139e >= this.f18137c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public int mo18422A(CharSequence charSequence) {
        m26392a();
        char charAt = charSequence.charAt(0);
        int i = this.f18139e;
        while (i < this.f18137c) {
            int i2 = 1;
            if (charAt != this.f18135a[i]) {
                do {
                    i++;
                    if (i >= this.f18137c) {
                        break;
                    }
                } while (charAt == this.f18135a[i]);
            }
            int i3 = i + 1;
            int length = (charSequence.length() + i3) - 1;
            int i4 = this.f18137c;
            if (i < i4 && length <= i4) {
                int i5 = i3;
                while (i5 < length && charSequence.charAt(i2) == this.f18135a[i5]) {
                    i5++;
                    i2++;
                }
                if (i5 == length) {
                    return i - this.f18139e;
                }
            }
            i = i3;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo18423C() {
        int i = this.f18141g;
        if (i != -1) {
            this.f18139e = i;
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo18424D() {
        int i = this.f18139e;
        if (i >= 1) {
            this.f18139e = i - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("No buffer left to unconsume"));
    }

    public void advance() {
        this.f18139e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public char mo18426c() {
        m26392a();
        char c = m26394o() ? 65535 : this.f18135a[this.f18139e];
        this.f18139e++;
        return c;
    }

    public String consumeTo(char c) {
        int z = mo18454z(c);
        if (z == -1) {
            return mo18439l();
        }
        String b = m26393b(this.f18135a, this.f18142h, this.f18139e, z);
        this.f18139e += z;
        return b;
    }

    public String consumeToAny(char... cArr) {
        m26392a();
        int i = this.f18139e;
        int i2 = this.f18137c;
        char[] cArr2 = this.f18135a;
        int i3 = i;
        loop0:
        while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f18139e = i3;
        return i3 > i ? m26393b(this.f18135a, this.f18142h, i, i3 - i) : BuildConfig.FLAVOR;
    }

    public char current() {
        m26392a();
        if (m26394o()) {
            return 65535;
        }
        return this.f18135a[this.f18139e];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo18430d() {
        int i = this.f18139e;
        int i2 = this.f18137c;
        char[] cArr = this.f18135a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f18139e = i3;
        return i3 > i ? m26393b(this.f18135a, this.f18142h, i, i3 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo18431e() {
        char c;
        m26392a();
        int i = this.f18139e;
        while (true) {
            int i2 = this.f18139e;
            if (i2 < this.f18137c && (c = this.f18135a[i2]) >= '0' && c <= '9') {
                this.f18139e = i2 + 1;
            }
        }
        return m26393b(this.f18135a, this.f18142h, i, this.f18139e - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo18432f() {
        char c;
        m26392a();
        int i = this.f18139e;
        while (true) {
            int i2 = this.f18139e;
            if (i2 < this.f18137c && (((c = this.f18135a[i2]) >= '0' && c <= '9') || ((c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')))) {
                this.f18139e++;
            }
        }
        return m26393b(this.f18135a, this.f18142h, i, this.f18139e - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo18433g() {
        char c;
        m26392a();
        int i = this.f18139e;
        while (true) {
            int i2 = this.f18139e;
            if (i2 < this.f18137c && (((c = this.f18135a[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.f18139e++;
            }
        }
        return m26393b(this.f18135a, this.f18142h, i, this.f18139e - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo18434h() {
        char c;
        m26392a();
        int i = this.f18139e;
        while (true) {
            int i2 = this.f18139e;
            if (i2 < this.f18137c && (((c = this.f18135a[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.f18139e++;
            }
        }
        while (!m26394o() && (r1 = this.f18135a[r2]) >= '0' && r1 <= '9') {
            this.f18139e = (r2 = this.f18139e) + 1;
        }
        return m26393b(this.f18135a, this.f18142h, i, this.f18139e - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo18435i() {
        m26392a();
        int i = this.f18139e;
        int i2 = this.f18137c;
        char[] cArr = this.f18135a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == 9 || c == 10 || c == 12 || c == 13) {
                break;
            }
            i3++;
        }
        this.f18139e = i3;
        return i3 > i ? m26393b(this.f18135a, this.f18142h, i, i3 - i) : BuildConfig.FLAVOR;
    }

    public boolean isEmpty() {
        m26392a();
        return this.f18139e >= this.f18137c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo18437j(String str) {
        int A = mo18422A(str);
        if (A == -1) {
            return mo18439l();
        }
        String b = m26393b(this.f18135a, this.f18142h, this.f18139e, A);
        this.f18139e += A;
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo18438k(char... cArr) {
        m26392a();
        int i = this.f18139e;
        int i2 = this.f18137c;
        char[] cArr2 = this.f18135a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f18139e = i3;
        return i3 > i ? m26393b(this.f18135a, this.f18142h, i, i3 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo18439l() {
        m26392a();
        char[] cArr = this.f18135a;
        String[] strArr = this.f18142h;
        int i = this.f18139e;
        String b = m26393b(cArr, strArr, i, this.f18137c - i);
        this.f18139e = this.f18137c;
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo18440m(String str) {
        return mo18422A(str.toLowerCase(Locale.ENGLISH)) > -1 || mo18422A(str.toUpperCase(Locale.ENGLISH)) > -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo18441n() {
        int i = 0;
        for (int i2 = this.f18139e; i2 < this.f18137c; i2++) {
            if (this.f18135a[i2] == 0) {
                i++;
            }
        }
        return i >= 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18442p() {
        this.f18138d = 0;
        m26392a();
        this.f18141g = this.f18139e;
    }

    public int pos() {
        return this.f18140f + this.f18139e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo18444q(String str) {
        m26392a();
        if (!mo18447t(str)) {
            return false;
        }
        this.f18139e += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo18445r(String str) {
        if (!mo18452x(str)) {
            return false;
        }
        this.f18139e += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo18446s(char c) {
        return !isEmpty() && this.f18135a[this.f18139e] == c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo18447t(String str) {
        m26392a();
        int length = str.length();
        if (length > this.f18137c - this.f18139e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f18135a[this.f18139e + i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        char[] cArr = this.f18135a;
        int i = this.f18139e;
        return new String(cArr, i, this.f18137c - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo18449u(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        m26392a();
        char c = this.f18135a[this.f18139e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo18450v(char[] cArr) {
        m26392a();
        return !isEmpty() && Arrays.binarySearch(cArr, this.f18135a[this.f18139e]) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.f18135a[r3.f18139e];
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18451w() {
        /*
            r3 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            char[] r0 = r3.f18135a
            int r2 = r3.f18139e
            char r0 = r0[r2]
            r2 = 48
            if (r0 < r2) goto L_0x0017
            r2 = 57
            if (r0 > r2) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.mo18451w():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo18452x(String str) {
        m26392a();
        int length = str.length();
        if (length > this.f18137c - this.f18139e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f18135a[this.f18139e + i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo18453y() {
        if (isEmpty()) {
            return false;
        }
        char c = this.f18135a[this.f18139e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo18454z(char c) {
        m26392a();
        for (int i = this.f18139e; i < this.f18137c; i++) {
            if (c == this.f18135a[i]) {
                return i - this.f18139e;
            }
        }
        return -1;
    }
}
