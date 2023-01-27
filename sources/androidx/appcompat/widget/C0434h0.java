package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0355p;
import androidx.core.widget.C0607h;
import java.lang.reflect.Method;
import p086f.p087a.C3123a;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.widget.h0 */
public class C0434h0 implements C0355p {

    /* renamed from: K */
    private static Method f1705K;

    /* renamed from: L */
    private static Method f1706L;

    /* renamed from: M */
    private static Method f1707M;

    /* renamed from: A */
    private AdapterView.OnItemSelectedListener f1708A;

    /* renamed from: B */
    final C0440f f1709B;

    /* renamed from: C */
    private final C0439e f1710C;

    /* renamed from: D */
    private final C0438d f1711D;

    /* renamed from: E */
    private final C0436b f1712E;

    /* renamed from: F */
    final Handler f1713F;

    /* renamed from: G */
    private final Rect f1714G;

    /* renamed from: H */
    private Rect f1715H;

    /* renamed from: I */
    private boolean f1716I;

    /* renamed from: J */
    PopupWindow f1717J;

    /* renamed from: f */
    private Context f1718f;

    /* renamed from: g */
    private ListAdapter f1719g;

    /* renamed from: h */
    C0420d0 f1720h;

    /* renamed from: i */
    private int f1721i;

    /* renamed from: j */
    private int f1722j;

    /* renamed from: k */
    private int f1723k;

    /* renamed from: l */
    private int f1724l;

    /* renamed from: m */
    private int f1725m;

    /* renamed from: n */
    private boolean f1726n;

    /* renamed from: o */
    private boolean f1727o;

    /* renamed from: p */
    private boolean f1728p;

    /* renamed from: q */
    private int f1729q;

    /* renamed from: r */
    private boolean f1730r;

    /* renamed from: s */
    private boolean f1731s;

    /* renamed from: t */
    int f1732t;

    /* renamed from: u */
    private View f1733u;

    /* renamed from: v */
    private int f1734v;

    /* renamed from: w */
    private DataSetObserver f1735w;

    /* renamed from: x */
    private View f1736x;

    /* renamed from: y */
    private Drawable f1737y;

    /* renamed from: z */
    private AdapterView.OnItemClickListener f1738z;

