package p148g.p189d.p190a.p252d.p269y;

import android.graphics.Typeface;

/* renamed from: g.d.a.d.y.a */
public final class C5043a extends C5051f {

    /* renamed from: a */
    private final Typeface f15027a;

    /* renamed from: b */
    private final C5044a f15028b;

    /* renamed from: c */
    private boolean f15029c;

    /* renamed from: g.d.a.d.y.a$a */
    public interface C5044a {
        /* renamed from: a */
        void mo8519a(Typeface typeface);
    }

    public C5043a(C5044a aVar, Typeface typeface) {
        this.f15027a = typeface;
        this.f15028b = aVar;
    }

    /* renamed from: d */
    private void m21326d(Typeface typeface) {
        if (!this.f15029c) {
            this.f15028b.mo8519a(typeface);
        }
    }

    /* renamed from: a */
    public void mo7993a(int i) {
        m21326d(this.f15027a);
    }

    /* renamed from: b */
    public void mo7994b(Typeface typeface, boolean z) {
        m21326d(typeface);
    }

    /* renamed from: c */
    public void mo15126c() {
        this.f15029c = true;
    }
}
