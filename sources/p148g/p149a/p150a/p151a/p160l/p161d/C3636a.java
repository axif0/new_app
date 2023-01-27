package p148g.p149a.p150a.p151a.p160l.p161d;

import android.view.View;
import p148g.p149a.p150a.p151a.C3581a;
import p148g.p149a.p165b.C3651b;
import p148g.p149a.p165b.C3652c;
import p148g.p325e.p326a.C5547c;
import p148g.p325e.p326a.C5560i;

/* renamed from: g.a.a.a.l.d.a */
public class C3636a extends C3581a {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo12179e(View view) {
        int top = view.getTop() + view.getHeight();
        C5547c c = mo12177c();
        C5560i R = C5560i.m22977R(view, "translationY", (float) (-top), 0.0f);
        C3651b.m15435a(C3652c.BounceEaseOut, (float) mo12178d(), R);
        c.mo15969t(C5560i.m22977R(view, "alpha", 0.0f, 1.0f), R);
    }
}
