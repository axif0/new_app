package p374m.p375g0.p380i;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p374m.p375g0.C6130c;
import p385n.C6277c;
import p385n.C6281e;
import p385n.C6282f;
import p385n.C6288l;
import p385n.C6300s;

/* renamed from: m.g0.i.d */
final class C6182d {

    /* renamed from: a */
    static final C6180c[] f17396a = {new C6180c(C6180c.f17392i, (String) BuildConfig.FLAVOR), new C6180c(C6180c.f17389f, "GET"), new C6180c(C6180c.f17389f, "POST"), new C6180c(C6180c.f17390g, "/"), new C6180c(C6180c.f17390g, "/index.html"), new C6180c(C6180c.f17391h, "http"), new C6180c(C6180c.f17391h, "https"), new C6180c(C6180c.f17388e, "200"), new C6180c(C6180c.f17388e, "204"), new C6180c(C6180c.f17388e, "206"), new C6180c(C6180c.f17388e, "304"), new C6180c(C6180c.f17388e, "400"), new C6180c(C6180c.f17388e, "404"), new C6180c(C6180c.f17388e, "500"), new C6180c("accept-charset", (String) BuildConfig.FLAVOR), new C6180c("accept-encoding", "gzip, deflate"), new C6180c("accept-language", (String) BuildConfig.FLAVOR), new C6180c("accept-ranges", (String) BuildConfig.FLAVOR), new C6180c("accept", (String) BuildConfig.FLAVOR), new C6180c("access-control-allow-origin", (String) BuildConfig.FLAVOR), new C6180c("age", (String) BuildConfig.FLAVOR), new C6180c("allow", (String) BuildConfig.FLAVOR), new C6180c("authorization", (String) BuildConfig.FLAVOR), new C6180c("cache-control", (String) BuildConfig.FLAVOR), new C6180c("content-disposition", (String) BuildConfig.FLAVOR), new C6180c("content-encoding", (String) BuildConfig.FLAVOR), new C6180c("content-language", (String) BuildConfig.FLAVOR), new C6180c("content-length", (String) BuildConfig.FLAVOR), new C6180c("content-location", (String) BuildConfig.FLAVOR), new C6180c("content-range", (String) BuildConfig.FLAVOR), new C6180c("content-type", (String) BuildConfig.FLAVOR), new C6180c("cookie", (String) BuildConfig.FLAVOR), new C6180c("date", (String) BuildConfig.FLAVOR), new C6180c("etag", (String) BuildConfig.FLAVOR), new C6180c("expect", (String) BuildConfig.FLAVOR), new C6180c("expires", (String) BuildConfig.FLAVOR), new C6180c("from", (String) BuildConfig.FLAVOR), new C6180c("host", (String) BuildConfig.FLAVOR), new C6180c("if-match", (String) BuildConfig.FLAVOR), new C6180c("if-modified-since", (String) BuildConfig.FLAVOR), new C6180c("if-none-match", (String) BuildConfig.FLAVOR), new C6180c("if-range", (String) BuildConfig.FLAVOR), new C6180c("if-unmodified-since", (String) BuildConfig.FLAVOR), new C6180c("last-modified", (String) BuildConfig.FLAVOR), new C6180c("link", (String) BuildConfig.FLAVOR), new C6180c("location", (String) BuildConfig.FLAVOR), new C6180c("max-forwards", (String) BuildConfig.FLAVOR), new C6180c("proxy-authenticate", (String) BuildConfig.FLAVOR), new C6180c("proxy-authorization", (String) BuildConfig.FLAVOR), new C6180c("range", (String) BuildConfig.FLAVOR), new C6180c("referer", (String) BuildConfig.FLAVOR), new C6180c("refresh", (String) BuildConfig.FLAVOR), new C6180c("retry-after", (String) BuildConfig.FLAVOR), new C6180c("server", (String) BuildConfig.FLAVOR), new C6180c("set-cookie", (String) BuildConfig.FLAVOR), new C6180c("strict-transport-security", (String) BuildConfig.FLAVOR), new C6180c("transfer-encoding", (String) BuildConfig.FLAVOR), new C6180c("user-agent", (String) BuildConfig.FLAVOR), new C6180c("vary", (String) BuildConfig.FLAVOR), new C6180c("via", (String) BuildConfig.FLAVOR), new C6180c("www-authenticate", (String) BuildConfig.FLAVOR)};

