package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0334f;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.j0 */
public class C0445j0 extends C0434h0 implements C0443i0 {

    /* renamed from: O */
    private static Method f1757O;

    /* renamed from: N */
    private C0443i0 f1758N;

    /* renamed from: androidx.appcompat.widget.j0$a */
    public static class C0446a extends C0420d0 {

        /* renamed from: t */
        final int f1759t;

        /* renamed from: u */
        final int f1760u;

        /* renamed from: v */
        private C0443i0 f1761v;

        /* renamed from: w */
        private MenuItem f1762w;

        public C0446a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1759t = 22;
                this.f1760u = 21;
                return;
            }
            this.f1759t = 21;
            this.f1760u = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1761v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0334f fVar = (C0334f) adapter;
                C0339i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1762w;
                if (menuItem != iVar) {
                    C0335g b = fVar.mo1187b();
                    if (menuItem != null) {
                        this.f1761v.mo1171f(b, menuItem);
                    }
                    this.f1762w = iVar;
                    if (iVar != null) {
                        this.f1761v.mo1170e(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1759t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1760u) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0334f) getAdapter()).mo1187b().mo1238e(false);
                return true;
            }
        }

        public void setHoverListener(C0443i0 i0Var) {
            this.f1761v = i0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1757O = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0445j0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void mo2180R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1717J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void mo2181S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1717J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: T */
    public void mo2182T(C0443i0 i0Var) {
        this.f1758N = i0Var;
    }

    /* renamed from: U */
    public void mo2183U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1757O;
            if (method != null) {
                try {
                    method.invoke(this.f1717J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1717J.setTouchModal(z);
        }
    }

    /* renamed from: e */
    public void mo1170e(C0335g gVar, MenuItem menuItem) {
        C0443i0 i0Var = this.f1758N;
        if (i0Var != null) {
            i0Var.mo1170e(gVar, menuItem);
        }
    }

    /* renamed from: f */
    public void mo1171f(C0335g gVar, MenuItem menuItem) {
        C0443i0 i0Var = this.f1758N;
        if (i0Var != null) {
            i0Var.mo1171f(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0420d0 mo2146s(Context context, boolean z) {
        C0446a aVar = new C0446a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
