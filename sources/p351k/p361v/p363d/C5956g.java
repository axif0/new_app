package p351k.p361v.p363d;

import java.util.Arrays;
import p351k.C5843c;
import p351k.C5858p;

/* renamed from: k.v.d.g */
public class C5956g {
    private C5956g() {
    }

    /* renamed from: a */
    public static boolean m24496a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m24497b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            m24503h(illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: c */
    public static void m24498c(Object obj) {
        if (obj == null) {
            m24505j();
            throw null;
        }
    }

    /* renamed from: d */
    public static void m24499d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            m24503h(nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public static void m24500e(Object obj, String str) {
        if (obj == null) {
            m24508m(str);
            throw null;
        }
    }

    /* renamed from: f */
    public static void m24501f(Object obj, String str) {
        if (obj == null) {
            m24507l(str);
            throw null;
        }
    }

    /* renamed from: g */
    private static String m24502g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m24503h(T t) {
        m24504i(t, C5956g.class.getName());
        return t;
    }

    /* renamed from: i */
    static <T extends Throwable> T m24504i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: j */
    public static void m24505j() {
        NullPointerException nullPointerException = new NullPointerException();
        m24503h(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: k */
    public static void m24506k() {
        C5843c cVar = new C5843c();
        m24503h(cVar);
        throw cVar;
    }

    /* renamed from: l */
    private static void m24507l(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m24502g(str));
        m24503h(illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: m */
    private static void m24508m(String str) {
        NullPointerException nullPointerException = new NullPointerException(m24502g(str));
        m24503h(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: n */
    public static void m24509n(String str) {
        C5858p pVar = new C5858p(str);
        m24503h(pVar);
        throw pVar;
    }

    /* renamed from: o */
    public static void m24510o(String str) {
        m24509n("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
