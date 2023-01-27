package com.bumptech.glide.load.p006n;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0996e;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p012p.C1175g;
import com.bumptech.glide.p029s.C1392c;
import com.bumptech.glide.p029s.C1397f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.j */
public class C1020j implements C1010d<InputStream> {

    /* renamed from: l */
    static final C1022b f3979l = new C1021a();

    /* renamed from: f */
    private final C1175g f3980f;

    /* renamed from: g */
    private final int f3981g;

    /* renamed from: h */
    private final C1022b f3982h;

    /* renamed from: i */
    private HttpURLConnection f3983i;

    /* renamed from: j */
    private InputStream f3984j;

    /* renamed from: k */
    private volatile boolean f3985k;

    /* renamed from: com.bumptech.glide.load.n.j$a */
    private static class C1021a implements C1022b {
        C1021a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo5196a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$b */
    interface C1022b {
        /* renamed from: a */
        HttpURLConnection mo5196a(URL url) throws IOException;
    }

    public C1020j(C1175g gVar, int i) {
        this(gVar, i, f3979l);
    }

    C1020j(C1175g gVar, int i, C1022b bVar) {
        this.f3980f = gVar;
        this.f3981g = i;
        this.f3982h = bVar;
    }

    /* renamed from: c */
    private InputStream m5599c(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C1392c.m6948h(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f3984j = inputStream;
        return this.f3984j;
    }

    /* renamed from: d */
    private static boolean m5600d(int i) {
        return i / 100 == 2;
    }

    /* renamed from: g */
    private static boolean m5601g(int i) {
        return i / 100 == 3;
    }

    /* renamed from: h */
    private InputStream m5602h(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C0996e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f3983i = this.f3982h.mo5196a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f3983i.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f3983i.setConnectTimeout(this.f3981g);
            this.f3983i.setReadTimeout(this.f3981g);
            this.f3983i.setUseCaches(false);
            this.f3983i.setDoInput(true);
            this.f3983i.setInstanceFollowRedirects(false);
            this.f3983i.connect();
            this.f3984j = this.f3983i.getInputStream();
            if (this.f3985k) {
                return null;
            }
            int responseCode = this.f3983i.getResponseCode();
            if (m5600d(responseCode)) {
                return m5599c(this.f3983i);
            }
            if (m5601g(responseCode)) {
                String headerField = this.f3983i.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo5167b();
                    return m5602h(url3, i + 1, url, map);
                }
                throw new C0996e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new C0996e(responseCode);
            } else {
                throw new C0996e(this.f3983i.getResponseMessage(), responseCode);
            }
        } else {
            throw new C0996e("Too many (> 5) redirects!");
        }
    }

    /* renamed from: a */
    public Class<InputStream> mo5162a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo5167b() {
        InputStream inputStream = this.f3984j;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3983i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3983i = null;
    }

    public void cancel() {
        this.f3985k = true;
    }

    /* renamed from: e */
    public C0992a mo5171e() {
        return C0992a.REMOTE;
    }

    /* renamed from: f */
    public void mo5172f(C0969f fVar, C1010d.C1011a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C1397f.m6956b();
        try {
            aVar.mo5179d(m5602h(this.f3980f.mo5484h(), 0, (URL) null, this.f3980f.mo5483e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C1397f.m6955a(b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo5178c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C1397f.m6955a(b));
            }
            throw th;
        }
    }
}
