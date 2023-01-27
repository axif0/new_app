package org.jsoup.nodes;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class XmlDeclaration extends C6420a {

    /* renamed from: j */
    private final boolean f18132j;

    public XmlDeclaration(String str, String str2, boolean z) {
        this(str, z);
    }

    public XmlDeclaration(String str, boolean z) {
        Validate.notNull(str);
        this.f18134h = str;
        this.f18132j = z;
    }

    /* renamed from: D */
    private void m26380D(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        Iterator<Attribute> it = attributes().iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            if (!next.getKey().equals(nodeName())) {
                appendable.append(' ');
                next.mo18185b(appendable, outputSettings);
            }
        }
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

    public String getWholeDeclaration() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            m26380D(borrowBuilder, new Document.OutputSettings());
            return StringUtil.releaseBuilder(borrowBuilder).trim();
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    public String name() {
        return mo18420A();
    }

    public String nodeName() {
        return "#declaration";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18234r(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        String str = "!";
        appendable.append("<").append(this.f18132j ? str : "?").append(mo18420A());
        m26380D(appendable, outputSettings);
        if (!this.f18132j) {
            str = "?";
        }
        appendable.append(str).append(">");
    }

    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo18235s(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public String toString() {
        return outerHtml();
    }
}
