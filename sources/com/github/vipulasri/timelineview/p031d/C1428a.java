package com.github.vipulasri.timelineview.p031d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.vipulasri.timelineview.TimelineView;
import com.github.vipulasri.timelineview.p031d.p033e.C1436b;
import com.google.android.material.card.MaterialCardView;
import com.karumi.dexter.C2722R;
import java.util.List;
import p048d.p049a.p050a.p051a.C2796a;
import p048d.p049a.p050a.p051a.p071o.p072a.C3036o;
import p351k.p361v.p363d.C5956g;

/* renamed from: com.github.vipulasri.timelineview.d.a */
public final class C1428a extends RecyclerView.C0832g<C1429a> {

    /* renamed from: h */
    private LayoutInflater f4867h;

    /* renamed from: i */
    private final Context f4868i;

    /* renamed from: j */
    private int[] f4869j;

    /* renamed from: k */
    private final List<? extends C3036o> f4870k;

    /* renamed from: l */
    private C1436b f4871l;

    /* renamed from: com.github.vipulasri.timelineview.d.a$a */
    public final class C1429a extends RecyclerView.C0829d0 {

        /* renamed from: A */
        private final TextView f4872A;

        /* renamed from: t */
        private final TimelineView f4873t;

        /* renamed from: u */
        private final TextView f4874u;

        /* renamed from: v */
        private final TextView f4875v;

        /* renamed from: w */
        private final TextView f4876w;

        /* renamed from: x */
        private final MaterialCardView f4877x;

        /* renamed from: y */
        private final TextView f4878y;

        /* renamed from: z */
        private final TextView f4879z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1429a(C1428a aVar, View view, int i) {
            super(view);
            C5956g.m24500e(view, "itemView");
            this.f4873t = (TimelineView) view.findViewById(C2796a.timeline_exam);
            this.f4874u = (TextView) view.findViewById(C2796a.tv_day_name);
            this.f4875v = (TextView) view.findViewById(C2796a.tv_day_of_month);
            this.f4876w = (TextView) view.findViewById(C2796a.tv_month_name);
            this.f4877x = (MaterialCardView) view.findViewById(C2796a.mcv_timeline_exam);
            this.f4878y = (TextView) view.findViewById(C2796a.tv_course_code);
            this.f4879z = (TextView) view.findViewById(C2796a.tv_exam_start_time);
            this.f4872A = (TextView) view.findViewById(C2796a.tv_exam_end_time);
            this.f4873t.mo5954c(i);
        }

        /* renamed from: M */
        public final MaterialCardView mo5989M() {
            return this.f4877x;
        }

        /* renamed from: N */
        public final TimelineView mo5990N() {
            return this.f4873t;
        }

        /* renamed from: O */
        public final TextView mo5991O() {
            return this.f4878y;
        }

        /* renamed from: P */
        public final TextView mo5992P() {
            return this.f4874u;
        }

        /* renamed from: Q */
        public final TextView mo5993Q() {
            return this.f4875v;
        }

        /* renamed from: R */
        public final TextView mo5994R() {
            return this.f4872A;
        }

        /* renamed from: S */
        public final TextView mo5995S() {
            return this.f4879z;
        }

        /* renamed from: T */
        public final TextView mo5996T() {
            return this.f4876w;
        }
    }

