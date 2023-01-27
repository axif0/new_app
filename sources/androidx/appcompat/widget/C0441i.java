package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0448k0;
import p086f.p087a.C3123a;
import p086f.p087a.C3125c;
import p086f.p087a.C3127e;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p114f.C3287a;

/* renamed from: androidx.appcompat.widget.i */
public final class C0441i {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f1745b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0441i f1746c;

    /* renamed from: a */
    private C0448k0 f1747a;

    /* renamed from: androidx.appcompat.widget.i$a */
    class C0442a implements C0448k0.C0453e {

        /* renamed from: a */
        private final int[] f1748a = {C3127e.abc_textfield_search_default_mtrl_alpha, C3127e.abc_textfield_default_mtrl_alpha, C3127e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1749b = {C3127e.abc_ic_commit_search_api_mtrl_alpha, C3127e.abc_seekbar_tick_mark_material, C3127e.abc_ic_menu_share_mtrl_alpha, C3127e.abc_ic_menu_copy_mtrl_am_alpha, C3127e.abc_ic_menu_cut_mtrl_alpha, C3127e.abc_ic_menu_selectall_mtrl_alpha, C3127e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1750c = {C3127e.abc_textfield_activated_mtrl_alpha, C3127e.abc_textfield_search_activated_mtrl_alpha, C3127e.abc_cab_background_top_mtrl_alpha, C3127e.abc_text_cursor_material, C3127e.abc_text_select_handle_left_mtrl_dark, C3127e.abc_text_select_handle_middle_mtrl_dark, C3127e.abc_text_select_handle_right_mtrl_dark, C3127e.abc_text_select_handle_left_mtrl_light, C3127e.abc_text_select_handle_middle_mtrl_light, C3127e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f1751d = {C3127e.abc_popup_background_mtrl_mult, C3127e.abc_cab_background_internal_bg, C3127e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1752e = {C3127e.abc_tab_indicator_material, C3127e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1753f = {C3127e.abc_btn_check_material, C3127e.abc_btn_radio_material, C3127e.abc_btn_check_material_anim, C3127e.abc_btn_radio_material_anim};

        C0442a() {
        }

        /* renamed from: f */
        private boolean m2017f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m2018g(Context context) {
            return m2019h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m2019h(Context context, int i) {
            int c = C0469p0.m2128c(context, C3123a.colorControlHighlight);
            int b = C0469p0.m2127b(context, C3123a.colorButtonNormal);
            return new ColorStateList(new int[][]{C0469p0.f1834b, C0469p0.f1836d, C0469p0.f1835c, C0469p0.f1838f}, new int[]{b, C3287a.m14160b(c, i), C3287a.m14160b(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m2020i(Context context) {
            return m2019h(context, C0469p0.m2128c(context, C3123a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m2021j(Context context) {
            return m2019h(context, C0469p0.m2128c(context, C3123a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m2022k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e = C0469p0.m2130e(context, C3123a.colorSwitchThumbNormal);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0469p0.f1834b;
                iArr2[0] = C0469p0.m2127b(context, C3123a.colorSwitchThumbNormal);
                iArr[1] = C0469p0.f1837e;
                iArr2[1] = C0469p0.m2128c(context, C3123a.colorControlActivated);
                iArr[2] = C0469p0.f1838f;
                iArr2[2] = C0469p0.m2128c(context, C3123a.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0469p0.f1834b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = C0469p0.f1837e;
                iArr2[1] = C0469p0.m2128c(context, C3123a.colorControlActivated);
                iArr[2] = C0469p0.f1838f;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private void m2023l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0418c0.m1901a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0441i.f1745b;
            }
            drawable.setColorFilter(C0441i.m2010e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2166a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0441i.f1745b
                int[] r1 = r6.f1748a
                boolean r1 = r6.m2017f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p086f.p087a.C3123a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1750c
                boolean r1 = r6.m2017f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p086f.p087a.C3123a.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1751d
                boolean r1 = r6.m2017f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p086f.p087a.C3127e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p086f.p087a.C3127e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0418c0.m1901a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0469p0.m2128c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0441i.m2010e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0441i.C0442a.mo2166a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public PorterDuff.Mode mo2167b(int i) {
            if (i == C3127e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo2168c(C0448k0 k0Var, Context context, int i) {
            if (i != C3127e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{k0Var.mo2186j(context, C3127e.abc_cab_background_internal_bg), k0Var.mo2186j(context, C3127e.abc_cab_background_top_mtrl_alpha)});
        }

        /* renamed from: d */
        public ColorStateList mo2169d(Context context, int i) {
            if (i == C3127e.abc_edit_text_material) {
                return C3133a.m13387c(context, C3125c.abc_tint_edittext);
            }
            if (i == C3127e.abc_switch_track_mtrl_alpha) {
                return C3133a.m13387c(context, C3125c.abc_tint_switch_track);
            }
            if (i == C3127e.abc_switch_thumb_material) {
                return m2022k(context);
            }
            if (i == C3127e.abc_btn_default_mtrl_shape) {
                return m2021j(context);
            }
            if (i == C3127e.abc_btn_borderless_material) {
                return m2018g(context);
            }
            if (i == C3127e.abc_btn_colored_material) {
                return m2020i(context);
            }
            if (i == C3127e.abc_spinner_mtrl_am_alpha || i == C3127e.abc_spinner_textfield_background_material) {
                return C3133a.m13387c(context, C3125c.abc_tint_spinner);
            }
            if (m2017f(this.f1749b, i)) {
                return C0469p0.m2130e(context, C3123a.colorControlNormal);
            }
            if (m2017f(this.f1752e, i)) {
                return C3133a.m13387c(context, C3125c.abc_tint_default);
            }
            if (m2017f(this.f1753f, i)) {
                return C3133a.m13387c(context, C3125c.abc_tint_btn_checkable);
            }
            if (i == C3127e.abc_seekbar_thumb_material) {
                return C3133a.m13387c(context, C3125c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2170e(Context context, int i, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i2;
            if (i == C3127e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                m2023l(layerDrawable.findDrawableByLayerId(16908288), C0469p0.m2128c(context, C3123a.colorControlNormal), C0441i.f1745b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C3123a.colorControlNormal;
            } else if (i != C3127e.abc_ratingbar_material && i != C3127e.abc_ratingbar_indicator_material && i != C3127e.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                m2023l(layerDrawable.findDrawableByLayerId(16908288), C0469p0.m2127b(context, C3123a.colorControlNormal), C0441i.f1745b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C3123a.colorControlActivated;
            }
            m2023l(findDrawableByLayerId, C0469p0.m2128c(context, i2), C0441i.f1745b);
            m2023l(layerDrawable.findDrawableByLayerId(16908301), C0469p0.m2128c(context, C3123a.colorControlActivated), C0441i.f1745b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0441i m2009b() {
        C0441i iVar;
        synchronized (C0441i.class) {
            if (f1746c == null) {
                m2011h();
            }
            iVar = f1746c;
        }
        return iVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m2010e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0441i.class) {
            l = C0448k0.m2048l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m2011h() {
        synchronized (C0441i.class) {
            if (f1746c == null) {
                C0441i iVar = new C0441i();
                f1746c = iVar;
                iVar.f1747a = C0448k0.m2046h();
                f1746c.f1747a.mo2192u(new C0442a());
            }
        }
    }

    /* renamed from: i */
    static void m2012i(Drawable drawable, C0475s0 s0Var, int[] iArr) {
        C0448k0.m2054w(drawable, s0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo2162c(Context context, int i) {
        return this.f1747a.mo2186j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo2163d(Context context, int i, boolean z) {
        return this.f1747a.mo2187k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo2164f(Context context, int i) {
        return this.f1747a.mo2188m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo2165g(Context context) {
        this.f1747a.mo2190s(context);
    }
}
