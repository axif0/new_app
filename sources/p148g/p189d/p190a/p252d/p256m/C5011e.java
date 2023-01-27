package p148g.p189d.p190a.p252d.p256m;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: g.d.a.d.m.e */
public class C5011e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f14954b = new C5011e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f14955a = new WeakHashMap<>();

    private C5011e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f14955a.containsKey(drawable)) {
            return this.f14955a.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f14955a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
