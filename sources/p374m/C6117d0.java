package p374m;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p374m.p375g0.C6130c;
import p385n.C6277c;
import p385n.C6281e;

/* renamed from: m.d0 */
public abstract class C6117d0 implements Closeable {

    /* renamed from: f */
    private Reader f17169f;

    /* renamed from: m.d0$a */
    class C6118a extends C6117d0 {

        /* renamed from: g */
        final /* synthetic */ C6261v f17170g;

        /* renamed from: h */
        final /* synthetic */ long f17171h;

        /* renamed from: i */
        final /* synthetic */ C6281e f17172i;

        C6118a(C6261v vVar, long j, C6281e eVar) {
            this.f17170g = vVar;
            this.f17171h = j;
            this.f17172i = eVar;
        }

        /* renamed from: j */
        public long mo17253j() {
            return this.f17171h;
        }

        /* renamed from: m */
        public C6261v mo17254m() {
            return this.f17170g;
        }

        /* renamed from: r */
        public C6281e mo17255r() {
            return this.f17172i;
        }
    }

    /* renamed from: m.d0$b */
    static final class C6119b extends Reader {

        /* renamed from: f */
        private final C6281e f17173f;

        /* renamed from: g */
        private final Charset f17174g;

        /* renamed from: h */
        private boolean f17175h;

        /* renamed from: i */
        private Reader f17176i;

        C6119b(C6281e eVar, Charset charset) {
            this.f17173f = eVar;
            this.f17174g = charset;
        }

        public void close() throws IOException {
            this.f17175h = true;
            Reader reader = this.f17176i;
            if (reader != null) {
                reader.close();
            } else {
                this.f17173f.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.f17175h) {
                Reader reader = this.f17176i;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.f17173f.inputStream(), C6130c.m25040c(this.f17173f, this.f17174g));
                    this.f17176i = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: h */
    private Charset m24986h() {
        C6261v m = mo17254m();
        return m != null ? m.mo17730a(C6130c.f17205i) : C6130c.f17205i;
    }

    /* renamed from: o */
    public static C6117d0 m24987o(C6261v vVar, long j, C6281e eVar) {
        if (eVar != null) {
            return new C6118a(vVar, j, eVar);
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: q */
    public static C6117d0 m24988q(C6261v vVar, byte[] bArr) {
        C6277c cVar = new C6277c();
        cVar.mo17841q0(bArr);
        return m24987o(vVar, (long) bArr.length, cVar);
    }

    /* renamed from: a */
    public final Reader mo17309a() {
        Reader reader = this.f17169f;
        if (reader != null) {
            return reader;
        }
        C6119b bVar = new C6119b(mo17255r(), m24986h());
        this.f17169f = bVar;
        return bVar;
    }

    public void close() {
        C6130c.m25044g(mo17255r());
    }

    /* renamed from: j */
    public abstract long mo17253j();

    /* renamed from: m */
    public abstract C6261v mo17254m();

    /* renamed from: r */
    public abstract C6281e mo17255r();
}
