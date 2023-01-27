package p086f.p124i.p125a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: f.i.a.b */
class C3427b extends Filter {

    /* renamed from: a */
    C3428a f10745a;

    /* renamed from: f.i.a.b$a */
    interface C3428a {
        /* renamed from: a */
        void mo2302a(Cursor cursor);

        /* renamed from: b */
        Cursor mo11744b();

        /* renamed from: c */
        CharSequence mo2303c(Cursor cursor);

        /* renamed from: d */
        Cursor mo2304d(CharSequence charSequence);
    }

    C3427b(C3428a aVar) {
        this.f10745a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f10745a.mo2303c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f10745a.mo2304d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
        } else {
            filterResults.count = 0;
            d = null;
        }
        filterResults.values = d;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.f10745a.mo11744b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f10745a.mo2302a((Cursor) obj);
        }
    }
}
