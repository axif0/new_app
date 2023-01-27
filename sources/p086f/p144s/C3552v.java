package p086f.p144s;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: f.s.v */
class C3552v implements C3553w {

    /* renamed from: a */
    private final ViewGroupOverlay f11049a;

    C3552v(ViewGroup viewGroup) {
        this.f11049a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo12013a(View view) {
        this.f11049a.add(view);
    }

    /* renamed from: b */
    public void mo11870b(Drawable drawable) {
        this.f11049a.add(drawable);
    }

    /* renamed from: c */
    public void mo12014c(View view) {
        this.f11049a.remove(view);
    }

    /* renamed from: d */
    public void mo11871d(Drawable drawable) {
        this.f11049a.remove(drawable);
    }
}
