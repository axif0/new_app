package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0350m;
import p086f.p111h.p122m.C3386d;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0348l {

    /* renamed from: a */
    private final Context f1286a;

    /* renamed from: b */
    private final C0335g f1287b;

    /* renamed from: c */
    private final boolean f1288c;

    /* renamed from: d */
    private final int f1289d;

    /* renamed from: e */
    private final int f1290e;

    /* renamed from: f */
    private View f1291f;

    /* renamed from: g */
    private int f1292g;

    /* renamed from: h */
    private boolean f1293h;

    /* renamed from: i */
    private C0350m.C0351a f1294i;

    /* renamed from: j */
    private C0347k f1295j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1296k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1297l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0349a implements PopupWindow.OnDismissListener {
        C0349a() {
        }

        public void onDismiss() {
            C0348l.this.mo1411e();
        }
    }

    public C0348l(Context context, C0335g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0348l(Context context, C0335g gVar, View view, boolean z, int i, int i2) {
        this.f1292g = 8388611;
        this.f1297l = new C0349a();
        this.f1286a = context;
        this.f1287b = gVar;
        this.f1291f = view;
        this.f1288c = z;
        this.f1289d = i;
        this.f1290e = i2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0347k m1544a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1286a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1286a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p086f.p087a.C3126d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1286a
            android.view.View r3 = r14.f1291f
            int r4 = r14.f1289d
            int r5 = r14.f1290e
            boolean r6 = r14.f1288c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f1286a
            androidx.appcompat.view.menu.g r9 = r14.f1287b
            android.view.View r10 = r14.f1291f
            int r11 = r14.f1289d
            int r12 = r14.f1290e
            boolean r13 = r14.f1288c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f1287b
            r0.mo1151d(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1297l
            r0.mo1164x(r1)
            android.view.View r1 = r14.f1291f
            r0.mo1160s(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f1294i
            r0.mo1139p(r1)
            boolean r1 = r14.f1293h
            r0.mo1161u(r1)
            int r1 = r14.f1292g
            r0.mo1162v(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0348l.m1544a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m1545l(int i, int i2, boolean z, boolean z2) {
        C0347k c = mo1409c();
        c.mo1165y(z2);
        if (z) {
            if ((C3386d.m14544b(this.f1292g, C3403t.m14674y(this.f1291f)) & 7) == 5) {
                i -= this.f1291f.getWidth();
            }
            c.mo1163w(i);
            c.mo1166z(i2);
            int i3 = (int) ((this.f1286a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1407t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo1149a();
    }

    /* renamed from: b */
    public void mo1408b() {
        if (mo1410d()) {
            this.f1295j.dismiss();
        }
    }

    /* renamed from: c */
    public C0347k mo1409c() {
        if (this.f1295j == null) {
            this.f1295j = m1544a();
        }
        return this.f1295j;
    }

    /* renamed from: d */
    public boolean mo1410d() {
        C0347k kVar = this.f1295j;
        return kVar != null && kVar.mo1150c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1411e() {
        this.f1295j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1296k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1412f(View view) {
        this.f1291f = view;
    }

    /* renamed from: g */
    public void mo1413g(boolean z) {
        this.f1293h = z;
        C0347k kVar = this.f1295j;
        if (kVar != null) {
            kVar.mo1161u(z);
        }
    }

    /* renamed from: h */
    public void mo1414h(int i) {
        this.f1292g = i;
    }

    /* renamed from: i */
    public void mo1415i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1296k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1416j(C0350m.C0351a aVar) {
        this.f1294i = aVar;
        C0347k kVar = this.f1295j;
        if (kVar != null) {
            kVar.mo1139p(aVar);
        }
    }

    /* renamed from: k */
    public void mo1417k() {
        if (!mo1418m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo1418m() {
        if (mo1410d()) {
            return true;
        }
        if (this.f1291f == null) {
            return false;
        }
        m1545l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1419n(int i, int i2) {
        if (mo1410d()) {
            return true;
        }
        if (this.f1291f == null) {
            return false;
        }
        m1545l(i, i2, true, true);
        return true;
    }
}
