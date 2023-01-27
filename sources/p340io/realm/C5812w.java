package p340io.realm;

import java.util.Locale;

/* renamed from: io.realm.w */
public interface C5812w {

    /* renamed from: io.realm.w$a */
    public static class C5813a {

        /* renamed from: a */
        public final int f16849a;

        /* renamed from: b */
        public final int f16850b;

        public C5813a(int i, int i2) {
            this.f16849a = i;
            this.f16850b = i2;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", new Object[]{Integer.valueOf(this.f16849a), Integer.valueOf(this.f16850b)});
        }
    }

    /* renamed from: io.realm.w$b */
    public enum C5814b {
        INITIAL,
        UPDATE,
        ERROR
    }
}
