package p086f.p145t.p146a.p147a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0588a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086f.p102e.C3190a;
import p086f.p111h.p112e.p113c.C3286g;

/* renamed from: f.t.a.a.c */
public class C3561c extends C3570h implements Animatable {

    /* renamed from: g */
    private C3563b f11074g;

    /* renamed from: h */
    private Context f11075h;

    /* renamed from: i */
    private ArgbEvaluator f11076i;

    /* renamed from: j */
    final Drawable.Callback f11077j;

    /* renamed from: f.t.a.a.c$a */
    class C3562a implements Drawable.Callback {
        C3562a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C3561c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C3561c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C3561c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: f.t.a.a.c$b */
    private static class C3563b extends Drawable.ConstantState {

        /* renamed from: a */
        int f11079a;

        /* renamed from: b */
        C3571i f11080b;

        /* renamed from: c */
        AnimatorSet f11081c;

        /* renamed from: d */
        ArrayList<Animator> f11082d;

        /* renamed from: e */
        C3190a<Animator, String> f11083e;

        public C3563b(Context context, C3563b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f11079a = bVar.f11079a;
                C3571i iVar = bVar.f11080b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f11080b = (C3571i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C3571i iVar2 = this.f11080b;
                    iVar2.mutate();
                    C3571i iVar3 = iVar2;
                    this.f11080b = iVar3;
                    iVar3.setCallback(callback);
                    this.f11080b.setBounds(bVar.f11080b.getBounds());
                    this.f11080b.mo12092h(false);
                }
                ArrayList<Animator> arrayList = bVar.f11082d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11082d = new ArrayList<>(size);
                    this.f11083e = new C3190a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f11082d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f11083e.get(animator);
                        clone.setTarget(this.f11080b.mo12083d(str));
                        this.f11082d.add(clone);
                        this.f11083e.put(clone, str);
                    }
                    mo12055a();
                }
            }
        }

        /* renamed from: a */
        public void mo12055a() {
            if (this.f11081c == null) {
                this.f11081c = new AnimatorSet();
            }
            this.f11081c.playTogether(this.f11082d);
        }

        public int getChangingConfigurations() {
            return this.f11079a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: f.t.a.a.c$c */
    private static class C3564c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f11084a;

        public C3564c(Drawable.ConstantState constantState) {
            this.f11084a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f11084a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f11084a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C3561c cVar = new C3561c();
            Drawable newDrawable = this.f11084a.newDrawable();
            cVar.f11089f = newDrawable;
            newDrawable.setCallback(cVar.f11077j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C3561c cVar = new C3561c();
            Drawable newDrawable = this.f11084a.newDrawable(resources);
            cVar.f11089f = newDrawable;
            newDrawable.setCallback(cVar.f11077j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C3561c cVar = new C3561c();
            Drawable newDrawable = this.f11084a.newDrawable(resources, theme);
            cVar.f11089f = newDrawable;
            newDrawable.setCallback(cVar.f11077j);
            return cVar;
        }
    }

    C3561c() {
        this((Context) null, (C3563b) null, (Resources) null);
    }

    private C3561c(Context context) {
        this(context, (C3563b) null, (Resources) null);
    }

    private C3561c(Context context, C3563b bVar, Resources resources) {
        this.f11076i = null;
        this.f11077j = new C3562a();
        this.f11075h = context;
        if (bVar != null) {
            this.f11074g = bVar;
        } else {
            this.f11074g = new C3563b(context, bVar, this.f11077j, resources);
        }
    }

    /* renamed from: a */
    public static C3561c m15270a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3561c cVar = new C3561c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: b */
    private void m15271b(String str, Animator animator) {
        animator.setTarget(this.f11074g.f11080b.mo12083d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m15272c(animator);
        }
        C3563b bVar = this.f11074g;
        if (bVar.f11082d == null) {
            bVar.f11082d = new ArrayList<>();
            this.f11074g.f11083e = new C3190a<>();
        }
        this.f11074g.f11082d.add(animator);
        this.f11074g.f11083e.put(animator, str);
    }

    /* renamed from: c */
    private void m15272c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m15272c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f11076i == null) {
                    this.f11076i = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f11076i);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2758a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            return C0588a.m2759b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f11074g.f11080b.draw(canvas);
        if (this.f11074g.f11081c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f11089f;
        return drawable != null ? C0588a.m2761d(drawable) : this.f11074g.f11080b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11074g.f11079a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11089f;
        return drawable != null ? C0588a.m2762e(drawable) : this.f11074g.f11080b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f11089f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C3564c(this.f11089f.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11074g.f11080b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11074g.f11080b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getOpacity() : this.f11074g.f11080b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes;
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2764g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C3286g.m14157s(resources, theme, attributeSet, C3559a.f11066e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C3571i b = C3571i.m15302b(resources, resourceId, theme);
                        b.mo12092h(false);
                        b.setCallback(this.f11077j);
                        C3571i iVar = this.f11074g.f11080b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f11074g.f11080b = b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C3559a.f11067f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11075h;
                        if (context != null) {
                            m15271b(string, C3566e.m15284i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f11074g.mo12055a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f11089f;
        return drawable != null ? C0588a.m2765h(drawable) : this.f11074g.f11080b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f11089f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11074g.f11081c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.isStateful() : this.f11074g.f11080b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11074g.f11080b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.setLevel(i) : this.f11074g.f11080b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.setState(iArr) : this.f11074g.f11080b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f11074g.f11080b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2767j(drawable, z);
        } else {
            this.f11074g.f11080b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11074g.f11080b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2771n(drawable, i);
        } else {
            this.f11074g.f11080b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2772o(drawable, colorStateList);
        } else {
            this.f11074g.f11080b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2773p(drawable, mode);
        } else {
            this.f11074g.f11080b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f11074g.f11080b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f11074g.f11081c.isStarted()) {
            this.f11074g.f11081c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11074g.f11081c.end();
        }
    }
}
