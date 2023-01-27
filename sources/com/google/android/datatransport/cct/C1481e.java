package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.datatransport.cct.p034b.C1439a;
import com.google.android.datatransport.cct.p034b.C1441b;
import com.google.android.datatransport.cct.p034b.C1460k;
import com.google.android.datatransport.cct.p034b.C1462m;
import com.google.android.datatransport.cct.p034b.C1466o;
import com.google.android.datatransport.cct.p034b.C1467p;
import com.google.android.datatransport.cct.p034b.C1470r;
import com.google.android.datatransport.cct.p034b.C1473t;
import com.google.android.datatransport.cct.p034b.C1474u;
import com.google.android.datatransport.runtime.backends.C1492f;
import com.google.android.datatransport.runtime.backends.C1494g;
import com.google.android.datatransport.runtime.backends.C1502m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jsoup.helper.HttpConnection;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.p192i.C3748g;
import p148g.p189d.p190a.p191a.p192i.C3749h;
import p148g.p189d.p190a.p191a.p192i.p193t.C3765a;
import p148g.p189d.p190a.p191a.p192i.p194u.C3767b;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;
import p148g.p189d.p281b.p282f.C5179a;
import p148g.p189d.p281b.p282f.C5180b;

/* renamed from: com.google.android.datatransport.cct.e */
final class C1481e implements C1502m {

    /* renamed from: a */
    private final C5179a f5037a = C1466o.m7194a();

    /* renamed from: b */
    private final ConnectivityManager f5038b;

    /* renamed from: c */
    final URL f5039c;

    /* renamed from: d */
    private final C3821a f5040d;

    /* renamed from: e */
    private final C3821a f5041e;

    /* renamed from: f */
    private final int f5042f;

    /* renamed from: com.google.android.datatransport.cct.e$a */
    static final class C1482a {

        /* renamed from: a */
        final URL f5043a;

        /* renamed from: b */
        final C1460k f5044b;

        /* renamed from: c */
        final String f5045c;

        C1482a(URL url, C1460k kVar, String str) {
            this.f5043a = url;
            this.f5044b = kVar;
            this.f5045c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1482a mo6116a(URL url) {
            return new C1482a(url, this.f5044b, this.f5045c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.e$b */
    static final class C1483b {

        /* renamed from: a */
        final int f5046a;

        /* renamed from: b */
        final URL f5047b;

        /* renamed from: c */
        final long f5048c;

        C1483b(int i, URL url, long j) {
            this.f5046a = i;
            this.f5047b = url;
            this.f5048c = j;
        }
    }

    C1481e(Context context, C3821a aVar, C3821a aVar2) {
        this.f5038b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5039c = m7239f(C1438a.f4921c);
        this.f5040d = aVar2;
        this.f5041e = aVar;
        this.f5042f = 40000;
    }

    /* renamed from: c */
    static /* synthetic */ C1482a m7236c(C1482a aVar, C1483b bVar) {
        URL url = bVar.f5047b;
        if (url == null) {
            return null;
        }
        C3765a.m15704a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo6116a(bVar.f5047b);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C1483b m7237d(C1482a aVar) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream inputStream;
        C3765a.m15704a("CctTransportBackend", "Making request to: %s", aVar.f5043a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5043a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5042f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"2.2.0"}));
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5045c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                this.f5037a.mo15295b(aVar.f5044b, new OutputStreamWriter(gZIPOutputStream));
                gZIPOutputStream.close();
                newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                int responseCode = httpURLConnection.getResponseCode();
                StringBuilder sb = new StringBuilder();
                sb.append("Status Code: ");
                sb.append(responseCode);
                C3765a.m15708e("CctTransportBackend", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Content-Type: ");
                sb2.append(httpURLConnection.getHeaderField(HttpConnection.CONTENT_TYPE));
                C3765a.m15708e("CctTransportBackend", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Content-Encoding: ");
                sb3.append(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING));
                C3765a.m15708e("CctTransportBackend", sb3.toString());
                if (!(responseCode == 302 || responseCode == 301)) {
                    if (responseCode != 307) {
                        if (responseCode != 200) {
                            C1483b bVar = new C1483b(responseCode, (URL) null, 0);
                            newChannel.close();
                            return bVar;
                        }
                        String headerField = httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING);
                        inputStream = (headerField == null || !headerField.equals("gzip")) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
                        C1483b bVar2 = new C1483b(responseCode, (URL) null, C1473t.m7221b(new InputStreamReader(inputStream)).mo6096a());
                        inputStream.close();
                        newChannel.close();
                        return bVar2;
                    }
                }
                C1483b bVar3 = new C1483b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                newChannel.close();
                return bVar3;
            } catch (C5180b | IOException e) {
                C3765a.m15706c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                C1483b bVar4 = new C1483b(400, (URL) null, 0);
                gZIPOutputStream.close();
                newChannel.close();
                return bVar4;
            }
        } catch (Throwable th) {
            newChannel.close();
            throw th;
        }
    }

