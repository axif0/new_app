package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0263b;
import androidx.appcompat.view.menu.C0332e;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.view.menu.C0352n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0403a0;
import androidx.appcompat.widget.C0404a1;
import androidx.appcompat.widget.C0424e0;
import androidx.appcompat.widget.C0441i;
import androidx.appcompat.widget.C0479u0;
import androidx.appcompat.widget.C0508z0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0573f;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0717i;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p086f.p087a.C3123a;
import p086f.p087a.C3125c;
import p086f.p087a.C3128f;
import p086f.p087a.C3129g;
import p086f.p087a.C3131i;
import p086f.p087a.C3132j;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p087a.p094o.C3155b;
import p086f.p087a.p094o.C3158d;
import p086f.p087a.p094o.C3160f;
import p086f.p087a.p094o.C3162g;
import p086f.p087a.p094o.C3167i;
import p086f.p102e.C3203g;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p112e.p113c.C3279f;
import p086f.p111h.p121l.C3344c;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3387e;
import p086f.p111h.p122m.C3389f;
import p086f.p111h.p122m.C3399p;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3418x;
import p086f.p111h.p122m.C3422y;
import p086f.p111h.p122m.C3423z;

/* renamed from: androidx.appcompat.app.h */
class C0276h extends C0275g implements C0335g.C0336a, LayoutInflater.Factory2 {

    /* renamed from: f0 */
    private static final C3203g<String, Integer> f911f0 = new C3203g<>();

    /* renamed from: g0 */
    private static final boolean f912g0 = (Build.VERSION.SDK_INT < 21);

    /* renamed from: h0 */
    private static final int[] f913h0 = {16842836};

    /* renamed from: i0 */
    private static final boolean f914i0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: j0 */
    private static final boolean f915j0;

    /* renamed from: k0 */
    private static boolean f916k0 = true;

    /* renamed from: A */
    ViewGroup f917A;

    /* renamed from: B */
    private TextView f918B;

    /* renamed from: C */
    private View f919C;

    /* renamed from: D */
    private boolean f920D;

    /* renamed from: E */
    private boolean f921E;

    /* renamed from: F */
    boolean f922F;

    /* renamed from: G */
    boolean f923G;

    /* renamed from: H */
    boolean f924H;

    /* renamed from: I */
    boolean f925I;

    /* renamed from: J */
    boolean f926J;

    /* renamed from: K */
    private boolean f927K;

    /* renamed from: L */
    private C0299t[] f928L;

    /* renamed from: M */
    private C0299t f929M;

    /* renamed from: N */
    private boolean f930N;

    /* renamed from: O */
    private boolean f931O;

    /* renamed from: P */
    private boolean f932P;

    /* renamed from: Q */
    private boolean f933Q;

    /* renamed from: R */
    boolean f934R;

    /* renamed from: S */
    private int f935S;

    /* renamed from: T */
    private int f936T;

    /* renamed from: U */
    private boolean f937U;

    /* renamed from: V */
    private boolean f938V;

    /* renamed from: W */
    private C0291m f939W;

    /* renamed from: X */
    private C0291m f940X;

    /* renamed from: Y */
    boolean f941Y;

    /* renamed from: Z */
    int f942Z;

    /* renamed from: a0 */
    private final Runnable f943a0;

    /* renamed from: b0 */
    private boolean f944b0;

    /* renamed from: c0 */
    private Rect f945c0;

    /* renamed from: d0 */
    private Rect f946d0;

    /* renamed from: e0 */
    private C0304k f947e0;

    /* renamed from: i */
    final Object f948i;

    /* renamed from: j */
    final Context f949j;

    /* renamed from: k */
    Window f950k;

    /* renamed from: l */
    private C0289k f951l;

    /* renamed from: m */
    final C0274f f952m;

    /* renamed from: n */
    C0259a f953n;

    /* renamed from: o */
    MenuInflater f954o;

    /* renamed from: p */
    private CharSequence f955p;

    /* renamed from: q */
    private C0403a0 f956q;

    /* renamed from: r */
    private C0286i f957r;

    /* renamed from: s */
    private C0300u f958s;

    /* renamed from: t */
    C3155b f959t;

    /* renamed from: u */
    ActionBarContextView f960u;

    /* renamed from: v */
    PopupWindow f961v;

    /* renamed from: w */
    Runnable f962w;

    /* renamed from: x */
    C3418x f963x;

    /* renamed from: y */
    private boolean f964y;

    /* renamed from: z */
    private boolean f965z;

    /* renamed from: androidx.appcompat.app.h$a */
    class C0277a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f966a;

