package p148g.p189d.p190a.p200b.p219o0.p227t;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p219o0.p227t.C4208e;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.t.f */
public final class C4211f {

    /* renamed from: b */
    public static final Pattern f13468b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c */
    private static final Pattern f13469c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a */
    private final StringBuilder f13470a = new StringBuilder();

    /* renamed from: g.d.a.b.o0.t.f$a */
    private static final class C4212a {

        /* renamed from: e */
        private static final String[] f13471e = new String[0];

        /* renamed from: a */
        public final String f13472a;

        /* renamed from: b */
        public final int f13473b;

        /* renamed from: c */
        public final String f13474c;

        /* renamed from: d */
        public final String[] f13475d;

        private C4212a(String str, int i, String str2, String[] strArr) {
            this.f13473b = i;
            this.f13472a = str;
            this.f13474c = str2;
            this.f13475d = strArr;
        }

        /* renamed from: a */
        public static C4212a m17908a(String str, int i) {
            String str2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = BuildConfig.FLAVOR;
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] split = trim.split("\\.");
            return new C4212a(split[0], i, str2, split.length > 1 ? (String[]) Arrays.copyOfRange(split, 1, split.length) : f13471e);
        }

        /* renamed from: b */
        public static C4212a m17909b() {
            return new C4212a(BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, new String[0]);
        }
    }

    /* renamed from: g.d.a.b.o0.t.f$b */
    private static final class C4213b implements Comparable<C4213b> {

        /* renamed from: f */
        public final int f13476f;

        /* renamed from: g */
        public final C4207d f13477g;

        public C4213b(int i, C4207d dVar) {
            this.f13476f = i;
            this.f13477g = dVar;
        }

        /* renamed from: e */
        public int compareTo(C4213b bVar) {
            return this.f13476f - bVar.f13476f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m17893a(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002e
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0070
            if (r0 == r4) goto L_0x006d
            if (r0 == r3) goto L_0x006a
            if (r0 == r2) goto L_0x0067
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = ";'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCueParser"
            android.util.Log.w(r6, r5)
            goto L_0x0075
        L_0x0067:
            r5 = 38
            goto L_0x0072
        L_0x006a:
            r5 = 32
            goto L_0x0072
        L_0x006d:
            r5 = 62
            goto L_0x0072
        L_0x0070:
            r5 = 60
        L_0x0072:
            r6.append(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.m17893a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[LOOP:0: B:44:0x0096->B:45:0x0098, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m17894b(java.lang.String r8, p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.C4212a r9, android.text.SpannableStringBuilder r10, java.util.List<p148g.p189d.p190a.p200b.p219o0.p227t.C4207d> r11, java.util.List<p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.C4213b> r12) {
        /*
            int r0 = r9.f13473b
            int r1 = r10.length()
            java.lang.String r2 = r9.f13472a
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0067
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L_0x005d
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L_0x0053
            r7 = 98
            if (r3 == r7) goto L_0x0049
            r7 = 99
            if (r3 == r7) goto L_0x003f
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L_0x0035
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x002b
            goto L_0x0071
        L_0x002b:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 5
            goto L_0x0072
        L_0x0035:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 2
            goto L_0x0072
        L_0x003f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 3
            goto L_0x0072
        L_0x0049:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 0
            goto L_0x0072
        L_0x0053:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 4
            goto L_0x0072
        L_0x005d:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 1
            goto L_0x0072
        L_0x0067:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 6
            goto L_0x0072
        L_0x0071:
            r2 = -1
        L_0x0072:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x0084;
                case 1: goto L_0x007e;
                case 2: goto L_0x0078;
                case 3: goto L_0x008c;
                case 4: goto L_0x008c;
                case 5: goto L_0x008c;
                case 6: goto L_0x008c;
                default: goto L_0x0077;
            }
        L_0x0077:
            return
        L_0x0078:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            goto L_0x0089
        L_0x007e:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            goto L_0x0089
        L_0x0084:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
        L_0x0089:
            r10.setSpan(r2, r0, r1, r3)
        L_0x008c:
            r12.clear()
            m17897e(r11, r8, r9, r12)
            int r8 = r12.size()
        L_0x0096:
            if (r4 >= r8) goto L_0x00a6
            java.lang.Object r9 = r12.get(r4)
            g.d.a.b.o0.t.f$b r9 = (p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.C4213b) r9
            g.d.a.b.o0.t.d r9 = r9.f13477g
            m17895c(r10, r9, r0, r1)
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.m17894b(java.lang.String, g.d.a.b.o0.t.f$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* renamed from: c */
    private static void m17895c(SpannableStringBuilder spannableStringBuilder, C4207d dVar, int i, int i2) {
        Object obj;
        if (dVar != null) {
            if (dVar.mo13292g() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(dVar.mo13292g()), i, i2, 33);
            }
            if (dVar.mo13296k()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.mo13297l()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.mo13295j()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.mo13287b()), i, i2, 33);
            }
            if (dVar.mo13294i()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.mo13286a()), i, i2, 33);
            }
            if (dVar.mo13288c() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(dVar.mo13288c()), i, i2, 33);
            }
            if (dVar.mo13293h() != null) {
                spannableStringBuilder.setSpan(new AlignmentSpan.Standard(dVar.mo13293h()), i, i2, 33);
            }
            int e = dVar.mo13290e();
            if (e == 1) {
                obj = new AbsoluteSizeSpan((int) dVar.mo13289d(), true);
            } else if (e == 2) {
                obj = new RelativeSizeSpan(dVar.mo13289d());
            } else if (e == 3) {
                obj = new RelativeSizeSpan(dVar.mo13289d() / 100.0f);
            } else {
                return;
            }
            spannableStringBuilder.setSpan(obj, i, i2, 33);
        }
    }

    /* renamed from: d */
    private static int m17896d(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: e */
    private static void m17897e(List<C4207d> list, String str, C4212a aVar, List<C4213b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C4207d dVar = list.get(i);
            int f = dVar.mo13291f(str, aVar.f13472a, aVar.f13475d, aVar.f13474c);
            if (f > 0) {
                list2.add(new C4213b(f, dVar));
            }
        }
        Collections.sort(list2);
    }

    /* renamed from: f */
    private static String m17898f(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim.split("[ \\.]")[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063 A[ADDED_TO_REGION] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m17899g(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 98
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 99
            if (r0 == r1) goto L_0x004c
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x0042
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L_0x0038
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x002e
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x0024
            goto L_0x0060
        L_0x0024:
            java.lang.String r0 = "v"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 5
            goto L_0x0061
        L_0x002e:
            java.lang.String r0 = "u"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 4
            goto L_0x0061
        L_0x0038:
            java.lang.String r0 = "lang"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 3
            goto L_0x0061
        L_0x0042:
            java.lang.String r0 = "i"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r0 = "c"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r0 = "b"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 0
            goto L_0x0061
        L_0x0060:
            r8 = -1
        L_0x0061:
            if (r8 == 0) goto L_0x006e
            if (r8 == r7) goto L_0x006e
            if (r8 == r6) goto L_0x006e
            if (r8 == r5) goto L_0x006e
            if (r8 == r4) goto L_0x006e
            if (r8 == r3) goto L_0x006e
            return r2
        L_0x006e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.m17899g(java.lang.String):boolean");
    }

    /* renamed from: i */
    private static boolean m17900i(String str, Matcher matcher, C4274m mVar, C4208e.C4210b bVar, StringBuilder sb, List<C4207d> list) {
        try {
            bVar.mo13318j(C4215h.m17916b(matcher.group(1)));
            bVar.mo13312d(C4215h.m17916b(matcher.group(2)));
            m17901j(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String k = mVar.mo13466k();
                if (!TextUtils.isEmpty(k)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(k.trim());
                } else {
                    m17902k(str, sb.toString(), bVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    /* renamed from: j */
    static void m17901j(String str, C4208e.C4210b bVar) {
        Matcher matcher = f13469c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    m17903l(group2, bVar);
                } else if ("align".equals(group)) {
                    bVar.mo13320l(m17906o(group2));
                } else if ("position".equals(group)) {
                    m17905n(group2, bVar);
                } else if ("size".equals(group)) {
                    bVar.mo13321m(C4215h.m17915a(group2));
                } else {
                    Log.w("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                Log.w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: k */
    static void m17902k(String str, String str2, C4208e.C4210b bVar, List<C4207d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m17893a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m17896d(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    String f = m17898f(substring);
                    if (f != null && m17899g(f)) {
                        if (z) {
                            while (!stack.isEmpty()) {
                                C4212a aVar = (C4212a) stack.pop();
                                m17894b(str, aVar, spannableStringBuilder, list, arrayList);
                                if (aVar.f13472a.equals(f)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            stack.push(C4212a.m17908a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!stack.isEmpty()) {
            m17894b(str, (C4212a) stack.pop(), spannableStringBuilder, list, arrayList);
        }
        m17894b(str, C4212a.m17909b(), spannableStringBuilder, list, arrayList);
        bVar.mo13319k(spannableStringBuilder);
    }

    /* renamed from: l */
    private static void m17903l(String str, C4208e.C4210b bVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.mo13314f(m17904m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.mo13314f(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            bVar.mo13313e(C4215h.m17915a(str));
            bVar.mo13315g(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        bVar.mo13313e((float) parseInt);
        bVar.mo13315g(1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m17904m(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002a;
                case -1074341483: goto L_0x0020;
                case 100571: goto L_0x0016;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            if (r0 == r4) goto L_0x0057
            if (r0 == r3) goto L_0x0057
            if (r0 == r2) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            android.util.Log.w(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0056:
            return r3
        L_0x0057:
            return r4
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.m17904m(java.lang.String):int");
    }

    /* renamed from: n */
    private static void m17905n(String str, C4208e.C4210b bVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.mo13317i(m17904m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.mo13317i(Integer.MIN_VALUE);
        }
        bVar.mo13316h(C4215h.m17915a(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment m17906o(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -1074341483: goto L_0x0035;
                case 100571: goto L_0x002b;
                case 3317767: goto L_0x0021;
                case 108511772: goto L_0x0017;
                case 109757538: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0074
            if (r0 == r4) goto L_0x0071
            if (r0 == r3) goto L_0x0071
            if (r0 == r2) goto L_0x006e
            if (r0 == r1) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid alignment value: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            android.util.Log.w(r0, r6)
            r6 = 0
            return r6
        L_0x006e:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r6
        L_0x0071:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            return r6
        L_0x0074:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p227t.C4211f.m17906o(java.lang.String):android.text.Layout$Alignment");
    }

    /* renamed from: h */
    public boolean mo13322h(C4274m mVar, C4208e.C4210b bVar, List<C4207d> list) {
        String k = mVar.mo13466k();
        if (k == null) {
            return false;
        }
        Matcher matcher = f13468b.matcher(k);
        if (matcher.matches()) {
            return m17900i((String) null, matcher, mVar, bVar, this.f13470a, list);
        }
        String k2 = mVar.mo13466k();
        if (k2 == null) {
            return false;
        }
        Matcher matcher2 = f13468b.matcher(k2);
        if (!matcher2.matches()) {
            return false;
        }
        return m17900i(k.trim(), matcher2, mVar, bVar, this.f13470a, list);
    }
}
