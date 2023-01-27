package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
final class C1734b4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f5653f;

    /* renamed from: g */
    private final /* synthetic */ String f5654g;

    /* renamed from: h */
    private final /* synthetic */ Object f5655h;

    /* renamed from: i */
    private final /* synthetic */ Object f5656i;

    /* renamed from: j */
    private final /* synthetic */ Object f5657j;

    /* renamed from: k */
    private final /* synthetic */ C1746c4 f5658k;

    C1734b4(C1746c4 c4Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f5658k = c4Var;
        this.f5653f = i;
        this.f5654g = str;
        this.f5655h = obj;
        this.f5656i = obj2;
        this.f5657j = obj3;
    }

    public final void run() {
        char c;
        C1746c4 c4Var;
        C1902p4 x = this.f5658k.f5634a.mo7051x();
        if (!x.mo6867s()) {
            this.f5658k.mo6774z(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f5658k.f5686c == 0) {
            if (this.f5658k.mo6712l().mo7397B()) {
                c4Var = this.f5658k;
                c = 'C';
            } else {
                c4Var = this.f5658k;
                c = 'c';
            }
            char unused = c4Var.f5686c = c;
        }
        if (this.f5658k.f5687d < 0) {
            long unused2 = this.f5658k.f5687d = 31049;
        }
        char charAt = "01VDIWEA?".charAt(this.f5653f);
        char t = this.f5658k.f5686c;
        long C = this.f5658k.f5687d;
        String y = C1746c4.m8180y(true, this.f5654g, this.f5655h, this.f5656i, this.f5657j);
        StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(t);
        sb.append(C);
        sb.append(":");
        sb.append(y);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f5654g.substring(0, 1024);
        }
        x.f6133d.mo7336b(sb2, 1);
    }
}
