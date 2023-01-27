package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class C0347k implements C0355p, C0350m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private Rect f1285f;

    C0347k() {
    }

    /* renamed from: A */
    protected static boolean m1526A(C0335g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    protected static C0334f m1527B(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0334f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0334f) listAdapter;
    }

    /* renamed from: r */
    protected static int m1528r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public abstract void mo1151d(C0335g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo1153e() {
        return true;
    }

    /* renamed from: f */
    public int mo1132f() {
        return 0;
    }

    /* renamed from: g */
    public void mo1133g(Context context, C0335g gVar) {
    }

    /* renamed from: n */
    public boolean mo1137n(C0335g gVar, C0339i iVar) {
        return false;
    }

    /* renamed from: o */
    public boolean mo1138o(C0335g gVar, C0339i iVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1527B(listAdapter).f1206f.mo1208O((MenuItem) listAdapter.getItem(i), this, mo1153e() ? 0 : 4);
    }

    /* renamed from: q */
    public Rect mo1406q() {
        return this.f1285f;
    }

    /* renamed from: s */
    public abstract void mo1160s(View view);

    /* renamed from: t */
    public void mo1407t(Rect rect) {
        this.f1285f = rect;
    }

    /* renamed from: u */
    public abstract void mo1161u(boolean z);

    /* renamed from: v */
    public abstract void mo1162v(int i);

    /* renamed from: w */
    public abstract void mo1163w(int i);

    /* renamed from: x */
    public abstract void mo1164x(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: y */
    public abstract void mo1165y(boolean z);

    /* renamed from: z */
    public abstract void mo1166z(int i);
}
