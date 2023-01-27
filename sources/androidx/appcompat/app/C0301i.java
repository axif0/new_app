package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p086f.p087a.C3123a;
import p086f.p087a.p094o.C3155b;
import p086f.p111h.p122m.C3387e;

/* renamed from: androidx.appcompat.app.i */
public class C0301i extends Dialog implements C0274f {

    /* renamed from: f */
    private C0275g f1008f;

    /* renamed from: g */
    private final C3387e.C3388a f1009g = new C0302a();

    /* renamed from: androidx.appcompat.app.i$a */
    class C0302a implements C3387e.C3388a {
        C0302a() {
        }

        /* renamed from: g */
        public boolean mo973g(KeyEvent keyEvent) {
            return C0301i.this.mo962c(keyEvent);
        }
    }

    public C0301i(Context context, int i) {
        super(context, m1193b(context, i));
        C0275g a = mo960a();
        a.mo868J(m1193b(context, i));
        a.mo882t((Bundle) null);
    }

    /* renamed from: b */
    private static int m1193b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3123a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0275g mo960a() {
        if (this.f1008f == null) {
            this.f1008f = C0275g.m1036j(this, this);
        }
        return this.f1008f;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo960a().mo870d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo962c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean mo963d(int i) {
        return mo960a().mo863C(i);
    }

    public void dismiss() {
        super.dismiss();
        mo960a().mo883u();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C3387e.m14549e(this.f1009g, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo960a().mo874k(i);
    }

    /* renamed from: h */
    public void mo845h(C3155b bVar) {
    }

    public void invalidateOptionsMenu() {
        mo960a().mo880r();
    }

    /* renamed from: j */
    public void mo847j(C3155b bVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo960a().mo879q();
        super.onCreate(bundle);
        mo960a().mo882t(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo960a().mo888z();
    }

    /* renamed from: s */
    public C3155b mo858s(C3155b.C3156a aVar) {
        return null;
    }

    public void setContentView(int i) {
        mo960a().mo864E(i);
    }

    public void setContentView(View view) {
        mo960a().mo865F(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo960a().mo866G(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo960a().mo869K(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo960a().mo869K(charSequence);
    }
}
