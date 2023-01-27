package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: androidx.fragment.app.z */
public class C0697z extends Fragment {

    /* renamed from: b0 */
    private final Handler f2910b0 = new Handler();

    /* renamed from: c0 */
    private final Runnable f2911c0 = new C0698a();

    /* renamed from: d0 */
    private final AdapterView.OnItemClickListener f2912d0 = new C0699b();

    /* renamed from: e0 */
    ListAdapter f2913e0;

    /* renamed from: f0 */
    ListView f2914f0;

    /* renamed from: g0 */
    View f2915g0;

    /* renamed from: h0 */
    TextView f2916h0;

    /* renamed from: i0 */
    View f2917i0;

    /* renamed from: j0 */
    View f2918j0;

    /* renamed from: k0 */
    CharSequence f2919k0;

    /* renamed from: l0 */
    boolean f2920l0;

    /* renamed from: androidx.fragment.app.z$a */
    class C0698a implements Runnable {
        C0698a() {
        }

        public void run() {
            ListView listView = C0697z.this.f2914f0;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.z$b */
    class C0699b implements AdapterView.OnItemClickListener {
        C0699b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0697z.this.mo585K1((ListView) adapterView, view, i, j);
        }
    }

    /* renamed from: J1 */
    private void m3554J1() {
        if (this.f2914f0 == null) {
            View V = mo3175V();
            if (V != null) {
                if (V instanceof ListView) {
                    this.f2914f0 = (ListView) V;
                } else {
                    TextView textView = (TextView) V.findViewById(16711681);
                    this.f2916h0 = textView;
                    if (textView == null) {
                        this.f2915g0 = V.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f2917i0 = V.findViewById(16711682);
                    this.f2918j0 = V.findViewById(16711683);
                    View findViewById = V.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f2914f0 = listView;
                        View view = this.f2915g0;
                        if (view == null) {
                            CharSequence charSequence = this.f2919k0;
                            if (charSequence != null) {
                                this.f2916h0.setText(charSequence);
                                listView = this.f2914f0;
                                view = this.f2916h0;
                            }
                        }
                        listView.setEmptyView(view);
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f2920l0 = true;
                this.f2914f0.setOnItemClickListener(this.f2912d0);
                ListAdapter listAdapter = this.f2913e0;
                if (listAdapter != null) {
                    this.f2913e0 = null;
                    mo3625L1(listAdapter);
                } else if (this.f2917i0 != null) {
                    m3555M1(false, false);
                }
                this.f2910b0.post(this.f2911c0);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: M1 */
    private void m3555M1(boolean z, boolean z2) {
        m3554J1();
        View view = this.f2917i0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f2920l0 != z) {
            this.f2920l0 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(mo3242y(), 17432577));
                    this.f2918j0.startAnimation(AnimationUtils.loadAnimation(mo3242y(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f2918j0.clearAnimation();
                }
                this.f2917i0.setVisibility(8);
                this.f2918j0.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(mo3242y(), 17432576));
                this.f2918j0.startAnimation(AnimationUtils.loadAnimation(mo3242y(), 17432577));
            } else {
                view.clearAnimation();
                this.f2918j0.clearAnimation();
            }
            this.f2917i0.setVisibility(0);
            this.f2918j0.setVisibility(8);
        }
    }

    /* renamed from: K1 */
    public void mo585K1(ListView listView, View view, int i, long j) {
    }

    /* renamed from: L1 */
    public void mo3625L1(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f2913e0 != null;
        this.f2913e0 = listAdapter;
        ListView listView = this.f2914f0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f2920l0 && !z2) {
                if (mo3222p1().getWindowToken() != null) {
                    z = true;
                }
                m3555M1(true, z);
            }
        }
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        m3554J1();
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context o1 = mo3217o1();
        FrameLayout frameLayout = new FrameLayout(o1);
        LinearLayout linearLayout = new LinearLayout(o1);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(o1, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(o1);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(o1);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(o1);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: w0 */
    public void mo3238w0() {
        this.f2910b0.removeCallbacks(this.f2911c0);
        this.f2914f0 = null;
        this.f2920l0 = false;
        this.f2918j0 = null;
        this.f2917i0 = null;
        this.f2915g0 = null;
        this.f2916h0 = null;
        super.mo3238w0();
    }
}
