package p086f.p099c.p100b;

import android.os.Bundle;

/* renamed from: f.c.b.a */
public final class C3181a {

    /* renamed from: a */
    public final Integer f10109a;

    /* renamed from: b */
    public final Integer f10110b;

    /* renamed from: c */
    public final Integer f10111c;

    /* renamed from: f.c.b.a$a */
    public static final class C3182a {

        /* renamed from: a */
        private Integer f10112a;

        /* renamed from: b */
        private Integer f10113b;

        /* renamed from: c */
        private Integer f10114c;

        /* renamed from: a */
        public C3181a mo11005a() {
            return new C3181a(this.f10112a, this.f10113b, this.f10114c);
        }

        /* renamed from: b */
        public C3182a mo11006b(int i) {
            this.f10112a = Integer.valueOf(i | -16777216);
            return this;
        }
    }

    C3181a(Integer num, Integer num2, Integer num3) {
        this.f10109a = num;
        this.f10110b = num2;
        this.f10111c = num3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo11004a() {
        Bundle bundle = new Bundle();
        Integer num = this.f10109a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f10110b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f10111c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        return bundle;
    }
}
