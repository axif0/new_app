package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.c */
public final class C2837c {

    /* renamed from: a */
    private final DrawerLayout f9066a;

    /* renamed from: b */
    public final C2841g f9067b;

    /* renamed from: c */
    public final DrawerLayout f9068c;

    /* renamed from: d */
    public final NavigationView f9069d;

    private C2837c(DrawerLayout drawerLayout, C2841g gVar, DrawerLayout drawerLayout2, NavigationView navigationView) {
        this.f9066a = drawerLayout;
        this.f9067b = gVar;
        this.f9068c = drawerLayout2;
        this.f9069d = navigationView;
    }

    /* renamed from: a */
    public static C2837c m12348a(View view) {
        int i = C2722R.C2724id.appbar;
        View findViewById = view.findViewById(C2722R.C2724id.appbar);
        if (findViewById != null) {
            C2841g a = C2841g.m12361a(findViewById);
            DrawerLayout drawerLayout = (DrawerLayout) view;
            NavigationView navigationView = (NavigationView) view.findViewById(C2722R.C2724id.nav_view);
            if (navigationView != null) {
                return new C2837c(drawerLayout, a, drawerLayout, navigationView);
            }
            i = C2722R.C2724id.nav_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2837c m12349c(LayoutInflater layoutInflater) {
        return m12350d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2837c m12350d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.activity_faculty_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12348a(inflate);
    }

    /* renamed from: b */
    public DrawerLayout mo10167b() {
        return this.f9066a;
    }
}
