package p148g.p189d.p190a.p200b.p219o0.p226s;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p219o0.C4157g;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.s.a */
public final class C4202a extends C4153c {

    /* renamed from: u */
    private static final int f13419u = C4284w.m18249o("styl");

    /* renamed from: v */
    private static final int f13420v = C4284w.m18249o("tbox");

    /* renamed from: n */
    private final C4274m f13421n = new C4274m();

    /* renamed from: o */
    private boolean f13422o;

    /* renamed from: p */
    private int f13423p;

    /* renamed from: q */
    private int f13424q;

    /* renamed from: r */
    private String f13425r;

    /* renamed from: s */
    private float f13426s;

    /* renamed from: t */
    private int f13427t;

    public C4202a(List<byte[]> list) {
        super("Tx3gDecoder");
        m17828H(list);
    }

    /* renamed from: C */
    private void m17823C(C4274m mVar, SpannableStringBuilder spannableStringBuilder) throws C4157g {
        m17824D(mVar.mo13456a() >= 12);
        int D = mVar.mo13448D();
        int D2 = mVar.mo13448D();
        mVar.mo13455K(2);
        int x = mVar.mo13479x();
        mVar.mo13455K(1);
        int i = mVar.mo13464i();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i2 = D;
        int i3 = D2;
        m17826F(spannableStringBuilder2, x, this.f13423p, i2, i3, 0);
        m17825E(spannableStringBuilder2, i, this.f13424q, i2, i3, 0);
    }

    /* renamed from: D */
    private static void m17824D(boolean z) throws C4157g {
        if (!z) {
            throw new C4157g("Unexpected subtitle format.");
        }
    }

    /* renamed from: E */
    private static void m17825E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m17826F(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L_0x004c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r10 == 0) goto L_0x0023
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L_0x001f
            r4 = 3
            r3.<init>(r4)
            goto L_0x002b
        L_0x001f:
            r3.<init>(r1)
            goto L_0x002b
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L_0x002b:
            r5.setSpan(r3, r8, r9, r7)
        L_0x002e:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L_0x003e:
            if (r1 != 0) goto L_0x004c
            if (r10 != 0) goto L_0x004c
            if (r2 != 0) goto L_0x004c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p226s.C4202a.m17826F(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* renamed from: G */
    private static void m17827G(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: H */
    private void m17828H(List<byte[]> list) {
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f13423p = bArr[24];
            this.f13424q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if ("Serif".equals(new String(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.f13425r = str;
            this.f13427t = bArr[25] * 20;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.f13422o = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f13427t);
                this.f13426s = f;
                this.f13426s = C4284w.m18242h(f, 0.0f, 0.95f);
                return;
            }
        } else {
            this.f13423p = 0;
            this.f13424q = -1;
            this.f13425r = str;
            this.f13422o = false;
        }
        this.f13426s = 0.85f;
    }

    /* renamed from: I */
    private static String m17829I(C4274m mVar) throws C4157g {
        char e;
        m17824D(mVar.mo13456a() >= 2);
        int D = mVar.mo13448D();
        if (D == 0) {
            return BuildConfig.FLAVOR;
        }
        return mVar.mo13477v(D, Charset.forName((mVar.mo13456a() < 2 || !((e = mVar.mo13460e()) == 65279 || e == 65534)) ? "UTF-8" : "UTF-16"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C4155e mo13192z(byte[] bArr, int i, boolean z) throws C4157g {
        this.f13421n.mo13452H(bArr, i);
        String I = m17829I(this.f13421n);
        if (I.isEmpty()) {
            return C4203b.f13428g;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m17826F(spannableStringBuilder2, this.f13423p, 0, 0, spannableStringBuilder.length(), 16711680);
        m17825E(spannableStringBuilder2, this.f13424q, -1, 0, spannableStringBuilder.length(), 16711680);
        m17827G(spannableStringBuilder2, this.f13425r, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.f13426s;
        while (this.f13421n.mo13456a() >= 8) {
            int c = this.f13421n.mo13458c();
            int i2 = this.f13421n.mo13464i();
            int i3 = this.f13421n.mo13464i();
            boolean z2 = true;
            if (i3 == f13419u) {
                if (this.f13421n.mo13456a() < 2) {
                    z2 = false;
                }
                m17824D(z2);
                int D = this.f13421n.mo13448D();
                for (int i4 = 0; i4 < D; i4++) {
                    m17823C(this.f13421n, spannableStringBuilder);
                }
            } else if (i3 == f13420v && this.f13422o) {
                if (this.f13421n.mo13456a() < 2) {
                    z2 = false;
                }
                m17824D(z2);
                f = C4284w.m18242h(((float) this.f13421n.mo13448D()) / ((float) this.f13427t), 0.0f, 0.95f);
            }
            this.f13421n.mo13454J(c + i2);
        }
        return new C4203b(new C4152b(spannableStringBuilder, (Layout.Alignment) null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
