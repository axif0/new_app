package p374m;

import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p374m.p375g0.C6130c;

/* renamed from: m.s */
public final class C6255s {

    /* renamed from: a */
    private final String[] f17649a;

    /* renamed from: m.s$a */
    public static final class C6256a {

        /* renamed from: a */
        final List<String> f17650a = new ArrayList(20);

        /* renamed from: a */
        public C6256a mo17690a(String str, String str2) {
            C6255s.m25628a(str);
            C6255s.m25629b(str2, str);
            mo17692c(str, str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6256a mo17691b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                mo17692c(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                mo17692c(BuildConfig.FLAVOR, str.substring(1));
                return this;
            } else {
                mo17692c(BuildConfig.FLAVOR, str);
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6256a mo17692c(String str, String str2) {
            this.f17650a.add(str);
            this.f17650a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public C6255s mo17693d() {
            return new C6255s(this);
        }

        /* renamed from: e */
        public String mo17694e(String str) {
            for (int size = this.f17650a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f17650a.get(size))) {
                    return this.f17650a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: f */
        public C6256a mo17695f(String str) {
            int i = 0;
            while (i < this.f17650a.size()) {
                if (str.equalsIgnoreCase(this.f17650a.get(i))) {
                    this.f17650a.remove(i);
                    this.f17650a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: g */
        public C6256a mo17696g(String str, String str2) {
            C6255s.m25628a(str);
            C6255s.m25629b(str2, str);
            mo17695f(str);
            mo17692c(str, str2);
            return this;
        }
    }

    C6255s(C6256a aVar) {
        List<String> list = aVar.f17650a;
        this.f17649a = (String[]) list.toArray(new String[list.size()]);
    }

    private C6255s(String[] strArr) {
        this.f17649a = strArr;
    }

    /* renamed from: a */
    static void m25628a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C6130c.m25055r("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: b */
    static void m25629b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C6130c.m25055r("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    /* renamed from: d */
    private static String m25630d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C6255s m25631g(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                m25628a(str);
                m25629b(str2, str);
            }
            return new C6255s(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    /* renamed from: c */
    public String mo17681c(String str) {
        return m25630d(this.f17649a, str);
    }

    /* renamed from: e */
    public String mo17682e(int i) {
        return this.f17649a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6255s) && Arrays.equals(((C6255s) obj).f17649a, this.f17649a);
    }

    /* renamed from: f */
    public C6256a mo17684f() {
        C6256a aVar = new C6256a();
        Collections.addAll(aVar.f17650a, this.f17649a);
        return aVar;
    }

    /* renamed from: h */
    public int mo17685h() {
        return this.f17649a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f17649a);
    }

    /* renamed from: i */
    public String mo17687i(int i) {
        return this.f17649a[(i * 2) + 1];
    }

    /* renamed from: j */
    public List<String> mo17688j(String str) {
        int h = mo17685h();
        ArrayList arrayList = null;
        for (int i = 0; i < h; i++) {
            if (str.equalsIgnoreCase(mo17682e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo17687i(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int h = mo17685h();
        for (int i = 0; i < h; i++) {
            sb.append(mo17682e(i));
            sb.append(": ");
            sb.append(mo17687i(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
