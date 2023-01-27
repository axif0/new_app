package p390p.p391a;

import android.os.Build;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: p.a.a */
public final class C6550a {

    /* renamed from: a */
    private static final C6553c[] f18409a = new C6553c[0];

    /* renamed from: b */
    private static final List<C6553c> f18410b = new ArrayList();

    /* renamed from: c */
    static volatile C6553c[] f18411c = f18409a;

    /* renamed from: d */
    private static final C6553c f18412d = new C6551a();

    /* renamed from: p.a.a$a */
    static class C6551a extends C6553c {
        C6551a() {
        }

        /* renamed from: d */
        public void mo18779d(String str, Object... objArr) {
            for (C6553c d : C6550a.f18411c) {
                d.mo18779d(str, objArr);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo18780g(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    /* renamed from: p.a.a$b */
    public static class C6552b extends C6553c {

        /* renamed from: b */
        private static final Pattern f18413b = Pattern.compile("(\\$\\d+)+$");

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final String mo18781c() {
            String c = super.mo18781c();
            if (c != null) {
                return c;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return mo18782i(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo18780g(int i, String str, String str2, Throwable th) {
            int min;
            if (str2.length() >= 4000) {
                int i2 = 0;
                int length = str2.length();
                while (i2 < length) {
                    int indexOf = str2.indexOf(10, i2);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    while (true) {
                        min = Math.min(indexOf, i2 + 4000);
                        String substring = str2.substring(i2, min);
                        if (i == 7) {
                            Log.wtf(str, substring);
                        } else {
                            Log.println(i, str, substring);
                        }
                        if (min >= indexOf) {
                            break;
                        }
                        i2 = min;
                    }
                    i2 = min + 1;
                }
            } else if (i == 7) {
                Log.wtf(str, str2);
            } else {
                Log.println(i, str, str2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public String mo18782i(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = f18413b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll(BuildConfig.FLAVOR);
            }
            String substring = className.substring(className.lastIndexOf(46) + 1);
            return (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
        }
    }

    /* renamed from: p.a.a$c */
    public static abstract class C6553c {

        /* renamed from: a */
        final ThreadLocal<String> f18414a = new ThreadLocal<>();

        /* renamed from: b */
        private String m26778b(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        /* renamed from: h */
        private void m26779h(int i, Throwable th, String str, Object... objArr) {
            String c = mo18781c();
            if (mo18785f(c, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = mo18783a(str, objArr);
                    }
                    if (th != null) {
                        str = str + "\n" + m26778b(th);
                    }
                } else if (th != null) {
                    str = m26778b(th);
                } else {
                    return;
                }
                mo18780g(i, c, str, th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo18783a(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo18781c() {
            String str = this.f18414a.get();
            if (str != null) {
                this.f18414a.remove();
            }
            return str;
        }

        /* renamed from: d */
        public void mo18779d(String str, Object... objArr) {
            m26779h(4, (Throwable) null, str, objArr);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        /* renamed from: e */
        public boolean mo18784e(int i) {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public boolean mo18785f(String str, int i) {
            return mo18784e(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract void mo18780g(int i, String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static void m26771a(String str, Object... objArr) {
        f18412d.mo18779d(str, objArr);
    }

    /* renamed from: b */
    public static void m26772b(C6553c cVar) {
        if (cVar == null) {
            throw new NullPointerException("tree == null");
        } else if (cVar != f18412d) {
            synchronized (f18410b) {
                f18410b.add(cVar);
                f18411c = (C6553c[]) f18410b.toArray(new C6553c[f18410b.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }
}
