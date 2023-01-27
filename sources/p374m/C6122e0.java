package p374m;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: m.e0 */
public final class C6122e0 {

    /* renamed from: a */
    final C6098a f17177a;

    /* renamed from: b */
    final Proxy f17178b;

    /* renamed from: c */
    final InetSocketAddress f17179c;

    public C6122e0(C6098a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f17177a = aVar;
            this.f17178b = proxy;
            this.f17179c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C6098a mo17319a() {
        return this.f17177a;
    }

    /* renamed from: b */
    public Proxy mo17320b() {
        return this.f17178b;
    }

    /* renamed from: c */
    public boolean mo17321c() {
        return this.f17177a.f17067i != null && this.f17178b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo17322d() {
        return this.f17179c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6122e0) {
            C6122e0 e0Var = (C6122e0) obj;
            return e0Var.f17177a.equals(this.f17177a) && e0Var.f17178b.equals(this.f17178b) && e0Var.f17179c.equals(this.f17179c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f17177a.hashCode()) * 31) + this.f17178b.hashCode()) * 31) + this.f17179c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f17179c + "}";
    }
}
