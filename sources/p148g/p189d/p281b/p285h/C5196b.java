package p148g.p189d.p281b.p285h;

import android.content.Context;
import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2511e;
import com.google.firebase.components.C2526n;
import p148g.p189d.p281b.p285h.C5197c;

/* renamed from: g.d.b.h.b */
public class C5196b implements C5197c {

    /* renamed from: a */
    private C5199d f15244a;

    private C5196b(Context context) {
        this.f15244a = C5199d.m21738a(context);
    }

    /* renamed from: b */
    public static C2508d<C5197c> m21733b() {
        C2508d.C2510b<C5197c> a = C2508d.m11268a(C5197c.class);
        a.mo9372b(C2526n.m11326f(Context.class));
        a.mo9376f(C5195a.m21731b());
        return a.mo9374d();
    }

    /* renamed from: c */
    static /* synthetic */ C5197c m21734c(C2511e eVar) {
        return new C5196b((Context) eVar.mo9362a(Context.class));
    }

    /* renamed from: a */
    public C5197c.C5198a mo15319a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = this.f15244a.mo15322c(str, currentTimeMillis);
        boolean b = this.f15244a.mo15321b(currentTimeMillis);
        return (!c || !b) ? b ? C5197c.C5198a.GLOBAL : c ? C5197c.C5198a.SDK : C5197c.C5198a.NONE : C5197c.C5198a.COMBINED;
    }
}
