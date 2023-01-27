package p374m.p375g0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p374m.C6103b0;
import p374m.C6117d0;
import p374m.C6255s;
import p374m.C6257t;
import p374m.C6261v;
import p374m.p375g0.p380i.C6180c;
import p385n.C6277c;
import p385n.C6281e;
import p385n.C6282f;
import p385n.C6300s;
import p385n.C6301t;

/* renamed from: m.g0.c */
public final class C6130c {

    /* renamed from: a */
    public static final byte[] f17197a;

    /* renamed from: b */
    public static final String[] f17198b = new String[0];

    /* renamed from: c */
    public static final C6117d0 f17199c;

    /* renamed from: d */
    private static final C6282f f17200d = C6282f.m25888k("efbbbf");

    /* renamed from: e */
    private static final C6282f f17201e = C6282f.m25888k("feff");

    /* renamed from: f */
    private static final C6282f f17202f = C6282f.m25888k("fffe");

    /* renamed from: g */
    private static final C6282f f17203g = C6282f.m25888k("0000ffff");

    /* renamed from: h */
    private static final C6282f f17204h = C6282f.m25888k("ffff0000");

    /* renamed from: i */
    public static final Charset f17205i = Charset.forName("UTF-8");

    /* renamed from: j */
    private static final Charset f17206j = Charset.forName("UTF-16BE");

    /* renamed from: k */
    private static final Charset f17207k = Charset.forName("UTF-16LE");

    /* renamed from: l */
    private static final Charset f17208l = Charset.forName("UTF-32BE");

    /* renamed from: m */
    private static final Charset f17209m = Charset.forName("UTF-32LE");

    /* renamed from: n */
    public static final TimeZone f17210n = TimeZone.getTimeZone("GMT");

    /* renamed from: o */
    public static final Comparator<String> f17211o = new C6131a();

    /* renamed from: p */
    private static final Method f17212p;

    /* renamed from: q */
    private static final Pattern f17213q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: m.g0.c$a */
    class C6131a implements Comparator<String> {
        C6131a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: m.g0.c$b */
    class C6132b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f17214a;

        /* renamed from: b */
        final /* synthetic */ boolean f17215b;

        C6132b(String str, boolean z) {
            this.f17214a = str;
            this.f17215b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f17214a);
            thread.setDaemon(this.f17215b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f17197a = bArr;
        Method method = null;
        f17199c = C6117d0.m24988q((C6261v) null, bArr);
        C6103b0.m24900d((C6261v) null, f17197a);
        Charset.forName("ISO-8859-1");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f17212p = method;
    }