    /* renamed from: androidx.appcompat.widget.h0$a */
    class C0435a implements AdapterView.OnItemSelectedListener {
        C0435a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0420d0 d0Var;
            if (i != -1 && (d0Var = C0434h0.this.f1720h) != null) {
                d0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    private class C0436b implements Runnable {
        C0436b() {
        }

        public void run() {
            C0434h0.this.mo2145r();
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$c */
    private class C0437c extends DataSetObserver {
        C0437c() {
        }

        public void onChanged() {
            if (C0434h0.this.mo1150c()) {
                C0434h0.this.mo1149a();
            }
        }

        public void onInvalidated() {
            C0434h0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$d */
    private class C0438d implements AbsListView.OnScrollListener {
        C0438d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0434h0.this.mo2123A() && C0434h0.this.f1717J.getContentView() != null) {
                C0434h0 h0Var = C0434h0.this;
                h0Var.f1713F.removeCallbacks(h0Var.f1709B);
                C0434h0.this.f1709B.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$e */
    private class C0439e implements View.OnTouchListener {
        C0439e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0434h0.this.f1717J) != null && popupWindow.isShowing() && x >= 0 && x < C0434h0.this.f1717J.getWidth() && y >= 0 && y < C0434h0.this.f1717J.getHeight()) {
                C0434h0 h0Var = C0434h0.this;
                h0Var.f1713F.postDelayed(h0Var.f1709B, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0434h0 h0Var2 = C0434h0.this;
                h0Var2.f1713F.removeCallbacks(h0Var2.f1709B);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$f */
    private class C0440f implements Runnable {
        C0440f() {
        }

        public void run() {
            C0420d0 d0Var = C0434h0.this.f1720h;
            if (d0Var != null && C3403t.m14613N(d0Var) && C0434h0.this.f1720h.getCount() > C0434h0.this.f1720h.getChildCount()) {
                int childCount = C0434h0.this.f1720h.getChildCount();
                C0434h0 h0Var = C0434h0.this;
                if (childCount <= h0Var.f1732t) {
                    h0Var.f1717J.setInputMethodMode(2);
                    C0434h0.this.mo1149a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1705K = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1707M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1706L = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0434h0(Context context) {
        this(context, (AttributeSet) null, C3123a.listPopupWindowStyle);
    }

    public C0434h0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0434h0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1721i = -2;
        this.f1722j = -2;
        this.f1725m = 1002;
        this.f1729q = 0;
        this.f1730r = false;
        this.f1731s = false;
        this.f1732t = Integer.MAX_VALUE;
        this.f1734v = 0;
        this.f1709B = new C0440f();
        this.f1710C = new C0439e();
        this.f1711D = new C0438d();
        this.f1712E = new C0436b();
        this.f1714G = new Rect();
        this.f1718f = context;
        this.f1713F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3132j.ListPopupWindow, i, i2);
        this.f1723k = obtainStyledAttributes.getDimensionPixelOffset(C3132j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C3132j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1724l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1726n = true;
        }
        obtainStyledAttributes.recycle();
        C0468p pVar = new C0468p(context, attributeSet, i, i2);
        this.f1717J = pVar;
        pVar.setInputMethodMode(1);
    }

    /* renamed from: C */
    private void m1971C() {
        View view = this.f1733u;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1733u);
            }
        }
    }

    /* renamed from: N */
    private void m1972N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1705K;
            if (method != null) {
                try {
                    method.invoke(this.f1717J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1717J.setIsClippedToScreen(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.appcompat.widget.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.appcompat.widget.d0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1973q() {
        /*
            r12 = this;
            androidx.appcompat.widget.d0 r0 = r12.f1720h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b8
            android.content.Context r0 = r12.f1718f
            boolean r5 = r12.f1716I
            r5 = r5 ^ r3
            androidx.appcompat.widget.d0 r5 = r12.mo2146s(r0, r5)
            r12.f1720h = r5
            android.graphics.drawable.Drawable r6 = r12.f1737y
            if (r6 == 0) goto L_0x001b
            r5.setSelector(r6)
        L_0x001b:
            androidx.appcompat.widget.d0 r5 = r12.f1720h
            android.widget.ListAdapter r6 = r12.f1719g
            r5.setAdapter(r6)
            androidx.appcompat.widget.d0 r5 = r12.f1720h
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1738z
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.d0 r5 = r12.f1720h
            r5.setFocusable(r3)
            androidx.appcompat.widget.d0 r5 = r12.f1720h
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.d0 r5 = r12.f1720h
            androidx.appcompat.widget.h0$a r6 = new androidx.appcompat.widget.h0$a
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.d0 r5 = r12.f1720h
            androidx.appcompat.widget.h0$d r6 = r12.f1711D
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1708A
            if (r5 == 0) goto L_0x004d
            androidx.appcompat.widget.d0 r6 = r12.f1720h
            r6.setOnItemSelectedListener(r5)
        L_0x004d:
            androidx.appcompat.widget.d0 r5 = r12.f1720h
            android.view.View r6 = r12.f1733u
            if (r6 == 0) goto L_0x00b1
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1734v
            if (r8 == 0) goto L_0x0088
            if (r8 == r3) goto L_0x0081
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1734v
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x008e
        L_0x0081:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008e
        L_0x0088:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008e:
            int r0 = r12.f1722j
            if (r0 < 0) goto L_0x0095
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0097
        L_0x0095:
            r0 = 0
            r5 = 0
        L_0x0097:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            android.widget.PopupWindow r6 = r12.f1717J
            r6.setContentView(r5)
            goto L_0x00d6
        L_0x00b8:
            android.widget.PopupWindow r0 = r12.f1717J
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1733u
            if (r0 == 0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            android.widget.PopupWindow r5 = r12.f1717J
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f2
            android.graphics.Rect r6 = r12.f1714G
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1714G
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1726n
            if (r7 != 0) goto L_0x00f8
            int r6 = -r6
            r12.f1724l = r6
            goto L_0x00f8
        L_0x00f2:
            android.graphics.Rect r5 = r12.f1714G
            r5.setEmpty()
            r5 = 0
        L_0x00f8:
            android.widget.PopupWindow r6 = r12.f1717J
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            android.view.View r4 = r12.mo2147t()
            int r6 = r12.f1724l
            int r3 = r12.m1974u(r4, r6, r3)
            boolean r4 = r12.f1730r
            if (r4 != 0) goto L_0x015b
            int r4 = r12.f1721i
            if (r4 != r2) goto L_0x0116
            goto L_0x015b
        L_0x0116:
            int r4 = r12.f1722j
            r6 = -2
            if (r4 == r6) goto L_0x0124
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0124
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x013c
        L_0x0124:
            android.content.Context r2 = r12.f1718f
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1714G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x013c:
            r7 = r1
            androidx.appcompat.widget.d0 r6 = r12.f1720h
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2012d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0159
            androidx.appcompat.widget.d0 r2 = r12.f1720h
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.d0 r3 = r12.f1720h
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0159:
            int r1 = r1 + r0
            return r1
        L_0x015b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0434h0.m1973q():int");
    }

    /* renamed from: u */
    private int m1974u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1717J.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1706L;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1717J, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1717J.getMaxAvailableHeight(view, i);
    }

    /* renamed from: A */
    public boolean mo2123A() {
        return this.f1717J.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean mo2124B() {
        return this.f1716I;
    }

    /* renamed from: D */
    public void mo2125D(View view) {
        this.f1736x = view;
    }

    /* renamed from: E */
    public void mo2126E(int i) {
        this.f1717J.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void mo2127F(int i) {
        Drawable background = this.f1717J.getBackground();
        if (background != null) {
            background.getPadding(this.f1714G);
            Rect rect = this.f1714G;
            this.f1722j = rect.left + rect.right + i;
            return;
        }
        mo2137Q(i);
    }

    /* renamed from: G */
    public void mo2128G(int i) {
        this.f1729q = i;
    }

    /* renamed from: H */
    public void mo2129H(Rect rect) {
        this.f1715H = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void mo2130I(int i) {
        this.f1717J.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void mo2131J(boolean z) {
        this.f1716I = z;
        this.f1717J.setFocusable(z);
    }

    /* renamed from: K */
    public void mo2132K(PopupWindow.OnDismissListener onDismissListener) {
        this.f1717J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void mo2133L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1738z = onItemClickListener;
    }

    /* renamed from: M */
    public void mo2134M(boolean z) {
        this.f1728p = true;
        this.f1727o = z;
    }

    /* renamed from: O */
    public void mo2135O(int i) {
        this.f1734v = i;
    }

    /* renamed from: P */
    public void mo2136P(int i) {
        C0420d0 d0Var = this.f1720h;
        if (mo1150c() && d0Var != null) {
            d0Var.setListSelectionHidden(false);
            d0Var.setSelection(i);
            if (d0Var.getChoiceMode() != 0) {
                d0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: Q */
    public void mo2137Q(int i) {
        this.f1722j = i;
    }

    /* renamed from: a */
    public void mo1149a() {
        int q = m1973q();
        boolean A = mo2123A();
        C0607h.m2885b(this.f1717J, this.f1725m);
        boolean z = true;
        if (!this.f1717J.isShowing()) {
            int i = this.f1722j;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo2147t().getWidth();
            }
            int i2 = this.f1721i;
            if (i2 == -1) {
                q = -1;
            } else if (i2 != -2) {
                q = i2;
            }
            this.f1717J.setWidth(i);
            this.f1717J.setHeight(q);
            m1972N(true);
            this.f1717J.setOutsideTouchable(!this.f1731s && !this.f1730r);
            this.f1717J.setTouchInterceptor(this.f1710C);
            if (this.f1728p) {
                C0607h.m2884a(this.f1717J, this.f1727o);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1707M;
                if (method != null) {
                    try {
                        method.invoke(this.f1717J, new Object[]{this.f1715H});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1717J.setEpicenterBounds(this.f1715H);
            }
            C0607h.m2886c(this.f1717J, mo2147t(), this.f1723k, this.f1724l, this.f1729q);
            this.f1720h.setSelection(-1);
            if (!this.f1716I || this.f1720h.isInTouchMode()) {
                mo2145r();
            }
            if (!this.f1716I) {
                this.f1713F.post(this.f1712E);
            }
        } else if (C3403t.m14613N(mo2147t())) {
            int i3 = this.f1722j;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo2147t().getWidth();
            }
            int i4 = this.f1721i;
            if (i4 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    this.f1717J.setWidth(this.f1722j == -1 ? -1 : 0);
                    this.f1717J.setHeight(0);
                } else {
                    this.f1717J.setWidth(this.f1722j == -1 ? -1 : 0);
                    this.f1717J.setHeight(-1);
                }
            } else if (i4 != -2) {
                q = i4;
            }
            PopupWindow popupWindow = this.f1717J;
            if (this.f1731s || this.f1730r) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1717J.update(mo2147t(), this.f1723k, this.f1724l, i3 < 0 ? -1 : i3, q < 0 ? -1 : q);
        }
    }

    /* renamed from: b */
    public void mo2138b(Drawable drawable) {
        this.f1717J.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public boolean mo1150c() {
        return this.f1717J.isShowing();
    }

    /* renamed from: d */
    public int mo2139d() {
        return this.f1723k;
    }

    public void dismiss() {
        this.f1717J.dismiss();
        m1971C();
        this.f1717J.setContentView((View) null);
        this.f1720h = null;
        this.f1713F.removeCallbacks(this.f1709B);
    }

    /* renamed from: g */
    public Drawable mo2140g() {
        return this.f1717J.getBackground();
    }

    /* renamed from: i */
    public ListView mo1155i() {
        return this.f1720h;
    }

    /* renamed from: j */
    public void mo2141j(int i) {
        this.f1724l = i;
        this.f1726n = true;
    }

    /* renamed from: l */
    public void mo2142l(int i) {
        this.f1723k = i;
    }

    /* renamed from: n */
    public int mo2143n() {
        if (!this.f1726n) {
            return 0;
        }
        return this.f1724l;
    }

    /* renamed from: p */
    public void mo2144p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1735w;
        if (dataSetObserver == null) {
            this.f1735w = new C0437c();
        } else {
            ListAdapter listAdapter2 = this.f1719g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1719g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1735w);
        }
        C0420d0 d0Var = this.f1720h;
        if (d0Var != null) {
            d0Var.setAdapter(this.f1719g);
        }
    }

    /* renamed from: r */
    public void mo2145r() {
        C0420d0 d0Var = this.f1720h;
        if (d0Var != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0420d0 mo2146s(Context context, boolean z) {
        return new C0420d0(context, z);
    }

    /* renamed from: t */
    public View mo2147t() {
        return this.f1736x;
    }

    /* renamed from: v */
    public Object mo2148v() {
        if (!mo1150c()) {
            return null;
        }
        return this.f1720h.getSelectedItem();
    }

    /* renamed from: w */
    public long mo2149w() {
        if (!mo1150c()) {
            return Long.MIN_VALUE;
        }
        return this.f1720h.getSelectedItemId();
    }

    /* renamed from: x */
    public int mo2150x() {
        if (!mo1150c()) {
            return -1;
        }
        return this.f1720h.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View mo2151y() {
        if (!mo1150c()) {
            return null;
        }
        return this.f1720h.getSelectedView();
    }

    /* renamed from: z */
    public int mo2152z() {
        return this.f1722j;
    }
}
