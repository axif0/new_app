package com.bumptech.glide.load.p014q.p019h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.C0977i;
import com.bumptech.glide.C0979j;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p008o.C1112j;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.p021m.C1318a;
import com.bumptech.glide.p025q.C1365f;
import com.bumptech.glide.p025q.p026j.C1372c;
import com.bumptech.glide.p025q.p027k.C1383b;
import com.bumptech.glide.p028r.C1387b;
import com.bumptech.glide.p029s.C1401j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.h.g */
class C1302g {

    /* renamed from: a */
    private final C1318a f4532a;

    /* renamed from: b */
    private final Handler f4533b;

    /* renamed from: c */
    private final List<C1304b> f4534c;

    /* renamed from: d */
    final C0979j f4535d;

    /* renamed from: e */
    private final C1047e f4536e;

    /* renamed from: f */
    private boolean f4537f;

    /* renamed from: g */
    private boolean f4538g;

    /* renamed from: h */
    private boolean f4539h;

    /* renamed from: i */
    private C0977i<Bitmap> f4540i;

    /* renamed from: j */
    private C1303a f4541j;

    /* renamed from: k */
    private boolean f4542k;

    /* renamed from: l */
    private C1303a f4543l;

    /* renamed from: m */
    private Bitmap f4544m;

    /* renamed from: n */
    private C1303a f4545n;

    /* renamed from: o */
    private C1306d f4546o;

    /* renamed from: p */
    private int f4547p;

    /* renamed from: q */
    private int f4548q;

    /* renamed from: r */
    private int f4549r;

    /* renamed from: com.bumptech.glide.load.q.h.g$a */
    static class C1303a extends C1372c<Bitmap> {

        /* renamed from: i */
        private final Handler f4550i;

        /* renamed from: j */
        final int f4551j;

        /* renamed from: k */
        private final long f4552k;

        /* renamed from: l */
        private Bitmap f4553l;

        C1303a(Handler handler, int i, long j) {
            this.f4550i = handler;
            this.f4551j = i;
            this.f4552k = j;
        }

