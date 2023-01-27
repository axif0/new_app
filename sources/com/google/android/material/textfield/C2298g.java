package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0419d;
import androidx.appcompat.widget.C0434h0;
import com.google.android.material.internal.C2177f;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;

/* renamed from: com.google.android.material.textfield.g */
public class C2298g extends C0419d {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0434h0 f7664i;

    /* renamed from: j */
    private final AccessibilityManager f7665j;

    /* renamed from: k */
    private final Rect f7666k;

    /* renamed from: com.google.android.material.textfield.g$a */
    class C2299a implements AdapterView.OnItemClickListener {
        C2299a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C2298g gVar = C2298g.this;
            C2298g.this.m10728e(i < 0 ? gVar.f7664i.mo2148v() : gVar.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = C2298g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C2298g.this.f7664i.mo2151y();
                    i = C2298g.this.f7664i.mo2150x();
                    j = C2298g.this.f7664i.mo2149w();
                }
                onItemClickListener.onItemClick(C2298g.this.f7664i.mo1155i(), view, i, j);
            }
            C2298g.this.f7664i.dismiss();
        }
    }

    public C2298g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.autoCompleteTextViewStyle);
    }

    public C2298g(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, 0), attributeSet, i);
        this.f7666k = new Rect();
        Context context2 = getContext();
        TypedArray h = C2205o.m10305h(context2, attributeSet, C5006l.MaterialAutoCompleteTextView, i, C5005k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (h.hasValue(C5006l.MaterialAutoCompleteTextView_android_inputType) && h.getInt(C5006l.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f7665j = (AccessibilityManager) context2.getSystemService("accessibility");
        C0434h0 h0Var = new C0434h0(context2);
        this.f7664i = h0Var;
        h0Var.mo2131J(true);
        this.f7664i.mo2125D(this);
        this.f7664i.mo2130I(2);
        this.f7664i.mo2144p(getAdapter());
        this.f7664i.mo2133L(new C2299a());
        h.recycle();
    }

    /* renamed from: c */
    private TextInputLayout m10726c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m10727d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = m10726c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f7664i.mo2150x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable g = this.f7664i.mo2140g();
        if (g != null) {
            g.getPadding(this.f7666k);
            Rect rect = this.f7666k;
            i2 += rect.left + rect.right;
        }
        return i2 + c.getEndIconView().getMeasuredWidth();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m10728e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter((ListAdapter) null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public CharSequence getHint() {
        TextInputLayout c = m10726c();
        return (c == null || !c.mo8853N()) ? super.getHint() : c.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = m10726c();
        if (c != null && c.mo8853N() && super.getHint() == null && C2177f.m10204a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m10727d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f7664i.mo2144p(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f7665j) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f7664i.mo1149a();
        }
    }
}
