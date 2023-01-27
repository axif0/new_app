package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.widget.C0443i0;
import androidx.appcompat.widget.C0445j0;
import java.util.ArrayList;
import java.util.List;
import p086f.p087a.C3126d;
import p086f.p087a.C3129g;
import p086f.p111h.p122m.C3386d;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0326d extends C0347k implements C0350m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G */
    private static final int f1157G = C3129g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private boolean f1158A;

    /* renamed from: B */
    private boolean f1159B;

    /* renamed from: C */
    private C0350m.C0351a f1160C;

    /* renamed from: D */
    ViewTreeObserver f1161D;

    /* renamed from: E */
    private PopupWindow.OnDismissListener f1162E;

    /* renamed from: F */
    boolean f1163F;

    /* renamed from: g */
    private final Context f1164g;

    /* renamed from: h */
    private final int f1165h;

    /* renamed from: i */
    private final int f1166i;

    /* renamed from: j */
    private final int f1167j;

    /* renamed from: k */
    private final boolean f1168k;

    /* renamed from: l */
    final Handler f1169l;

    /* renamed from: m */
    private final List<C0335g> f1170m = new ArrayList();

    /* renamed from: n */
    final List<C0331d> f1171n = new ArrayList();

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f1172o = new C0327a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f1173p = new C0328b();

    /* renamed from: q */
    private final C0443i0 f1174q = new C0329c();

    /* renamed from: r */
    private int f1175r = 0;

    /* renamed from: s */
    private int f1176s = 0;

    /* renamed from: t */
    private View f1177t;

    /* renamed from: u */
    View f1178u;

    /* renamed from: v */
    private int f1179v;

    /* renamed from: w */
    private boolean f1180w;

    /* renamed from: x */
    private boolean f1181x;

    /* renamed from: y */
    private int f1182y;

    /* renamed from: z */
    private int f1183z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0327a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0327a() {
        }

        public void onGlobalLayout() {
            if (C0326d.this.mo1150c() && C0326d.this.f1171n.size() > 0 && !C0326d.this.f1171n.get(0).f1191a.mo2124B()) {
                View view = C0326d.this.f1178u;
                if (view == null || !view.isShown()) {
                    C0326d.this.dismiss();
                    return;
                }
                for (C0331d dVar : C0326d.this.f1171n) {
                    dVar.f1191a.mo1149a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0328b implements View.OnAttachStateChangeListener {
        C0328b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0326d.this.f1161D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0326d.this.f1161D = view.getViewTreeObserver();
                }
                C0326d dVar = C0326d.this;
                dVar.f1161D.removeGlobalOnLayoutListener(dVar.f1172o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0329c implements C0443i0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0330a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0331d f1187f;

            /* renamed from: g */
            final /* synthetic */ MenuItem f1188g;

            /* renamed from: h */
            final /* synthetic */ C0335g f1189h;

            C0330a(C0331d dVar, MenuItem menuItem, C0335g gVar) {
                this.f1187f = dVar;
                this.f1188g = menuItem;
                this.f1189h = gVar;
            }

            public void run() {
                C0331d dVar = this.f1187f;
                if (dVar != null) {
                    C0326d.this.f1163F = true;
                    dVar.f1192b.mo1238e(false);
                    C0326d.this.f1163F = false;
                }
                if (this.f1188g.isEnabled() && this.f1188g.hasSubMenu()) {
                    this.f1189h.mo1207N(this.f1188g, 4);
                }
            }
        }

        C0329c() {
        }

        /* renamed from: e */
        public void mo1170e(C0335g gVar, MenuItem menuItem) {
            C0331d dVar = null;
            C0326d.this.f1169l.removeCallbacksAndMessages((Object) null);
            int size = C0326d.this.f1171n.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0326d.this.f1171n.get(i).f1192b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0326d.this.f1171n.size()) {
                    dVar = C0326d.this.f1171n.get(i2);
                }
                C0326d.this.f1169l.postAtTime(new C0330a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: f */
        public void mo1171f(C0335g gVar, MenuItem menuItem) {
            C0326d.this.f1169l.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0331d {

        /* renamed from: a */
        public final C0445j0 f1191a;

        /* renamed from: b */
        public final C0335g f1192b;

        /* renamed from: c */
        public final int f1193c;

        public C0331d(C0445j0 j0Var, C0335g gVar, int i) {
            this.f1191a = j0Var;
            this.f1192b = gVar;
            this.f1193c = i;
        }

        /* renamed from: a */
        public ListView mo1173a() {
            return this.f1191a.mo1155i();
        }
    }

    public C0326d(Context context, View view, int i, int i2, boolean z) {
        this.f1164g = context;
        this.f1177t = view;
        this.f1166i = i;
        this.f1167j = i2;
        this.f1168k = z;
        this.f1158A = false;
        this.f1179v = m1373G();
        Resources resources = context.getResources();
        this.f1165h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3126d.abc_config_prefDialogWidth));
        this.f1169l = new Handler();
    }

    /* renamed from: C */
    private C0445j0 m1369C() {
        C0445j0 j0Var = new C0445j0(this.f1164g, (AttributeSet) null, this.f1166i, this.f1167j);
        j0Var.mo2182T(this.f1174q);
        j0Var.mo2133L(this);
        j0Var.mo2132K(this);
        j0Var.mo2125D(this.f1177t);
        j0Var.mo2128G(this.f1176s);
        j0Var.mo2131J(true);
        j0Var.mo2130I(2);
        return j0Var;
    }

    /* renamed from: D */
    private int m1370D(C0335g gVar) {
        int size = this.f1171n.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f1171n.get(i).f1192b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    private MenuItem m1371E(C0335g gVar, C0335g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: F */
    private View m1372F(C0331d dVar, C0335g gVar) {
        int i;
        C0334f fVar;
        int firstVisiblePosition;
        MenuItem E = m1371E(dVar.f1192b, gVar);
        if (E == null) {
            return null;
        }
        ListView a = dVar.mo1173a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0334f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0334f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (E == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: G */
    private int m1373G() {
        return C3403t.m14674y(this.f1177t) == 1 ? 0 : 1;
    }

    /* renamed from: H */
    private int m1374H(int i) {
        List<C0331d> list = this.f1171n;
        ListView a = list.get(list.size() - 1).mo1173a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1178u.getWindowVisibleDisplayFrame(rect);
        return this.f1179v == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: I */
    private void m1375I(C0335g gVar) {
        View view;
        C0331d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1164g);
        C0334f fVar = new C0334f(gVar, from, this.f1168k, f1157G);
        if (!mo1150c() && this.f1158A) {
            fVar.mo1189d(true);
        } else if (mo1150c()) {
            fVar.mo1189d(C0347k.m1526A(gVar));
        }
        int r = C0347k.m1528r(fVar, (ViewGroup) null, this.f1164g, this.f1165h);
        C0445j0 C = m1369C();
        C.mo2144p(fVar);
        C.mo2127F(r);
        C.mo2128G(this.f1176s);
        if (this.f1171n.size() > 0) {
            List<C0331d> list = this.f1171n;
            dVar = list.get(list.size() - 1);
            view = m1372F(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C.mo2183U(false);
            C.mo2180R((Object) null);
            int H = m1374H(r);
            boolean z = H == 1;
            this.f1179v = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.mo2125D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1177t.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1176s & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1177t.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1176s & 5) != 5) {
                if (z) {
                    r = view.getWidth();
                }
                i3 = i - r;
                C.mo2142l(i3);
                C.mo2134M(true);
                C.mo2141j(i2);
            } else if (!z) {
                r = view.getWidth();
                i3 = i - r;
                C.mo2142l(i3);
                C.mo2134M(true);
                C.mo2141j(i2);
            }
            i3 = i + r;
            C.mo2142l(i3);
            C.mo2134M(true);
            C.mo2141j(i2);
        } else {
            if (this.f1180w) {
                C.mo2142l(this.f1182y);
            }
            if (this.f1181x) {
                C.mo2141j(this.f1183z);
            }
            C.mo2129H(mo1406q());
        }
        this.f1171n.add(new C0331d(C, gVar, this.f1179v));
        C.mo1149a();
        ListView i4 = C.mo1155i();
        i4.setOnKeyListener(this);
        if (dVar == null && this.f1159B && gVar.mo1270z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C3129g.abc_popup_menu_header_item_layout, i4, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo1270z());
            i4.addHeaderView(frameLayout, (Object) null, false);
            C.mo1149a();
        }
    }

    /* renamed from: a */
    public void mo1149a() {
        if (!mo1150c()) {
            for (C0335g I : this.f1170m) {
                m1375I(I);
            }
            this.f1170m.clear();
            View view = this.f1177t;
            this.f1178u = view;
            if (view != null) {
                boolean z = this.f1161D == null;
                ViewTreeObserver viewTreeObserver = this.f1178u.getViewTreeObserver();
                this.f1161D = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1172o);
                }
                this.f1178u.addOnAttachStateChangeListener(this.f1173p);
            }
        }
    }

    /* renamed from: b */
    public void mo1128b(C0335g gVar, boolean z) {
        int D = m1370D(gVar);
        if (D >= 0) {
            int i = D + 1;
            if (i < this.f1171n.size()) {
                this.f1171n.get(i).f1192b.mo1238e(false);
            }
            C0331d remove = this.f1171n.remove(D);
            remove.f1192b.mo1209Q(this);
            if (this.f1163F) {
                remove.f1191a.mo2181S((Object) null);
                remove.f1191a.mo2126E(0);
            }
            remove.f1191a.dismiss();
            int size = this.f1171n.size();
            this.f1179v = size > 0 ? this.f1171n.get(size - 1).f1193c : m1373G();
            if (size == 0) {
                dismiss();
                C0350m.C0351a aVar = this.f1160C;
                if (aVar != null) {
                    aVar.mo930b(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1161D;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1161D.removeGlobalOnLayoutListener(this.f1172o);
                    }
                    this.f1161D = null;
                }
                this.f1178u.removeOnAttachStateChangeListener(this.f1173p);
                this.f1162E.onDismiss();
            } else if (z) {
                this.f1171n.get(0).f1192b.mo1238e(false);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1150c() {
        return this.f1171n.size() > 0 && this.f1171n.get(0).f1191a.mo1150c();
    }

    /* renamed from: d */
    public void mo1151d(C0335g gVar) {
        gVar.mo1231c(this, this.f1164g);
        if (mo1150c()) {
            m1375I(gVar);
        } else {
            this.f1170m.add(gVar);
        }
    }

    public void dismiss() {
        int size = this.f1171n.size();
        if (size > 0) {
            C0331d[] dVarArr = (C0331d[]) this.f1171n.toArray(new C0331d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0331d dVar = dVarArr[i];
                if (dVar.f1191a.mo1150c()) {
                    dVar.f1191a.dismiss();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo1153e() {
        return false;
    }

    /* renamed from: h */
    public void mo1154h(Parcelable parcelable) {
    }

    /* renamed from: i */
    public ListView mo1155i() {
        if (this.f1171n.isEmpty()) {
            return null;
        }
        List<C0331d> list = this.f1171n;
        return list.get(list.size() - 1).mo1173a();
    }

    /* renamed from: j */
    public boolean mo1135j(C0359r rVar) {
        for (C0331d next : this.f1171n) {
            if (rVar == next.f1192b) {
                next.mo1173a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo1151d(rVar);
        C0350m.C0351a aVar = this.f1160C;
        if (aVar != null) {
            aVar.mo931c(rVar);
        }
        return true;
    }

    /* renamed from: k */
    public void mo1136k(boolean z) {
        for (C0331d a : this.f1171n) {
            C0347k.m1527B(a.mo1173a().getAdapter()).notifyDataSetChanged();
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
        C0331d dVar;
        int size = this.f1171n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1171n.get(i);
            if (!dVar.f1191a.mo1150c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1192b.mo1238e(false);
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
        this.f1160C = aVar;
    }

    /* renamed from: s */
    public void mo1160s(View view) {
        if (this.f1177t != view) {
            this.f1177t = view;
            this.f1176s = C3386d.m14544b(this.f1175r, C3403t.m14674y(view));
        }
    }

    /* renamed from: u */
    public void mo1161u(boolean z) {
        this.f1158A = z;
    }

    /* renamed from: v */
    public void mo1162v(int i) {
        if (this.f1175r != i) {
            this.f1175r = i;
            this.f1176s = C3386d.m14544b(i, C3403t.m14674y(this.f1177t));
        }
    }

    /* renamed from: w */
    public void mo1163w(int i) {
        this.f1180w = true;
        this.f1182y = i;
    }

    /* renamed from: x */
    public void mo1164x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1162E = onDismissListener;
    }

    /* renamed from: y */
    public void mo1165y(boolean z) {
        this.f1159B = z;
    }

    /* renamed from: z */
    public void mo1166z(int i) {
        this.f1181x = true;
        this.f1183z = i;
    }
}
