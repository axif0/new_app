package p374m.p375g0.p378g;

import java.io.IOException;
import java.util.List;
import org.jsoup.helper.HttpConnection;
import p374m.C6099a0;
import p374m.C6103b0;
import p374m.C6113c0;
import p374m.C6242l;
import p374m.C6243m;
import p374m.C6255s;
import p374m.C6259u;
import p374m.C6261v;
import p374m.p375g0.C6130c;
import p374m.p375g0.C6133d;
import p385n.C6286j;
import p385n.C6288l;

/* renamed from: m.g0.g.a */
public final class C6157a implements C6259u {

    /* renamed from: a */
    private final C6243m f17323a;

    public C6157a(C6243m mVar) {
        this.f17323a = mVar;
    }

    /* renamed from: b */
    private String m25178b(List<C6242l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C6242l lVar = list.get(i);
            sb.append(lVar.mo17636c());
            sb.append('=');
            sb.append(lVar.mo17640k());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C6113c0 mo16688a(C6259u.C6260a aVar) throws IOException {
        C6099a0 request = aVar.request();
        C6099a0.C6100a h = request.mo17219h();
        C6103b0 a = request.mo17212a();
        if (a != null) {
            C6261v b = a.mo17234b();
            if (b != null) {
                h.mo17225c(HttpConnection.CONTENT_TYPE, b.toString());
            }
            long a2 = a.mo17233a();
            if (a2 != -1) {
                h.mo17225c("Content-Length", Long.toString(a2));
                h.mo17228f("Transfer-Encoding");
            } else {
                h.mo17225c("Transfer-Encoding", "chunked");
                h.mo17228f("Content-Length");
            }
        }
        boolean z = false;
        if (request.mo17214c("Host") == null) {
            h.mo17225c("Host", C6130c.m25056s(request.mo17221j(), false));
        }
        if (request.mo17214c("Connection") == null) {
            h.mo17225c("Connection", "Keep-Alive");
        }
        if (request.mo17214c("Accept-Encoding") == null && request.mo17214c("Range") == null) {
            z = true;
            h.mo17225c("Accept-Encoding", "gzip");
        }
        List<C6242l> a3 = this.f17323a.mo17642a(request.mo17221j());
        if (!a3.isEmpty()) {
            h.mo17225c("Cookie", m25178b(a3));
        }
        if (request.mo17214c("User-Agent") == null) {
            h.mo17225c("User-Agent", C6133d.m25065a());
        }
        C6113c0 d = aVar.mo17438d(h.mo17223a());
        C6163e.m25197g(this.f17323a, request.mo17221j(), d.mo17274t());
        C6113c0.C6114a D = d.mo17260D();
        D.mo17292p(request);
        if (z && "gzip".equalsIgnoreCase(d.mo17272q(HttpConnection.CONTENT_ENCODING)) && C6163e.m25193c(d)) {
            C6286j jVar = new C6286j(d.mo17266a().mo17255r());
            C6255s.C6256a f = d.mo17274t().mo17684f();
            f.mo17695f(HttpConnection.CONTENT_ENCODING);
            f.mo17695f("Content-Length");
            D.mo17286j(f.mo17693d());
            D.mo17280b(new C6166h(d.mo17272q(HttpConnection.CONTENT_TYPE), -1, C6288l.m25933d(jVar)));
        }
        return D.mo17281c();
    }
}
