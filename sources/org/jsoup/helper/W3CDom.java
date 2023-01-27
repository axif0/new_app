package org.jsoup.helper;

import com.karumi.dexter.BuildConfig;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class W3CDom {

    /* renamed from: a */
    protected DocumentBuilderFactory f18061a = DocumentBuilderFactory.newInstance();

    protected static class W3CBuilder implements NodeVisitor {

        /* renamed from: a */
        private final Document f18062a;

        /* renamed from: b */
        private final Stack<HashMap<String, String>> f18063b;

        /* renamed from: c */
        private Element f18064c;

        public W3CBuilder(Document document) {
            Stack<HashMap<String, String>> stack = new Stack<>();
            this.f18063b = stack;
            this.f18062a = document;
            stack.push(new HashMap());
        }

        /* renamed from: a */
        private void m26274a(Node node, Element element) {
            Iterator<Attribute> it = node.attributes().iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                String replaceAll = next.getKey().replaceAll("[^-a-zA-Z0-9_:.]", BuildConfig.FLAVOR);
                if (replaceAll.matches("[a-zA-Z_:][-a-zA-Z0-9_:.]*")) {
                    element.setAttribute(replaceAll, next.getValue());
                }
            }
        }

        /* renamed from: b */
        private String m26275b(org.jsoup.nodes.Element element) {
            String str;
            Iterator<Attribute> it = element.attributes().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = BuildConfig.FLAVOR;
                if (!hasNext) {
                    break;
                }
                Attribute next = it.next();
                String key = next.getKey();
                if (!key.equals("xmlns")) {
                    if (key.startsWith("xmlns:")) {
                        str = key.substring(6);
                    }
                }
                this.f18063b.peek().put(str, next.getValue());
            }
            int indexOf = element.tagName().indexOf(":");
            return indexOf > 0 ? element.tagName().substring(0, indexOf) : str;
        }

        public void head(Node node, int i) {
            Document document;
            String wholeData;
            org.w3c.dom.Node createComment;
            this.f18063b.push(new HashMap(this.f18063b.peek()));
            if (node instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element element = (org.jsoup.nodes.Element) node;
                String str = (String) this.f18063b.peek().get(m26275b(element));
                String tagName = element.tagName();
                Element createElementNS = (str != null || !tagName.contains(":")) ? this.f18062a.createElementNS(str, tagName) : this.f18062a.createElementNS(BuildConfig.FLAVOR, tagName);
                m26274a(element, createElementNS);
                Element element2 = this.f18064c;
                if (element2 == null) {
                    this.f18062a.appendChild(createElementNS);
                } else {
                    element2.appendChild(createElementNS);
                }
                this.f18064c = createElementNS;
                return;
            }
            if (node instanceof TextNode) {
                document = this.f18062a;
                wholeData = ((TextNode) node).getWholeText();
            } else if (node instanceof Comment) {
                createComment = this.f18062a.createComment(((Comment) node).getData());
                this.f18064c.appendChild(createComment);
            } else if (node instanceof DataNode) {
                document = this.f18062a;
                wholeData = ((DataNode) node).getWholeData();
            } else {
                return;
            }
            createComment = document.createTextNode(wholeData);
            this.f18064c.appendChild(createComment);
        }

        public void tail(Node node, int i) {
            if ((node instanceof org.jsoup.nodes.Element) && (this.f18064c.getParentNode() instanceof Element)) {
                this.f18064c = (Element) this.f18064c.getParentNode();
            }
            this.f18063b.pop();
        }
    }

    public String asString(Document document) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (TransformerException e) {
            throw new IllegalStateException(e);
        }
    }

    public void convert(org.jsoup.nodes.Document document, Document document2) {
        if (!StringUtil.isBlank(document.location())) {
            document2.setDocumentURI(document.location());
        }
        NodeTraversor.traverse((NodeVisitor) new W3CBuilder(document2), (Node) document.child(0));
    }

    public Document fromJsoup(org.jsoup.nodes.Document document) {
        Validate.notNull(document);
        try {
            this.f18061a.setNamespaceAware(true);
            Document newDocument = this.f18061a.newDocumentBuilder().newDocument();
            convert(document, newDocument);
            return newDocument;
        } catch (ParserConfigurationException e) {
            throw new IllegalStateException(e);
        }
    }
}
