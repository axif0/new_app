package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.widget.C0445j0;
import p086f.p087a.C3126d;
import p086f.p087a.C3129g;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.view.menu.q */
final class C0356q extends C0347k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0350m, View.OnKeyListener {

    /* renamed from: A */
    private static final int f1300A = C3129g.abc_popup_menu_item_layout;

    /* renamed from: g */
    private final Context f1301g;

    /* renamed from: h */
    private final C0335g f1302h;

    /* renamed from: i */
    private final C0334f f1303i;

    /* renamed from: j */
    private final boolean f1304j;

    /* renamed from: k */
    private final int f1305k;

    /* renamed from: l */
    private final int f1306l;

    /* renamed from: m */
    private final int f1307m;

    /* renamed from: n */
    final C0445j0 f1308n;

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f1309o = new C0357a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f1310p = new C0358b();

    /* renamed from: q */
    private PopupWindow.OnDismissListener f1311q;

    /* renamed from: r */
    private View f1312r;

    /* renamed from: s */
    View f1313s;

    /* renamed from: t */
    private C0350m.C0351a f1314t;

    /* renamed from: u */
    ViewTreeObserver f1315u;

    /* renamed from: v */
    private boolean f1316v;

    /* renamed from: w */
    private boolean f1317w;

    /* renamed from: x */
    private int f1318x;

    /* renamed from: y */
    private int f1319y = 0;

    /* renamed from: z */
    private boolean f1320z;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class C0357a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0357a() {
        }

        public void onGlobalLayout() {
            if (C0356q.this.mo1150c() && !C0356q.this.f1308n.mo2124B()) {
                View view = C0356q.this.f1313s;
                if (view == null || !view.isShown()) {
                    C0356q.this.dismiss();
                } else {
                    C0356q.this.f1308n.mo1149a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class C0358b implements View.OnAttachStateChangeListener {
        C0358b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0356q.this.f1315u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0356q.this.f1315u = view.getViewTreeObserver();
                }
                C0356q qVar = C0356q.this;
                qVar.f1315u.removeGlobalOnLayoutListener(qVar.f1309o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0356q(Context context, C0335g gVar, View view, int i, int i2, boolean z) {
        this.f1301g = context;
        this.f1302h = gVar;
        this.f1304j = z;
        this.f1303i = new C0334f(gVar, LayoutInflater.from(context), this.f1304j, f1300A);
        this.f1306l = i;
        this.f1307m = i2;
        Resources resources = context.getResources();
        this.f1305k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3126d.abc_config_prefDialogWidth));
        this.f1312r = view;
        this.f1308n = new C0445j0(this.f1301g, (AttributeSet) null, this.f1306l, this.f1307m);
        gVar.mo1231c(this, context);
    }

    /* renamed from: C */
    private boolean m1577C() {
        View view;
        if (mo1150c()) {
            return true;
        }
        if (this.f1316v || (view = this.f1312r) == null) {
            return false;
        }
        this.f1313s = view;
        this.f1308n.mo2132K(this);
        this.f1308n.mo2133L(this);
        this.f1308n.mo2131J(true);
        View view2 = this.f1313s;
        boolean z = this.f1315u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1315u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1309o);
        }
        view2.addOnAttachStateChangeListener(this.f1310p);
        this.f1308n.mo2125D(view2);
        this.f1308n.mo2128G(this.f1319y);
        if (!this.f1317w) {
            this.f1318x = C0347k.m1528r(this.f1303i, (ViewGroup) null, this.f1301g, this.f1305k);
            this.f1317w = true;
        }
        this.f1308n.mo2127F(this.f1318x);
        this.f1308n.mo2130I(2);
        this.f1308n.mo2129H(mo1406q());
        this.f1308n.mo1149a();
        ListView i = this.f1308n.mo1155i();
        i.setOnKeyListener(this);
        if (this.f1320z && this.f1302h.mo1270z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1301g).inflate(C3129g.abc_popup_menu_header_item_layout, i, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1302h.mo1270z());
            }
            frameLayout.setEnabled(false);
            i.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1308n.mo2144p(this.f1303i);
        this.f1308n.mo1149a();
        return true;
    }

    /* renamed from: a */
    public void mo1149a() {
        if (!m1577C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public void mo1128b(C0335g gVar, boolean z) {
        if (gVar == this.f1302h) {
            dismiss();
            C0350m.C0351a aVar = this.f1314t;
            if (aVar != null) {
                aVar.mo930b(gVar, z);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1150c() {
        return !this.f1316v && this.f1308n.mo1150c();
    }

    /* renamed from: d */
    public void mo1151d(C0335g gVar) {
    }

    public void dismiss() {
        if (mo1150c()) {
            this.f1308n.dismiss();
        }
    }

    /* renamed from: h */
    public void mo1154h(Parcelable parcelable) {
    }

    /* renamed from: i */
    public ListView mo1155i() {
        return this.f1308n.mo1155i();
    }

    /* renamed from: j */
    public boolean mo1135j(C0359r rVar) {
        if (rVar.hasVisibleItems()) {
            C0348l lVar = new C0348l(this.f1301g, rVar, this.f1313s, this.f1304j, this.f1306l, this.f1307m);
            lVar.mo1416j(this.f1314t);
            lVar.mo1413g(C0347k.m1526A(rVar));
            lVar.mo1415i(this.f1311q);
            this.f1311q = null;
            this.f1302h.mo1238e(false);
            int d = this.f1308n.mo2139d();
            int n = this.f1308n.mo2143n();
            if ((Gravity.getAbsoluteGravity(this.f1319y, C3403t.m14674y(this.f1312r)) & 7) == 5) {
                d += this.f1312r.getWidth();
            }
            if (lVar.mo1419n(d, n)) {
                C0350m.C0351a aVar = this.f1314t;
                if (aVar == null) {
                    return true;
                }
                aVar.mo931c(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo1136k(boolean z) {
        this.f1317w = false;
        C0334f fVar = this.f1303i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public boolean mo1156l() {
        return false;
    }

    /* renamed from: m */
    public Parcelable mo1157m() {
        return null;
    }

    public void onDismiss() {
        this.f1316v = true;
        this.f1302h.close();
        ViewTreeObserver viewTreeObserver = this.f1315u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1315u = this.f1313s.getViewTreeObserver();
            }
            this.f1315u.removeGlobalOnLayoutListener(this.f1309o);
            this.f1315u = null;
        }
        this.f1313s.removeOnAttachStateChangeListener(this.f1310p);
        PopupWindow.OnDismissListener onDismissListener = this.f1311q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo1139p(C0350m.C0351a aVar) {
        this.f1314t = aVar;
    }

    /* renamed from: s */
    public void mo1160s(View view) {
        this.f1312r = view;
    }

    /* renamed from: u */
    public void mo1161u(boolean z) {
        this.f1303i.mo1189d(z);
    }

    /* renamed from: v */
    public void mo1162v(int i) {
        this.f1319y = i;
    }

    /* renamed from: w */
    public void mo1163w(int i) {
        this.f1308n.mo2142l(i);
    }

    /* renamed from: x */
    public void mo1164x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1311q = onDismissListener;
    }

    /* renamed from: y */
    public void mo1165y(boolean z) {
        this.f1320z = z;
    }

    /* renamed from: z */
    public void mo1166z(int i) {
        this.f1308n.mo2141j(i);
    }
}
