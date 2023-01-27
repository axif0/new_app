package academia.bracu.com.academia.faculty.activity;

import android.content.DialogInterface;

/* renamed from: academia.bracu.com.academia.faculty.activity.f */
/* compiled from: lambda */
public final /* synthetic */ class C0148f implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ FacultyHomeActivity f511f;

    /* renamed from: g */
    public final /* synthetic */ String f512g;

    /* renamed from: h */
    public final /* synthetic */ String f513h;

    public /* synthetic */ C0148f(FacultyHomeActivity facultyHomeActivity, String str, String str2) {
        this.f511f = facultyHomeActivity;
        this.f512g = str;
        this.f513h = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f511f.mo420f0(this.f512g, this.f513h, dialogInterface, i);
    }
}
