package org.jsoup.nodes;

import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class Document extends Element {

    /* renamed from: o */
    private OutputSettings f18088o = new OutputSettings();

    /* renamed from: p */
    private Parser f18089p;

    /* renamed from: q */
    private QuirksMode f18090q = QuirksMode.noQuirks;

    /* renamed from: r */
    private String f18091r;

    /* renamed from: s */
    private boolean f18092s = false;

    public static class OutputSettings implements Cloneable {

        /* renamed from: f */
        private Entities.EscapeMode f18093f = Entities.EscapeMode.base;

        /* renamed from: g */
        private Charset f18094g;

        /* renamed from: h */
        private ThreadLocal<CharsetEncoder> f18095h = new ThreadLocal<>();

        /* renamed from: i */
        Entities.C6417b f18096i;

        /* renamed from: j */
        private boolean f18097j = true;

        /* renamed from: k */
        private boolean f18098k = false;

        /* renamed from: l */
        private int f18099l = 1;

        /* renamed from: m */
        private Syntax f18100m = Syntax.html;

        public enum Syntax {
            html,
            xml
        }

        public OutputSettings() {
            charset(Charset.forName("UTF8"));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharsetEncoder mo18270b() {
            CharsetEncoder charsetEncoder = this.f18095h.get();
            return charsetEncoder != null ? charsetEncoder : mo18271c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public CharsetEncoder mo18271c() {
            CharsetEncoder newEncoder = this.f18094g.newEncoder();
            this.f18095h.set(newEncoder);
            this.f18096i = Entities.C6417b.m26353e(newEncoder.charset().name());
            return newEncoder;
        }

        public Charset charset() {
            return this.f18094g;
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }

        public OutputSettings charset(Charset charset) {
            this.f18094g = charset;
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.f18094g.name());
                outputSettings.f18093f = Entities.EscapeMode.valueOf(this.f18093f.name());
                return outputSettings;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.f18093f = escapeMode;
            return this;
        }

        public Entities.EscapeMode escapeMode() {
            return this.f18093f;
        }

        public int indentAmount() {
            return this.f18099l;
        }

        public OutputSettings indentAmount(int i) {
            Validate.isTrue(i >= 0);
            this.f18099l = i;
            return this;
        }

        public OutputSettings outline(boolean z) {
            this.f18098k = z;
            return this;
        }

        public boolean outline() {
            return this.f18098k;
        }

        public OutputSettings prettyPrint(boolean z) {
            this.f18097j = z;
            return this;
        }

        public boolean prettyPrint() {
            return this.f18097j;
        }

        public Syntax syntax() {
            return this.f18100m;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.f18100m = syntax;
            return this;
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), str);
        this.f18091r = str;
    }

    /* renamed from: M */
    private void m26307M() {
        XmlDeclaration xmlDeclaration;
        if (this.f18092s) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element first = select("meta[charset]").first();
                if (first == null) {
                    Element head = head();
                    if (head != null) {
                        first = head.appendElement("meta");
                    }
                    select("meta[name=charset]").remove();
                }
                first.attr("charset", charset().displayName());
                select("meta[name=charset]").remove();
            } else if (syntax == OutputSettings.Syntax.xml) {
                Node node = childNodes().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration xmlDeclaration2 = (XmlDeclaration) node;
                    if (xmlDeclaration2.name().equals("xml")) {
                        xmlDeclaration2.attr("encoding", charset().displayName());
                        if (xmlDeclaration2.attr("version") != null) {
                            xmlDeclaration2.attr("version", BuildConfig.VERSION_NAME);
                            return;
                        }
                        return;
                    }
                    xmlDeclaration = new XmlDeclaration("xml", false);
                } else {
                    xmlDeclaration = new XmlDeclaration("xml", false);
                }
                xmlDeclaration.attr("version", BuildConfig.VERSION_NAME);
                xmlDeclaration.attr("encoding", charset().displayName());
                prependChild(xmlDeclaration);
            }
        }
    }

    /* renamed from: N */
    private Element m26308N(String str, Node node) {
        if (node.nodeName().equals(str)) {
            return (Element) node;
        }
        int childNodeSize = node.childNodeSize();
        for (int i = 0; i < childNodeSize; i++) {
            Element N = m26308N(str, node.childNode(i));
            if (N != null) {
                return N;
            }
        }
        return null;
    }

    /* renamed from: O */
    private void m26309O(String str, Element element) {
        Elements elementsByTag = getElementsByTag(str);
        Element first = elementsByTag.first();
        if (elementsByTag.size() > 1) {
            ArrayList<Node> arrayList = new ArrayList<>();
            for (int i = 1; i < elementsByTag.size(); i++) {
                Node node = (Node) elementsByTag.get(i);
                arrayList.addAll(node.mo18341i());
                node.remove();
            }
            for (Node appendChild : arrayList) {
                first.appendChild(appendChild);
            }
        }
        if (!first.parent().equals(element)) {
            element.appendChild(first);
        }
    }

    /* renamed from: P */
    private void m26310P(Element element) {
        ArrayList arrayList = new ArrayList();
        for (Node next : element.f18107j) {
            if (next instanceof TextNode) {
                TextNode textNode = (TextNode) next;
                if (!textNode.isBlank()) {
                    arrayList.add(textNode);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Node node = (Node) arrayList.get(size);
            element.mo18384u(node);
            body().prependChild(new TextNode(" "));
            body().prependChild(node);
        }
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        document.f18089p = document.parser();
        Element appendElement = document.appendElement("html");
        appendElement.appendElement("head");
        appendElement.appendElement("body");
        return document;
    }

    public Element body() {
        return m26308N("body", this);
    }

    public Charset charset() {
        return this.f18088o.charset();
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.f18088o.charset(charset);
        m26307M();
    }

    public Document clone() {
        Document document = (Document) super.clone();
        document.f18088o = this.f18088o.clone();
        return document;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str, ParseSettings.preserveCase), baseUri());
    }

    public Element head() {
        return m26308N("head", this);
    }

    public String location() {
        return this.f18091r;
    }

    public String nodeName() {
        return "#document";
    }

    public Document normalise() {
        Element N = m26308N("html", this);
        if (N == null) {
            N = appendElement("html");
        }
        if (head() == null) {
            N.prependElement("head");
        }
        if (body() == null) {
            N.appendElement("body");
        }
        m26310P(head());
        m26310P(N);
        m26310P(this);
        m26309O("head", N);
        m26309O("body", N);
        m26307M();
        return this;
    }

    public String outerHtml() {
        return super.html();
    }

    public OutputSettings outputSettings() {
        return this.f18088o;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.f18088o = outputSettings;
        return this;
    }

    public Document parser(Parser parser) {
        this.f18089p = parser;
        return this;
    }

    public Parser parser() {
        return this.f18089p;
    }

    public QuirksMode quirksMode() {
        return this.f18090q;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.f18090q = quirksMode;
        return this;
    }

    public Element text(String str) {
        body().text(str);
        return this;
    }

    public String title() {
        Element first = getElementsByTag("title").first();
        return first != null ? StringUtil.normaliseWhitespace(first.text()).trim() : BuildConfig.FLAVOR;
    }

    public void title(String str) {
        Validate.notNull(str);
        Element first = getElementsByTag("title").first();
        if (first == null) {
            head().appendElement("title").text(str);
        } else {
            first.text(str);
        }
    }

    public void updateMetaCharsetElement(boolean z) {
        this.f18092s = z;
    }

    public boolean updateMetaCharsetElement() {
        return this.f18092s;
    }
}
