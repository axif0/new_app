package p374m.p375g0.p382k;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p374m.C6268y;
import p374m.p375g0.C6130c;

/* renamed from: m.g0.k.d */
class C6225d extends C6228f {

    /* renamed from: c */
    private final Method f17558c;

    /* renamed from: d */
    private final Method f17559d;

    /* renamed from: e */
    private final Method f17560e;

    /* renamed from: f */
    private final Class<?> f17561f;

    /* renamed from: g */
    private final Class<?> f17562g;

    /* renamed from: m.g0.k.d$a */
    private static class C6226a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f17563a;

        /* renamed from: b */
        boolean f17564b;

        /* renamed from: c */
        String f17565c;

        C6226a(List<String> list) {
            this.f17563a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C6130c.f17198b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f17564b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f17563a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f17563a.get(0);
                            break;
                        } else if (this.f17563a.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f17565c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f17565c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C6225d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f17558c = method;
        this.f17559d = method2;
        this.f17560e = method3;
        this.f17561f = cls;
        this.f17562g = cls2;
    }

    /* renamed from: s */
    public static C6228f m25500s() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new C6225d(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo17593a(SSLSocket sSLSocket) {
        try {
            this.f17560e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C6130c.m25039b("unable to remove alpn", e);
        }
    }

    /* renamed from: g */
    public void mo17576g(SSLSocket sSLSocket, String str, List<C6268y> list) {
        List<String> b = C6228f.m25511b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C6228f.class.getClassLoader(), new Class[]{this.f17561f, this.f17562g}, new C6226a(b));
            this.f17558c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C6130c.m25039b("unable to set alpn", e);
        }
    }

    /* renamed from: m */
    public String mo17579m(SSLSocket sSLSocket) {
        try {
            C6226a aVar = (C6226a) Proxy.getInvocationHandler(this.f17559d.invoke((Object) null, new Object[]{sSLSocket}));
            if (!aVar.f17564b && aVar.f17565c == null) {
                C6228f.m25514j().mo17582q(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f17564b) {
                return null;
            } else {
                return aVar.f17565c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C6130c.m25039b("unable to get selected protocol", e);
        }
    }
}
