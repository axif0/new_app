package p148g.p189d.p190a.p232c.p241f.p247f;

import android.net.Uri;
import p086f.p102e.C3190a;

/* renamed from: g.d.a.c.f.f.h2 */
public final class C4576h2 {

    /* renamed from: a */
    private static final C3190a<String, Uri> f14159a = new C3190a<>();

    /* renamed from: a */
    public static synchronized Uri m19579a(String str) {
        Uri uri;
        synchronized (C4576h2.class) {
            uri = f14159a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f14159a.put(str, uri);
            }
        }
        return uri;
    }
}
