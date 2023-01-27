package org.jsoup.helper;

import com.karumi.dexter.BuildConfig;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

public class HttpConnection implements Connection {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String DEFAULT_UA = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
    public static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    /* renamed from: a */
    private Connection.Request f18027a = new Request();

    /* renamed from: b */
    private Connection.Response f18028b = new Response();

    public static class KeyVal implements Connection.KeyVal {

        /* renamed from: a */
        private String f18029a;

        /* renamed from: b */
        private String f18030b;

        /* renamed from: c */
        private InputStream f18031c;

        /* renamed from: d */
        private String f18032d;

        private KeyVal() {
        }

        public static KeyVal create(String str, String str2) {
            return new KeyVal().key(str).value(str2);
        }

        public static KeyVal create(String str, String str2, InputStream inputStream) {
            return new KeyVal().key(str).value(str2).inputStream(inputStream);
        }

        public String contentType() {
            return this.f18032d;
        }

        public Connection.KeyVal contentType(String str) {
            Validate.notEmpty(str);
            this.f18032d = str;
            return this;
        }

        public boolean hasInputStream() {
            return this.f18031c != null;
        }

        public InputStream inputStream() {
            return this.f18031c;
        }

        public KeyVal inputStream(InputStream inputStream) {
            Validate.notNull(this.f18030b, "Data input stream must not be null");
            this.f18031c = inputStream;
            return this;
        }

        public String key() {
            return this.f18029a;
        }

        public KeyVal key(String str) {
            Validate.notEmpty(str, "Data key must not be empty");
            this.f18029a = str;
            return this;
        }

        public String toString() {
            return this.f18029a + "=" + this.f18030b;
        }

        public String value() {
            return this.f18030b;
        }

        public KeyVal value(String str) {
            Validate.notNull(str, "Data value must not be null");
            this.f18030b = str;
            return this;
        }
    }

    public static class Request extends C6408b<Connection.Request> implements Connection.Request {

        /* renamed from: e */
        private Proxy f18033e;

        /* renamed from: f */
        private int f18034f = 30000;

        /* renamed from: g */
        private int f18035g = 1048576;

        /* renamed from: h */
        private boolean f18036h = true;

        /* renamed from: i */
        private Collection<Connection.KeyVal> f18037i = new ArrayList();

        /* renamed from: j */
        private String f18038j = null;

        /* renamed from: k */
        private boolean f18039k = false;

        /* renamed from: l */
        private boolean f18040l = false;

        /* renamed from: m */
        private Parser f18041m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public boolean f18042n = false;

        /* renamed from: o */
        private String f18043o = "UTF-8";

        /* renamed from: p */
        private SSLSocketFactory f18044p;

        Request() {
            super();
            this.f18058b = Connection.Method.GET;
            addHeader("Accept-Encoding", "gzip");
            addHeader("User-Agent", HttpConnection.DEFAULT_UA);
            this.f18041m = Parser.htmlParser();
        }

        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        public Collection<Connection.KeyVal> data() {
            return this.f18037i;
        }

        public Request data(Connection.KeyVal keyVal) {
            Validate.notNull(keyVal, "Key val must not be null");
            this.f18037i.add(keyVal);
            return this;
        }

        public Connection.Request followRedirects(boolean z) {
            this.f18036h = z;
            return this;
        }

        public boolean followRedirects() {
            return this.f18036h;
        }

        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        public /* bridge */ /* synthetic */ List headers(String str) {
            return super.headers(str);
        }

        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        public Connection.Request ignoreContentType(boolean z) {
            this.f18040l = z;
            return this;
        }

        public boolean ignoreContentType() {
            return this.f18040l;
        }

        public Connection.Request ignoreHttpErrors(boolean z) {
            this.f18039k = z;
            return this;
        }

        public boolean ignoreHttpErrors() {
            return this.f18039k;
        }

        public int maxBodySize() {
            return this.f18035g;
        }

        public Connection.Request maxBodySize(int i) {
            Validate.isTrue(i >= 0, "maxSize must be 0 (unlimited) or larger");
            this.f18035g = i;
            return this;
        }

        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        public /* bridge */ /* synthetic */ Map multiHeaders() {
            return super.multiHeaders();
        }

        public Request parser(Parser parser) {
            this.f18041m = parser;
            this.f18042n = true;
            return this;
        }

        public Parser parser() {
            return this.f18041m;
        }

        public String postDataCharset() {
            return this.f18043o;
        }

        public Connection.Request postDataCharset(String str) {
            Validate.notNull(str, "Charset must not be null");
            if (Charset.isSupported(str)) {
                this.f18043o = str;
                return this;
            }
            throw new IllegalCharsetNameException(str);
        }

        public Proxy proxy() {
            return this.f18033e;
        }

