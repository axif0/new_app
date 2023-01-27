package p148g.p189d.p190a.p191a.p192i;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;

/* renamed from: g.d.a.a.i.r */
abstract class C3762r implements Closeable {

    /* renamed from: g.d.a.a.i.r$a */
    interface C3763a {
        /* renamed from: a */
        C3762r mo12330a();

        /* renamed from: b */
        C3763a mo12331b(Context context);
    }

    C3762r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C3784c mo12328a();

    public void close() throws IOException {
        mo12328a().close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract C3761q mo12329h();
}
