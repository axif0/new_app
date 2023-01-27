package p148g.p189d.p190a.p271e.p272a.p276c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.d.a.e.a.c.v */
public abstract class C5132v implements Closeable {
    /* renamed from: a */
    public abstract long mo9145a();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract InputStream mo9147h(long j, long j2) throws IOException;

    /* renamed from: j */
    public synchronized InputStream mo15232j() throws IOException {
        return mo9147h(0, mo9145a());
    }
}
