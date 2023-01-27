package p148g.p189d.p190a.p271e.p272a.p277d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5124r;
import p148g.p189d.p190a.p271e.p272a.p278e.C5145a;

/* renamed from: g.d.a.e.a.d.c */
public abstract class C5144c<StateT> {

    /* renamed from: a */
    protected final C5100f f15167a;

    /* renamed from: b */
    private final IntentFilter f15168b;

    /* renamed from: c */
    private final Context f15169c;

    /* renamed from: d */
    protected final Set<C5142a<StateT>> f15170d = new HashSet();

    /* renamed from: e */
    private C5143b f15171e = null;

    /* renamed from: f */
    private volatile boolean f15172f = false;

    protected C5144c(C5100f fVar, IntentFilter intentFilter, Context context) {
        this.f15167a = fVar;
        this.f15168b = intentFilter;
        this.f15169c = C5145a.m21596a(context);
    }

    /* renamed from: g */
    private final void m21589g() {
        C5143b bVar;
        if ((this.f15172f || !this.f15170d.isEmpty()) && this.f15171e == null) {
            C5143b bVar2 = new C5143b(this);
            this.f15171e = bVar2;
            this.f15169c.registerReceiver(bVar2, this.f15168b);
        }
        if (!this.f15172f && this.f15170d.isEmpty() && (bVar = this.f15171e) != null) {
            this.f15169c.unregisterReceiver(bVar);
            this.f15171e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9252a(Context context, Intent intent);

    /* renamed from: b */
    public final synchronized void mo15241b(C5142a<StateT> aVar) {
        this.f15167a.mo15206f("registerListener", new Object[0]);
        C5124r.m21532b(aVar, "Registered Play Core listener should not be null.");
        this.f15170d.add(aVar);
        m21589g();
    }

    /* renamed from: c */
    public final synchronized void mo15242c(StateT statet) {
        Iterator it = new HashSet(this.f15170d).iterator();
        while (it.hasNext()) {
            ((C5142a) it.next()).mo303k(statet);
        }
    }

    /* renamed from: d */
    public final synchronized void mo15243d(boolean z) {
        this.f15172f = z;
        m21589g();
    }

    /* renamed from: e */
    public final synchronized void mo15244e(C5142a<StateT> aVar) {
        this.f15167a.mo15206f("unregisterListener", new Object[0]);
        C5124r.m21532b(aVar, "Unregistered Play Core listener should not be null.");
        this.f15170d.remove(aVar);
        m21589g();
    }

    /* renamed from: f */
    public final synchronized boolean mo15245f() {
        return this.f15171e != null;
    }
}
