package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3399p;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;

/* renamed from: com.google.android.material.internal.k */
public class C2195k extends FrameLayout {

    /* renamed from: f */
    Drawable f7278f;

    /* renamed from: g */
    Rect f7279g;

    /* renamed from: h */
    private Rect f7280h;

    /* renamed from: i */
    private boolean f7281i;

    /* renamed from: j */
    private boolean f7282j;

    /* renamed from: com.google.android.material.internal.k$a */
    class C2196a implements C3399p {
        C2196a() {
        }

        /* renamed from: a */
        public C3356b0 mo923a(View view, C3356b0 b0Var) {
            C2195k kVar = C2195k.this;
            if (kVar.f7279g == null) {
                kVar.f7279g = new Rect();
            }
            C2195k.this.f7279g.set(b0Var.mo11563f(), b0Var.mo11565h(), b0Var.mo11564g(), b0Var.mo11561e());
            C2195k.this.mo8586a(b0Var);
            C2195k.this.setWillNotDraw(!b0Var.mo11568j() || C2195k.this.f7278f == null);
            C3403t.m14625Z(C2195k.this);
            return b0Var.mo11559c();
        }
    }

    public C2195k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2195k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7280h = new Rect();
        this.f7281i = true;
        this.f7282j = true;
        TypedArray h = C2205o.m10305h(context, attributeSet, C5006l.ScrimInsetsFrameLayout, i, C5005k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f7278f = h.getDrawable(C5006l.ScrimInsetsFrameLayout_insetForeground);
        h.recycle();
        setWillNotDraw(true);
        C3403t.m14667u0(this, new C2196a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8586a(C3356b0 b0Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f7279g != null && this.f7278f != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f7281i) {
                this.f7280h.set(0, 0, width, this.f7279g.top);
                this.f7278f.setBounds(this.f7280h);
                this.f7278f.draw(canvas);
            }
            if (this.f7282j) {
                this.f7280h.set(0, height - this.f7279g.bottom, width, height);
                this.f7278f.setBounds(this.f7280h);
                this.f7278f.draw(canvas);
            }
            Rect rect = this.f7280h;
            Rect rect2 = this.f7279g;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f7278f.setBounds(this.f7280h);
            this.f7278f.draw(canvas);
            Rect rect3 = this.f7280h;
            Rect rect4 = this.f7279g;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f7278f.setBounds(this.f7280h);
            this.f7278f.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f7278f;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f7278f;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f7282j = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f7281i = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f7278f = drawable;
    }
}
