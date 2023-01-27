package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class Parser {

    /* renamed from: a */
    private C6527d f18168a;

    /* renamed from: b */
    private ParseErrorList f18169b = ParseErrorList.noTracking();

    /* renamed from: c */
    private ParseSettings f18170c;

    public Parser(C6527d dVar) {
        this.f18168a = dVar;
        this.f18170c = dVar.mo18479b();
    }

    public static Parser htmlParser() {
        return new Parser(new HtmlTreeBuilder());
    }

    public static Document parse(String str, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.mo18663d(new StringReader(str), str2, new Parser(htmlTreeBuilder));
    }

    public static Document parseBodyFragment(String str, String str2) {
        Document createShell = Document.createShell(str2);
        Element body = createShell.body();
        List<Node> parseFragment = parseFragment(str, body, str2);
        Node[] nodeArr = (Node[]) parseFragment.toArray(new Node[0]);
        for (int length = nodeArr.length - 1; length > 0; length--) {
            nodeArr[length].remove();
        }
        for (Node appendChild : nodeArr) {
            body.appendChild(appendChild);
        }
        return createShell;
    }

    public static Document parseBodyFragmentRelaxed(String str, String str2) {
        return parse(str, str2);
    }

    public static List<Node> parseFragment(String str, Element element, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.mo18484e(str, element, str2, new Parser(htmlTreeBuilder));
    }

    public static List<Node> parseFragment(String str, Element element, String str2, ParseErrorList parseErrorList) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlTreeBuilder);
        parser.f18169b = parseErrorList;
        return htmlTreeBuilder.mo18484e(str, element, str2, parser);
    }

    public static List<Node> parseXmlFragment(String str, String str2) {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        return xmlTreeBuilder.mo18636o(str, str2, new Parser(xmlTreeBuilder));
    }

    public static String unescapeEntities(String str, boolean z) {
        return new C6458b(new CharacterReader(str), ParseErrorList.noTracking()).mo18660v(z);
    }

    public static Parser xmlParser() {
        return new Parser(new XmlTreeBuilder());
    }

    public ParseErrorList getErrors() {
        return this.f18169b;
    }

    public C6527d getTreeBuilder() {
        return this.f18168a;
    }

    public boolean isTrackErrors() {
        return this.f18169b.mo18529d() > 0;
    }

    public List<Node> parseFragmentInput(String str, Element element, String str2) {
        return this.f18168a.mo18484e(str, element, str2, this);
    }

    public Document parseInput(Reader reader, String str) {
        return this.f18168a.mo18663d(reader, str, this);
    }

    public Document parseInput(String str, String str2) {
        return this.f18168a.mo18663d(new StringReader(str), str2, this);
    }

    public Parser setTrackErrors(int i) {
        this.f18169b = i > 0 ? ParseErrorList.tracking(i) : ParseErrorList.noTracking();
        return this;
    }

    public Parser setTreeBuilder(C6527d dVar) {
        this.f18168a = dVar;
        dVar.f18350a = this;
        return this;
    }

    public ParseSettings settings() {
        return this.f18170c;
    }

    public Parser settings(ParseSettings parseSettings) {
        this.f18170c = parseSettings;
        return this;
    }
}
