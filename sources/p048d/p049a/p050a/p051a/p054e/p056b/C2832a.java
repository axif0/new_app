package p048d.p049a.p050a.p051a.p054e.p056b;

import android.content.Context;
import android.content.res.TypedArray;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.List;
import p048d.p049a.p050a.p051a.p066m.C2987b;

/* renamed from: d.a.a.a.e.b.a */
public class C2832a {

    /* renamed from: a */
    private List<C2987b> f9043a = new ArrayList();

    /* renamed from: b */
    private TypedArray f9044b;

    /* renamed from: c */
    private String[] f9045c;

    /* renamed from: d */
    private TypedArray f9046d;

    public C2832a(Context context) {
        this.f9044b = context.getResources().obtainTypedArray(C2722R.array.miscellaneous_menu_ids);
        this.f9045c = context.getResources().getStringArray(C2722R.array.miscellaneous_menu_titles);
        this.f9046d = context.getResources().obtainTypedArray(C2722R.array.miscellaneous_menu_drawables);
    }

    /* renamed from: a */
    private C2987b m12336a(int i) {
        return new C2987b(this.f9044b.getResourceId(i, -1), this.f9045c[i], this.f9046d.getResourceId(i, -1), BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public List<C2987b> mo10164b() {
        for (int i = 0; i < this.f9044b.length(); i++) {
            this.f9043a.add(m12336a(i));
        }
        return this.f9043a;
    }
}
