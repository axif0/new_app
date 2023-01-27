package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0717i;
import androidx.lifecycle.C0718j;
import androidx.lifecycle.C0732r;
import p086f.p102e.C3203g;
import p086f.p111h.p122m.C3387e;

/* renamed from: androidx.core.app.e */
public class C0572e extends Activity implements C0717i, C3387e.C3388a {

    /* renamed from: f */
    private C0718j f2355f = new C0718j(this);

    public C0572e() {
        new C3203g();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C3387e.m14548d(decorView, keyEvent)) {
            return C3387e.m14549e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C3387e.m14548d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo973g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0732r.m3657g(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f2355f.mo3672k(C0710e.C0712b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