    /* renamed from: f */
    private static URL m7239f(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C3749h mo6114a(C3749h hVar) {
        int i;
        C1474u.C1476b bVar;
        NetworkInfo activeNetworkInfo = this.f5038b.getActiveNetworkInfo();
        C3749h.C3750a l = hVar.mo12342l();
        l.mo12343a("sdk-version", Build.VERSION.SDK_INT);
        l.mo12345c("model", Build.MODEL);
        l.mo12345c("hardware", Build.HARDWARE);
        l.mo12345c("device", Build.DEVICE);
        l.mo12345c("product", Build.PRODUCT);
        l.mo12345c("os-uild", Build.ID);
        l.mo12345c("manufacturer", Build.MANUFACTURER);
        l.mo12345c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        l.mo12344b("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        l.mo12343a("net-type", activeNetworkInfo == null ? C1474u.C1477c.NONE.mo6111a() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = C1474u.C1476b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            i = activeNetworkInfo.getSubtype();
            if (i == -1) {
                bVar = C1474u.C1476b.COMBINED;
            } else {
                if (C1474u.C1476b.m7227e(i) == null) {
                    i = 0;
                }
                l.mo12343a("mobile-subtype", i);
                return l.mo12297d();
            }
        }
        i = bVar.mo6110a();
        l.mo12343a("mobile-subtype", i);
        return l.mo12297d();
    }

    /* renamed from: b */
    public C1494g mo6115b(C1492f fVar) {
        C1467p.C1468a aVar;
        HashMap hashMap = new HashMap();
        for (C3749h next : fVar.mo6118b()) {
            String j = next.mo12294j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C3749h hVar = (C3749h) ((List) entry.getValue()).get(0);
            C1470r.C1471a a = C1470r.m7209a();
            a.mo6090c(C1441b.DEFAULT);
            a.mo6089b(this.f5041e.mo12402a());
            a.mo6095i(this.f5040d.mo12402a());
            C1462m.C1463a a2 = C1462m.m7189a();
            a2.mo6059b(C1462m.C1464b.ANDROID);
            C1439a.C1440a a3 = C1439a.m7117a();
            a3.mo6028a(hVar.mo12339g("sdk-version"));
            a3.mo6034g(hVar.mo12338b("model"));
            a3.mo6032e(hVar.mo12338b("hardware"));
            a3.mo6029b(hVar.mo12338b("device"));
            a3.mo6036i(hVar.mo12338b("product"));
            a3.mo6035h(hVar.mo12338b("os-uild"));
            a3.mo6033f(hVar.mo12338b("manufacturer"));
            a3.mo6031d(hVar.mo12338b("fingerprint"));
            a2.mo6058a(a3.mo6030c());
            a.mo6091d(a2.mo6060c());
            try {
                a.mo6108h(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                a.mo6109j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C3749h hVar2 : (List) entry.getValue()) {
                C3748g e = hVar2.mo12290e();
                C3727b b = e.mo12334b();
                if (b.equals(C3727b.m15581b("proto"))) {
                    aVar = C1467p.m7196c(e.mo12333a());
                } else if (b.equals(C3727b.m15581b("json"))) {
                    aVar = C1467p.m7195b(new String(e.mo12333a(), Charset.forName("UTF-8")));
                } else {
                    C3765a.m15709f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b);
                }
                aVar.mo6072b(hVar2.mo12292f());
                aVar.mo6077g(hVar2.mo12295k());
                aVar.mo6078h(hVar2.mo12340h("tz-offset"));
                C1474u.C1475a a4 = C1474u.m7223a();
                a4.mo6106b(C1474u.C1477c.m7229e(hVar2.mo12339g("net-type")));
                a4.mo6105a(C1474u.C1476b.m7227e(hVar2.mo12339g("mobile-subtype")));
                aVar.mo6073c(a4.mo6107c());
                if (hVar2.mo12289d() != null) {
                    aVar.mo6071a(hVar2.mo12289d().intValue());
                }
                arrayList3.add(aVar.mo6076f());
            }
            a.mo6093f(arrayList3);
            arrayList2.add(a.mo6094g());
        }
        C1460k a5 = C1460k.m7186a(arrayList2);
        String str = null;
        URL url = this.f5039c;
        if (fVar.mo6119c() != null) {
            try {
                C1438a e2 = C1438a.m7110e(fVar.mo6119c());
                if (e2.mo6026f() != null) {
                    str = e2.mo6026f();
                }
                if (e2.mo6027g() != null) {
                    url = m7239f(e2.mo6027g());
                }
            } catch (IllegalArgumentException unused2) {
                return C1494g.m7262a();
            }
        }
        try {
            C1483b bVar = (C1483b) C3767b.m15711a(5, new C1482a(url, a5, str), C1479c.m7232b(this), C1480d.m7234b());
            if (bVar.f5046a == 200) {
                return C1494g.m7263d(bVar.f5048c);
            }
            int i = bVar.f5046a;
            if (i < 500) {
                if (i != 404) {
                    return C1494g.m7262a();
                }
            }
            return C1494g.m7264e();
        } catch (IOException e3) {
            C3765a.m15706c("CctTransportBackend", "Could not make request to the backend", e3);
            return C1494g.m7264e();
        }
    }
}
