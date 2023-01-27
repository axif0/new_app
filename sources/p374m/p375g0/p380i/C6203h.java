package p374m.p375g0.p380i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p374m.p375g0.C6130c;
import p374m.p375g0.p380i.C6182d;
import p385n.C6277c;
import p385n.C6281e;
import p385n.C6282f;
import p385n.C6300s;
import p385n.C6301t;

/* renamed from: m.g0.i.h */
final class C6203h implements Closeable {

    /* renamed from: j */
    static final Logger f17491j = Logger.getLogger(C6185e.class.getName());

    /* renamed from: f */
    private final C6281e f17492f;

    /* renamed from: g */
    private final C6204a f17493g;

    /* renamed from: h */
    private final boolean f17494h;

    /* renamed from: i */
    final C6182d.C6183a f17495i;

    /* renamed from: m.g0.i.h$a */
    static final class C6204a implements C6300s {

        /* renamed from: f */
        private final C6281e f17496f;

        /* renamed from: g */
        int f17497g;

        /* renamed from: h */
        byte f17498h;

        /* renamed from: i */
        int f17499i;

        /* renamed from: j */
        int f17500j;

        /* renamed from: k */
        short f17501k;

        C6204a(C6281e eVar) {
            this.f17496f = eVar;
        }

        /* renamed from: a */
        private void m25375a() throws IOException {
            int i = this.f17499i;
            int t = C6203h.m25369t(this.f17496f);
            this.f17500j = t;
            this.f17497g = t;
            byte readByte = (byte) (this.f17496f.readByte() & 255);
            this.f17498h = (byte) (this.f17496f.readByte() & 255);
            if (C6203h.f17491j.isLoggable(Level.FINE)) {
                C6203h.f17491j.fine(C6185e.m25291b(true, this.f17499i, this.f17497g, readByte, this.f17498h));
            }
            int readInt = this.f17496f.readInt() & Integer.MAX_VALUE;
            this.f17499i = readInt;
            if (readByte != 9) {
                C6185e.m25293d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (readInt != i) {
                C6185e.m25293d("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        /* renamed from: O */
        public long mo17355O(C6277c cVar, long j) throws IOException {
            while (true) {
                int i = this.f17500j;
                if (i == 0) {
                    this.f17496f.mo17815c((long) this.f17501k);
                    this.f17501k = 0;
                    if ((this.f17498h & 4) != 0) {
                        return -1;
                    }
                    m25375a();
                } else {
                    long O = this.f17496f.mo17355O(cVar, Math.min(j, (long) i));
                    if (O == -1) {
                        return -1;
                    }
                    this.f17500j = (int) (((long) this.f17500j) - O);
                    return O;
                }
            }
        }

        public void close() throws IOException {
        }

        public C6301t timeout() {
            return this.f17496f.timeout();
        }
    }

    /* renamed from: m.g0.i.h$b */
    interface C6205b {
        /* renamed from: a */
        void mo17498a();

        /* renamed from: b */
        void mo17499b(boolean z, C6215m mVar);

        /* renamed from: c */
        void mo17500c(boolean z, int i, C6281e eVar, int i2) throws IOException;

        /* renamed from: d */
        void mo17501d(boolean z, int i, int i2);

        /* renamed from: e */
        void mo17502e(int i, int i2, int i3, boolean z);

        /* renamed from: f */
        void mo17503f(int i, C6179b bVar);

        /* renamed from: g */
        void mo17504g(boolean z, int i, int i2, List<C6180c> list);

        /* renamed from: h */
        void mo17505h(int i, long j);

        /* renamed from: i */
        void mo17506i(int i, int i2, List<C6180c> list) throws IOException;

        /* renamed from: j */
        void mo17507j(int i, C6179b bVar, C6282f fVar);
    }

    C6203h(C6281e eVar, boolean z) {
        this.f17492f = eVar;
        this.f17494h = z;
        C6204a aVar = new C6204a(eVar);
        this.f17493g = aVar;
        this.f17495i = new C6182d.C6183a(4096, aVar);
    }

    /* renamed from: D */
    private void m25360D(C6205b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f17492f.readByte() & 255);
            }
            bVar.mo17506i(i2, this.f17492f.readInt() & Integer.MAX_VALUE, m25367q(m25364a(i - 4, b, s), s, b, i2));
            return;
        }
        C6185e.m25293d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: H */
    private void m25361H(C6205b bVar, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            C6185e.m25293d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.f17492f.readInt();
            C6179b e = C6179b.m25261e(readInt);
            if (e != null) {
                bVar.mo17503f(i2, e);
                return;
            }
            C6185e.m25293d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            C6185e.m25293d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: J */
    private void m25362J(C6205b bVar, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            C6185e.m25293d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo17498a();
            } else {
                C6185e.m25293d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i % 6 == 0) {
            C6215m mVar = new C6215m();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f17492f.readShort() & 65535;
                int readInt = this.f17492f.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            C6185e.m25293d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        C6185e.m25293d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    C6185e.m25293d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                mVar.mo17564i(readShort, readInt);
            }
            bVar.mo17499b(false, mVar);
        } else {
            C6185e.m25293d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: Q */
    private void m25363Q(C6205b bVar, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f17492f.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo17505h(i2, readInt);
                return;
            }
            C6185e.m25293d("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        C6185e.m25293d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    /* renamed from: a */
    static int m25364a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C6185e.m25293d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* renamed from: m */
    private void m25365m(C6205b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f17492f.readByte() & 255);
                }
                bVar.mo17500c(z2, i2, this.f17492f, m25364a(i, b, s));
                this.f17492f.mo17815c((long) s);
                return;
            }
            C6185e.m25293d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        C6185e.m25293d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: o */
    private void m25366o(C6205b bVar, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            C6185e.m25293d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f17492f.readInt();
            int readInt2 = this.f17492f.readInt();
            int i3 = i - 8;
            C6179b e = C6179b.m25261e(readInt2);
            if (e != null) {
                C6282f fVar = C6282f.f17781j;
                if (i3 > 0) {
                    fVar = this.f17492f.mo17831k((long) i3);
                }
                bVar.mo17507j(readInt, e, fVar);
                return;
            }
            C6185e.m25293d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            C6185e.m25293d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: q */
    private List<C6180c> m25367q(int i, short s, byte b, int i2) throws IOException {
        C6204a aVar = this.f17493g;
        aVar.f17500j = i;
        aVar.f17497g = i;
        aVar.f17501k = s;
        aVar.f17498h = b;
        aVar.f17499i = i2;
        this.f17495i.mo17466k();
        return this.f17495i.mo17464e();
    }

    /* renamed from: r */
    private void m25368r(C6205b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f17492f.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m25371w(bVar, i2);
                i -= 5;
            }
            bVar.mo17504g(z, i2, -1, m25367q(m25364a(i, b, s), s, b, i2));
            return;
        }
        C6185e.m25293d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: t */
    static int m25369t(C6281e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* renamed from: u */
    private void m25370u(C6205b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            C6185e.m25293d("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f17492f.readInt();
            int readInt2 = this.f17492f.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo17501d(z, readInt, readInt2);
        } else {
            C6185e.m25293d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: w */
    private void m25371w(C6205b bVar, int i) throws IOException {
        int readInt = this.f17492f.readInt();
        bVar.mo17502e(i, readInt & Integer.MAX_VALUE, (this.f17492f.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: x */
    private void m25372x(C6205b bVar, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            C6185e.m25293d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            m25371w(bVar, i2);
        } else {
            C6185e.m25293d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    public void close() throws IOException {
        this.f17492f.close();
    }

    /* renamed from: h */
    public boolean mo17509h(boolean z, C6205b bVar) throws IOException {
        try {
            this.f17492f.mo17809W(9);
            int t = m25369t(this.f17492f);
            if (t < 0 || t > 16384) {
                C6185e.m25293d("FRAME_SIZE_ERROR: %s", Integer.valueOf(t));
                throw null;
            }
            byte readByte = (byte) (this.f17492f.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f17492f.readByte() & 255);
                int readInt = this.f17492f.readInt() & Integer.MAX_VALUE;
                if (f17491j.isLoggable(Level.FINE)) {
                    f17491j.fine(C6185e.m25291b(true, readInt, t, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m25365m(bVar, t, readByte2, readInt);
                        break;
                    case 1:
                        m25368r(bVar, t, readByte2, readInt);
                        break;
                    case 2:
                        m25372x(bVar, t, readByte2, readInt);
                        break;
                    case 3:
                        m25361H(bVar, t, readByte2, readInt);
                        break;
                    case 4:
                        m25362J(bVar, t, readByte2, readInt);
                        break;
                    case 5:
                        m25360D(bVar, t, readByte2, readInt);
                        break;
                    case 6:
                        m25370u(bVar, t, readByte2, readInt);
                        break;
                    case 7:
                        m25366o(bVar, t, readByte2, readInt);
                        break;
                    case 8:
                        m25363Q(bVar, t, readByte2, readInt);
                        break;
                    default:
                        this.f17492f.mo17815c((long) t);
                        break;
                }
                return true;
            }
            C6185e.m25293d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public void mo17510j(C6205b bVar) throws IOException {
        if (!this.f17494h) {
            C6282f k = this.f17492f.mo17831k((long) C6185e.f17415a.mo17892x());
            if (f17491j.isLoggable(Level.FINE)) {
                f17491j.fine(C6130c.m25055r("<< CONNECTION %s", k.mo17885q()));
            }
            if (!C6185e.f17415a.equals(k)) {
                C6185e.m25293d("Expected a connection header but was %s", k.mo17877D());
                throw null;
            }
        } else if (!mo17509h(true, bVar)) {
            C6185e.m25293d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }
}
