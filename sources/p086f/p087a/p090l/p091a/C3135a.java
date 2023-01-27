package p086f.p087a.p090l.p091a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0448k0;
import androidx.core.graphics.drawable.C0589b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086f.p087a.p090l.p091a.C3143b;
import p086f.p087a.p090l.p091a.C3149e;
import p086f.p087a.p092m.C3152b;
import p086f.p102e.C3195d;
import p086f.p102e.C3204h;
import p086f.p111h.p112e.p113c.C3286g;
import p086f.p145t.p146a.p147a.C3561c;
import p086f.p145t.p146a.p147a.C3571i;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a.l.a.a */
public class C3135a extends C3149e implements C0589b {

    /* renamed from: t */
    private C3138c f9937t;

    /* renamed from: u */
    private C3142g f9938u;

    /* renamed from: v */
    private int f9939v;

    /* renamed from: w */
    private int f9940w;

    /* renamed from: x */
    private boolean f9941x;

    /* renamed from: f.a.l.a.a$b */
    private static class C3137b extends C3142g {

        /* renamed from: a */
        private final Animatable f9942a;

        C3137b(Animatable animatable) {
            super();
            this.f9942a = animatable;
        }

        /* renamed from: c */
        public void mo10775c() {
            this.f9942a.start();
        }

        /* renamed from: d */
        public void mo10776d() {
            this.f9942a.stop();
        }
    }

    /* renamed from: f.a.l.a.a$c */
    static class C3138c extends C3149e.C3150a {

        /* renamed from: K */
        C3195d<Long> f9943K;

        /* renamed from: L */
        C3204h<Integer> f9944L;

        C3138c(C3138c cVar, C3135a aVar, Resources resources) {
            super(cVar, aVar, resources);
            C3204h<Integer> hVar;
            if (cVar != null) {
                this.f9943K = cVar.f9943K;
                hVar = cVar.f9944L;
            } else {
                this.f9943K = new C3195d<>();
                hVar = new C3204h<>();
            }
            this.f9944L = hVar;
        }