    /* renamed from: b */
    static final Map<C6282f, Integer> f17397b = m25264b();

    /* renamed from: m.g0.i.d$a */
    static final class C6183a {

        /* renamed from: a */
        private final List<C6180c> f17398a;

        /* renamed from: b */
        private final C6281e f17399b;

        /* renamed from: c */
        private final int f17400c;

        /* renamed from: d */
        private int f17401d;

        /* renamed from: e */
        C6180c[] f17402e;

        /* renamed from: f */
        int f17403f;

        /* renamed from: g */
        int f17404g;

        /* renamed from: h */
        int f17405h;

        C6183a(int i, int i2, C6300s sVar) {
            this.f17398a = new ArrayList();
            C6180c[] cVarArr = new C6180c[8];
            this.f17402e = cVarArr;
            this.f17403f = cVarArr.length - 1;
            this.f17404g = 0;
            this.f17405h = 0;
            this.f17400c = i;
            this.f17401d = i2;
            this.f17399b = C6288l.m25933d(sVar);
        }

        C6183a(int i, C6300s sVar) {
            this(i, i, sVar);
        }

        /* renamed from: a */
        private void m25265a() {
            int i = this.f17401d;
            int i2 = this.f17405h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m25266b();
            } else {
                m25268d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m25266b() {
            Arrays.fill(this.f17402e, (Object) null);
            this.f17403f = this.f17402e.length - 1;
            this.f17404g = 0;
            this.f17405h = 0;
        }

        /* renamed from: c */
        private int m25267c(int i) {
            return this.f17403f + 1 + i;
        }

        /* renamed from: d */
        private int m25268d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f17402e.length;
                while (true) {
                    length--;
                    if (length < this.f17403f || i <= 0) {
                        C6180c[] cVarArr = this.f17402e;
                        int i3 = this.f17403f;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f17404g);
                        this.f17403f += i2;
                    } else {
                        C6180c[] cVarArr2 = this.f17402e;
                        i -= cVarArr2[length].f17395c;
                        this.f17405h -= cVarArr2[length].f17395c;
                        this.f17404g--;
                        i2++;
                    }
                }
                C6180c[] cVarArr3 = this.f17402e;
                int i32 = this.f17403f;
                System.arraycopy(cVarArr3, i32 + 1, cVarArr3, i32 + 1 + i2, this.f17404g);
                this.f17403f += i2;
            }
            return i2;
        }

        /* renamed from: f */
        private C6282f m25269f(int i) throws IOException {
            C6180c cVar;
            if (m25271h(i)) {
                cVar = C6182d.f17396a[i];
            } else {
                int c = m25267c(i - C6182d.f17396a.length);
                if (c >= 0) {
                    C6180c[] cVarArr = this.f17402e;
                    if (c < cVarArr.length) {
                        cVar = cVarArr[c];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            return cVar.f17393a;
        }

        /* renamed from: g */
        private void m25270g(int i, C6180c cVar) {
            this.f17398a.add(cVar);
            int i2 = cVar.f17395c;
            if (i != -1) {
                i2 -= this.f17402e[m25267c(i)].f17395c;
            }
            int i3 = this.f17401d;
            if (i2 > i3) {
                m25266b();
                return;
            }
            int d = m25268d((this.f17405h + i2) - i3);
            if (i == -1) {
                int i4 = this.f17404g + 1;
                C6180c[] cVarArr = this.f17402e;
                if (i4 > cVarArr.length) {
                    C6180c[] cVarArr2 = new C6180c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f17403f = this.f17402e.length - 1;
                    this.f17402e = cVarArr2;
                }
                int i5 = this.f17403f;
                this.f17403f = i5 - 1;
                this.f17402e[i5] = cVar;
                this.f17404g++;
            } else {
                this.f17402e[i + m25267c(i) + d] = cVar;
            }
            this.f17405h += i2;
        }

        /* renamed from: h */
        private boolean m25271h(int i) {
            return i >= 0 && i <= C6182d.f17396a.length - 1;
        }

        /* renamed from: i */
        private int m25272i() throws IOException {
            return this.f17399b.readByte() & 255;
        }

        /* renamed from: l */
        private void m25273l(int i) throws IOException {
            if (m25271h(i)) {
                this.f17398a.add(C6182d.f17396a[i]);
                return;
            }
            int c = m25267c(i - C6182d.f17396a.length);
            if (c >= 0) {
                C6180c[] cVarArr = this.f17402e;
                if (c < cVarArr.length) {
                    this.f17398a.add(cVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private void m25274n(int i) throws IOException {
            m25270g(-1, new C6180c(m25269f(i), mo17465j()));
        }

        /* renamed from: o */
        private void m25275o() throws IOException {
            C6282f j = mo17465j();
            C6182d.m25263a(j);
            m25270g(-1, new C6180c(j, mo17465j()));
        }

        /* renamed from: p */
        private void m25276p(int i) throws IOException {
            this.f17398a.add(new C6180c(m25269f(i), mo17465j()));
        }

        /* renamed from: q */
        private void m25277q() throws IOException {
            C6282f j = mo17465j();
            C6182d.m25263a(j);
            this.f17398a.add(new C6180c(j, mo17465j()));
        }

        /* renamed from: e */
        public List<C6180c> mo17464e() {
            ArrayList arrayList = new ArrayList(this.f17398a);
            this.f17398a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C6282f mo17465j() throws IOException {
            int i = m25272i();
            boolean z = (i & 128) == 128;
            int m = mo17467m(i, 127);
            return z ? C6282f.m25892s(C6211k.m25434f().mo17549c(this.f17399b.mo17798C((long) m))) : this.f17399b.mo17831k((long) m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo17466k() throws IOException {
            while (!this.f17399b.mo17794A()) {
                byte readByte = this.f17399b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m25273l(mo17467m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m25275o();
                } else if ((readByte & 64) == 64) {
                    m25274n(mo17467m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = mo17467m(readByte, 31);
                    this.f17401d = m;
                    if (m < 0 || m > this.f17400c) {
                        throw new IOException("Invalid dynamic table size update " + this.f17401d);
                    }
                    m25265a();
                } else if (readByte == 16 || readByte == 0) {
                    m25277q();
                } else {
                    m25276p(mo17467m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo17467m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m25272i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: m.g0.i.d$b */
    static final class C6184b {

        /* renamed from: a */
        private final C6277c f17406a;

        /* renamed from: b */
        private final boolean f17407b;

        /* renamed from: c */
        private int f17408c;

        /* renamed from: d */
        private boolean f17409d;

        /* renamed from: e */
        int f17410e;

        /* renamed from: f */
        C6180c[] f17411f;

        /* renamed from: g */
        int f17412g;

        /* renamed from: h */
        int f17413h;

        /* renamed from: i */
        int f17414i;

        C6184b(int i, boolean z, C6277c cVar) {
            this.f17408c = Integer.MAX_VALUE;
            C6180c[] cVarArr = new C6180c[8];
            this.f17411f = cVarArr;
            this.f17412g = cVarArr.length - 1;
            this.f17413h = 0;
            this.f17414i = 0;
            this.f17410e = i;
            this.f17407b = z;
            this.f17406a = cVar;
        }

        C6184b(C6277c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: a */
        private void m25282a() {
            int i = this.f17410e;
            int i2 = this.f17414i;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m25283b();
            } else {
                m25284c(i2 - i);
            }
        }

        /* renamed from: b */
        private void m25283b() {
            Arrays.fill(this.f17411f, (Object) null);
            this.f17412g = this.f17411f.length - 1;
            this.f17413h = 0;
            this.f17414i = 0;
        }

        /* renamed from: c */
        private int m25284c(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f17411f.length;
                while (true) {
                    length--;
                    if (length < this.f17412g || i <= 0) {
                        C6180c[] cVarArr = this.f17411f;
                        int i3 = this.f17412g;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f17413h);
                        C6180c[] cVarArr2 = this.f17411f;
                        int i4 = this.f17412g;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                        this.f17412g += i2;
                    } else {
                        C6180c[] cVarArr3 = this.f17411f;
                        i -= cVarArr3[length].f17395c;
                        this.f17414i -= cVarArr3[length].f17395c;
                        this.f17413h--;
                        i2++;
                    }
                }
                C6180c[] cVarArr4 = this.f17411f;
                int i32 = this.f17412g;
                System.arraycopy(cVarArr4, i32 + 1, cVarArr4, i32 + 1 + i2, this.f17413h);
                C6180c[] cVarArr22 = this.f17411f;
                int i42 = this.f17412g;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i2, (Object) null);
                this.f17412g += i2;
            }
            return i2;
        }

        /* renamed from: d */
        private void m25285d(C6180c cVar) {
            int i = cVar.f17395c;
            int i2 = this.f17410e;
            if (i > i2) {
                m25283b();
                return;
            }
            m25284c((this.f17414i + i) - i2);
            int i3 = this.f17413h + 1;
            C6180c[] cVarArr = this.f17411f;
            if (i3 > cVarArr.length) {
                C6180c[] cVarArr2 = new C6180c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f17412g = this.f17411f.length - 1;
                this.f17411f = cVarArr2;
            }
            int i4 = this.f17412g;
            this.f17412g = i4 - 1;
            this.f17411f[i4] = cVar;
            this.f17413h++;
            this.f17414i += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo17468e(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f17410e;
            if (i2 != min) {
                if (min < i2) {
                    this.f17408c = Math.min(this.f17408c, min);
                }
                this.f17409d = true;
                this.f17410e = min;
                m25282a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo17469f(C6282f fVar) throws IOException {
            int i;
            int i2;
            if (!this.f17407b || C6211k.m25434f().mo17551e(fVar) >= fVar.mo17892x()) {
                i2 = fVar.mo17892x();
                i = 0;
            } else {
                C6277c cVar = new C6277c();
                C6211k.m25434f().mo17550d(fVar, cVar);
                fVar = cVar.mo17822f0();
                i2 = fVar.mo17892x();
                i = 128;
            }
            mo17471h(i2, 127, i);
            this.f17406a.mo17839p0(fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo17470g(List<C6180c> list) throws IOException {
            int i;
            int i2;
            if (this.f17409d) {
                int i3 = this.f17408c;
                if (i3 < this.f17410e) {
                    mo17471h(i3, 31, 32);
                }
                this.f17409d = false;
                this.f17408c = Integer.MAX_VALUE;
                mo17471h(this.f17410e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C6180c cVar = list.get(i4);
                C6282f A = cVar.f17393a.mo17875A();
                C6282f fVar = cVar.f17394b;
                Integer num = C6182d.f17397b.get(A);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (C6130c.m25054q(C6182d.f17396a[i2 - 1].f17394b, fVar)) {
                            i = i2;
                        } else if (C6130c.m25054q(C6182d.f17396a[i2].f17394b, fVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f17412g + 1;
                    int length = this.f17411f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C6130c.m25054q(this.f17411f[i5].f17393a, A)) {
                            if (C6130c.m25054q(this.f17411f[i5].f17394b, fVar)) {
                                i2 = C6182d.f17396a.length + (i5 - this.f17412g);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f17412g) + C6182d.f17396a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo17471h(i2, 127, 128);
                } else {
                    if (i == -1) {
                        this.f17406a.mo17852t0(64);
                        mo17469f(A);
                    } else if (!A.mo17893y(C6180c.f17387d) || C6180c.f17392i.equals(A)) {
                        mo17471h(i, 63, 64);
                    } else {
                        mo17471h(i, 15, 0);
                        mo17469f(fVar);
                    }
                    mo17469f(fVar);
                    m25285d(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo17471h(int i, int i2, int i3) {
            int i4;
            C6277c cVar;
            if (i < i2) {
                cVar = this.f17406a;
                i4 = i | i3;
            } else {
                this.f17406a.mo17852t0(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f17406a.mo17852t0(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                cVar = this.f17406a;
            }
            cVar.mo17852t0(i4);
        }
    }

    /* renamed from: a */
    static C6282f m25263a(C6282f fVar) throws IOException {
        int x = fVar.mo17892x();
        int i = 0;
        while (i < x) {
            byte o = fVar.mo17884o(i);
            if (o < 65 || o > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.mo17877D());
            }
        }
        return fVar;
    }

    /* renamed from: b */
    private static Map<C6282f, Integer> m25264b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f17396a.length);
        int i = 0;
        while (true) {
            C6180c[] cVarArr = f17396a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f17393a)) {
                linkedHashMap.put(f17396a[i].f17393a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
