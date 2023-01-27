package p148g.p189d.p190a.p252d.p270z;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0589b;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p254b0.C4994n;

/* renamed from: g.d.a.d.z.a */
public class C5052a extends Drawable implements C4994n, C0589b {

    /* renamed from: f */
    private C5054b f15048f;

    /* renamed from: g.d.a.d.z.a$b */
    static final class C5054b extends Drawable.ConstantState {

        /* renamed from: a */
        C4972g f15049a;

        /* renamed from: b */
        boolean f15050b;

        public C5054b(C4972g gVar) {
            this.f15049a = gVar;
            this.f15050b = false;
        }

        public C5054b(C5054b bVar) {
            this.f15049a = (C4972g) bVar.f15049a.getConstantState().newDrawable();
            this.f15050b = bVar.f15050b;
        }

        /* renamed from: a */
        public C5052a newDrawable() {
            return new C5052a(new C5054b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }

    public C5052a(C4979k kVar) {
        this(new C5054b(new C4972g(kVar)));
    }

    private C5052a(C5054b bVar) {
        this.f15048f = bVar;
    }

    /* renamed from: a */
    public C5052a mo15134a() {
        this.f15048f = new C5054b(this.f15048f);
        return this;
    }

    public void draw(Canvas canvas) {
        C5054b bVar = this.f15048f;
        if (bVar.f15050b) {
            bVar.f15049a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f15048f;
    }

    public int getOpacity() {
        return this.f15048f.f15049a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ Drawable mutate() {
        mo15134a();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15048f.f15049a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f15048f.f15049a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = C5055b.m21365e(iArr);
        C5054b bVar = this.f15048f;
        if (bVar.f15050b == e) {
            return onStateChange;
        }
        bVar.f15050b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f15048f.f15049a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f15048f.f15049a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C4979k kVar) {
        this.f15048f.f15049a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f15048f.f15049a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f15048f.f15049a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f15048f.f15049a.setTintMode(mode);
    }
}
