package p148g.p189d.p289c.p291y;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import p148g.p189d.p289c.C5233l;
import p148g.p189d.p289c.p291y.p292n.C5325n;

/* renamed from: g.d.c.y.l */
public final class C5289l {

    /* renamed from: g.d.c.y.l$a */
    private static final class C5290a extends Writer {

        /* renamed from: f */
        private final Appendable f15367f;

        /* renamed from: g */
        private final C5291a f15368g = new C5291a();

        /* renamed from: g.d.c.y.l$a$a */
        static class C5291a implements CharSequence {

            /* renamed from: f */
            char[] f15369f;

            C5291a() {
            }

            public char charAt(int i) {
                return this.f15369f[i];
            }

            public int length() {
                return this.f15369f.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f15369f, i, i2 - i);
            }
        }

        C5290a(Appendable appendable) {
            this.f15367f = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) throws IOException {
            this.f15367f.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C5291a aVar = this.f15368g;
            aVar.f15369f = cArr;
            this.f15367f.append(aVar, i, i2 + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new p148g.p189d.p289c.C5234m((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new p148g.p189d.p289c.C5241t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return p148g.p189d.p289c.C5235n.f15303a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new p148g.p189d.p289c.C5241t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new p148g.p189d.p289c.C5241t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p148g.p189d.p289c.C5233l m21944a(com.google.gson.stream.JsonReader r2) throws p148g.p189d.p289c.C5237p {
        /*
            r2.peek()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            g.d.c.v<g.d.c.l> r1 = p148g.p189d.p289c.p291y.p292n.C5325n.f15456X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo15331b(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            g.d.c.l r2 = (p148g.p189d.p289c.C5233l) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            g.d.c.t r0 = new g.d.c.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            g.d.c.m r0 = new g.d.c.m
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            g.d.c.t r0 = new g.d.c.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            g.d.c.n r2 = p148g.p189d.p289c.C5235n.f15303a
            return r2
        L_0x002b:
            g.d.c.t r0 = new g.d.c.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p289c.p291y.C5289l.m21944a(com.google.gson.stream.JsonReader):g.d.c.l");
    }

    /* renamed from: b */
    public static void m21945b(C5233l lVar, JsonWriter jsonWriter) throws IOException {
        C5325n.f15456X.mo15332d(jsonWriter, lVar);
    }

    /* renamed from: c */
    public static Writer m21946c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C5290a(appendable);
    }
}
