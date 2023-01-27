package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.C2175d;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;

public class ChipGroup extends C2175d {

    /* renamed from: s */
    private static final int f6868s = C5005k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: j */
    private int f6869j;

    /* renamed from: k */
    private int f6870k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f6871l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6872m;

    /* renamed from: n */
    private C2091d f6873n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C2089b f6874o;

    /* renamed from: p */
    private C2092e f6875p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f6876q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f6877r;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C2089b implements CompoundButton.OnCheckedChangeListener {
        private C2089b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f6877r) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f6872m) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f6876q == -1 || ChipGroup.this.f6876q == id || !ChipGroup.this.f6871l)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m9654q(chipGroup.f6876q, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f6876q == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.m9654q(compoundButton.getId(), true);
                    ChipGroup.this.m9653p(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C2090c extends ViewGroup.MarginLayoutParams {
        public C2090c(int i, int i2) {
            super(i, i2);
        }

        public C2090c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2090c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C2091d {
        /* renamed from: a */
        void mo8036a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C2092e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ViewGroup.OnHierarchyChangeListener f6879f;

        private C2092e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f6874o);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6879f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6879f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f6868s), attributeSet, i);
        this.f6874o = new C2089b();
        this.f6875p = new C2092e();
        this.f6876q = -1;
        this.f6877r = false;
        TypedArray h = C2205o.m10305h(getContext(), attributeSet, C5006l.ChipGroup, i, f6868s, new int[0]);
        int dimensionPixelOffset = h.getDimensionPixelOffset(C5006l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(h.getDimensionPixelOffset(C5006l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(h.getDimensionPixelOffset(C5006l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(h.getBoolean(C5006l.ChipGroup_singleLine, false));
        setSingleSelection(h.getBoolean(C5006l.ChipGroup_singleSelection, false));
        setSelectionRequired(h.getBoolean(C5006l.ChipGroup_selectionRequired, false));
        int resourceId = h.getResourceId(C5006l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f6876q = resourceId;
        }
        h.recycle();
        super.setOnHierarchyChangeListener(this.f6875p);
        C3403t.m14663s0(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m9653p(int i, boolean z) {
        this.f6876q = i;
        C2091d dVar = this.f6873n;
        if (dVar != null && this.f6871l && z) {
            dVar.mo8036a(this, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m9654q(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f6877r = true;
            ((Chip) findViewById).setChecked(z);
            this.f6877r = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        m9653p(i, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f6876q;
                if (i2 != -1 && this.f6871l) {
                    m9654q(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public boolean mo8003c() {
        return super.mo8003c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2090c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2090c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2090c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2090c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f6871l) {
            return this.f6876q;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f6871l) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f6869j;
    }

    public int getChipSpacingVertical() {
        return this.f6870k;
    }

    /* renamed from: m */
    public void mo8012m() {
        this.f6877r = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f6877r = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo8013n(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public boolean mo8014o() {
        return this.f6871l;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f6876q;
        if (i != -1) {
            m9654q(i, true);
            setCheckedId(this.f6876q);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3369c.m14440D0(accessibilityNodeInfo).mo11625d0(C3369c.C3371b.m14526b(getRowCount(), mo8003c() ? getChipCount() : -1, false, mo8014o() ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f6869j != i) {
            this.f6869j = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f6870k != i) {
            this.f6870k = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C2091d dVar) {
        this.f6873n = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f6875p.f6879f = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f6872m = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f6871l != z) {
            this.f6871l = z;
            mo8012m();
        }
    }
}
