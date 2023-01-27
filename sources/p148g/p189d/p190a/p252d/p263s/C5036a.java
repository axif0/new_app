package p148g.p189d.p190a.p252d.p263s;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: g.d.a.d.s.a */
public class C5036a implements View.OnTouchListener {

    /* renamed from: f */
    private final Dialog f15015f;

    /* renamed from: g */
    private final int f15016g;

    /* renamed from: h */
    private final int f15017h;

    /* renamed from: i */
    private final int f15018i;

    public C5036a(Dialog dialog, Rect rect) {
        this.f15015f = dialog;
        this.f15016g = rect.left;
        this.f15017h = rect.top;
        this.f15018i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f15016g + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f15017h + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f15018i;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f15015f.onTouchEvent(obtain);
    }
}
