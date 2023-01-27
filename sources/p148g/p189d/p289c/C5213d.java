package p148g.p189d.p289c;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: g.d.c.d */
public enum C5213d implements C5220e {
    IDENTITY {
        /* renamed from: e */
        public String mo15338e(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: e */
        public String mo15338e(Field field) {
            return C5213d.m21770j(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: e */
        public String mo15338e(Field field) {
            return C5213d.m21770j(C5213d.m21769h(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: e */
        public String mo15338e(Field field) {
            return C5213d.m21769h(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: e */
        public String mo15338e(Field field) {
            return C5213d.m21769h(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: e */
        public String mo15338e(Field field) {
            return C5213d.m21769h(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: g */
    private static String m21768g(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        return c + str.substring(i);
    }

    /* renamed from: h */
    static String m21769h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: j */
    static String m21770j(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m21768g(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }
}
