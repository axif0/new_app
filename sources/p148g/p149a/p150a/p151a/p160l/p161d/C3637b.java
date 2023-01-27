package p148g.p149a.p150a.p151a.p160l.p161d;

import android.view.View;
import p148g.p149a.p150a.p151a.C3581a;
import p148g.p149a.p165b.C3651b;
import p148g.p149a.p165b.C3652c;
import p148g.p325e.p326a.C5547c;
import p148g.p325e.p326a.C5560i;

/* renamed from: g.a.a.a.l.d.b */
public class C3637b extends C3581a {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo12179e(View view) {
        C5547c c = mo12177c();
        C5560i R = C5560i.m22977R(view, "scaleX", 1.5f, 1.0f);
        C3651b.m15435a(C3652c.QuintEaseOut, (float) mo12178d(), R);
        C3652c cVar = C3652c.QuintEaseOut;
        float d = (float) mo12178d();
        C5560i R2 = C5560i.m22977R(view, "scaleY", 1.5f, 1.0f);
        C3651b.m15435a(cVar, d, R2);
        C3652c cVar2 = C3652c.QuintEaseOut;
        float d2 = (float) mo12178d();
        C5560i R3 = C5560i.m22977R(view, "alpha", 0.0f, 1.0f);
        C3651b.m15435a(cVar2, d2, R3);
        c.mo15969t(R, R2, R3);
    }
}
