package com.bumptech.glide.p022n;

import android.util.Log;
import com.bumptech.glide.p025q.C1361c;
import com.bumptech.glide.p029s.C1402k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.n.n */
public class C1342n {

    /* renamed from: a */
    private final Set<C1361c> f4643a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C1361c> f4644b = new ArrayList();

    /* renamed from: c */
    private boolean f4645c;

    /* renamed from: a */
    public boolean mo5724a(C1361c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f4643a.remove(cVar);
        if (!this.f4644b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo5725b() {
        for (T a : C1402k.m6982i(this.f4643a)) {
            mo5724a(a);
        }
        this.f4644b.clear();
    }

    /* renamed from: c */
    public void mo5726c() {
        this.f4645c = true;
        for (T t : C1402k.m6982i(this.f4643a)) {
            if (t.isRunning() || t.mo5828j()) {
                t.clear();
                this.f4644b.add(t);
            }
        }
    }

    /* renamed from: d */
    public void mo5727d() {
        this.f4645c = true;
        for (T t : C1402k.m6982i(this.f4643a)) {
            if (t.isRunning()) {
                t.mo5822e();
                this.f4644b.add(t);
            }
        }
    }

    /* renamed from: e */
    public void mo5728e() {
        for (T t : C1402k.m6982i(this.f4643a)) {
            if (!t.mo5828j() && !t.mo5824g()) {
                t.clear();
                if (!this.f4645c) {
                    t.mo5825h();
                } else {
                    this.f4644b.add(t);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo5729f() {
        this.f4645c = false;
        for (T t : C1402k.m6982i(this.f4643a)) {
            if (!t.mo5828j() && !t.isRunning()) {
                t.mo5825h();
            }
        }
        this.f4644b.clear();
    }

    /* renamed from: g */
    public void mo5730g(C1361c cVar) {
        this.f4643a.add(cVar);
        if (!this.f4645c) {
            cVar.mo5825h();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f4644b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f4643a.size() + ", isPaused=" + this.f4645c + "}";
    }
}
