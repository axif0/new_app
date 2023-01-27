package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p262r.C5035a;

public class SnackbarContentLayout extends LinearLayout implements C2243a {

    /* renamed from: f */
    private TextView f7392f;

    /* renamed from: g */
    private Button f7393g;

    /* renamed from: h */
    private int f7394h;

    /* renamed from: i */
    private int f7395i;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5006l.SnackbarLayout);
        this.f7394h = obtainStyledAttributes.getDimensionPixelSize(C5006l.SnackbarLayout_android_maxWidth, -1);
        this.f7395i = obtainStyledAttributes.getDimensionPixelSize(C5006l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private static void m10410d(View view, int i, int i2) {
        if (C3403t.m14616Q(view)) {
            C3403t.m14669v0(view, C3403t.m14603D(view), i, C3403t.m14602C(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m10411e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f7392f.getPaddingTop() == i2 && this.f7392f.getPaddingBottom() == i3) {
            return z;
        }
        m10410d(this.f7392f, i2, i3);
        return true;
    }

    /* renamed from: a */
    public void mo8715a(int i, int i2) {
        this.f7392f.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f7392f.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f7393g.getVisibility() == 0) {
            this.f7393g.setAlpha(0.0f);
            this.f7393g.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo8716b(int i, int i2) {
        this.f7392f.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f7392f.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f7393g.getVisibility() == 0) {
            this.f7393g.setAlpha(1.0f);
            this.f7393g.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8717c(float f) {
        if (f != 1.0f) {
            this.f7393g.setTextColor(C5035a.m21308f(C5035a.m21305c(this, C4965b.colorSurface), this.f7393g.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f7393g;
    }

    public TextView getMessageView() {
        return this.f7392f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7392f = (TextView) findViewById(C5000f.snackbar_text);
        this.f7393g = (Button) findViewById(C5000f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m10411e(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m10411e(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f7394h
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f7394h
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p148g.p189d.p190a.p252d.C4998d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p148g.p189d.p190a.p252d.C4998d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f7392f
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f7395i
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f7393g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f7395i
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m10411e(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m10411e(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f7395i = i;
    }
}
