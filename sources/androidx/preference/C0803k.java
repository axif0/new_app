package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.C0916o;
import androidx.recyclerview.widget.RecyclerView;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.p123c0.C3369c;

@Deprecated
/* renamed from: androidx.preference.k */
public class C0803k extends C0916o {

    /* renamed from: f */
    final RecyclerView f3184f;

    /* renamed from: g */
    final C3350a f3185g = super.mo4004n();

    /* renamed from: h */
    final C3350a f3186h = new C0804a();

    /* renamed from: androidx.preference.k$a */
    class C0804a extends C3350a {
        C0804a() {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            Preference E;
            C0803k.this.f3185g.mo2997g(view, cVar);
            int d0 = C0803k.this.f3184f.mo4156d0(view);
            RecyclerView.C0832g adapter = C0803k.this.f3184f.getAdapter();
            if ((adapter instanceof C0792h) && (E = ((C0792h) adapter).mo3959E(d0)) != null) {
                E.mo3815b0(cVar);
            }
        }

        /* renamed from: j */
        public boolean mo2998j(View view, int i, Bundle bundle) {
            return C0803k.this.f3185g.mo2998j(view, i, bundle);
        }
    }

    public C0803k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f3184f = recyclerView;
    }

    /* renamed from: n */
    public C3350a mo4004n() {
        return this.f3186h;
    }
}
