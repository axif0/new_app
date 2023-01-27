package p374m;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: m.v */
public final class C6261v {

    /* renamed from: d */
    private static final Pattern f17669d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f17670e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f17671a;

    /* renamed from: b */
    private final String f17672b;

    /* renamed from: c */
    private final String f17673c;

    private C6261v(String str, String str2, String str3, String str4) {
        this.f17671a = str;
        this.f17672b = str2;
        this.f17673c = str4;
    }

    /* renamed from: b */
    public static C6261v m25703b(String str) {
        Matcher matcher = f17669d.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f17670e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 == null) {
                            group2 = matcher2.group(3);
                        } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C6261v(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    /* renamed from: c */
    public static C6261v m25704c(String str) {
        try {
            return m25703b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Charset mo17730a(Charset charset) {
        try {
            return this.f17673c != null ? Charset.forName(this.f17673c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: d */
    public String mo17731d() {
        return this.f17672b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6261v) && ((C6261v) obj).f17671a.equals(this.f17671a);
    }

    public int hashCode() {
        return this.f17671a.hashCode();
    }

    public String toString() {
        return this.f17671a;
    }
}
