package p148g.p189d.p190a.p232c.p237d.p239p;

import android.content.Context;

/* renamed from: g.d.a.c.d.p.c */
public class C4389c {

    /* renamed from: b */
    private static C4389c f13931b = new C4389c();

    /* renamed from: a */
    private C4388b f13932a = null;

    /* renamed from: a */
    public static C4388b m18627a(Context context) {
        return f13931b.m18628b(context);
    }

    /* renamed from: b */
    private final synchronized C4388b m18628b(Context context) {
        if (this.f13932a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f13932a = new C4388b(context);
        }
        return this.f13932a;
    }
}
