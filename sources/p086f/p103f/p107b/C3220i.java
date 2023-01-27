package p086f.p103f.p107b;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;

/* renamed from: f.f.b.i */
public class C3220i {

    /* renamed from: n */
    private static int f10258n = 1;

    /* renamed from: a */
    public boolean f10259a;

    /* renamed from: b */
    private String f10260b;

    /* renamed from: c */
    public int f10261c = -1;

    /* renamed from: d */
    int f10262d = -1;

    /* renamed from: e */
    public int f10263e = 0;

    /* renamed from: f */
    public float f10264f;

    /* renamed from: g */
    public boolean f10265g = false;

    /* renamed from: h */
    float[] f10266h = new float[9];

    /* renamed from: i */
    float[] f10267i = new float[9];

    /* renamed from: j */
    C3221a f10268j;

    /* renamed from: k */
    C3208b[] f10269k = new C3208b[16];

    /* renamed from: l */
    int f10270l = 0;

    /* renamed from: m */
    public int f10271m = 0;

    /* renamed from: f.f.b.i$a */
    public enum C3221a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C3220i(C3221a aVar, String str) {
        this.f10268j = aVar;
    }

    /* renamed from: b */
    static void m13803b() {
        f10258n++;
    }

    /* renamed from: a */
    public final void mo11240a(C3208b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f10270l;
            if (i >= i2) {
                C3208b[] bVarArr = this.f10269k;
                if (i2 >= bVarArr.length) {
                    this.f10269k = (C3208b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C3208b[] bVarArr2 = this.f10269k;
                int i3 = this.f10270l;
                bVarArr2[i3] = bVar;
                this.f10270l = i3 + 1;
                return;
            } else if (this.f10269k[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo11241c(C3208b bVar) {
        int i = this.f10270l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f10269k[i2] == bVar) {
                while (i2 < i - 1) {
                    C3208b[] bVarArr = this.f10269k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f10270l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo11242d() {
        this.f10260b = null;
        this.f10268j = C3221a.UNKNOWN;
        this.f10263e = 0;
        this.f10261c = -1;
        this.f10262d = -1;
        this.f10264f = 0.0f;
        this.f10265g = false;
        int i = this.f10270l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f10269k[i2] = null;
        }
        this.f10270l = 0;
        this.f10271m = 0;
        this.f10259a = false;
        Arrays.fill(this.f10267i, 0.0f);
    }

    /* renamed from: e */
    public void mo11243e(C3211d dVar, float f) {
        this.f10264f = f;
        this.f10265g = true;
        int i = this.f10270l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f10269k[i2].mo11177B(dVar, this, false);
        }
        this.f10270l = 0;
    }

    /* renamed from: f */
    public void mo11244f(C3221a aVar, String str) {
        this.f10268j = aVar;
    }

    /* renamed from: g */
    public final void mo11245g(C3208b bVar) {
        int i = this.f10270l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f10269k[i2].mo11178C(bVar, false);
        }
        this.f10270l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f10260b != null) {
            sb = new StringBuilder();
            sb.append(BuildConfig.FLAVOR);
            sb.append(this.f10260b);
        } else {
            sb = new StringBuilder();
            sb.append(BuildConfig.FLAVOR);
            sb.append(this.f10261c);
        }
        return sb.toString();
    }
}
