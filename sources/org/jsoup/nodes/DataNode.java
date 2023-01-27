package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

public class DataNode extends C6420a {
    public DataNode(String str) {
        this.f18134h = str;
    }

    public DataNode(String str, String str2) {
        this(str);
    }

    public static DataNode createFromEncoded(String str, String str2) {
        return new DataNode(Entities.unescape(str));
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

    public String getWholeData() {
        return mo18420A();
    }

    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    public String nodeName() {
        return "#data";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18234r(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(getWholeData());
    }

    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo18235s(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public DataNode setWholeData(String str) {
        mo18421B(str);
        return this;
    }

    public String toString() {
        return outerHtml();
    }
}
