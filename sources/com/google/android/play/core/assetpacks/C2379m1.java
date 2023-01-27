package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5107i0;

/* renamed from: com.google.android.play.core.assetpacks.m1 */
final class C2379m1 {

    /* renamed from: f */
    private static final C5100f f7856f = new C5100f("ExtractorSessionStoreView");

    /* renamed from: a */
    private final C2328c0 f7857a;

    /* renamed from: b */
    private final C5099e0<C2371k3> f7858b;

    /* renamed from: c */
    private final C2427y0 f7859c;

    /* renamed from: d */
    private final Map<Integer, C2364j1> f7860d = new HashMap();

    /* renamed from: e */
    private final ReentrantLock f7861e = new ReentrantLock();

    C2379m1(C2328c0 c0Var, C5099e0<C2371k3> e0Var, C2427y0 y0Var, C5099e0<Executor> e0Var2) {
        this.f7857a = c0Var;
        this.f7858b = e0Var;
        this.f7859c = y0Var;
    }

    /* renamed from: a */
    private final <T> T m10942a(C2374l1<T> l1Var) {
        try {
            mo9197b();
            return l1Var.mo9104d();
        } finally {
            mo9201f();
        }
    }

    /* renamed from: o */
    private final Map<String, C2364j1> m10943o(List<String> list) {
        return (Map) m10942a(new C2339e1(this, list));
    }

    /* renamed from: q */
    private final C2364j1 m10944q(int i) {
        Map<Integer, C2364j1> map = this.f7860d;
        Integer valueOf = Integer.valueOf(i);
        C2364j1 j1Var = map.get(valueOf);
        if (j1Var != null) {
            return j1Var;
        }
        throw new C2411u0(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: r */
    private static String m10945r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C2411u0("Session without pack received.");
    }

    /* renamed from: s */
    private static <T> List<T> m10946s(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9197b() {
        this.f7861e.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9198c(int i) {
        m10942a(new C2349g1(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9199d(String str, int i, long j) {
        m10942a(new C2334d1(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo9200e(Bundle bundle) {
        return ((Boolean) m10942a(new C2324b1(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo9201f() {
        this.f7861e.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo9202g(int i) {
        m10944q(i).f7820c.f7802c = 5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo9203h(String str, int i, long j) {
        C2364j1 j1Var = m10943o(Arrays.asList(new String[]{str})).get(str);
        if (j1Var == null || C2420w1.m11065f(j1Var.f7820c.f7802c)) {
            f7856f.mo15205e(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f7857a.mo9113A(str, i, j);
        j1Var.f7820c.f7802c = 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo9204i(Bundle bundle) {
        return ((Boolean) m10942a(new C2329c1(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ Boolean mo9205j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, C2364j1> map = this.f7860d;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        C2364j1 j1Var = this.f7860d.get(valueOf);
        if (j1Var.f7820c.f7802c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C2420w1.m11063d(j1Var.f7820c.f7802c, bundle.getInt(C5107i0.m21492a("status", m10945r(bundle)))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Map<Integer, C2364j1> mo9206k() {
        return this.f7860d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ Map mo9207l(List list) {
        HashMap hashMap = new HashMap();
        for (C2364j1 next : this.f7860d.values()) {
            String str = next.f7820c.f7800a;
            if (list.contains(str)) {
                C2364j1 j1Var = (C2364j1) hashMap.get(str);
                if ((j1Var == null ? -1 : j1Var.f7818a) < next.f7818a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo9208m(int i) {
        C2364j1 q = m10944q(i);
        if (C2420w1.m11065f(q.f7820c.f7802c)) {
            C2328c0 c0Var = this.f7857a;
            C2359i1 i1Var = q.f7820c;
            c0Var.mo9113A(i1Var.f7800a, q.f7819b, i1Var.f7801b);
            C2359i1 i1Var2 = q.f7820c;
            int i2 = i1Var2.f7802c;
            if (i2 == 5 || i2 == 6) {
                this.f7857a.mo9129t(i1Var2.f7800a);
                return;
            }
            return;
        }
        throw new C2411u0(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ Boolean mo9209n(Bundle bundle) {
        C2369k1 k1Var;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C2364j1> map = this.f7860d;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(valueOf)) {
            C2364j1 q = m10944q(i);
            int i2 = bundle2.getInt(C5107i0.m21492a("status", q.f7820c.f7800a));
            if (C2420w1.m11063d(q.f7820c.f7802c, i2)) {
                f7856f.mo15203c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(q.f7820c.f7802c));
                C2359i1 i1Var = q.f7820c;
                String str = i1Var.f7800a;
                int i3 = i1Var.f7802c;
                if (i3 == 4) {
                    this.f7858b.mo15202d().mo9161a(i, str);
                } else if (i3 == 5) {
                    this.f7858b.mo15202d().mo9164u(i);
                } else if (i3 == 6) {
                    this.f7858b.mo15202d().mo9163l(Arrays.asList(new String[]{str}));
                }
            } else {
                q.f7820c.f7802c = i2;
                if (C2420w1.m11065f(i2)) {
                    mo9198c(i);
                    this.f7859c.mo9266b(q.f7820c.f7800a);
                } else {
                    for (C2369k1 next : q.f7820c.f7804e) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C5107i0.m21493b("chunk_intents", q.f7820c.f7800a, next.f7832a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    next.f7835d.get(i4).f7790a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String r = m10945r(bundle);
            long j = bundle2.getLong(C5107i0.m21492a("pack_version", r));
            int i5 = bundle2.getInt(C5107i0.m21492a("status", r));
            long j2 = bundle2.getLong(C5107i0.m21492a("total_bytes_to_download", r));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(C5107i0.m21492a("slice_ids", r));
            ArrayList arrayList = new ArrayList();
            for (T t : m10946s(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(C5107i0.m21493b("chunk_intents", r, t));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m10946s(parcelableArrayList2)) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new C2354h1(z));
                    z = true;
                }
                String string = bundle2.getString(C5107i0.m21493b("uncompressed_hash_sha256", r, t));
                long j3 = bundle2.getLong(C5107i0.m21493b("uncompressed_size", r, t));
                int i6 = bundle2.getInt(C5107i0.m21493b("patch_format", r, t), 0);
                if (i6 != 0) {
                    k1Var = new C2369k1(t, string, j3, arrayList2, 0, i6);
                } else {
                    k1Var = new C2369k1(t, string, j3, arrayList2, bundle2.getInt(C5107i0.m21493b("compression_format", r, t), 0), 0);
                }
                arrayList.add(k1Var);
                z = true;
            }
            this.f7860d.put(Integer.valueOf(i), new C2364j1(i, bundle2.getInt("app_version_code"), new C2359i1(r, j, i5, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo9210p(int i) {
        m10942a(new C2344f1(this, i));
    }
}
