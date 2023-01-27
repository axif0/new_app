package p086f.p144s;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: f.s.a0 */
class C3487a0 implements C3489b0 {

    /* renamed from: a */
    private final ViewOverlay f10896a;

    C3487a0(View view) {
        this.f10896a = view.getOverlay();
    }

    /* renamed from: b */
    public void mo11870b(Drawable drawable) {
        this.f10896a.add(drawable);
    }

    /* renamed from: d */
    public void mo11871d(Drawable drawable) {
        this.f10896a.remove(drawable);
    }
}
