package p086f.p103f.p104a.p106b;

import android.view.View;

/* renamed from: f.f.a.b.a */
public class C3206a {
    /* renamed from: a */
    public static String m13699a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