        public Request proxy(String str, int i) {
            this.f18033e = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str, i));
            return this;
        }

        public Request proxy(Proxy proxy) {
            this.f18033e = proxy;
            return this;
        }

        public String requestBody() {
            return this.f18038j;
        }

        public Connection.Request requestBody(String str) {
            this.f18038j = str;
            return this;
        }

        public SSLSocketFactory sslSocketFactory() {
            return this.f18044p;
        }

        public void sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f18044p = sSLSocketFactory;
        }

        public int timeout() {
            return this.f18034f;
        }

        public Request timeout(int i) {
            Validate.isTrue(i >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f18034f = i;
            return this;
        }

        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }
    }

    public static class Response extends C6408b<Connection.Response> implements Connection.Response {

        /* renamed from: p */
        private static final Pattern f18045p = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        /* renamed from: e */
        private int f18046e;

        /* renamed from: f */
        private String f18047f;

        /* renamed from: g */
        private ByteBuffer f18048g;

        /* renamed from: h */
        private InputStream f18049h;

        /* renamed from: i */
        private HttpURLConnection f18050i;

        /* renamed from: j */
        private String f18051j;

        /* renamed from: k */
        private String f18052k;

        /* renamed from: l */
        private boolean f18053l = false;

        /* renamed from: m */
        private boolean f18054m = false;

        /* renamed from: n */
        private int f18055n = 0;

        /* renamed from: o */
        private Connection.Request f18056o;

        Response() {
            super();
        }

        private Response(Response response) throws IOException {
            super();
            if (response != null) {
                int i = response.f18055n + 1;
                this.f18055n = i;
                if (i >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", new Object[]{response.url()}));
                }
            }
        }

        /* renamed from: e */
        private static HttpURLConnection m26258e(Connection.Request request) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) (request.proxy() == null ? request.url().openConnection() : request.url().openConnection(request.proxy()));
            httpURLConnection.setRequestMethod(request.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(request.timeout());
            httpURLConnection.setReadTimeout(request.timeout() / 2);
            if (request.sslSocketFactory() != null && (httpURLConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(request.sslSocketFactory());
            }
            if (request.method().hasBody()) {
                httpURLConnection.setDoOutput(true);
            }
            if (request.cookies().size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", m26262i(request));
            }
            for (Map.Entry next : request.multiHeaders().entrySet()) {
                for (String addRequestProperty : (List) next.getValue()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), addRequestProperty);
                }
            }
            return httpURLConnection;
        }

        /* renamed from: f */
        private static LinkedHashMap<String, List<String>> m26259f(HttpURLConnection httpURLConnection) {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerFieldKey == null && headerField == null) {
                    return linkedHashMap;
                }
                i++;
                if (!(headerFieldKey == null || headerField == null)) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        linkedHashMap.get(headerFieldKey).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
        }

        /* renamed from: g */
        static Response m26260g(Connection.Request request) throws IOException {
            return m26261h(request, (Response) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ IOException -> 0x01fa }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[Catch:{ IOException -> 0x01fa }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0117 A[Catch:{ IOException -> 0x01fa }] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static org.jsoup.helper.HttpConnection.Response m26261h(org.jsoup.Connection.Request r9, org.jsoup.helper.HttpConnection.Response r10) throws java.io.IOException {
            /*
                java.lang.String r0 = "Content-Encoding"
                java.lang.String r1 = "Location"
                java.lang.String r2 = "Request must not be null"
                org.jsoup.helper.Validate.notNull(r9, r2)
                java.net.URL r2 = r9.url()
                java.lang.String r3 = "URL must be specified to connect"
                org.jsoup.helper.Validate.notNull(r2, r3)
                java.net.URL r2 = r9.url()
                java.lang.String r2 = r2.getProtocol()
                java.lang.String r3 = "http"
                boolean r3 = r2.equals(r3)
                if (r3 != 0) goto L_0x0033
                java.lang.String r3 = "https"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x002b
                goto L_0x0033
            L_0x002b:
                java.net.MalformedURLException r9 = new java.net.MalformedURLException
                java.lang.String r10 = "Only http & https protocols supported"
                r9.<init>(r10)
                throw r9
            L_0x0033:
                org.jsoup.Connection$Method r2 = r9.method()
                boolean r2 = r2.hasBody()
                java.lang.String r3 = r9.requestBody()
                r4 = 1
                if (r3 == 0) goto L_0x0044
                r3 = 1
                goto L_0x0045
            L_0x0044:
                r3 = 0
            L_0x0045:
                if (r2 != 0) goto L_0x005f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Cannot set a request body for HTTP method "
                r5.append(r6)
                org.jsoup.Connection$Method r6 = r9.method()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                org.jsoup.helper.Validate.isFalse(r3, r5)
            L_0x005f:
                java.util.Collection r5 = r9.data()
                int r5 = r5.size()
                r6 = 0
                if (r5 <= 0) goto L_0x0072
                if (r2 == 0) goto L_0x006e
                if (r3 == 0) goto L_0x0072
            L_0x006e:
                m26265m(r9)
                goto L_0x0079
            L_0x0072:
                if (r2 == 0) goto L_0x0079
                java.lang.String r2 = m26266n(r9)
                goto L_0x007a
            L_0x0079:
                r2 = r6
            L_0x007a:
                long r7 = java.lang.System.nanoTime()
                java.net.HttpURLConnection r3 = m26258e(r9)
                r3.connect()     // Catch:{ IOException -> 0x01fa }
                boolean r5 = r3.getDoOutput()     // Catch:{ IOException -> 0x01fa }
                if (r5 == 0) goto L_0x0092
                java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x01fa }
                m26268p(r9, r5, r2)     // Catch:{ IOException -> 0x01fa }
            L_0x0092:
                int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x01fa }
                org.jsoup.helper.HttpConnection$Response r5 = new org.jsoup.helper.HttpConnection$Response     // Catch:{ IOException -> 0x01fa }
                r5.<init>(r10)     // Catch:{ IOException -> 0x01fa }
                r5.m26267o(r3, r10)     // Catch:{ IOException -> 0x01fa }
                r5.f18056o = r9     // Catch:{ IOException -> 0x01fa }
                boolean r10 = r5.hasHeader(r1)     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0117
                boolean r10 = r9.followRedirects()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0117
                r10 = 307(0x133, float:4.3E-43)
                if (r2 == r10) goto L_0x00c4
                org.jsoup.Connection$Method r10 = org.jsoup.Connection.Method.GET     // Catch:{ IOException -> 0x01fa }
                r9.method(r10)     // Catch:{ IOException -> 0x01fa }
                java.util.Collection r10 = r9.data()     // Catch:{ IOException -> 0x01fa }
                r10.clear()     // Catch:{ IOException -> 0x01fa }
                r9.requestBody(r6)     // Catch:{ IOException -> 0x01fa }
                java.lang.String r10 = "Content-Type"
                r9.removeHeader(r10)     // Catch:{ IOException -> 0x01fa }
            L_0x00c4:
                java.lang.String r10 = r5.header(r1)     // Catch:{ IOException -> 0x01fa }
                java.lang.String r0 = "http:/"
                boolean r0 = r10.startsWith(r0)     // Catch:{ IOException -> 0x01fa }
                if (r0 == 0) goto L_0x00dd
                r0 = 6
                char r1 = r10.charAt(r0)     // Catch:{ IOException -> 0x01fa }
                r2 = 47
                if (r1 == r2) goto L_0x00dd
                java.lang.String r10 = r10.substring(r0)     // Catch:{ IOException -> 0x01fa }
            L_0x00dd:
                java.net.URL r0 = r9.url()     // Catch:{ IOException -> 0x01fa }
                java.net.URL r10 = org.jsoup.internal.StringUtil.resolve((java.net.URL) r0, (java.lang.String) r10)     // Catch:{ IOException -> 0x01fa }
                java.net.URL r10 = org.jsoup.helper.HttpConnection.m26255e(r10)     // Catch:{ IOException -> 0x01fa }
                r9.url(r10)     // Catch:{ IOException -> 0x01fa }
                java.util.Map<java.lang.String, java.lang.String> r10 = r5.f18060d     // Catch:{ IOException -> 0x01fa }
                java.util.Set r10 = r10.entrySet()     // Catch:{ IOException -> 0x01fa }
                java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x01fa }
            L_0x00f6:
                boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x01fa }
                if (r0 == 0) goto L_0x0112
                java.lang.Object r0 = r10.next()     // Catch:{ IOException -> 0x01fa }
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x01fa }
                java.lang.Object r1 = r0.getKey()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x01fa }
                java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01fa }
                r9.cookie(r1, r0)     // Catch:{ IOException -> 0x01fa }
                goto L_0x00f6
            L_0x0112:
                org.jsoup.helper.HttpConnection$Response r9 = m26261h(r9, r5)     // Catch:{ IOException -> 0x01fa }
                return r9
            L_0x0117:
                r10 = 200(0xc8, float:2.8E-43)
                if (r2 < r10) goto L_0x011f
                r10 = 400(0x190, float:5.6E-43)
                if (r2 < r10) goto L_0x0125
            L_0x011f:
                boolean r10 = r9.ignoreHttpErrors()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01ea
            L_0x0125:
                java.lang.String r10 = r5.contentType()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0156
                boolean r1 = r9.ignoreContentType()     // Catch:{ IOException -> 0x01fa }
                if (r1 != 0) goto L_0x0156
                java.lang.String r1 = "text/"
                boolean r1 = r10.startsWith(r1)     // Catch:{ IOException -> 0x01fa }
                if (r1 != 0) goto L_0x0156
                java.util.regex.Pattern r1 = f18045p     // Catch:{ IOException -> 0x01fa }
                java.util.regex.Matcher r1 = r1.matcher(r10)     // Catch:{ IOException -> 0x01fa }
                boolean r1 = r1.matches()     // Catch:{ IOException -> 0x01fa }
                if (r1 == 0) goto L_0x0146
                goto L_0x0156
            L_0x0146:
                org.jsoup.UnsupportedMimeTypeException r0 = new org.jsoup.UnsupportedMimeTypeException     // Catch:{ IOException -> 0x01fa }
                java.lang.String r1 = "Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml"
                java.net.URL r9 = r9.url()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x01fa }
                r0.<init>(r1, r10, r9)     // Catch:{ IOException -> 0x01fa }
                throw r0     // Catch:{ IOException -> 0x01fa }
            L_0x0156:
                if (r10 == 0) goto L_0x0178
                java.util.regex.Pattern r1 = f18045p     // Catch:{ IOException -> 0x01fa }
                java.util.regex.Matcher r10 = r1.matcher(r10)     // Catch:{ IOException -> 0x01fa }
                boolean r10 = r10.matches()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0178
                boolean r10 = r9 instanceof org.jsoup.helper.HttpConnection.Request     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0178
                r10 = r9
                org.jsoup.helper.HttpConnection$Request r10 = (org.jsoup.helper.HttpConnection.Request) r10     // Catch:{ IOException -> 0x01fa }
                boolean r10 = r10.f18042n     // Catch:{ IOException -> 0x01fa }
                if (r10 != 0) goto L_0x0178
                org.jsoup.parser.Parser r10 = org.jsoup.parser.Parser.xmlParser()     // Catch:{ IOException -> 0x01fa }
                r9.parser(r10)     // Catch:{ IOException -> 0x01fa }
            L_0x0178:
                java.lang.String r10 = r5.f18052k     // Catch:{ IOException -> 0x01fa }
                java.lang.String r10 = org.jsoup.helper.DataUtil.m26245d(r10)     // Catch:{ IOException -> 0x01fa }
                r5.f18051j = r10     // Catch:{ IOException -> 0x01fa }
                int r10 = r3.getContentLength()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01e1
                org.jsoup.Connection$Method r10 = r9.method()     // Catch:{ IOException -> 0x01fa }
                org.jsoup.Connection$Method r1 = org.jsoup.Connection.Method.HEAD     // Catch:{ IOException -> 0x01fa }
                if (r10 == r1) goto L_0x01e1
                r5.f18049h = r6     // Catch:{ IOException -> 0x01fa }
                java.io.InputStream r10 = r3.getErrorStream()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x019b
                java.io.InputStream r10 = r3.getErrorStream()     // Catch:{ IOException -> 0x01fa }
                goto L_0x019f
            L_0x019b:
                java.io.InputStream r10 = r3.getInputStream()     // Catch:{ IOException -> 0x01fa }
            L_0x019f:
                r5.f18049h = r10     // Catch:{ IOException -> 0x01fa }
                java.lang.String r10 = "gzip"
                boolean r10 = r5.hasHeaderWithValue(r0, r10)     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01b3
                java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x01fa }
                java.io.InputStream r0 = r5.f18049h     // Catch:{ IOException -> 0x01fa }
                r10.<init>(r0)     // Catch:{ IOException -> 0x01fa }
            L_0x01b0:
                r5.f18049h = r10     // Catch:{ IOException -> 0x01fa }
                goto L_0x01c8
            L_0x01b3:
                java.lang.String r10 = "deflate"
                boolean r10 = r5.hasHeaderWithValue(r0, r10)     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01c8
                java.util.zip.InflaterInputStream r10 = new java.util.zip.InflaterInputStream     // Catch:{ IOException -> 0x01fa }
                java.io.InputStream r0 = r5.f18049h     // Catch:{ IOException -> 0x01fa }
                java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch:{ IOException -> 0x01fa }
                r1.<init>(r4)     // Catch:{ IOException -> 0x01fa }
                r10.<init>(r0, r1)     // Catch:{ IOException -> 0x01fa }
                goto L_0x01b0
            L_0x01c8:
                java.io.InputStream r10 = r5.f18049h     // Catch:{ IOException -> 0x01fa }
                r0 = 32768(0x8000, float:4.5918E-41)
                int r1 = r9.maxBodySize()     // Catch:{ IOException -> 0x01fa }
                org.jsoup.internal.ConstrainableInputStream r10 = org.jsoup.internal.ConstrainableInputStream.wrap(r10, r0, r1)     // Catch:{ IOException -> 0x01fa }
                int r9 = r9.timeout()     // Catch:{ IOException -> 0x01fa }
                long r0 = (long) r9     // Catch:{ IOException -> 0x01fa }
                org.jsoup.internal.ConstrainableInputStream r9 = r10.timeout(r7, r0)     // Catch:{ IOException -> 0x01fa }
                r5.f18049h = r9     // Catch:{ IOException -> 0x01fa }
                goto L_0x01e7
            L_0x01e1:
                java.nio.ByteBuffer r9 = org.jsoup.helper.DataUtil.m26244c()     // Catch:{ IOException -> 0x01fa }
                r5.f18048g = r9     // Catch:{ IOException -> 0x01fa }
            L_0x01e7:
                r5.f18053l = r4
                return r5
            L_0x01ea:
                org.jsoup.HttpStatusException r10 = new org.jsoup.HttpStatusException     // Catch:{ IOException -> 0x01fa }
                java.lang.String r0 = "HTTP error fetching URL"
                java.net.URL r9 = r9.url()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x01fa }
                r10.<init>(r0, r2, r9)     // Catch:{ IOException -> 0x01fa }
                throw r10     // Catch:{ IOException -> 0x01fa }
            L_0x01fa:
                r9 = move-exception
                r3.disconnect()
                goto L_0x0200
            L_0x01ff:
                throw r9
            L_0x0200:
                goto L_0x01ff
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.m26261h(org.jsoup.Connection$Request, org.jsoup.helper.HttpConnection$Response):org.jsoup.helper.HttpConnection$Response");
        }

        /* renamed from: i */
        private static String m26262i(Connection.Request request) {
            StringBuilder borrowBuilder = StringUtil.borrowBuilder();
            boolean z = true;
            for (Map.Entry next : request.cookies().entrySet()) {
                if (!z) {
                    borrowBuilder.append("; ");
                } else {
                    z = false;
                }
                borrowBuilder.append((String) next.getKey());
                borrowBuilder.append('=');
                borrowBuilder.append((String) next.getValue());
            }
            return StringUtil.releaseBuilder(borrowBuilder);
        }

        /* renamed from: j */
        private void m26263j() {
            Validate.isTrue(this.f18053l, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.f18048g == null) {
                Validate.isFalse(this.f18054m, "Request has already been read (with .parse())");
                try {
                    this.f18048g = DataUtil.readToByteBuffer(this.f18049h, this.f18056o.maxBodySize());
                    this.f18054m = true;
                    m26264l();
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                } catch (Throwable th) {
                    this.f18054m = true;
                    m26264l();
                    throw th;
                }
            }
        }

        /* renamed from: l */
        private void m26264l() {
            HttpURLConnection httpURLConnection = this.f18050i;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f18050i = null;
            }
            InputStream inputStream = this.f18049h;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f18049h = null;
                    throw th;
                }
                this.f18049h = null;
            }
        }

        /* renamed from: m */
        private static void m26265m(Connection.Request request) throws IOException {
            boolean z;
            URL url = request.url();
            StringBuilder borrowBuilder = StringUtil.borrowBuilder();
            borrowBuilder.append(url.getProtocol());
            borrowBuilder.append("://");
            borrowBuilder.append(url.getAuthority());
            borrowBuilder.append(url.getPath());
            borrowBuilder.append("?");
            if (url.getQuery() != null) {
                borrowBuilder.append(url.getQuery());
                z = false;
            } else {
                z = true;
            }
            for (Connection.KeyVal next : request.data()) {
                Validate.isFalse(next.hasInputStream(), "InputStream data not supported in URL query string.");
                if (!z) {
                    borrowBuilder.append('&');
                } else {
                    z = false;
                }
                borrowBuilder.append(URLEncoder.encode(next.key(), "UTF-8"));
                borrowBuilder.append('=');
                borrowBuilder.append(URLEncoder.encode(next.value(), "UTF-8"));
            }
            request.url(new URL(StringUtil.releaseBuilder(borrowBuilder)));
            request.data().clear();
        }

        /* renamed from: n */
        private static String m26266n(Connection.Request request) {
            StringBuilder sb;
            String str;
            if (request.hasHeader(HttpConnection.CONTENT_TYPE)) {
                if (request.header(HttpConnection.CONTENT_TYPE).contains(HttpConnection.MULTIPART_FORM_DATA) && !request.header(HttpConnection.CONTENT_TYPE).contains("boundary")) {
                    str = DataUtil.m26246e();
                    sb = new StringBuilder();
                }
                return null;
            } else if (HttpConnection.m26256f(request)) {
                str = DataUtil.m26246e();
                sb = new StringBuilder();
            } else {
                request.header(HttpConnection.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=" + request.postDataCharset());
                return null;
            }
            sb.append("multipart/form-data; boundary=");
            sb.append(str);
            request.header(HttpConnection.CONTENT_TYPE, sb.toString());
            return str;
        }

        /* renamed from: o */
        private void m26267o(HttpURLConnection httpURLConnection, Response response) throws IOException {
            this.f18050i = httpURLConnection;
            this.f18058b = Connection.Method.valueOf(httpURLConnection.getRequestMethod());
            this.f18057a = httpURLConnection.getURL();
            this.f18046e = httpURLConnection.getResponseCode();
            this.f18047f = httpURLConnection.getResponseMessage();
            this.f18052k = httpURLConnection.getContentType();
            mo18175k(m26259f(httpURLConnection));
            if (response != null) {
                for (Map.Entry entry : response.cookies().entrySet()) {
                    if (!hasCookie((String) entry.getKey())) {
                        cookie((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                response.m26264l();
            }
        }

        /* renamed from: p */
        private static void m26268p(Connection.Request request, OutputStream outputStream, String str) throws IOException {
            Collection<Connection.KeyVal> data = request.data();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, request.postDataCharset()));
            if (str != null) {
                for (Connection.KeyVal next : data) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(HttpConnection.m26253c(next.key()));
                    bufferedWriter.write("\"");
                    if (next.hasInputStream()) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(HttpConnection.m26253c(next.value()));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        bufferedWriter.write(next.contentType() != null ? next.contentType() : "application/octet-stream");
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        DataUtil.m26242a(next.inputStream(), outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(next.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else if (request.requestBody() != null) {
                bufferedWriter.write(request.requestBody());
            } else {
                boolean z = true;
                for (Connection.KeyVal next2 : data) {
                    if (!z) {
                        bufferedWriter.append('&');
                    } else {
                        z = false;
                    }
                    bufferedWriter.write(URLEncoder.encode(next2.key(), request.postDataCharset()));
                    bufferedWriter.write(61);
                    bufferedWriter.write(URLEncoder.encode(next2.value(), request.postDataCharset()));
                }
            }
            bufferedWriter.close();
        }

        public String body() {
            m26263j();
            String str = this.f18051j;
            if (str == null) {
                str = "UTF-8";
            }
            String charBuffer = Charset.forName(str).decode(this.f18048g).toString();
            this.f18048g.rewind();
            return charBuffer;
        }

        public byte[] bodyAsBytes() {
            m26263j();
            return this.f18048g.array();
        }

        public BufferedInputStream bodyStream() {
            Validate.isTrue(this.f18053l, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            Validate.isFalse(this.f18054m, "Request has already been read");
            this.f18054m = true;
            return ConstrainableInputStream.wrap(this.f18049h, 32768, this.f18056o.maxBodySize());
        }

        public Connection.Response bufferUp() {
            m26263j();
            return this;
        }

        public String charset() {
            return this.f18051j;
        }

        public Response charset(String str) {
            this.f18051j = str;
            return this;
        }

        public String contentType() {
            return this.f18052k;
        }

        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        public /* bridge */ /* synthetic */ List headers(String str) {
            return super.headers(str);
        }

        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo18175k(Map<String, List<String>> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (str != null) {
                    List<String> list = (List) next.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                TokenQueue tokenQueue = new TokenQueue(str2);
                                String trim = tokenQueue.chompTo("=").trim();
                                String trim2 = tokenQueue.consumeTo(";").trim();
                                if (trim.length() > 0) {
                                    cookie(trim, trim2);
                                }
                            }
                        }
                    }
                    for (String addHeader : list) {
                        addHeader(str, addHeader);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        public /* bridge */ /* synthetic */ Map multiHeaders() {
            return super.multiHeaders();
        }

        public Document parse() throws IOException {
            Validate.isTrue(this.f18053l, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            if (this.f18048g != null) {
                this.f18049h = new ByteArrayInputStream(this.f18048g.array());
                this.f18054m = false;
            }
            Validate.isFalse(this.f18054m, "Input stream already read and parsed, cannot re-read.");
            Document f = DataUtil.m26247f(this.f18049h, this.f18051j, this.f18057a.toExternalForm(), this.f18056o.parser());
            this.f18051j = f.outputSettings().charset().name();
            this.f18054m = true;
            m26264l();
            return f;
        }

        public int statusCode() {
            return this.f18046e;
        }

        public String statusMessage() {
            return this.f18047f;
        }

        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }
    }

    /* renamed from: org.jsoup.helper.HttpConnection$b */
    private static abstract class C6408b<T extends Connection.Base> implements Connection.Base<T> {

        /* renamed from: a */
        URL f18057a;

        /* renamed from: b */
        Connection.Method f18058b;

        /* renamed from: c */
        Map<String, List<String>> f18059c;

        /* renamed from: d */
        Map<String, String> f18060d;

        private C6408b() {
            this.f18059c = new LinkedHashMap();
            this.f18060d = new LinkedHashMap();
        }

        /* renamed from: a */
        private static String m26270a(String str) {
            try {
                byte[] bytes = str.getBytes("ISO-8859-1");
                return !m26272c(bytes) ? str : new String(bytes, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        }

        /* renamed from: b */
        private List<String> m26271b(String str) {
            Validate.notNull(str);
            for (Map.Entry next : this.f18059c.entrySet()) {
                if (str.equalsIgnoreCase((String) next.getKey())) {
                    return (List) next.getValue();
                }
            }
            return Collections.emptyList();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            if ((((r8[1] & 255) == 187) & ((r8[2] & 255) == 191)) != false) goto L_0x002a;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m26272c(byte[] r8) {
            /*
                int r0 = r8.length
                r1 = 3
                r2 = 1
                r3 = 0
                if (r0 < r1) goto L_0x0029
                byte r0 = r8[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 239(0xef, float:3.35E-43)
                if (r0 != r4) goto L_0x0029
                byte r0 = r8[r2]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 187(0xbb, float:2.62E-43)
                if (r0 != r4) goto L_0x0018
                r0 = 1
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                r4 = 2
                byte r4 = r8[r4]
                r4 = r4 & 255(0xff, float:3.57E-43)
                r5 = 191(0xbf, float:2.68E-43)
                if (r4 != r5) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                r0 = r0 & r4
                if (r0 == 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r1 = 0
            L_0x002a:
                int r0 = r8.length
            L_0x002b:
                if (r1 >= r0) goto L_0x0061
                byte r4 = r8[r1]
                r5 = r4 & 128(0x80, float:1.794E-43)
                if (r5 != 0) goto L_0x0034
                goto L_0x005e
            L_0x0034:
                r5 = r4 & 224(0xe0, float:3.14E-43)
                r6 = 192(0xc0, float:2.69E-43)
                if (r5 != r6) goto L_0x003d
                int r4 = r1 + 1
                goto L_0x004e
            L_0x003d:
                r5 = r4 & 240(0xf0, float:3.36E-43)
                r7 = 224(0xe0, float:3.14E-43)
                if (r5 != r7) goto L_0x0046
                int r4 = r1 + 2
                goto L_0x004e
            L_0x0046:
                r4 = r4 & 248(0xf8, float:3.48E-43)
                r5 = 240(0xf0, float:3.36E-43)
                if (r4 != r5) goto L_0x0060
                int r4 = r1 + 3
            L_0x004e:
                int r5 = r8.length
                if (r4 < r5) goto L_0x0052
                return r3
            L_0x0052:
                if (r1 >= r4) goto L_0x005e
                int r1 = r1 + 1
                byte r5 = r8[r1]
                r5 = r5 & r6
                r7 = 128(0x80, float:1.794E-43)
                if (r5 == r7) goto L_0x0052
                return r3
            L_0x005e:
                int r1 = r1 + r2
                goto L_0x002b
            L_0x0060:
                return r3
            L_0x0061:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.C6408b.m26272c(byte[]):boolean");
        }

        /* renamed from: d */
        private Map.Entry<String, List<String>> m26273d(String str) {
            String lowerCase = Normalizer.lowerCase(str);
            for (Map.Entry<String, List<String>> next : this.f18059c.entrySet()) {
                if (Normalizer.lowerCase(next.getKey()).equals(lowerCase)) {
                    return next;
                }
            }
            return null;
        }

        public T addHeader(String str, String str2) {
            Validate.notEmpty(str);
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            List headers = headers(str);
            if (headers.isEmpty()) {
                headers = new ArrayList();
                this.f18059c.put(str, headers);
            }
            headers.add(m26270a(str2));
            return this;
        }

        public String cookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            return this.f18060d.get(str);
        }

        public T cookie(String str, String str2) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            Validate.notNull(str2, "Cookie value must not be null");
            this.f18060d.put(str, str2);
            return this;
        }

        public Map<String, String> cookies() {
            return this.f18060d;
        }

        public boolean hasCookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            return this.f18060d.containsKey(str);
        }

        public boolean hasHeader(String str) {
            Validate.notEmpty(str, "Header name must not be empty");
            return m26271b(str).size() != 0;
        }

        public boolean hasHeaderWithValue(String str, String str2) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            for (String equalsIgnoreCase : headers(str)) {
                if (str2.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
            return false;
        }

        public String header(String str) {
            Validate.notNull(str, "Header name must not be null");
            List<String> b = m26271b(str);
            if (b.size() > 0) {
                return StringUtil.join((Collection) b, ", ");
            }
            return null;
        }

        public T header(String str, String str2) {
            Validate.notEmpty(str, "Header name must not be empty");
            removeHeader(str);
            addHeader(str, str2);
            return this;
        }

        public List<String> headers(String str) {
            Validate.notEmpty(str);
            return m26271b(str);
        }

        public Map<String, String> headers() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f18059c.size());
            for (Map.Entry next : this.f18059c.entrySet()) {
                String str = (String) next.getKey();
                List list = (List) next.getValue();
                if (list.size() > 0) {
                    linkedHashMap.put(str, list.get(0));
                }
            }
            return linkedHashMap;
        }

        public T method(Connection.Method method) {
            Validate.notNull(method, "Method must not be null");
            this.f18058b = method;
            return this;
        }

        public Connection.Method method() {
            return this.f18058b;
        }

        public Map<String, List<String>> multiHeaders() {
            return this.f18059c;
        }

        public T removeCookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            this.f18060d.remove(str);
            return this;
        }

        public T removeHeader(String str) {
            Validate.notEmpty(str, "Header name must not be empty");
            Map.Entry<String, List<String>> d = m26273d(str);
            if (d != null) {
                this.f18059c.remove(d.getKey());
            }
            return this;
        }

        public URL url() {
            return this.f18057a;
        }

        public T url(URL url) {
            Validate.notNull(url, "URL must not be null");
            this.f18057a = url;
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m26253c(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\"", "%22");
    }

    public static Connection connect(String str) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(str);
        return httpConnection;
    }

    public static Connection connect(URL url) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        return httpConnection;
    }

    /* renamed from: d */
    private static String m26254d(String str) {
        try {
            return m26255e(new URL(str)).toExternalForm();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: e */
    static URL m26255e(URL url) {
        try {
            return new URL(new URI(url.toExternalForm().replaceAll(" ", "%20")).toASCIIString());
        } catch (Exception unused) {
            return url;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m26256f(Connection.Request request) {
        for (Connection.KeyVal hasInputStream : request.data()) {
            if (hasInputStream.hasInputStream()) {
                return true;
            }
        }
        return false;
    }

    public Connection cookie(String str, String str2) {
        this.f18027a.cookie(str, str2);
        return this;
    }

    public Connection cookies(Map<String, String> map) {
        Validate.notNull(map, "Cookie map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f18027a.cookie((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    public Connection.KeyVal data(String str) {
        Validate.notEmpty(str, "Data key must not be empty");
        for (Connection.KeyVal next : request().data()) {
            if (next.key().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Connection data(String str, String str2) {
        this.f18027a.data(KeyVal.create(str, str2));
        return this;
    }

    public Connection data(String str, String str2, InputStream inputStream) {
        this.f18027a.data(KeyVal.create(str, str2, inputStream));
        return this;
    }

    public Connection data(String str, String str2, InputStream inputStream, String str3) {
        this.f18027a.data(KeyVal.create(str, str2, inputStream).contentType(str3));
        return this;
    }

    public Connection data(Collection<Connection.KeyVal> collection) {
        Validate.notNull(collection, "Data collection must not be null");
        for (Connection.KeyVal data : collection) {
            this.f18027a.data(data);
        }
        return this;
    }

    public Connection data(Map<String, String> map) {
        Validate.notNull(map, "Data map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f18027a.data(KeyVal.create((String) next.getKey(), (String) next.getValue()));
        }
        return this;
    }

    public Connection data(String... strArr) {
        Validate.notNull(strArr, "Data key value pairs must not be null");
        Validate.isTrue(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            Validate.notEmpty(str, "Data key must not be empty");
            Validate.notNull(str2, "Data value must not be null");
            this.f18027a.data(KeyVal.create(str, str2));
        }
        return this;
    }

    public Connection.Response execute() throws IOException {
        Response g = Response.m26260g(this.f18027a);
        this.f18028b = g;
        return g;
    }

    public Connection followRedirects(boolean z) {
        this.f18027a.followRedirects(z);
        return this;
    }

    public Document get() throws IOException {
        this.f18027a.method(Connection.Method.GET);
        execute();
        return this.f18028b.parse();
    }

    public Connection header(String str, String str2) {
        this.f18027a.header(str, str2);
        return this;
    }

    public Connection headers(Map<String, String> map) {
        Validate.notNull(map, "Header map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f18027a.header((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    public Connection ignoreContentType(boolean z) {
        this.f18027a.ignoreContentType(z);
        return this;
    }

    public Connection ignoreHttpErrors(boolean z) {
        this.f18027a.ignoreHttpErrors(z);
        return this;
    }

    public Connection maxBodySize(int i) {
        this.f18027a.maxBodySize(i);
        return this;
    }

    public Connection method(Connection.Method method) {
        this.f18027a.method(method);
        return this;
    }

    public Connection parser(Parser parser) {
        this.f18027a.parser(parser);
        return this;
    }

    public Document post() throws IOException {
        this.f18027a.method(Connection.Method.POST);
        execute();
        return this.f18028b.parse();
    }

    public Connection postDataCharset(String str) {
        this.f18027a.postDataCharset(str);
        return this;
    }

    public Connection proxy(String str, int i) {
        this.f18027a.proxy(str, i);
        return this;
    }

    public Connection proxy(Proxy proxy) {
        this.f18027a.proxy(proxy);
        return this;
    }

    public Connection referrer(String str) {
        Validate.notNull(str, "Referrer must not be null");
        this.f18027a.header("Referer", str);
        return this;
    }

    public Connection.Request request() {
        return this.f18027a;
    }

    public Connection request(Connection.Request request) {
        this.f18027a = request;
        return this;
    }

    public Connection requestBody(String str) {
        this.f18027a.requestBody(str);
        return this;
    }

    public Connection.Response response() {
        return this.f18028b;
    }

    public Connection response(Connection.Response response) {
        this.f18028b = response;
        return this;
    }

    public Connection sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f18027a.sslSocketFactory(sSLSocketFactory);
        return this;
    }

    public Connection timeout(int i) {
        this.f18027a.timeout(i);
        return this;
    }

    public Connection url(String str) {
        Validate.notEmpty(str, "Must supply a valid URL");
        try {
            this.f18027a.url(new URL(m26254d(str)));
            return this;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Malformed URL: " + str, e);
        }
    }

    public Connection url(URL url) {
        this.f18027a.url(url);
        return this;
    }

    public Connection userAgent(String str) {
        Validate.notNull(str, "User agent must not be null");
        this.f18027a.header("User-Agent", str);
        return this;
    }
}
