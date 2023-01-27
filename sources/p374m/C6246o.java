package p374m;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: m.o */
public interface C6246o {

    /* renamed from: a */
    public static final C6246o f17636a = new C6247a();

    /* renamed from: m.o$a */
    class C6247a implements C6246o {
        C6247a() {
        }

        /* renamed from: a */
        public List<InetAddress> mo17650a(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    }

    /* renamed from: a */
    List<InetAddress> mo17650a(String str) throws UnknownHostException;
}
