package org.jsoup.nodes;

import com.karumi.dexter.BuildConfig;
import org.jsoup.nodes.Document;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;

/* renamed from: org.jsoup.nodes.b */
final class C6421b {
    /* renamed from: a */
    static Document.OutputSettings m26389a(Node node) {
        Document ownerDocument = node.ownerDocument();
        if (ownerDocument == null) {
            ownerDocument = new Document(BuildConfig.FLAVOR);
        }
        return ownerDocument.outputSettings();
    }

    /* renamed from: b */
    static Parser m26390b(Node node) {
        Document ownerDocument = node.ownerDocument();
        return (ownerDocument == null || ownerDocument.parser() == null) ? new Parser(new HtmlTreeBuilder()) : ownerDocument.parser();
    }
}
