package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3373d;

/* renamed from: androidx.recyclerview.widget.o */
public class C0916o extends C3350a {

    /* renamed from: d */
    final RecyclerView f3674d;

    /* renamed from: e */
    private final C0917a f3675e;

    /* renamed from: androidx.recyclerview.widget.o$a */
    public static class C0917a extends C3350a {

        /* renamed from: d */
        final C0916o f3676d;

        /* renamed from: e */
        private Map<View, C3350a> f3677e = new WeakHashMap();

        public C0917a(C0916o oVar) {
            this.f3676d = oVar;
        }

        /* renamed from: a */
        public boolean mo3106a(View view, AccessibilityEvent accessibilityEvent) {
            C3350a aVar = this.f3677e.get(view);
            return aVar != null ? aVar.mo3106a(view, accessibilityEvent) : super.mo3106a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C3373d mo4824b(View view) {
            C3350a aVar = this.f3677e.get(view);
            return aVar != null ? aVar.mo4824b(view) : super.mo4824b(view);
        }

        /* renamed from: f */
        public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
            C3350a aVar = this.f3677e.get(view);
            if (aVar != null) {
                aVar.mo2996f(view, accessibilityEvent);
            } else {
                super.mo2996f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            if (!this.f3676d.mo4823o() && this.f3676d.f3674d.getLayoutManager() != null) {
                this.f3676d.f3674d.getLayoutManager().mo4445O0(view, cVar);
                C3350a aVar = this.f3677e.get(view);
                if (aVar != null) {
                    aVar.mo2997g(view, cVar);
                    return;
                }
            }
            super.mo2997g(view, cVar);
        }

        /* renamed from: h */
        public void mo4825h(View view, AccessibilityEvent accessibilityEvent) {
            C3350a aVar = this.f3677e.get(view);
            if (aVar != null) {
                aVar.mo4825h(view, accessibilityEvent);
            } else {
                super.mo4825h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo3107i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C3350a aVar = this.f3677e.get(viewGroup);
            return aVar != null ? aVar.mo3107i(viewGroup, view, accessibilityEvent) : super.mo3107i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo2998j(View view, int i, Bundle bundle) {
            if (this.f3676d.mo4823o() || this.f3676d.f3674d.getLayoutManager() == null) {
                return super.mo2998j(view, i, bundle);
            }
            C3350a aVar = this.f3677e.get(view);
            if (aVar != null) {
                if (aVar.mo2998j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2998j(view, i, bundle)) {
                return true;
            }
            return this.f3676d.f3674d.getLayoutManager().mo4480i1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo4826l(View view, int i) {
            C3350a aVar = this.f3677e.get(view);
            if (aVar != null) {
                aVar.mo4826l(view, i);
            } else {
                super.mo4826l(view, i);
            }
        }

        /* renamed from: m */
        public void mo4827m(View view, AccessibilityEvent accessibilityEvent) {
            C3350a aVar = this.f3677e.get(view);
            if (aVar != null) {
                aVar.mo4827m(view, accessibilityEvent);
            } else {
                super.mo4827m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C3350a mo4828n(View view) {
            return this.f3677e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo4829o(View view) {
            C3350a j = C3403t.m14644j(view);
            if (j != null && j != this) {
                this.f3677e.put(view, j);
            }
        }
    }

    public C0916o(RecyclerView recyclerView) {
        this.f3674d = recyclerView;
        C3350a n = mo4004n();
        this.f3675e = (n == null || !(n instanceof C0917a)) ? new C0917a(this) : (C0917a) n;
    }

    /* renamed from: f */
    public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2996f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo4823o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4057K0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo2997g(View view, C3369c cVar) {
        super.mo2997g(view, cVar);
        if (!mo4823o() && this.f3674d.getLayoutManager() != null) {
            this.f3674d.getLayoutManager().mo4442M0(cVar);
        }
    }

    /* renamed from: j */
    public boolean mo2998j(View view, int i, Bundle bundle) {
        if (super.mo2998j(view, i, bundle)) {
            return true;
        }
        if (mo4823o() || this.f3674d.getLayoutManager() == null) {
            return false;
        }
        return this.f3674d.getLayoutManager().mo4475g1(i, bundle);
    }

    /* renamed from: n */
    public C3350a mo4004n() {
        return this.f3675e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4823o() {
        return this.f3674d.mo4204m0();
    }
}
