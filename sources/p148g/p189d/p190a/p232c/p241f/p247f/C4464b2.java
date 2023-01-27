package p148g.p189d.p190a.p232c.p241f.p247f;

import android.net.Uri;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.b2 */
public final class C4464b2 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f13989a;

    C4464b2(Map<String, Map<String, String>> map) {
        this.f13989a = map;
    }

    /* renamed from: a */
    public final String mo13835a(Uri uri, String str, String str2, String str3) {
        Map map;
        if (uri == null || (map = this.f13989a.get(uri.toString())) == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}
