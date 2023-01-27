package p148g.p189d.p190a.p200b.p201h0;

import java.nio.ByteBuffer;
import p148g.p189d.p190a.p200b.C4315w;

/* renamed from: g.d.a.b.h0.f */
public interface C3866f {

    /* renamed from: g.d.a.b.h0.f$a */
    public static final class C3867a extends Exception {
        public C3867a(String str) {
            super(str);
        }

        public C3867a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: g.d.a.b.h0.f$b */
    public static final class C3868b extends Exception {
        public C3868b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
        }
    }

    /* renamed from: g.d.a.b.h0.f$c */
    public interface C3869c {
        /* renamed from: a */
        void mo12618a();

        /* renamed from: b */
        void mo12619b(int i);

        /* renamed from: c */
        void mo12620c(int i, long j, long j2);
    }

    /* renamed from: g.d.a.b.h0.f$d */
    public static final class C3870d extends Exception {
        public C3870d(int i) {
            super("AudioTrack write failed: " + i);
        }
    }

    /* renamed from: a */
    void mo12599a();

    /* renamed from: b */
    void mo12600b();

    /* renamed from: c */
    boolean mo12601c();

    /* renamed from: d */
    C4315w mo12602d();

    /* renamed from: e */
    void mo12603e();

    /* renamed from: h */
    C4315w mo12604h(C4315w wVar);

    /* renamed from: i */
    void mo12605i(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) throws C3867a;

    /* renamed from: j */
    void mo12606j() throws C3870d;

    /* renamed from: k */
    boolean mo12607k();

    /* renamed from: l */
    void mo12608l();

    /* renamed from: m */
    long mo12609m(boolean z);

    /* renamed from: n */
    void mo12610n();

    /* renamed from: o */
    void mo12611o(C3869c cVar);

    /* renamed from: p */
    void mo12612p(C3852b bVar);

    /* renamed from: q */
    boolean mo12613q(int i);

    /* renamed from: r */
    void mo12614r();

    /* renamed from: s */
    void mo12615s(float f);

    /* renamed from: t */
    boolean mo12616t(ByteBuffer byteBuffer, long j) throws C3868b, C3870d;

    /* renamed from: u */
    void mo12617u(int i);
}
