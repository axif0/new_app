package com.google.android.exoplayer2.p035ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4151a;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4162k;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
public final class SubtitleView extends View implements C4162k {

    /* renamed from: f */
    private final List<C1542h> f5197f = new ArrayList();

    /* renamed from: g */
    private List<C4152b> f5198g;

    /* renamed from: h */
    private int f5199h = 0;

    /* renamed from: i */
    private float f5200i = 0.0533f;

    /* renamed from: j */
    private boolean f5201j = true;

    /* renamed from: k */
    private boolean f5202k = true;

    /* renamed from: l */
    private C4151a f5203l = C4151a.f13172g;

    /* renamed from: m */
    private float f5204m = 0.08f;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private void m7398b(int i, float f) {
        if (this.f5199h != i || this.f5200i != f) {
            this.f5199h = i;
            this.f5200i = f;
            invalidate();
        }
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private C4151a getUserCaptionStyleV19() {
        return C4151a.m17564a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    /* renamed from: a */
    public void mo6247a(float f, boolean z) {
        m7398b(z ? 1 : 0, f);
    }

    /* renamed from: c */
    public void mo6248c() {
        setStyle((C4284w.f13659a < 19 || isInEditMode()) ? C4151a.f13172g : getUserCaptionStyleV19());
    }

    /* renamed from: d */
    public void mo6249d() {
        setFractionalTextSize(((C4284w.f13659a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    public void dispatchDraw(Canvas canvas) {
        float f;
        List<C4152b> list = this.f5198g;
        int i = 0;
        int size = list == null ? 0 : list.size();
        int top = getTop();
        int bottom = getBottom();
        int left = getLeft() + getPaddingLeft();
        int paddingTop = getPaddingTop() + top;
        int right = getRight() + getPaddingRight();
        int paddingBottom = bottom - getPaddingBottom();
        if (paddingBottom > paddingTop && right > left) {
            int i2 = this.f5199h;
            if (i2 == 2) {
                f = this.f5200i;
            } else {
                f = ((float) (i2 == 0 ? paddingBottom - paddingTop : bottom - top)) * this.f5200i;
            }
            if (f > 0.0f) {
                while (i < size) {
                    int i3 = paddingBottom;
                    int i4 = right;
                    this.f5197f.get(i).mo6288b(this.f5198g.get(i), this.f5201j, this.f5202k, this.f5203l, f, this.f5204m, canvas, left, paddingTop, i4, i3);
                    i++;
                    paddingBottom = i3;
                    right = i4;
                }
            }
        }
    }

    /* renamed from: k */
    public void mo6244k(List<C4152b> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.f5202k != z) {
            this.f5202k = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.f5201j != z || this.f5202k != z) {
            this.f5201j = z;
            this.f5202k = z;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f) {
        if (this.f5204m != f) {
            this.f5204m = f;
            invalidate();
        }
    }

    public void setCues(List<C4152b> list) {
        if (this.f5198g != list) {
            this.f5198g = list;
            int size = list == null ? 0 : list.size();
            while (this.f5197f.size() < size) {
                this.f5197f.add(new C1542h(getContext()));
            }
            invalidate();
        }
    }

    public void setFractionalTextSize(float f) {
        mo6247a(f, false);
    }

    public void setStyle(C4151a aVar) {
        if (this.f5203l != aVar) {
            this.f5203l = aVar;
            invalidate();
        }
    }
}
