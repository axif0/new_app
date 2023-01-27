package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p086f.p087a.C3132j;
import p086f.p087a.p094o.C3155b;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0259a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0260a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f883a;

        public C0260a(int i, int i2) {
            super(i, i2);
            this.f883a = 0;
            this.f883a = 8388627;
        }

        public C0260a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f883a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3132j.ActionBarLayout);
            this.f883a = obtainStyledAttributes.getInt(C3132j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0260a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f883a = 0;
        }

        public C0260a(C0260a aVar) {
            super(aVar);
            this.f883a = 0;
            this.f883a = aVar.f883a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0261b {
        /* renamed from: a */
        void mo789a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class C0262c {
        /* renamed from: a */
        public abstract CharSequence mo790a();

        /* renamed from: b */
        public abstract View mo791b();

        /* renamed from: c */
        public abstract Drawable mo792c();

        /* renamed from: d */
        public abstract CharSequence mo793d();

        /* renamed from: e */
        public abstract void mo794e();
    }

    /* renamed from: g */
    public boolean mo770g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo771h() {
        return false;
    }

    /* renamed from: i */
    public void mo772i(boolean z) {
    }

    /* renamed from: j */
    public abstract int mo773j();

    /* renamed from: k */
    public Context mo774k() {
        return null;
    }

    /* renamed from: l */
    public boolean mo775l() {
        return false;
    }

    /* renamed from: m */
    public void mo776m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo777n() {
    }

    /* renamed from: o */
    public boolean mo778o(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean mo779p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo780q() {
        return false;
    }

    /* renamed from: r */
    public void mo781r(boolean z) {
    }

    /* renamed from: s */
    public abstract void mo782s(boolean z);

    /* renamed from: t */
    public abstract void mo783t(boolean z);

    /* renamed from: u */
    public void mo784u(int i) {
    }

    /* renamed from: v */
    public void mo785v(Drawable drawable) {
    }

    /* renamed from: w */
    public void mo786w(boolean z) {
    }

    /* renamed from: x */
    public void mo787x(CharSequence charSequence) {
    }

    /* renamed from: y */
    public C3155b mo788y(C3155b.C3156a aVar) {
        return null;
    }
}
