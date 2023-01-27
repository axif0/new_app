package p148g.p189d.p190a.p252d.p257n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.C2202n;
import com.google.android.material.internal.C2205o;
import com.karumi.dexter.BuildConfig;
import java.lang.ref.WeakReference;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5003i;
import p148g.p189d.p190a.p252d.C5004j;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p269y.C5046c;
import p148g.p189d.p190a.p252d.p269y.C5047d;

/* renamed from: g.d.a.d.n.a */
public class C5018a extends Drawable implements C2202n.C2204b {

    /* renamed from: v */
    private static final int f14970v = C5005k.Widget_MaterialComponents_Badge;

    /* renamed from: w */
    private static final int f14971w = C4965b.badgeStyle;

    /* renamed from: f */
    private final WeakReference<Context> f14972f;

    /* renamed from: g */
    private final C4972g f14973g = new C4972g();

    /* renamed from: h */
    private final C2202n f14974h;

    /* renamed from: i */
    private final Rect f14975i = new Rect();

    /* renamed from: j */
    private final float f14976j;

    /* renamed from: k */
    private final float f14977k;

    /* renamed from: l */
    private final float f14978l;

    /* renamed from: m */
    private final C5019a f14979m;

    /* renamed from: n */
    private float f14980n;

    /* renamed from: o */
    private float f14981o;

    /* renamed from: p */
    private int f14982p;

    /* renamed from: q */
    private float f14983q;

    /* renamed from: r */
    private float f14984r;

    /* renamed from: s */
    private float f14985s;

    /* renamed from: t */
    private WeakReference<View> f14986t;

    /* renamed from: u */
    private WeakReference<ViewGroup> f14987u;

    /* renamed from: g.d.a.d.n.a$a */
    public static final class C5019a implements Parcelable {
        public static final Parcelable.Creator<C5019a> CREATOR = new C5020a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f14988f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f14989g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f14990h = 255;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f14991i = -1;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f14992j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public CharSequence f14993k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f14994l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f14995m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f14996n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f14997o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f14998p;

        /* renamed from: g.d.a.d.n.a$a$a */
        static class C5020a implements Parcelable.Creator<C5019a> {
            C5020a() {
            }

            /* renamed from: a */
            public C5019a createFromParcel(Parcel parcel) {
                return new C5019a(parcel);
            }

            /* renamed from: b */
            public C5019a[] newArray(int i) {
                return new C5019a[i];
            }
        }

        public C5019a(Context context) {
            this.f14989g = new C5047d(context, C5005k.TextAppearance_MaterialComponents_Badge).f15031b.getDefaultColor();
            this.f14993k = context.getString(C5004j.mtrl_badge_numberless_content_description);
            this.f14994l = C5003i.mtrl_badge_content_description;
            this.f14995m = C5004j.mtrl_exceed_max_badge_number_content_description;
        }

