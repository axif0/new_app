package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0572e;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0715g;
import androidx.lifecycle.C0717i;
import androidx.lifecycle.C0718j;
import androidx.lifecycle.C0732r;
import androidx.lifecycle.C0741v;
import androidx.lifecycle.C0742w;
import androidx.savedstate.C0933a;
import androidx.savedstate.C0934b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C0572e implements C0717i, C0742w, C0934b, C0245c {

    /* renamed from: g */
    private final C0718j f746g = new C0718j(this);

    /* renamed from: h */
    private final C0933a f747h = C0933a.m5229a(this);

    /* renamed from: i */
    private C0741v f748i;

    /* renamed from: j */
    private final OnBackPressedDispatcher f749j = new OnBackPressedDispatcher(new C0240a());

    /* renamed from: k */
    private int f750k;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0240a implements Runnable {
        C0240a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0241b {

        /* renamed from: a */
        Object f754a;

        /* renamed from: b */
        C0741v f755b;

        C0241b() {
        }
    }

    public ComponentActivity() {
        if (mo720a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo720a().mo3667a(new C0715g() {
                    /* renamed from: d */
                    public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
                        if (aVar == C0710e.C0711a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo720a().mo3667a(new C0715g() {
                /* renamed from: d */
                public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
                    if (aVar == C0710e.C0711a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo725q().mo3718a();
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                mo720a().mo3667a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: a */
    public C0710e mo720a() {
        return this.f746g;
    }

    /* renamed from: c */
    public final OnBackPressedDispatcher mo721c() {
        return this.f749j;
    }

    /* renamed from: d */
    public final SavedStateRegistry mo722d() {
        return this.f747h.mo4881b();
    }

    public void onBackPressed() {
        this.f749j.mo731c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f747h.mo4882c(bundle);
        C0732r.m3657g(this);
        int i = this.f750k;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0241b bVar;
        Object v = mo726v();
        C0741v vVar = this.f748i;
        if (vVar == null && (bVar = (C0241b) getLastNonConfigurationInstance()) != null) {
            vVar = bVar.f755b;
        }
        if (vVar == null && v == null) {
            return null;
        }
        C0241b bVar2 = new C0241b();
        bVar2.f754a = v;
        bVar2.f755b = vVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0710e a = mo720a();
        if (a instanceof C0718j) {
            ((C0718j) a).mo3673p(C0710e.C0712b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f747h.mo4883d(bundle);
    }

    /* renamed from: q */
    public C0741v mo725q() {
        if (getApplication() != null) {
            if (this.f748i == null) {
                C0241b bVar = (C0241b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f748i = bVar.f755b;
                }
                if (this.f748i == null) {
                    this.f748i = new C0741v();
                }
            }
            return this.f748i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    /* renamed from: v */
    public Object mo726v() {
        return null;
    }
}
