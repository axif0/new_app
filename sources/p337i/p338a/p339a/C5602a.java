package p337i.p338a.p339a;

import android.annotation.TargetApi;
import android.graphics.Paint;
import android.view.View;
import java.lang.ref.WeakReference;
import p148g.p325e.p326a.C5544a;
import p148g.p325e.p327b.C5588a;
import p337i.p338a.p339a.C5614e;

/* renamed from: i.a.a.a */
public interface C5602a {

    /* renamed from: b */
    public static final C5607e f16175b = new C5607e();

    /* renamed from: i.a.a.a$a */
    public static class C5603a extends C5614e.C5615a {

        /* renamed from: a */
        WeakReference<C5602a> f16176a;

        C5603a(C5602a aVar) {
            this.f16176a = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            ((C5602a) this.f16176a.get()).mo16129c();
        }

        /* renamed from: c */
        public void mo567c(C5544a aVar) {
            ((C5602a) this.f16176a.get()).mo16127a();
        }
    }

    @TargetApi(11)
    /* renamed from: i.a.a.a$b */
    public static class C5604b extends C5603a {

        /* renamed from: b */
        int f16177b = 1;

        /* renamed from: c */
        int f16178c;

        C5604b(C5602a aVar) {
            super(aVar);
            this.f16178c = ((View) aVar).getLayerType();
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            ((View) this.f16176a.get()).setLayerType(this.f16178c, (Paint) null);
            super.mo565a(aVar);
        }

        /* renamed from: c */
        public void mo567c(C5544a aVar) {
            ((View) this.f16176a.get()).setLayerType(this.f16177b, (Paint) null);
            super.mo567c(aVar);
        }
    }

    /* renamed from: i.a.a.a$c */
    public static class C5605c extends C5604b {
        @TargetApi(11)
        C5605c(C5602a aVar) {
            super(aVar);
            this.f16177b = 2;
        }
    }

    /* renamed from: i.a.a.a$d */
    public static class C5606d {

        /* renamed from: a */
        public final int f16179a;

        /* renamed from: b */
        public final int f16180b;

        /* renamed from: c */
        public final WeakReference<View> f16181c;

        public C5606d(int i, int i2, float f, float f2, WeakReference<View> weakReference) {
            this.f16179a = i;
            this.f16180b = i2;
            this.f16181c = weakReference;
        }

        /* renamed from: a */
        public View mo16132a() {
            return (View) this.f16181c.get();
        }
    }

    /* renamed from: i.a.a.a$e */
    public static class C5607e extends C5588a<C5602a> {
        public C5607e() {
            super("revealRadius");
        }

        /* renamed from: f */
        public Float mo16005a(C5602a aVar) {
            return Float.valueOf(aVar.getRevealRadius());
        }

        /* renamed from: g */
        public void mo16006e(C5602a aVar, float f) {
            aVar.setRevealRadius(f);
        }
    }

    /* renamed from: a */
    void mo16127a();

    /* renamed from: b */
    void mo16128b(C5606d dVar);

    /* renamed from: c */
    void mo16129c();

    float getRevealRadius();

    void setRevealRadius(float f);
}