        C0277a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f966a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m1150a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m1150a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f966a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f966a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    class C0278b implements Runnable {
        C0278b() {
        }

        public void run() {
            C0276h hVar = C0276h.this;
            if ((hVar.f942Z & 1) != 0) {
                hVar.mo903Z(0);
            }
            C0276h hVar2 = C0276h.this;
            if ((hVar2.f942Z & 4096) != 0) {
                hVar2.mo903Z(108);
            }
            C0276h hVar3 = C0276h.this;
            hVar3.f941Y = false;
            hVar3.f942Z = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.h$c */
    class C0279c implements C3399p {
        C0279c() {
        }

        /* renamed from: a */
        public C3356b0 mo923a(View view, C3356b0 b0Var) {
            int h = b0Var.mo11565h();
            int Q0 = C0276h.this.mo897Q0(b0Var, (Rect) null);
            if (h != Q0) {
                b0Var = b0Var.mo11571n(b0Var.mo11563f(), Q0, b0Var.mo11564g(), b0Var.mo11561e());
            }
            return C3403t.m14621V(view, b0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.h$d */
    class C0280d implements C0424e0.C0425a {
        C0280d() {
        }

        /* renamed from: a */
        public void mo924a(Rect rect) {
            rect.top = C0276h.this.mo897Q0((C3356b0) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.h$e */
    class C0281e implements ContentFrameLayout.C0372a {
        C0281e() {
        }

        /* renamed from: a */
        public void mo925a() {
        }

        public void onDetachedFromWindow() {
            C0276h.this.mo901X();
        }
    }

    /* renamed from: androidx.appcompat.app.h$f */
    class C0282f implements Runnable {

        /* renamed from: androidx.appcompat.app.h$f$a */
        class C0283a extends C3423z {
            C0283a() {
            }

            /* renamed from: b */
            public void mo928b(View view) {
                C0276h.this.f960u.setAlpha(1.0f);
                C0276h.this.f963x.mo11735f((C3422y) null);
                C0276h.this.f963x = null;
            }

            /* renamed from: c */
            public void mo929c(View view) {
                C0276h.this.f960u.setVisibility(0);
            }
        }

        C0282f() {
        }

        public void run() {
            C0276h hVar = C0276h.this;
            hVar.f961v.showAtLocation(hVar.f960u, 55, 0, 0);
            C0276h.this.mo905a0();
            if (C0276h.this.mo892I0()) {
                C0276h.this.f960u.setAlpha(0.0f);
                C0276h hVar2 = C0276h.this;
                C3418x c = C3403t.m14630c(hVar2.f960u);
                c.mo11730a(1.0f);
                hVar2.f963x = c;
                C0276h.this.f963x.mo11735f(new C0283a());
                return;
            }
            C0276h.this.f960u.setAlpha(1.0f);
            C0276h.this.f960u.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.h$g */
    class C0284g extends C3423z {
        C0284g() {
        }

        /* renamed from: b */
        public void mo928b(View view) {
            C0276h.this.f960u.setAlpha(1.0f);
            C0276h.this.f963x.mo11735f((C3422y) null);
            C0276h.this.f963x = null;
        }

        /* renamed from: c */
        public void mo929c(View view) {
            C0276h.this.f960u.setVisibility(0);
            C0276h.this.f960u.sendAccessibilityEvent(32);
            if (C0276h.this.f960u.getParent() instanceof View) {
                C3403t.m14637f0((View) C0276h.this.f960u.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$h */
    private class C0285h implements C0263b.C0265b {
        C0285h() {
        }

        /* renamed from: a */
        public void mo801a(Drawable drawable, int i) {
            C0259a p = C0276h.this.mo878p();
            if (p != null) {
                p.mo785v(drawable);
                p.mo784u(i);
            }
        }

        /* renamed from: b */
        public boolean mo802b() {
            C0259a p = C0276h.this.mo878p();
            return (p == null || (p.mo773j() & 4) == 0) ? false : true;
        }

        /* renamed from: c */
        public Drawable mo803c() {
            C0479u0 u = C0479u0.m2147u(mo805e(), (AttributeSet) null, new int[]{C3123a.homeAsUpIndicator});
            Drawable g = u.mo2349g(0);
            u.mo2362w();
            return g;
        }

        /* renamed from: d */
        public void mo804d(int i) {
            C0259a p = C0276h.this.mo878p();
            if (p != null) {
                p.mo784u(i);
            }
        }

        /* renamed from: e */
        public Context mo805e() {
            return C0276h.this.mo908f0();
        }
    }

    /* renamed from: androidx.appcompat.app.h$i */
    private final class C0286i implements C0350m.C0351a {
        C0286i() {
        }

        /* renamed from: b */
        public void mo930b(C0335g gVar, boolean z) {
            C0276h.this.mo896Q(gVar);
        }

        /* renamed from: c */
        public boolean mo931c(C0335g gVar) {
            Window.Callback k0 = C0276h.this.mo911k0();
            if (k0 == null) {
                return true;
            }
            k0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.h$j */
    class C0287j implements C3155b.C3156a {

        /* renamed from: a */
        private C3155b.C3156a f976a;

        /* renamed from: androidx.appcompat.app.h$j$a */
        class C0288a extends C3423z {
            C0288a() {
            }

            /* renamed from: b */
            public void mo928b(View view) {
                C0276h.this.f960u.setVisibility(8);
                C0276h hVar = C0276h.this;
                PopupWindow popupWindow = hVar.f961v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f960u.getParent() instanceof View) {
                    C3403t.m14637f0((View) C0276h.this.f960u.getParent());
                }
                C0276h.this.f960u.removeAllViews();
                C0276h.this.f963x.mo11735f((C3422y) null);
                C0276h hVar2 = C0276h.this;
                hVar2.f963x = null;
                C3403t.m14637f0(hVar2.f917A);
            }
        }

        public C0287j(C3155b.C3156a aVar) {
            this.f976a = aVar;
        }

        /* renamed from: a */
        public boolean mo932a(C3155b bVar, Menu menu) {
            C3403t.m14637f0(C0276h.this.f917A);
            return this.f976a.mo932a(bVar, menu);
        }

        /* renamed from: b */
        public void mo933b(C3155b bVar) {
            this.f976a.mo933b(bVar);
            C0276h hVar = C0276h.this;
            if (hVar.f961v != null) {
                hVar.f950k.getDecorView().removeCallbacks(C0276h.this.f962w);
            }
            C0276h hVar2 = C0276h.this;
            if (hVar2.f960u != null) {
                hVar2.mo905a0();
                C0276h hVar3 = C0276h.this;
                C3418x c = C3403t.m14630c(hVar3.f960u);
                c.mo11730a(0.0f);
                hVar3.f963x = c;
                C0276h.this.f963x.mo11735f(new C0288a());
            }
            C0276h hVar4 = C0276h.this;
            C0274f fVar = hVar4.f952m;
            if (fVar != null) {
                fVar.mo847j(hVar4.f959t);
            }
            C0276h hVar5 = C0276h.this;
            hVar5.f959t = null;
            C3403t.m14637f0(hVar5.f917A);
        }

        /* renamed from: c */
        public boolean mo934c(C3155b bVar, MenuItem menuItem) {
            return this.f976a.mo934c(bVar, menuItem);
        }

        /* renamed from: d */
        public boolean mo935d(C3155b bVar, Menu menu) {
            return this.f976a.mo935d(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.h$k */
    class C0289k extends C3167i {
        C0289k(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final ActionMode mo936b(ActionMode.Callback callback) {
            C3160f.C3161a aVar = new C3160f.C3161a(C0276h.this.f949j, callback);
            C3155b K0 = C0276h.this.mo893K0(aVar);
            if (K0 != null) {
                return aVar.mo10938e(K0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0276h.this.mo902Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0276h.this.mo918w0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0335g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0276h.this.mo920z0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0276h.this.mo889A0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0335g gVar = menu instanceof C0335g ? (C0335g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo1239e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo1239e0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0335g gVar;
            C0299t i0 = C0276h.this.mo909i0(0, true);
            if (i0 == null || (gVar = i0.f997j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0276h.this.mo914r0() ? mo936b(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0276h.this.mo914r0() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo936b(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.h$l */
    private class C0290l extends C0291m {

        /* renamed from: c */
        private final PowerManager f980c;

        C0290l(Context context) {
            super();
            this.f980c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo947b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo948c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f980c.isPowerSaveMode()) ? 1 : 2;
        }

        /* renamed from: d */
        public void mo949d() {
            C0276h.this.mo871e();
        }
    }

    /* renamed from: androidx.appcompat.app.h$m */
    abstract class C0291m {

        /* renamed from: a */
        private BroadcastReceiver f982a;

        /* renamed from: androidx.appcompat.app.h$m$a */
        class C0292a extends BroadcastReceiver {
            C0292a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0291m.this.mo949d();
            }
        }

        C0291m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo950a() {
            BroadcastReceiver broadcastReceiver = this.f982a;
            if (broadcastReceiver != null) {
                try {
                    C0276h.this.f949j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f982a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo947b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo948c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo949d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo951e() {
            mo950a();
            IntentFilter b = mo947b();
            if (b != null && b.countActions() != 0) {
                if (this.f982a == null) {
                    this.f982a = new C0292a();
                }
                C0276h.this.f949j.registerReceiver(this.f982a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$n */
    private class C0293n extends C0291m {

        /* renamed from: c */
        private final C0314o f985c;

        C0293n(C0314o oVar) {
            super();
            this.f985c = oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo947b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo948c() {
            return this.f985c.mo999d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo949d() {
            C0276h.this.mo871e();
        }
    }

    /* renamed from: androidx.appcompat.app.h$o */
    static class C0294o {
        /* renamed from: a */
        static void m1182a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$p */
    static class C0295p {
        /* renamed from: a */
        static void m1183a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$q */
    static class C0296q {
        /* renamed from: a */
        static void m1184a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$r */
    private static class C0297r {
        /* renamed from: a */
        static void m1185a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.h$s */
    private class C0298s extends ContentFrameLayout {
        public C0298s(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m1186c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0276h.this.mo902Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1186c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0276h.this.mo898S(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C3133a.m13388d(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.h$t */
    protected static final class C0299t {

        /* renamed from: a */
        int f988a;

        /* renamed from: b */
        int f989b;

        /* renamed from: c */
        int f990c;

        /* renamed from: d */
        int f991d;

        /* renamed from: e */
        int f992e;

        /* renamed from: f */
        int f993f;

        /* renamed from: g */
        ViewGroup f994g;

        /* renamed from: h */
        View f995h;

        /* renamed from: i */
        View f996i;

        /* renamed from: j */
        C0335g f997j;

        /* renamed from: k */
        C0332e f998k;

        /* renamed from: l */
        Context f999l;

        /* renamed from: m */
        boolean f1000m;

        /* renamed from: n */
        boolean f1001n;

        /* renamed from: o */
        boolean f1002o;

        /* renamed from: p */
        public boolean f1003p;

        /* renamed from: q */
        boolean f1004q = false;

        /* renamed from: r */
        boolean f1005r;

        /* renamed from: s */
        Bundle f1006s;

        C0299t(int i) {
            this.f988a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0352n mo956a(C0350m.C0351a aVar) {
            if (this.f997j == null) {
                return null;
            }
            if (this.f998k == null) {
                C0332e eVar = new C0332e(this.f999l, C3129g.abc_list_menu_item_layout);
                this.f998k = eVar;
                eVar.mo1139p(aVar);
                this.f997j.mo1229b(this.f998k);
            }
            return this.f998k.mo1175c(this.f994g);
        }

        /* renamed from: b */
        public boolean mo957b() {
            if (this.f995h == null) {
                return false;
            }
            return this.f996i != null || this.f998k.mo1174a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo958c(C0335g gVar) {
            C0332e eVar;
            C0335g gVar2 = this.f997j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo1209Q(this.f998k);
                }
                this.f997j = gVar;
                if (gVar != null && (eVar = this.f998k) != null) {
                    gVar.mo1229b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo959d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C3123a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C3123a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C3131i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C3158d dVar = new C3158d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f999l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C3132j.AppCompatTheme);
            this.f989b = obtainStyledAttributes.getResourceId(C3132j.AppCompatTheme_panelBackground, 0);
            this.f993f = obtainStyledAttributes.getResourceId(C3132j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.h$u */
    private final class C0300u implements C0350m.C0351a {
        C0300u() {
        }

        /* renamed from: b */
        public void mo930b(C0335g gVar, boolean z) {
            C0335g F = gVar.mo1199F();
            boolean z2 = F != gVar;
            C0276h hVar = C0276h.this;
            if (z2) {
                gVar = F;
            }
            C0299t d0 = hVar.mo907d0(gVar);
            if (d0 == null) {
                return;
            }
            if (z2) {
                C0276h.this.mo895P(d0.f988a, d0, F);
                C0276h.this.mo899T(d0, true);
                return;
            }
            C0276h.this.mo899T(d0, z);
        }

        /* renamed from: c */
        public boolean mo931c(C0335g gVar) {
            Window.Callback k0;
            if (gVar != gVar.mo1199F()) {
                return true;
            }
            C0276h hVar = C0276h.this;
            if (!hVar.f922F || (k0 = hVar.mo911k0()) == null || C0276h.this.f934R) {
                return true;
            }
            k0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        f915j0 = z;
        if (f912g0 && !f916k0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0277a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0276h(Activity activity, C0274f fVar) {
        this(activity, (Window) null, fVar, activity);
    }

    C0276h(Dialog dialog, C0274f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    private C0276h(Context context, Window window, C0274f fVar, Object obj) {
        Integer num;
        C0273e N0;
        this.f963x = null;
        this.f964y = true;
        this.f935S = -100;
        this.f943a0 = new C0278b();
        this.f949j = context;
        this.f952m = fVar;
        this.f948i = obj;
        if (this.f935S == -100 && (obj instanceof Dialog) && (N0 = m1074N0()) != null) {
            this.f935S = N0.mo828H().mo876n();
        }
        if (this.f935S == -100 && (num = f911f0.get(this.f948i.getClass().getName())) != null) {
            this.f935S = num.intValue();
            f911f0.remove(this.f948i.getClass().getName());
        }
        if (window != null) {
            m1073N(window);
        }
        C0441i.m2011h();
    }

    /* renamed from: C0 */
    private void m1064C0(C0299t tVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!tVar.f1002o && !this.f934R) {
            if (tVar.f988a == 0) {
                if ((this.f949j.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback k0 = mo911k0();
            if (k0 == null || k0.onMenuOpened(tVar.f988a, tVar.f997j)) {
                WindowManager windowManager = (WindowManager) this.f949j.getSystemService("window");
                if (windowManager != null && m1066F0(tVar, keyEvent)) {
                    if (tVar.f994g == null || tVar.f1004q) {
                        ViewGroup viewGroup = tVar.f994g;
                        if (viewGroup == null) {
                            if (!m1089n0(tVar) || tVar.f994g == null) {
                                return;
                            }
                        } else if (tVar.f1004q && viewGroup.getChildCount() > 0) {
                            tVar.f994g.removeAllViews();
                        }
                        if (!m1088m0(tVar) || !tVar.mo957b()) {
                            tVar.f1004q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = tVar.f995h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        tVar.f994g.setBackgroundResource(tVar.f989b);
                        ViewParent parent = tVar.f995h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(tVar.f995h);
                        }
                        tVar.f994g.addView(tVar.f995h, layoutParams2);
                        if (!tVar.f995h.hasFocus()) {
                            tVar.f995h.requestFocus();
                        }
                    } else {
                        View view = tVar.f996i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            tVar.f1001n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, tVar.f991d, tVar.f992e, 1002, 8519680, -3);
                            layoutParams3.gravity = tVar.f990c;
                            layoutParams3.windowAnimations = tVar.f993f;
                            windowManager.addView(tVar.f994g, layoutParams3);
                            tVar.f1002o = true;
                            return;
                        }
                    }
                    i = -2;
                    tVar.f1001n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, tVar.f991d, tVar.f992e, 1002, 8519680, -3);
                    layoutParams32.gravity = tVar.f990c;
                    layoutParams32.windowAnimations = tVar.f993f;
                    windowManager.addView(tVar.f994g, layoutParams32);
                    tVar.f1002o = true;
                    return;
                }
                return;
            }
            mo899T(tVar, true);
        }
    }

    /* renamed from: E0 */
    private boolean m1065E0(C0299t tVar, int i, KeyEvent keyEvent, int i2) {
        C0335g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f1000m || m1066F0(tVar, keyEvent)) && (gVar = tVar.f997j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f956q == null) {
            mo899T(tVar, true);
        }
        return z;
    }

    /* renamed from: F0 */
    private boolean m1066F0(C0299t tVar, KeyEvent keyEvent) {
        C0403a0 a0Var;
        C0403a0 a0Var2;
        C0403a0 a0Var3;
        if (this.f934R) {
            return false;
        }
        if (tVar.f1000m) {
            return true;
        }
        C0299t tVar2 = this.f929M;
        if (!(tVar2 == null || tVar2 == tVar)) {
            mo899T(tVar2, false);
        }
        Window.Callback k0 = mo911k0();
        if (k0 != null) {
            tVar.f996i = k0.onCreatePanelView(tVar.f988a);
        }
        int i = tVar.f988a;
        boolean z = i == 0 || i == 108;
        if (z && (a0Var3 = this.f956q) != null) {
            a0Var3.mo1513d();
        }
        if (tVar.f996i == null && (!z || !(mo891D0() instanceof C0307m))) {
            if (tVar.f997j == null || tVar.f1005r) {
                if (tVar.f997j == null && (!m1090o0(tVar) || tVar.f997j == null)) {
                    return false;
                }
                if (z && this.f956q != null) {
                    if (this.f957r == null) {
                        this.f957r = new C0286i();
                    }
                    this.f956q.mo1509a(tVar.f997j, this.f957r);
                }
                tVar.f997j.mo1245h0();
                if (!k0.onCreatePanelMenu(tVar.f988a, tVar.f997j)) {
                    tVar.mo958c((C0335g) null);
                    if (z && (a0Var2 = this.f956q) != null) {
                        a0Var2.mo1509a((Menu) null, this.f957r);
                    }
                    return false;
                }
                tVar.f1005r = false;
            }
            tVar.f997j.mo1245h0();
            Bundle bundle = tVar.f1006s;
            if (bundle != null) {
                tVar.f997j.mo1210R(bundle);
                tVar.f1006s = null;
            }
            if (!k0.onPreparePanel(0, tVar.f996i, tVar.f997j)) {
                if (z && (a0Var = this.f956q) != null) {
                    a0Var.mo1509a((Menu) null, this.f957r);
                }
                tVar.f997j.mo1242g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f1003p = z2;
            tVar.f997j.setQwertyMode(z2);
            tVar.f997j.mo1242g0();
        }
        tVar.f1000m = true;
        tVar.f1001n = false;
        this.f929M = tVar;
        return true;
    }

    /* renamed from: G0 */
    private void m1067G0(boolean z) {
        C0403a0 a0Var = this.f956q;
        if (a0Var == null || !a0Var.mo1525h() || (ViewConfiguration.get(this.f949j).hasPermanentMenuKey() && !this.f956q.mo1515e())) {
            C0299t i0 = mo909i0(0, true);
            i0.f1004q = true;
            mo899T(i0, false);
            m1064C0(i0, (KeyEvent) null);
            return;
        }
        Window.Callback k0 = mo911k0();
        if (this.f956q.mo1510b() && z) {
            this.f956q.mo1516f();
            if (!this.f934R) {
                k0.onPanelClosed(108, mo909i0(0, true).f997j);
            }
        } else if (k0 != null && !this.f934R) {
            if (this.f941Y && (this.f942Z & 1) != 0) {
                this.f950k.getDecorView().removeCallbacks(this.f943a0);
                this.f943a0.run();
            }
            C0299t i02 = mo909i0(0, true);
            C0335g gVar = i02.f997j;
            if (gVar != null && !i02.f1005r && k0.onPreparePanel(0, i02.f996i, gVar)) {
                k0.onMenuOpened(108, i02.f997j);
                this.f956q.mo1518g();
            }
        }
    }

    /* renamed from: H0 */
    private int m1068H0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: J0 */
    private boolean m1069J0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f950k.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C3403t.m14613N((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: L */
    private boolean m1070L(boolean z) {
        if (this.f934R) {
            return false;
        }
        int O = m1075O();
        boolean O0 = m1076O0(mo915s0(this.f949j, O), z);
        if (O == 0) {
            m1086h0(this.f949j).mo951e();
        } else {
            C0291m mVar = this.f939W;
            if (mVar != null) {
                mVar.mo950a();
            }
        }
        if (O == 3) {
            m1085g0(this.f949j).mo951e();
        } else {
            C0291m mVar2 = this.f940X;
            if (mVar2 != null) {
                mVar2.mo950a();
            }
        }
        return O0;
    }

    /* renamed from: M */
    private void m1071M() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f917A.findViewById(16908290);
        View decorView = this.f950k.getDecorView();
        contentFrameLayout.mo1663b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f949j.obtainStyledAttributes(C3132j.AppCompatTheme);
        obtainStyledAttributes.getValue(C3132j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C3132j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C3132j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C3132j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C3132j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C3132j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C3132j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C3132j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C3132j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C3132j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: M0 */
    private void m1072M0() {
        if (this.f965z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: N */
    private void m1073N(Window window) {
        if (this.f950k == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0289k)) {
                C0289k kVar = new C0289k(callback);
                this.f951l = kVar;
                window.setCallback(kVar);
                C0479u0 u = C0479u0.m2147u(this.f949j, (AttributeSet) null, f913h0);
                Drawable h = u.mo2350h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo2362w();
                this.f950k = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: N0 */
    private C0273e m1074N0() {
        Context context = this.f949j;
        while (context != null) {
            if (!(context instanceof C0273e)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0273e) context;
            }
        }
        return null;
    }

    /* renamed from: O */
    private int m1075O() {
        int i = this.f935S;
        return i != -100 ? i : C0275g.m1037l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1076O0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f949j
            r1 = 0
            android.content.res.Configuration r0 = r6.m1080U(r0, r7, r1)
            boolean r2 = r6.m1092q0()
            android.content.Context r3 = r6.f949j
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f931O
            if (r8 == 0) goto L_0x0047
            boolean r8 = f914i0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f932P
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f948i
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f948i
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0559a.m2637m(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m1077P0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f948i
            boolean r0 = r8 instanceof androidx.appcompat.app.C0273e
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.e r8 = (androidx.appcompat.app.C0273e) r8
            r8.mo831K(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0276h.m1076O0(int, boolean):boolean");
    }

    /* renamed from: P0 */
    private void m1077P0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f949j.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            C0306l.m1225a(resources);
        }
        int i2 = this.f936T;
        if (i2 != 0) {
            this.f949j.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f949j.getTheme().applyStyle(this.f936T, true);
            }
        }
        if (z) {
            Object obj = this.f948i;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0717i) {
                    if (!((C0717i) activity).mo720a().mo3668b().mo3670e(C0710e.C0712b.STARTED)) {
                        return;
                    }
                } else if (!this.f933Q) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    /* renamed from: R */
    private void m1078R() {
        C0291m mVar = this.f939W;
        if (mVar != null) {
            mVar.mo950a();
        }
        C0291m mVar2 = this.f940X;
        if (mVar2 != null) {
            mVar2.mo950a();
        }
    }

    /* renamed from: R0 */
    private void m1079R0(View view) {
        int i;
        Context context;
        if ((C3403t.m14607H(view) & 8192) != 0) {
            context = this.f949j;
            i = C3125c.abc_decor_view_status_guard_light;
        } else {
            context = this.f949j;
            i = C3125c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(C3267a.m14074d(context, i));
    }

    /* renamed from: U */
    private Configuration m1080U(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: V */
    private ViewGroup m1081V() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f949j.obtainStyledAttributes(C3132j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C3132j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C3132j.AppCompatTheme_windowNoTitle, false)) {
                mo863C(1);
            } else if (obtainStyledAttributes.getBoolean(C3132j.AppCompatTheme_windowActionBar, false)) {
                mo863C(108);
            }
            if (obtainStyledAttributes.getBoolean(C3132j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo863C(109);
            }
            if (obtainStyledAttributes.getBoolean(C3132j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo863C(10);
            }
            this.f925I = obtainStyledAttributes.getBoolean(C3132j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m1083c0();
            this.f950k.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f949j);
            if (this.f926J) {
                viewGroup = (ViewGroup) from.inflate(this.f924H ? C3129g.abc_screen_simple_overlay_action_mode : C3129g.abc_screen_simple, (ViewGroup) null);
            } else if (this.f925I) {
                viewGroup = (ViewGroup) from.inflate(C3129g.abc_dialog_title_material, (ViewGroup) null);
                this.f923G = false;
                this.f922F = false;
            } else if (this.f922F) {
                TypedValue typedValue = new TypedValue();
                this.f949j.getTheme().resolveAttribute(C3123a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C3158d(this.f949j, typedValue.resourceId) : this.f949j).inflate(C3129g.abc_screen_toolbar, (ViewGroup) null);
                C0403a0 a0Var = (C0403a0) viewGroup.findViewById(C3128f.decor_content_parent);
                this.f956q = a0Var;
                a0Var.setWindowCallback(mo911k0());
                if (this.f923G) {
                    this.f956q.mo1528k(109);
                }
                if (this.f920D) {
                    this.f956q.mo1528k(2);
                }
                if (this.f921E) {
                    this.f956q.mo1528k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C3403t.m14667u0(viewGroup, new C0279c());
                } else if (viewGroup instanceof C0424e0) {
                    ((C0424e0) viewGroup).setOnFitSystemWindowsListener(new C0280d());
                }
                if (this.f956q == null) {
                    this.f918B = (TextView) viewGroup.findViewById(C3128f.title);
                }
                C0404a1.m1829c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C3128f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f950k.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f950k.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0281e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f922F + ", windowActionBarOverlay: " + this.f923G + ", android:windowIsFloating: " + this.f925I + ", windowActionModeOverlay: " + this.f924H + ", windowNoTitle: " + this.f926J + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: b0 */
    private void m1082b0() {
        if (!this.f965z) {
            this.f917A = m1081V();
            CharSequence j0 = mo910j0();
            if (!TextUtils.isEmpty(j0)) {
                C0403a0 a0Var = this.f956q;
                if (a0Var != null) {
                    a0Var.setWindowTitle(j0);
                } else if (mo891D0() != null) {
                    mo891D0().mo787x(j0);
                } else {
                    TextView textView = this.f918B;
                    if (textView != null) {
                        textView.setText(j0);
                    }
                }
            }
            m1071M();
            mo890B0(this.f917A);
            this.f965z = true;
            C0299t i0 = mo909i0(0, false);
            if (this.f934R) {
                return;
            }
            if (i0 == null || i0.f997j == null) {
                m1091p0(108);
            }
        }
    }

    /* renamed from: c0 */
    private void m1083c0() {
        if (this.f950k == null) {
            Object obj = this.f948i;
            if (obj instanceof Activity) {
                m1073N(((Activity) obj).getWindow());
            }
        }
        if (this.f950k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: e0 */
    private static Configuration m1084e0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                C0295p.m1183a(configuration, configuration2, configuration3);
            } else if (!C3344c.m14350a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i5 = configuration.touchscreen;
            int i6 = configuration2.touchscreen;
            if (i5 != i6) {
                configuration3.touchscreen = i6;
            }
            int i7 = configuration.keyboard;
            int i8 = configuration2.keyboard;
            if (i7 != i8) {
                configuration3.keyboard = i8;
            }
            int i9 = configuration.keyboardHidden;
            int i10 = configuration2.keyboardHidden;
            if (i9 != i10) {
                configuration3.keyboardHidden = i10;
            }
            int i11 = configuration.navigation;
            int i12 = configuration2.navigation;
            if (i11 != i12) {
                configuration3.navigation = i12;
            }
            int i13 = configuration.navigationHidden;
            int i14 = configuration2.navigationHidden;
            if (i13 != i14) {
                configuration3.navigationHidden = i14;
            }
            int i15 = configuration.orientation;
            int i16 = configuration2.orientation;
            if (i15 != i16) {
                configuration3.orientation = i16;
            }
            int i17 = configuration.screenLayout & 15;
            int i18 = configuration2.screenLayout;
            if (i17 != (i18 & 15)) {
                configuration3.screenLayout |= i18 & 15;
            }
            int i19 = configuration.screenLayout & 192;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 192)) {
                configuration3.screenLayout |= i20 & 192;
            }
            int i21 = configuration.screenLayout & 48;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 48)) {
                configuration3.screenLayout |= i22 & 48;
            }
            int i23 = configuration.screenLayout & 768;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 768)) {
                configuration3.screenLayout |= i24 & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                C0296q.m1184a(configuration, configuration2, configuration3);
            }
            int i25 = configuration.uiMode & 15;
            int i26 = configuration2.uiMode;
            if (i25 != (i26 & 15)) {
                configuration3.uiMode |= i26 & 15;
            }
            int i27 = configuration.uiMode & 48;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 48)) {
                configuration3.uiMode |= i28 & 48;
            }
            int i29 = configuration.screenWidthDp;
            int i30 = configuration2.screenWidthDp;
            if (i29 != i30) {
                configuration3.screenWidthDp = i30;
            }
            int i31 = configuration.screenHeightDp;
            int i32 = configuration2.screenHeightDp;
            if (i31 != i32) {
                configuration3.screenHeightDp = i32;
            }
            int i33 = configuration.smallestScreenWidthDp;
            int i34 = configuration2.smallestScreenWidthDp;
            if (i33 != i34) {
                configuration3.smallestScreenWidthDp = i34;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                C0294o.m1182a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: g0 */
    private C0291m m1085g0(Context context) {
        if (this.f940X == null) {
            this.f940X = new C0290l(context);
        }
        return this.f940X;
    }

    /* renamed from: h0 */
    private C0291m m1086h0(Context context) {
        if (this.f939W == null) {
            this.f939W = new C0293n(C0314o.m1258a(context));
        }
        return this.f939W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1087l0() {
        /*
            r3 = this;
            r3.m1082b0()
            boolean r0 = r3.f922F
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f953n
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f948i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.p r0 = new androidx.appcompat.app.p
            java.lang.Object r1 = r3.f948i
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f923G
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f953n = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.p r0 = new androidx.appcompat.app.p
            java.lang.Object r1 = r3.f948i
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f953n
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f944b0
            r0.mo781r(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0276h.m1087l0():void");
    }

    /* renamed from: m0 */
    private boolean m1088m0(C0299t tVar) {
        View view = tVar.f996i;
        if (view != null) {
            tVar.f995h = view;
            return true;
        } else if (tVar.f997j == null) {
            return false;
        } else {
            if (this.f958s == null) {
                this.f958s = new C0300u();
            }
            View view2 = (View) tVar.mo956a(this.f958s);
            tVar.f995h = view2;
            return view2 != null;
        }
    }

    /* renamed from: n0 */
    private boolean m1089n0(C0299t tVar) {
        tVar.mo959d(mo908f0());
        tVar.f994g = new C0298s(tVar.f999l);
        tVar.f990c = 81;
        return true;
    }

    /* renamed from: o0 */
    private boolean m1090o0(C0299t tVar) {
        Context context = this.f949j;
        int i = tVar.f988a;
        if ((i == 0 || i == 108) && this.f956q != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C3123a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C3123a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C3123a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C3158d dVar = new C3158d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0335g gVar = new C0335g(context);
        gVar.mo1214V(this);
        tVar.mo958c(gVar);
        return true;
    }

    /* renamed from: p0 */
    private void m1091p0(int i) {
        this.f942Z = (1 << i) | this.f942Z;
        if (!this.f941Y) {
            C3403t.m14627a0(this.f950k.getDecorView(), this.f943a0);
            this.f941Y = true;
        }
    }

    /* renamed from: q0 */
    private boolean m1092q0() {
        if (!this.f938V && (this.f948i instanceof Activity)) {
            PackageManager packageManager = this.f949j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f949j, this.f948i.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : Build.VERSION.SDK_INT >= 24 ? 786432 : 0);
                this.f937U = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f937U = false;
            }
        }
        this.f938V = true;
        return this.f937U;
    }

    /* renamed from: v0 */
    private boolean m1093v0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0299t i0 = mo909i0(i, true);
        if (!i0.f1002o) {
            return m1066F0(i0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1094y0(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            f.a.o.b r0 = r3.f959t
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$t r2 = r3.mo909i0(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.a0 r4 = r3.f956q
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo1525h()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f949j
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.a0 r4 = r3.f956q
            boolean r4 = r4.mo1510b()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f934R
            if (r4 != 0) goto L_0x0062
            boolean r4 = r3.m1066F0(r2, r5)
            if (r4 == 0) goto L_0x0062
            androidx.appcompat.widget.a0 r4 = r3.f956q
            boolean r0 = r4.mo1518g()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.a0 r4 = r3.f956q
            boolean r0 = r4.mo1516f()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f1002o
            if (r4 != 0) goto L_0x0064
            boolean r4 = r2.f1001n
            if (r4 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r4 = r2.f1000m
            if (r4 == 0) goto L_0x0062
            boolean r4 = r2.f1005r
            if (r4 == 0) goto L_0x005b
            r2.f1000m = r1
            boolean r4 = r3.m1066F0(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0062
            r3.m1064C0(r2, r5)
            goto L_0x006a
        L_0x0062:
            r0 = 0
            goto L_0x006a
        L_0x0064:
            boolean r4 = r2.f1002o
            r3.mo899T(r2, r0)
            r0 = r4
        L_0x006a:
            if (r0 == 0) goto L_0x0087
            android.content.Context r4 = r3.f949j
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L_0x0080
            r4.playSoundEffect(r1)
            goto L_0x0087
        L_0x0080:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0276h.m1094y0(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo889A0(int i) {
        if (i == 108) {
            C0259a p = mo878p();
            if (p != null) {
                p.mo772i(false);
            }
        } else if (i == 0) {
            C0299t i0 = mo909i0(i, true);
            if (i0.f1002o) {
                mo899T(i0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo890B0(ViewGroup viewGroup) {
    }

    /* renamed from: C */
    public boolean mo863C(int i) {
        int H0 = m1068H0(i);
        if (this.f926J && H0 == 108) {
            return false;
        }
        if (this.f922F && H0 == 1) {
            this.f922F = false;
        }
        if (H0 == 1) {
            m1072M0();
            this.f926J = true;
            return true;
        } else if (H0 == 2) {
            m1072M0();
            this.f920D = true;
            return true;
        } else if (H0 == 5) {
            m1072M0();
            this.f921E = true;
            return true;
        } else if (H0 == 10) {
            m1072M0();
            this.f924H = true;
            return true;
        } else if (H0 == 108) {
            m1072M0();
            this.f922F = true;
            return true;
        } else if (H0 != 109) {
            return this.f950k.requestFeature(H0);
        } else {
            m1072M0();
            this.f923G = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final C0259a mo891D0() {
        return this.f953n;
    }

    /* renamed from: E */
    public void mo864E(int i) {
        m1082b0();
        ViewGroup viewGroup = (ViewGroup) this.f917A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f949j).inflate(i, viewGroup);
        this.f951l.mo10957a().onContentChanged();
    }

    /* renamed from: F */
    public void mo865F(View view) {
        m1082b0();
        ViewGroup viewGroup = (ViewGroup) this.f917A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f951l.mo10957a().onContentChanged();
    }

    /* renamed from: G */
    public void mo866G(View view, ViewGroup.LayoutParams layoutParams) {
        m1082b0();
        ViewGroup viewGroup = (ViewGroup) this.f917A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f951l.mo10957a().onContentChanged();
    }

    /* renamed from: I */
    public void mo867I(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f948i instanceof Activity) {
            C0259a p = mo878p();
            if (!(p instanceof C0316p)) {
                this.f954o = null;
                if (p != null) {
                    p.mo777n();
                }
                if (toolbar != null) {
                    C0307m mVar = new C0307m(toolbar, mo910j0(), this.f951l);
                    this.f953n = mVar;
                    window = this.f950k;
                    callback = mVar.mo992A();
                } else {
                    this.f953n = null;
                    window = this.f950k;
                    callback = this.f951l;
                }
                window.setCallback(callback);
                mo880r();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f917A;
     */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo892I0() {
        /*
            r1 = this;
            boolean r0 = r1.f965z
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f917A
            if (r0 == 0) goto L_0x0010
            boolean r0 = p086f.p111h.p122m.C3403t.m14614O(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0276h.mo892I0():boolean");
    }

    /* renamed from: J */
    public void mo868J(int i) {
        this.f936T = i;
    }

    /* renamed from: K */
    public final void mo869K(CharSequence charSequence) {
        this.f955p = charSequence;
        C0403a0 a0Var = this.f956q;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
        } else if (mo891D0() != null) {
            mo891D0().mo787x(charSequence);
        } else {
            TextView textView = this.f918B;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: K0 */
    public C3155b mo893K0(C3155b.C3156a aVar) {
        C0274f fVar;
        if (aVar != null) {
            C3155b bVar = this.f959t;
            if (bVar != null) {
                bVar.mo1016c();
            }
            C0287j jVar = new C0287j(aVar);
            C0259a p = mo878p();
            if (p != null) {
                C3155b y = p.mo788y(jVar);
                this.f959t = y;
                if (!(y == null || (fVar = this.f952m) == null)) {
                    fVar.mo845h(y);
                }
            }
            if (this.f959t == null) {
                this.f959t = mo894L0(jVar);
            }
            return this.f959t;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p086f.p087a.p094o.C3155b mo894L0(p086f.p087a.p094o.C3155b.C3156a r8) {
        /*
            r7 = this;
            r7.mo905a0()
            f.a.o.b r0 = r7.f959t
            if (r0 == 0) goto L_0x000a
            r0.mo1016c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0276h.C0287j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.h$j r0 = new androidx.appcompat.app.h$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.f r0 = r7.f952m
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f934R
            if (r2 != 0) goto L_0x0022
            f.a.o.b r0 = r0.mo858s(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f959t = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f960u
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f925I
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f949j
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p086f.p087a.C3123a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f949j
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            f.a.o.d r4 = new f.a.o.d
            android.content.Context r6 = r7.f949j
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f949j
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f960u = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p086f.p087a.C3123a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f961v = r5
            r6 = 2
            androidx.core.widget.C0607h.m2885b(r5, r6)
            android.widget.PopupWindow r5 = r7.f961v
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f960u
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f961v
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p086f.p087a.C3123a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f960u
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f961v
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.h$f r0 = new androidx.appcompat.app.h$f
            r0.<init>()
            r7.f962w = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f917A
            int r4 = p086f.p087a.C3128f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo908f0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1925a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f960u = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f960u
            if (r0 == 0) goto L_0x0161
            r7.mo905a0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f960u
            r0.mo1495k()
            f.a.o.e r0 = new f.a.o.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f960u
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f960u
            android.widget.PopupWindow r6 = r7.f961v
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo1018e()
            boolean r8 = r8.mo935d(r0, r3)
            if (r8 == 0) goto L_0x015f
            r0.mo1022k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            r8.mo1493h(r0)
            r7.f959t = r0
            boolean r8 = r7.mo892I0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            f.h.m.x r8 = p086f.p111h.p122m.C3403t.m14630c(r8)
            r8.mo11730a(r0)
            r7.f963x = r8
            androidx.appcompat.app.h$g r0 = new androidx.appcompat.app.h$g
            r0.<init>()
            r8.mo11735f(r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f960u
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p086f.p111h.p122m.C3403t.m14637f0(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.f961v
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.f950k
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f962w
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.f959t = r1
        L_0x0161:
            f.a.o.b r8 = r7.f959t
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.f r0 = r7.f952m
            if (r0 == 0) goto L_0x016c
            r0.mo845h(r8)
        L_0x016c:
            f.a.o.b r8 = r7.f959t
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0276h.mo894L0(f.a.o.b$a):f.a.o.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo895P(int i, C0299t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i >= 0) {
                C0299t[] tVarArr = this.f928L;
                if (i < tVarArr.length) {
                    tVar = tVarArr[i];
                }
            }
            if (tVar != null) {
                menu = tVar.f997j;
            }
        }
        if ((tVar == null || tVar.f1002o) && !this.f934R) {
            this.f951l.mo10957a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo896Q(C0335g gVar) {
        if (!this.f927K) {
            this.f927K = true;
            this.f956q.mo1529l();
            Window.Callback k0 = mo911k0();
            if (k0 != null && !this.f934R) {
                k0.onPanelClosed(108, gVar);
            }
            this.f927K = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public final int mo897Q0(C3356b0 b0Var, Rect rect) {
        boolean z;
        boolean z2;
        int i = 0;
        int h = b0Var != null ? b0Var.mo11565h() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f960u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f960u.getLayoutParams();
            boolean z3 = true;
            if (this.f960u.isShown()) {
                if (this.f945c0 == null) {
                    this.f945c0 = new Rect();
                    this.f946d0 = new Rect();
                }
                Rect rect2 = this.f945c0;
                Rect rect3 = this.f946d0;
                if (b0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(b0Var.mo11563f(), b0Var.mo11565h(), b0Var.mo11564g(), b0Var.mo11561e());
                }
                C0404a1.m1827a(this.f917A, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                C3356b0 F = C3403t.m14605F(this.f917A);
                int f = F == null ? 0 : F.mo11563f();
                int g = F == null ? 0 : F.mo11564g();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.f919C != null) {
                    View view = this.f919C;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == f && marginLayoutParams2.rightMargin == g)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = f;
                            marginLayoutParams2.rightMargin = g;
                            this.f919C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f949j);
                    this.f919C = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = f;
                    layoutParams.rightMargin = g;
                    this.f917A.addView(this.f919C, -1, layoutParams);
                }
                if (this.f919C == null) {
                    z3 = false;
                }
                if (z3 && this.f919C.getVisibility() != 0) {
                    m1079R0(this.f919C);
                }
                if (!this.f924H && z3) {
                    h = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f960u.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f919C;
        if (view3 != null) {
            if (!z) {
                i = 8;
            }
            view3.setVisibility(i);
        }
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo898S(int i) {
        mo899T(mo909i0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo899T(C0299t tVar, boolean z) {
        ViewGroup viewGroup;
        C0403a0 a0Var;
        if (!z || tVar.f988a != 0 || (a0Var = this.f956q) == null || !a0Var.mo1510b()) {
            WindowManager windowManager = (WindowManager) this.f949j.getSystemService("window");
            if (!(windowManager == null || !tVar.f1002o || (viewGroup = tVar.f994g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo895P(tVar.f988a, tVar, (Menu) null);
                }
            }
            tVar.f1000m = false;
            tVar.f1001n = false;
            tVar.f1002o = false;
            tVar.f995h = null;
            tVar.f1004q = true;
            if (this.f929M == tVar) {
                this.f929M = null;
                return;
            }
            return;
        }
        mo896Q(tVar.f997j);
    }

    /* renamed from: W */
    public View mo900W(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C0304k kVar;
        boolean z2 = false;
        if (this.f947e0 == null) {
            String string = this.f949j.obtainStyledAttributes(C3132j.AppCompatTheme).getString(C3132j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                kVar = new C0304k();
            } else {
                try {
                    this.f947e0 = (C0304k) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    kVar = new C0304k();
                }
            }
            this.f947e0 = kVar;
        }
        if (f912g0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m1069J0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f947e0.mo990q(view, str, context, attributeSet, z, f912g0, true, C0508z0.m2332c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo901X() {
        C0335g gVar;
        C0403a0 a0Var = this.f956q;
        if (a0Var != null) {
            a0Var.mo1529l();
        }
        if (this.f961v != null) {
            this.f950k.getDecorView().removeCallbacks(this.f962w);
            if (this.f961v.isShowing()) {
                try {
                    this.f961v.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f961v = null;
        }
        mo905a0();
        C0299t i0 = mo909i0(0, false);
        if (i0 != null && (gVar = i0.f997j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo902Y(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f948i;
        boolean z = true;
        if (((obj instanceof C3387e.C3388a) || (obj instanceof C0301i)) && (decorView = this.f950k.getDecorView()) != null && C3387e.m14548d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f951l.mo10957a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo917u0(keyCode, keyEvent) : mo919x0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo903Z(int i) {
        C0299t i0;
        C0299t i02 = mo909i0(i, true);
        if (i02.f997j != null) {
            Bundle bundle = new Bundle();
            i02.f997j.mo1212T(bundle);
            if (bundle.size() > 0) {
                i02.f1006s = bundle;
            }
            i02.f997j.mo1245h0();
            i02.f997j.clear();
        }
        i02.f1005r = true;
        i02.f1004q = true;
        if ((i == 108 || i == 0) && this.f956q != null && (i0 = mo909i0(0, false)) != null) {
            i0.f1000m = false;
            m1066F0(i0, (KeyEvent) null);
        }
    }

    /* renamed from: a */
    public boolean mo904a(C0335g gVar, MenuItem menuItem) {
        C0299t d0;
        Window.Callback k0 = mo911k0();
        if (k0 == null || this.f934R || (d0 = mo907d0(gVar.mo1199F())) == null) {
            return false;
        }
        return k0.onMenuItemSelected(d0.f988a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo905a0() {
        C3418x xVar = this.f963x;
        if (xVar != null) {
            xVar.mo11731b();
        }
    }

    /* renamed from: b */
    public void mo906b(C0335g gVar) {
        m1067G0(true);
    }

    /* renamed from: d */
    public void mo870d(View view, ViewGroup.LayoutParams layoutParams) {
        m1082b0();
        ((ViewGroup) this.f917A.findViewById(16908290)).addView(view, layoutParams);
        this.f951l.mo10957a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public C0299t mo907d0(Menu menu) {
        C0299t[] tVarArr = this.f928L;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0299t tVar = tVarArr[i];
            if (tVar != null && tVar.f997j == menu) {
                return tVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo871e() {
        return m1070L(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final Context mo908f0() {
        C0259a p = mo878p();
        Context k = p != null ? p.mo774k() : null;
        return k == null ? this.f949j : k;
    }

    /* renamed from: h */
    public Context mo873h(Context context) {
        boolean z = true;
        this.f931O = true;
        int s0 = mo915s0(context, m1075O());
        Configuration configuration = null;
        if (f915j0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0297r.m1185a((ContextThemeWrapper) context, m1080U(context, s0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C3158d) {
            try {
                ((C3158d) context).mo10912a(m1080U(context, s0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f914i0) {
            super.mo873h(context);
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m1084e0(configuration2, configuration3);
            }
            Configuration U = m1080U(context, s0, configuration);
            C3158d dVar = new C3158d(context, C3131i.Theme_AppCompat_Empty);
            dVar.mo10912a(U);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                C3279f.C3283b.m14136a(dVar.getTheme());
            }
            super.mo873h(dVar);
            return dVar;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Application failed to obtain resources from itself", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public C0299t mo909i0(int i, boolean z) {
        C0299t[] tVarArr = this.f928L;
        if (tVarArr == null || tVarArr.length <= i) {
            C0299t[] tVarArr2 = new C0299t[(i + 1)];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f928L = tVarArr2;
            tVarArr = tVarArr2;
        }
        C0299t tVar = tVarArr[i];
        if (tVar != null) {
            return tVar;
        }
        C0299t tVar2 = new C0299t(i);
        tVarArr[i] = tVar2;
        return tVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final CharSequence mo910j0() {
        Object obj = this.f948i;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f955p;
    }

    /* renamed from: k */
    public <T extends View> T mo874k(int i) {
        m1082b0();
        return this.f950k.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final Window.Callback mo911k0() {
        return this.f950k.getCallback();
    }

    /* renamed from: m */
    public final C0263b.C0265b mo875m() {
        return new C0285h();
    }

    /* renamed from: n */
    public int mo876n() {
        return this.f935S;
    }

    /* renamed from: o */
    public MenuInflater mo877o() {
        if (this.f954o == null) {
            m1087l0();
            C0259a aVar = this.f953n;
            this.f954o = new C3162g(aVar != null ? aVar.mo774k() : this.f949j);
        }
        return this.f954o;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo900W(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public C0259a mo878p() {
        m1087l0();
        return this.f953n;
    }

    /* renamed from: q */
    public void mo879q() {
        LayoutInflater from = LayoutInflater.from(this.f949j);
        if (from.getFactory() == null) {
            C3389f.m14553b(from, this);
        } else if (!(from.getFactory2() instanceof C0276h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: r */
    public void mo880r() {
        C0259a p = mo878p();
        if (p == null || !p.mo775l()) {
            m1091p0(0);
        }
    }

    /* renamed from: r0 */
    public boolean mo914r0() {
        return this.f964y;
    }

    /* renamed from: s */
    public void mo881s(Configuration configuration) {
        C0259a p;
        if (this.f922F && this.f965z && (p = mo878p()) != null) {
            p.mo776m(configuration);
        }
        C0441i.m2009b().mo2165g(this.f949j);
        m1070L(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public int mo915s0(Context context, int i) {
        C0291m h0;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        h0 = m1085g0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                h0 = m1086h0(context);
            }
            return h0.mo948c();
        }
        return i;
    }

    /* renamed from: t */
    public void mo882t(Bundle bundle) {
        this.f931O = true;
        m1070L(false);
        m1083c0();
        Object obj = this.f948i;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0573f.m2662c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0259a D0 = mo891D0();
                if (D0 == null) {
                    this.f944b0 = true;
                } else {
                    D0.mo781r(true);
                }
            }
            C0275g.m1033c(this);
        }
        this.f932P = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo916t0() {
        C3155b bVar = this.f959t;
        if (bVar != null) {
            bVar.mo1016c();
            return true;
        }
        C0259a p = mo878p();
        return p != null && p.mo771h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo883u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f948i
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0275g.m1029A(r3)
        L_0x0009:
            boolean r0 = r3.f941Y
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f950k
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f943a0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f933Q = r0
            r0 = 1
            r3.f934R = r0
            int r0 = r3.f935S
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f948i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            f.e.g<java.lang.String, java.lang.Integer> r0 = f911f0
            java.lang.Object r1 = r3.f948i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f935S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            f.e.g<java.lang.String, java.lang.Integer> r0 = f911f0
            java.lang.Object r1 = r3.f948i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f953n
            if (r0 == 0) goto L_0x005e
            r0.mo777n()
        L_0x005e:
            r3.m1078R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0276h.mo883u():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo917u0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f930N = z;
        } else if (i == 82) {
            m1093v0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public void mo884v(Bundle bundle) {
        m1082b0();
    }

    /* renamed from: w */
    public void mo885w() {
        C0259a p = mo878p();
        if (p != null) {
            p.mo786w(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public boolean mo918w0(int i, KeyEvent keyEvent) {
        C0259a p = mo878p();
        if (p != null && p.mo778o(i, keyEvent)) {
            return true;
        }
        C0299t tVar = this.f929M;
        if (tVar == null || !m1065E0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f929M == null) {
                C0299t i0 = mo909i0(0, true);
                m1066F0(i0, keyEvent);
                boolean E0 = m1065E0(i0, keyEvent.getKeyCode(), keyEvent, 1);
                i0.f1000m = false;
                if (E0) {
                    return true;
                }
            }
            return false;
        }
        C0299t tVar2 = this.f929M;
        if (tVar2 != null) {
            tVar2.f1001n = true;
        }
        return true;
    }

    /* renamed from: x */
    public void mo886x(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public boolean mo919x0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f930N;
            this.f930N = false;
            C0299t i0 = mo909i0(0, false);
            if (i0 != null && i0.f1002o) {
                if (!z) {
                    mo899T(i0, true);
                }
                return true;
            } else if (mo916t0()) {
                return true;
            }
        } else if (i == 82) {
            m1094y0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public void mo887y() {
        this.f933Q = true;
        mo871e();
    }

    /* renamed from: z */
    public void mo888z() {
        this.f933Q = false;
        C0259a p = mo878p();
        if (p != null) {
            p.mo786w(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo920z0(int i) {
        C0259a p;
        if (i == 108 && (p = mo878p()) != null) {
            p.mo772i(true);
        }
    }
}
