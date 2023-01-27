package p148g.p189d.p190a.p200b.p219o0.p220m;

import android.text.Layout;
import p148g.p189d.p190a.p200b.p219o0.C4152b;

/* renamed from: g.d.a.b.o0.m.b */
final class C4167b extends C4152b implements Comparable<C4167b> {

    /* renamed from: r */
    public final int f13241r;

    public C4167b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f13241r = i5;
    }

    /* renamed from: e */
    public int compareTo(C4167b bVar) {
        int i = bVar.f13241r;
        int i2 = this.f13241r;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
