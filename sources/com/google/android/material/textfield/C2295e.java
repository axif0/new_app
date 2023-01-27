package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
abstract class C2295e {

    /* renamed from: a */
    TextInputLayout f7634a;

    /* renamed from: b */
    Context f7635b;

    /* renamed from: c */
    CheckableImageButton f7636c;

    C2295e(TextInputLayout textInputLayout) {
        this.f7634a = textInputLayout;
        this.f7635b = textInputLayout.getContext();
        this.f7636c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo9013a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9028b(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9014c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9029d() {
        return false;
    }
}
