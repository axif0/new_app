package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0405b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1608a;

    public C0405b(ActionBarContainer actionBarContainer) {
        this.f1608a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1608a;
        if (actionBarContainer.f1333m) {
            Drawable drawable = actionBarContainer.f1332l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1330j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1608a;
        Drawable drawable3 = actionBarContainer2.f1331k;
        if (drawable3 != null && actionBarContainer2.f1334n) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1608a;
        if (actionBarContainer.f1333m) {
            drawable = actionBarContainer.f1332l;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1330j;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
