package p340io.realm;

import android.widget.BaseAdapter;
import p340io.realm.C5763l0;

/* renamed from: io.realm.f0 */
public abstract class C5657f0<T extends C5763l0> extends BaseAdapter {

    /* renamed from: f */
    protected OrderedRealmCollection<T> f16309f;

    /* renamed from: g */
    private final C5669h0<OrderedRealmCollection<T>> f16310g;

    /* renamed from: io.realm.f0$a */
    class C5658a implements C5669h0<OrderedRealmCollection<T>> {
        C5658a() {
        }

        /* renamed from: b */
        public void mo16295a(OrderedRealmCollection<T> orderedRealmCollection) {
            C5657f0.this.notifyDataSetChanged();
        }
    }

    public C5657f0(OrderedRealmCollection<T> orderedRealmCollection) {
        if (orderedRealmCollection == null || orderedRealmCollection.mo16154s()) {
            this.f16309f = orderedRealmCollection;
            this.f16310g = new C5658a();
            if (m23477c()) {
                m23476a(orderedRealmCollection);
                return;
            }
            return;
        }
        throw new IllegalStateException("Only use this adapter with managed list, for un-managed lists you can just use the BaseAdapter");
    }

    /* renamed from: a */
    private void m23476a(OrderedRealmCollection<T> orderedRealmCollection) {
        if (orderedRealmCollection instanceof C5782q0) {
            ((C5782q0) orderedRealmCollection).mo16764j(this.f16310g);
        } else if (orderedRealmCollection instanceof C5751j0) {
            ((C5751j0) orderedRealmCollection).mo16703m(this.f16310g);
        } else {
            throw new IllegalArgumentException("RealmCollection not supported: " + orderedRealmCollection.getClass());
        }
    }

    /* renamed from: c */
    private boolean m23477c() {
        OrderedRealmCollection<T> orderedRealmCollection = this.f16309f;
        return orderedRealmCollection != null && orderedRealmCollection.mo16152k();
    }

    /* renamed from: b */
    public T getItem(int i) {
        if (m23477c()) {
            return (C5763l0) this.f16309f.get(i);
        }
        return null;
    }

    public int getCount() {
        if (m23477c()) {
            return this.f16309f.size();
        }
        return 0;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
