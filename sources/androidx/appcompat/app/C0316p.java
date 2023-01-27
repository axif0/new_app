package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0406b0;
import androidx.appcompat.widget.C0460n0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p086f.p087a.C3123a;
import p086f.p087a.C3128f;
import p086f.p087a.C3132j;
import p086f.p087a.p094o.C3154a;
import p086f.p087a.p094o.C3155b;
import p086f.p087a.p094o.C3162g;
import p086f.p087a.p094o.C3165h;
import p086f.p111h.p122m.C3352a0;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3418x;
import p086f.p111h.p122m.C3422y;
import p086f.p111h.p122m.C3423z;

/* renamed from: androidx.appcompat.app.p */
public class C0316p extends C0259a implements ActionBarOverlayLayout.C0365d {

    /* renamed from: C */
    private static final Interpolator f1056C = new AccelerateInterpolator();

    /* renamed from: D */
    private static final Interpolator f1057D = new DecelerateInterpolator();

    /* renamed from: A */
    final C3422y f1058A = new C0318b();

    /* renamed from: B */
    final C3352a0 f1059B = new C0319c();

    /* renamed from: a */
    Context f1060a;

    /* renamed from: b */
    private Context f1061b;

    /* renamed from: c */
    private Activity f1062c;

    /* renamed from: d */
    ActionBarOverlayLayout f1063d;

    /* renamed from: e */
    ActionBarContainer f1064e;

    /* renamed from: f */
    C0406b0 f1065f;

    /* renamed from: g */
    ActionBarContextView f1066g;

    /* renamed from: h */
    View f1067h;

    /* renamed from: i */
    C0460n0 f1068i;

    /* renamed from: j */
    private boolean f1069j;

    /* renamed from: k */
    C0320d f1070k;

    /* renamed from: l */
    C3155b f1071l;

    /* renamed from: m */
    C3155b.C3156a f1072m;

    /* renamed from: n */
    private boolean f1073n;

    /* renamed from: o */
    private ArrayList<C0259a.C0261b> f1074o = new ArrayList<>();

    /* renamed from: p */
    private boolean f1075p;

    /* renamed from: q */
    private int f1076q = 0;

    /* renamed from: r */
    boolean f1077r = true;

    /* renamed from: s */
    boolean f1078s;

    /* renamed from: t */
    boolean f1079t;

    /* renamed from: u */
    private boolean f1080u;

    /* renamed from: v */
    private boolean f1081v = true;

    /* renamed from: w */
    C3165h f1082w;

    /* renamed from: x */
    private boolean f1083x;

    /* renamed from: y */
    boolean f1084y;

    /* renamed from: z */
    final C3422y f1085z = new C0317a();

    /* renamed from: androidx.appcompat.app.p$a */
    class C0317a extends C3423z {
        C0317a() {
        }

