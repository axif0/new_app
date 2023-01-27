package p148g.p189d.p190a.p200b.p219o0.p225r;

import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p219o0.C4157g;
import p148g.p189d.p190a.p200b.p230r0.C4284w;
import p148g.p189d.p190a.p200b.p230r0.C4286x;

/* renamed from: g.d.a.b.o0.r.a */
public final class C4195a extends C4153c {

    /* renamed from: o */
    private static final Pattern f13375o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p */
    private static final Pattern f13376p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q */
    private static final Pattern f13377q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r */
    private static final Pattern f13378r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    private static final C4196a f13379s = new C4196a(30.0f, 1, 1);

    /* renamed from: n */
    private final XmlPullParserFactory f13380n;

    /* renamed from: g.d.a.b.o0.r.a$a */
    private static final class C4196a {

        /* renamed from: a */
        final float f13381a;

        /* renamed from: b */
        final int f13382b;

        /* renamed from: c */
        final int f13383c;

        C4196a(float f, int i, int i2) {
            this.f13381a = f;
            this.f13382b = i;
            this.f13383c = i2;
        }
    }

    public C4195a() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f13380n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: C */
    private C4200e m17764C(C4200e eVar) {
        return eVar == null ? new C4200e() : eVar;
    }

    /* renamed from: E */
    private static boolean m17765E(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    /* renamed from: F */
    private static void m17766F(String str, C4200e eVar) throws C4157g {
        Matcher matcher;
        String[] split = str.split("\\s+");
        if (split.length == 1) {
            matcher = f13377q.matcher(str);
        } else if (split.length == 2) {
            matcher = f13377q.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new C4157g("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            char c = 65535;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && group.equals("px")) {
                        c = 0;
                    }
                } else if (group.equals("em")) {
                    c = 1;
                }
            } else if (group.equals("%")) {
                c = 2;
            }
            if (c == 0) {
                eVar.mo13278t(1);
            } else if (c == 1) {
                eVar.mo13278t(2);
            } else if (c == 2) {
                eVar.mo13278t(3);
            } else {
                throw new C4157g("Invalid unit for fontSize: '" + group + "'.");
            }
            eVar.mo13277s(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new C4157g("Invalid expression for fontSize: '" + str + "'.");
    }

    /* renamed from: G */
    private C4196a m17767G(XmlPullParser xmlPullParser) throws C4157g {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(" ");
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new C4157g("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = f13379s.f13382b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f13379s.f13383c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C4196a(((float) parseInt) * f, i, i2);
    }

    /* renamed from: H */
    private Map<String, C4200e> m17768H(XmlPullParser xmlPullParser, Map<String, C4200e> map, Map<String, C4198c> map2) throws IOException, XmlPullParserException {
        C4198c J;
        do {
            xmlPullParser.next();
            if (C4286x.m18265e(xmlPullParser, "style")) {
                String a = C4286x.m18261a(xmlPullParser, "style");
                C4200e K = m17771K(xmlPullParser, new C4200e());
                if (a != null) {
                    for (String str : m17772L(a)) {
                        K.mo13260a(map.get(str));
                    }
                }
                if (K.mo13266g() != null) {
                    map.put(K.mo13266g(), K);
                }
            } else if (C4286x.m18265e(xmlPullParser, "region") && (J = m17770J(xmlPullParser)) != null) {
                map2.put(J.f13395a, J);
            }
        } while (!C4286x.m18263c(xmlPullParser, "head"));
        return map;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p148g.p189d.p190a.p200b.p219o0.p225r.C4197b m17769I(org.xmlpull.v1.XmlPullParser r20, p148g.p189d.p190a.p200b.p219o0.p225r.C4197b r21, java.util.Map<java.lang.String, p148g.p189d.p190a.p200b.p219o0.p225r.C4198c> r22, p148g.p189d.p190a.p200b.p219o0.p225r.C4195a.C4196a r23) throws p148g.p189d.p190a.p200b.p219o0.C4157g {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            int r4 = r20.getAttributeCount()
            r5 = 0
            g.d.a.b.o0.r.e r11 = r0.m17771K(r1, r5)
            java.lang.String r9 = ""
            r12 = r5
            r13 = r9
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0025:
            if (r5 >= r4) goto L_0x00a8
            java.lang.String r6 = r1.getAttributeName(r5)
            java.lang.String r7 = r1.getAttributeValue(r5)
            int r18 = r6.hashCode()
            switch(r18) {
                case -934795532: goto L_0x005f;
                case 99841: goto L_0x0055;
                case 100571: goto L_0x004b;
                case 93616297: goto L_0x0041;
                case 109780401: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0069
        L_0x0037:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0069
            r8 = 3
            goto L_0x006a
        L_0x0041:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0069
            r8 = 0
            goto L_0x006a
        L_0x004b:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0069
            r8 = 1
            goto L_0x006a
        L_0x0055:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0069
            r8 = 2
            goto L_0x006a
        L_0x005f:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0069
            r8 = 4
            goto L_0x006a
        L_0x0069:
            r8 = -1
        L_0x006a:
            if (r8 == 0) goto L_0x009e
            r6 = 1
            if (r8 == r6) goto L_0x0097
            r6 = 2
            if (r8 == r6) goto L_0x0090
            r6 = 3
            if (r8 == r6) goto L_0x0085
            r6 = 4
            if (r8 == r6) goto L_0x007b
            r6 = r22
            goto L_0x00a4
        L_0x007b:
            r6 = r22
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00a4
            r13 = r7
            goto L_0x00a4
        L_0x0085:
            r6 = r22
            java.lang.String[] r7 = r0.m17772L(r7)
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00a4
            r12 = r7
            goto L_0x00a4
        L_0x0090:
            r6 = r22
            long r16 = m17773M(r7, r3)
            goto L_0x00a4
        L_0x0097:
            r6 = r22
            long r14 = m17773M(r7, r3)
            goto L_0x00a4
        L_0x009e:
            r6 = r22
            long r9 = m17773M(r7, r3)
        L_0x00a4:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x00a8:
            if (r2 == 0) goto L_0x00c2
            long r3 = r2.f13387d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00c7
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00ba
            long r9 = r9 + r3
        L_0x00ba:
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00c7
            long r3 = r2.f13387d
            long r14 = r14 + r3
            goto L_0x00c7
        L_0x00c2:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00c7:
            r7 = r9
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00df
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00d5
            long r16 = r7 + r16
            r9 = r16
            goto L_0x00e0
        L_0x00d5:
            if (r2 == 0) goto L_0x00df
            long r2 = r2.f13388e
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00df
            r9 = r2
            goto L_0x00e0
        L_0x00df:
            r9 = r14
        L_0x00e0:
            java.lang.String r6 = r20.getName()
            g.d.a.b.o0.r.b r1 = p148g.p189d.p190a.p200b.p219o0.p225r.C4197b.m17777c(r6, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p225r.C4195a.m17769I(org.xmlpull.v1.XmlPullParser, g.d.a.b.o0.r.b, java.util.Map, g.d.a.b.o0.r.a$a):g.d.a.b.o0.r.b");
    }

    /* renamed from: J */
    private C4198c m17770J(XmlPullParser xmlPullParser) {
        String str;
        StringBuilder sb;
        String str2;
        String a = C4286x.m18261a(xmlPullParser, "id");
        if (a == null) {
            return null;
        }
        String a2 = C4286x.m18261a(xmlPullParser, "origin");
        if (a2 != null) {
            Matcher matcher = f13378r.matcher(a2);
            if (matcher.matches()) {
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    int i = 2;
                    float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                    String a3 = C4286x.m18261a(xmlPullParser, "extent");
                    if (a3 != null) {
                        Matcher matcher2 = f13378r.matcher(a3);
                        if (matcher2.matches()) {
                            try {
                                float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                String a4 = C4286x.m18261a(xmlPullParser, "displayAlign");
                                if (a4 != null) {
                                    String F = C4284w.m18233F(a4);
                                    char c = 65535;
                                    int hashCode = F.hashCode();
                                    if (hashCode != -1364013995) {
                                        if (hashCode == 92734940 && F.equals("after")) {
                                            c = 1;
                                        }
                                    } else if (F.equals("center")) {
                                        c = 0;
                                    }
                                    if (c == 0) {
                                        parseFloat2 += parseFloat4 / 2.0f;
                                        i = 1;
                                    } else if (c == 1) {
                                        parseFloat2 += parseFloat4;
                                    }
                                    return new C4198c(a, parseFloat, parseFloat2, 0, i, parseFloat3);
                                }
                                i = 0;
                                return new C4198c(a, parseFloat, parseFloat2, 0, i, parseFloat3);
                            } catch (NumberFormatException unused) {
                                sb = new StringBuilder();
                                str2 = "Ignoring region with malformed extent: ";
                            }
                        } else {
                            sb = new StringBuilder();
                            str2 = "Ignoring region with unsupported extent: ";
                        }
                    } else {
                        str = "Ignoring region without an extent";
                    }
                } catch (NumberFormatException unused2) {
                    sb = new StringBuilder();
                    str2 = "Ignoring region with malformed origin: ";
                }
            } else {
                sb = new StringBuilder();
                str2 = "Ignoring region with unsupported origin: ";
            }
            sb.append(str2);
            sb.append(a2);
            str = sb.toString();
        } else {
            str = "Ignoring region without an origin";
        }
        Log.w("TtmlDecoder", str);
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p148g.p189d.p190a.p200b.p219o0.p225r.C4200e m17771K(org.xmlpull.v1.XmlPullParser r12, p148g.p189d.p190a.p200b.p219o0.p225r.C4200e r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x01c4
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 4
            r7 = -1
            r8 = 2
            r9 = 3
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x006e;
                case -1224696685: goto L_0x0064;
                case -1065511464: goto L_0x005a;
                case -879295043: goto L_0x004f;
                case -734428249: goto L_0x0045;
                case 3355: goto L_0x003b;
                case 94842723: goto L_0x0031;
                case 365601008: goto L_0x0027;
                case 1287124693: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0078
        L_0x001d:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 1
            goto L_0x0079
        L_0x0027:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 4
            goto L_0x0079
        L_0x0031:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 2
            goto L_0x0079
        L_0x003b:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 0
            goto L_0x0079
        L_0x0045:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 5
            goto L_0x0079
        L_0x004f:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 8
            goto L_0x0079
        L_0x005a:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 7
            goto L_0x0079
        L_0x0064:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 3
            goto L_0x0079
        L_0x006e:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 6
            goto L_0x0079
        L_0x0078:
            r4 = -1
        L_0x0079:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x01ad;
                case 1: goto L_0x0199;
                case 2: goto L_0x0185;
                case 3: goto L_0x017d;
                case 4: goto L_0x0160;
                case 5: goto L_0x0152;
                case 6: goto L_0x0143;
                case 7: goto L_0x00e1;
                case 8: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x01c0
        L_0x0080:
            java.lang.String r3 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18233F(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x00aa;
                case -1026963764: goto L_0x00a0;
                case 913457136: goto L_0x0096;
                case 1679736913: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x00b3
        L_0x008c:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 0
            goto L_0x00b3
        L_0x0096:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 1
            goto L_0x00b3
        L_0x00a0:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 2
            goto L_0x00b3
        L_0x00aa:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 3
        L_0x00b3:
            if (r7 == 0) goto L_0x00d8
            if (r7 == r10) goto L_0x00cf
            if (r7 == r8) goto L_0x00c6
            if (r7 == r9) goto L_0x00bd
            goto L_0x01c0
        L_0x00bd:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            r13.mo13283y(r1)
            goto L_0x01c0
        L_0x00c6:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            r13.mo13283y(r10)
            goto L_0x01c0
        L_0x00cf:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            r13.mo13281w(r1)
            goto L_0x01c0
        L_0x00d8:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            r13.mo13281w(r10)
            goto L_0x01c0
        L_0x00e1:
            java.lang.String r3 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18233F(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0115;
                case 100571: goto L_0x010b;
                case 3317767: goto L_0x0101;
                case 108511772: goto L_0x00f7;
                case 109757538: goto L_0x00ed;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x011e
        L_0x00ed:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 1
            goto L_0x011e
        L_0x00f7:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 2
            goto L_0x011e
        L_0x0101:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 0
            goto L_0x011e
        L_0x010b:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 3
            goto L_0x011e
        L_0x0115:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 4
        L_0x011e:
            if (r7 == 0) goto L_0x0138
            if (r7 == r10) goto L_0x0138
            if (r7 == r8) goto L_0x0131
            if (r7 == r9) goto L_0x0131
            if (r7 == r6) goto L_0x012a
            goto L_0x01c0
        L_0x012a:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x013e
        L_0x0131:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x013e
        L_0x0138:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x013e:
            r13.mo13282x(r3)
            goto L_0x01c0
        L_0x0143:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.mo13280v(r3)
            goto L_0x01c0
        L_0x0152:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.mo13274p(r3)
            goto L_0x01c0
        L_0x0160:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)     // Catch:{ g -> 0x0168 }
            m17766F(r3, r13)     // Catch:{ g -> 0x0168 }
            goto L_0x01c0
        L_0x0168:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
        L_0x016f:
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r5, r3)
            goto L_0x01c0
        L_0x017d:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            r13.mo13276r(r3)
            goto L_0x01c0
        L_0x0185:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            int r4 = p148g.p189d.p190a.p200b.p230r0.C4263d.m18089d(r3)     // Catch:{ IllegalArgumentException -> 0x0191 }
            r13.mo13275q(r4)     // Catch:{ IllegalArgumentException -> 0x0191 }
            goto L_0x01c0
        L_0x0191:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            goto L_0x016f
        L_0x0199:
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            int r4 = p148g.p189d.p190a.p200b.p230r0.C4263d.m18089d(r3)     // Catch:{ IllegalArgumentException -> 0x01a5 }
            r13.mo13273o(r4)     // Catch:{ IllegalArgumentException -> 0x01a5 }
            goto L_0x01c0
        L_0x01a5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            goto L_0x016f
        L_0x01ad:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01c0
            g.d.a.b.o0.r.e r13 = r11.m17764C(r13)
            r13.mo13279u(r3)
        L_0x01c0:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x01c4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p225r.C4195a.m17771K(org.xmlpull.v1.XmlPullParser, g.d.a.b.o0.r.e):g.d.a.b.o0.r.e");
    }

    /* renamed from: L */
    private String[] m17772L(String str) {
        return str.split("\\s+");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (r14.equals("s") != false) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011a  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m17773M(java.lang.String r14, p148g.p189d.p190a.p200b.p219o0.p225r.C4195a.C4196a r15) throws p148g.p189d.p190a.p200b.p219o0.C4157g {
        /*
            java.util.regex.Pattern r0 = f13375o
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r14 = r0.group(r8)
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r10)
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0051
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0052
        L_0x0051:
            r10 = r5
        L_0x0052:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x0063
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.f13381a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x0064
        L_0x0063:
            r10 = r5
        L_0x0064:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0083
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.f13382b
            double r4 = (double) r14
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r14 = r15.f13381a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r5 = r0 / r14
        L_0x0083:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0088:
            java.util.regex.Pattern r0 = f13376p
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0125
            java.lang.String r14 = r0.group(r8)
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00ef
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00e5
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00db
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00d1
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00c8
            r7 = 116(0x74, float:1.63E-43)
            if (r1 == r7) goto L_0x00be
            goto L_0x00f9
        L_0x00be:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f9
            r7 = 5
            goto L_0x00fa
        L_0x00c8:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f9
            goto L_0x00fa
        L_0x00d1:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f9
            r7 = 3
            goto L_0x00fa
        L_0x00db:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f9
            r7 = 1
            goto L_0x00fa
        L_0x00e5:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f9
            r7 = 0
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f9
            r7 = 4
            goto L_0x00fa
        L_0x00f9:
            r7 = -1
        L_0x00fa:
            if (r7 == 0) goto L_0x011a
            if (r7 == r8) goto L_0x0117
            if (r7 == r6) goto L_0x0110
            if (r7 == r5) goto L_0x0109
            if (r7 == r4) goto L_0x0105
            goto L_0x0121
        L_0x0105:
            int r14 = r15.f13383c
            double r14 = (double) r14
            goto L_0x010c
        L_0x0109:
            float r14 = r15.f13381a
            double r14 = (double) r14
        L_0x010c:
            java.lang.Double.isNaN(r14)
            goto L_0x0115
        L_0x0110:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x0115:
            double r9 = r9 / r14
            goto L_0x0121
        L_0x0117:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x011f
        L_0x011a:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x011f:
            double r9 = r9 * r14
        L_0x0121:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x0125:
            g.d.a.b.o0.g r15 = new g.d.a.b.o0.g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p225r.C4195a.m17773M(java.lang.String, g.d.a.b.o0.r.a$a):long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C4201f mo13192z(byte[] bArr, int i, boolean z) throws C4157g {
        try {
            XmlPullParser newPullParser = this.f13380n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            C4201f fVar = null;
            hashMap2.put(BuildConfig.FLAVOR, new C4198c((String) null));
            int i2 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            LinkedList linkedList = new LinkedList();
            C4196a aVar = f13379s;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C4197b bVar = (C4197b) linkedList.peekLast();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = m17767G(newPullParser);
                        }
                        if (!m17765E(name)) {
                            Log.i("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else if ("head".equals(name)) {
                            m17768H(newPullParser, hashMap, hashMap2);
                        } else {
                            try {
                                C4197b I = m17769I(newPullParser, bVar, hashMap2, aVar);
                                linkedList.addLast(I);
                                if (bVar != null) {
                                    bVar.mo13254a(I);
                                }
                            } catch (C4157g e) {
                                Log.w("TtmlDecoder", "Suppressing parser error", e);
                            }
                        }
                    } else if (eventType == 4) {
                        bVar.mo13254a(C4197b.m17778d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            fVar = new C4201f((C4197b) linkedList.getLast(), hashMap, hashMap2);
                        }
                        linkedList.removeLast();
                    }
                    newPullParser.next();
                } else if (eventType != 2) {
                    if (eventType == 3) {
                        i2--;
                    }
                    newPullParser.next();
                }
                i2++;
                newPullParser.next();
            }
            return fVar;
        } catch (XmlPullParserException e2) {
            throw new C4157g("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
