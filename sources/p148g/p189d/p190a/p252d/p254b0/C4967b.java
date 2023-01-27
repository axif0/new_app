package p148g.p189d.p190a.p252d.p254b0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: g.d.a.d.b0.b */
public final class C4967b implements C4968c {

    /* renamed from: a */
    private final C4968c f14808a;

    /* renamed from: b */
    private final float f14809b;

    public C4967b(float f, C4968c cVar) {
        while (cVar instanceof C4967b) {
            cVar = ((C4967b) cVar).f14808a;
            f += ((C4967b) cVar).f14809b;
        }
        this.f14808a = cVar;
        this.f14809b = f;
    }

    /* renamed from: a */
    public float mo14903a(RectF rectF) {
        return Math.max(0.0f, this.f14808a.mo14903a(rectF) + this.f14809b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4967b)) {
            return false;
        }
        C4967b bVar = (C4967b) obj;
        return this.f14808a.equals(bVar.f14808a) && this.f14809b == bVar.f14809b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14808a, Float.valueOf(this.f14809b)});
    }
}
