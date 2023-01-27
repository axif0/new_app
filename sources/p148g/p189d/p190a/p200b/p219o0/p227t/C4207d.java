package p148g.p189d.p190a.p200b.p219o0.p227t;

import android.text.Layout;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.t.d */
public final class C4207d {

    /* renamed from: a */
    private String f13439a;

    /* renamed from: b */
    private String f13440b;

    /* renamed from: c */
    private List<String> f13441c;

    /* renamed from: d */
    private String f13442d;

    /* renamed from: e */
    private String f13443e;

    /* renamed from: f */
    private int f13444f;

    /* renamed from: g */
    private boolean f13445g;

    /* renamed from: h */
    private int f13446h;

    /* renamed from: i */
    private boolean f13447i;

    /* renamed from: j */
    private int f13448j;

    /* renamed from: k */
    private int f13449k;

    /* renamed from: l */
    private int f13450l;

    /* renamed from: m */
    private int f13451m;

    /* renamed from: n */
    private int f13452n;

    /* renamed from: o */
    private float f13453o;

    /* renamed from: p */
    private Layout.Alignment f13454p;

    public C4207d() {
        mo13298m();
    }

    /* renamed from: x */
    private static int m17855x(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: a */
    public int mo13286a() {
        if (this.f13447i) {
            return this.f13446h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public int mo13287b() {
        if (this.f13445g) {
            return this.f13444f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: c */
    public String mo13288c() {
        return this.f13443e;
    }

    /* renamed from: d */
    public float mo13289d() {
        return this.f13453o;
    }

    /* renamed from: e */
    public int mo13290e() {
        return this.f13452n;
    }

    /* renamed from: f */
    public int mo13291f(String str, String str2, String[] strArr, String str3) {
        if (this.f13439a.isEmpty() && this.f13440b.isEmpty() && this.f13441c.isEmpty() && this.f13442d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int x = m17855x(m17855x(m17855x(0, this.f13439a, str, 1073741824), this.f13440b, str2, 2), this.f13442d, str3, 4);
        if (x == -1 || !Arrays.asList(strArr).containsAll(this.f13441c)) {
            return 0;
        }
        return x + (this.f13441c.size() * 4);
    }

    /* renamed from: g */
    public int mo13292g() {
        if (this.f13450l == -1 && this.f13451m == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f13450l == 1 ? 1 : 0;
        if (this.f13451m == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: h */
    public Layout.Alignment mo13293h() {
        return this.f13454p;
    }

    /* renamed from: i */
    public boolean mo13294i() {
        return this.f13447i;
    }

    /* renamed from: j */
    public boolean mo13295j() {
        return this.f13445g;
    }

    /* renamed from: k */
    public boolean mo13296k() {
        return this.f13448j == 1;
    }

    /* renamed from: l */
    public boolean mo13297l() {
        return this.f13449k == 1;
    }

    /* renamed from: m */
    public void mo13298m() {
        this.f13439a = BuildConfig.FLAVOR;
        this.f13440b = BuildConfig.FLAVOR;
        this.f13441c = Collections.emptyList();
        this.f13442d = BuildConfig.FLAVOR;
        this.f13443e = null;
        this.f13445g = false;
        this.f13447i = false;
        this.f13448j = -1;
        this.f13449k = -1;
        this.f13450l = -1;
        this.f13451m = -1;
        this.f13452n = -1;
        this.f13454p = null;
    }

    /* renamed from: n */
    public C4207d mo13299n(int i) {
        this.f13446h = i;
        this.f13447i = true;
        return this;
    }

    /* renamed from: o */
    public C4207d mo13300o(boolean z) {
        this.f13450l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C4207d mo13301p(int i) {
        this.f13444f = i;
        this.f13445g = true;
        return this;
    }

    /* renamed from: q */
    public C4207d mo13302q(String str) {
        this.f13443e = C4284w.m18233F(str);
        return this;
    }

    /* renamed from: r */
    public C4207d mo13303r(boolean z) {
        this.f13451m = z ? 1 : 0;
        return this;
    }

    /* renamed from: s */
    public void mo13304s(String[] strArr) {
        this.f13441c = Arrays.asList(strArr);
    }

    /* renamed from: t */
    public void mo13305t(String str) {
        this.f13439a = str;
    }

    /* renamed from: u */
    public void mo13306u(String str) {
        this.f13440b = str;
    }

    /* renamed from: v */
    public void mo13307v(String str) {
        this.f13442d = str;
    }

    /* renamed from: w */
    public C4207d mo13308w(boolean z) {
        this.f13449k = z ? 1 : 0;
        return this;
    }
}
