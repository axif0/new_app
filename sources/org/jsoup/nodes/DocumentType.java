package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class DocumentType extends C6420a {
    public static final String PUBLIC_KEY = "PUBLIC";
    public static final String SYSTEM_KEY = "SYSTEM";

    public DocumentType(String str, String str2, String str3) {
        Validate.notNull(str);
        Validate.notNull(str2);
        Validate.notNull(str3);
        attr("name", str);
        attr("publicId", str2);
        if (m26313D("publicId")) {
            attr("pubSysKey", PUBLIC_KEY);
        }
        attr("systemId", str3);
    }

    public DocumentType(String str, String str2, String str3, String str4) {
        attr("name", str);
        attr("publicId", str2);
        if (m26313D("publicId")) {
            attr("pubSysKey", PUBLIC_KEY);
        }
        attr("systemId", str3);
    }

    public DocumentType(String str, String str2, String str3, String str4, String str5) {
        attr("name", str);
        if (str2 != null) {
            attr("pubSysKey", str2);
        }
        attr("publicId", str3);
        attr("systemId", str4);
    }

    /* renamed from: D */
    private boolean m26313D(String str) {
        return !StringUtil.isBlank(attr(str));
    }

    public /* bridge */ /* synthetic */ String absUrl(String str) {
        return super.absUrl(str);
    }

    public /* bridge */ /* synthetic */ String attr(String str) {
        return super.attr(str);
    }

    public /* bridge */ /* synthetic */ Node attr(String str, String str2) {
        return super.attr(str, str2);
    }

    public /* bridge */ /* synthetic */ String baseUri() {
        return super.baseUri();
    }

    public /* bridge */ /* synthetic */ int childNodeSize() {
        return super.childNodeSize();
    }

    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    public String nodeName() {
        return "#doctype";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18234r(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append((outputSettings.syntax() != Document.OutputSettings.Syntax.html || m26313D("publicId") || m26313D("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (m26313D("name")) {
            appendable.append(" ").append(attr("name"));
        }
        if (m26313D("pubSysKey")) {
            appendable.append(" ").append(attr("pubSysKey"));
        }
        if (m26313D("publicId")) {
            appendable.append(" \"").append(attr("publicId")).append('\"');
        }
        if (m26313D("systemId")) {
            appendable.append(" \"").append(attr("systemId")).append('\"');
        }
        appendable.append('>');
    }

    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo18235s(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public void setPubSysKey(String str) {
        if (str != null) {
            attr("pubSysKey", str);
        }
    }
}
