package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.widget.C0431g0;
import p086f.p087a.C3123a;
import p086f.p087a.p094o.C3154a;

/* renamed from: androidx.appcompat.widget.n0 */
public class C0460n0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    Runnable f1790f;

    /* renamed from: g */
    private C0463c f1791g;

    /* renamed from: h */
    C0431g0 f1792h;

    /* renamed from: i */
    private Spinner f1793i;

    /* renamed from: j */
    private boolean f1794j;

    /* renamed from: k */
    int f1795k;

    /* renamed from: l */
    int f1796l;

    /* renamed from: m */
    private int f1797m;

    /* renamed from: n */
    private int f1798n;

    /* renamed from: androidx.appcompat.widget.n0$a */
    class C0461a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1799f;

        C0461a(View view) {
            this.f1799f = view;
        }

        public void run() {
            C0460n0.this.smoothScrollTo(this.f1799f.getLeft() - ((C0460n0.this.getWidth() - this.f1799f.getWidth()) / 2), 0);
            C0460n0.this.f1790f = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$b */
    private class C0462b extends BaseAdapter {
        C0462b() {
        }

        public int getCount() {
            return C0460n0.this.f1792h.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0464d) C0460n0.this.f1792h.getChildAt(i)).mo2290b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0460n0.this.mo2273c((C0259a.C0262c) getItem(i), true);
            }
            ((C0464d) view).mo2289a((C0259a.C0262c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$c */
    private class C0463c implements View.OnClickListener {
        C0463c() {
        }

        public void onClick(View view) {
            ((C0464d) view).mo2290b().mo794e();
            int childCount = C0460n0.this.f1792h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0460n0.this.f1792h.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$d */
    private class C0464d extends LinearLayout {

        /* renamed from: f */
        private final int[] f1803f;

        /* renamed from: g */
        private C0259a.C0262c f1804g;

        /* renamed from: h */
        private TextView f1805h;

        /* renamed from: i */
        private ImageView f1806i;

        /* renamed from: j */
        private View f1807j;

        public C0464d(Context context, C0259a.C0262c cVar, boolean z) {
            super(context, (AttributeSet) null, C3123a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f1803f = iArr;
            this.f1804g = cVar;
            C0479u0 v = C0479u0.m2148v(context, (AttributeSet) null, iArr, C3123a.actionBarTabStyle, 0);
            if (v.mo2361s(0)) {
                setBackgroundDrawable(v.mo2349g(0));
            }
            v.mo2362w();
            if (z) {
                setGravity(8388627);
            }
            mo2291c();
        }

        /* renamed from: a */
        public void mo2289a(C0259a.C0262c cVar) {
            this.f1804g = cVar;
            mo2291c();
        }

        /* renamed from: b */
        public C0259a.C0262c mo2290b() {
            return this.f1804g;
        }

        /* renamed from: c */
        public void mo2291c() {
            C0259a.C0262c cVar = this.f1804g;
            View b = cVar.mo791b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1807j = b;
                TextView textView = this.f1805h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1806i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1806i.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1807j;
            if (view != null) {
                removeView(view);
                this.f1807j = null;
            }
            Drawable c = cVar.mo792c();
            CharSequence d = cVar.mo793d();
            if (c != null) {
                if (this.f1806i == null) {
                    C0459n nVar = new C0459n(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    nVar.setLayoutParams(layoutParams);
                    addView(nVar, 0);
                    this.f1806i = nVar;
                }
                this.f1806i.setImageDrawable(c);
                this.f1806i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1806i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1806i.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1805h == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C3123a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1805h = appCompatTextView;
                }
                this.f1805h.setText(d);
                this.f1805h.setVisibility(0);
            } else {
                TextView textView2 = this.f1805h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1805h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1806i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo790a());
            }
            if (!z) {
                charSequence = cVar.mo790a();
            }
            C0496w0.m2250a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0460n0.this.f1795k > 0 && getMeasuredWidth() > (i3 = C0460n0.this.f1795k)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: b */
    private Spinner m2092b() {
        C0480v vVar = new C0480v(getContext(), (AttributeSet) null, C3123a.actionDropDownStyle);
        vVar.setLayoutParams(new C0431g0.C0432a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    /* renamed from: d */
    private boolean m2093d() {
        Spinner spinner = this.f1793i;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m2094e() {
        if (!m2093d()) {
            if (this.f1793i == null) {
                this.f1793i = m2092b();
            }
            removeView(this.f1792h);
            addView(this.f1793i, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1793i.getAdapter() == null) {
                this.f1793i.setAdapter(new C0462b());
            }
            Runnable runnable = this.f1790f;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1790f = null;
            }
            this.f1793i.setSelection(this.f1798n);
        }
    }

    /* renamed from: f */
    private boolean m2095f() {
        if (!m2093d()) {
            return false;
        }
        removeView(this.f1793i);
        addView(this.f1792h, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1793i.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo2272a(int i) {
        View childAt = this.f1792h.getChildAt(i);
        Runnable runnable = this.f1790f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0461a aVar = new C0461a(childAt);
        this.f1790f = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0464d mo2273c(C0259a.C0262c cVar, boolean z) {
        C0464d dVar = new C0464d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1797m));
        } else {
            dVar.setFocusable(true);
            if (this.f1791g == null) {
                this.f1791g = new C0463c();
            }
            dVar.setOnClickListener(this.f1791g);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1790f;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3154a b = C3154a.m13480b(getContext());
        setContentHeight(b.mo10906f());
        this.f1796l = b.mo10905e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1790f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0464d) view).mo2290b().mo794e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1792h.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1795k = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1795k = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1795k, this.f1796l);
        }
        this.f1795k = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1797m, 1073741824);
        if (z2 || !this.f1794j) {
            z = false;
        }
        if (z) {
            this.f1792h.measure(0, makeMeasureSpec);
            if (this.f1792h.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m2094e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1798n);
                    return;
                }
            }
        }
        m2095f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1794j = z;
    }

    public void setContentHeight(int i) {
        this.f1797m = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1798n = i;
        int childCount = this.f1792h.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1792h.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2272a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1793i;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
