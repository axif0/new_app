package p148g.p189d.p190a.p200b.p219o0;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.a */
public final class C4151a {

    /* renamed from: g */
    public static final C4151a f13172g = new C4151a(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: a */
    public final int f13173a;

    /* renamed from: b */
    public final int f13174b;

    /* renamed from: c */
    public final int f13175c;

    /* renamed from: d */
    public final int f13176d;

    /* renamed from: e */
    public final int f13177e;

    /* renamed from: f */
    public final Typeface f13178f;

    public C4151a(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f13173a = i;
        this.f13174b = i2;
        this.f13175c = i3;
        this.f13176d = i4;
        this.f13177e = i5;
        this.f13178f = typeface;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static C4151a m17564a(CaptioningManager.CaptionStyle captionStyle) {
        return C4284w.f13659a >= 21 ? m17566c(captionStyle) : m17565b(captionStyle);
    }

    @TargetApi(19)
    /* renamed from: b */
    private static C4151a m17565b(CaptioningManager.CaptionStyle captionStyle) {
        return new C4151a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    /* renamed from: c */
    private static C4151a m17566c(CaptioningManager.CaptionStyle captionStyle) {
        return new C4151a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f13172g.f13173a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f13172g.f13174b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f13172g.f13175c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f13172g.f13176d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f13172g.f13177e, captionStyle.getTypeface());
    }
}
