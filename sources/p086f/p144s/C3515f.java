package p086f.p144s;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: f.s.f */
class C3515f {
    /* renamed from: a */
    static <T> ObjectAnimator m15086a(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C3519h(property, path), new float[]{0.0f, 1.0f});
    }
}
