package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: com.google.android.material.datepicker.m */
class C2130m extends BaseAdapter {

    /* renamed from: j */
    static final int f7046j = C2139s.m9957l().getMaximum(4);

    /* renamed from: f */
    final C2128l f7047f;

    /* renamed from: g */
    final C2102d<?> f7048g;

    /* renamed from: h */
    C2101c f7049h;

    /* renamed from: i */
    final C2096a f7050i;

    C2130m(C2128l lVar, C2102d<?> dVar, C2096a aVar) {
        this.f7047f = lVar;
        this.f7048g = dVar;
        this.f7050i = aVar;
    }

    /* renamed from: e */
    private void m9918e(Context context) {
        if (this.f7049h == null) {
            this.f7049h = new C2101c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8248a(int i) {
        return mo8249b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8249b() {
        return this.f7047f.mo8237j();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f7047f.mo8237j() || i > mo8258h()) {
            return null;
        }
        return Long.valueOf(this.f7047f.mo8238k(mo8260i(i)));
    }

    /* JADX WARNING: type inference failed for: r7v20, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m9918e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p148g.p189d.p190a.p252d.C5002h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo8249b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x005e
            com.google.android.material.datepicker.l r2 = r5.f7047f
            int r3 = r2.f7044k
            if (r7 < r3) goto L_0x002e
            goto L_0x005e
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f7047f
            long r2 = r2.mo8238k(r7)
            com.google.android.material.datepicker.l r7 = r5.f7047f
            int r7 = r7.f7042i
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C2128l.m9908i()
            int r4 = r4.f7042i
            if (r7 != r4) goto L_0x0050
            java.lang.String r7 = com.google.android.material.datepicker.C2103e.m9832a(r2)
            goto L_0x0054
        L_0x0050:
            java.lang.String r7 = com.google.android.material.datepicker.C2103e.m9834c(r2)
        L_0x0054:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0066
        L_0x005e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0066:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x006d
            return r0
        L_0x006d:
            com.google.android.material.datepicker.a r7 = r5.f7050i
            com.google.android.material.datepicker.a$c r7 = r7.mo8173f()
            long r2 = r6.longValue()
            boolean r7 = r7.mo8187u(r2)
            if (r7 == 0) goto L_0x00cc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f7048g
            java.util.Collection r7 = r7.mo8191D()
            java.util.Iterator r7 = r7.iterator()
        L_0x008a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C2139s.m9946a(r3)
            long r1 = com.google.android.material.datepicker.C2139s.m9946a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008a
            com.google.android.material.datepicker.c r6 = r5.f7049h
            com.google.android.material.datepicker.b r6 = r6.f6966b
        L_0x00ae:
            r6.mo8190d(r0)
            return r0
        L_0x00b2:
            java.util.Calendar r7 = com.google.android.material.datepicker.C2139s.m9955j()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00c7
            com.google.android.material.datepicker.c r6 = r5.f7049h
            com.google.android.material.datepicker.b r6 = r6.f6967c
            goto L_0x00ae
        L_0x00c7:
            com.google.android.material.datepicker.c r6 = r5.f7049h
            com.google.android.material.datepicker.b r6 = r6.f6965a
            goto L_0x00ae
        L_0x00cc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f7049h
            com.google.android.material.datepicker.b r6 = r6.f6971g
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C2130m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo8252f(int i) {
        return i % this.f7047f.f7043j == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo8253g(int i) {
        return (i + 1) % this.f7047f.f7043j == 0;
    }

    public int getCount() {
        return this.f7047f.f7044k + mo8249b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f7047f.f7043j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8258h() {
        return (this.f7047f.mo8237j() + this.f7047f.f7044k) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo8260i(int i) {
        return (i - this.f7047f.mo8237j()) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo8261j(int i) {
        return i >= mo8249b() && i <= mo8258h();
    }
}
