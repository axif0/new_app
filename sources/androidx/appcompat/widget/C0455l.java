package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.C0612l;
import p086f.p087a.C3123a;
import p086f.p111h.p122m.C3402s;

/* renamed from: androidx.appcompat.widget.l */
public class C0455l extends ImageButton implements C3402s, C0612l {

    /* renamed from: f */
    private final C0423e f1773f;

    /* renamed from: g */
    private final C0457m f1774g;

    public C0455l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.imageButtonStyle);
    }

    public C0455l(Context context, AttributeSet attributeSet, int i) {
        super(C0473r0.m2138b(context), attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0423e eVar = new C0423e(this);
        this.f1773f = eVar;
        eVar.mo2037e(attributeSet, i);
        C0457m mVar = new C0457m(this);
        this.f1774g = mVar;
        mVar.mo2257f(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0423e eVar = this.f1773f;
        if (eVar != null) {
            eVar.mo2034b();
        }
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            mVar.mo2253b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0423e eVar = this.f1773f;
        if (eVar != null) {
            return eVar.mo2035c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0423e eVar = this.f1773f;
        if (eVar != null) {
            return eVar.mo2036d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            return mVar.mo2254c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            return mVar.mo2255d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1774g.mo2256e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0423e eVar = this.f1773f;
        if (eVar != null) {
            eVar.mo2038f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0423e eVar = this.f1773f;
        if (eVar != null) {
            eVar.mo2039g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            mVar.mo2253b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            mVar.mo2253b();
        }
    }

    public void setImageResource(int i) {
        this.f1774g.mo2258g(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            mVar.mo2253b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0423e eVar = this.f1773f;
        if (eVar != null) {
            eVar.mo2041i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0423e eVar = this.f1773f;
        if (eVar != null) {
            eVar.mo2042j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            mVar.mo2259h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0457m mVar = this.f1774g;
        if (mVar != null) {
            mVar.mo2260i(mode);
        }
    }
}
