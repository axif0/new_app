package p148g.p149a.p150a.p151a.p160l;

import android.view.View;
import p148g.p149a.p150a.p151a.C3581a;
import p148g.p149a.p165b.C3651b;
import p148g.p149a.p165b.C3652c;
import p148g.p325e.p326a.C5547c;
import p148g.p325e.p326a.C5560i;

/* renamed from: g.a.a.a.l.a */
public class C3633a extends C3581a {
    /* renamed from: e */
    public void mo12179e(View view) {
        float paddingLeft = (float) view.getPaddingLeft();
        float paddingTop = (float) view.getPaddingTop();
        C5547c c = mo12177c();
        C3652c cVar = C3652c.SineEaseInOut;
        C5560i R = C5560i.m22977R(view, "rotation", 0.0f, 80.0f, 60.0f, 80.0f, 60.0f, 60.0f);
        C3651b.m15435a(cVar, 1300.0f, R);
        c.mo15969t(R, C5560i.m22977R(view, "translationY", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 700.0f), C5560i.m22977R(view, "alpha", 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f), C5560i.m22977R(view, "pivotX", paddingLeft, paddingLeft, paddingLeft, paddingLeft, paddingLeft, paddingLeft), C5560i.m22977R(view, "pivotY", paddingTop, paddingTop, paddingTop, paddingTop, paddingTop, paddingTop));
        mo12181g(1300);
    }
}
