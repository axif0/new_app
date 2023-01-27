package p148g.p189d.p190a.p252d.p268x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0472r;
import androidx.core.widget.C0602c;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p262r.C5035a;
import p148g.p189d.p190a.p252d.p269y.C5046c;

/* renamed from: g.d.a.d.x.a */
public class C5042a extends C0472r {

    /* renamed from: k */
    private static final int f15023k = C5005k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: l */
    private static final int[][] f15024l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f15025i;

    /* renamed from: j */
    private boolean f15026j;

    public C5042a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.radioButtonStyle);
    }

    public C5042a(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f15023k), attributeSet, i);
        Context context2 = getContext();
        TypedArray h = C2205o.m10305h(context2, attributeSet, C5006l.MaterialRadioButton, i, f15023k, new int[0]);
        if (h.hasValue(C5006l.MaterialRadioButton_buttonTint)) {
            C0602c.m2873c(this, C5046c.m21335a(context2, h, C5006l.MaterialRadioButton_buttonTint));
        }
        this.f15026j = h.getBoolean(C5006l.MaterialRadioButton_useMaterialThemeColors, false);
        h.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15025i == null) {
            int c = C5035a.m21305c(this, C4965b.colorControlActivated);
            int c2 = C5035a.m21305c(this, C4965b.colorOnSurface);
            int c3 = C5035a.m21305c(this, C4965b.colorSurface);
            int[] iArr = new int[f15024l.length];
            iArr[0] = C5035a.m21308f(c3, c, 1.0f);
            iArr[1] = C5035a.m21308f(c3, c2, 0.54f);
            iArr[2] = C5035a.m21308f(c3, c2, 0.38f);
            iArr[3] = C5035a.m21308f(c3, c2, 0.38f);
            this.f15025i = new ColorStateList(f15024l, iArr);
        }
        return this.f15025i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15026j && C0602c.m2872b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f15026j = z;
        C0602c.m2873c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
