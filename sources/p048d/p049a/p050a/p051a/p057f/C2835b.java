package p048d.p049a.p050a.p051a.p057f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.f.b */
public final class C2835b {

    /* renamed from: a */
    private final DrawerLayout f9058a;

    /* renamed from: b */
    public final C2840f f9059b;

    /* renamed from: c */
    public final DrawerLayout f9060c;

    /* renamed from: d */
    public final NavigationView f9061d;

    private C2835b(DrawerLayout drawerLayout, C2840f fVar, DrawerLayout drawerLayout2, NavigationView navigationView) {
        this.f9058a = drawerLayout;
        this.f9059b = fVar;
        this.f9060c = drawerLayout2;
        this.f9061d = navigationView;
    }

    /* renamed from: a */
    public static C2835b m12343a(View view) {
        int i = C2722R.C2724id.appbar;
        View findViewById = view.findViewById(C2722R.C2724id.appbar);
        if (findViewById != null) {
            C2840f a = C2840f.m12360a(findViewById);
            DrawerLayout drawerLayout = (DrawerLayout) view;
            NavigationView navigationView = (NavigationView) view.findViewById(C2722R.C2724id.nav_view);
            if (navigationView != null) {
                return new C2835b(drawerLayout, a, drawerLayout, navigationView);
            }
            i = C2722R.C2724id.nav_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2835b m12344c(LayoutInflater layoutInflater) {
        return m12345d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C2835b m12345d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2722R.layout.activity_common_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12343a(inflate);
    }

    /* renamed from: b */
    public DrawerLayout mo10166b() {
        return this.f9058a;
    }
}
