package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.widget.C0406b0;
import androidx.appcompat.widget.C0492v0;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p086f.p087a.p094o.C3167i;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.app.m */
class C0307m extends C0259a {

    /* renamed from: a */
    C0406b0 f1028a;

    /* renamed from: b */
    boolean f1029b;

    /* renamed from: c */
    Window.Callback f1030c;

    /* renamed from: d */
    private boolean f1031d;

    /* renamed from: e */
    private boolean f1032e;

    /* renamed from: f */
    private ArrayList<C0259a.C0261b> f1033f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f1034g = new C0308a();

    /* renamed from: h */
    private final Toolbar.C0397f f1035h = new C0309b();

    /* renamed from: androidx.appcompat.app.m$a */
    class C0308a implements Runnable {
        C0308a() {
        }

        public void run() {
            C0307m.this.mo993B();
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    class C0309b implements Toolbar.C0397f {
        C0309b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0307m.this.f1030c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    private final class C0310c implements C0350m.C0351a {

        /* renamed from: f */
        private boolean f1038f;

        C0310c() {
        }

        /* renamed from: b */
        public void mo930b(C0335g gVar, boolean z) {
            if (!this.f1038f) {
                this.f1038f = true;
                C0307m.this.f1028a.mo1961i();
                Window.Callback callback = C0307m.this.f1030c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f1038f = false;
            }
        }

        /* renamed from: c */
        public boolean mo931c(C0335g gVar) {
            Window.Callback callback = C0307m.this.f1030c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    private final class C0311d implements C0335g.C0336a {
        C0311d() {
        }

        /* renamed from: a */
        public boolean mo904a(C0335g gVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo906b(C0335g gVar) {
            C0307m mVar = C0307m.this;
            if (mVar.f1030c == null) {
                return;
            }
            if (mVar.f1028a.mo1952b()) {
                C0307m.this.f1030c.onPanelClosed(108, gVar);
            } else if (C0307m.this.f1030c.onPreparePanel(0, (View) null, gVar)) {
                C0307m.this.f1030c.onMenuOpened(108, gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$e */
    private class C0312e extends C3167i {
        public C0312e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0307m.this.f1028a.mo1953c()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0307m mVar = C0307m.this;
                if (!mVar.f1029b) {
                    mVar.f1028a.mo1955d();
                    C0307m.this.f1029b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0307m(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f1028a = new C0492v0(toolbar, false);
        C0312e eVar = new C0312e(callback);
        this.f1030c = eVar;
        this.f1028a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.f1035h);
        this.f1028a.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    private Menu m1230z() {
        if (!this.f1031d) {
            this.f1028a.mo1962j(new C0310c(), new C0311d());
            this.f1031d = true;
        }
        return this.f1028a.mo1970r();
    }

    /* renamed from: A */
    public Window.Callback mo992A() {
        return this.f1030c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo993B() {
        Menu z = m1230z();
        C0335g gVar = z instanceof C0335g ? (C0335g) z : null;
        if (gVar != null) {
            gVar.mo1245h0();
        }
        try {
            z.clear();
            if (!this.f1030c.onCreatePanelMenu(0, z) || !this.f1030c.onPreparePanel(0, (View) null, z)) {
                z.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo1242g0();
            }
        }
    }

    /* renamed from: C */
    public void mo994C(int i, int i2) {
        this.f1028a.mo1968p((i & i2) | ((i2 ^ -1) & this.f1028a.mo1969q()));
    }

    /* renamed from: g */
    public boolean mo770g() {
        return this.f1028a.mo1957f();
    }

    /* renamed from: h */
    public boolean mo771h() {
        if (!this.f1028a.mo1967o()) {
            return false;
        }
        this.f1028a.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo772i(boolean z) {
        if (z != this.f1032e) {
            this.f1032e = z;
            int size = this.f1033f.size();
            for (int i = 0; i < size; i++) {
                this.f1033f.get(i).mo789a(z);
            }
        }
    }

    /* renamed from: j */
    public int mo773j() {
        return this.f1028a.mo1969q();
    }

    /* renamed from: k */
    public Context mo774k() {
        return this.f1028a.mo1953c();
    }

    /* renamed from: l */
    public boolean mo775l() {
        this.f1028a.mo1965m().removeCallbacks(this.f1034g);
        C3403t.m14627a0(this.f1028a.mo1965m(), this.f1034g);
        return true;
    }

    /* renamed from: m */
    public void mo776m(Configuration configuration) {
        super.mo776m(configuration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo777n() {
        this.f1028a.mo1965m().removeCallbacks(this.f1034g);
    }

    /* renamed from: o */
    public boolean mo778o(int i, KeyEvent keyEvent) {
        Menu z = m1230z();
        if (z == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        z.setQwertyMode(z2);
        return z.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: p */
    public boolean mo779p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo780q();
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo780q() {
        return this.f1028a.mo1958g();
    }

    /* renamed from: r */
    public void mo781r(boolean z) {
    }

    /* renamed from: s */
    public void mo782s(boolean z) {
        mo994C(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo783t(boolean z) {
        mo994C(z ? 2 : 0, 2);
    }

    /* renamed from: u */
    public void mo784u(int i) {
        this.f1028a.mo1976t(i);
    }

    /* renamed from: v */
    public void mo785v(Drawable drawable) {
        this.f1028a.mo1981y(drawable);
    }

    /* renamed from: w */
    public void mo786w(boolean z) {
    }

    /* renamed from: x */
    public void mo787x(CharSequence charSequence) {
        this.f1028a.setWindowTitle(charSequence);
    }
}
