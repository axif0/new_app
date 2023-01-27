package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0455l;
import p086f.p087a.C3123a;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p126j.p127a.C3430a;

public class CheckableImageButton extends C0455l implements Checkable {

    /* renamed from: k */
    private static final int[] f7162k = {16842912};

    /* renamed from: h */
    private boolean f7163h;

    /* renamed from: i */
    private boolean f7164i;

    /* renamed from: j */
    private boolean f7165j;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C2167a extends C3350a {
        C2167a() {
        }

        /* renamed from: f */
        public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2996f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            cVar.mo11617Z(CheckableImageButton.this.mo8460a());
            cVar.mo11619a0(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    static class C2168b extends C3430a {
        public static final Parcelable.Creator<C2168b> CREATOR = new C2169a();

        /* renamed from: h */
        boolean f7167h;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        static class C2169a implements Parcelable.ClassLoaderCreator<C2168b> {
            C2169a() {
            }

            /* renamed from: a */
            public C2168b createFromParcel(Parcel parcel) {
                return new C2168b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C2168b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2168b(parcel, classLoader);
            }

            /* renamed from: c */
            public C2168b[] newArray(int i) {
                return new C2168b[i];
            }
        }

        public C2168b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m10128b(parcel);
        }

        public C2168b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m10128b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f7167h = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7167h ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7164i = true;
        this.f7165j = true;
        C3403t.m14643i0(this, new C2167a());
    }

    /* renamed from: a */
    public boolean mo8460a() {
        return this.f7164i;
    }

    public boolean isChecked() {
        return this.f7163h;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f7163h ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f7162k.length), f7162k) : super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2168b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2168b bVar = (C2168b) parcelable;
        super.onRestoreInstanceState(bVar.mo11760a());
        setChecked(bVar.f7167h);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2168b bVar = new C2168b(super.onSaveInstanceState());
        bVar.f7167h = this.f7163h;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f7164i != z) {
            this.f7164i = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f7164i && this.f7163h != z) {
            this.f7163h = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f7165j = z;
    }

    public void setPressed(boolean z) {
        if (this.f7165j) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f7163h);
    }
}
