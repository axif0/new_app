package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0632c;
import androidx.fragment.app.C0675u;
import com.google.android.material.datepicker.C2096a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C4999e;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5002h;
import p148g.p189d.p190a.p252d.C5004j;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p263s.C5036a;
import p148g.p189d.p190a.p252d.p269y.C5045b;

/* renamed from: com.google.android.material.datepicker.i */
public final class C2120i<S> extends C0632c {

    /* renamed from: G0 */
    static final Object f7012G0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: H0 */
    static final Object f7013H0 = "CANCEL_BUTTON_TAG";

    /* renamed from: I0 */
    static final Object f7014I0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A0 */
    private boolean f7015A0;

    /* renamed from: B0 */
    private int f7016B0;

    /* renamed from: C0 */
    private TextView f7017C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public CheckableImageButton f7018D0;

    /* renamed from: E0 */
    private C4972g f7019E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public Button f7020F0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public final LinkedHashSet<C2125j<? super S>> f7021p0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public final LinkedHashSet<View.OnClickListener> f7022q0 = new LinkedHashSet<>();

    /* renamed from: r0 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f7023r0 = new LinkedHashSet<>();

    /* renamed from: s0 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f7024s0 = new LinkedHashSet<>();

    /* renamed from: t0 */
    private int f7025t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C2102d<S> f7026u0;

    /* renamed from: v0 */
    private C2135p<S> f7027v0;

    /* renamed from: w0 */
    private C2096a f7028w0;

    /* renamed from: x0 */
    private C2107h<S> f7029x0;

    /* renamed from: y0 */
    private int f7030y0;

    /* renamed from: z0 */
    private CharSequence f7031z0;

    /* renamed from: com.google.android.material.datepicker.i$a */
    class C2121a implements View.OnClickListener {
        C2121a() {
        }

