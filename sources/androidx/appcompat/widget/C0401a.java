package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p086f.p087a.C3123a;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3418x;
import p086f.p111h.p122m.C3422y;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0401a extends ViewGroup {

    /* renamed from: f */
    protected final C0402a f1596f;

    /* renamed from: g */
    protected final Context f1597g;

    /* renamed from: h */
    protected ActionMenuView f1598h;

    /* renamed from: i */
    protected C0408c f1599i;

    /* renamed from: j */
    protected int f1600j;

    /* renamed from: k */
    protected C3418x f1601k;

    /* renamed from: l */
    private boolean f1602l;

    /* renamed from: m */
    private boolean f1603m;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0402a implements C3422y {

        /* renamed from: a */
        private boolean f1604a = false;

        /* renamed from: b */
        int f1605b;

        protected C0402a() {
        }

        /* renamed from: a */
        public void mo1944a(View view) {
            this.f1604a = true;
        }

        /* renamed from: b */
        public void mo928b(View view) {
            if (!this.f1604a) {
                C0401a aVar = C0401a.this;
                aVar.f1601k = null;
                C0401a.super.setVisibility(this.f1605b);
            }
        }

        /* renamed from: c */
        public void mo929c(View view) {
            C0401a.super.setVisibility(0);
            this.f1604a = false;
        }

        /* renamed from: d */
        public C0402a mo1945d(C3418x xVar, int i) {
            C0401a.this.f1601k = xVar;
            this.f1605b = i;
            return this;
        }
    }

    C0401a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0401a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1596f = new C0402a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C3123a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1597g = context;
        } else {
            this.f1597g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    protected static int m1810d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1938c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1939e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C3418x mo1940f(int i, long j) {
        C3418x xVar = this.f1601k;
        if (xVar != null) {
            xVar.mo11731b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C3418x c = C3403t.m14630c(this);
            c.mo11730a(1.0f);
            c.mo11733d(j);
            C0402a aVar = this.f1596f;
            aVar.mo1945d(c, i);
            c.mo11735f(aVar);
            return c;
        }
        C3418x c2 = C3403t.m14630c(this);
        c2.mo11730a(0.0f);
        c2.mo11733d(j);
        C0402a aVar2 = this.f1596f;
        aVar2.mo1945d(c2, i);
        c2.mo11735f(aVar2);
        return c2;
    }

    public int getAnimatedVisibility() {
        return this.f1601k != null ? this.f1596f.f1605b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1600j;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C3132j.ActionBar, C3123a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C3132j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0408c cVar = this.f1599i;
        if (cVar != null) {
            cVar.mo1990I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1603m = false;
        }
        if (!this.f1603m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1603m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1603m = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1602l = false;
        }
        if (!this.f1602l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1602l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1602l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C3418x xVar = this.f1601k;
            if (xVar != null) {
                xVar.mo11731b();
            }
            super.setVisibility(i);
        }
    }
}