        /* renamed from: b */
        public void mo928b(View view) {
            View view2;
            C0316p pVar = C0316p.this;
            if (pVar.f1077r && (view2 = pVar.f1067h) != null) {
                view2.setTranslationY(0.0f);
                C0316p.this.f1064e.setTranslationY(0.0f);
            }
            C0316p.this.f1064e.setVisibility(8);
            C0316p.this.f1064e.setTransitioning(false);
            C0316p pVar2 = C0316p.this;
            pVar2.f1082w = null;
            pVar2.mo1000B();
            ActionBarOverlayLayout actionBarOverlayLayout = C0316p.this.f1063d;
            if (actionBarOverlayLayout != null) {
                C3403t.m14637f0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.p$b */
    class C0318b extends C3423z {
        C0318b() {
        }

        /* renamed from: b */
        public void mo928b(View view) {
            C0316p pVar = C0316p.this;
            pVar.f1082w = null;
            pVar.f1064e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.p$c */
    class C0319c implements C3352a0 {
        C0319c() {
        }

        /* renamed from: a */
        public void mo1015a(View view) {
            ((View) C0316p.this.f1064e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.p$d */
    public class C0320d extends C3155b implements C0335g.C0336a {

        /* renamed from: h */
        private final Context f1089h;

        /* renamed from: i */
        private final C0335g f1090i;

        /* renamed from: j */
        private C3155b.C3156a f1091j;

        /* renamed from: k */
        private WeakReference<View> f1092k;

        public C0320d(Context context, C3155b.C3156a aVar) {
            this.f1089h = context;
            this.f1091j = aVar;
            C0335g gVar = new C0335g(context);
            gVar.mo1215W(1);
            this.f1090i = gVar;
            gVar.mo1214V(this);
        }

        /* renamed from: a */
        public boolean mo904a(C0335g gVar, MenuItem menuItem) {
            C3155b.C3156a aVar = this.f1091j;
            if (aVar != null) {
                return aVar.mo934c(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo906b(C0335g gVar) {
            if (this.f1091j != null) {
                mo1022k();
                C0316p.this.f1066g.mo1496l();
            }
        }

        /* renamed from: c */
        public void mo1016c() {
            C0316p pVar = C0316p.this;
            if (pVar.f1070k == this) {
                if (!C0316p.m1264A(pVar.f1078s, pVar.f1079t, false)) {
                    C0316p pVar2 = C0316p.this;
                    pVar2.f1071l = this;
                    pVar2.f1072m = this.f1091j;
                } else {
                    this.f1091j.mo933b(this);
                }
                this.f1091j = null;
                C0316p.this.mo1014z(false);
                C0316p.this.f1066g.mo1486g();
                C0316p.this.f1065f.mo1965m().sendAccessibilityEvent(32);
                C0316p pVar3 = C0316p.this;
                pVar3.f1063d.setHideOnContentScrollEnabled(pVar3.f1084y);
                C0316p.this.f1070k = null;
            }
        }

        /* renamed from: d */
        public View mo1017d() {
            WeakReference<View> weakReference = this.f1092k;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo1018e() {
            return this.f1090i;
        }

        /* renamed from: f */
        public MenuInflater mo1019f() {
            return new C3162g(this.f1089h);
        }

        /* renamed from: g */
        public CharSequence mo1020g() {
            return C0316p.this.f1066g.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo1021i() {
            return C0316p.this.f1066g.getTitle();
        }

        /* renamed from: k */
        public void mo1022k() {
            if (C0316p.this.f1070k == this) {
                this.f1090i.mo1245h0();
                try {
                    this.f1091j.mo932a(this, this.f1090i);
                } finally {
                    this.f1090i.mo1242g0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo1023l() {
            return C0316p.this.f1066g.mo1494j();
        }

        /* renamed from: m */
        public void mo1024m(View view) {
            C0316p.this.f1066g.setCustomView(view);
            this.f1092k = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo1025n(int i) {
            mo1026o(C0316p.this.f1060a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo1026o(CharSequence charSequence) {
            C0316p.this.f1066g.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo1027q(int i) {
            mo1028r(C0316p.this.f1060a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo1028r(CharSequence charSequence) {
            C0316p.this.f1066g.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo1029s(boolean z) {
            super.mo1029s(z);
            C0316p.this.f1066g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo1030t() {
            this.f1090i.mo1245h0();
            try {
                return this.f1091j.mo935d(this, this.f1090i);
            } finally {
                this.f1090i.mo1242g0();
            }
        }
    }

    public C0316p(Activity activity, boolean z) {
        new ArrayList();
        this.f1062c = activity;
        View decorView = activity.getWindow().getDecorView();
        m1267H(decorView);
        if (!z) {
            this.f1067h = decorView.findViewById(16908290);
        }
    }

    public C0316p(Dialog dialog) {
        new ArrayList();
        m1267H(dialog.getWindow().getDecorView());
    }

    /* renamed from: A */
    static boolean m1264A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: E */
    private C0406b0 m1265E(View view) {
        if (view instanceof C0406b0) {
            return (C0406b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: G */
    private void m1266G() {
        if (this.f1080u) {
            this.f1080u = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1063d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1271P(false);
        }
    }

    /* renamed from: H */
    private void m1267H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C3128f.decor_content_parent);
        this.f1063d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1065f = m1265E(view.findViewById(C3128f.action_bar));
        this.f1066g = (ActionBarContextView) view.findViewById(C3128f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C3128f.action_bar_container);
        this.f1064e = actionBarContainer;
        C0406b0 b0Var = this.f1065f;
        if (b0Var == null || this.f1066g == null || actionBarContainer == null) {
            throw new IllegalStateException(C0316p.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1060a = b0Var.mo1953c();
        boolean z = (this.f1065f.mo1969q() & 4) != 0;
        if (z) {
            this.f1069j = true;
        }
        C3154a b = C3154a.m13480b(this.f1060a);
        mo1007M(b.mo10902a() || z);
        m1268K(b.mo10907g());
        TypedArray obtainStyledAttributes = this.f1060a.obtainStyledAttributes((AttributeSet) null, C3132j.ActionBar, C3123a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C3132j.ActionBar_hideOnContentScroll, false)) {
            mo1006L(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3132j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo1005J((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: K */
    private void m1268K(boolean z) {
        this.f1075p = z;
        if (!z) {
            this.f1065f.mo1964l((C0460n0) null);
            this.f1064e.setTabContainer(this.f1068i);
        } else {
            this.f1064e.setTabContainer((C0460n0) null);
            this.f1065f.mo1964l(this.f1068i);
        }
        boolean z2 = true;
        boolean z3 = mo1003F() == 2;
        C0460n0 n0Var = this.f1068i;
        if (n0Var != null) {
            if (z3) {
                n0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1063d;
                if (actionBarOverlayLayout != null) {
                    C3403t.m14637f0(actionBarOverlayLayout);
                }
            } else {
                n0Var.setVisibility(8);
            }
        }
        this.f1065f.mo1982z(!this.f1075p && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1063d;
        if (this.f1075p || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: N */
    private boolean m1269N() {
        return C3403t.m14614O(this.f1064e);
    }

    /* renamed from: O */
    private void m1270O() {
        if (!this.f1080u) {
            this.f1080u = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1063d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1271P(false);
        }
    }

    /* renamed from: P */
    private void m1271P(boolean z) {
        if (m1264A(this.f1078s, this.f1079t, this.f1080u)) {
            if (!this.f1081v) {
                this.f1081v = true;
                mo1002D(z);
            }
        } else if (this.f1081v) {
            this.f1081v = false;
            mo1001C(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1000B() {
        C3155b.C3156a aVar = this.f1072m;
        if (aVar != null) {
            aVar.mo933b(this.f1071l);
            this.f1071l = null;
            this.f1072m = null;
        }
    }

    /* renamed from: C */
    public void mo1001C(boolean z) {
        View view;
        C3165h hVar = this.f1082w;
        if (hVar != null) {
            hVar.mo10948a();
        }
        if (this.f1076q != 0 || (!this.f1083x && !z)) {
            this.f1085z.mo928b((View) null);
            return;
        }
        this.f1064e.setAlpha(1.0f);
        this.f1064e.setTransitioning(true);
        C3165h hVar2 = new C3165h();
        float f = (float) (-this.f1064e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1064e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C3418x c = C3403t.m14630c(this.f1064e);
        c.mo11739k(f);
        c.mo11737i(this.f1059B);
        hVar2.mo10950c(c);
        if (this.f1077r && (view = this.f1067h) != null) {
            C3418x c2 = C3403t.m14630c(view);
            c2.mo11739k(f);
            hVar2.mo10950c(c2);
        }
        hVar2.mo10953f(f1056C);
        hVar2.mo10952e(250);
        hVar2.mo10954g(this.f1085z);
        this.f1082w = hVar2;
        hVar2.mo10955h();
    }

    /* renamed from: D */
    public void mo1002D(boolean z) {
        View view;
        View view2;
        C3165h hVar = this.f1082w;
        if (hVar != null) {
            hVar.mo10948a();
        }
        this.f1064e.setVisibility(0);
        if (this.f1076q != 0 || (!this.f1083x && !z)) {
            this.f1064e.setAlpha(1.0f);
            this.f1064e.setTranslationY(0.0f);
            if (this.f1077r && (view = this.f1067h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1058A.mo928b((View) null);
        } else {
            this.f1064e.setTranslationY(0.0f);
            float f = (float) (-this.f1064e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1064e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1064e.setTranslationY(f);
            C3165h hVar2 = new C3165h();
            C3418x c = C3403t.m14630c(this.f1064e);
            c.mo11739k(0.0f);
            c.mo11737i(this.f1059B);
            hVar2.mo10950c(c);
            if (this.f1077r && (view2 = this.f1067h) != null) {
                view2.setTranslationY(f);
                C3418x c2 = C3403t.m14630c(this.f1067h);
                c2.mo11739k(0.0f);
                hVar2.mo10950c(c2);
            }
            hVar2.mo10953f(f1057D);
            hVar2.mo10952e(250);
            hVar2.mo10954g(this.f1058A);
            this.f1082w = hVar2;
            hVar2.mo10955h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1063d;
        if (actionBarOverlayLayout != null) {
            C3403t.m14637f0(actionBarOverlayLayout);
        }
    }

    /* renamed from: F */
    public int mo1003F() {
        return this.f1065f.mo1977u();
    }

    /* renamed from: I */
    public void mo1004I(int i, int i2) {
        int q = this.f1065f.mo1969q();
        if ((i2 & 4) != 0) {
            this.f1069j = true;
        }
        this.f1065f.mo1968p((i & i2) | ((i2 ^ -1) & q));
    }

    /* renamed from: J */
    public void mo1005J(float f) {
        C3403t.m14657p0(this.f1064e, f);
    }

    /* renamed from: L */
    public void mo1006L(boolean z) {
        if (!z || this.f1063d.mo1563w()) {
            this.f1084y = z;
            this.f1063d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: M */
    public void mo1007M(boolean z) {
        this.f1065f.mo1966n(z);
    }

    /* renamed from: a */
    public void mo1008a() {
        if (this.f1079t) {
            this.f1079t = false;
            m1271P(true);
        }
    }

    /* renamed from: b */
    public void mo1009b() {
        C3165h hVar = this.f1082w;
        if (hVar != null) {
            hVar.mo10948a();
            this.f1082w = null;
        }
    }

    /* renamed from: c */
    public void mo1010c(int i) {
        this.f1076q = i;
    }

    /* renamed from: d */
    public void mo1011d() {
    }

    /* renamed from: e */
    public void mo1012e(boolean z) {
        this.f1077r = z;
    }

    /* renamed from: f */
    public void mo1013f() {
        if (!this.f1079t) {
            this.f1079t = true;
            m1271P(true);
        }
    }

    /* renamed from: h */
    public boolean mo771h() {
        C0406b0 b0Var = this.f1065f;
        if (b0Var == null || !b0Var.mo1967o()) {
            return false;
        }
        this.f1065f.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo772i(boolean z) {
        if (z != this.f1073n) {
            this.f1073n = z;
            int size = this.f1074o.size();
            for (int i = 0; i < size; i++) {
                this.f1074o.get(i).mo789a(z);
            }
        }
    }

    /* renamed from: j */
    public int mo773j() {
        return this.f1065f.mo1969q();
    }

    /* renamed from: k */
    public Context mo774k() {
        if (this.f1061b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1060a.getTheme().resolveAttribute(C3123a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1061b = new ContextThemeWrapper(this.f1060a, i);
            } else {
                this.f1061b = this.f1060a;
            }
        }
        return this.f1061b;
    }

    /* renamed from: m */
    public void mo776m(Configuration configuration) {
        m1268K(C3154a.m13480b(this.f1060a).mo10907g());
    }

    /* renamed from: o */
    public boolean mo778o(int i, KeyEvent keyEvent) {
        Menu e;
        C0320d dVar = this.f1070k;
        if (dVar == null || (e = dVar.mo1018e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: r */
    public void mo781r(boolean z) {
        if (!this.f1069j) {
            mo782s(z);
        }
    }

    /* renamed from: s */
    public void mo782s(boolean z) {
        mo1004I(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo783t(boolean z) {
        mo1004I(z ? 2 : 0, 2);
    }

    /* renamed from: u */
    public void mo784u(int i) {
        this.f1065f.mo1976t(i);
    }

    /* renamed from: v */
    public void mo785v(Drawable drawable) {
        this.f1065f.mo1981y(drawable);
    }

    /* renamed from: w */
    public void mo786w(boolean z) {
        C3165h hVar;
        this.f1083x = z;
        if (!z && (hVar = this.f1082w) != null) {
            hVar.mo10948a();
        }
    }

    /* renamed from: x */
    public void mo787x(CharSequence charSequence) {
        this.f1065f.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    public C3155b mo788y(C3155b.C3156a aVar) {
        C0320d dVar = this.f1070k;
        if (dVar != null) {
            dVar.mo1016c();
        }
        this.f1063d.setHideOnContentScrollEnabled(false);
        this.f1066g.mo1495k();
        C0320d dVar2 = new C0320d(this.f1066g.getContext(), aVar);
        if (!dVar2.mo1030t()) {
            return null;
        }
        this.f1070k = dVar2;
        dVar2.mo1022k();
        this.f1066g.mo1493h(dVar2);
        mo1014z(true);
        this.f1066g.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: z */
    public void mo1014z(boolean z) {
        C3418x xVar;
        C3418x xVar2;
        if (z) {
            m1270O();
        } else {
            m1266G();
        }
        if (m1269N()) {
            if (z) {
                xVar = this.f1065f.mo1978v(4, 100);
                xVar2 = this.f1066g.mo1940f(0, 200);
            } else {
                xVar2 = this.f1065f.mo1978v(0, 200);
                xVar = this.f1066g.mo1940f(8, 100);
            }
            C3165h hVar = new C3165h();
            hVar.mo10951d(xVar, xVar2);
            hVar.mo10955h();
        } else if (z) {
            this.f1065f.mo1963k(4);
            this.f1066g.setVisibility(0);
        } else {
            this.f1065f.mo1963k(0);
            this.f1066g.setVisibility(8);
        }
    }
}
