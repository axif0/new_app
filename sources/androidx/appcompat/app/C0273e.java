package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0263b;
import androidx.appcompat.widget.C0508z0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0559a;
import androidx.core.app.C0573f;
import androidx.core.app.C0586m;
import androidx.fragment.app.C0636d;
import p086f.p087a.p094o.C3155b;

/* renamed from: androidx.appcompat.app.e */
public class C0273e extends C0636d implements C0274f, C0586m.C0587a, C0263b.C0266c {

    /* renamed from: v */
    private C0275g f906v;

    /* renamed from: w */
    private Resources f907w;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1009O(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0273e.m1009O(android.view.KeyEvent):boolean");
    }

    /* renamed from: G */
    public void mo827G() {
        mo828H().mo880r();
    }

    /* renamed from: H */
    public C0275g mo828H() {
        if (this.f906v == null) {
            this.f906v = C0275g.m1035i(this, this);
        }
        return this.f906v;
    }

    /* renamed from: I */
    public C0259a mo829I() {
        return mo828H().mo878p();
    }

    /* renamed from: J */
    public void mo830J(C0586m mVar) {
        mVar.mo2873d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo831K(int i) {
    }

    /* renamed from: L */
    public void mo832L(C0586m mVar) {
    }

    @Deprecated
    /* renamed from: M */
    public void mo833M() {
    }

    /* renamed from: N */
    public boolean mo834N() {
        Intent o = mo848o();
        if (o == null) {
            return false;
        }
        if (mo837R(o)) {
            C0586m h = C0586m.m2735h(this);
            mo830J(h);
            mo832L(h);
            h.mo2875i();
            try {
                C0559a.m2635k(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo836Q(o);
            return true;
        }
    }

    /* renamed from: P */
    public void mo835P(Toolbar toolbar) {
        mo828H().mo867I(toolbar);
    }

    /* renamed from: Q */
    public void mo836Q(Intent intent) {
        C0573f.m2664e(this, intent);
    }

    /* renamed from: R */
    public boolean mo837R(Intent intent) {
        return C0573f.m2665f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo828H().mo870d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo828H().mo873h(context));
    }

    public void closeOptionsMenu() {
        C0259a I = mo829I();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (I == null || !I.mo770g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0259a I = mo829I();
        if (keyCode != 82 || I == null || !I.mo779p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo828H().mo874k(i);
    }

    public MenuInflater getMenuInflater() {
        return mo828H().mo877o();
    }

    public Resources getResources() {
        if (this.f907w == null && C0508z0.m2332c()) {
            this.f907w = new C0508z0(this, super.getResources());
        }
        Resources resources = this.f907w;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h */
    public void mo845h(C3155b bVar) {
    }

    /* renamed from: i */
    public C0263b.C0265b mo806i() {
        return mo828H().mo875m();
    }

    public void invalidateOptionsMenu() {
        mo828H().mo880r();
    }

    /* renamed from: j */
    public void mo847j(C3155b bVar) {
    }

    /* renamed from: o */
    public Intent mo848o() {
        return C0573f.m2660a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f907w != null) {
            this.f907w.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo828H().mo881s(configuration);
    }

    public void onContentChanged() {
        mo833M();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0275g H = mo828H();
        H.mo879q();
        H.mo882t(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo828H().mo883u();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m1009O(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0259a I = mo829I();
        if (menuItem.getItemId() != 16908332 || I == null || (I.mo773j() & 4) == 0) {
            return false;
        }
        return mo834N();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo828H().mo884v(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo828H().mo885w();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo828H().mo886x(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo828H().mo887y();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo828H().mo888z();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo828H().mo869K(charSequence);
    }

    public void openOptionsMenu() {
        C0259a I = mo829I();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (I == null || !I.mo780q()) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: s */
    public C3155b mo858s(C3155b.C3156a aVar) {
        return null;
    }

    public void setContentView(int i) {
        mo828H().mo864E(i);
    }

    public void setContentView(View view) {
        mo828H().mo865F(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo828H().mo866G(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo828H().mo868J(i);
    }
}
