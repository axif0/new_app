package p148g.p189d.p190a.p232c.p241f.p246e;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.c.f.e.i */
public final class C4432i {

    /* renamed from: a */
    private static final Logger f13956a = Logger.getLogger(C4432i.class.getName());

    private C4432i() {
    }

    /* renamed from: a */
    public static void m18680a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f13956a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
