package p086f.p087a.p090l.p091a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p086f.p087a.p090l.p091a.C3143b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a.l.a.e */
class C3149e extends C3143b {

    /* renamed from: r */
    private C3150a f10014r;

    /* renamed from: s */
    private boolean f10015s;

    /* renamed from: f.a.l.a.e$a */
    static class C3150a extends C3143b.C3146c {

        /* renamed from: J */
        int[][] f10016J;

        C3150a(C3150a aVar, C3149e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f10016J = aVar.f10016J;
            } else {
                this.f10016J = new int[mo10837f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo10898A(int[] iArr) {
            int[][] iArr2 = this.f10016J;
            int h = mo10840h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C3149e(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3149e(this, resources);
        }

        /* renamed from: o */
        public void mo10847o(int i, int i2) {
            super.mo10847o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f10016J, 0, iArr, 0, i);
            this.f10016J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo10786r() {
            int[][] iArr = this.f10016J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f10016J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f10016J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo10899z(int[] iArr, Drawable drawable) {
            int a = mo10832a(drawable);
            this.f10016J[a] = iArr;
            return a;
        }
    }

    C3149e(C3150a aVar) {
        if (aVar != null) {
            mo10766h(aVar);
        }
    }

    C3149e(C3150a aVar, Resources resources) {
        mo10766h(new C3150a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10766h(C3143b.C3146c cVar) {
        super.mo10766h(cVar);
        if (cVar instanceof C3150a) {
            this.f10014r = (C3150a) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3150a mo10765b() {
        return new C3150a(this.f10014r, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo10897k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f10015s) {
            super.mutate();
            if (this == this) {
                this.f10014r.mo10786r();
                this.f10015s = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f10014r.mo10898A(iArr);
        if (A < 0) {
            A = this.f10014r.mo10898A(StateSet.WILD_CARD);
        }
        return mo10797g(A) || onStateChange;
    }
}
