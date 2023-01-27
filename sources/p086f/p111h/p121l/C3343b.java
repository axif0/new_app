package p086f.p111h.p121l;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: f.h.l.b */
public class C3343b extends Writer {

    /* renamed from: f */
    private final String f10636f;

    /* renamed from: g */
    private StringBuilder f10637g = new StringBuilder(128);

    public C3343b(String str) {
        this.f10636f = str;
    }

    /* renamed from: a */
    private void m14349a() {
        if (this.f10637g.length() > 0) {
            Log.d(this.f10636f, this.f10637g.toString());
            StringBuilder sb = this.f10637g;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m14349a();
    }

    public void flush() {
        m14349a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m14349a();
            } else {
                this.f10637g.append(c);
            }
        }
    }
}
