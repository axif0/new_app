package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0271d;
import androidx.appcompat.view.menu.C0355p;
import p086f.p087a.C3123a;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3402s;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.widget.v */
public class C0480v extends Spinner implements C3402s {

    /* renamed from: n */
    private static final int[] f1866n = {16843505};

    /* renamed from: f */
    private final C0423e f1867f;

    /* renamed from: g */
    private final Context f1868g;

    /* renamed from: h */
    private C0427f0 f1869h;

    /* renamed from: i */
    private SpinnerAdapter f1870i;

    /* renamed from: j */
    private final boolean f1871j;

    /* renamed from: k */
    private C0491g f1872k;

    /* renamed from: l */
    int f1873l;

    /* renamed from: m */
    final Rect f1874m;

    /* renamed from: androidx.appcompat.widget.v$a */
    class C0481a extends C0427f0 {

        /* renamed from: o */
        final /* synthetic */ C0485e f1875o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0481a(View view, C0485e eVar) {
            super(view);
            this.f1875o = eVar;
        }

        /* renamed from: b */
        public C0355p mo1050b() {
            return this.f1875o;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo1051c() {
            if (C0480v.this.getInternalPopup().mo2389c()) {
                return true;
            }
            C0480v.this.mo2364b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.v$b */
    class C0482b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0482b() {
        }

        public void onGlobalLayout() {
            if (!C0480v.this.getInternalPopup().mo2389c()) {
                C0480v.this.mo2364b();
            }
            ViewTreeObserver viewTreeObserver = C0480v.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$c */
    class C0483c implements C0491g, DialogInterface.OnClickListener {

        /* renamed from: f */
        C0271d f1878f;

        /* renamed from: g */
        private ListAdapter f1879g;

        /* renamed from: h */
        private CharSequence f1880h;

        C0483c() {
        }

        /* renamed from: b */
        public void mo2388b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public boolean mo2389c() {
            C0271d dVar = this.f1878f;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        /* renamed from: d */
        public int mo2390d() {
            return 0;
        }

        public void dismiss() {
            C0271d dVar = this.f1878f;
            if (dVar != null) {
                dVar.dismiss();
                this.f1878f = null;
            }
        }

        /* renamed from: g */
        public Drawable mo2392g() {
            return null;
        }

        /* renamed from: h */
        public void mo2393h(CharSequence charSequence) {
            this.f1880h = charSequence;
        }

        /* renamed from: j */
        public void mo2394j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: k */
        public void mo2395k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: l */
        public void mo2396l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo2397m(int i, int i2) {
            if (this.f1879g != null) {
                C0271d.C0272a aVar = new C0271d.C0272a(C0480v.this.getPopupContext());
                CharSequence charSequence = this.f1880h;
                if (charSequence != null) {
                    aVar.mo825n(charSequence);
                }
                aVar.mo822k(this.f1879g, C0480v.this.getSelectedItemPosition(), this);
                C0271d a = aVar.mo812a();
                this.f1878f = a;
                ListView e = a.mo807e();
                if (Build.VERSION.SDK_INT >= 17) {
                    e.setTextDirection(i);
                    e.setTextAlignment(i2);
                }
                this.f1878f.show();
            }
        }

        /* renamed from: n */
        public int mo2398n() {
            return 0;
        }

        /* renamed from: o */
        public CharSequence mo2399o() {
            return this.f1880h;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0480v.this.setSelection(i);
            if (C0480v.this.getOnItemClickListener() != null) {
                C0480v.this.performItemClick((View) null, i, this.f1879g.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: p */
        public void mo2401p(ListAdapter listAdapter) {
            this.f1879g = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.v$d */
    private static class C0484d implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f1882f;

        /* renamed from: g */
        private ListAdapter f1883g;

        public C0484d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1882f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1883g = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0471q0) {
                C0471q0 q0Var = (C0471q0) spinnerAdapter;
                if (q0Var.getDropDownViewTheme() == null) {
                    q0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1883g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1882f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1882f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1882f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1882f;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1882f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1883g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1882f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1882f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$e */
    class C0485e extends C0434h0 implements C0491g {

        /* renamed from: N */
        private CharSequence f1884N;

        /* renamed from: O */
        ListAdapter f1885O;

        /* renamed from: P */
        private final Rect f1886P = new Rect();

        /* renamed from: Q */
        private int f1887Q;

        /* renamed from: androidx.appcompat.widget.v$e$a */
        class C0486a implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ C0480v f1889f;

            C0486a(C0480v vVar) {
                this.f1889f = vVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0480v.this.setSelection(i);
                if (C0480v.this.getOnItemClickListener() != null) {
                    C0485e eVar = C0485e.this;
                    C0480v.this.performItemClick(view, i, eVar.f1885O.getItemId(i));
                }
                C0485e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.v$e$b */
        class C0487b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0487b() {
            }

            public void onGlobalLayout() {
                C0485e eVar = C0485e.this;
                if (!eVar.mo2417U(C0480v.this)) {
                    C0485e.this.dismiss();
                    return;
                }
                C0485e.this.mo2415S();
                C0485e.super.mo1149a();
            }
        }

        /* renamed from: androidx.appcompat.widget.v$e$c */
        class C0488c implements PopupWindow.OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1892f;

            C0488c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1892f = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0480v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1892f);
                }
            }
        }

        public C0485e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2125D(C0480v.this);
            mo2131J(true);
            mo2135O(0);
            mo2133L(new C0486a(C0480v.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: S */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2415S() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo2140g()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.v r1 = androidx.appcompat.widget.C0480v.this
                android.graphics.Rect r1 = r1.f1874m
                r0.getPadding(r1)
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0480v.this
                boolean r0 = androidx.appcompat.widget.C0404a1.m1828b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0480v.this
                android.graphics.Rect r0 = r0.f1874m
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0480v.this
                android.graphics.Rect r0 = r0.f1874m
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0480v.this
                android.graphics.Rect r0 = r0.f1874m
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0480v.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.v r2 = androidx.appcompat.widget.C0480v.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.v r3 = androidx.appcompat.widget.C0480v.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.C0480v.this
                int r5 = r4.f1873l
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1885O
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo2140g()
                int r4 = r4.mo2363a(r5, r6)
                androidx.appcompat.widget.v r5 = androidx.appcompat.widget.C0480v.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.v r6 = androidx.appcompat.widget.C0480v.this
                android.graphics.Rect r6 = r6.f1874m
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo2127F(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo2127F(r5)
            L_0x0085:
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.C0480v.this
                boolean r4 = androidx.appcompat.widget.C0404a1.m1828b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.mo2152z()
                int r3 = r3 - r0
                int r0 = r8.mo2416T()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.mo2416T()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.mo2142l(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0480v.C0485e.mo2415S():void");
        }

        /* renamed from: T */
        public int mo2416T() {
            return this.f1887Q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public boolean mo2417U(View view) {
            return C3403t.m14613N(view) && view.getGlobalVisibleRect(this.f1886P);
        }

        /* renamed from: h */
        public void mo2393h(CharSequence charSequence) {
            this.f1884N = charSequence;
        }

        /* renamed from: k */
        public void mo2395k(int i) {
            this.f1887Q = i;
        }

        /* renamed from: m */
        public void mo2397m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean c = mo1150c();
            mo2415S();
            mo2130I(2);
            super.mo1149a();
            ListView i3 = mo1155i();
            i3.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                i3.setTextDirection(i);
                i3.setTextAlignment(i2);
            }
            mo2136P(C0480v.this.getSelectedItemPosition());
            if (!c && (viewTreeObserver = C0480v.this.getViewTreeObserver()) != null) {
                C0487b bVar = new C0487b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo2132K(new C0488c(bVar));
            }
        }

        /* renamed from: o */
        public CharSequence mo2399o() {
            return this.f1884N;
        }

        /* renamed from: p */
        public void mo2144p(ListAdapter listAdapter) {
            super.mo2144p(listAdapter);
            this.f1885O = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.v$f */
    static class C0489f extends View.BaseSavedState {
        public static final Parcelable.Creator<C0489f> CREATOR = new C0490a();

        /* renamed from: f */
        boolean f1894f;

        /* renamed from: androidx.appcompat.widget.v$f$a */
        class C0490a implements Parcelable.Creator<C0489f> {
            C0490a() {
            }

            /* renamed from: a */
            public C0489f createFromParcel(Parcel parcel) {
                return new C0489f(parcel);
            }

            /* renamed from: b */
            public C0489f[] newArray(int i) {
                return new C0489f[i];
            }
        }

        C0489f(Parcel parcel) {
            super(parcel);
            this.f1894f = parcel.readByte() != 0;
        }

        C0489f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1894f ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.v$g */
    interface C0491g {
        /* renamed from: b */
        void mo2388b(Drawable drawable);

        /* renamed from: c */
        boolean mo2389c();

        /* renamed from: d */
        int mo2390d();

        void dismiss();

        /* renamed from: g */
        Drawable mo2392g();

        /* renamed from: h */
        void mo2393h(CharSequence charSequence);

        /* renamed from: j */
        void mo2394j(int i);

        /* renamed from: k */
        void mo2395k(int i);

        /* renamed from: l */
        void mo2396l(int i);

        /* renamed from: m */
        void mo2397m(int i, int i2);

        /* renamed from: n */
        int mo2398n();

        /* renamed from: o */
        CharSequence mo2399o();

        /* renamed from: p */
        void mo2401p(ListAdapter listAdapter);
    }

    public C0480v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.spinnerStyle);
    }

    public C0480v(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0480v(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0480v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1874m = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0469p0.m2126a(r6, r0)
            int[] r0 = p086f.p087a.C3132j.Spinner
            r1 = 0
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.C0479u0.m2148v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1867f = r2
            if (r11 == 0) goto L_0x0029
            f.a.o.d r2 = new f.a.o.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f1868g = r2
            goto L_0x0039
        L_0x0029:
            int r11 = p086f.p087a.C3132j.Spinner_popupTheme
            int r11 = r0.mo2356n(r11, r1)
            if (r11 == 0) goto L_0x0037
            f.a.o.d r2 = new f.a.o.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f1868g = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1866n     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004d
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004d:
            if (r11 == 0) goto L_0x006b
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.v$e r10 = new androidx.appcompat.widget.v$e
            android.content.Context r3 = r6.f1868g
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1868g
            int[] r4 = p086f.p087a.C3132j.Spinner
            androidx.appcompat.widget.u0 r1 = androidx.appcompat.widget.C0479u0.m2148v(r3, r8, r4, r9, r1)
            int r3 = p086f.p087a.C3132j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo2355m(r3, r4)
            r6.f1873l = r3
            int r3 = p086f.p087a.C3132j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo2349g(r3)
            r10.mo2138b(r3)
            int r3 = p086f.p087a.C3132j.Spinner_android_prompt
            java.lang.String r3 = r0.mo2357o(r3)
            r10.mo2393h(r3)
            r1.mo2362w()
            r6.f1872k = r10
            androidx.appcompat.widget.v$a r1 = new androidx.appcompat.widget.v$a
            r1.<init>(r6, r10)
            r6.f1869h = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.v$c r10 = new androidx.appcompat.widget.v$c
            r10.<init>()
            r6.f1872k = r10
            int r1 = p086f.p087a.C3132j.Spinner_android_prompt
            java.lang.String r1 = r0.mo2357o(r1)
            r10.mo2393h(r1)
        L_0x00b8:
            int r10 = p086f.p087a.C3132j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo2359q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p086f.p087a.C3129g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.mo2362w()
            r6.f1871j = r11
            android.widget.SpinnerAdapter r7 = r6.f1870i
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1870i = r2
        L_0x00de:
            androidx.appcompat.widget.e r7 = r6.f1867f
            r7.mo2037e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0480v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2363a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1874m);
        Rect rect = this.f1874m;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2364b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1872k.mo2397m(getTextDirection(), getTextAlignment());
        } else {
            this.f1872k.mo2397m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0423e eVar = this.f1867f;
        if (eVar != null) {
            eVar.mo2034b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0491g gVar = this.f1872k;
        if (gVar != null) {
            return gVar.mo2390d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0491g gVar = this.f1872k;
        if (gVar != null) {
            return gVar.mo2398n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1872k != null) {
            return this.f1873l;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0491g getInternalPopup() {
        return this.f1872k;
    }

    public Drawable getPopupBackground() {
        C0491g gVar = this.f1872k;
        if (gVar != null) {
            return gVar.mo2392g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1868g;
    }

    public CharSequence getPrompt() {
        C0491g gVar = this.f1872k;
        return gVar != null ? gVar.mo2399o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0423e eVar = this.f1867f;
        if (eVar != null) {
            return eVar.mo2035c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0423e eVar = this.f1867f;
        if (eVar != null) {
            return eVar.mo2036d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0491g gVar = this.f1872k;
        if (gVar != null && gVar.mo2389c()) {
            this.f1872k.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1872k != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo2363a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0489f fVar = (C0489f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1894f && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0482b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0489f fVar = new C0489f(super.onSaveInstanceState());
        C0491g gVar = this.f1872k;
        fVar.f1894f = gVar != null && gVar.mo2389c();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0427f0 f0Var = this.f1869h;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0491g gVar = this.f1872k;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo2389c()) {
            return true;
        }
        mo2364b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1871j) {
            this.f1870i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1872k != null) {
            Context context = this.f1868g;
            if (context == null) {
                context = getContext();
            }
            this.f1872k.mo2401p(new C0484d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0423e eVar = this.f1867f;
        if (eVar != null) {
            eVar.mo2038f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0423e eVar = this.f1867f;
        if (eVar != null) {
            eVar.mo2039g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0491g gVar = this.f1872k;
        if (gVar != null) {
            gVar.mo2395k(i);
            this.f1872k.mo2396l(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0491g gVar = this.f1872k;
        if (gVar != null) {
            gVar.mo2394j(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1872k != null) {
            this.f1873l = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0491g gVar = this.f1872k;
        if (gVar != null) {
            gVar.mo2388b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C3133a.m13388d(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0491g gVar = this.f1872k;
        if (gVar != null) {
            gVar.mo2393h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0423e eVar = this.f1867f;
        if (eVar != null) {
            eVar.mo2041i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0423e eVar = this.f1867f;
        if (eVar != null) {
            eVar.mo2042j(mode);
        }
    }
}
