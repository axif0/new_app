package p048d.p049a.p050a.p051a.p078s;

import android.content.Context;
import android.widget.Toast;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: d.a.a.a.s.o */
public class C3105o {

    /* renamed from: a */
    private static String f9882a = "BarBracUniversity28022015BarRana";

    static {
        new SecretKeySpec(f9882a.getBytes(), "AES");
    }

    /* renamed from: a */
    public static int m13337a() {
        switch (Calendar.getInstance().get(7)) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 1;
        }
    }

    /* renamed from: b */
    public static String m13338b(int i) {
        switch (i) {
            case 2:
                return "Sunday";
            case 3:
                return "Monday";
            case 4:
                return "Tuesday";
            case 5:
                return "Wednesday";
            case 6:
                return "Thursday";
            case 7:
                return "Friday";
            default:
                return "Saturday";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m13339c(java.lang.String r7) {
        /*
            java.lang.String r7 = r7.toLowerCase()
            int r0 = r7.hashCode()
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -2114201671: goto L_0x004e;
                case -1266285217: goto L_0x0044;
                case -1068502768: goto L_0x003a;
                case -977343923: goto L_0x0030;
                case -891186736: goto L_0x0026;
                case 1393530710: goto L_0x001c;
                case 1572055514: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0058
        L_0x0012:
            java.lang.String r0 = "thursday"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0058
            r7 = 4
            goto L_0x0059
        L_0x001c:
            java.lang.String r0 = "wednesday"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0058
            r7 = 3
            goto L_0x0059
        L_0x0026:
            java.lang.String r0 = "sunday"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0058
            r7 = 0
            goto L_0x0059
        L_0x0030:
            java.lang.String r0 = "tuesday"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0058
            r7 = 2
            goto L_0x0059
        L_0x003a:
            java.lang.String r0 = "monday"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0058
            r7 = 1
            goto L_0x0059
        L_0x0044:
            java.lang.String r0 = "friday"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0058
            r7 = 5
            goto L_0x0059
        L_0x004e:
            java.lang.String r0 = "saturday"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0058
            r7 = 6
            goto L_0x0059
        L_0x0058:
            r7 = -1
        L_0x0059:
            if (r7 == 0) goto L_0x006f
            if (r7 == r6) goto L_0x006d
            if (r7 == r5) goto L_0x006b
            if (r7 == r4) goto L_0x0069
            if (r7 == r3) goto L_0x0070
            if (r7 == r2) goto L_0x0067
            r1 = 1
            goto L_0x0070
        L_0x0067:
            r1 = 7
            goto L_0x0070
        L_0x0069:
            r1 = 5
            goto L_0x0070
        L_0x006b:
            r1 = 4
            goto L_0x0070
        L_0x006d:
            r1 = 3
            goto L_0x0070
        L_0x006f:
            r1 = 2
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p078s.C3105o.m13339c(java.lang.String):int");
    }

    /* renamed from: d */
    public static String m13340d(String str, String str2) {
        try {
            Date parse = new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            String format = new SimpleDateFormat("dd", Locale.getDefault()).format(parse);
            String format2 = new SimpleDateFormat("MMM", Locale.getDefault()).format(parse);
            String format3 = new SimpleDateFormat("yyyy", Locale.getDefault()).format(parse);
            return format2.toUpperCase() + " " + format + ", " + format3;
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: e */
    public static void m13341e(Context context) {
        Toast.makeText(context, C2722R.string.internet_connection_warning_message, 1).show();
    }
}
