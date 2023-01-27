package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0303j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.material.bottomsheet.b */
public class C2074b extends C0303j {

    /* renamed from: p0 */
    private boolean f6778p0;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    private class C2076b extends BottomSheetBehavior.C2065f {
        private C2076b() {
        }

        /* renamed from: a */
        public void mo7674a(View view, float f) {
        }

        /* renamed from: b */
        public void mo7675b(View view, int i) {
            if (i == 5) {
                C2074b.this.m9501Y1();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m9501Y1() {
        if (this.f6778p0) {
            super.mo3285M1();
        } else {
            super.mo3284L1();
        }
    }

    /* renamed from: Z1 */
    private void m9502Z1(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f6778p0 = z;
        if (bottomSheetBehavior.mo7651X() == 5) {
            m9501Y1();
            return;
        }
        if (mo3286O1() instanceof C2069a) {
            ((C2069a) mo3286O1()).mo7686i();
        }
        bottomSheetBehavior.mo7647M(new C2076b());
        bottomSheetBehavior.mo7665o0(5);
    }

    /* renamed from: a2 */
    private boolean m9503a2(boolean z) {
        Dialog O1 = mo3286O1();
        if (!(O1 instanceof C2069a)) {
            return false;
        }
        C2069a aVar = (C2069a) O1;
        BottomSheetBehavior<FrameLayout> f = aVar.mo7684f();
        if (!f.mo7653a0() || !aVar.mo7685g()) {
            return false;
        }
        m9502Z1(f, z);
        return true;
    }

    /* renamed from: L1 */
    public void mo3284L1() {
        if (!m9503a2(false)) {
            super.mo3284L1();
        }
    }

    /* renamed from: Q1 */
    public Dialog mo542Q1(Bundle bundle) {
        return new C2069a(mo3242y(), mo3287P1());
    }
}
