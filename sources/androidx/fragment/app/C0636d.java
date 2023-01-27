package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0245c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0559a;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0718j;
import androidx.lifecycle.C0741v;
import androidx.lifecycle.C0742w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p086f.p102e.C3204h;
import p086f.p137o.p138a.C3458a;

/* renamed from: androidx.fragment.app.d */
public class C0636d extends ComponentActivity implements C0559a.C0561b, C0559a.C0563d {

    /* renamed from: l */
    final C0647h f2695l = C0647h.m3206b(new C0637a());

    /* renamed from: m */
    final C0718j f2696m = new C0718j(this);

    /* renamed from: n */
    boolean f2697n;

    /* renamed from: o */
    boolean f2698o;

    /* renamed from: p */
    boolean f2699p = true;

    /* renamed from: q */
    boolean f2700q;

    /* renamed from: r */
    boolean f2701r;

    /* renamed from: s */
    boolean f2702s;

    /* renamed from: t */
    int f2703t;

    /* renamed from: u */
    C3204h<String> f2704u;

    /* renamed from: androidx.fragment.app.d$a */
    class C0637a extends C0649j<C0636d> implements C0742w, C0245c {
        public C0637a() {
            super(C0636d.this);
        }

        /* renamed from: a */
        public C0710e mo720a() {
            return C0636d.this.f2696m;
        }

        /* renamed from: c */
        public OnBackPressedDispatcher mo721c() {
            return C0636d.this.mo721c();
        }

        /* renamed from: e */
        public View mo3249e(int i) {
            return C0636d.this.findViewById(i);
        }

        /* renamed from: f */
        public boolean mo3250f() {
            Window window = C0636d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: j */
        public void mo3318j(Fragment fragment) {
            C0636d.this.mo3298C(fragment);
        }

        /* renamed from: l */
        public LayoutInflater mo3320l() {
            return C0636d.this.getLayoutInflater().cloneInContext(C0636d.this);
        }

        /* renamed from: m */
        public boolean mo3321m(Fragment fragment) {
            return !C0636d.this.isFinishing();
        }

        /* renamed from: n */
        public void mo3322n(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C0636d.this.mo3301F(fragment, intent, i, bundle);
        }

        /* renamed from: o */
        public void mo3323o() {
            C0636d.this.mo827G();
        }

        /* renamed from: p */
        public C0636d mo3319k() {
            return C0636d.this;
        }

        /* renamed from: q */
        public C0741v mo725q() {
            return C0636d.this.mo725q();
        }
    }

    /* renamed from: A */
    private void m3174A() {
        do {
        } while (m3175B(mo3317z(), C0710e.C0712b.CREATED));
    }

