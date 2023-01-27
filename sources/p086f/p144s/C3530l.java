package p086f.p144s;

import android.view.ViewGroup;

/* renamed from: f.s.l */
public class C3530l {

    /* renamed from: a */
    private ViewGroup f10979a;

    /* renamed from: b */
    private Runnable f10980b;

    /* renamed from: b */
    public static C3530l m15131b(ViewGroup viewGroup) {
        return (C3530l) viewGroup.getTag(C3523j.transition_current_scene);
    }

    /* renamed from: c */
    static void m15132c(ViewGroup viewGroup, C3530l lVar) {
        viewGroup.setTag(C3523j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void mo11947a() {
        Runnable runnable;
        if (m15131b(this.f10979a) == this && (runnable = this.f10980b) != null) {
            runnable.run();
        }
    }
}
