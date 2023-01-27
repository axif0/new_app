package p148g.p179c.p180a.p181a.p182c;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: g.c.a.a.c.b */
public class C3710b implements C3709a {

    /* renamed from: a */
    protected final Path f11315a = new Path();

    /* renamed from: b */
    private final Paint f11316b;

    /* renamed from: c */
    private C3711a f11317c;

    /* renamed from: g.c.a.a.c.b$a */
    public interface C3711a {
        /* renamed from: a */
        boolean mo5940a();

        /* renamed from: b */
        Path mo5941b(int i, int i2);
    }

    public C3710b() {
        Paint paint = new Paint(1);
        this.f11316b = paint;
        this.f11317c = null;
        paint.setColor(-16777216);
        this.f11316b.setStyle(Paint.Style.FILL);
        this.f11316b.setAntiAlias(true);
        this.f11316b.setStrokeWidth(1.0f);
    }

    /* renamed from: a */
    public boolean mo12237a() {
        C3711a aVar = this.f11317c;
        return aVar != null && aVar.mo5940a();
    }

    /* renamed from: b */
    public void mo12238b(int i, int i2) {
        this.f11315a.reset();
        Path f = mo12242f(i, i2);
        if (f != null) {
            this.f11315a.set(f);
        }
    }

    /* renamed from: c */
    public Path mo12239c(int i, int i2) {
        return this.f11315a;
    }

    /* renamed from: d */
    public Paint mo12240d() {
        return this.f11316b;
    }

    /* renamed from: e */
    public Path mo12241e() {
        return this.f11315a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Path mo12242f(int i, int i2) {
        C3711a aVar = this.f11317c;
        if (aVar != null) {
            return aVar.mo5941b(i, i2);
        }
        return null;
    }

    /* renamed from: g */
    public void mo12243g(C3711a aVar) {
        this.f11317c = aVar;
    }
}
