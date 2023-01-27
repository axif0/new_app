package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import p048d.p049a.p050a.p051a.p071o.p072a.C3025i0;
import p351k.p361v.p363d.C5956g;

/* renamed from: b */
public final class C0958b extends BaseAdapter {

    /* renamed from: f */
    private final LayoutInflater f3803f;

    /* renamed from: g */
    private final ArrayList<C3025i0> f3804g;

    /* renamed from: b$a */
    private static final class C0959a {

        /* renamed from: a */
        public TextView f3805a;

        /* renamed from: b */
        public TextView f3806b;

        /* renamed from: a */
        public final TextView mo5022a() {
            TextView textView = this.f3806b;
            if (textView != null) {
                return textView;
            }
            C5956g.m24510o("tv_class_time");
            throw null;
        }

        /* renamed from: b */
        public final TextView mo5023b() {
            TextView textView = this.f3805a;
            if (textView != null) {
                return textView;
            }
            C5956g.m24510o("tv_course_details");
            throw null;
        }

        /* renamed from: c */
        public final void mo5024c(TextView textView) {
            C5956g.m24500e(textView, "<set-?>");
            this.f3806b = textView;
        }

        /* renamed from: d */
        public final void mo5025d(TextView textView) {
            C5956g.m24500e(textView, "<set-?>");
            this.f3805a = textView;
        }
    }

    public C0958b(Context context, ArrayList<C3025i0> arrayList) {
        C5956g.m24500e(context, "context");
        C5956g.m24500e(arrayList, "dataSource");
        this.f3804g = arrayList;
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            this.f3803f = (LayoutInflater) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* renamed from: a */
    public C3025i0 getItem(int i) {
        C3025i0 i0Var = this.f3804g.get(i);
        C5956g.m24499d(i0Var, "dataSource[position]");
        return i0Var;
    }

    public int getCount() {
        return this.f3804g.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0959a aVar;
        C5956g.m24500e(viewGroup, "parent");
        if (view == null) {
            view = this.f3803f.inflate(C2722R.layout.item_timeline_class_list_item, viewGroup, false);
            C5956g.m24499d(view, "inflater.inflate(R.layou…list_item, parent, false)");
            aVar = new C0959a();
            View findViewById = view.findViewById(C2722R.C2724id.tv_course_details);
            if (findViewById != null) {
                aVar.mo5025d((TextView) findViewById);
                View findViewById2 = view.findViewById(C2722R.C2724id.tv_class_time);
                if (findViewById2 != null) {
                    aVar.mo5024c((TextView) findViewById2);
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
                aVar = (C0959a) tag;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type ClassListAdapter.ViewHolder");
            }
        }
        TextView b = aVar.mo5023b();
        TextView a = aVar.mo5022a();
        C3025i0 a2 = getItem(i);
        b.setText(a2.mo10515a() + " [" + a2.mo10518d() + "]" + " [" + a2.mo10516b() + "]" + " [" + a2.mo10517c() + "]");
        a.setText(a2.mo10519e());
        return view;
    }
}
