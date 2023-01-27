package com.bumptech.glide.p022n;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.C0979j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.n.k */
public class C1336k extends Fragment {

    /* renamed from: f */
    private final C1324a f4630f;

    /* renamed from: g */
    private final C1341m f4631g;

    /* renamed from: h */
    private final Set<C1336k> f4632h;

    /* renamed from: i */
    private C0979j f4633i;

    /* renamed from: j */
    private C1336k f4634j;

    /* renamed from: k */
    private Fragment f4635k;

    /* renamed from: com.bumptech.glide.n.k$a */
    private class C1337a implements C1341m {
        C1337a() {
        }

        /* renamed from: a */
        public Set<C0979j> mo5703a() {
            Set<C1336k> b = C1336k.this.mo5704b();
            HashSet hashSet = new HashSet(b.size());
            for (C1336k next : b) {
                if (next.mo5706e() != null) {
                    hashSet.add(next.mo5706e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C1336k.this + "}";
        }
    }

    public C1336k() {
        this(new C1324a());
    }

    @SuppressLint({"ValidFragment"})
    C1336k(C1324a aVar) {
        this.f4631g = new C1337a();
        this.f4632h = new HashSet();
        this.f4630f = aVar;
    }

    /* renamed from: a */
    private void m6642a(C1336k kVar) {
        this.f4632h.add(kVar);
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m6643d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f4635k;
    }

    @TargetApi(17)
    /* renamed from: g */
    private boolean m6644g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m6645h(Activity activity) {
        m6647l();
        C1336k h = C0963b.m5388c(activity).mo5044k().mo5720h(activity);
        this.f4634j = h;
        if (!equals(h)) {
            this.f4634j.m6642a(this);
        }
    }

    /* renamed from: i */
    private void m6646i(C1336k kVar) {
        this.f4632h.remove(kVar);
    }

    /* renamed from: l */
    private void m6647l() {
        C1336k kVar = this.f4634j;
        if (kVar != null) {
            kVar.m6646i(this);
            this.f4634j = null;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    /* renamed from: b */
    public Set<C1336k> mo5704b() {
        if (equals(this.f4634j)) {
            return Collections.unmodifiableSet(this.f4632h);
        }
        if (this.f4634j == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C1336k next : this.f4634j.mo5704b()) {
            if (m6644g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1324a mo5705c() {
        return this.f4630f;
    }

    /* renamed from: e */
    public C0979j mo5706e() {
        return this.f4633i;
    }

    /* renamed from: f */
    public C1341m mo5707f() {
        return this.f4631g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5708j(Fragment fragment) {
        this.f4635k = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m6645h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo5709k(C0979j jVar) {
        this.f4633i = jVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m6645h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4630f.mo5697c();
        m6647l();
    }

    public void onDetach() {
        super.onDetach();
        m6647l();
    }

    public void onStart() {
        super.onStart();
        this.f4630f.mo5698d();
    }

    public void onStop() {
        super.onStop();
        this.f4630f.mo5699e();
    }

    public String toString() {
        return super.toString() + "{parent=" + m6643d() + "}";
    }
}
