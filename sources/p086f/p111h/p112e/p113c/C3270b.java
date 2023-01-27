package p086f.p111h.p112e.p113c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f.h.e.c.b */
public final class C3270b {

    /* renamed from: a */
    private final Shader f10495a;

    /* renamed from: b */
    private final ColorStateList f10496b;

    /* renamed from: c */
    private int f10497c;

    private C3270b(Shader shader, ColorStateList colorStateList, int i) {
        this.f10495a = shader;
        this.f10496b = colorStateList;
        this.f10497c = i;
    }

    /* renamed from: a */
    private static C3270b m14089a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m14091c(C3269a.m14084b(resources, xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m14092d(C3276d.m14120b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    static C3270b m14090b(int i) {
        return new C3270b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    static C3270b m14091c(ColorStateList colorStateList) {
        return new C3270b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C3270b m14092d(Shader shader) {
        return new C3270b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static C3270b m14093g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m14089a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo11423e() {
        return this.f10497c;
    }

    /* renamed from: f */
    public Shader mo11424f() {
        return this.f10495a;
    }

    /* renamed from: h */
    public boolean mo11425h() {
        return this.f10495a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f10496b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11426i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f10495a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f10496b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p112e.p113c.C3270b.mo11426i():boolean");
    }

    /* renamed from: j */
    public boolean mo11427j(int[] iArr) {
        if (mo11426i()) {
            ColorStateList colorStateList = this.f10496b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f10497c) {
                this.f10497c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo11428k(int i) {
        this.f10497c = i;
    }

    /* renamed from: l */
    public boolean mo11429l() {
        return mo11425h() || this.f10497c != 0;
    }
}
