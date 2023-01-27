package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.q */
public final class C2851q {

    /* renamed from: a */
    private final LinearLayout f9145a;

    /* renamed from: b */
    public final Button f9146b;

    /* renamed from: c */
    public final Button f9147c;

    /* renamed from: d */
    public final Button f9148d;

    /* renamed from: e */
    public final EditText f9149e;

    /* renamed from: f */
    public final EditText f9150f;

    /* renamed from: g */
    public final EditText f9151g;

    /* renamed from: h */
    public final EditText f9152h;

    /* renamed from: i */
    public final LinearLayout f9153i;

    /* renamed from: j */
    public final LinearLayout f9154j;

    /* renamed from: k */
    public final LinearLayout f9155k;

    /* renamed from: l */
    public final C2836b0 f9156l;

    /* renamed from: m */
    public final RecyclerView f9157m;

    /* renamed from: n */
    public final SwitchCompat f9158n;

    /* renamed from: o */
    public final SwitchCompat f9159o;

    /* renamed from: p */
    public final SwitchCompat f9160p;

    private C2851q(LinearLayout linearLayout, Button button, Button button2, Button button3, EditText editText, EditText editText2, EditText editText3, EditText editText4, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, C2836b0 b0Var, RecyclerView recyclerView, SwitchCompat switchCompat, SwitchCompat switchCompat2, SwitchCompat switchCompat3) {
        this.f9145a = linearLayout;
        this.f9146b = button;
        this.f9147c = button2;
        this.f9148d = button3;
        this.f9149e = editText;
        this.f9150f = editText2;
        this.f9151g = editText3;
        this.f9152h = editText4;
        this.f9153i = linearLayout2;
        this.f9154j = linearLayout3;
        this.f9155k = linearLayout4;
        this.f9156l = b0Var;
        this.f9157m = recyclerView;
        this.f9158n = switchCompat;
        this.f9159o = switchCompat2;
        this.f9160p = switchCompat3;
    }

    /* renamed from: a */
    public static C2851q m12392a(View view) {
        View view2 = view;
        int i = C2722R.C2724id.btn_navigate_next;
        Button button = (Button) view2.findViewById(C2722R.C2724id.btn_navigate_next);
        if (button != null) {
            i = C2722R.C2724id.btn_navigate_prev;
            Button button2 = (Button) view2.findViewById(C2722R.C2724id.btn_navigate_prev);
            if (button2 != null) {
                i = C2722R.C2724id.btn_search_outbox;
                Button button3 = (Button) view2.findViewById(C2722R.C2724id.btn_search_outbox);
                if (button3 != null) {
                    i = C2722R.C2724id.et_from_date;
                    EditText editText = (EditText) view2.findViewById(C2722R.C2724id.et_from_date);
                    if (editText != null) {
                        i = C2722R.C2724id.et_from_time;
                        EditText editText2 = (EditText) view2.findViewById(C2722R.C2724id.et_from_time);
                        if (editText2 != null) {
                            i = C2722R.C2724id.et_to_date;
                            EditText editText3 = (EditText) view2.findViewById(C2722R.C2724id.et_to_date);
                            if (editText3 != null) {
                                i = C2722R.C2724id.et_to_time;
                                EditText editText4 = (EditText) view2.findViewById(C2722R.C2724id.et_to_time);
                                if (editText4 != null) {
                                    i = C2722R.C2724id.ll_pagination;
                                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_pagination);
                                    if (linearLayout != null) {
                                        i = C2722R.C2724id.ll_student_list_label;
                                        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_student_list_label);
                                        if (linearLayout2 != null) {
                                            i = C2722R.C2724id.ll_top_layout;
                                            LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(C2722R.C2724id.ll_top_layout);
                                            if (linearLayout3 != null) {
                                                i = C2722R.C2724id.rl_search_layout;
                                                View findViewById = view2.findViewById(C2722R.C2724id.rl_search_layout);
                                                if (findViewById != null) {
                                                    C2836b0 a = C2836b0.m12347a(findViewById);
                                                    i = C2722R.C2724id.rv_result_list;
                                                    RecyclerView recyclerView = (RecyclerView) view2.findViewById(C2722R.C2724id.rv_result_list);
                                                    if (recyclerView != null) {
                                                        i = C2722R.C2724id.sc_message_delivery;
                                                        SwitchCompat switchCompat = (SwitchCompat) view2.findViewById(C2722R.C2724id.sc_message_delivery);
                                                        if (switchCompat != null) {
                                                            i = C2722R.C2724id.sc_toggle_date;
                                                            SwitchCompat switchCompat2 = (SwitchCompat) view2.findViewById(C2722R.C2724id.sc_toggle_date);
                                                            if (switchCompat2 != null) {
                                                                i = C2722R.C2724id.sc_toggle_time;
                                                                SwitchCompat switchCompat3 = (SwitchCompat) view2.findViewById(C2722R.C2724id.sc_toggle_time);
                                                                if (switchCompat3 != null) {
                                                                    return new C2851q((LinearLayout) view2, button, button2, button3, editText, editText2, editText3, editText4, linearLayout, linearLayout2, linearLayout3, a, recyclerView, switchCompat, switchCompat2, switchCompat3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2851q m12393c(LayoutInflater layoutInflater) {
        return m12394d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2851q m12394d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_faculty_outbox, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12392a(inflate);
    }

    /* renamed from: b */
    public LinearLayout mo10177b() {
        return this.f9145a;
    }
}
