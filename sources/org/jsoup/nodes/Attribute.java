package org.jsoup.nodes;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class Attribute implements Map.Entry<String, String>, Cloneable {

    /* renamed from: i */
    private static final String[] f18073i = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: f */
    private String f18074f;

    /* renamed from: g */
    private String f18075g;

    /* renamed from: h */
    Attributes f18076h;

    public Attribute(String str, String str2) {
        this(str, str2, (Attributes) null);
    }

    public Attribute(String str, String str2, Attributes attributes) {
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        this.f18074f = trim;
        this.f18075g = str2;
        this.f18076h = attributes;
    }

    /* renamed from: c */
    protected static void m26278c(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(str);
        if (!m26281g(str, str2, outputSettings)) {
            appendable.append("=\"");
            Entities.m26340d(appendable, Attributes.m26291q(str2), outputSettings, true, false, false);
            appendable.append('\"');
        }
    }

    public static Attribute createFromEncoded(String str, String str2) {
        return new Attribute(str, Entities.m26342f(str2, true), (Attributes) null);
    }

    /* renamed from: d */
    protected static boolean m26279d(String str) {
        return Arrays.binarySearch(f18073i, str) >= 0;
    }

    /* renamed from: f */
    protected static boolean m26280f(String str) {
        return str.startsWith("data-") && str.length() > 5;
    }

    /* renamed from: g */
    protected static boolean m26281g(String str, String str2, Document.OutputSettings outputSettings) {
        return outputSettings.syntax() == Document.OutputSettings.Syntax.html && (str2 == null || ((BuildConfig.FLAVOR.equals(str2) || str2.equalsIgnoreCase(str)) && m26279d(str)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18185b(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        m26278c(this.f18074f, this.f18075g, appendable, outputSettings);
    }

    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo18187e() {
        return m26280f(this.f18074f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        String str = this.f18074f;
        if (str == null ? attribute.f18074f != null : !str.equals(attribute.f18074f)) {
            return false;
        }
        String str2 = this.f18075g;
        String str3 = attribute.f18075g;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public String getKey() {
        return this.f18074f;
    }

    public String getValue() {
        return Attributes.m26291q(this.f18075g);
    }

    public int hashCode() {
        String str = this.f18074f;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f18075g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            mo18185b(borrowBuilder, new Document(BuildConfig.FLAVOR).outputSettings());
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    public void setKey(String str) {
        int x;
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        Attributes attributes = this.f18076h;
        if (!(attributes == null || (x = attributes.mo18219x(this.f18074f)) == -1)) {
            this.f18076h.f18079g[x] = trim;
        }
        this.f18074f = trim;
    }

    public String setValue(String str) {
        String str2 = this.f18075g;
        Attributes attributes = this.f18076h;
        if (attributes != null) {
            str2 = attributes.get(this.f18074f);
            int x = this.f18076h.mo18219x(this.f18074f);
            if (x != -1) {
                this.f18076h.f18080h[x] = str;
            }
        }
        this.f18075g = str;
        return Attributes.m26291q(str2);
    }

    public String toString() {
        return html();
    }
}
