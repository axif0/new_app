package p148g.p189d.p190a.p252d.p260q;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p148g.p189d.p190a.p252d.p260q.C5028d;

/* renamed from: g.d.a.d.q.b */
public class C5026b extends FrameLayout implements C5028d {

    /* renamed from: f */
    private final C5027c f15005f;

    /* renamed from: a */
    public void mo15080a() {
        this.f15005f.mo15091b();
        throw null;
    }

    /* renamed from: b */
    public void mo15081b() {
        this.f15005f.mo15090a();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C5027c cVar = this.f15005f;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo15092c(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f15005f.mo15093d();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f15005f.mo15094e();
        throw null;
    }

    public C5028d.C5033e getRevealInfo() {
        this.f15005f.mo15095f();
        throw null;
    }

    public boolean isOpaque() {
        C5027c cVar = this.f15005f;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo15096g();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f15005f.mo15097h(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f15005f.mo15098i(i);
        throw null;
    }

    public void setRevealInfo(C5028d.C5033e eVar) {
        this.f15005f.mo15099j(eVar);
        throw null;
    }
}
