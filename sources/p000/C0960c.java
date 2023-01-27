package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import p048d.p049a.p050a.p051a.p071o.p072a.C3034n;
import p351k.p361v.p363d.C5956g;

/* renamed from: c */
public final class C0960c extends BaseAdapter {

    /* renamed from: f */
    private final LayoutInflater f3807f;

    /* renamed from: g */
    private final ArrayList<C3034n> f3808g;

    /* renamed from: c$a */
    private static final class C0961a {

        /* renamed from: a */
        public TextView f3809a;

        /* renamed from: b */
        public TextView f3810b;

        /* renamed from: a */
        public final TextView mo5031a() {
            TextView textView = this.f3810b;
            if (textView != null) {
                return textView;
            }
            C5956g.m24510o("tv_class_time");
            throw null;
        }

        /* renamed from: b */
        public final TextView mo5032b() {
            TextView textView = this.f3809a;
            if (textView != null) {
                return textView;
            }
            C5956g.m24510o("tv_course_details");
            throw null;
        }

        /* renamed from: c */
        public final void mo5033c(TextView textView) {
            C5956g.m24500e(textView, "<set-?>");
            this.f3810b = textView;
        }

        /* renamed from: d */
        public final void mo5034d(TextView textView) {
            C5956g.m24500e(textView, "<set-?>");
            this.f3809a = textView;
        }
    }

    public C0960c(Context context, ArrayList<C3034n> arrayList) {
        C5956g.m24500e(context, "context");
        C5956g.m24500e(arrayList, "dataSource");
        this.f3808g = arrayList;
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            this.f3807f = (LayoutInflater) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* renamed from: a */
    public C3034n getItem(int i) {
        C3034n nVar = this.f3808g.get(i);
        C5956g.m24499d(nVar, "dataSource[position]");
        return nVar;
    }

    public int getCount() {
        return this.f3808g.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0961a aVar;
        C5956g.m24500e(viewGroup, "parent");
        if (view == null) {
            view = this.f3807f.inflate(C2722R.layout.item_timeline_class_list_item, viewGroup, false);
            C5956g.m24499d(view, "inflater.inflate(R.layou…list_item, parent, false)");
            aVar = new C0961a();
            View findViewById = view.findViewById(C2722R.C2724id.tv_course_details);
            if (findViewById != null) {
                aVar.mo5034d((TextView) findViewById);
                View findViewById2 = view.findViewById(C2722R.C2724id.tv_class_time);
                if (findViewById2 != null) {
                    aVar.mo5033c((TextView) findViewById2);
                    view.setTag(aVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                aVar = (C0961a) tag;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type FacultyClassListAdapter.ViewHolder");
            }
        }
        TextView b = aVar.mo5032b();
        TextView a = aVar.mo5031a();
        C3034n a2 = getItem(i);
        b.setText(a2.mo10555a() + " [" + a2.mo10557c() + "]" + " [" + a2.mo10556b() + "]");
        a.setText(a2.mo10558d());
        return view;
    }
}
