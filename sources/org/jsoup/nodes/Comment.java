package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public class Comment extends C6420a {
    public Comment(String str) {
        this.f18134h = str;
    }

    public Comment(String str, String str2) {
        this(str);
    }

    public /* bridge */ /* synthetic */ String absUrl(String str) {
        return super.absUrl(str);
    }

    public XmlDeclaration asXmlDeclaration() {
        String data = getData();
        Document parse = Jsoup.parse("<" + data.substring(1, data.length() - 1) + ">", baseUri(), Parser.xmlParser());
        if (parse.children().size() <= 0) {
            return null;
        }
        Element child = parse.child(0);
        XmlDeclaration xmlDeclaration = new XmlDeclaration(C6421b.m26390b(parse).settings().normalizeTag(child.tagName()), data.startsWith("!"));
        xmlDeclaration.attributes().addAll(child.attributes());
        return xmlDeclaration;
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

    public String getData() {
        return mo18420A();
    }

    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    public boolean isXmlDeclaration() {
        String data = getData();
        return data.length() > 1 && (data.startsWith("!") || data.startsWith("?"));
    }

    public String nodeName() {
        return "#comment";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18234r(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.prettyPrint()) {
            mo18396n(appendable, i, outputSettings);
        }
        appendable.append("<!--").append(getData()).append("-->");
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