    /* renamed from: A */
    public static boolean m25028A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: B */
    public static boolean m25029B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static X509TrustManager m25030C() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw m25039b("No System TLS", e);
        }
    }

    /* renamed from: D */
    public static boolean m25031D(C6300s sVar, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c = sVar.timeout().mo17902e() ? sVar.timeout().mo17900c() - nanoTime : Long.MAX_VALUE;
        sVar.timeout().mo17901d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C6277c cVar = new C6277c();
            while (sVar.mo17355O(cVar, 8192) != -1) {
                cVar.mo17840q();
            }
            int i2 = (c > Long.MAX_VALUE ? 1 : (c == Long.MAX_VALUE ? 0 : -1));
            C6301t timeout = sVar.timeout();
            if (i2 == 0) {
                timeout.mo17898a();
            } else {
                timeout.mo17901d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i3 = (c > Long.MAX_VALUE ? 1 : (c == Long.MAX_VALUE ? 0 : -1));
            C6301t timeout2 = sVar.timeout();
            if (i3 == 0) {
                timeout2.mo17898a();
            } else {
                timeout2.mo17901d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            int i4 = (c > Long.MAX_VALUE ? 1 : (c == Long.MAX_VALUE ? 0 : -1));
            C6301t timeout3 = sVar.timeout();
            if (i4 == 0) {
                timeout3.mo17898a();
            } else {
                timeout3.mo17901d(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: E */
    public static int m25032E(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: F */
    public static int m25033F(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: G */
    public static ThreadFactory m25034G(String str, boolean z) {
        return new C6132b(str, z);
    }

    /* renamed from: H */
    public static C6255s m25035H(List<C6180c> list) {
        C6255s.C6256a aVar = new C6255s.C6256a();
        for (C6180c next : list) {
            C6128a.f17195a.mo17340b(aVar, next.f17393a.mo17877D(), next.f17394b.mo17877D());
        }
        return aVar.mo17693d();
    }

    /* renamed from: I */
    public static String m25036I(String str, int i, int i2) {
        int E = m25032E(str, i, i2);
        return str.substring(E, m25033F(str, E, i2));
    }

    /* renamed from: J */
    public static boolean m25037J(String str) {
        return f17213q.matcher(str).matches();
    }

    /* renamed from: a */
    public static void m25038a(Throwable th, Throwable th2) {
        Method method = f17212p;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static AssertionError m25039b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: c */
    public static Charset m25040c(C6281e eVar, Charset charset) throws IOException {
        if (eVar.mo17816c0(0, f17200d)) {
            eVar.mo17815c((long) f17200d.mo17892x());
            return f17205i;
        } else if (eVar.mo17816c0(0, f17201e)) {
            eVar.mo17815c((long) f17201e.mo17892x());
            return f17206j;
        } else if (eVar.mo17816c0(0, f17202f)) {
            eVar.mo17815c((long) f17202f.mo17892x());
            return f17207k;
        } else if (eVar.mo17816c0(0, f17203g)) {
            eVar.mo17815c((long) f17203g.mo17892x());
            return f17208l;
        } else if (!eVar.mo17816c0(0, f17204h)) {
            return charset;
        } else {
            eVar.mo17815c((long) f17204h.mo17892x());
            return f17209m;
        }
    }

    /* renamed from: d */
    public static String m25041d(String str) {
        if (str.contains(":")) {
            InetAddress m = (!str.startsWith("[") || !str.endsWith("]")) ? m25050m(str, 0, str.length()) : m25050m(str, 1, str.length() - 1);
            if (m == null) {
                return null;
            }
            byte[] address = m.getAddress();
            if (address.length == 16) {
                return m25062y(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m25047j(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static int m25042e(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: f */
    public static void m25043f(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: g */
    public static void m25044g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static void m25045h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m25028A(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public static String[] m25046i(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: j */
    private static boolean m25047j(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static int m25048k(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: l */
    private static boolean m25049l(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* renamed from: m */
    private static InetAddress m25050m(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, ":", 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m25049l(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int k = m25048k(str.charAt(i));
                    if (k == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + k;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != 16) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: n */
    public static int m25051n(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static int m25052o(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: p */
    public static boolean m25053p(C6300s sVar, int i, TimeUnit timeUnit) {
        try {
            return m25031D(sVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m25054q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: r */
    public static String m25055r(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: s */
    public static String m25056s(C6257t tVar, boolean z) {
        String str;
        if (tVar.mo17709m().contains(":")) {
            str = "[" + tVar.mo17709m() + "]";
        } else {
            str = tVar.mo17709m();
        }
        if (!z && tVar.mo17715y() == C6257t.m25650e(tVar.mo17699D())) {
            return str;
        }
        return str + ":" + tVar.mo17715y();
    }

    /* renamed from: t */
    public static <T> List<T> m25057t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: u */
    public static <T> List<T> m25058u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m25059v(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: w */
    public static int m25060w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public static int m25061x(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    private static String m25062y(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C6277c cVar = new C6277c();
        while (i < bArr.length) {
            if (i == i2) {
                cVar.mo17852t0(58);
                i += i4;
                if (i == 16) {
                    cVar.mo17852t0(58);
                }
            } else {
                if (i > 0) {
                    cVar.mo17852t0(58);
                }
                cVar.mo17857v0((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return cVar.mo17827i0();
    }

    /* renamed from: z */
    public static String[] m25063z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