        /* renamed from: D */
        private static long m13406D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo10777B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo10899z(iArr, drawable);
            this.f9944L.mo11158n(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo10778C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo10832a(drawable);
            long D = m13406D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f9943K.mo11046b(D, Long.valueOf(j2 | j));
            if (z) {
                this.f9943K.mo11046b(m13406D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo10779E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f9944L.mo11154g(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo10780F(int[] iArr) {
            int A = super.mo10898A(iArr);
            return A >= 0 ? A : super.mo10898A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo10781G(int i, int i2) {
            return (int) this.f9943K.mo11051g(m13406D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo10782H(int i, int i2) {
            return (this.f9943K.mo11051g(m13406D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo10783I(int i, int i2) {
            return (this.f9943K.mo11051g(m13406D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C3135a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3135a(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo10786r() {
            this.f9943K = this.f9943K.clone();
            this.f9944L = this.f9944L.clone();
        }
    }

    /* renamed from: f.a.l.a.a$d */
    private static class C3139d extends C3142g {

        /* renamed from: a */
        private final C3561c f9945a;

        C3139d(C3561c cVar) {
            super();
            this.f9945a = cVar;
        }

        /* renamed from: c */
        public void mo10775c() {
            this.f9945a.start();
        }

        /* renamed from: d */
        public void mo10776d() {
            this.f9945a.stop();
        }
    }

    /* renamed from: f.a.l.a.a$e */
    private static class C3140e extends C3142g {

        /* renamed from: a */
        private final ObjectAnimator f9946a;

        /* renamed from: b */
        private final boolean f9947b;

        C3140e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C3141f fVar = new C3141f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo10789a());
            ofInt.setInterpolator(fVar);
            this.f9947b = z2;
            this.f9946a = ofInt;
        }

        /* renamed from: a */
        public boolean mo10787a() {
            return this.f9947b;
        }

        /* renamed from: b */
        public void mo10788b() {
            this.f9946a.reverse();
        }

        /* renamed from: c */
        public void mo10775c() {
            this.f9946a.start();
        }

        /* renamed from: d */
        public void mo10776d() {
            this.f9946a.cancel();
        }
    }

    /* renamed from: f.a.l.a.a$f */
    private static class C3141f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f9948a;

        /* renamed from: b */
        private int f9949b;

        /* renamed from: c */
        private int f9950c;

        C3141f(AnimationDrawable animationDrawable, boolean z) {
            mo10790b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo10789a() {
            return this.f9950c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo10790b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9949b = numberOfFrames;
            int[] iArr = this.f9948a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9948a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9948a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f9950c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f9950c)) + 0.5f);
            int i2 = this.f9949b;
            int[] iArr = this.f9948a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f9950c) : 0.0f);
        }
    }

    /* renamed from: f.a.l.a.a$g */
    private static abstract class C3142g {
        private C3142g() {
        }

        /* renamed from: a */
        public boolean mo10787a() {
            return false;
        }

        /* renamed from: b */
        public void mo10788b() {
        }

        /* renamed from: c */
        public abstract void mo10775c();

        /* renamed from: d */
        public abstract void mo10776d();
    }

    static {
        Class<C3135a> cls = C3135a.class;
    }

    public C3135a() {
        this((C3138c) null, (Resources) null);
    }

    C3135a(C3138c cVar, Resources resources) {
        super((C3149e.C3150a) null);
        this.f9939v = -1;
        this.f9940w = -1;
        mo10766h(new C3138c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C3135a m13392m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3135a aVar = new C3135a();
            aVar.mo10772n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m13393o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m13395q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m13396r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m13394p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m13395q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3152b.AnimatedStateListDrawableItem);
        int resourceId = s.getResourceId(C3152b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = s.getResourceId(C3152b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable j = resourceId2 > 0 ? C0448k0.m2046h().mo2186j(context, resourceId2) : null;
        s.recycle();
        int[] k = mo10897k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("vector") ? C3571i.m15303c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j != null) {
            return this.f9937t.mo10777B(k, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m13396r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3152b.AnimatedStateListDrawableTransition);
        int resourceId = s.getResourceId(C3152b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = s.getResourceId(C3152b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = s.getResourceId(C3152b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable j = resourceId3 > 0 ? C0448k0.m2046h().mo2186j(context, resourceId3) : null;
        boolean z = s.getBoolean(C3152b.AnimatedStateListDrawableTransition_android_reversible, false);
        s.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("animated-vector") ? C3561c.m15270a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f9937t.mo10778C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m13397s(int i) {
        int i2;
        int G;
        C3142g gVar;
        C3142g gVar2 = this.f9938u;
        if (gVar2 == null) {
            i2 = mo10794c();
        } else if (i == this.f9939v) {
            return true;
        } else {
            if (i != this.f9940w || !gVar2.mo10787a()) {
                i2 = this.f9939v;
                gVar2.mo10776d();
            } else {
                gVar2.mo10788b();
                this.f9939v = this.f9940w;
                this.f9940w = i;
                return true;
            }
        }
        this.f9938u = null;
        this.f9940w = -1;
        this.f9939v = -1;
        C3138c cVar = this.f9937t;
        int E = cVar.mo10779E(i2);
        int E2 = cVar.mo10779E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo10781G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo10783I(E, E2);
        mo10797g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C3140e((AnimationDrawable) current, cVar.mo10782H(E, E2), I);
        } else if (current instanceof C3561c) {
            gVar = new C3139d((C3561c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C3137b((Animatable) current);
            }
            return false;
        }
        gVar.mo10775c();
        this.f9938u = gVar;
        this.f9940w = i2;
        this.f9939v = i;
        return true;
    }

    /* renamed from: t */
    private void m13398t(TypedArray typedArray) {
        C3138c cVar = this.f9937t;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f9977d |= typedArray.getChangingConfigurations();
        }
        cVar.mo10854x(typedArray.getBoolean(C3152b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f9982i));
        cVar.mo10850t(typedArray.getBoolean(C3152b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f9985l));
        cVar.mo10851u(typedArray.getInt(C3152b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f9965A));
        cVar.mo10852v(typedArray.getInt(C3152b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f9966B));
        setDither(typedArray.getBoolean(C3152b.AnimatedStateListDrawableCompat_android_dither, cVar.f9997x));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10766h(C3143b.C3146c cVar) {
        super.mo10766h(cVar);
        if (cVar instanceof C3138c) {
            this.f9937t = (C3138c) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C3142g gVar = this.f9938u;
        if (gVar != null) {
            gVar.mo10776d();
            this.f9938u = null;
            mo10797g(this.f9939v);
            this.f9939v = -1;
            this.f9940w = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C3138c mo10768j() {
        return new C3138c(this.f9937t, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f9941x) {
            super.mutate();
            if (this == this) {
                this.f9937t.mo10786r();
                this.f9941x = true;
            }
        }
        return this;
    }

    /* renamed from: n */
    public void mo10772n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3152b.AnimatedStateListDrawableCompat);
        setVisible(s.getBoolean(C3152b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m13398t(s);
        mo10810i(resources);
        s.recycle();
        m13393o(context, resources, xmlPullParser, attributeSet, theme);
        m13394p();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f9937t.mo10780F(iArr);
        boolean z = F != mo10794c() && (m13397s(F) || mo10797g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f9938u != null && (visible || z2)) {
            if (z) {
                this.f9938u.mo10775c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
