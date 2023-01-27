package p385n;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Logger;

/* renamed from: n.l */
public final class C6288l {

    /* renamed from: a */
    static final Logger f17797a = Logger.getLogger(C6288l.class.getName());

    /* renamed from: n.l$a */
    class C6289a implements C6299r {

        /* renamed from: f */
        final /* synthetic */ C6301t f17798f;

        /* renamed from: g */
        final /* synthetic */ OutputStream f17799g;

        C6289a(C6301t tVar, OutputStream outputStream) {
            this.f17798f = tVar;
            this.f17799g = outputStream;
        }

        public void close() throws IOException {
            this.f17799g.close();
        }

        /* renamed from: f */
        public void mo17384f(C6277c cVar, long j) throws IOException {
            C6303u.m26019b(cVar.f17777g, 0, j);
            while (j > 0) {
                this.f17798f.mo17903f();
                C6296o oVar = cVar.f17776f;
                int min = (int) Math.min(j, (long) (oVar.f17812c - oVar.f17811b));
                this.f17799g.write(oVar.f17810a, oVar.f17811b, min);
                int i = oVar.f17811b + min;
                oVar.f17811b = i;
                long j2 = (long) min;
                j -= j2;
                cVar.f17777g -= j2;
                if (i == oVar.f17812c) {
                    cVar.f17776f = oVar.mo17926b();
                    C6297p.m25987a(oVar);
                }
            }
        }

        public void flush() throws IOException {
            this.f17799g.flush();
        }

        public C6301t timeout() {
            return this.f17798f;
        }

        public String toString() {
            return "sink(" + this.f17799g + ")";
        }
    }

    /* renamed from: n.l$b */
    class C6290b implements C6300s {

        /* renamed from: f */
        final /* synthetic */ C6301t f17800f;

        /* renamed from: g */
        final /* synthetic */ InputStream f17801g;

        C6290b(C6301t tVar, InputStream inputStream) {
            this.f17800f = tVar;
            this.f17801g = inputStream;
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f17800f.mo17903f();
                    C6296o o0 = cVar.mo17838o0(1);
                    int read = this.f17801g.read(o0.f17810a, o0.f17812c, (int) Math.min(j, (long) (8192 - o0.f17812c)));
                    if (read == -1) {
                        return -1;
                    }
                    o0.f17812c += read;
                    long j2 = (long) read;
                    cVar.f17777g += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C6288l.m25934e(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public void close() throws IOException {
            this.f17801g.close();
        }

        public C6301t timeout() {
            return this.f17800f;
        }

        public String toString() {
            return "source(" + this.f17801g + ")";
        }
    }

    /* renamed from: n.l$c */
    class C6291c implements C6299r {
        C6291c() {
        }

        public void close() throws IOException {
        }

        /* renamed from: f */
        public void mo17384f(C6277c cVar, long j) throws IOException {
            cVar.mo17815c(j);
        }

        public void flush() throws IOException {
        }

        public C6301t timeout() {
            return C6301t.f17821d;
        }
    }

    /* renamed from: n.l$d */
    class C6292d extends C6272a {

        /* renamed from: k */
        final /* synthetic */ Socket f17802k;

        C6292d(Socket socket) {
            this.f17802k = socket;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo17530o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17531t() {
            /*
                r5 = this;
                java.lang.String r0 = "Failed to close timed out socket "
                java.net.Socket r1 = r5.f17802k     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                goto L_0x0033
            L_0x0008:
                r1 = move-exception
                boolean r2 = p385n.C6288l.m25934e(r1)
                if (r2 == 0) goto L_0x0019
                java.util.logging.Logger r2 = p385n.C6288l.f17797a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                goto L_0x0024
            L_0x0019:
                throw r1
            L_0x001a:
                r1 = move-exception
                java.util.logging.Logger r2 = p385n.C6288l.f17797a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
            L_0x0024:
                r4.append(r0)
                java.net.Socket r0 = r5.f17802k
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.log(r3, r0, r1)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p385n.C6288l.C6292d.mo17531t():void");
        }
    }

    private C6288l() {
    }

    /* renamed from: a */
    public static C6299r m25930a(File file) throws FileNotFoundException {
        if (file != null) {
            return m25936g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static C6299r m25931b() {
        return new C6291c();
    }

    /* renamed from: c */
    public static C6280d m25932c(C6299r rVar) {
        return new C6293m(rVar);
    }

    /* renamed from: d */
    public static C6281e m25933d(C6300s sVar) {
        return new C6294n(sVar);
    }

    /* renamed from: e */
    static boolean m25934e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: f */
    public static C6299r m25935f(File file) throws FileNotFoundException {
        if (file != null) {
            return m25936g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: g */
    public static C6299r m25936g(OutputStream outputStream) {
        return m25937h(outputStream, new C6301t());
    }

    /* renamed from: h */
    private static C6299r m25937h(OutputStream outputStream, C6301t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (tVar != null) {
            return new C6289a(tVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: i */
    public static C6299r m25938i(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C6272a n = m25943n(socket);
            return n.mo17789r(m25937h(socket.getOutputStream(), n));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: j */
    public static C6300s m25939j(File file) throws FileNotFoundException {
        if (file != null) {
            return m25940k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: k */
    public static C6300s m25940k(InputStream inputStream) {
        return m25941l(inputStream, new C6301t());
    }

    /* renamed from: l */
    private static C6300s m25941l(InputStream inputStream, C6301t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (tVar != null) {
            return new C6290b(tVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: m */
    public static C6300s m25942m(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C6272a n = m25943n(socket);
            return n.mo17790s(m25941l(socket.getInputStream(), n));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: n */
    private static C6272a m25943n(Socket socket) {
        return new C6292d(socket);
    }
}
