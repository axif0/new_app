package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
public abstract class C0954a {

    /* renamed from: a */
    private final DataSetObservable f3797a = new DataSetObservable();

    /* renamed from: a */
    public abstract void mo509a(ViewGroup viewGroup, int i, Object obj);

    @Deprecated
    /* renamed from: b */
    public void mo5005b(View view) {
    }

    /* renamed from: c */
    public void mo3509c(ViewGroup viewGroup) {
        mo5005b(viewGroup);
    }

    /* renamed from: d */
    public abstract int mo510d();

    /* renamed from: e */
    public int mo5006e(Object obj) {
        return -1;
    }

    /* renamed from: f */
    public CharSequence mo5007f(int i) {
        return null;
    }

    /* renamed from: g */
    public float mo5008g(int i) {
        return 1.0f;
    }

    /* renamed from: h */
    public abstract Object mo511h(ViewGroup viewGroup, int i);

    /* renamed from: i */
    public abstract boolean mo512i(View view, Object obj);

    /* renamed from: j */
    public void mo5009j(DataSetObserver dataSetObserver) {
        this.f3797a.registerObserver(dataSetObserver);
    }

    /* renamed from: k */
    public void mo3510k(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: l */
    public Parcelable mo3511l() {
        return null;
    }

    @Deprecated
    /* renamed from: m */
    public void mo5010m(View view, int i, Object obj) {
    }

    /* renamed from: n */
    public void mo3512n(ViewGroup viewGroup, int i, Object obj) {
        mo5010m(viewGroup, i, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5011o(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    @Deprecated
    /* renamed from: p */
    public void mo5012p(View view) {
    }

    /* renamed from: q */
    public void mo3513q(ViewGroup viewGroup) {
        mo5012p(viewGroup);
    }

    /* renamed from: r */
    public void mo5013r(DataSetObserver dataSetObserver) {
        this.f3797a.unregisterObserver(dataSetObserver);
    }
}
