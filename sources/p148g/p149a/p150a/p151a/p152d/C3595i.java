package p148g.p149a.p150a.p151a.p152d;

import android.view.View;
import p148g.p149a.p150a.p151a.C3581a;
import p148g.p325e.p326a.C5560i;

/* renamed from: g.a.a.a.d.i */
public class C3595i extends C3581a {
    /* renamed from: e */
    public void mo12179e(View view) {
        float width = (float) ((((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / 2) + view.getPaddingLeft());
        float height = (float) (view.getHeight() - view.getPaddingBottom());
        mo12177c().mo15969t(C5560i.m22977R(view, "rotation", 12.0f, -12.0f, 3.0f, -3.0f, 0.0f), C5560i.m22977R(view, "pivotX", width, width, width, width, width), C5560i.m22977R(view, "pivotY", height, height, height, height, height));
    }
}
