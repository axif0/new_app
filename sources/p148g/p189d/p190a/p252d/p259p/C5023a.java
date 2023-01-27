package p148g.p189d.p190a.p252d.p259p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0602c;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;
import p148g.p189d.p190a.p252d.p262r.C5035a;
import p148g.p189d.p190a.p252d.p269y.C5046c;

/* renamed from: g.d.a.d.p.a */
public class C5023a extends AppCompatCheckBox {

    /* renamed from: k */
    private static final int f15000k = C5005k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: l */
    private static final int[][] f15001l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f15002i;

    /* renamed from: j */
    private boolean f15003j;

    public C5023a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.checkboxStyle);
    }

    public C5023a(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, f15000k), attributeSet, i);
        Context context2 = getContext();
        TypedArray h = C2205o.m10305h(context2, attributeSet, C5006l.MaterialCheckBox, i, f15000k, new int[0]);
        if (h.hasValue(C5006l.MaterialCheckBox_buttonTint)) {
            C0602c.m2873c(this, C5046c.m21335a(context2, h, C5006l.MaterialCheckBox_buttonTint));
        }
        this.f15003j = h.getBoolean(C5006l.MaterialCheckBox_useMaterialThemeColors, false);
        h.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15002i == null) {
            int[] iArr = new int[f15001l.length];
            int c = C5035a.m21305c(this, C4965b.colorControlActivated);
            int c2 = C5035a.m21305c(this, C4965b.colorSurface);
            int c3 = C5035a.m21305c(this, C4965b.colorOnSurface);
            iArr[0] = C5035a.m21308f(c2, c, 1.0f);
            iArr[1] = C5035a.m21308f(c2, c3, 0.54f);
            iArr[2] = C5035a.m21308f(c2, c3, 0.38f);
            iArr[3] = C5035a.m21308f(c2, c3, 0.38f);
            this.f15002i = new ColorStateList(f15001l, iArr);
        }
        return this.f15002i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15003j && C0602c.m2872b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f15003j = z;
        C0602c.m2873c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
