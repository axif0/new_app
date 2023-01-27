package p148g.p189d.p190a.p271e.p272a.p273a;

import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p271e.p272a.p273a.C5061d;

/* renamed from: g.d.a.e.a.a.x */
final class C5082x extends C5061d.C5062a {

    /* renamed from: a */
    private Integer f15117a;

    /* renamed from: b */
    private Boolean f15118b;

    C5082x() {
    }

    /* renamed from: a */
    public final C5061d mo15174a() {
        Integer num = this.f15117a;
        String str = BuildConfig.FLAVOR;
        if (num == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.f15118b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new C5083y(this.f15117a.intValue(), this.f15118b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    /* renamed from: b */
    public final C5061d.C5062a mo15186b(boolean z) {
        this.f15118b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final C5061d.C5062a mo15187c(int i) {
        this.f15117a = Integer.valueOf(i);
        return this;
    }
}
