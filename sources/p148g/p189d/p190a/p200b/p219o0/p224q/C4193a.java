package p148g.p189d.p190a.p200b.p219o0.p224q;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p230r0.C4267h;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.q.a */
public final class C4193a extends C4153c {

    /* renamed from: o */
    private static final Pattern f13371o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: n */
    private final StringBuilder f13372n = new StringBuilder();

    public C4193a() {
        super("SubripDecoder");
    }

    /* renamed from: D */
    private static long m17757D(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C4194b mo13192z(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        C4267h hVar = new C4267h();
        C4274m mVar = new C4274m(bArr, i);
        while (true) {
            String k = mVar.mo13466k();
            if (k == null) {
                break;
            } else if (k.length() != 0) {
                try {
                    Integer.parseInt(k);
                    k = mVar.mo13466k();
                    if (k == null) {
                        Log.w("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f13371o.matcher(k);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        hVar.mo13426a(m17757D(matcher, 1));
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            hVar.mo13426a(m17757D(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        this.f13372n.setLength(0);
                        while (true) {
                            String k2 = mVar.mo13466k();
                            if (TextUtils.isEmpty(k2)) {
                                break;
                            }
                            if (this.f13372n.length() > 0) {
                                this.f13372n.append("<br>");
                            }
                            this.f13372n.append(k2.trim());
                        }
                        arrayList.add(new C4152b(Html.fromHtml(this.f13372n.toString())));
                        if (z2) {
                            arrayList.add((Object) null);
                        }
                    } else {
                        sb = new StringBuilder();
                        str = "Skipping invalid timing: ";
                        sb.append(str);
                        sb.append(k);
                        Log.w("SubripDecoder", sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
            }
        }
        C4152b[] bVarArr = new C4152b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new C4194b(bVarArr, hVar.mo13429d());
    }
}
