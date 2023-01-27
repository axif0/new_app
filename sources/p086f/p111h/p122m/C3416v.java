package p086f.p111h.p122m;

import android.os.Build;
import android.view.ViewGroup;
import p086f.p111h.C3265c;

/* renamed from: f.h.m.v */
public final class C3416v {
    /* renamed from: a */
    public static boolean m14722a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C3265c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C3403t.m14606G(viewGroup) == null) ? false : true;
    }
}
