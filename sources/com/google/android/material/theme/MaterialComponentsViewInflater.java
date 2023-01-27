package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0304k;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0419d;
import androidx.appcompat.widget.C0426f;
import androidx.appcompat.widget.C0472r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C2298g;
import com.google.android.material.textview.MaterialTextView;
import p148g.p189d.p190a.p252d.p259p.C5023a;
import p148g.p189d.p190a.p252d.p268x.C5042a;

public class MaterialComponentsViewInflater extends C0304k {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0419d mo975b(Context context, AttributeSet attributeSet) {
        return new C2298g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0426f mo976c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatCheckBox mo977d(Context context, AttributeSet attributeSet) {
        return new C5023a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0472r mo983j(Context context, AttributeSet attributeSet) {
        return new C5042a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatTextView mo987n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