    public C1428a(Context context, List<? extends C3036o> list, C1436b bVar) {
        C5956g.m24500e(context, "context");
        C5956g.m24500e(list, "mDataList");
        C5956g.m24500e(bVar, "mAttributes");
        this.f4870k = list;
        this.f4871l = bVar;
        this.f4868i = context;
        int[] intArray = context.getResources().getIntArray(C2722R.array.color_timeline_items);
        C5956g.m24499d(intArray, "this.context.resources.g…ray.color_timeline_items)");
        this.f4869j = intArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018b  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3966q(com.github.vipulasri.timelineview.p031d.C1428a.C1429a r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            p351k.p361v.p363d.C5956g.m24500e(r9, r0)
            java.util.List<? extends d.a.a.a.o.a.o> r0 = r8.f4870k
            java.lang.Object r0 = r0.get(r10)
            d.a.a.a.o.a.o r0 = (p048d.p049a.p050a.p051a.p071o.p072a.C3036o) r0
            d.a.a.a.h.f r1 = r0.mo10568h()
            d.a.a.a.h.f r2 = p048d.p049a.p050a.p051a.p059h.C2883f.INACTIVE
            java.lang.String r3 = "holder.timeline_exam"
            if (r1 != r2) goto L_0x0031
            com.github.vipulasri.timelineview.TimelineView r1 = r9.mo5990N()
            p351k.p361v.p363d.C5956g.m24499d(r1, r3)
            android.content.Context r2 = r8.f4868i
            r3 = 2131230922(0x7f0800ca, float:1.807791E38)
        L_0x0023:
            com.github.vipulasri.timelineview.d.e.b r4 = r8.f4871l
            int r4 = r4.mo6015a()
            android.graphics.drawable.Drawable r2 = p048d.p049a.p050a.p051a.p078s.C3106p.m13343b(r2, r3, r4)
            r1.setMarker(r2)
            goto L_0x005c
        L_0x0031:
            d.a.a.a.h.f r1 = r0.mo10568h()
            d.a.a.a.h.f r2 = p048d.p049a.p050a.p051a.p059h.C2883f.ACTIVE
            if (r1 != r2) goto L_0x0046
            com.github.vipulasri.timelineview.TimelineView r1 = r9.mo5990N()
            p351k.p361v.p363d.C5956g.m24499d(r1, r3)
            android.content.Context r2 = r8.f4868i
            r3 = 2131230921(0x7f0800c9, float:1.8077908E38)
            goto L_0x0023
        L_0x0046:
            com.github.vipulasri.timelineview.TimelineView r1 = r9.mo5990N()
            android.content.Context r2 = r8.f4868i
            r3 = 2131230920(0x7f0800c8, float:1.8077906E38)
            android.graphics.drawable.Drawable r2 = p086f.p111h.p112e.C3267a.m14076f(r2, r3)
            com.github.vipulasri.timelineview.d.e.b r3 = r8.f4871l
            int r3 = r3.mo6015a()
            r1.mo5955f(r2, r3)
        L_0x005c:
            int[] r1 = r8.f4869j
            int r1 = r1.length
            r2 = 0
            if (r10 >= r1) goto L_0x006e
            com.google.android.material.card.MaterialCardView r1 = r9.mo5989M()
            int[] r3 = r8.f4869j
            r10 = r3[r10]
            r1.setCardBackgroundColor((int) r10)
            goto L_0x007e
        L_0x006e:
            com.google.android.material.card.MaterialCardView r10 = r9.mo5989M()
            int[] r1 = r8.f4869j
            int r3 = r1.length
            int r3 = p048d.p049a.p050a.p051a.p078s.C3101n.m13322q(r2, r3)
            r1 = r1[r3]
            r10.setCardBackgroundColor((int) r1)
        L_0x007e:
            java.lang.String r10 = r0.mo10562b()
            java.lang.String r1 = "timeLineModel.dayName"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            boolean r10 = p351k.p352a0.C5838l.m24335a(r10)
            r10 = r10 ^ 1
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            r5 = 3
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.CharSequence"
            if (r10 == 0) goto L_0x00c9
            android.widget.TextView r10 = r9.mo5992P()
            java.lang.String r7 = "holder.tv_day_name"
            p351k.p361v.p363d.C5956g.m24499d(r10, r7)
            java.lang.String r7 = r0.mo10562b()
            p351k.p361v.p363d.C5956g.m24499d(r7, r1)
            if (r7 == 0) goto L_0x00c3
            java.lang.CharSequence r1 = p351k.p352a0.C5839m.m24353s(r7)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r1.substring(r2, r5)
            p351k.p361v.p363d.C5956g.m24499d(r1, r4)
            r10.setText(r1)
            goto L_0x00c9
        L_0x00bd:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r3)
            throw r9
        L_0x00c3:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r6)
            throw r9
        L_0x00c9:
            android.widget.TextView r10 = r9.mo5993Q()
            java.lang.String r1 = "holder.tv_day_of_month"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            int r1 = r0.mo10563c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r10.setText(r1)
            java.lang.String r10 = r0.mo10566f()
            java.lang.String r1 = "timeLineModel.monthName"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            boolean r10 = p351k.p352a0.C5838l.m24335a(r10)
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x0121
            android.widget.TextView r10 = r9.mo5996T()
            java.lang.String r7 = "holder.tv_month_name"
            p351k.p361v.p363d.C5956g.m24499d(r10, r7)
            java.lang.String r7 = r0.mo10566f()
            p351k.p361v.p363d.C5956g.m24499d(r7, r1)
            if (r7 == 0) goto L_0x011b
            java.lang.CharSequence r1 = p351k.p352a0.C5839m.m24353s(r7)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0115
            java.lang.String r1 = r1.substring(r2, r5)
            p351k.p361v.p363d.C5956g.m24499d(r1, r4)
            r10.setText(r1)
            goto L_0x0121
        L_0x0115:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r3)
            throw r9
        L_0x011b:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r6)
            throw r9
        L_0x0121:
            android.widget.TextView r10 = r9.mo5991O()
            java.lang.String r1 = "holder.tv_course_code"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            java.lang.String r1 = r0.mo10561a()
            java.lang.String r2 = "timeLineModel.courseCode"
            p351k.p361v.p363d.C5956g.m24499d(r1, r2)
            if (r1 == 0) goto L_0x018b
            java.lang.CharSequence r1 = p351k.p352a0.C5839m.m24353s(r1)
            java.lang.String r1 = r1.toString()
            r10.setText(r1)
            android.widget.TextView r10 = r9.mo5995S()
            java.lang.String r1 = "holder.tv_exam_start_time"
            p351k.p361v.p363d.C5956g.m24499d(r10, r1)
            java.lang.String r1 = r0.mo10567g()
            java.lang.String r2 = "timeLineModel.startTime"
            p351k.p361v.p363d.C5956g.m24499d(r1, r2)
            if (r1 == 0) goto L_0x0185
            java.lang.CharSequence r1 = p351k.p352a0.C5839m.m24353s(r1)
            java.lang.String r1 = r1.toString()
            r10.setText(r1)
            android.widget.TextView r9 = r9.mo5994R()
            java.lang.String r10 = "holder.tv_exam_end_time"
            p351k.p361v.p363d.C5956g.m24499d(r9, r10)
            java.lang.String r10 = r0.mo10564d()
            java.lang.String r0 = "timeLineModel.endTime"
            p351k.p361v.p363d.C5956g.m24499d(r10, r0)
            if (r10 == 0) goto L_0x017f
            java.lang.CharSequence r10 = p351k.p352a0.C5839m.m24353s(r10)
            java.lang.String r10 = r10.toString()
            r9.setText(r10)
            return
        L_0x017f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r6)
            throw r9
        L_0x0185:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r6)
            throw r9
        L_0x018b:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r6)
            goto L_0x0192
        L_0x0191:
            throw r9
        L_0x0192:
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.vipulasri.timelineview.p031d.C1428a.mo3966q(com.github.vipulasri.timelineview.d.a$a, int):void");
    }

    /* renamed from: C */
    public C1429a mo3967s(ViewGroup viewGroup, int i) {
        C5956g.m24500e(viewGroup, "parent");
        if (this.f4867h == null) {
            LayoutInflater from = LayoutInflater.from(this.f4868i);
            C5956g.m24499d(from, "LayoutInflater.from(context)");
            this.f4867h = from;
        }
        LayoutInflater layoutInflater = this.f4867h;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2722R.layout.item_timeline_exam, viewGroup, false);
            C5956g.m24499d(inflate, "view");
            return new C1429a(this, inflate, i);
        }
        C5956g.m24510o("mLayoutInflater");
        throw null;
    }

    /* renamed from: e */
    public int mo3963e() {
        return this.f4870k.size();
    }

    /* renamed from: g */
    public int mo3965g(int i) {
        return TimelineView.m7054a(i, mo3963e());
    }
}
