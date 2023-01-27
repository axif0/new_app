package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0431g0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p086f.p087a.C3123a;
import p086f.p087a.C3128f;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;

class AlertController {

    /* renamed from: A */
    NestedScrollView f771A;

    /* renamed from: B */
    private int f772B = 0;

    /* renamed from: C */
    private Drawable f773C;

    /* renamed from: D */
    private ImageView f774D;

    /* renamed from: E */
    private TextView f775E;

    /* renamed from: F */
    private TextView f776F;

    /* renamed from: G */
    private View f777G;

    /* renamed from: H */
    ListAdapter f778H;

    /* renamed from: I */
    int f779I = -1;

    /* renamed from: J */
    private int f780J;

    /* renamed from: K */
    private int f781K;

    /* renamed from: L */
    int f782L;

    /* renamed from: M */
    int f783M;

    /* renamed from: N */
    int f784N;

    /* renamed from: O */
    int f785O;

    /* renamed from: P */
    private boolean f786P;

    /* renamed from: Q */
    private int f787Q = 0;

    /* renamed from: R */
    Handler f788R;

    /* renamed from: S */
    private final View.OnClickListener f789S = new C0246a();

    /* renamed from: a */
    private final Context f790a;

    /* renamed from: b */
    final C0301i f791b;

    /* renamed from: c */
    private final Window f792c;

    /* renamed from: d */
    private final int f793d;

    /* renamed from: e */
    private CharSequence f794e;

    /* renamed from: f */
    private CharSequence f795f;

    /* renamed from: g */
    ListView f796g;

    /* renamed from: h */
    private View f797h;

    /* renamed from: i */
    private int f798i;

    /* renamed from: j */
    private int f799j;

    /* renamed from: k */
    private int f800k;

    /* renamed from: l */
    private int f801l;

    /* renamed from: m */
    private int f802m;

    /* renamed from: n */
    private boolean f803n = false;

    /* renamed from: o */
    Button f804o;

    /* renamed from: p */
    private CharSequence f805p;

    /* renamed from: q */
    Message f806q;

    /* renamed from: r */
    private Drawable f807r;

    /* renamed from: s */
    Button f808s;

    /* renamed from: t */
    private CharSequence f809t;

    /* renamed from: u */
    Message f810u;

    /* renamed from: v */
    private Drawable f811v;

    /* renamed from: w */
    Button f812w;

    /* renamed from: x */
    private CharSequence f813x;

    /* renamed from: y */
    Message f814y;

    /* renamed from: z */
    private Drawable f815z;

    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f816f;

