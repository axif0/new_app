package p148g.p189d.p190a.p252d.p260q.p261e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.material.card.MaterialCardView;
import p148g.p189d.p190a.p252d.p260q.C5027c;
import p148g.p189d.p190a.p252d.p260q.C5028d;

/* renamed from: g.d.a.d.q.e.a */
public class C5034a extends MaterialCardView implements C5028d {

    /* renamed from: x */
    private final C5027c f15014x;

    /* renamed from: a */
    public void mo15080a() {
        this.f15014x.mo15091b();
        throw null;
    }

    /* renamed from: b */
    public void mo15081b() {
        this.f15014x.mo15090a();
        throw null;
    }

    public void draw(Canvas canvas) {
        C5027c cVar = this.f15014x;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo15092c(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f15014x.mo15093d();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f15014x.mo15094e();
        throw null;
    }

    public C5028d.C5033e getRevealInfo() {
        this.f15014x.mo15095f();
        throw null;
    }

    public boolean isOpaque() {
        C5027c cVar = this.f15014x;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo15096g();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f15014x.mo15097h(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f15014x.mo15098i(i);
        throw null;
    }

    public void setRevealInfo(C5028d.C5033e eVar) {
        this.f15014x.mo15099j(eVar);
        throw null;
    }
}
