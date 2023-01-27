package p148g.p189d.p190a.p200b.p230r0;

import android.text.TextUtils;
import com.karumi.dexter.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g.d.a.b.r0.d */
public final class C4263d {

    /* renamed from: a */
    private static final Pattern f13611a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f13612b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f13613c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final Map<String, Integer> f13614d;

    static {
        HashMap hashMap = new HashMap();
        f13614d = hashMap;
        hashMap.put("aliceblue", -984833);
        f13614d.put("antiquewhite", -332841);
        f13614d.put("aqua", -16711681);
        f13614d.put("aquamarine", -8388652);
        f13614d.put("azure", -983041);
        f13614d.put("beige", -657956);
        f13614d.put("bisque", -6972);
        f13614d.put("black", -16777216);
        f13614d.put("blanchedalmond", -5171);
        f13614d.put("blue", -16776961);
        f13614d.put("blueviolet", -7722014);
        f13614d.put("brown", -5952982);
        f13614d.put("burlywood", -2180985);
        f13614d.put("cadetblue", -10510688);
        f13614d.put("chartreuse", -8388864);
        f13614d.put("chocolate", -2987746);
        f13614d.put("coral", -32944);
        f13614d.put("cornflowerblue", -10185235);
        f13614d.put("cornsilk", -1828);
        f13614d.put("crimson", -2354116);
        f13614d.put("cyan", -16711681);
        f13614d.put("darkblue", -16777077);
        f13614d.put("darkcyan", -16741493);
        f13614d.put("darkgoldenrod", -4684277);
        f13614d.put("darkgray", -5658199);
        f13614d.put("darkgreen", -16751616);
        f13614d.put("darkgrey", -5658199);
        f13614d.put("darkkhaki", -4343957);
        f13614d.put("darkmagenta", -7667573);
        f13614d.put("darkolivegreen", -11179217);
        f13614d.put("darkorange", -29696);
        f13614d.put("darkorchid", -6737204);
        f13614d.put("darkred", -7667712);
        f13614d.put("darksalmon", -1468806);
        f13614d.put("darkseagreen", -7357297);
        f13614d.put("darkslateblue", -12042869);
        f13614d.put("darkslategray", -13676721);
        f13614d.put("darkslategrey", -13676721);
        f13614d.put("darkturquoise", -16724271);
        f13614d.put("darkviolet", -7077677);
        f13614d.put("deeppink", -60269);
        f13614d.put("deepskyblue", -16728065);
        f13614d.put("dimgray", -9868951);
        f13614d.put("dimgrey", -9868951);
        f13614d.put("dodgerblue", -14774017);
        f13614d.put("firebrick", -5103070);
        f13614d.put("floralwhite", -1296);
        f13614d.put("forestgreen", -14513374);
        f13614d.put("fuchsia", -65281);
        f13614d.put("gainsboro", -2302756);
        f13614d.put("ghostwhite", -460545);
        f13614d.put("gold", -10496);
        f13614d.put("goldenrod", -2448096);
        f13614d.put("gray", -8355712);
        f13614d.put("green", -16744448);
        f13614d.put("greenyellow", -5374161);
        f13614d.put("grey", -8355712);
        f13614d.put("honeydew", -983056);
        f13614d.put("hotpink", -38476);
        f13614d.put("indianred", -3318692);
        f13614d.put("indigo", -11861886);
        f13614d.put("ivory", -16);
        f13614d.put("khaki", -989556);
        f13614d.put("lavender", -1644806);
        f13614d.put("lavenderblush", -3851);
        f13614d.put("lawngreen", -8586240);
        f13614d.put("lemonchiffon", -1331);
        f13614d.put("lightblue", -5383962);
        f13614d.put("lightcoral", -1015680);
        f13614d.put("lightcyan", -2031617);
        f13614d.put("lightgoldenrodyellow", -329006);
        f13614d.put("lightgray", -2894893);
        f13614d.put("lightgreen", -7278960);
        f13614d.put("lightgrey", -2894893);
        f13614d.put("lightpink", -18751);
        f13614d.put("lightsalmon", -24454);
        f13614d.put("lightseagreen", -14634326);
        f13614d.put("lightskyblue", -7876870);
        f13614d.put("lightslategray", -8943463);
        f13614d.put("lightslategrey", -8943463);
        f13614d.put("lightsteelblue", -5192482);
        f13614d.put("lightyellow", -32);
        f13614d.put("lime", -16711936);
        f13614d.put("limegreen", -13447886);
        f13614d.put("linen", -331546);
        f13614d.put("magenta", -65281);
        f13614d.put("maroon", -8388608);
        f13614d.put("mediumaquamarine", -10039894);
        f13614d.put("mediumblue", -16777011);
        f13614d.put("mediumorchid", -4565549);
        f13614d.put("mediumpurple", -7114533);
        f13614d.put("mediumseagreen", -12799119);
        f13614d.put("mediumslateblue", -8689426);
        f13614d.put("mediumspringgreen", -16713062);
        f13614d.put("mediumturquoise", -12004916);
        f13614d.put("mediumvioletred", -3730043);
        f13614d.put("midnightblue", -15132304);
        f13614d.put("mintcream", -655366);
        f13614d.put("mistyrose", -6943);
        f13614d.put("moccasin", -6987);
        f13614d.put("navajowhite", -8531);
        f13614d.put("navy", -16777088);
        f13614d.put("oldlace", -133658);
        f13614d.put("olive", -8355840);
        f13614d.put("olivedrab", -9728477);
        f13614d.put("orange", -23296);
        f13614d.put("orangered", -47872);
        f13614d.put("orchid", -2461482);
        f13614d.put("palegoldenrod", -1120086);
        f13614d.put("palegreen", -6751336);
        f13614d.put("paleturquoise", -5247250);
        f13614d.put("palevioletred", -2396013);
        f13614d.put("papayawhip", -4139);
        f13614d.put("peachpuff", -9543);
        f13614d.put("peru", -3308225);
        f13614d.put("pink", -16181);
        f13614d.put("plum", -2252579);
        f13614d.put("powderblue", -5185306);
        f13614d.put("purple", -8388480);
        f13614d.put("rebeccapurple", -10079335);
        f13614d.put("red", -65536);
        f13614d.put("rosybrown", -4419697);
        f13614d.put("royalblue", -12490271);
        f13614d.put("saddlebrown", -7650029);
        f13614d.put("salmon", -360334);
        f13614d.put("sandybrown", -744352);
        f13614d.put("seagreen", -13726889);
        f13614d.put("seashell", -2578);
        f13614d.put("sienna", -6270419);
        f13614d.put("silver", -4144960);
        f13614d.put("skyblue", -7876885);
        f13614d.put("slateblue", -9807155);
        f13614d.put("slategray", -9404272);
        f13614d.put("slategrey", -9404272);
        f13614d.put("snow", -1286);
        f13614d.put("springgreen", -16711809);
        f13614d.put("steelblue", -12156236);
        f13614d.put("tan", -2968436);
        f13614d.put("teal", -16744320);
        f13614d.put("thistle", -2572328);
        f13614d.put("tomato", -40121);
        f13614d.put("transparent", 0);
        f13614d.put("turquoise", -12525360);
        f13614d.put("violet", -1146130);
        f13614d.put("wheat", -663885);
        f13614d.put("white", -1);
        f13614d.put("whitesmoke", -657931);
        f13614d.put("yellow", -256);
        f13614d.put("yellowgreen", -6632142);
    }

    /* renamed from: a */
    private static int m18086a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: b */
    private static int m18087b(String str, boolean z) {
        C4260a.m18069a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", BuildConfig.FLAVOR);
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return -16777216 | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f13613c : f13612b).matcher(replace);
            if (matcher.matches()) {
                return m18086a(z ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f13611a.matcher(replace);
            if (matcher2.matches()) {
                return m18090e(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = f13614d.get(C4284w.m18233F(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static int m18088c(String str) {
        return m18087b(str, true);
    }

    /* renamed from: d */
    public static int m18089d(String str) {
        return m18087b(str, false);
    }

    /* renamed from: e */
    private static int m18090e(int i, int i2, int i3) {
        return m18086a(255, i, i2, i3);
    }
}
