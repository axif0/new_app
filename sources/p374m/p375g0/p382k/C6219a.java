package p374m.p375g0.p382k;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p374m.C6268y;
import p374m.p375g0.C6130c;
import p374m.p375g0.p384m.C6232c;
import p374m.p375g0.p384m.C6234e;

/* renamed from: m.g0.k.a */
class C6219a extends C6228f {

    /* renamed from: c */
    private final C6227e<Socket> f17544c;

    /* renamed from: d */
    private final C6227e<Socket> f17545d;

    /* renamed from: e */
    private final C6227e<Socket> f17546e;

    /* renamed from: f */
    private final C6227e<Socket> f17547f;

    /* renamed from: g */
    private final C6222c f17548g = C6222c.m25488b();

    /* renamed from: m.g0.k.a$a */
    static final class C6220a extends C6232c {

        /* renamed from: a */
        private final Object f17549a;

        /* renamed from: b */
        private final Method f17550b;

        C6220a(Object obj, Method method) {
            this.f17549a = obj;
            this.f17550b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo17584a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f17550b.invoke(this.f17549a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C6220a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: m.g0.k.a$b */
    static final class C6221b implements C6234e {

        /* renamed from: a */
        private final X509TrustManager f17551a;

        /* renamed from: b */
        private final Method f17552b;

        C6221b(X509TrustManager x509TrustManager, Method method) {
            this.f17552b = method;
            this.f17551a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo17587a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f17552b.invoke(this.f17551a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C6130c.m25039b("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6221b)) {
                return false;
            }
            C6221b bVar = (C6221b) obj;
            return this.f17551a.equals(bVar.f17551a) && this.f17552b.equals(bVar.f17552b);
        }

        public int hashCode() {
            return this.f17551a.hashCode() + (this.f17552b.hashCode() * 31);
        }
    }

    /* renamed from: m.g0.k.a$c */
    static final class C6222c {

        /* renamed from: a */
        private final Method f17553a;

        /* renamed from: b */
        private final Method f17554b;

        /* renamed from: c */
        private final Method f17555c;

        C6222c(Method method, Method method2, Method method3) {
            this.f17553a = method;
            this.f17554b = method2;
            this.f17555c = method3;
        }

        /* renamed from: b */
        static C6222c m25488b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C6222c(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo17590a(String str) {
            Method method = this.f17553a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f17554b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo17591c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f17555c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    C6219a(Class<?> cls, C6227e<Socket> eVar, C6227e<Socket> eVar2, C6227e<Socket> eVar3, C6227e<Socket> eVar4) {
        this.f17544c = eVar;
        this.f17545d = eVar2;
        this.f17546e = eVar3;
        this.f17547f = eVar4;
    }

    /* renamed from: s */
    private boolean m25472s(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo17581o(str);
        }
    }

    /* renamed from: t */
    private boolean m25473t(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m25472s(str, cls, obj);
        }
    }

    /* renamed from: u */
    public static C6228f m25474u() {
        Class<?> cls;
        C6227e eVar;
        C6227e eVar2;
        Class<byte[]> cls2 = byte[].class;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class<?> cls3 = cls;
        C6227e eVar3 = new C6227e((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        C6227e eVar4 = new C6227e((Class<?>) null, "setHostname", String.class);
        if (m25475v()) {
            C6227e eVar5 = new C6227e(cls2, "getAlpnSelectedProtocol", new Class[0]);
            eVar = new C6227e((Class<?>) null, "setAlpnProtocols", cls2);
            eVar2 = eVar5;
        } else {
            eVar2 = null;
            eVar = null;
        }
        return new C6219a(cls3, eVar3, eVar4, eVar2, eVar);
    }

    /* renamed from: v */
    private static boolean m25475v() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public C6232c mo17574c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C6220a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo17574c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public C6234e mo17575d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C6221b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo17575d(x509TrustManager);
        }
    }

    /* renamed from: g */
    public void mo17576g(SSLSocket sSLSocket, String str, List<C6268y> list) {
        if (str != null) {
            this.f17544c.mo17597e(sSLSocket, Boolean.TRUE);
            this.f17545d.mo17597e(sSLSocket, str);
        }
        C6227e<Socket> eVar = this.f17547f;
        if (eVar != null && eVar.mo17599g(sSLSocket)) {
            this.f17547f.mo17598f(sSLSocket, C6228f.m25512e(list));
        }
    }

    /* renamed from: h */
    public void mo17577h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C6130c.m25028A(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    /* renamed from: l */
    public SSLContext mo17578l() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: m */
    public String mo17579m(SSLSocket sSLSocket) {
        byte[] bArr;
        C6227e<Socket> eVar = this.f17546e;
        if (eVar == null || !eVar.mo17599g(sSLSocket) || (bArr = (byte[]) this.f17546e.mo17598f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C6130c.f17205i);
    }

    /* renamed from: n */
    public Object mo17580n(String str) {
        return this.f17548g.mo17590a(str);
    }

    /* renamed from: o */
    public boolean mo17581o(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m25473t(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo17581o(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C6130c.m25039b("unable to determine cleartext support", e);
        }
    }

    /* renamed from: q */
    public void mo17582q(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: r */
    public void mo17583r(String str, Object obj) {
        if (!this.f17548g.mo17591c(obj)) {
            mo17582q(5, str, (Throwable) null);
        }
    }
}
