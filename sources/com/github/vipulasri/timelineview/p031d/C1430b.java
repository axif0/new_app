package com.github.vipulasri.timelineview.p031d;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.vipulasri.timelineview.TimelineView;
import com.github.vipulasri.timelineview.p031d.p033e.C1436b;
import com.google.android.material.card.MaterialCardView;
import com.karumi.dexter.C2722R;
import java.util.List;
import p048d.p049a.p050a.p051a.C2796a;
import p048d.p049a.p050a.p051a.p071o.p072a.C3013c0;
import p351k.p361v.p363d.C5956g;

/* renamed from: com.github.vipulasri.timelineview.d.b */
public final class C1430b extends RecyclerView.C0832g<C1431a> {

    /* renamed from: h */
    private LayoutInflater f4880h;

    /* renamed from: i */
    private final Context f4881i;

    /* renamed from: j */
    private int[] f4882j;

    /* renamed from: k */
    private final List<? extends C3013c0> f4883k;

    /* renamed from: l */
    private C1436b f4884l;

    /* renamed from: com.github.vipulasri.timelineview.d.b$a */
    public final class C1431a extends RecyclerView.C0829d0 {

        /* renamed from: t */
        private final ListView f4885t;

        /* renamed from: u */
        private final TimelineView f4886u;

        /* renamed from: v */
        private final TextView f4887v;

        /* renamed from: w */
        private final TextView f4888w;

        /* renamed from: x */
        private final TextView f4889x;

        /* renamed from: y */
        private final TextView f4890y;

        /* renamed from: z */
        private final MaterialCardView f4891z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1431a(C1430b bVar, View view, int i) {
            super(view);
            C5956g.m24500e(view, "itemView");
            this.f4885t = (ListView) view.findViewById(C2796a.lv_individual_class);
            this.f4886u = (TimelineView) view.findViewById(C2796a.timeline);
            this.f4887v = (TextView) view.findViewById(C2796a.tv_class_unavailable_message);
            this.f4888w = (TextView) view.findViewById(C2796a.tv_day_name);
            this.f4889x = (TextView) view.findViewById(C2796a.tv_day_of_month);
            this.f4890y = (TextView) view.findViewById(C2796a.tv_month_name);
            this.f4891z = (MaterialCardView) view.findViewById(C2796a.mcv_timeline);
            this.f4886u.mo5954c(i);
        }

        /* renamed from: M */
        public final ListView mo5999M() {
            return this.f4885t;
        }

        /* renamed from: N */
        public final MaterialCardView mo6000N() {
            return this.f4891z;
        }

        /* renamed from: O */
        public final TimelineView mo6001O() {
            return this.f4886u;
        }

        /* renamed from: P */
        public final TextView mo6002P() {
            return this.f4887v;
        }

        /* renamed from: Q */
        public final TextView mo6003Q() {
            return this.f4888w;
        }

        /* renamed from: R */
        public final TextView mo6004R() {
            return this.f4889x;
        }

        /* renamed from: S */
        public final TextView mo6005S() {
            return this.f4890y;
        }
    }

    public C1430b(Context context, List<? extends C3013c0> list, C1436b bVar) {
        C5956g.m24500e(context, "context");
        C5956g.m24500e(list, "mDataList");
        C5956g.m24500e(bVar, "mAttributes");
        this.f4883k = list;
        this.f4884l = bVar;
        this.f4881i = context;
        int[] intArray = context.getResources().getIntArray(C2722R.array.color_timeline_items);
        C5956g.m24499d(intArray, "this.context.resources.g…ray.color_timeline_items)");
        this.f4882j = intArray;
    }

