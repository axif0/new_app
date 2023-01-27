package org.jsoup.safety;

import com.karumi.dexter.BuildConfig;
import java.util.Collection;
import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class Cleaner {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Whitelist f18360a;

    /* renamed from: org.jsoup.safety.Cleaner$b */
    private final class C6529b implements NodeVisitor {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f18361a;

        /* renamed from: b */
        private final Element f18362b;

        /* renamed from: c */
        private Element f18363c;

        private C6529b(Element element, Element element2) {
            this.f18361a = 0;
            this.f18362b = element;
            this.f18363c = element2;
        }

        public void head(Node node, int i) {
            Node dataNode;
            if (node instanceof Element) {
                Element element = (Element) node;
                if (Cleaner.this.f18360a.mo18676c(element.tagName())) {
                    C6530c b = Cleaner.this.m26722d(element);
                    Element element2 = b.f18365a;
                    this.f18363c.appendChild(element2);
                    this.f18361a += b.f18366b;
                    this.f18363c = element2;
                    return;
                } else if (node == this.f18362b) {
                    return;
                }
            } else {
                if (node instanceof TextNode) {
                    dataNode = new TextNode(((TextNode) node).getWholeText());
                } else if ((node instanceof DataNode) && Cleaner.this.f18360a.mo18676c(node.parent().nodeName())) {
                    dataNode = new DataNode(((DataNode) node).getWholeData());
                }
                this.f18363c.appendChild(dataNode);
                return;
            }
            this.f18361a++;
        }

        public void tail(Node node, int i) {
            if ((node instanceof Element) && Cleaner.this.f18360a.mo18676c(node.nodeName())) {
                this.f18363c = this.f18363c.parent();
            }
        }
    }

    /* renamed from: org.jsoup.safety.Cleaner$c */
    private static class C6530c {

        /* renamed from: a */
        Element f18365a;

        /* renamed from: b */
        int f18366b;

        C6530c(Element element, int i) {
            this.f18365a = element;
            this.f18366b = i;
        }
    }

    public Cleaner(Whitelist whitelist) {
        Validate.notNull(whitelist);
        this.f18360a = whitelist;
    }

    /* renamed from: c */
    private int m26721c(Element element, Element element2) {
        C6529b bVar = new C6529b(element, element2);
        NodeTraversor.traverse((NodeVisitor) bVar, (Node) element);
        return bVar.f18361a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C6530c m26722d(Element element) {
        String tagName = element.tagName();
        Attributes attributes = new Attributes();
        Element element2 = new Element(Tag.valueOf(tagName), element.baseUri(), attributes);
        Iterator<Attribute> it = element.attributes().iterator();
        int i = 0;
        while (it.hasNext()) {
            Attribute next = it.next();
            if (this.f18360a.mo18675b(tagName, element, next)) {
                attributes.put(next);
            } else {
                i++;
            }
        }
        attributes.addAll(this.f18360a.mo18670a(tagName));
        return new C6530c(element2, i);
    }

    public Document clean(Document document) {
        Validate.notNull(document);
        Document createShell = Document.createShell(document.baseUri());
        if (document.body() != null) {
            m26721c(document.body(), createShell.body());
        }
        return createShell;
    }

    public boolean isValid(Document document) {
        Validate.notNull(document);
        return m26721c(document.body(), Document.createShell(document.baseUri()).body()) == 0 && document.head().childNodes().size() == 0;
    }

    public boolean isValidBodyHtml(String str) {
        Document createShell = Document.createShell(BuildConfig.FLAVOR);
        Document createShell2 = Document.createShell(BuildConfig.FLAVOR);
        ParseErrorList tracking = ParseErrorList.tracking(1);
        createShell2.body().insertChildren(0, (Collection<? extends Node>) Parser.parseFragment(str, createShell2.body(), BuildConfig.FLAVOR, tracking));
        return m26721c(createShell2.body(), createShell.body()) == 0 && tracking.size() == 0;
    }
}
