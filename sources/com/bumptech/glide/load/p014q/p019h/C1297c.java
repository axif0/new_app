package com.bumptech.glide.load.p014q.p019h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p014q.p019h.C1302g;
import com.bumptech.glide.p021m.C1318a;
import com.bumptech.glide.p029s.C1401j;
import java.nio.ByteBuffer;
import java.util.List;
import p086f.p145t.p146a.p147a.C3560b;

/* renamed from: com.bumptech.glide.load.q.h.c */
public class C1297c extends Drawable implements C1302g.C1304b, Animatable {

    /* renamed from: f */
    private final C1298a f4519f;

    /* renamed from: g */
    private boolean f4520g;

    /* renamed from: h */
    private boolean f4521h;

    /* renamed from: i */
    private boolean f4522i;

    /* renamed from: j */
    private boolean f4523j;

    /* renamed from: k */
    private int f4524k;

    /* renamed from: l */
    private int f4525l;

    /* renamed from: m */
    private boolean f4526m;

    /* renamed from: n */
    private Paint f4527n;

    /* renamed from: o */
    private Rect f4528o;

    /* renamed from: p */
    private List<C3560b> f4529p;

    /* renamed from: com.bumptech.glide.load.q.h.c$a */
    static final class C1298a extends Drawable.ConstantState {

        /* renamed from: a */
        final C1302g f4530a;

        C1298a(C1302g gVar) {
            this.f4530a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C1297c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C1297c(Context context, C1318a aVar, C1006m<Bitmap> mVar, int i, int i2, Bitmap bitmap) {
        this(new C1298a(new C1302g(C0963b.m5388c(context), aVar, i, i2, mVar, bitmap)));
    }

    C1297c(C1298a aVar) {
        this.f4523j = true;
        this.f4525l = -1;
        C1401j.m6972d(aVar);
        this.f4519f = aVar;
    }

    /* renamed from: b */
    private Drawable.Callback m6491b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m6492d() {
        if (this.f4528o == null) {
            this.f4528o = new Rect();
        }
        return this.f4528o;
    }

    /* renamed from: h */
    private Paint m6493h() {
        if (this.f4527n == null) {
            this.f4527n = new Paint(2);
        }
        return this.f4527n;
    }

    /* renamed from: j */
    private void m6494j() {
        List<C3560b> list = this.f4529p;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f4529p.get(i).mo12026a(this);
            }
        }
    }

    /* renamed from: l */
    private void m6495l() {
        this.f4524k = 0;
    }

    /* renamed from: n */
    private void m6496n() {
        C1401j.m6969a(!this.f4522i, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f4519f.f4530a.mo5653f() != 1) {
            if (!this.f4520g) {
                this.f4520g = true;
                this.f4519f.f4530a.mo5659r(this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    /* renamed from: o */
    private void m6497o() {
        this.f4520g = false;
        this.f4519f.f4530a.mo5660s(this);
    }

    /* renamed from: a */
    public void mo5624a() {
        if (m6491b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo5629g() == mo5628f() - 1) {
            this.f4524k++;
        }
        int i = this.f4525l;
        if (i != -1 && this.f4524k >= i) {
            m6494j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo5625c() {
        return this.f4519f.f4530a.mo5649b();
    }

    public void draw(Canvas canvas) {
        if (!this.f4522i) {
            if (this.f4526m) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m6492d());
                this.f4526m = false;
            }
            canvas.drawBitmap(this.f4519f.f4530a.mo5650c(), (Rect) null, m6492d(), m6493h());
        }
    }

    /* renamed from: e */
    public Bitmap mo5627e() {
        return this.f4519f.f4530a.mo5652e();
    }

    /* renamed from: f */
    public int mo5628f() {
        return this.f4519f.f4530a.mo5653f();
    }

    /* renamed from: g */
    public int mo5629g() {
        return this.f4519f.f4530a.mo5651d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4519f;
    }

    public int getIntrinsicHeight() {
        return this.f4519f.f4530a.mo5654h();
    }

    public int getIntrinsicWidth() {
        return this.f4519f.f4530a.mo5656k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo5634i() {
        return this.f4519f.f4530a.mo5655j();
    }

    public boolean isRunning() {
        return this.f4520g;
    }

    /* renamed from: k */
    public void mo5636k() {
        this.f4522i = true;
        this.f4519f.f4530a.mo5648a();
    }

    /* renamed from: m */
    public void mo5637m(C1006m<Bitmap> mVar, Bitmap bitmap) {
        this.f4519f.f4530a.mo5658o(mVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4526m = true;
    }

    public void setAlpha(int i) {
        m6493h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m6493h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C1401j.m6969a(!this.f4522i, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4523j = z;
        if (!z) {
            m6497o();
        } else if (this.f4521h) {
            m6496n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f4521h = true;
        m6495l();
        if (this.f4523j) {
            m6496n();
        }
    }

    public void stop() {
        this.f4521h = false;
        m6497o();
    }
}
