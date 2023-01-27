package p148g.p189d.p190a.p200b.p229q0;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p229q0.C4245i;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4276o;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.q0.g */
public class C4243g implements C4245i {

    /* renamed from: q */
    private static final Pattern f13554q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    private static final AtomicReference<byte[]> f13555r = new AtomicReference<>();

    /* renamed from: a */
    private final boolean f13556a;

    /* renamed from: b */
    private final int f13557b;

    /* renamed from: c */
    private final int f13558c;

    /* renamed from: d */
    private final String f13559d;

    /* renamed from: e */
    private final C4276o<String> f13560e;

    /* renamed from: f */
    private final C4245i.C4250e f13561f;

    /* renamed from: g */
    private final C4245i.C4250e f13562g = new C4245i.C4250e();

    /* renamed from: h */
    private final C4258k<? super C4243g> f13563h;

    /* renamed from: i */
    private C4241e f13564i;

    /* renamed from: j */
    private HttpURLConnection f13565j;

    /* renamed from: k */
    private InputStream f13566k;

    /* renamed from: l */
    private boolean f13567l;

    /* renamed from: m */
    private long f13568m;

    /* renamed from: n */
    private long f13569n;

    /* renamed from: o */
    private long f13570o;

    /* renamed from: p */
    private long f13571p;

    public C4243g(String str, C4276o<String> oVar, C4258k<? super C4243g> kVar, int i, int i2, boolean z, C4245i.C4250e eVar) {
        C4260a.m18072d(str);
        this.f13559d = str;
        this.f13560e = oVar;
        this.f13563h = kVar;
        this.f13557b = i;
        this.f13558c = i2;
        this.f13556a = z;
        this.f13561f = eVar;
    }

