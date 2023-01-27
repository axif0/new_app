package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.load.p008o.C1116k;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p008o.p009a0.C1048f;
import com.bumptech.glide.load.p008o.p009a0.C1053j;
import com.bumptech.glide.load.p008o.p009a0.C1056k;
import com.bumptech.glide.load.p008o.p010b0.C1066a;
import com.bumptech.glide.load.p008o.p010b0.C1076f;
import com.bumptech.glide.load.p008o.p010b0.C1078g;
import com.bumptech.glide.load.p008o.p010b0.C1079h;
import com.bumptech.glide.load.p008o.p010b0.C1081i;
import com.bumptech.glide.load.p008o.p011c0.C1089a;
import com.bumptech.glide.p022n.C1328d;
import com.bumptech.glide.p022n.C1331f;
import com.bumptech.glide.p022n.C1338l;
import com.bumptech.glide.p025q.C1364e;
import com.bumptech.glide.p025q.C1365f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p086f.p102e.C3190a;

/* renamed from: com.bumptech.glide.c */
public final class C0965c {

    /* renamed from: a */
    private final Map<Class<?>, C0982k<?, ?>> f3821a = new C3190a();

    /* renamed from: b */
    private C1116k f3822b;

    /* renamed from: c */
    private C1047e f3823c;

    /* renamed from: d */
    private C1042b f3824d;

    /* renamed from: e */
    private C1079h f3825e;

    /* renamed from: f */
    private C1089a f3826f;

    /* renamed from: g */
    private C1089a f3827g;

    /* renamed from: h */
    private C1066a.C1067a f3828h;

    /* renamed from: i */
    private C1081i f3829i;

    /* renamed from: j */
    private C1328d f3830j;

    /* renamed from: k */
    private int f3831k = 4;

    /* renamed from: l */
    private C0963b.C0964a f3832l = new C0966a(this);

    /* renamed from: m */
    private C1338l.C1340b f3833m;

    /* renamed from: n */
    private C1089a f3834n;

    /* renamed from: o */
    private boolean f3835o;

    /* renamed from: p */
    private List<C1364e<Object>> f3836p;

    /* renamed from: q */
    private boolean f3837q;

    /* renamed from: r */
    private boolean f3838r;

    /* renamed from: s */
    private int f3839s = 700;

    /* renamed from: t */
    private int f3840t = 128;

    /* renamed from: com.bumptech.glide.c$a */
    class C0966a implements C0963b.C0964a {
        C0966a(C0965c cVar) {
        }

        /* renamed from: a */
        public C1365f mo5052a() {
            return new C1365f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0963b mo5053a(Context context) {
        Context context2 = context;
        if (this.f3826f == null) {
            this.f3826f = C1089a.m5838f();
        }
        if (this.f3827g == null) {
            this.f3827g = C1089a.m5836d();
        }
        if (this.f3834n == null) {
            this.f3834n = C1089a.m5834b();
        }
        if (this.f3829i == null) {
            this.f3829i = new C1081i.C1082a(context2).mo5300a();
        }
        if (this.f3830j == null) {
            this.f3830j = new C1331f();
        }
        if (this.f3823c == null) {
            int b = this.f3829i.mo5298b();
            if (b > 0) {
                this.f3823c = new C1056k((long) b);
            } else {
                this.f3823c = new C1048f();
            }
        }
        if (this.f3824d == null) {
            this.f3824d = new C1053j(this.f3829i.mo5297a());
        }
        if (this.f3825e == null) {
            this.f3825e = new C1078g((long) this.f3829i.mo5299d());
        }
        if (this.f3828h == null) {
            this.f3828h = new C1076f(context2);
        }
        if (this.f3822b == null) {
            this.f3822b = new C1116k(this.f3825e, this.f3828h, this.f3827g, this.f3826f, C1089a.m5840h(), this.f3834n, this.f3835o);
        }
        List<C1364e<Object>> list = this.f3836p;
        this.f3836p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        return new C0963b(context, this.f3822b, this.f3825e, this.f3823c, this.f3824d, new C1338l(this.f3833m), this.f3830j, this.f3831k, this.f3832l, this.f3821a, this.f3836p, this.f3837q, this.f3838r, this.f3839s, this.f3840t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5054b(C1338l.C1340b bVar) {
        this.f3833m = bVar;
    }
}
