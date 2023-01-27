package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0352n;
import androidx.appcompat.widget.C0479u0;
import p086f.p087a.C3123a;
import p086f.p087a.C3128f;
import p086f.p087a.C3129g;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;

public class ListMenuItemView extends LinearLayout implements C0352n.C0353a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    private C0339i f1109f;

    /* renamed from: g */
    private ImageView f1110g;

    /* renamed from: h */
    private RadioButton f1111h;

    /* renamed from: i */
    private TextView f1112i;

    /* renamed from: j */
    private CheckBox f1113j;

    /* renamed from: k */
    private TextView f1114k;

    /* renamed from: l */
    private ImageView f1115l;

    /* renamed from: m */
    private ImageView f1116m;

    /* renamed from: n */
    private LinearLayout f1117n;

    /* renamed from: o */
    private Drawable f1118o;

    /* renamed from: p */
    private int f1119p;

    /* renamed from: q */
    private Context f1120q;

    /* renamed from: r */
    private boolean f1121r;

    /* renamed from: s */
    private Drawable f1122s;

    /* renamed from: t */
    private boolean f1123t;

    /* renamed from: u */
    private LayoutInflater f1124u;

    /* renamed from: v */
    private boolean f1125v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0479u0 v = C0479u0.m2148v(getContext(), attributeSet, C3132j.MenuView, i, 0);
        this.f1118o = v.mo2349g(C3132j.MenuView_android_itemBackground);
        this.f1119p = v.mo2356n(C3132j.MenuView_android_itemTextAppearance, -1);
        this.f1121r = v.mo2343a(C3132j.MenuView_preserveIconSpacing, false);
        this.f1120q = context;
        this.f1122s = v.mo2349g(C3132j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C3123a.dropDownListViewStyle, 0);
        this.f1123t = obtainStyledAttributes.hasValue(0);
        v.mo2362w();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m1333a(View view) {
        m1334b(view, -1);
    }

    /* renamed from: b */
    private void m1334b(View view, int i) {
        LinearLayout linearLayout = this.f1117n;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m1335c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C3129g.abc_list_menu_item_checkbox, this, false);
        this.f1113j = checkBox;
        m1333a(checkBox);
    }

    /* renamed from: f */
    private void m1336f() {
        ImageView imageView = (ImageView) getInflater().inflate(C3129g.abc_list_menu_item_icon, this, false);
        this.f1110g = imageView;
        m1334b(imageView, 0);
    }

    /* renamed from: g */
    private void m1337g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C3129g.abc_list_menu_item_radio, this, false);
        this.f1111h = radioButton;
        m1333a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1124u == null) {
            this.f1124u = LayoutInflater.from(getContext());
        }
        return this.f1124u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1115l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1116m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1116m.getLayoutParams();
            rect.top += this.f1116m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: d */
    public boolean mo1033d() {
        return false;
    }

    /* renamed from: e */
    public void mo1034e(C0339i iVar, int i) {
        this.f1109f = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo1295i(this));
        setCheckable(iVar.isCheckable());
        mo1059h(iVar.mo1276A(), iVar.mo1280g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public C0339i getItemData() {
        return this.f1109f;
    }

    /* renamed from: h */
    public void mo1059h(boolean z, char c) {
        int i = (!z || !this.f1109f.mo1276A()) ? 8 : 0;
        if (i == 0) {
            this.f1114k.setText(this.f1109f.mo1293h());
        }
        if (this.f1114k.getVisibility() != i) {
            this.f1114k.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C3403t.m14649l0(this, this.f1118o);
        TextView textView = (TextView) findViewById(C3128f.title);
        this.f1112i = textView;
        int i = this.f1119p;
        if (i != -1) {
            textView.setTextAppearance(this.f1120q, i);
        }
        this.f1114k = (TextView) findViewById(C3128f.shortcut);
        ImageView imageView = (ImageView) findViewById(C3128f.submenuarrow);
        this.f1115l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1122s);
        }
        this.f1116m = (ImageView) findViewById(C3128f.group_divider);
        this.f1117n = (LinearLayout) findViewById(C3128f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1110g != null && this.f1121r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1110g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1111h != null || this.f1113j != null) {
            if (this.f1109f.mo1303m()) {
                if (this.f1111h == null) {
                    m1337g();
                }
                compoundButton2 = this.f1111h;
                compoundButton = this.f1113j;
            } else {
                if (this.f1113j == null) {
                    m1335c();
                }
                compoundButton2 = this.f1113j;
                compoundButton = this.f1111h;
            }
            if (z) {
                compoundButton2.setChecked(this.f1109f.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1113j;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1111h;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1109f.mo1303m()) {
            if (this.f1111h == null) {
                m1337g();
            }
            compoundButton = this.f1111h;
        } else {
            if (this.f1113j == null) {
                m1335c();
            }
            compoundButton = this.f1113j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1125v = z;
        this.f1121r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1116m;
        if (imageView != null) {
            imageView.setVisibility((this.f1123t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1109f.mo1333z() || this.f1125v;
        if (!z && !this.f1121r) {
            return;
        }
        if (this.f1110g != null || drawable != null || this.f1121r) {
            if (this.f1110g == null) {
                m1336f();
            }
            if (drawable != null || this.f1121r) {
                ImageView imageView = this.f1110g;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1110g.getVisibility() != 0) {
                    this.f1110g.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1110g.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f1112i.setText(charSequence);
            if (this.f1112i.getVisibility() != 0) {
                textView = this.f1112i;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f1112i.getVisibility() != 8) {
                textView = this.f1112i;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
