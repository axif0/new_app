package p148g.p189d.p190a.p252d.p254b0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2206p;

/* renamed from: g.d.a.d.b0.h */
public class C4976h {
    /* renamed from: a */
    static C4969d m21064a(int i) {
        return i != 0 ? i != 1 ? m21065b() : new C4970e() : new C4978j();
    }

    /* renamed from: b */
    static C4969d m21065b() {
        return new C4978j();
    }

    /* renamed from: c */
    static C4971f m21066c() {
        return new C4971f();
    }

    /* renamed from: d */
    public static void m21067d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C4972g) {
            ((C4972g) background).mo14925W(f);
        }
    }

    /* renamed from: e */
    public static void m21068e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C4972g) {
            m21069f(view, (C4972g) background);
        }
    }

    /* renamed from: f */
    public static void m21069f(View view, C4972g gVar) {
        if (gVar.mo14921P()) {
            gVar.mo14929a0(C2206p.m10309c(view));
        }
    }
}
