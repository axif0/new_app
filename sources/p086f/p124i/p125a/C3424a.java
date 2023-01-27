package p086f.p124i.p125a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p086f.p124i.p125a.C3427b;

/* renamed from: f.i.a.a */
public abstract class C3424a extends BaseAdapter implements Filterable, C3427b.C3428a {

    /* renamed from: f */
    protected boolean f10735f;

    /* renamed from: g */
    protected boolean f10736g;

    /* renamed from: h */
    protected Cursor f10737h;

    /* renamed from: i */
    protected Context f10738i;

    /* renamed from: j */
    protected int f10739j;

    /* renamed from: k */
    protected C3425a f10740k;

    /* renamed from: l */
    protected DataSetObserver f10741l;

    /* renamed from: m */
    protected C3427b f10742m;

    /* renamed from: f.i.a.a$a */
    private class C3425a extends ContentObserver {
        C3425a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C3424a.this.mo11751i();
        }
    }

    /* renamed from: f.i.a.a$b */
    private class C3426b extends DataSetObserver {
        C3426b() {
        }

        public void onChanged() {
            C3424a aVar = C3424a.this;
            aVar.f10735f = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C3424a aVar = C3424a.this;
            aVar.f10735f = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C3424a(Context context, Cursor cursor, boolean z) {
        mo11745f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo2302a(Cursor cursor) {
        Cursor j = mo11752j(cursor);
        if (j != null) {
            j.close();
        }
    }

    /* renamed from: b */
    public Cursor mo11744b() {
        return this.f10737h;
    }

    /* renamed from: c */
    public abstract CharSequence mo2303c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo2305e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11745f(Context context, Cursor cursor, int i) {
        C3426b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f10736g = true;
        } else {
            this.f10736g = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f10737h = cursor;
        this.f10735f = z;
        this.f10738i = context;
        this.f10739j = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f10740k = new C3425a();
            bVar = new C3426b();
        } else {
            bVar = null;
            this.f10740k = null;
        }
        this.f10741l = bVar;
        if (z) {
            C3425a aVar = this.f10740k;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10741l;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo11746g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f10735f || (cursor = this.f10737h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10735f) {
            return null;
        }
        this.f10737h.moveToPosition(i);
        if (view == null) {
            view = mo11746g(this.f10738i, this.f10737h, viewGroup);
        }
        mo2305e(view, this.f10738i, this.f10737h);
        return view;
    }

    public Filter getFilter() {
        if (this.f10742m == null) {
            this.f10742m = new C3427b(this);
        }
        return this.f10742m;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f10735f || (cursor = this.f10737h) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f10737h;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f10735f || (cursor = this.f10737h) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f10737h.getLong(this.f10739j);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10735f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f10737h.moveToPosition(i)) {
            if (view == null) {
                view = mo2308h(this.f10738i, this.f10737h, viewGroup);
            }
            mo2305e(view, this.f10738i, this.f10737h);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    public abstract View mo2308h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo11751i() {
        Cursor cursor;
        if (this.f10736g && (cursor = this.f10737h) != null && !cursor.isClosed()) {
            this.f10735f = this.f10737h.requery();
        }
    }

    /* renamed from: j */
    public Cursor mo11752j(Cursor cursor) {
        Cursor cursor2 = this.f10737h;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C3425a aVar = this.f10740k;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10741l;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f10737h = cursor;
        if (cursor != null) {
            C3425a aVar2 = this.f10740k;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f10741l;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f10739j = cursor.getColumnIndexOrThrow("_id");
            this.f10735f = true;
            notifyDataSetChanged();
        } else {
            this.f10739j = -1;
            this.f10735f = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
