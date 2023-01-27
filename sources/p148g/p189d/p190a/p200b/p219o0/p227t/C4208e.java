package p148g.p189d.p190a.p200b.p219o0.p227t;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import p148g.p189d.p190a.p200b.p219o0.C4152b;

/* renamed from: g.d.a.b.o0.t.e */
public final class C4208e extends C4152b {

    /* renamed from: r */
    public final long f13455r;

    /* renamed from: s */
    public final long f13456s;

    /* renamed from: g.d.a.b.o0.t.e$a */
    static /* synthetic */ class C4209a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13457a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13457a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13457a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13457a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p227t.C4208e.C4209a.<clinit>():void");
        }
    }

    /* renamed from: g.d.a.b.o0.t.e$b */
    public static class C4210b {

        /* renamed from: a */
        private long f13458a;

        /* renamed from: b */
        private long f13459b;

        /* renamed from: c */
        private SpannableStringBuilder f13460c;

        /* renamed from: d */
        private Layout.Alignment f13461d;

        /* renamed from: e */
        private float f13462e;

        /* renamed from: f */
        private int f13463f;

        /* renamed from: g */
        private int f13464g;

        /* renamed from: h */
        private float f13465h;

        /* renamed from: i */
        private int f13466i;

        /* renamed from: j */
        private float f13467j;

        public C4210b() {
            mo13311c();
        }

        /* renamed from: b */
        private C4210b m17880b() {
            Layout.Alignment alignment = this.f13461d;
            if (alignment == null) {
                this.f13466i = Integer.MIN_VALUE;
            } else {
                int i = C4209a.f13457a[alignment.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.f13466i = 1;
                    } else if (i != 3) {
                        Log.w("WebvttCueBuilder", "Unrecognized alignment: " + this.f13461d);
                    } else {
                        this.f13466i = 2;
                    }
                }
                this.f13466i = 0;
            }
            return this;
        }

        /* renamed from: a */
        public C4208e mo13310a() {
            if (this.f13465h != Float.MIN_VALUE && this.f13466i == Integer.MIN_VALUE) {
                m17880b();
            }
            return new C4208e(this.f13458a, this.f13459b, this.f13460c, this.f13461d, this.f13462e, this.f13463f, this.f13464g, this.f13465h, this.f13466i, this.f13467j);
        }

        /* renamed from: c */
        public void mo13311c() {
            this.f13458a = 0;
            this.f13459b = 0;
            this.f13460c = null;
            this.f13461d = null;
            this.f13462e = Float.MIN_VALUE;
            this.f13463f = Integer.MIN_VALUE;
            this.f13464g = Integer.MIN_VALUE;
            this.f13465h = Float.MIN_VALUE;
            this.f13466i = Integer.MIN_VALUE;
            this.f13467j = Float.MIN_VALUE;
        }

        /* renamed from: d */
        public C4210b mo13312d(long j) {
            this.f13459b = j;
            return this;
        }

        /* renamed from: e */
        public C4210b mo13313e(float f) {
            this.f13462e = f;
            return this;
        }

        /* renamed from: f */
        public C4210b mo13314f(int i) {
            this.f13464g = i;
            return this;
        }

        /* renamed from: g */
        public C4210b mo13315g(int i) {
            this.f13463f = i;
            return this;
        }

        /* renamed from: h */
        public C4210b mo13316h(float f) {
            this.f13465h = f;
            return this;
        }

        /* renamed from: i */
        public C4210b mo13317i(int i) {
            this.f13466i = i;
            return this;
        }

        /* renamed from: j */
        public C4210b mo13318j(long j) {
            this.f13458a = j;
            return this;
        }

        /* renamed from: k */
        public C4210b mo13319k(SpannableStringBuilder spannableStringBuilder) {
            this.f13460c = spannableStringBuilder;
            return this;
        }

        /* renamed from: l */
        public C4210b mo13320l(Layout.Alignment alignment) {
            this.f13461d = alignment;
            return this;
        }

        /* renamed from: m */
        public C4210b mo13321m(float f) {
            this.f13467j = f;
            return this;
        }
    }

    public C4208e(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4208e(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f13455r = j;
        this.f13456s = j2;
    }

    public C4208e(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    /* renamed from: e */
    public boolean mo13309e() {
        return this.f13182i == Float.MIN_VALUE && this.f13185l == Float.MIN_VALUE;
    }
}
