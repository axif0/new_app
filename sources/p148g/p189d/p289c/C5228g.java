package p148g.p189d.p289c;

import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p148g.p189d.p289c.p291y.C5273d;
import p148g.p189d.p289c.p291y.p292n.C5325n;

/* renamed from: g.d.c.g */
public final class C5228g {

    /* renamed from: a */
    private C5273d f15286a = C5273d.f15329l;

    /* renamed from: b */
    private C5242u f15287b = C5242u.DEFAULT;

    /* renamed from: c */
    private C5220e f15288c = C5213d.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C5229h<?>> f15289d = new HashMap();

    /* renamed from: e */
    private final List<C5247w> f15290e = new ArrayList();

    /* renamed from: f */
    private final List<C5247w> f15291f = new ArrayList();

    /* renamed from: g */
    private boolean f15292g = false;

    /* renamed from: h */
    private String f15293h;

    /* renamed from: i */
    private int f15294i = 2;

    /* renamed from: j */
    private int f15295j = 2;

    /* renamed from: k */
    private boolean f15296k = false;

    /* renamed from: l */
    private boolean f15297l = false;

    /* renamed from: m */
    private boolean f15298m = true;

    /* renamed from: n */
    private boolean f15299n = false;

    /* renamed from: o */
    private boolean f15300o = false;

    /* renamed from: p */
    private boolean f15301p = false;

    /* renamed from: a */
    private void m21824a(String str, int i, int i2, List<C5247w> list) {
        C5210a aVar;
        C5210a aVar2;
        C5210a aVar3;
        if (str != null && !BuildConfig.FLAVOR.equals(str.trim())) {
            aVar2 = new C5210a(Date.class, str);
            aVar = new C5210a(Timestamp.class, str);
            aVar3 = new C5210a(java.sql.Date.class, str);
        } else if (i != 2 && i2 != 2) {
            C5210a aVar4 = new C5210a(Date.class, i, i2);
            C5210a aVar5 = new C5210a(Timestamp.class, i, i2);
            C5210a aVar6 = new C5210a(java.sql.Date.class, i, i2);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(C5325n.m22018a(Date.class, aVar2));
        list.add(C5325n.m22018a(Timestamp.class, aVar));
        list.add(C5325n.m22018a(java.sql.Date.class, aVar3));
    }

    /* renamed from: b */
    public C5221f mo15367b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f15290e.size() + this.f15291f.size() + 3);
        arrayList2.addAll(this.f15290e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f15291f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m21824a(this.f15293h, this.f15294i, this.f15295j, arrayList2);
        return new C5221f(this.f15286a, this.f15288c, this.f15289d, this.f15292g, this.f15296k, this.f15300o, this.f15298m, this.f15299n, this.f15301p, this.f15297l, this.f15287b, this.f15293h, this.f15294i, this.f15295j, this.f15290e, this.f15291f, arrayList);
    }

    /* renamed from: c */
    public C5228g mo15368c() {
        this.f15301p = true;
        return this;
    }
}
