package p374m.p375g0.p380i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jsoup.helper.HttpConnection;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6117d0;
import p374m.C6255s;
import p374m.C6259u;
import p374m.C6265x;
import p374m.C6268y;
import p374m.p375g0.C6128a;
import p374m.p375g0.C6130c;
import p374m.p375g0.p377f.C6155g;
import p374m.p375g0.p378g.C6160c;
import p374m.p375g0.p378g.C6163e;
import p374m.p375g0.p378g.C6166h;
import p374m.p375g0.p378g.C6167i;
import p374m.p375g0.p378g.C6169k;
import p385n.C6277c;
import p385n.C6282f;
import p385n.C6284h;
import p385n.C6288l;
import p385n.C6299r;
import p385n.C6300s;

/* renamed from: m.g0.i.f */
public final class C6186f implements C6160c {

    /* renamed from: f */
    private static final List<String> f17419f = C6130c.m25058u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g */
    private static final List<String> f17420g = C6130c.m25058u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final C6259u.C6260a f17421a;

    /* renamed from: b */
    final C6155g f17422b;

    /* renamed from: c */
    private final C6188g f17423c;

    /* renamed from: d */
    private C6206i f17424d;

    /* renamed from: e */
    private final C6268y f17425e;

    /* renamed from: m.g0.i.f$a */
    class C6187a extends C6284h {

        /* renamed from: g */
        boolean f17426g = false;

        /* renamed from: h */
        long f17427h = 0;

        C6187a(C6300s sVar) {
            super(sVar);
        }

        /* renamed from: h */
        private void m25302h(IOException iOException) {
            if (!this.f17426g) {
                this.f17426g = true;
                C6186f fVar = C6186f.this;
                fVar.f17422b.mo17424r(false, fVar, this.f17427h, iOException);
            }
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            try {
                long O = mo17896a().mo17355O(cVar, j);
                if (O > 0) {
                    this.f17427h += O;
                }
                return O;
            } catch (IOException e) {
                m25302h(e);
                throw e;
            }
        }

        public void close() throws IOException {
            super.close();
            m25302h((IOException) null);
        }
    }

    public C6186f(C6265x xVar, C6259u.C6260a aVar, C6155g gVar, C6188g gVar2) {
        this.f17421a = aVar;
        this.f17422b = gVar;
        this.f17423c = gVar2;
        this.f17425e = xVar.mo17740B().contains(C6268y.H2_PRIOR_KNOWLEDGE) ? C6268y.H2_PRIOR_KNOWLEDGE : C6268y.HTTP_2;
    }

    /* renamed from: g */
    public static List<C6180c> m25294g(C6099a0 a0Var) {
        C6255s e = a0Var.mo17216e();
        ArrayList arrayList = new ArrayList(e.mo17685h() + 4);
        arrayList.add(new C6180c(C6180c.f17389f, a0Var.mo17218g()));
        arrayList.add(new C6180c(C6180c.f17390g, C6167i.m25226c(a0Var.mo17221j())));
        String c = a0Var.mo17214c("Host");
        if (c != null) {
            arrayList.add(new C6180c(C6180c.f17392i, c));
        }
        arrayList.add(new C6180c(C6180c.f17391h, a0Var.mo17221j().mo17699D()));
        int h = e.mo17685h();
        for (int i = 0; i < h; i++) {
            C6282f n = C6282f.m25891n(e.mo17682e(i).toLowerCase(Locale.US));
            if (!f17419f.contains(n.mo17877D())) {
                arrayList.add(new C6180c(n, e.mo17687i(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static C6113c0.C6114a m25295h(C6255s sVar, C6268y yVar) throws IOException {
        C6255s.C6256a aVar = new C6255s.C6256a();
        int h = sVar.mo17685h();
        C6169k kVar = null;
        for (int i = 0; i < h; i++) {
            String e = sVar.mo17682e(i);
            String i2 = sVar.mo17687i(i);
            if (e.equals(":status")) {
                kVar = C6169k.m25237a("HTTP/1.1 " + i2);
            } else if (!f17420g.contains(e)) {
                C6128a.f17195a.mo17340b(aVar, e, i2);
            }
        }
        if (kVar != null) {
            C6113c0.C6114a aVar2 = new C6113c0.C6114a();
            aVar2.mo17290n(yVar);
            aVar2.mo17283g(kVar.f17349b);
            aVar2.mo17287k(kVar.f17350c);
            aVar2.mo17286j(aVar.mo17693d());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public void mo17426a() throws IOException {
        this.f17424d.mo17517j().close();
    }

    /* renamed from: b */
    public void mo17427b(C6099a0 a0Var) throws IOException {
        if (this.f17424d == null) {
            C6206i x = this.f17423c.mo17493x(m25294g(a0Var), a0Var.mo17212a() != null);
            this.f17424d = x;
            x.mo17521n().mo17904g((long) this.f17421a.mo17436b(), TimeUnit.MILLISECONDS);
            this.f17424d.mo17528u().mo17904g((long) this.f17421a.mo17437c(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public C6117d0 mo17428c(C6113c0 c0Var) throws IOException {
        C6155g gVar = this.f17422b;
        gVar.f17313f.mo17666q(gVar.f17312e);
        return new C6166h(c0Var.mo17272q(HttpConnection.CONTENT_TYPE), C6163e.m25192b(c0Var), C6288l.m25933d(new C6187a(this.f17424d.mo17518k())));
    }

    public void cancel() {
        C6206i iVar = this.f17424d;
        if (iVar != null) {
            iVar.mo17515h(C6179b.CANCEL);
        }
    }

    /* renamed from: d */
    public void mo17430d() throws IOException {
        this.f17423c.flush();
    }

    /* renamed from: e */
    public C6299r mo17431e(C6099a0 a0Var, long j) {
        return this.f17424d.mo17517j();
    }

    /* renamed from: f */
    public C6113c0.C6114a mo17432f(boolean z) throws IOException {
        C6113c0.C6114a h = m25295h(this.f17424d.mo17526s(), this.f17425e);
        if (!z || C6128a.f17195a.mo17342d(h) != 100) {
            return h;
        }
        return null;
    }
}
