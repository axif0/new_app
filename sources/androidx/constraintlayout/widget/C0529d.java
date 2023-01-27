package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0529d {

    /* renamed from: a */
    private final ConstraintLayout f2136a;

    /* renamed from: b */
    private SparseArray<C0530a> f2137b = new SparseArray<>();

    /* renamed from: c */
    private SparseArray<C0532e> f2138c = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    static class C0530a {

        /* renamed from: a */
        int f2139a;

        /* renamed from: b */
        ArrayList<C0531b> f2140b = new ArrayList<>();

        /* renamed from: c */
        int f2141c = -1;

        /* renamed from: d */
        C0532e f2142d;

        public C0530a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0544k.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0544k.State_android_id) {
                    this.f2139a = obtainStyledAttributes.getResourceId(index, this.f2139a);
                } else if (index == C0544k.State_constraints) {
                    this.f2141c = obtainStyledAttributes.getResourceId(index, this.f2141c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2141c);
                    context.getResources().getResourceName(this.f2141c);
                    if ("layout".equals(resourceTypeName)) {
                        C0532e eVar = new C0532e();
                        this.f2142d = eVar;
                        eVar.mo2641d(context, this.f2141c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2639a(C0531b bVar) {
            this.f2140b.add(bVar);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    static class C0531b {

        /* renamed from: a */
        float f2143a = Float.NaN;

        /* renamed from: b */
        float f2144b = Float.NaN;

        /* renamed from: c */
        float f2145c = Float.NaN;

        /* renamed from: d */
        float f2146d = Float.NaN;

        /* renamed from: e */
        int f2147e = -1;

        /* renamed from: f */
        C0532e f2148f;

        public C0531b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0544k.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0544k.Variant_constraints) {
                    this.f2147e = obtainStyledAttributes.getResourceId(index, this.f2147e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2147e);
                    context.getResources().getResourceName(this.f2147e);
                    if ("layout".equals(resourceTypeName)) {
                        C0532e eVar = new C0532e();
                        this.f2148f = eVar;
                        eVar.mo2641d(context, this.f2147e);
                    }
                } else if (index == C0544k.Variant_region_heightLessThan) {
                    this.f2146d = obtainStyledAttributes.getDimension(index, this.f2146d);
                } else if (index == C0544k.Variant_region_heightMoreThan) {
                    this.f2144b = obtainStyledAttributes.getDimension(index, this.f2144b);
                } else if (index == C0544k.Variant_region_widthLessThan) {
                    this.f2145c = obtainStyledAttributes.getDimension(index, this.f2145c);
                } else if (index == C0544k.Variant_region_widthMoreThan) {
                    this.f2143a = obtainStyledAttributes.getDimension(index, this.f2143a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    C0529d(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2136a = constraintLayout;
        m2476a(context, i);
    }

    /* renamed from: a */
    private void m2476a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0530a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0530a(context, xml);
                            this.f2137b.put(aVar.f2139a, aVar);
                        } else if (c == 3) {
                            C0531b bVar = new C0531b(context, xml);
                            if (aVar != null) {
                                aVar.mo2639a(bVar);
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m2477b(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m2477b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0532e eVar = new C0532e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        i = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                eVar.mo2645j(context, xmlPullParser);
                this.f2138c.put(i, eVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo2638c(C0540g gVar) {
    }
}
