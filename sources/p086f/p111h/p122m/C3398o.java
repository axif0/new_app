package p086f.p111h.p122m;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: f.h.m.o */
public class C3398o {

    /* renamed from: a */
    private int f10700a;

    /* renamed from: b */
    private int f10701b;

    public C3398o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo11699a() {
        return this.f10700a | this.f10701b;
    }

    /* renamed from: b */
    public void mo11700b(View view, View view2, int i) {
        mo11701c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo11701c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f10701b = i;
        } else {
            this.f10700a = i;
        }
    }

    /* renamed from: d */
    public void mo11702d(View view, int i) {
        if (i == 1) {
            this.f10701b = 0;
        } else {
            this.f10700a = 0;
        }
    }
}