        /* renamed from: g */
        private final int f817g;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3132j.RecycleListView);
            this.f817g = obtainStyledAttributes.getDimensionPixelOffset(C3132j.RecycleListView_paddingBottomNoButtons, -1);
            this.f816f = obtainStyledAttributes.getDimensionPixelOffset(C3132j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo753a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f816f, getPaddingRight(), z2 ? getPaddingBottom() : this.f817g);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0246a implements View.OnClickListener {
        C0246a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            r3 = r0.f814y;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f804o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f806q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f808s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.f810u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f812w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f814y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f788R
                r1 = 1
                androidx.appcompat.app.i r3 = r3.f791b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0246a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0247b implements NestedScrollView.C0595b {

        /* renamed from: a */
        final /* synthetic */ View f819a;

        /* renamed from: b */
        final /* synthetic */ View f820b;

        C0247b(AlertController alertController, View view, View view2) {
            this.f819a = view;
            this.f820b = view2;
        }

        /* renamed from: a */
        public void mo755a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m909f(nestedScrollView, this.f819a, this.f820b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0248c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f821f;

        /* renamed from: g */
        final /* synthetic */ View f822g;

        C0248c(View view, View view2) {
            this.f821f = view;
            this.f822g = view2;
        }

        public void run() {
            AlertController.m909f(AlertController.this.f771A, this.f821f, this.f822g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0249d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f824a;

        /* renamed from: b */
        final /* synthetic */ View f825b;

        C0249d(AlertController alertController, View view, View view2) {
            this.f824a = view;
            this.f825b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m909f(absListView, this.f824a, this.f825b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0250e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f826f;

        /* renamed from: g */
        final /* synthetic */ View f827g;

        C0250e(View view, View view2) {
            this.f826f = view;
            this.f827g = view2;
        }

        public void run() {
            AlertController.m909f(AlertController.this.f796g, this.f826f, this.f827g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0251f {

        /* renamed from: A */
        public int f829A;

        /* renamed from: B */
        public int f830B;

        /* renamed from: C */
        public int f831C;

        /* renamed from: D */
        public int f832D;

        /* renamed from: E */
        public boolean f833E = false;

        /* renamed from: F */
        public boolean[] f834F;

        /* renamed from: G */
        public boolean f835G;

        /* renamed from: H */
        public boolean f836H;

        /* renamed from: I */
        public int f837I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f838J;

        /* renamed from: K */
        public Cursor f839K;

        /* renamed from: L */
        public String f840L;

        /* renamed from: M */
        public String f841M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f842N;

        /* renamed from: O */
        public C0256e f843O;

        /* renamed from: a */
        public final Context f844a;

        /* renamed from: b */
        public final LayoutInflater f845b;

        /* renamed from: c */
        public int f846c = 0;

        /* renamed from: d */
        public Drawable f847d;

        /* renamed from: e */
        public int f848e = 0;

        /* renamed from: f */
        public CharSequence f849f;

        /* renamed from: g */
        public View f850g;

        /* renamed from: h */
        public CharSequence f851h;

        /* renamed from: i */
        public CharSequence f852i;

        /* renamed from: j */
        public Drawable f853j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f854k;

        /* renamed from: l */
        public CharSequence f855l;

        /* renamed from: m */
        public Drawable f856m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f857n;

        /* renamed from: o */
        public CharSequence f858o;

        /* renamed from: p */
        public Drawable f859p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f860q;

        /* renamed from: r */
        public boolean f861r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f862s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f863t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f864u;

        /* renamed from: v */
        public CharSequence[] f865v;

        /* renamed from: w */
        public ListAdapter f866w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f867x;

        /* renamed from: y */
        public int f868y;

        /* renamed from: z */
        public View f869z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0252a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f870f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0252a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f870f = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0251f.this.f834F;
                if (zArr != null && zArr[i]) {
                    this.f870f.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0253b extends CursorAdapter {

            /* renamed from: f */
            private final int f872f;

            /* renamed from: g */
            private final int f873g;

            /* renamed from: h */
            final /* synthetic */ RecycleListView f874h;

            /* renamed from: i */
            final /* synthetic */ AlertController f875i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0253b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f874h = recycleListView;
                this.f875i = alertController;
                Cursor cursor2 = getCursor();
                this.f872f = cursor2.getColumnIndexOrThrow(C0251f.this.f840L);
                this.f873g = cursor2.getColumnIndexOrThrow(C0251f.this.f841M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f872f));
                RecycleListView recycleListView = this.f874h;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f873g) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0251f.this.f845b.inflate(this.f875i.f783M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0254c implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f877f;

            C0254c(AlertController alertController) {
                this.f877f = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0251f.this.f867x.onClick(this.f877f.f791b, i);
                if (!C0251f.this.f836H) {
                    this.f877f.f791b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0255d implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f879f;

            /* renamed from: g */
            final /* synthetic */ AlertController f880g;

            C0255d(RecycleListView recycleListView, AlertController alertController) {
                this.f879f = recycleListView;
                this.f880g = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0251f.this.f834F;
                if (zArr != null) {
                    zArr[i] = this.f879f.isItemChecked(i);
                }
                C0251f.this.f838J.onClick(this.f880g.f791b, i, this.f879f.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0256e {
            /* renamed from: a */
            void mo766a(ListView listView);
        }

        public C0251f(Context context) {
            this.f844a = context;
            this.f861r = true;
            this.f845b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m935b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f845b
                int r1 = r11.f782L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f835G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f839K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f844a
                int r4 = r11.f783M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f865v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f844a
                android.database.Cursor r4 = r10.f839K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f836H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f784N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f785O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f839K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f844a
                android.database.Cursor r5 = r10.f839K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f840L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f866w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f844a
                java.lang.CharSequence[] r3 = r10.f865v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f843O
                if (r1 == 0) goto L_0x0072
                r1.mo766a(r0)
            L_0x0072:
                r11.f778H = r9
                int r1 = r10.f837I
                r11.f779I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f867x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f838J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f842N
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f836H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f835G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f796g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0251f.m935b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo760a(AlertController alertController) {
            View view = this.f850g;
            if (view != null) {
                alertController.mo745l(view);
            } else {
                CharSequence charSequence = this.f849f;
                if (charSequence != null) {
                    alertController.mo749q(charSequence);
                }
                Drawable drawable = this.f847d;
                if (drawable != null) {
                    alertController.mo747n(drawable);
                }
                int i = this.f846c;
                if (i != 0) {
                    alertController.mo746m(i);
                }
                int i2 = this.f848e;
                if (i2 != 0) {
                    alertController.mo746m(alertController.mo739c(i2));
                }
            }
            CharSequence charSequence2 = this.f851h;
            if (charSequence2 != null) {
                alertController.mo748o(charSequence2);
            }
            if (!(this.f852i == null && this.f853j == null)) {
                alertController.mo744k(-1, this.f852i, this.f854k, (Message) null, this.f853j);
            }
            if (!(this.f855l == null && this.f856m == null)) {
                alertController.mo744k(-2, this.f855l, this.f857n, (Message) null, this.f856m);
            }
            if (!(this.f858o == null && this.f859p == null)) {
                alertController.mo744k(-3, this.f858o, this.f860q, (Message) null, this.f859p);
            }
            if (!(this.f865v == null && this.f839K == null && this.f866w == null)) {
                m935b(alertController);
            }
            View view2 = this.f869z;
            if (view2 == null) {
                int i3 = this.f868y;
                if (i3 != 0) {
                    alertController.mo750r(i3);
                }
            } else if (this.f833E) {
                alertController.mo752t(view2, this.f829A, this.f830B, this.f831C, this.f832D);
            } else {
                alertController.mo751s(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0257g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f882a;

        public C0257g(DialogInterface dialogInterface) {
            this.f882a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f882a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0258h extends ArrayAdapter<CharSequence> {
        public C0258h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0301i iVar, Window window) {
        this.f790a = context;
        this.f791b = iVar;
        this.f792c = window;
        this.f788R = new C0257g(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C3132j.AlertDialog, C3123a.alertDialogStyle, 0);
        this.f780J = obtainStyledAttributes.getResourceId(C3132j.AlertDialog_android_layout, 0);
        this.f781K = obtainStyledAttributes.getResourceId(C3132j.AlertDialog_buttonPanelSideLayout, 0);
        this.f782L = obtainStyledAttributes.getResourceId(C3132j.AlertDialog_listLayout, 0);
        this.f783M = obtainStyledAttributes.getResourceId(C3132j.AlertDialog_multiChoiceItemLayout, 0);
        this.f784N = obtainStyledAttributes.getResourceId(C3132j.AlertDialog_singleChoiceItemLayout, 0);
        this.f785O = obtainStyledAttributes.getResourceId(C3132j.AlertDialog_listItemLayout, 0);
        this.f786P = obtainStyledAttributes.getBoolean(C3132j.AlertDialog_showTitle, true);
        this.f793d = obtainStyledAttributes.getDimensionPixelSize(C3132j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        iVar.mo963d(1);
    }

    /* renamed from: a */
    static boolean m907a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m907a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m908b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m909f(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: i */
    private ViewGroup m910i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m911j() {
        int i = this.f781K;
        return i == 0 ? this.f780J : this.f787Q == 1 ? i : this.f780J;
    }

    /* renamed from: p */
    private void m912p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f792c.findViewById(C3128f.scrollIndicatorUp);
        View findViewById2 = this.f792c.findViewById(C3128f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C3403t.m14673x0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f795f != null) {
                    this.f771A.setOnScrollChangeListener(new C0247b(this, findViewById, findViewById2));
                    this.f771A.post(new C0248c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f796g;
                if (listView != null) {
                    listView.setOnScrollListener(new C0249d(this, findViewById, findViewById2));
                    this.f796g.post(new C0250e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: u */
    private void m913u(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f804o = button2;
        button2.setOnClickListener(this.f789S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f805p) || this.f807r != null) {
            this.f804o.setText(this.f805p);
            Drawable drawable = this.f807r;
            if (drawable != null) {
                int i = this.f793d;
                drawable.setBounds(0, 0, i, i);
                this.f804o.setCompoundDrawables(this.f807r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f804o.setVisibility(0);
            z = true;
        } else {
            this.f804o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f808s = button3;
        button3.setOnClickListener(this.f789S);
        if (!TextUtils.isEmpty(this.f809t) || this.f811v != null) {
            this.f808s.setText(this.f809t);
            Drawable drawable2 = this.f811v;
            if (drawable2 != null) {
                int i2 = this.f793d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f808s.setCompoundDrawables(this.f811v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f808s.setVisibility(0);
            z |= true;
        } else {
            this.f808s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f812w = button4;
        button4.setOnClickListener(this.f789S);
        if (!TextUtils.isEmpty(this.f813x) || this.f815z != null) {
            this.f812w.setText(this.f813x);
            Drawable drawable3 = this.f815z;
            if (drawable3 != null) {
                int i3 = this.f793d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f812w.setCompoundDrawables(this.f815z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f812w.setVisibility(0);
            z |= true;
        } else {
            this.f812w.setVisibility(8);
        }
        if (m918z(this.f790a)) {
            if (z) {
                button = this.f804o;
            } else if (z) {
                button = this.f808s;
            } else if (z) {
                button = this.f812w;
            }
            m908b(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m914v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f792c.findViewById(C3128f.scrollView);
        this.f771A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f771A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f776F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f795f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f771A.removeView(this.f776F);
            if (this.f796g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f771A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f771A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f796g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m915w(ViewGroup viewGroup) {
        View view = this.f797h;
        boolean z = false;
        if (view == null) {
            view = this.f798i != 0 ? LayoutInflater.from(this.f790a).inflate(this.f798i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m907a(view)) {
            this.f792c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f792c.findViewById(C3128f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f803n) {
                frameLayout.setPadding(this.f799j, this.f800k, this.f801l, this.f802m);
            }
            if (this.f796g != null) {
                ((C0431g0.C0432a) viewGroup.getLayoutParams()).f1697a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m916x(ViewGroup viewGroup) {
        if (this.f777G != null) {
            viewGroup.addView(this.f777G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f792c.findViewById(C3128f.title_template).setVisibility(8);
            return;
        }
        this.f774D = (ImageView) this.f792c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f794e)) || !this.f786P) {
            this.f792c.findViewById(C3128f.title_template).setVisibility(8);
            this.f774D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f792c.findViewById(C3128f.alertTitle);
        this.f775E = textView;
        textView.setText(this.f794e);
        int i = this.f772B;
        if (i != 0) {
            this.f774D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f773C;
        if (drawable != null) {
            this.f774D.setImageDrawable(drawable);
            return;
        }
        this.f775E.setPadding(this.f774D.getPaddingLeft(), this.f774D.getPaddingTop(), this.f774D.getPaddingRight(), this.f774D.getPaddingBottom());
        this.f774D.setVisibility(8);
    }

    /* renamed from: y */
    private void m917y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f792c.findViewById(C3128f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C3128f.topPanel);
        View findViewById5 = findViewById3.findViewById(C3128f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C3128f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C3128f.customPanel);
        m915w(viewGroup);
        View findViewById7 = viewGroup.findViewById(C3128f.topPanel);
        View findViewById8 = viewGroup.findViewById(C3128f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C3128f.buttonPanel);
        ViewGroup i = m910i(findViewById7, findViewById4);
        ViewGroup i2 = m910i(findViewById8, findViewById5);
        ViewGroup i3 = m910i(findViewById9, findViewById6);
        m914v(i2);
        m913u(i3);
        m916x(i);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (i == null || i.getVisibility() == 8) ? false : true;
        boolean z3 = (i3 == null || i3.getVisibility() == 8) ? false : true;
        if (!(z3 || i2 == null || (findViewById2 = i2.findViewById(C3128f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f771A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f795f == null && this.f796g == null)) {
                view = i.findViewById(C3128f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i2 == null || (findViewById = i2.findViewById(C3128f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f796g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo753a(z2, z3);
        }
        if (!z) {
            View view2 = this.f796g;
            if (view2 == null) {
                view2 = this.f771A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m912p(i2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f796g;
        if (listView2 != null && (listAdapter = this.f778H) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.f779I;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }

    /* renamed from: z */
    private static boolean m918z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3123a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int mo739c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f790a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo740d() {
        return this.f796g;
    }

    /* renamed from: e */
    public void mo741e() {
        this.f791b.setContentView(m911j());
        m917y();
    }

    /* renamed from: g */
    public boolean mo742g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f771A;
        return nestedScrollView != null && nestedScrollView.mo2980q(keyEvent);
    }

    /* renamed from: h */
    public boolean mo743h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f771A;
        return nestedScrollView != null && nestedScrollView.mo2980q(keyEvent);
    }

    /* renamed from: k */
    public void mo744k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f788R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f813x = charSequence;
            this.f814y = message;
            this.f815z = drawable;
        } else if (i == -2) {
            this.f809t = charSequence;
            this.f810u = message;
            this.f811v = drawable;
        } else if (i == -1) {
            this.f805p = charSequence;
            this.f806q = message;
            this.f807r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void mo745l(View view) {
        this.f777G = view;
    }

    /* renamed from: m */
    public void mo746m(int i) {
        this.f773C = null;
        this.f772B = i;
        ImageView imageView = this.f774D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f774D.setImageResource(this.f772B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo747n(Drawable drawable) {
        this.f773C = drawable;
        this.f772B = 0;
        ImageView imageView = this.f774D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f774D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo748o(CharSequence charSequence) {
        this.f795f = charSequence;
        TextView textView = this.f776F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo749q(CharSequence charSequence) {
        this.f794e = charSequence;
        TextView textView = this.f775E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo750r(int i) {
        this.f797h = null;
        this.f798i = i;
        this.f803n = false;
    }

    /* renamed from: s */
    public void mo751s(View view) {
        this.f797h = view;
        this.f798i = 0;
        this.f803n = false;
    }

    /* renamed from: t */
    public void mo752t(View view, int i, int i2, int i3, int i4) {
        this.f797h = view;
        this.f798i = 0;
        this.f803n = true;
        this.f799j = i;
        this.f800k = i2;
        this.f801l = i3;
        this.f802m = i4;
    }
}
