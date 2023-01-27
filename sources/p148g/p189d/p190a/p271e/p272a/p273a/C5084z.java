package p148g.p189d.p190a.p271e.p272a.p273a;

import android.content.Context;
import p148g.p189d.p190a.p271e.p272a.p278e.C5145a;

/* renamed from: g.d.a.e.a.a.z */
public final /* synthetic */ class C5084z {

    /* renamed from: a */
    private static C5059b0 f15121a;

    /* renamed from: a */
    static synchronized C5059b0 m21453a(Context context) {
        C5059b0 b0Var;
        synchronized (C5084z.class) {
            if (f15121a == null) {
                C5057a0 a0Var = new C5057a0((byte[]) null);
                a0Var.mo15165b(new C5068j(C5145a.m21596a(context)));
                f15121a = a0Var.mo15164a();
            }
            b0Var = f15121a;
        }
        return b0Var;
    }
}
