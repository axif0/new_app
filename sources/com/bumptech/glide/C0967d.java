package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.load.p008o.C1116k;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.p025q.C1364e;
import com.bumptech.glide.p025q.C1365f;
import com.bumptech.glide.p025q.p026j.C1375f;
import com.bumptech.glide.p025q.p026j.C1378i;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
public class C0967d extends ContextWrapper {

    /* renamed from: k */
    static final C0982k<?, ?> f3841k = new C0962a();

    /* renamed from: a */
    private final C1042b f3842a;

    /* renamed from: b */
    private final C0971h f3843b;

    /* renamed from: c */
    private final C1375f f3844c;

    /* renamed from: d */
    private final C0963b.C0964a f3845d;

    /* renamed from: e */
    private final List<C1364e<Object>> f3846e;

    /* renamed from: f */
    private final Map<Class<?>, C0982k<?, ?>> f3847f;

    /* renamed from: g */
    private final C1116k f3848g;

    /* renamed from: h */
    private final boolean f3849h;

    /* renamed from: i */
    private final int f3850i;

    /* renamed from: j */
    private C1365f f3851j;

    public C0967d(Context context, C1042b bVar, C0971h hVar, C1375f fVar, C0963b.C0964a aVar, Map<Class<?>, C0982k<?, ?>> map, List<C1364e<Object>> list, C1116k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f3842a = bVar;
        this.f3843b = hVar;
        this.f3844c = fVar;
        this.f3845d = aVar;
        this.f3846e = list;
        this.f3847f = map;
        this.f3848g = kVar;
        this.f3849h = z;
        this.f3850i = i;
    }

    /* renamed from: a */
    public <X> C1378i<ImageView, X> mo5055a(ImageView imageView, Class<X> cls) {
        return this.f3844c.mo5847a(imageView, cls);
    }

    /* renamed from: b */
    public C1042b mo5056b() {
        return this.f3842a;
    }

    /* renamed from: c */
    public List<C1364e<Object>> mo5057c() {
        return this.f3846e;
    }

    /* renamed from: d */
    public synchronized C1365f mo5058d() {
        if (this.f3851j == null) {
            C1365f a = this.f3845d.mo5052a();
            a.mo5780R();
            this.f3851j = a;
        }
        return this.f3851j;
    }

    /* renamed from: e */
    public <T> C0982k<?, T> mo5059e(Class<T> cls) {
        C0982k<?, T> kVar = this.f3847f.get(cls);
        if (kVar == null) {
            for (Map.Entry next : this.f3847f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (C0982k) next.getValue();
                }
            }
        }
        return kVar == null ? f3841k : kVar;
    }

    /* renamed from: f */
    public C1116k mo5060f() {
        return this.f3848g;
    }

    /* renamed from: g */
    public int mo5061g() {
        return this.f3850i;
    }

    /* renamed from: h */
    public C0971h mo5062h() {
        return this.f3843b;
    }

    /* renamed from: i */
    public boolean mo5063i() {
        return this.f3849h;
    }
}
