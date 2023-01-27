package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0352n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0334f extends BaseAdapter {

    /* renamed from: f */
    C0335g f1206f;

    /* renamed from: g */
    private int f1207g = -1;

    /* renamed from: h */
    private boolean f1208h;

    /* renamed from: i */
    private final boolean f1209i;

    /* renamed from: j */
    private final LayoutInflater f1210j;

    /* renamed from: k */
    private final int f1211k;

    public C0334f(C0335g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1209i = z;
        this.f1210j = layoutInflater;
        this.f1206f = gVar;
        this.f1211k = i;
        mo1186a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1186a() {
        C0339i x = this.f1206f.mo1268x();
        if (x != null) {
            ArrayList<C0339i> B = this.f1206f.mo1196B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f1207g = i;
                    return;
                }
            }
        }
        this.f1207g = -1;
    }

    /* renamed from: b */
    public C0335g mo1187b() {
        return this.f1206f;
    }

    /* renamed from: c */
    public C0339i getItem(int i) {
        ArrayList<C0339i> B = this.f1209i ? this.f1206f.mo1196B() : this.f1206f.mo1200G();
        int i2 = this.f1207g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    /* renamed from: d */
    public void mo1189d(boolean z) {
        this.f1208h = z;
    }

    public int getCount() {
        ArrayList<C0339i> B = this.f1209i ? this.f1206f.mo1196B() : this.f1206f.mo1200G();
        int i = this.f1207g;
        int size = B.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1210j.inflate(this.f1211k, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1206f.mo1201H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0352n.C0353a aVar = (C0352n.C0353a) view;
        if (this.f1208h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1034e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1186a();
        super.notifyDataSetChanged();
    }
}
