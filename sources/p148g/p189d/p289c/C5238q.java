package p148g.p189d.p289c;

import java.math.BigInteger;
import p148g.p189d.p289c.p291y.C5253a;
import p148g.p189d.p289c.p291y.C5277g;

/* renamed from: g.d.c.q */
public final class C5238q extends C5233l {

    /* renamed from: b */
    private static final Class<?>[] f15305b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f15306a;

    public C5238q(Boolean bool) {
        mo15391E(bool);
    }

    public C5238q(Number number) {
        mo15391E(number);
    }

    public C5238q(String str) {
        mo15391E(str);
    }

    /* renamed from: A */
    private static boolean m21839A(C5238q qVar) {
        Object obj = qVar.f15306a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: C */
    private static boolean m21840C(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f15305b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean mo15389B() {
        return this.f15306a instanceof Number;
    }

    /* renamed from: D */
    public boolean mo15390D() {
        return this.f15306a instanceof String;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo15391E(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            C5253a.m21860a((obj instanceof Number) || m21840C(obj));
        }
        this.f15306a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5238q.class != obj.getClass()) {
            return false;
        }
        C5238q qVar = (C5238q) obj;
        if (this.f15306a == null) {
            return qVar.f15306a == null;
        }
        if (m21839A(this) && m21839A(qVar)) {
            return mo15399u().longValue() == qVar.mo15399u().longValue();
        }
        if (!(this.f15306a instanceof Number) || !(qVar.f15306a instanceof Number)) {
            return this.f15306a.equals(qVar.f15306a);
        }
        double doubleValue = mo15399u().doubleValue();
        double doubleValue2 = qVar.mo15399u().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f15306a == null) {
            return 31;
        }
        if (m21839A(this)) {
            doubleToLongBits = mo15399u().longValue();
        } else {
            Object obj = this.f15306a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo15399u().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: o */
    public boolean mo15394o() {
        return mo15401x() ? mo15395p().booleanValue() : Boolean.parseBoolean(mo15400w());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Boolean mo15395p() {
        return (Boolean) this.f15306a;
    }

    /* renamed from: q */
    public double mo15396q() {
        return mo15389B() ? mo15399u().doubleValue() : Double.parseDouble(mo15400w());
    }

    /* renamed from: r */
    public int mo15397r() {
        return mo15389B() ? mo15399u().intValue() : Integer.parseInt(mo15400w());
    }

    /* renamed from: t */
    public long mo15398t() {
        return mo15389B() ? mo15399u().longValue() : Long.parseLong(mo15400w());
    }

    /* renamed from: u */
    public Number mo15399u() {
        Object obj = this.f15306a;
        return obj instanceof String ? new C5277g((String) this.f15306a) : (Number) obj;
    }

    /* renamed from: w */
    public String mo15400w() {
        return mo15389B() ? mo15399u().toString() : mo15401x() ? mo15395p().toString() : (String) this.f15306a;
    }

    /* renamed from: x */
    public boolean mo15401x() {
        return this.f15306a instanceof Boolean;
    }
}
