package academia.bracu.com.academia.boommenu;

import academia.bracu.com.academia.boommenu.p001a.C0014a;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* renamed from: academia.bracu.com.academia.boommenu.b */
class C0025b extends FrameLayout {

    /* renamed from: f */
    private int f167f;

    /* renamed from: academia.bracu.com.academia.boommenu.b$a */
    class C0026a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ BoomMenuButton f168f;

        C0026a(BoomMenuButton boomMenuButton) {
            this.f168f = boomMenuButton;
        }

        public void onClick(View view) {
            this.f168f.mo73m0();
        }
    }

    protected C0025b(Context context, BoomMenuButton boomMenuButton) {
        super(context);
        this.f167f = boomMenuButton.getDimColor();
        ViewGroup parentView = boomMenuButton.getParentView();
        setLayoutParams(new ViewGroup.LayoutParams(parentView.getWidth(), parentView.getHeight()));
        setBackgroundColor(0);
        setOnClickListener(new C0026a(boomMenuButton));
        setMotionEventSplittingEnabled(false);
        parentView.addView(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo178a(long j, AnimatorListenerAdapter animatorListenerAdapter) {
        setVisibility(0);
        C0014a.m99d(this, "backgroundColor", 0, j, new ArgbEvaluator(), animatorListenerAdapter, 0, this.f167f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo179b(long j, AnimatorListenerAdapter animatorListenerAdapter) {
        C0014a.m99d(this, "backgroundColor", 0, j, new ArgbEvaluator(), animatorListenerAdapter, this.f167f, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo180c(BoomMenuButton boomMenuButton) {
        ViewGroup parentView = boomMenuButton.getParentView();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.width = parentView.getWidth();
        layoutParams.height = parentView.getHeight();
        setLayoutParams(layoutParams);
    }
}
