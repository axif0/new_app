package p374m.p375g0.p378g;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.net.ProtocolException;
import p374m.C6268y;

/* renamed from: m.g0.g.k */
public final class C6169k {

    /* renamed from: a */
    public final C6268y f17348a;

    /* renamed from: b */
    public final int f17349b;

    /* renamed from: c */
    public final String f17350c;

    public C6169k(C6268y yVar, int i, String str) {
        this.f17348a = yVar;
        this.f17349b = i;
        this.f17350c = str;
    }

    /* renamed from: a */
    public static C6169k m25237a(String str) throws IOException {
        C6268y yVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                yVar = C6268y.HTTP_1_0;
            } else if (charAt == 1) {
                yVar = C6268y.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            yVar = C6268y.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = BuildConfig.FLAVOR;
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C6169k(yVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17348a == C6268y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f17349b);
        if (this.f17350c != null) {
            sb.append(' ');
            sb.append(this.f17350c);
        }
        return sb.toString();
    }
}
