package p086f.p087a.p094o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: f.a.o.i */
public class C3167i implements Window.Callback {

    /* renamed from: f */
    final Window.Callback f10088f;

    public C3167i(Window.Callback callback) {
        if (callback != null) {
            this.f10088f = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo10957a() {
        return this.f10088f;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f10088f.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f10088f.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f10088f.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f10088f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f10088f.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f10088f.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f10088f.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f10088f.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f10088f.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f10088f.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f10088f.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f10088f.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f10088f.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f10088f.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f10088f.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f10088f.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f10088f.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f10088f.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f10088f.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f10088f.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f10088f.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f10088f.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f10088f.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f10088f.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f10088f.onWindowStartingActionMode(callback, i);
    }
}
