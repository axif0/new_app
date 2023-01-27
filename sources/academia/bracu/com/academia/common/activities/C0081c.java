package academia.bracu.com.academia.common.activities;

import android.content.DialogInterface;

/* renamed from: academia.bracu.com.academia.common.activities.c */
/* compiled from: lambda */
public final /* synthetic */ class C0081c implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ CommonHomeActivity f376f;

    /* renamed from: g */
    public final /* synthetic */ int[] f377g;

    /* renamed from: h */
    public final /* synthetic */ String[] f378h;

    public /* synthetic */ C0081c(CommonHomeActivity commonHomeActivity, int[] iArr, String[] strArr) {
        this.f376f = commonHomeActivity;
        this.f377g = iArr;
        this.f378h = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f376f.mo299b0(this.f377g, this.f378h, dialogInterface, i);
    }
}
