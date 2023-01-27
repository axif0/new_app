package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class TextNode extends C6420a {
    public TextNode(String str) {
        this.f18134h = str;
    }

    public TextNode(String str, String str2) {
        this(str);
    }

    /* renamed from: D */
    static boolean m26377D(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    public static TextNode createFromEncoded(String str) {
        return new TextNode(Entities.unescape(str));
    }

    public static TextNode createFromEncoded(String str, String str2) {
        return new TextNode(Entities.unescape(str));
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

    public String getWholeText() {
        return mo18420A();
    }

    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    public boolean isBlank() {
        return StringUtil.isBlank(mo18420A());
    }

    public String nodeName() {
        return "#text";
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (isBlank() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        mo18396n(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (isBlank() == false) goto L_0x003a;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18234r(java.lang.Appendable r7, int r8, org.jsoup.nodes.Document.OutputSettings r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9.prettyPrint()
            if (r0 == 0) goto L_0x003d
            int r0 = r6.siblingIndex()
            if (r0 != 0) goto L_0x0024
            org.jsoup.nodes.Node r0 = r6.f18127f
            boolean r1 = r0 instanceof org.jsoup.nodes.Element
            if (r1 == 0) goto L_0x0024
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.Tag r0 = r0.tag()
            boolean r0 = r0.formatAsBlock()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r6.isBlank()
            if (r0 == 0) goto L_0x003a
        L_0x0024:
            boolean r0 = r9.outline()
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r6.siblingNodes()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            boolean r0 = r6.isBlank()
            if (r0 != 0) goto L_0x003d
        L_0x003a:
            r6.mo18396n(r7, r8, r9)
        L_0x003d:
            boolean r8 = r9.prettyPrint()
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.Node r8 = r6.parent()
            boolean r8 = r8 instanceof org.jsoup.nodes.Element
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.Node r8 = r6.parent()
            boolean r8 = org.jsoup.nodes.Element.m26325L(r8)
            if (r8 != 0) goto L_0x0058
            r8 = 1
            r4 = 1
            goto L_0x005a
        L_0x0058:
            r8 = 0
            r4 = 0
        L_0x005a:
            java.lang.String r1 = r6.mo18420A()
            r3 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            org.jsoup.nodes.Entities.m26340d(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.TextNode.mo18234r(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo18235s(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public TextNode splitText(int i) {
        String A = mo18420A();
        Validate.isTrue(i >= 0, "Split offset must be not be negative");
        Validate.isTrue(i < A.length(), "Split offset must not be greater than current text length");
        String substring = A.substring(0, i);
        String substring2 = A.substring(i);
        text(substring);
        TextNode textNode = new TextNode(substring2);
        if (parent() != null) {
            parent().mo18385b(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return StringUtil.normaliseWhitespace(getWholeText());
    }

    public TextNode text(String str) {
        mo18421B(str);
        return this;
    }

    public String toString() {
        return outerHtml();
    }
}