    /* renamed from: e */
    private void m18008e() {
        HttpURLConnection httpURLConnection = this.f13565j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f13565j = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m18009f(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00a4
            java.util.regex.Pattern r1 = f13554q
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00a4
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x008d }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x008d }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0064
            r4 = r6
            goto L_0x00a4
        L_0x0064:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x008d }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x008d }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x008d }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x008d }
            r4 = r0
            goto L_0x00a4
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r3, r10)
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p229q0.C4243g.m18009f(java.net.HttpURLConnection):long");
    }

    /* renamed from: g */
    private static URL m18010g(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: h */
    private HttpURLConnection m18011h(C4241e eVar) throws IOException {
        HttpURLConnection i;
        C4241e eVar2 = eVar;
        URL url = new URL(eVar2.f13539a.toString());
        byte[] bArr = eVar2.f13540b;
        long j = eVar2.f13542d;
        long j2 = eVar2.f13543e;
        boolean a = eVar2.mo13374a(1);
        if (!this.f13556a) {
            return m18012i(url, bArr, j, j2, a, true);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 <= 20) {
                long j3 = j;
                int i4 = i3;
                i = m18012i(url, bArr, j, j2, a, false);
                int responseCode = i.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = i.getHeaderField("Location");
                    i.disconnect();
                    url = m18010g(url, headerField);
                    i2 = i4;
                    j = j3;
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i3);
            }
        }
        return i;
    }

    /* renamed from: i */
    private HttpURLConnection m18012i(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f13557b);
        httpURLConnection.setReadTimeout(this.f13558c);
        C4245i.C4250e eVar = this.f13561f;
        if (eVar != null) {
            for (Map.Entry next : eVar.mo13383a().entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        for (Map.Entry next2 : this.f13562g.mo13383a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f13559d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: j */
    private static void m18013j(HttpURLConnection httpURLConnection, long j) {
        int i = C4284w.f13659a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    private int m18014k(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13569n;
        if (j != -1) {
            long j2 = j - this.f13571p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = this.f13566k.read(bArr, i, i2);
        if (read != -1) {
            this.f13571p += (long) read;
            C4258k<? super C4243g> kVar = this.f13563h;
            if (kVar != null) {
                kVar.mo13395a(this, read);
            }
            return read;
        } else if (this.f13569n == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: l */
    private void m18015l() throws IOException {
        if (this.f13570o != this.f13568m) {
            byte[] andSet = f13555r.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f13570o;
                long j2 = this.f13568m;
                if (j != j2) {
                    int read = this.f13566k.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f13570o += (long) read;
                        C4258k<? super C4243g> kVar = this.f13563h;
                        if (kVar != null) {
                            kVar.mo13395a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f13555r.set(andSet);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public int mo13369a(byte[] bArr, int i, int i2) throws C4245i.C4247b {
        try {
            m18015l();
            return m18014k(bArr, i, i2);
        } catch (IOException e) {
            throw new C4245i.C4247b(e, this.f13564i, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo13370b(p148g.p189d.p190a.p200b.p229q0.C4241e r8) throws p148g.p189d.p190a.p200b.p229q0.C4245i.C4247b {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to connect to "
            r7.f13564i = r8
            r1 = 0
            r7.f13571p = r1
            r7.f13570o = r1
            r3 = 1
            java.net.HttpURLConnection r4 = r7.m18011h(r8)     // Catch:{ IOException -> 0x00c0 }
            r7.f13565j = r4     // Catch:{ IOException -> 0x00c0 }
            int r0 = r4.getResponseCode()     // Catch:{ IOException -> 0x00a1 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 < r4) goto L_0x0085
            r5 = 299(0x12b, float:4.19E-43)
            if (r0 <= r5) goto L_0x001e
            goto L_0x0085
        L_0x001e:
            java.net.HttpURLConnection r5 = r7.f13565j
            java.lang.String r5 = r5.getContentType()
            g.d.a.b.r0.o<java.lang.String> r6 = r7.f13560e
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.mo13491a(r5)
            if (r6 == 0) goto L_0x002f
            goto L_0x0038
        L_0x002f:
            r7.m18008e()
            g.d.a.b.q0.i$c r0 = new g.d.a.b.q0.i$c
            r0.<init>(r5, r8)
            throw r0
        L_0x0038:
            if (r0 != r4) goto L_0x0041
            long r4 = r8.f13542d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            r1 = r4
        L_0x0041:
            r7.f13568m = r1
            boolean r0 = r8.mo13374a(r3)
            if (r0 != 0) goto L_0x0063
            long r0 = r8.f13543e
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            goto L_0x0065
        L_0x0052:
            java.net.HttpURLConnection r0 = r7.f13565j
            long r0 = m18009f(r0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0060
            long r4 = r7.f13568m
            long r4 = r0 - r4
        L_0x0060:
            r7.f13569n = r4
            goto L_0x0067
        L_0x0063:
            long r0 = r8.f13543e
        L_0x0065:
            r7.f13569n = r0
        L_0x0067:
            java.net.HttpURLConnection r0 = r7.f13565j     // Catch:{ IOException -> 0x007b }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x007b }
            r7.f13566k = r0     // Catch:{ IOException -> 0x007b }
            r7.f13567l = r3
            g.d.a.b.q0.k<? super g.d.a.b.q0.g> r0 = r7.f13563h
            if (r0 == 0) goto L_0x0078
            r0.mo13397c(r7, r8)
        L_0x0078:
            long r0 = r7.f13569n
            return r0
        L_0x007b:
            r0 = move-exception
            r7.m18008e()
            g.d.a.b.q0.i$b r1 = new g.d.a.b.q0.i$b
            r1.<init>((java.io.IOException) r0, (p148g.p189d.p190a.p200b.p229q0.C4241e) r8, (int) r3)
            throw r1
        L_0x0085:
            java.net.HttpURLConnection r1 = r7.f13565j
            java.util.Map r1 = r1.getHeaderFields()
            r7.m18008e()
            g.d.a.b.q0.i$d r2 = new g.d.a.b.q0.i$d
            r2.<init>(r0, r1, r8)
            r8 = 416(0x1a0, float:5.83E-43)
            if (r0 != r8) goto L_0x00a0
            g.d.a.b.q0.d r8 = new g.d.a.b.q0.d
            r0 = 0
            r8.<init>(r0)
            r2.initCause(r8)
        L_0x00a0:
            throw r2
        L_0x00a1:
            r1 = move-exception
            r7.m18008e()
            g.d.a.b.q0.i$b r2 = new g.d.a.b.q0.i$b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.net.Uri r0 = r8.f13539a
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0, r1, r8, r3)
            throw r2
        L_0x00c0:
            r1 = move-exception
            g.d.a.b.q0.i$b r2 = new g.d.a.b.q0.i$b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.net.Uri r0 = r8.f13539a
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0, r1, r8, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p229q0.C4243g.mo13370b(g.d.a.b.q0.e):long");
    }

    /* renamed from: c */
    public Uri mo13371c() {
        HttpURLConnection httpURLConnection = this.f13565j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public void close() throws C4245i.C4247b {
        try {
            if (this.f13566k != null) {
                m18013j(this.f13565j, mo13379d());
                this.f13566k.close();
            }
            this.f13566k = null;
            m18008e();
            if (this.f13567l) {
                this.f13567l = false;
                C4258k<? super C4243g> kVar = this.f13563h;
                if (kVar != null) {
                    kVar.mo13396b(this);
                }
            }
        } catch (IOException e) {
            throw new C4245i.C4247b(e, this.f13564i, 3);
        } catch (Throwable th) {
            this.f13566k = null;
            m18008e();
            if (this.f13567l) {
                this.f13567l = false;
                C4258k<? super C4243g> kVar2 = this.f13563h;
                if (kVar2 != null) {
                    kVar2.mo13396b(this);
                }
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo13379d() {
        long j = this.f13569n;
        return j == -1 ? j : j - this.f13571p;
    }
}