    /* renamed from: B */
    private static boolean m3175B(C0653m mVar, C0710e.C0712b bVar) {
        boolean z = false;
        for (Fragment next : mVar.mo3435f0()) {
            if (next != null) {
                if (next.mo3140E() != null) {
                    z |= m3175B(next.mo3240x(), bVar);
                }
                if (next.mo720a().mo3668b().mo3670e(C0710e.C0712b.STARTED)) {
                    next.f2614V.mo3673p(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: w */
    private int m3176w(Fragment fragment) {
        if (this.f2704u.mo11160q() < 65534) {
            while (this.f2704u.mo11155i(this.f2703t) >= 0) {
                this.f2703t = (this.f2703t + 1) % 65534;
            }
            int i = this.f2703t;
            this.f2704u.mo11158n(i, fragment.f2623j);
            this.f2703t = (this.f2703t + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: x */
    static void m3177x(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: C */
    public void mo3298C(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: D */
    public boolean mo3299D(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo3300E() {
        this.f2696m.mo3671i(C0710e.C0711a.ON_RESUME);
        this.f2695l.mo3365p();
    }

    /* renamed from: F */
    public void mo3301F(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.f2702s = true;
        if (i == -1) {
            try {
                C0559a.m2640p(this, intent, -1, bundle);
            } finally {
                this.f2702s = false;
            }
        } else {
            m3177x(i);
            C0559a.m2640p(this, intent, ((m3176w(fragment) + 1) << 16) + (i & 65535), bundle);
            this.f2702s = false;
        }
    }

    @Deprecated
    /* renamed from: G */
    public void mo827G() {
        invalidateOptionsMenu();
    }

    /* renamed from: b */
    public final void mo2809b(int i) {
        if (!this.f2700q && i != -1) {
            m3177x(i);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2697n);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2698o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2699p);
        if (getApplication() != null) {
            C3458a.m14938b(this).mo11844a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2695l.mo3370u().mo3413M(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2695l.mo3371v();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String f = this.f2704u.mo11153f(i4);
            this.f2704u.mo11159p(i4);
            if (f == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f2695l.mo3369t(f);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f);
                return;
            }
            t.mo3207k0(i & 65535, i2, intent);
            return;
        }
        C0559a.C0562c l = C0559a.m2636l();
        if (l == null || !l.mo2807a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2695l.mo3371v();
        this.f2695l.mo3353d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f2695l.mo3351a((Fragment) null);
        if (bundle != null) {
            this.f2695l.mo3373x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2703t = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2704u = new C3204h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f2704u.mo11158n(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f2704u == null) {
            this.f2704u = new C3204h<>();
            this.f2703t = 0;
        }
        super.onCreate(bundle);
        this.f2696m.mo3671i(C0710e.C0711a.ON_CREATE);
        this.f2695l.mo3355f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f2695l.mo3356g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View y = mo3316y(view, str, context, attributeSet);
        return y == null ? super.onCreateView(view, str, context, attributeSet) : y;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View y = mo3316y((View) null, str, context, attributeSet);
        return y == null ? super.onCreateView(str, context, attributeSet) : y;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2695l.mo3357h();
        this.f2696m.mo3671i(C0710e.C0711a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2695l.mo3358i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2695l.mo3360k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2695l.mo3354e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2695l.mo3359j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2695l.mo3371v();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2695l.mo3361l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2698o = false;
        this.f2695l.mo3362m();
        this.f2696m.mo3671i(C0710e.C0711a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2695l.mo3363n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo3300E();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? mo3299D(view, menu) | this.f2695l.mo3364o(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2695l.mo3371v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String f = this.f2704u.mo11153f(i3);
            this.f2704u.mo11159p(i3);
            if (f == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f2695l.mo3369t(f);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f);
                return;
            }
            t.mo3155J0(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f2698o = true;
        this.f2695l.mo3371v();
        this.f2695l.mo3368s();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m3174A();
        this.f2696m.mo3671i(C0710e.C0711a.ON_STOP);
        Parcelable y = this.f2695l.mo3374y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.f2704u.mo11160q() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2703t);
            int[] iArr = new int[this.f2704u.mo11160q()];
            String[] strArr = new String[this.f2704u.mo11160q()];
            for (int i = 0; i < this.f2704u.mo11160q(); i++) {
                iArr[i] = this.f2704u.mo11157l(i);
                strArr[i] = this.f2704u.mo11161r(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2699p = false;
        if (!this.f2697n) {
            this.f2697n = true;
            this.f2695l.mo3352c();
        }
        this.f2695l.mo3371v();
        this.f2695l.mo3368s();
        this.f2696m.mo3671i(C0710e.C0711a.ON_START);
        this.f2695l.mo3366q();
    }

    public void onStateNotSaved() {
        this.f2695l.mo3371v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f2699p = true;
        m3174A();
        this.f2695l.mo3367r();
        this.f2696m.mo3671i(C0710e.C0711a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f2702s && i != -1) {
            m3177x(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f2702s && i != -1) {
            m3177x(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.f2701r && i != -1) {
            m3177x(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.f2701r && i != -1) {
            m3177x(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final View mo3316y(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2695l.mo3372w(view, str, context, attributeSet);
    }

    /* renamed from: z */
    public C0653m mo3317z() {
        return this.f2695l.mo3370u();
    }
}
