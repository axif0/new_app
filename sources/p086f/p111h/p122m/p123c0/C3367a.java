package p086f.p111h.p122m.p123c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: f.h.m.c0.a */
public final class C3367a extends ClickableSpan {

    /* renamed from: f */
    private final int f10664f;

    /* renamed from: g */
    private final C3369c f10665g;

    /* renamed from: h */
    private final int f10666h;

    public C3367a(int i, C3369c cVar, int i2) {
        this.f10664f = i;
        this.f10665g = cVar;
        this.f10666h = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f10664f);
        this.f10665g.mo11611R(this.f10666h, bundle);
    }
}