        protected C5019a(Parcel parcel) {
            this.f14988f = parcel.readInt();
            this.f14989g = parcel.readInt();
            this.f14990h = parcel.readInt();
            this.f14991i = parcel.readInt();
            this.f14992j = parcel.readInt();
            this.f14993k = parcel.readString();
            this.f14994l = parcel.readInt();
            this.f14996n = parcel.readInt();
            this.f14997o = parcel.readInt();
            this.f14998p = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14988f);
            parcel.writeInt(this.f14989g);
            parcel.writeInt(this.f14990h);
            parcel.writeInt(this.f14991i);
            parcel.writeInt(this.f14992j);
            parcel.writeString(this.f14993k.toString());
            parcel.writeInt(this.f14994l);
            parcel.writeInt(this.f14996n);
            parcel.writeInt(this.f14997o);
            parcel.writeInt(this.f14998p);
        }
    }

    private C5018a(Context context) {
        this.f14972f = new WeakReference<>(context);
        C2205o.m10300c(context);
        Resources resources = context.getResources();
        this.f14976j = (float) resources.getDimensionPixelSize(C4998d.mtrl_badge_radius);
        this.f14978l = (float) resources.getDimensionPixelSize(C4998d.mtrl_badge_long_text_horizontal_padding);
        this.f14977k = (float) resources.getDimensionPixelSize(C4998d.mtrl_badge_with_text_radius);
        C2202n nVar = new C2202n(this);
        this.f14974h = nVar;
        nVar.mo8604e().setTextAlign(Paint.Align.CENTER);
        this.f14979m = new C5019a(context);
        m21239t(C5005k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: b */
    private void m21231b(Context context, Rect rect, View view) {
        float f;
        int h = this.f14979m.f14996n;
        this.f14981o = (float) ((h == 8388691 || h == 8388693) ? rect.bottom - this.f14979m.f14998p : rect.top + this.f14979m.f14998p);
        if (mo15057i() <= 9) {
            f = !mo15059j() ? this.f14976j : this.f14977k;
            this.f14983q = f;
            this.f14985s = f;
        } else {
            float f2 = this.f14977k;
            this.f14983q = f2;
            this.f14985s = f2;
            f = (this.f14974h.mo8605f(m21235f()) / 2.0f) + this.f14978l;
        }
        this.f14984r = f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo15059j() ? C4998d.mtrl_badge_text_horizontal_edge_offset : C4998d.mtrl_badge_horizontal_edge_offset);
        int h2 = this.f14979m.f14996n;
        this.f14980n = (h2 == 8388659 || h2 == 8388691 ? C3403t.m14674y(view) != 0 : C3403t.m14674y(view) == 0) ? ((((float) rect.right) + this.f14984r) - ((float) dimensionPixelSize)) - ((float) this.f14979m.f14997o) : (((float) rect.left) - this.f14984r) + ((float) dimensionPixelSize) + ((float) this.f14979m.f14997o);
    }

    /* renamed from: c */
    public static C5018a m21232c(Context context) {
        return m21233d(context, (AttributeSet) null, f14971w, f14970v);
    }

    /* renamed from: d */
    private static C5018a m21233d(Context context, AttributeSet attributeSet, int i, int i2) {
        C5018a aVar = new C5018a(context);
        aVar.m21236k(context, attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: e */
    private void m21234e(Canvas canvas) {
        Rect rect = new Rect();
        String f = m21235f();
        this.f14974h.mo8604e().getTextBounds(f, 0, f.length(), rect);
        canvas.drawText(f, this.f14980n, this.f14981o + ((float) (rect.height() / 2)), this.f14974h.mo8604e());
    }

    /* renamed from: f */
    private String m21235f() {
        if (mo15057i() <= this.f14982p) {
            return Integer.toString(mo15057i());
        }
        Context context = (Context) this.f14972f.get();
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        return context.getString(C5004j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f14982p), "+"});
    }

    /* renamed from: k */
    private void m21236k(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C2205o.m10305h(context, attributeSet, C5006l.Badge, i, i2, new int[0]);
        mo15064q(h.getInt(C5006l.Badge_maxCharacterCount, 4));
        if (h.hasValue(C5006l.Badge_number)) {
            mo15065r(h.getInt(C5006l.Badge_number, 0));
        }
        mo15060m(m21237l(context, h, C5006l.Badge_backgroundColor));
        if (h.hasValue(C5006l.Badge_badgeTextColor)) {
            mo15062o(m21237l(context, h, C5006l.Badge_badgeTextColor));
        }
        mo15061n(h.getInt(C5006l.Badge_badgeGravity, 8388661));
        mo15063p(h.getDimensionPixelOffset(C5006l.Badge_horizontalOffset, 0));
        mo15068u(h.getDimensionPixelOffset(C5006l.Badge_verticalOffset, 0));
        h.recycle();
    }

    /* renamed from: l */
    private static int m21237l(Context context, TypedArray typedArray, int i) {
        return C5046c.m21335a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: s */
    private void m21238s(C5047d dVar) {
        Context context;
        if (this.f14974h.mo8603d() != dVar && (context = (Context) this.f14972f.get()) != null) {
            this.f14974h.mo8607h(dVar, context);
            m21240w();
        }
    }

    /* renamed from: t */
    private void m21239t(int i) {
        Context context = (Context) this.f14972f.get();
        if (context != null) {
            m21238s(new C5047d(context, i));
        }
    }

    /* renamed from: w */
    private void m21240w() {
        Context context = (Context) this.f14972f.get();
        WeakReference<View> weakReference = this.f14986t;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f14975i);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.f14987u;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || C5021b.f14999a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m21231b(context, rect2, view);
            C5021b.m21277d(this.f14975i, this.f14980n, this.f14981o, this.f14984r, this.f14985s);
            this.f14973g.mo14924V(this.f14983q);
            if (!rect.equals(this.f14975i)) {
                this.f14973g.setBounds(this.f14975i);
            }
        }
    }

    /* renamed from: x */
    private void m21241x() {
        double h = (double) mo15056h();
        Double.isNaN(h);
        this.f14982p = ((int) Math.pow(10.0d, h - 1.0d)) - 1;
    }

    /* renamed from: a */
    public void mo8096a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f14973g.draw(canvas);
            if (mo15059j()) {
                m21234e(canvas);
            }
        }
    }

    /* renamed from: g */
    public CharSequence mo15051g() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo15059j()) {
            return this.f14979m.f14993k;
        }
        if (this.f14979m.f14994l <= 0 || (context = (Context) this.f14972f.get()) == null) {
            return null;
        }
        if (mo15057i() <= this.f14982p) {
            return context.getResources().getQuantityString(this.f14979m.f14994l, mo15057i(), new Object[]{Integer.valueOf(mo15057i())});
        }
        return context.getString(this.f14979m.f14995m, new Object[]{Integer.valueOf(this.f14982p)});
    }

    public int getAlpha() {
        return this.f14979m.f14990h;
    }

    public int getIntrinsicHeight() {
        return this.f14975i.height();
    }

    public int getIntrinsicWidth() {
        return this.f14975i.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int mo15056h() {
        return this.f14979m.f14992j;
    }

    /* renamed from: i */
    public int mo15057i() {
        if (!mo15059j()) {
            return 0;
        }
        return this.f14979m.f14991i;
    }

    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public boolean mo15059j() {
        return this.f14979m.f14991i != -1;
    }

    /* renamed from: m */
    public void mo15060m(int i) {
        int unused = this.f14979m.f14988f = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f14973g.mo14949x() != valueOf) {
            this.f14973g.mo14926X(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: n */
    public void mo15061n(int i) {
        if (this.f14979m.f14996n != i) {
            int unused = this.f14979m.f14996n = i;
            WeakReference<View> weakReference = this.f14986t;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f14986t.get();
                WeakReference<ViewGroup> weakReference2 = this.f14987u;
                mo15069v(view, weakReference2 != null ? (ViewGroup) weakReference2.get() : null);
            }
        }
    }

    /* renamed from: o */
    public void mo15062o(int i) {
        int unused = this.f14979m.f14989g = i;
        if (this.f14974h.mo8604e().getColor() != i) {
            this.f14974h.mo8604e().setColor(i);
            invalidateSelf();
        }
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public void mo15063p(int i) {
        int unused = this.f14979m.f14997o = i;
        m21240w();
    }

    /* renamed from: q */
    public void mo15064q(int i) {
        if (this.f14979m.f14992j != i) {
            int unused = this.f14979m.f14992j = i;
            m21241x();
            this.f14974h.mo8608i(true);
            m21240w();
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void mo15065r(int i) {
        int max = Math.max(0, i);
        if (this.f14979m.f14991i != max) {
            int unused = this.f14979m.f14991i = max;
            this.f14974h.mo8608i(true);
            m21240w();
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        int unused = this.f14979m.f14990h = i;
        this.f14974h.mo8604e().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: u */
    public void mo15068u(int i) {
        int unused = this.f14979m.f14998p = i;
        m21240w();
    }

    /* renamed from: v */
    public void mo15069v(View view, ViewGroup viewGroup) {
        this.f14986t = new WeakReference<>(view);
        this.f14987u = new WeakReference<>(viewGroup);
        m21240w();
        invalidateSelf();
    }
}
