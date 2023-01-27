package p148g.p189d.p190a.p200b.p201h0;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* renamed from: g.d.a.b.h0.b */
public final class C3852b {

    /* renamed from: e */
    public static final C3852b f11598e = new C3854b().mo12571a();

    /* renamed from: a */
    public final int f11599a;

    /* renamed from: b */
    public final int f11600b;

    /* renamed from: c */
    public final int f11601c;

    /* renamed from: d */
    private AudioAttributes f11602d;

    /* renamed from: g.d.a.b.h0.b$b */
    public static final class C3854b {

        /* renamed from: a */
        private int f11603a = 0;

        /* renamed from: b */
        private int f11604b = 0;

        /* renamed from: c */
        private int f11605c = 1;

        /* renamed from: a */
        public C3852b mo12571a() {
            return new C3852b(this.f11603a, this.f11604b, this.f11605c);
        }
    }

    private C3852b(int i, int i2, int i3) {
        this.f11599a = i;
        this.f11600b = i2;
        this.f11601c = i3;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: a */
    public AudioAttributes mo12568a() {
        if (this.f11602d == null) {
            this.f11602d = new AudioAttributes.Builder().setContentType(this.f11599a).setFlags(this.f11600b).setUsage(this.f11601c).build();
        }
        return this.f11602d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3852b.class != obj.getClass()) {
            return false;
        }
        C3852b bVar = (C3852b) obj;
        return this.f11599a == bVar.f11599a && this.f11600b == bVar.f11600b && this.f11601c == bVar.f11601c;
    }

    public int hashCode() {
        return ((((527 + this.f11599a) * 31) + this.f11600b) * 31) + this.f11601c;
    }
}
