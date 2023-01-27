package p148g.p189d.p190a.p200b.p219o0.p223p;

import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4267h;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.p.a */
public final class C4191a extends C4153c {

    /* renamed from: s */
    private static final Pattern f13363s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: n */
    private final boolean f13364n;

    /* renamed from: o */
    private int f13365o;

    /* renamed from: p */
    private int f13366p;

    /* renamed from: q */
    private int f13367q;

    /* renamed from: r */
    private int f13368r;

    public C4191a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f13364n = false;
            return;
        }
        this.f13364n = true;
        String str = new String(list.get(0));
        C4260a.m18069a(str.startsWith("Format: "));
        m17748F(str);
        m17749G(new C4274m(list.get(1)));
    }

    /* renamed from: D */
    private void m17746D(String str, List<C4152b> list, C4267h hVar) {
        long j;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        if (this.f13365o == 0) {
            sb2 = new StringBuilder();
            str2 = "Skipping dialogue line before complete format: ";
        } else {
            String[] split = str.substring(10).split(",", this.f13365o);
            if (split.length != this.f13365o) {
                sb2 = new StringBuilder();
                str2 = "Skipping dialogue line with fewer columns than format: ";
            } else {
                long H = m17750H(split[this.f13366p]);
                if (H == -9223372036854775807L) {
                    sb = new StringBuilder();
                } else {
                    String str3 = split[this.f13367q];
                    if (!str3.trim().isEmpty()) {
                        j = m17750H(str3);
                        if (j == -9223372036854775807L) {
                            sb = new StringBuilder();
                        }
                    } else {
                        j = -9223372036854775807L;
                    }
                    list.add(new C4152b(split[this.f13368r].replaceAll("\\{.*?\\}", BuildConfig.FLAVOR).replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                    hVar.mo13426a(H);
                    if (j != -9223372036854775807L) {
                        list.add((Object) null);
                        hVar.mo13426a(j);
                        return;
                    }
                    return;
                }
                sb2.append("Skipping invalid timing: ");
                sb2.append(str);
                Log.w("SsaDecoder", sb2.toString());
            }
        }
        sb2.append(str2);
        sb2.append(str);
        Log.w("SsaDecoder", sb2.toString());
    }

    /* renamed from: E */
    private void m17747E(C4274m mVar, List<C4152b> list, C4267h hVar) {
        while (true) {
            String k = mVar.mo13466k();
            if (k == null) {
                return;
            }
            if (!this.f13364n && k.startsWith("Format: ")) {
                m17748F(k);
            } else if (k.startsWith("Dialogue: ")) {
                m17746D(k, list, hVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17748F(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 8
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            int r0 = r9.length
            r8.f13365o = r0
            r0 = -1
            r8.f13366p = r0
            r8.f13367q = r0
            r8.f13368r = r0
            r1 = 0
            r2 = 0
        L_0x0018:
            int r3 = r8.f13365o
            if (r2 >= r3) goto L_0x006d
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18233F(r3)
            int r4 = r3.hashCode()
            r5 = 100571(0x188db, float:1.4093E-40)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0050
            r5 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r5) goto L_0x0046
            r5 = 109757538(0x68ac462, float:5.219839E-35)
            if (r4 == r5) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            goto L_0x005b
        L_0x0046:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 2
            goto L_0x005b
        L_0x0050:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = -1
        L_0x005b:
            if (r3 == 0) goto L_0x0068
            if (r3 == r7) goto L_0x0065
            if (r3 == r6) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            r8.f13368r = r2
            goto L_0x006a
        L_0x0065:
            r8.f13367q = r2
            goto L_0x006a
        L_0x0068:
            r8.f13366p = r2
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x006d:
            int r9 = r8.f13366p
            if (r9 == r0) goto L_0x0079
            int r9 = r8.f13367q
            if (r9 == r0) goto L_0x0079
            int r9 = r8.f13368r
            if (r9 != r0) goto L_0x007b
        L_0x0079:
            r8.f13365o = r1
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p223p.C4191a.m17748F(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: G */
    private void m17749G(p148g.p189d.p190a.p200b.p230r0.C4274m r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.String r0 = r3.mo13466k()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "[Events]"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p223p.C4191a.m17749G(g.d.a.b.r0.m):void");
    }

    /* renamed from: H */
    public static long m17750H(String str) {
        Matcher matcher = f13363s.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C4192b mo13192z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C4267h hVar = new C4267h();
        C4274m mVar = new C4274m(bArr, i);
        if (!this.f13364n) {
            m17749G(mVar);
        }
        m17747E(mVar, arrayList, hVar);
        C4152b[] bVarArr = new C4152b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new C4192b(bVarArr, hVar.mo13429d());
    }
}
