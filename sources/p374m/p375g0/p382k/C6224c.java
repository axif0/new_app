package p374m.p375g0.p382k;

import com.karumi.dexter.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p374m.C6268y;
import p374m.p375g0.C6130c;

/* renamed from: m.g0.k.c */
final class C6224c extends C6228f {

    /* renamed from: c */
    final Method f17556c;

    /* renamed from: d */
    final Method f17557d;

    C6224c(Method method, Method method2) {
        this.f17556c = method;
        this.f17557d = method2;
    }

    /* renamed from: s */
    public static C6224c m25497s() {
        try {
            return new C6224c(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo17576g(SSLSocket sSLSocket, String str, List<C6268y> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = C6228f.m25511b(list);
            this.f17556c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C6130c.m25039b("unable to set ssl parameters", e);
        }
    }

    /* renamed from: m */
    public String mo17579m(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f17557d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals(BuildConfig.FLAVOR)) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C6130c.m25039b("unable to get selected protocols", e);
        }
    }
}
