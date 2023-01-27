package p148g.p189d.p190a.p252d.p254b0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: g.d.a.d.b0.i */
public final class C4977i implements C4968c {

    /* renamed from: a */
    private final float f14859a;

    public C4977i(float f) {
        this.f14859a = f;
    }

    /* renamed from: a */
    public float mo14903a(RectF rectF) {
        return this.f14859a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4977i) && this.f14859a == ((C4977i) obj).f14859a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14859a)});
    }
}
