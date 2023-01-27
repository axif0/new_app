package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p086f.p087a.C3123a;

/* renamed from: androidx.appcompat.app.d */
public class C0271d extends C0301i implements DialogInterface {

    /* renamed from: h */
    final AlertController f903h = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.d$a */
    public static class C0272a {

        /* renamed from: a */
        private final AlertController.C0251f f904a;

        /* renamed from: b */
        private final int f905b;

        public C0272a(Context context) {
            this(context, C0271d.m992f(context, 0));
        }

        public C0272a(Context context, int i) {
            this.f904a = new AlertController.C0251f(new ContextThemeWrapper(context, C0271d.m992f(context, i)));
            this.f905b = i;
        }

        /* renamed from: a */
        public C0271d mo812a() {
            C0271d dVar = new C0271d(this.f904a.f844a, this.f905b);
            this.f904a.mo760a(dVar.f903h);
            dVar.setCancelable(this.f904a.f861r);
            if (this.f904a.f861r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f904a.f862s);
            dVar.setOnDismissListener(this.f904a.f863t);
            DialogInterface.OnKeyListener onKeyListener = this.f904a.f864u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        /* renamed from: b */
        public Context mo813b() {
            return this.f904a.f844a;
        }

        /* renamed from: c */
        public C0272a mo814c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f866w = listAdapter;
            fVar.f867x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0272a mo815d(View view) {
            this.f904a.f850g = view;
            return this;
        }

        /* renamed from: e */
        public C0272a mo816e(Drawable drawable) {
            this.f904a.f847d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0272a mo817f(CharSequence charSequence) {
            this.f904a.f851h = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0272a mo818g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f865v = charSequenceArr;
            fVar.f838J = onMultiChoiceClickListener;
            fVar.f834F = zArr;
            fVar.f835G = true;
            return this;
        }

        /* renamed from: h */
        public C0272a mo819h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f855l = charSequence;
            fVar.f857n = onClickListener;
            return this;
        }

        /* renamed from: i */
        public C0272a mo820i(DialogInterface.OnKeyListener onKeyListener) {
            this.f904a.f864u = onKeyListener;
            return this;
        }

        /* renamed from: j */
        public C0272a mo821j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f852i = charSequence;
            fVar.f854k = onClickListener;
            return this;
        }

        /* renamed from: k */
        public C0272a mo822k(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f866w = listAdapter;
            fVar.f867x = onClickListener;
            fVar.f837I = i;
            fVar.f836H = true;
            return this;
        }

        /* renamed from: l */
        public C0272a mo823l(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f865v = charSequenceArr;
            fVar.f867x = onClickListener;
            fVar.f837I = i;
            fVar.f836H = true;
            return this;
        }

        /* renamed from: m */
        public C0272a mo824m(int i) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f849f = fVar.f844a.getText(i);
            return this;
        }

        /* renamed from: n */
        public C0272a mo825n(CharSequence charSequence) {
            this.f904a.f849f = charSequence;
            return this;
        }

        /* renamed from: o */
        public C0272a mo826o(View view) {
            AlertController.C0251f fVar = this.f904a;
            fVar.f869z = view;
            fVar.f868y = 0;
            fVar.f833E = false;
            return this;
        }
    }

    protected C0271d(Context context, int i) {
        super(context, m992f(context, i));
    }

    /* renamed from: f */
    static int m992f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3123a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView mo807e() {
        return this.f903h.mo740d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f903h.mo741e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f903h.mo742g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f903h.mo743h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f903h.mo749q(charSequence);
    }
}
