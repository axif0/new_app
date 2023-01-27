package p148g.p179c.p183b;

import android.content.res.Resources;
import android.view.ViewGroup;
import p148g.p179c.p183b.p184d.C3715a;
import p148g.p179c.p183b.p184d.C3716b;
import p148g.p179c.p183b.p185e.C3717a;
import p148g.p179c.p183b.p185e.C3718b;
import p148g.p179c.p183b.p185e.C3719c;

/* renamed from: g.c.b.b */
public class C3713b {

    /* renamed from: a */
    private ViewGroup f11336a;

    /* renamed from: b */
    private ViewGroup.LayoutParams f11337b;

    /* renamed from: c */
    private int f11338c = -1;

    /* renamed from: d */
    private int f11339d = -1;

    /* renamed from: e */
    private int f11340e = -1;

    /* renamed from: f */
    private int f11341f = -1;

    /* renamed from: g */
    private int f11342g = -1;

    /* renamed from: h */
    private int f11343h = -1;

    /* renamed from: i */
    private int f11344i = -1;

    /* renamed from: j */
    private C3715a f11345j;

    /* renamed from: k */
    private String f11346k;

    /* renamed from: l */
    private void m15548l(String str) {
        throw new IllegalArgumentException("You must provide " + str + " in order to draw the view properly.");
    }

    /* renamed from: a */
    public C3712a mo12257a() {
        Resources resources = this.f11336a.getContext().getResources();
        int i = this.f11338c;
        if (i == -1) {
            i = resources.getColor(C3717a.strokeColor);
        }
        this.f11338c = i;
        int i2 = this.f11339d;
        if (i2 == -1) {
            i2 = resources.getColor(C3717a.fillColor);
        }
        this.f11339d = i2;
        int i3 = this.f11340e;
        if (i3 < 0) {
            i3 = resources.getDimensionPixelSize(C3718b.strokeWidth);
        }
        this.f11340e = i3;
        int i4 = this.f11343h;
        if (i4 < 0) {
            i4 = resources.getInteger(C3719c.strokeDrawingDuration);
        }
        this.f11343h = i4;
        int i5 = this.f11344i;
        if (i5 < 0) {
            i5 = resources.getInteger(C3719c.fillDuration);
        }
        this.f11344i = i5;
        C3715a aVar = this.f11345j;
        if (aVar == null) {
            aVar = new C3716b();
        }
        this.f11345j = aVar;
        if (this.f11337b == null) {
            m15548l("layout params");
            throw null;
        } else if (this.f11346k != null) {
            return new C3712a(this.f11336a, this.f11337b, this.f11338c, this.f11339d, this.f11340e, this.f11341f, this.f11342g, this.f11343h, this.f11344i, this.f11345j, this.f11346k);
        } else {
            m15548l("an svg path");
            throw null;
        }
    }

    /* renamed from: b */
    public C3713b mo12258b(C3715a aVar) {
        this.f11345j = aVar;
        return this;
    }

    /* renamed from: c */
    public C3713b mo12259c(int i) {
        this.f11339d = i;
        return this;
    }

    /* renamed from: d */
    public C3713b mo12260d(int i) {
        this.f11344i = i;
        return this;
    }

    /* renamed from: e */
    public C3713b mo12261e(ViewGroup.LayoutParams layoutParams) {
        this.f11337b = layoutParams;
        return this;
    }

    /* renamed from: f */
    public C3713b mo12262f(int i, int i2) {
        this.f11341f = i;
        this.f11342g = i2;
        return this;
    }

    /* renamed from: g */
    public C3713b mo12263g(ViewGroup viewGroup) {
        this.f11336a = viewGroup;
        return this;
    }

    /* renamed from: h */
    public C3713b mo12264h(int i) {
        this.f11338c = i;
        return this;
    }

    /* renamed from: i */
    public C3713b mo12265i(int i) {
        this.f11343h = i;
        return this;
    }

    /* renamed from: j */
    public C3713b mo12266j(int i) {
        this.f11340e = i;
        return this;
    }

    /* renamed from: k */
    public C3713b mo12267k(String str) {
        this.f11346k = str;
        return this;
    }
}
