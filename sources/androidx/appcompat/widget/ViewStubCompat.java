package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p086f.p087a.C3132j;

public final class ViewStubCompat extends View {

    /* renamed from: f */
    private int f1591f;

    /* renamed from: g */
    private int f1592g;

    /* renamed from: h */
    private WeakReference<View> f1593h;

    /* renamed from: i */
    private LayoutInflater f1594i;

    /* renamed from: j */
    private C0400a f1595j;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0400a {
        /* renamed from: a */
        void mo1937a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1591f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3132j.ViewStubCompat, i, 0);
        this.f1592g = obtainStyledAttributes.getResourceId(C3132j.ViewStubCompat_android_inflatedId, -1);
        this.f1591f = obtainStyledAttributes.getResourceId(C3132j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C3132j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo1925a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1591f != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1594i;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1591f, viewGroup, false);
            int i = this.f1592g;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1593h = new WeakReference<>(inflate);
            C0400a aVar = this.f1595j;
            if (aVar != null) {
                aVar.mo1937a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1592g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1594i;
    }

    public int getLayoutResource() {
        return this.f1591f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1592g = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1594i = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1591f = i;
    }

    public void setOnInflateListener(C0400a aVar) {
        this.f1595j = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1593h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1925a();
        }
    }
}
