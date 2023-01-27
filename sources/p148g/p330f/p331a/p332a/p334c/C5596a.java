package p148g.p330f.p331a.p332a.p334c;

import android.widget.RelativeLayout;

/* renamed from: g.f.a.a.c.a */
public class C5596a {
    /* renamed from: a */
    public static int m23193a(RelativeLayout relativeLayout, int i) {
        if (i == 1) {
            return relativeLayout.getTop();
        }
        if (i == 2) {
            return relativeLayout.getBottom();
        }
        if (i == 3) {
            return relativeLayout.getLeft();
        }
        if (i != 4) {
            return 0;
        }
        return relativeLayout.getRight();
    }
}
