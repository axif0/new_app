package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4962a;
import p148g.p189d.p190a.p252d.p256m.C5014h;
import p148g.p189d.p190a.p252d.p256m.C5016j;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f7703i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: g0 */
    private void m10788g0(View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f7703i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0551f) && (((CoordinatorLayout.C0551f) childAt.getLayoutParams()).mo2770f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f7703i;
                        if (map != null && map.containsKey(childAt)) {
                            i = this.f7703i.get(childAt).intValue();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f7703i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i = 4;
                    }
                    C3403t.m14663s0(childAt, i);
                }
            }
            if (!z) {
                this.f7703i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo9079H(View view, View view2, boolean z, boolean z2) {
        m10788g0(view2, z);
        return super.mo9079H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public FabTransformationBehavior.C2313e mo9083e0(Context context, boolean z) {
        int i = z ? C4962a.mtrl_fab_transformation_sheet_expand_spec : C4962a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C2313e eVar = new FabTransformationBehavior.C2313e();
        eVar.f7697a = C5014h.m21214c(context, i);
        eVar.f7698b = new C5016j(17, 0.0f, 0.0f);
        return eVar;
    }
}
