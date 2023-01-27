package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p086f.p087a.C3123a;

/* renamed from: androidx.appcompat.widget.t */
public class C0476t extends SeekBar {

    /* renamed from: f */
    private final C0478u f1855f;

    public C0476t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.seekBarStyle);
    }

    public C0476t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0478u uVar = new C0478u(this);
        this.f1855f = uVar;
        uVar.mo2320c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1855f.mo2340h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1855f.mo2341i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1855f.mo2339g(canvas);
    }
}
