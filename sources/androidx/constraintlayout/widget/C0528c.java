package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.C3235h;

/* renamed from: androidx.constraintlayout.widget.c */
public abstract class C0528c extends View {

    /* renamed from: f */
    protected int[] f2129f = new int[32];

    /* renamed from: g */
    protected int f2130g;

    /* renamed from: h */
    protected Context f2131h;

    /* renamed from: i */
    protected C3235h f2132i;

    /* renamed from: j */
    protected boolean f2133j = false;

    /* renamed from: k */
    protected String f2134k;

    /* renamed from: l */
    private HashMap<Integer, String> f2135l = new HashMap<>();

    public C0528c(Context context) {
        super(context);
        this.f2131h = context;
        mo2615g((AttributeSet) null);
    }

    /* renamed from: a */
    private void m2463a(String str) {
        if (str != null && str.length() != 0 && this.f2131h != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int f = m2466f(trim);
            if (f != 0) {
                this.f2135l.put(Integer.valueOf(f), trim);
                m2464b(f);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: b */
    private void m2464b(int i) {
        if (i != getId()) {
            int i2 = this.f2130g + 1;
            int[] iArr = this.f2129f;
            if (i2 > iArr.length) {
                this.f2129f = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2129f;
            int i3 = this.f2130g;
            iArr2[i3] = i;
            this.f2130g = i3 + 1;
        }
    }

    /* renamed from: e */
    private int m2465e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2131h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    private int m2466f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object e = constraintLayout.mo2577e(0, str);
            if (e instanceof Integer) {
                i = ((Integer) e).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m2465e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0543j.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f2131h.getResources().getIdentifier(str, "id", this.f2131h.getPackageName()) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2625c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo2626d((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2626d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f2130g; i++) {
            View g = constraintLayout.mo2579g(this.f2129f[i]);
            if (g != null) {
                g.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    g.setTranslationZ(g.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2615g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0544k.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0544k.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2134k = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2129f, this.f2130g);
    }

    /* renamed from: h */
    public void mo2618h(C3229e eVar, boolean z) {
    }

    /* renamed from: i */
    public void mo2628i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: j */
    public void mo2629j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void mo2630k(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f2135l.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2631l(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f2134k
            r5.setIds(r0)
        L_0x000b:
            f.f.b.k.h r0 = r5.f2132i
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo11380c()
            r0 = 0
        L_0x0014:
            int r1 = r5.f2130g
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f2129f
            r1 = r1[r0]
            android.view.View r2 = r6.mo2579g(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f2135l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m2465e(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f2129f
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f2135l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo2579g(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            f.f.b.k.h r1 = r5.f2132i
            f.f.b.k.e r2 = r6.mo2588h(r2)
            r1.mo11378a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            f.f.b.k.h r0 = r5.f2132i
            f.f.b.k.f r6 = r6.f2019h
            r0.mo11379b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0528c.mo2631l(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: m */
    public void mo2632m() {
        if (this.f2132i != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0521b) {
                ((ConstraintLayout.C0521b) layoutParams).f2086m0 = (C3229e) this.f2132i;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2134k;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2133j) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f2134k = str;
        if (str != null) {
            int i = 0;
            this.f2130g = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2463a(str.substring(i));
                    return;
                } else {
                    m2463a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2134k = null;
        this.f2130g = 0;
        for (int b : iArr) {
            m2464b(b);
        }
    }
}