        /* renamed from: h */
        public void mo5662h(Drawable drawable) {
            this.f4553l = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Bitmap mo5663l() {
            return this.f4553l;
        }

        /* renamed from: m */
        public void mo5661c(Bitmap bitmap, C1383b<? super Bitmap> bVar) {
            this.f4553l = bitmap;
            this.f4550i.sendMessageAtTime(this.f4550i.obtainMessage(1, this), this.f4552k);
        }
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$b */
    public interface C1304b {
        /* renamed from: a */
        void mo5624a();
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$c */
    private class C1305c implements Handler.Callback {
        C1305c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C1302g.this.mo5657m((C1303a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C1302g.this.f4535d.mo5099o((C1303a) message.obj);
                return false;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$d */
    interface C1306d {
        /* renamed from: a */
        void mo5666a();
    }

    C1302g(C0963b bVar, C1318a aVar, int i, int i2, C1006m<Bitmap> mVar, Bitmap bitmap) {
        this(bVar.mo5039f(), C0963b.m5394t(bVar.mo5041h()), aVar, (Handler) null, m6516i(C0963b.m5394t(bVar.mo5041h()), i, i2), mVar, bitmap);
    }

    C1302g(C1047e eVar, C0979j jVar, C1318a aVar, Handler handler, C0977i<Bitmap> iVar, C1006m<Bitmap> mVar, Bitmap bitmap) {
        this.f4534c = new ArrayList();
        this.f4535d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C1305c()) : handler;
        this.f4536e = eVar;
        this.f4533b = handler;
        this.f4540i = iVar;
        this.f4532a = aVar;
        mo5658o(mVar, bitmap);
    }

    /* renamed from: g */
    private static C0998g m6515g() {
        return new C1387b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C0977i<Bitmap> m6516i(C0979j jVar, int i, int i2) {
        return jVar.mo5097m().mo5085b(((C1365f) ((C1365f) C1365f.m6821q0(C1112j.f4194a).mo5806o0(true)).mo5798j0(true)).mo5785Z(i, i2));
    }

    /* renamed from: l */
    private void m6517l() {
        if (this.f4537f && !this.f4538g) {
            if (this.f4539h) {
                C1401j.m6969a(this.f4545n == null, "Pending target must be null when starting from the first frame");
                this.f4532a.mo5685i();
                this.f4539h = false;
            }
            C1303a aVar = this.f4545n;
            if (aVar != null) {
                this.f4545n = null;
                mo5657m(aVar);
                return;
            }
            this.f4538g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f4532a.mo5681e());
            this.f4532a.mo5678c();
            this.f4543l = new C1303a(this.f4533b, this.f4532a.mo5676a(), uptimeMillis);
            C0977i<Bitmap> q0 = this.f4540i.mo5085b(C1365f.m6822r0(m6515g()));
            q0.mo5083D0(this.f4532a);
            q0.mo5091x0(this.f4543l);
        }
    }

    /* renamed from: n */
    private void m6518n() {
        Bitmap bitmap = this.f4544m;
        if (bitmap != null) {
            this.f4536e.mo5249d(bitmap);
            this.f4544m = null;
        }
    }

    /* renamed from: p */
    private void m6519p() {
        if (!this.f4537f) {
            this.f4537f = true;
            this.f4542k = false;
            m6517l();
        }
    }

    /* renamed from: q */
    private void m6520q() {
        this.f4537f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5648a() {
        this.f4534c.clear();
        m6518n();
        m6520q();
        C1303a aVar = this.f4541j;
        if (aVar != null) {
            this.f4535d.mo5099o(aVar);
            this.f4541j = null;
        }
        C1303a aVar2 = this.f4543l;
        if (aVar2 != null) {
            this.f4535d.mo5099o(aVar2);
            this.f4543l = null;
        }
        C1303a aVar3 = this.f4545n;
        if (aVar3 != null) {
            this.f4535d.mo5099o(aVar3);
            this.f4545n = null;
        }
        this.f4532a.clear();
        this.f4542k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo5649b() {
        return this.f4532a.mo5684h().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo5650c() {
        C1303a aVar = this.f4541j;
        return aVar != null ? aVar.mo5663l() : this.f4544m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo5651d() {
        C1303a aVar = this.f4541j;
        if (aVar != null) {
            return aVar.f4551j;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo5652e() {
        return this.f4544m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo5653f() {
        return this.f4532a.mo5680d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo5654h() {
        return this.f4549r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo5655j() {
        return this.f4532a.mo5682f() + this.f4547p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo5656k() {
        return this.f4548q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5657m(C1303a aVar) {
        C1306d dVar = this.f4546o;
        if (dVar != null) {
            dVar.mo5666a();
        }
        this.f4538g = false;
        if (this.f4542k) {
            this.f4533b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f4537f) {
            this.f4545n = aVar;
        } else {
            if (aVar.mo5663l() != null) {
                m6518n();
                C1303a aVar2 = this.f4541j;
                this.f4541j = aVar;
                for (int size = this.f4534c.size() - 1; size >= 0; size--) {
                    this.f4534c.get(size).mo5624a();
                }
                if (aVar2 != null) {
                    this.f4533b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m6517l();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5658o(com.bumptech.glide.load.C1006m<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            com.bumptech.glide.p029s.C1401j.m6972d(r3)
            r0 = r3
            com.bumptech.glide.load.m r0 = (com.bumptech.glide.load.C1006m) r0
            com.bumptech.glide.p029s.C1401j.m6972d(r4)
            r0 = r4
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f4544m = r0
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r2.f4540i
            com.bumptech.glide.q.f r1 = new com.bumptech.glide.q.f
            r1.<init>()
            com.bumptech.glide.q.a r3 = r1.mo5800k0(r3)
            com.bumptech.glide.i r3 = r0.mo5085b(r3)
            r2.f4540i = r3
            int r3 = com.bumptech.glide.p029s.C1402k.m6980g(r4)
            r2.f4547p = r3
            int r3 = r4.getWidth()
            r2.f4548q = r3
            int r3 = r4.getHeight()
            r2.f4549r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p014q.p019h.C1302g.mo5658o(com.bumptech.glide.load.m, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5659r(C1304b bVar) {
        if (this.f4542k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f4534c.contains(bVar)) {
            boolean isEmpty = this.f4534c.isEmpty();
            this.f4534c.add(bVar);
            if (isEmpty) {
                m6519p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5660s(C1304b bVar) {
        this.f4534c.remove(bVar);
        if (this.f4534c.isEmpty()) {
            m6520q();
        }
    }
}
