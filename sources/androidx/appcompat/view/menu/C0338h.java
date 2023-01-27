package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0271d;
import androidx.appcompat.view.menu.C0350m;
import p086f.p087a.C3129g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0338h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0350m.C0351a {

    /* renamed from: f */
    private C0335g f1239f;

    /* renamed from: g */
    private C0271d f1240g;

    /* renamed from: h */
    C0332e f1241h;

    /* renamed from: i */
    private C0350m.C0351a f1242i;

    public C0338h(C0335g gVar) {
        this.f1239f = gVar;
    }

    /* renamed from: a */
    public void mo1271a() {
        C0271d dVar = this.f1240g;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo930b(C0335g gVar, boolean z) {
        if (z || gVar == this.f1239f) {
            mo1271a();
        }
        C0350m.C0351a aVar = this.f1242i;
        if (aVar != null) {
            aVar.mo930b(gVar, z);
        }
    }

    /* renamed from: c */
    public boolean mo931c(C0335g gVar) {
        C0350m.C0351a aVar = this.f1242i;
        if (aVar != null) {
            return aVar.mo931c(gVar);
        }
        return false;
    }

    /* renamed from: d */
    public void mo1272d(IBinder iBinder) {
        C0335g gVar = this.f1239f;
        C0271d.C0272a aVar = new C0271d.C0272a(gVar.mo1267w());
        C0332e eVar = new C0332e(aVar.mo813b(), C3129g.abc_list_menu_item_layout);
        this.f1241h = eVar;
        eVar.mo1139p(this);
        this.f1239f.mo1229b(this.f1241h);
        aVar.mo814c(this.f1241h.mo1174a(), this);
        View A = gVar.mo1195A();
        if (A != null) {
            aVar.mo815d(A);
        } else {
            aVar.mo816e(gVar.mo1269y());
            aVar.mo825n(gVar.mo1270z());
        }
        aVar.mo820i(this);
        C0271d a = aVar.mo812a();
        this.f1240g = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1240g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1240g.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1239f.mo1207N((C0339i) this.f1241h.mo1174a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1241h.mo1128b(this.f1239f, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1240g.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1240g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1239f.mo1238e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1239f.performShortcut(i, keyEvent, 0);
    }
}
