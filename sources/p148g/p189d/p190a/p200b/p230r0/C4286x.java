package p148g.p189d.p190a.p200b.p230r0;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: g.d.a.b.r0.x */
public final class C4286x {
    /* renamed from: a */
    public static String m18261a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (str.equals(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m18262b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: c */
    public static boolean m18263c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m18262b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: d */
    public static boolean m18264d(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: e */
    public static boolean m18265e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m18264d(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
