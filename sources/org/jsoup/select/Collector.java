package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;

public class Collector {

    /* renamed from: org.jsoup.select.Collector$a */
    private static class C6536a implements NodeVisitor {

        /* renamed from: a */
        private final Element f18373a;

        /* renamed from: b */
        private final Elements f18374b;

        /* renamed from: c */
        private final Evaluator f18375c;

        C6536a(Element element, Elements elements, Evaluator evaluator) {
            this.f18373a = element;
            this.f18374b = elements;
            this.f18375c = evaluator;
        }

        public void head(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f18375c.matches(this.f18373a, element)) {
                    this.f18374b.add(element);
                }
            }
        }

        public void tail(Node node, int i) {
        }
    }

    /* renamed from: org.jsoup.select.Collector$b */
    private static class C6537b implements NodeFilter {

        /* renamed from: a */
        private final Element f18376a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Element f18377b = null;

        /* renamed from: c */
        private final Evaluator f18378c;

        C6537b(Element element, Evaluator evaluator) {
            this.f18376a = element;
            this.f18378c = evaluator;
        }

        public NodeFilter.FilterResult head(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f18378c.matches(this.f18376a, element)) {
                    this.f18377b = element;
                    return NodeFilter.FilterResult.STOP;
                }
            }
            return NodeFilter.FilterResult.CONTINUE;
        }

        public NodeFilter.FilterResult tail(Node node, int i) {
            return NodeFilter.FilterResult.CONTINUE;
        }
    }

    private Collector() {
    }

    public static Elements collect(Evaluator evaluator, Element element) {
        Elements elements = new Elements();
        NodeTraversor.traverse((NodeVisitor) new C6536a(element, elements, evaluator), (Node) element);
        return elements;
    }

    public static Element findFirst(Evaluator evaluator, Element element) {
        C6537b bVar = new C6537b(element, evaluator);
        NodeTraversor.filter((NodeFilter) bVar, (Node) element);
        return bVar.f18377b;
    }
}
