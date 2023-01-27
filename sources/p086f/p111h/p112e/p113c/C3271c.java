package p086f.p111h.p112e.p113c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086f.p111h.C3266d;
import p086f.p111h.p119j.C3311a;

/* renamed from: f.h.e.c.c */
public class C3271c {

    /* renamed from: f.h.e.c.c$a */
    public interface C3272a {
    }

    /* renamed from: f.h.e.c.c$b */
    public static final class C3273b implements C3272a {

        /* renamed from: a */
        private final C3274c[] f10498a;

        public C3273b(C3274c[] cVarArr) {
            this.f10498a = cVarArr;
        }

        /* renamed from: a */
        public C3274c[] mo11430a() {
            return this.f10498a;
        }
    }

    /* renamed from: f.h.e.c.c$c */
    public static final class C3274c {

        /* renamed from: a */
        private final String f10499a;

        /* renamed from: b */
        private int f10500b;

        /* renamed from: c */
        private boolean f10501c;

        /* renamed from: d */
        private String f10502d;

        /* renamed from: e */
        private int f10503e;

        /* renamed from: f */
        private int f10504f;

        public C3274c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f10499a = str;
            this.f10500b = i;
            this.f10501c = z;
            this.f10502d = str2;
            this.f10503e = i2;
            this.f10504f = i3;
        }

        /* renamed from: a */
        public String mo11431a() {
            return this.f10499a;
        }

        /* renamed from: b */
        public int mo11432b() {
            return this.f10504f;
        }

        /* renamed from: c */
        public int mo11433c() {
            return this.f10503e;
        }

        /* renamed from: d */
        public String mo11434d() {
            return this.f10502d;
        }

        /* renamed from: e */
        public int mo11435e() {
            return this.f10500b;
        }

        /* renamed from: f */
        public boolean mo11436f() {
            return this.f10501c;
        }
    }

    /* renamed from: f.h.e.c.c$d */
    public static final class C3275d implements C3272a {

        /* renamed from: a */
        private final C3311a f10505a;

        /* renamed from: b */
        private final int f10506b;

        /* renamed from: c */
        private final int f10507c;

        public C3275d(C3311a aVar, int i, int i2) {
            this.f10505a = aVar;
            this.f10507c = i;
            this.f10506b = i2;
        }

        /* renamed from: a */
        public int mo11437a() {
            return this.f10507c;
        }

        /* renamed from: b */
        public C3311a mo11438b() {
            return this.f10505a;
        }

        /* renamed from: c */
        public int mo11439c() {
            return this.f10506b;
        }
    }

    /* renamed from: a */
    private static int m14101a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static p086f.p111h.p112e.p113c.C3271c.C3272a m14102b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            f.h.e.c.c$a r3 = m14104d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            goto L_0x001b
        L_0x001a:
            throw r3
        L_0x001b:
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p112e.p113c.C3271c.m14102b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):f.h.e.c.c$a");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m14103c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m14101a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m14108h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m14108h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C3272a m14104d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m14105e(xmlPullParser, resources);
        }
        m14107g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C3272a m14105e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3266d.FontFamily);
        String string = obtainAttributes.getString(C3266d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C3266d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C3266d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C3266d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C3266d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C3266d.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m14106f(xmlPullParser, resources));
                    } else {
                        m14107g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C3273b((C3274c[]) arrayList.toArray(new C3274c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m14107g(xmlPullParser);
        }
        return new C3275d(new C3311a(string, string2, string3, m14103c(resources, resourceId)), integer, integer2);
    }

    /* renamed from: f */
    private static C3274c m14106f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3266d.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C3266d.FontFamilyFont_fontWeight) ? C3266d.FontFamilyFont_fontWeight : C3266d.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C3266d.FontFamilyFont_fontStyle) ? C3266d.FontFamilyFont_fontStyle : C3266d.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C3266d.FontFamilyFont_ttcIndex) ? C3266d.FontFamilyFont_ttcIndex : C3266d.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C3266d.FontFamilyFont_fontVariationSettings) ? C3266d.FontFamilyFont_fontVariationSettings : C3266d.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C3266d.FontFamilyFont_font) ? C3266d.FontFamilyFont_font : C3266d.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m14107g(xmlPullParser);
        }
        return new C3274c(string2, i, z, string, i3, resourceId);
    }

    /* renamed from: g */
    private static void m14107g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m14108h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