        public void onClick(View view) {
            Iterator it = C2120i.this.f7021p0.iterator();
            while (it.hasNext()) {
                ((C2125j) it.next()).mo8231a(C2120i.this.mo8226j2());
            }
            C2120i.this.mo3284L1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    class C2122b implements View.OnClickListener {
        C2122b() {
        }

        public void onClick(View view) {
            Iterator it = C2120i.this.f7022q0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C2120i.this.mo3284L1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$c */
    class C2123c extends C2134o<S> {
        C2123c() {
        }

        /* renamed from: a */
        public void mo8229a(S s) {
            C2120i.this.m9889p2();
            C2120i.this.f7020F0.setEnabled(C2120i.this.f7026u0.mo8198x());
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$d */
    class C2124d implements View.OnClickListener {
        C2124d() {
        }

        public void onClick(View view) {
            C2120i.this.f7020F0.setEnabled(C2120i.this.f7026u0.mo8198x());
            C2120i.this.f7018D0.toggle();
            C2120i iVar = C2120i.this;
            iVar.m9890q2(iVar.f7018D0);
            C2120i.this.m9887n2();
        }
    }

    /* renamed from: f2 */
    private static Drawable m9881f2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C3133a.m13388d(context, C4999e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C3133a.m13388d(context, C4999e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: g2 */
    private static int m9882g2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C4998d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C4998d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C4998d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C4998d.mtrl_calendar_days_of_week_height);
        return dimensionPixelSize + dimensionPixelSize2 + (C2130m.f7046j * resources.getDimensionPixelSize(C4998d.mtrl_calendar_day_height)) + ((C2130m.f7046j - 1) * resources.getDimensionPixelOffset(C4998d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C4998d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: i2 */
    private static int m9883i2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C4998d.mtrl_calendar_content_padding);
        int i = C2128l.m9908i().f7043j;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C4998d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C4998d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: k2 */
    private int m9884k2(Context context) {
        int i = this.f7025t0;
        return i != 0 ? i : this.f7026u0.mo8196r(context);
    }

    /* renamed from: l2 */
    private void m9885l2(Context context) {
        this.f7018D0.setTag(f7014I0);
        this.f7018D0.setImageDrawable(m9881f2(context));
        this.f7018D0.setChecked(this.f7016B0 != 0);
        C3403t.m14643i0(this.f7018D0, (C3350a) null);
        m9890q2(this.f7018D0);
        this.f7018D0.setOnClickListener(new C2124d());
    }

    /* renamed from: m2 */
    static boolean m9886m2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C5045b.m21333c(context, C4965b.materialCalendarStyle, C2107h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m9887n2() {
        this.f7029x0 = C2107h.m9852a2(this.f7026u0, m9884k2(mo3217o1()), this.f7028w0);
        this.f7027v0 = this.f7018D0.isChecked() ? C2126k.m9901L1(this.f7026u0, this.f7028w0) : this.f7029x0;
        m9889p2();
        C0675u i = mo3240x().mo3440i();
        i.mo3569q(C5000f.mtrl_calendar_frame, this.f7027v0);
        i.mo3264k();
        this.f7027v0.mo8268J1(new C2123c());
    }

    /* renamed from: o2 */
    public static long m9888o2() {
        return C2128l.m9908i().f7045l;
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public void m9889p2() {
        String h2 = mo8225h2();
        this.f7017C0.setContentDescription(String.format(mo3169S(C5004j.mtrl_picker_announce_current_selection), new Object[]{h2}));
        this.f7017C0.setText(h2);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public void m9890q2(CheckableImageButton checkableImageButton) {
        this.f7018D0.setContentDescription(checkableImageButton.getContext().getString(this.f7018D0.isChecked() ? C5004j.mtrl_picker_toggle_to_calendar_input_mode : C5004j.mtrl_picker_toggle_to_text_input_mode));
    }

    /* renamed from: L0 */
    public final void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7025t0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7026u0);
        C2096a.C2098b bVar = new C2096a.C2098b(this.f7028w0);
        if (this.f7029x0.mo8214W1() != null) {
            bVar.mo8186b(this.f7029x0.mo8214W1().f7045l);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo8185a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f7030y0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f7031z0);
    }

    /* renamed from: M0 */
    public void mo3159M0() {
        super.mo3159M0();
        Window window = mo3288R1().getWindow();
        if (this.f7015A0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f7019E0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo3158M().getDimensionPixelOffset(C4998d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f7019E0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C5036a(mo3288R1(), rect));
        }
        m9887n2();
    }

    /* renamed from: N0 */
    public void mo3161N0() {
        this.f7027v0.mo8269K1();
        super.mo3161N0();
    }

    /* renamed from: Q1 */
    public final Dialog mo542Q1(Bundle bundle) {
        Dialog dialog = new Dialog(mo3217o1(), m9884k2(mo3217o1()));
        Context context = dialog.getContext();
        this.f7015A0 = m9886m2(context);
        int c = C5045b.m21333c(context, C4965b.colorSurface, C2120i.class.getCanonicalName());
        C4972g gVar = new C4972g(context, (AttributeSet) null, C4965b.materialCalendarStyle, C5005k.Widget_MaterialComponents_MaterialCalendar);
        this.f7019E0 = gVar;
        gVar.mo14920N(context);
        this.f7019E0.mo14926X(ColorStateList.valueOf(c));
        this.f7019E0.mo14925W(C3403t.m14664t(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* renamed from: h2 */
    public String mo8225h2() {
        return this.f7026u0.mo8195q(mo3242y());
    }

    /* renamed from: j2 */
    public final S mo8226j2() {
        return this.f7026u0.mo8192J();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f7023r0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f7024s0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) mo3175V();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: p0 */
    public final void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        if (bundle == null) {
            bundle = mo3237w();
        }
        this.f7025t0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f7026u0 = (C2102d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7028w0 = (C2096a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7030y0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f7031z0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f7016B0 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: t0 */
    public final View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f7015A0 ? C5002h.mtrl_picker_fullscreen : C5002h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f7015A0) {
            inflate.findViewById(C5000f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m9883i2(context), -2));
        } else {
            View findViewById = inflate.findViewById(C5000f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C5000f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m9883i2(context), -1));
            findViewById2.setMinimumHeight(m9882g2(mo3217o1()));
        }
        TextView textView = (TextView) inflate.findViewById(C5000f.mtrl_picker_header_selection_text);
        this.f7017C0 = textView;
        C3403t.m14647k0(textView, 1);
        this.f7018D0 = (CheckableImageButton) inflate.findViewById(C5000f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C5000f.mtrl_picker_title_text);
        CharSequence charSequence = this.f7031z0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f7030y0);
        }
        m9885l2(context);
        this.f7020F0 = (Button) inflate.findViewById(C5000f.confirm_button);
        if (this.f7026u0.mo8198x()) {
            this.f7020F0.setEnabled(true);
        } else {
            this.f7020F0.setEnabled(false);
        }
        this.f7020F0.setTag(f7012G0);
        this.f7020F0.setOnClickListener(new C2121a());
        Button button = (Button) inflate.findViewById(C5000f.cancel_button);
        button.setTag(f7013H0);
        button.setOnClickListener(new C2122b());
        return inflate;
    }
}
