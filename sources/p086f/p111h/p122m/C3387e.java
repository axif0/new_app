package p086f.p111h.p122m;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.h.m.e */
public class C3387e {

    /* renamed from: a */
    private static boolean f10689a = false;

    /* renamed from: b */
    private static Method f10690b = null;

    /* renamed from: c */
    private static boolean f10691c = false;

    /* renamed from: d */
    private static Field f10692d;

    /* renamed from: f.h.m.e$a */
    public interface C3388a {
        /* renamed from: g */
        boolean mo973g(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m14545a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f10689a) {
            try {
                f10690b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f10689a = true;
        }
        Method method = f10690b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m14546b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m14545a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3403t.m14640h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m14547c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m14550f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3403t.m14640h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m14548d(View view, KeyEvent keyEvent) {
        return C3403t.m14642i(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m14549e(C3388a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo973g(keyEvent) : callback instanceof Activity ? m14546b((Activity) callback, keyEvent) : callback instanceof Dialog ? m14547c((Dialog) callback, keyEvent) : (view != null && C3403t.m14640h(view, keyEvent)) || aVar.mo973g(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m14550f(Dialog dialog) {
        if (!f10691c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f10692d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10691c = true;
        }
        Field field = f10692d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
