package p086f.p111h.p122m;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: f.h.m.b */
public abstract class C3353b {

    /* renamed from: a */
    private C3355b f10647a;

    /* renamed from: f.h.m.b$a */
    public interface C3354a {
    }

    /* renamed from: f.h.m.b$b */
    public interface C3355b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C3353b(Context context) {
    }

    /* renamed from: a */
    public boolean mo1390a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1394b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1391c();

    /* renamed from: d */
    public View mo1395d(MenuItem menuItem) {
        return mo1391c();
    }

    /* renamed from: e */
    public boolean mo1392e() {
        return false;
    }

    /* renamed from: f */
    public void mo1393f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo1396g() {
        return false;
    }

    /* renamed from: h */
    public void mo11555h() {
        this.f10647a = null;
    }

    /* renamed from: i */
    public void mo11556i(C3354a aVar) {
    }

    /* renamed from: j */
    public void mo1397j(C3355b bVar) {
        if (!(this.f10647a == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f10647a = bVar;
    }
}
