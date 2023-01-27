package p374m;

import java.io.IOException;

/* renamed from: m.y */
public enum C6268y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: f */
    private final String f17753f;

    private C6268y(String str) {
        this.f17753f = str;
    }

    /* renamed from: e */
    public static C6268y m25765e(String str) throws IOException {
        C6268y yVar = QUIC;
        C6268y yVar2 = SPDY_3;
        C6268y yVar3 = HTTP_2;
        C6268y yVar4 = H2_PRIOR_KNOWLEDGE;
        C6268y yVar5 = HTTP_1_1;
        C6268y yVar6 = HTTP_1_0;
        if (str.equals(yVar6.f17753f)) {
            return yVar6;
        }
        if (str.equals(yVar5.f17753f)) {
            return yVar5;
        }
        if (str.equals(yVar4.f17753f)) {
            return yVar4;
        }
        if (str.equals(yVar3.f17753f)) {
            return yVar3;
        }
        if (str.equals(yVar2.f17753f)) {
            return yVar2;
        }
        if (str.equals(yVar.f17753f)) {
            return yVar;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f17753f;
    }
}
