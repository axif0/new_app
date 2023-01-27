package androidx.preference;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.l */
public class C0805l extends RecyclerView.C0829d0 {

    /* renamed from: t */
    private final SparseArray<View> f3188t;

    /* renamed from: u */
    private boolean f3189u;

    /* renamed from: v */
    private boolean f3190v;

    C0805l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f3188t = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        this.f3188t.put(16908304, view.findViewById(16908304));
        this.f3188t.put(16908294, view.findViewById(16908294));
        SparseArray<View> sparseArray2 = this.f3188t;
        int i = C0809p.icon_frame;
        sparseArray2.put(i, view.findViewById(i));
        this.f3188t.put(16908350, view.findViewById(16908350));
    }

    /* renamed from: M */
    public View mo4005M(int i) {
        View view = this.f3188t.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f3359a.findViewById(i);
        if (findViewById != null) {
            this.f3188t.put(i, findViewById);
        }
        return findViewById;
    }

    /* renamed from: N */
    public boolean mo4006N() {
        return this.f3189u;
    }

    /* renamed from: O */
    public boolean mo4007O() {
        return this.f3190v;
    }

    /* renamed from: P */
    public void mo4008P(boolean z) {
        this.f3189u = z;
    }

    /* renamed from: Q */
    public void mo4009Q(boolean z) {
        this.f3190v = z;
    }
}
