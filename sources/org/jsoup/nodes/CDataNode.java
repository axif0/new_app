package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;

public class CDataNode extends TextNode {
    public CDataNode(String str) {
        super(str);
    }

    public String nodeName() {
        return "#cdata";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18234r(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<![CDATA[").append(getWholeText());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo18235s(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String text() {
        return getWholeText();
    }
}
