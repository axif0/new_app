package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5120p;
import p148g.p189d.p190a.p271e.p272a.p276c.C5128t;
import p148g.p189d.p190a.p271e.p272a.p276c.C5129t0;
import p148g.p189d.p190a.p271e.p272a.p278e.C5145a;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;
import p148g.p189d.p190a.p271e.p272a.p280g.C5154g;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.r */
final class C2398r implements C2371k3 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C5100f f7925f = new C5100f("AssetPackServiceImpl");

    /* renamed from: g */
    private static final Intent f7926g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f7927a;

    /* renamed from: b */
    private final C2427y0 f7928b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5120p<C5129t0> f7929c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5120p<C5129t0> f7930d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f7931e = new AtomicBoolean();

    C2398r(Context context, C2427y0 y0Var) {
        this.f7927a = context.getPackageName();
        this.f7928b = y0Var;
        if (C5128t.m21549a(context)) {
            this.f7929c = new C5120p(C5145a.m21596a(context), f7925f, "AssetPackService", f7926g, C2376l3.f7853a);
            this.f7930d = new C5120p(C5145a.m21596a(context), f7925f, "AssetPackService-keepAlive", f7926g, C2381m3.f7870a);
        }
        f7925f.mo15203c("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: c */
    static /* synthetic */ ArrayList m10997c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: e */
    static /* synthetic */ List m10998e(C2398r rVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2327c next = C2332d.m10855b((Bundle) it.next(), rVar.f7928b).mo9136e().values().iterator().next();
            if (next == null) {
                f7925f.mo15205e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C2420w1.m11062c(next.mo9110g())) {
                arrayList.add(next.mo9109f());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m10999f(int i, String str, int i2) {
        if (this.f7929c != null) {
            f7925f.mo15206f("notifyModuleCompleted", new Object[0]);
            C5163p pVar = new C5163p();
            this.f7929c.mo15222c(new C2357i(this, pVar, i, str, pVar, i2));
            return;
        }
        throw new C2411u0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: j */
    static /* synthetic */ Bundle m11003j(Map map) {
        Bundle t = m11012t();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        t.putParcelableArrayList("installed_asset_module", arrayList);
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static Bundle m11006n(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static Bundle m11007o(int i, String str) {
        Bundle n = m11006n(i);
        n.putString("module_name", str);
        return n;
    }

    /* renamed from: p */
    static /* synthetic */ Bundle m11008p(int i, String str, String str2, int i2) {
        Bundle o = m11007o(i, str);
        o.putString("slice_id", str2);
        o.putInt("chunk_number", i2);
        return o;
    }

    /* renamed from: s */
    private static <T> C5152e<T> m11011s() {
        f7925f.mo15205e("onError(%d)", -11);
        return C5154g.m21612a(new C2317a(-11));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static Bundle m11012t() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10802);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    /* renamed from: a */
    public final void mo9161a(int i, String str) {
        m10999f(i, str, 10);
    }

    /* renamed from: d */
    public final synchronized void mo9162d() {
        if (this.f7930d == null) {
            f7925f.mo15207g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f7925f.mo15206f("keepAlive", new Object[0]);
        if (!this.f7931e.compareAndSet(false, true)) {
            f7925f.mo15206f("Service is already kept alive.", new Object[0]);
            return;
        }
        C5163p pVar = new C5163p();
        this.f7930d.mo15222c(new C2372l(this, pVar, pVar));
    }

    /* renamed from: l */
    public final void mo9163l(List<String> list) {
        if (this.f7929c != null) {
            f7925f.mo15206f("cancelDownloads(%s)", list);
            C5163p pVar = new C5163p();
            this.f7929c.mo15222c(new C2342f(this, pVar, list, pVar));
        }
    }

    /* renamed from: u */
    public final void mo9164u(int i) {
        if (this.f7929c != null) {
            f7925f.mo15206f("notifySessionFailed", new Object[0]);
            C5163p pVar = new C5163p();
            this.f7929c.mo15222c(new C2362j(this, pVar, i, pVar));
            return;
        }
        throw new C2411u0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: v */
    public final C5152e<List<String>> mo9165v(Map<String, Long> map) {
        if (this.f7929c == null) {
            return m11011s();
        }
        f7925f.mo15206f("syncPacks", new Object[0]);
        C5163p pVar = new C5163p();
        this.f7929c.mo15222c(new C2347g(this, pVar, map, pVar));
        return pVar.mo15261a();
    }

    /* renamed from: w */
    public final C5152e<ParcelFileDescriptor> mo9166w(int i, String str, String str2, int i2) {
        if (this.f7929c == null) {
            return m11011s();
        }
        f7925f.mo15206f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C5163p pVar = new C5163p();
        this.f7929c.mo15222c(new C2367k(this, pVar, i, str, str2, i2, pVar));
        return pVar.mo15261a();
    }

    /* renamed from: x */
    public final void mo9167x(int i, String str, String str2, int i2) {
        if (this.f7929c != null) {
            f7925f.mo15206f("notifyChunkTransferred", new Object[0]);
            C5163p pVar = new C5163p();
            this.f7929c.mo15222c(new C2352h(this, pVar, i, str, str2, i2, pVar));
            return;
        }
        throw new C2411u0("The Play Store app is not installed or is an unofficial version.", i);
    }
}
