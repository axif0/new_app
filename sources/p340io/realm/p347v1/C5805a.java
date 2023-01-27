package p340io.realm.p347v1;

import java.util.Date;
import p340io.realm.C5755j1;
import p340io.realm.C5771n0;
import p340io.realm.internal.C5720n;

/* renamed from: io.realm.v1.a */
public class C5805a extends C5771n0 implements C5755j1 {

    /* renamed from: a */
    private String f16817a;

    /* renamed from: b */
    private byte f16818b;

    /* renamed from: c */
    private String f16819c;

    /* renamed from: d */
    private String f16820d;

    /* renamed from: e */
    private String f16821e;

    /* renamed from: f */
    private int f16822f;

    /* renamed from: g */
    private Date f16823g;

    /* renamed from: h */
    private Date f16824h;

    /* renamed from: i */
    private Date f16825i;

    /* renamed from: j */
    private Long f16826j;

    /* renamed from: io.realm.v1.a$a */
    public enum C5806a {
        ERROR((byte) -1),
        PENDING((byte) 0),
        ACTIVE((byte) 1),
        INVALIDATED((String) null);
        

        /* renamed from: f */
        private final Byte f16832f;

        private C5806a(Byte b) {
            this.f16832f = b;
        }

        /* renamed from: e */
        public Byte mo16818e() {
            return this.f16832f;
        }
    }

    public C5805a() {
        if (this instanceof C5720n) {
            ((C5720n) this).mo16213Q();
        }
    }

    /* renamed from: A */
    public String mo16332A() {
        return this.f16821e;
    }

    /* renamed from: H */
    public Long mo16333H() {
        return this.f16826j;
    }

    /* renamed from: M */
    public Date mo16334M() {
        return this.f16825i;
    }

    /* renamed from: P */
    public Date mo16335P() {
        return this.f16824h;
    }

    /* renamed from: R */
    public String mo16336R() {
        return this.f16819c;
    }

    /* renamed from: c */
    public String mo16337c() {
        return this.f16817a;
    }

    /* renamed from: n */
    public int mo16340n() {
        return this.f16822f;
    }

    public String toString() {
        return "Subscription{name='" + mo16337c() + '\'' + ", status=" + mo16342w() + ", errorMessage='" + mo16336R() + '\'' + ", query='" + mo16332A() + '\'' + ", createdAt=" + mo16341v() + ", updatedAt=" + mo16335P() + ", expiresAt=" + mo16334M() + ", timeToLive=" + mo16333H() + '}';
    }

    /* renamed from: v */
    public Date mo16341v() {
        return this.f16823g;
    }

    /* renamed from: w */
    public byte mo16342w() {
        return this.f16818b;
    }

    /* renamed from: z */
    public String mo16343z() {
        return this.f16820d;
    }
}
