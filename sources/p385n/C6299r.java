package p385n;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: n.r */
public interface C6299r extends Closeable, Flushable {
    void close() throws IOException;

    /* renamed from: f */
    void mo17384f(C6277c cVar, long j) throws IOException;

    void flush() throws IOException;

    C6301t timeout();
}