    /* renamed from: D */
    private final void m7078D(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            int i = 0;
            for (int i2 = 0; i2 < count; i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                Resources resources = listView.getResources();
                C5956g.m24499d(resources, "listView.resources");
                view.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) 500) * resources.getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                C5956g.m24499d(view, "item");
                i += view.getMeasuredHeight();
            }
            int dividerHeight = listView.getDividerHeight() * (count - 1);
            int paddingTop = listView.getPaddingTop() + listView.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + dividerHeight + paddingTop;
            listView.setLayoutParams(layoutParams);
            listView.requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0177  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3966q(com.github.vipulasri.timelineview.p031d.C1430b.C1431a r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            p351k.p361v.p363d.C5956g.m24500e(r9, r0)
            java.util.List<? extends d.a.a.a.o.a.c0> r0 = r8.f4883k
            java.lang.Object r0 = r0.get(r10)
            d.a.a.a.o.a.c0 r0 = (p048d.p049a.p050a.p051a.p071o.p072a.C3013c0) r0
            d.a.a.a.h.f r1 = r0.mo10481f()
            d.a.a.a.h.f r2 = p048d.p049a.p050a.p051a.p059h.C2883f.INACTIVE
            java.lang.String r3 = "holder.timeline"
            if (r1 != r2) goto L_0x0031
            com.github.vipulasri.timelineview.TimelineView r1 = r9.mo6001O()
            p351k.p361v.p363d.C5956g.m24499d(r1, r3)
            android.content.Context r2 = r8.f4881i
            r3 = 2131230922(0x7f0800ca, float:1.807791E38)
        L_0x0023:
            com.github.vipulasri.timelineview.d.e.b r4 = r8.f4884l
            int r4 = r4.mo6015a()
            android.graphics.drawable.Drawable r2 = p048d.p049a.p050a.p051a.p078s.C3106p.m13343b(r2, r3, r4)
            r1.setMarker(r2)
            goto L_0x005c
        L_0x0031:
            d.a.a.a.h.f r1 = r0.mo10481f()
            d.a.a.a.h.f r2 = p048d.p049a.p050a.p051a.p059h.C2883f.ACTIVE
            if (r1 != r2) goto L_0x0046
            com.github.vipulasri.timelineview.TimelineView r1 = r9.mo6001O()
            p351k.p361v.p363d.C5956g.m24499d(r1, r3)
            android.content.Context r2 = r8.f4881i
            r3 = 2131230921(0x7f0800c9, float:1.8077908E38)
            goto L_0x0023
        L_0x0046:
            com.github.vipulasri.timelineview.TimelineView r1 = r9.mo6001O()
            android.content.Context r2 = r8.f4881i
            r3 = 2131230920(0x7f0800c8, float:1.8077906E38)
            android.graphics.drawable.Drawable r2 = p086f.p111h.p112e.C3267a.m14076f(r2, r3)
            com.github.vipulasri.timelineview.d.e.b r3 = r8.f4884l
            int r3 = r3.mo6015a()
            r1.mo5955f(r2, r3)
        L_0x005c:
            int[] r1 = r8.f4882j
            int r1 = r1.length
            r2 = 0
            if (r10 >= r1) goto L_0x006e
            com.google.android.material.card.MaterialCardView r1 = r9.mo6000N()
            int[] r3 = r8.f4882j
            r10 = r3[r10]
            r1.setCardBackgroundColor((int) r10)
            goto L_0x007e
        L_0x006e:
            com.google.android.material.card.MaterialCardView r10 = r9.mo6000N()
            int[] r1 = r8.f4882j
            int r3 = r1.length
            int r3 = p048d.p049a.p050a.p051a.p078s.C3101n.m13322q(r2, r3)
            r1 = r1[r3]
            r10.setCardBackgroundColor((int) r1)
        L_0x007e:
            java.lang.String r10 = r0.mo10477b()
            java.lang.String r1 = "timeLineModel.dayName"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            boolean r10 = p351k.p352a0.C5838l.m24335a(r10)
            r10 = r10 ^ 1
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.CharSequence"
            r6 = 3
            if (r10 == 0) goto L_0x00c9
            android.widget.TextView r10 = r9.mo6003Q()
            java.lang.String r7 = "holder.tv_day_name"
            p351k.p361v.p363d.C5956g.m24499d(r10, r7)
            java.lang.String r7 = r0.mo10477b()
            p351k.p361v.p363d.C5956g.m24499d(r7, r1)
            if (r7 == 0) goto L_0x00c3
            java.lang.CharSequence r1 = p351k.p352a0.C5839m.m24353s(r7)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r1.substring(r2, r6)
            p351k.p361v.p363d.C5956g.m24499d(r1, r4)
            r10.setText(r1)
            goto L_0x00c9
        L_0x00bd:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r3)
            throw r9
        L_0x00c3:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r5)
            throw r9
        L_0x00c9:
            android.widget.TextView r10 = r9.mo6004R()
            java.lang.String r1 = "holder.tv_day_of_month"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            int r1 = r0.mo10479d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r10.setText(r1)
            java.lang.String r10 = r0.mo10480e()
            java.lang.String r1 = "timeLineModel.monthName"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            boolean r10 = p351k.p352a0.C5838l.m24335a(r10)
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x0121
            android.widget.TextView r10 = r9.mo6005S()
            java.lang.String r7 = "holder.tv_month_name"
            p351k.p361v.p363d.C5956g.m24499d(r10, r7)
            java.lang.String r7 = r0.mo10480e()
            p351k.p361v.p363d.C5956g.m24499d(r7, r1)
            if (r7 == 0) goto L_0x011b
            java.lang.CharSequence r1 = p351k.p352a0.C5839m.m24353s(r7)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0115
            java.lang.String r1 = r1.substring(r2, r6)
            p351k.p361v.p363d.C5956g.m24499d(r1, r4)
            r10.setText(r1)
            goto L_0x0121
        L_0x0115:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r3)
            throw r9
        L_0x011b:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r5)
            throw r9
        L_0x0121:
            java.util.List r10 = r0.mo10476a()
            java.lang.String r1 = "holder.tv_class_unavailable_message"
            r3 = 8
            java.lang.String r4 = "holder.lv_individual_class"
            if (r10 == 0) goto L_0x0177
            java.util.List r10 = r0.mo10476a()
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0177
            android.widget.ListView r10 = r9.mo5999M()
            p351k.p361v.p363d.C5956g.m24499d(r10, r4)
            r10.setVisibility(r2)
            android.widget.TextView r10 = r9.mo6002P()
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            r10.setVisibility(r3)
            c r10 = new c
            android.content.Context r1 = r8.f4881i
            java.util.List r0 = r0.mo10476a()
            if (r0 == 0) goto L_0x016f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r10.<init>(r1, r0)
            android.widget.ListView r0 = r9.mo5999M()
            p351k.p361v.p363d.C5956g.m24499d(r0, r4)
            r0.setAdapter(r10)
            android.widget.ListView r9 = r9.mo5999M()
            p351k.p361v.p363d.C5956g.m24499d(r9, r4)
            r8.m7078D(r9)
            goto L_0x018b
        L_0x016f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.ArrayList<academia.bracu.com.academia.responses.models.CourseSchedule> /* = java.util.ArrayList<academia.bracu.com.academia.responses.models.CourseSchedule> */"
            r9.<init>(r10)
            throw r9
        L_0x0177:
            android.widget.ListView r10 = r9.mo5999M()
            p351k.p361v.p363d.C5956g.m24499d(r10, r4)
            r10.setVisibility(r3)
            android.widget.TextView r9 = r9.mo6002P()
            p351k.p361v.p363d.C5956g.m24499d(r9, r1)
            r9.setVisibility(r2)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.vipulasri.timelineview.p031d.C1430b.mo3966q(com.github.vipulasri.timelineview.d.b$a, int):void");
    }

    /* renamed from: C */
    public C1431a mo3967s(ViewGroup viewGroup, int i) {
        C5956g.m24500e(viewGroup, "parent");
        if (this.f4880h == null) {
            LayoutInflater from = LayoutInflater.from(this.f4881i);
            C5956g.m24499d(from, "LayoutInflater.from(context)");
            this.f4880h = from;
        }
        LayoutInflater layoutInflater = this.f4880h;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2722R.layout.item_timeline, viewGroup, false);
            C5956g.m24499d(inflate, "view");
            return new C1431a(this, inflate, i);
        }
        C5956g.m24510o("mLayoutInflater");
        throw null;
    }

    /* renamed from: e */
    public int mo3963e() {
        return this.f4883k.size();
    }

    /* renamed from: g */
    public int mo3965g(int i) {
        return TimelineView.m7054a(i, mo3963e());
    }
}
