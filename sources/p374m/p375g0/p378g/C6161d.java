package p374m.p375g0.p378g;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p374m.p375g0.C6130c;

/* renamed from: m.g0.g.d */
public final class C6161d {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f17326a = new C6162a();

    /* renamed from: b */
    private static final String[] f17327b;

    /* renamed from: c */
    private static final DateFormat[] f17328c;

    /* renamed from: m.g0.g.d$a */
    class C6162a extends ThreadLocal<DateFormat> {
        C6162a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C6130c.f17210n);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f17327b = strArr;
        f17328c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static String m25188a(Date date) {
        return f17326a.get().format(date);
    }

    /* renamed from: b */
    public static Date m25189b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f17326a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f17327b) {
            int length = f17327b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f17328c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f17327b[i], Locale.US);
                    dateFormat.setTimeZone(C6130c.f17210n);
                    f17328c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
