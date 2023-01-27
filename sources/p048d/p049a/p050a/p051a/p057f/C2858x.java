package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.x */
public final class C2858x {

    /* renamed from: a */
    private final RelativeLayout f9228a;

    /* renamed from: b */
    public final Button f9229b;

    /* renamed from: c */
    public final Button f9230c;

    /* renamed from: d */
    public final LinearLayout f9231d;

    /* renamed from: e */
    public final LinearLayout f9232e;

    /* renamed from: f */
    public final RecyclerView f9233f;

    /* renamed from: g */
    public final TextView f9234g;

    private C2858x(RelativeLayout relativeLayout, Button button, Button button2, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView) {
        this.f9228a = relativeLayout;
        this.f9229b = button;
        this.f9230c = button2;
        this.f9231d = linearLayout;
        this.f9232e = linearLayout2;
        this.f9233f = recyclerView;
        this.f9234g = textView;
    }

    /* renamed from: a */
    public static C2858x m12420a(View view) {
        int i = C2722R.C2724id.btn_navigate_next;
        Button button = (Button) view.findViewById(C2722R.C2724id.btn_navigate_next);
        if (button != null) {
            i = C2722R.C2724id.btn_navigate_prev;
            Button button2 = (Button) view.findViewById(C2722R.C2724id.btn_navigate_prev);
            if (button2 != null) {
                i = C2722R.C2724id.info;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C2722R.C2724id.info);
                if (linearLayout != null) {
                    i = C2722R.C2724id.ll_pagination;
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C2722R.C2724id.ll_pagination);
                    if (linearLayout2 != null) {
                        i = C2722R.C2724id.rv_notifications;
                        RecyclerView recyclerView = (RecyclerView) view.findViewById(C2722R.C2724id.rv_notifications);
                        if (recyclerView != null) {
                            i = C2722R.C2724id.tv_unavailable_message;
                            TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_unavailable_message);
                            if (textView != null) {
                                return new C2858x((RelativeLayout) view, button, button2, linearLayout, linearLayout2, recyclerView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2858x m12421c(LayoutInflater layoutInflater) {
        return m12422d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2858x m12422d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_student_notifications, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12420a(inflate);
    }

    /* renamed from: b */
    public RelativeLayout mo10184b() {
        return this.f9228a;
    }
}
