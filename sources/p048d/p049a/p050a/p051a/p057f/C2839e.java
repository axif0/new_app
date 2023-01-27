package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.e */
public final class C2839e {

    /* renamed from: a */
    private final DrawerLayout f9073a;

    /* renamed from: b */
    public final C2842h f9074b;

    /* renamed from: c */
    public final DrawerLayout f9075c;

    /* renamed from: d */
    public final NavigationView f9076d;

    private C2839e(DrawerLayout drawerLayout, C2842h hVar, DrawerLayout drawerLayout2, NavigationView navigationView) {
        this.f9073a = drawerLayout;
        this.f9074b = hVar;
        this.f9075c = drawerLayout2;
        this.f9076d = navigationView;
    }

    /* renamed from: a */
    public static C2839e m12356a(View view) {
        int i = C2722R.C2724id.appbar;
        View findViewById = view.findViewById(C2722R.C2724id.appbar);
        if (findViewById != null) {
            C2842h a = C2842h.m12362a(findViewById);
            DrawerLayout drawerLayout = (DrawerLayout) view;
            NavigationView navigationView = (NavigationView) view.findViewById(C2722R.C2724id.nav_view);
            if (navigationView != null) {
                return new C2839e(drawerLayout, a, drawerLayout, navigationView);
            }
            i = C2722R.C2724id.nav_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2839e m12357c(LayoutInflater layoutInflater) {
        return m12358d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2839e m12358d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.activity_student_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12356a(inflate);
    }

    /* renamed from: b */
    public DrawerLayout mo10169b() {
        return this.f9073a;
    }
}
