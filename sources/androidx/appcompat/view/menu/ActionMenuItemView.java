package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0352n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0427f0;
import androidx.appcompat.widget.C0496w0;
import p086f.p087a.C3132j;

public class ActionMenuItemView extends AppCompatTextView implements C0352n.C0353a, View.OnClickListener, ActionMenuView.C0367a {

    /* renamed from: j */
    C0339i f1094j;

    /* renamed from: k */
    private CharSequence f1095k;

    /* renamed from: l */
    private Drawable f1096l;

    /* renamed from: m */
    C0335g.C0337b f1097m;

    /* renamed from: n */
    private C0427f0 f1098n;

    /* renamed from: o */
    C0322b f1099o;

    /* renamed from: p */
    private boolean f1100p;

    /* renamed from: q */
    private boolean f1101q;

    /* renamed from: r */
    private int f1102r;

    /* renamed from: s */
    private int f1103s;

    /* renamed from: t */
    private int f1104t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0321a extends C0427f0 {
        public C0321a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0355p mo1050b() {
            C0322b bVar = ActionMenuItemView.this.f1099o;
            if (bVar != null) {
                return bVar.mo1052a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo1050b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1051c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f1097m
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.i r0 = r0.f1094j
                boolean r0 = r1.mo1053a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.p r0 = r3.mo1050b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo1150c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0321a.mo1051c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0322b {
        /* renamed from: a */
        public abstract C0355p mo1052a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1100p = m1321g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3132j.ActionMenuItemView, i, 0);
        this.f1102r = obtainStyledAttributes.getDimensionPixelSize(C3132j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1104t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1103s = -1;
        setSaveEnabled(false);
    }

    /* renamed from: g */
    private boolean m1321g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m1322h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1095k);
        if (this.f1096l != null && (!this.f1094j.mo1277B() || (!this.f1100p && !this.f1101q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1095k : null);
        CharSequence contentDescription = this.f1094j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1094j.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1094j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1094j.getTitle();
            }
            C0496w0.m2250a(this, charSequence);
            return;
        }
        C0496w0.m2250a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo1031a() {
        return mo1035f();
    }

    /* renamed from: b */
    public boolean mo1032b() {
        return mo1035f() && this.f1094j.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo1033d() {
        return true;
    }

    /* renamed from: e */
    public void mo1034e(C0339i iVar, int i) {
        this.f1094j = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo1295i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f1098n == null) {
            this.f1098n = new C0321a();
        }
    }

    /* renamed from: f */
    public boolean mo1035f() {
        return !TextUtils.isEmpty(getText());
    }

    public C0339i getItemData() {
        return this.f1094j;
    }

    public void onClick(View view) {
        C0335g.C0337b bVar = this.f1097m;
        if (bVar != null) {
            bVar.mo1053a(this.f1094j);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1100p = m1321g();
        m1322h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean f = mo1035f();
        if (f && (i3 = this.f1103s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1102r) : this.f1102r;
        if (mode != 1073741824 && this.f1102r > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!f && this.f1096l != null) {
            super.setPadding((getMeasuredWidth() - this.f1096l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0427f0 f0Var;
        if (!this.f1094j.hasSubMenu() || (f0Var = this.f1098n) == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1101q != z) {
            this.f1101q = z;
            C0339i iVar = this.f1094j;
            if (iVar != null) {
                iVar.mo1278c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1096l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1104t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f1104t;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m1322h();
    }

    public void setItemInvoker(C0335g.C0337b bVar) {
        this.f1097m = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1103s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0322b bVar) {
        this.f1099o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1095k = charSequence;
        m1322h();
    }
}
