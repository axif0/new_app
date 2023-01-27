package p374m.p375g0.p377f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p374m.C6098a;
import p374m.C6120e;
import p374m.C6122e0;
import p374m.C6248p;
import p374m.C6257t;
import p374m.p375g0.C6130c;

/* renamed from: m.g0.f.f */
public final class C6153f {

    /* renamed from: a */
    private final C6098a f17298a;

    /* renamed from: b */
    private final C6151d f17299b;

    /* renamed from: c */
    private final C6120e f17300c;

    /* renamed from: d */
    private final C6248p f17301d;

    /* renamed from: e */
    private List<Proxy> f17302e = Collections.emptyList();

    /* renamed from: f */
    private int f17303f;

    /* renamed from: g */
    private List<InetSocketAddress> f17304g = Collections.emptyList();

    /* renamed from: h */
    private final List<C6122e0> f17305h = new ArrayList();

    /* renamed from: m.g0.f.f$a */
    public static final class C6154a {

        /* renamed from: a */
        private final List<C6122e0> f17306a;

        /* renamed from: b */
        private int f17307b = 0;

        C6154a(List<C6122e0> list) {
            this.f17306a = list;
        }

        /* renamed from: a */
        public List<C6122e0> mo17410a() {
            return new ArrayList(this.f17306a);
        }

        /* renamed from: b */
        public boolean mo17411b() {
            return this.f17307b < this.f17306a.size();
        }

        /* renamed from: c */
        public C6122e0 mo17412c() {
            if (mo17411b()) {
                List<C6122e0> list = this.f17306a;
                int i = this.f17307b;
                this.f17307b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C6153f(C6098a aVar, C6151d dVar, C6120e eVar, C6248p pVar) {
        this.f17298a = aVar;
        this.f17299b = dVar;
        this.f17300c = eVar;
        this.f17301d = pVar;
        m25153h(aVar.mo17210l(), aVar.mo17204g());
    }

    /* renamed from: b */
    static String m25149b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: d */
    private boolean m25150d() {
        return this.f17303f < this.f17302e.size();
    }

    /* renamed from: f */
    private Proxy m25151f() throws IOException {
        if (m25150d()) {
            List<Proxy> list = this.f17302e;
            int i = this.f17303f;
            this.f17303f = i + 1;
            Proxy proxy = list.get(i);
            m25152g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f17298a.mo17210l().mo17709m() + "; exhausted proxy configurations: " + this.f17302e);
    }

    /* renamed from: g */
    private void m25152g(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f17304g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f17298a.mo17210l().mo17709m();
            i = this.f17298a.mo17210l().mo17715y();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m25149b(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f17304g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f17301d.mo17660j(this.f17300c, str);
            List<InetAddress> a = this.f17298a.mo17199c().mo17650a(str);
            if (!a.isEmpty()) {
                this.f17301d.mo17659i(this.f17300c, str, a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f17304g.add(new InetSocketAddress(a.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.f17298a.mo17199c() + " returned no addresses for " + str);
        }
    }

    /* renamed from: h */
    private void m25153h(C6257t tVar, Proxy proxy) {
        List<Proxy> u;
        if (proxy != null) {
            u = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f17298a.mo17207i().select(tVar.mo17700E());
            if (select == null || select.isEmpty()) {
                u = C6130c.m25058u(Proxy.NO_PROXY);
            } else {
                u = C6130c.m25057t(select);
            }
        }
        this.f17302e = u;
        this.f17303f = 0;
    }

    /* renamed from: a */
    public void mo17407a(C6122e0 e0Var, IOException iOException) {
        if (!(e0Var.mo17320b().type() == Proxy.Type.DIRECT || this.f17298a.mo17207i() == null)) {
            this.f17298a.mo17207i().connectFailed(this.f17298a.mo17210l().mo17700E(), e0Var.mo17320b().address(), iOException);
        }
        this.f17299b.mo17402b(e0Var);
    }

    /* renamed from: c */
    public boolean mo17408c() {
        return m25150d() || !this.f17305h.isEmpty();
    }

    /* renamed from: e */
    public C6154a mo17409e() throws IOException {
        if (mo17408c()) {
            ArrayList arrayList = new ArrayList();
            while (m25150d()) {
                Proxy f = m25151f();
                int size = this.f17304g.size();
                for (int i = 0; i < size; i++) {
                    C6122e0 e0Var = new C6122e0(this.f17298a, f, this.f17304g.get(i));
                    if (this.f17299b.mo17403c(e0Var)) {
                        this.f17305h.add(e0Var);
                    } else {
                        arrayList.add(e0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f17305h);
                this.f17305h.clear();
            }
            return new C6154a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
