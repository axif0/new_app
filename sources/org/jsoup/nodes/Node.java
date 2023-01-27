package org.jsoup.nodes;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public abstract class Node implements Cloneable {

    /* renamed from: f */
    Node f18127f;

    /* renamed from: g */
    int f18128g;

    /* renamed from: org.jsoup.nodes.Node$a */
    class C6418a implements NodeVisitor {

        /* renamed from: a */
        final /* synthetic */ String f18129a;

        C6418a(Node node, String str) {
            this.f18129a = str;
        }

        public void head(Node node, int i) {
            node.mo18313g(this.f18129a);
        }

        public void tail(Node node, int i) {
        }
    }

    /* renamed from: org.jsoup.nodes.Node$b */
    private static class C6419b implements NodeVisitor {

        /* renamed from: a */
        private Appendable f18130a;

        /* renamed from: b */
        private Document.OutputSettings f18131b;

        C6419b(Appendable appendable, Document.OutputSettings outputSettings) {
            this.f18130a = appendable;
            this.f18131b = outputSettings;
            outputSettings.mo18271c();
        }

        public void head(Node node, int i) {
            try {
                node.mo18234r(this.f18130a, i, this.f18131b);
            } catch (IOException e) {
                throw new SerializationException((Throwable) e);
            }
        }

        public void tail(Node node, int i) {
            if (!node.nodeName().equals("#text")) {
                try {
                    node.mo18235s(this.f18130a, i, this.f18131b);
                } catch (IOException e) {
                    throw new SerializationException((Throwable) e);
                }
            }
        }
    }

    protected Node() {
    }

    /* renamed from: d */
    private void m26355d(int i, String str) {
        Validate.notNull(str);
        Validate.notNull(this.f18127f);
        this.f18127f.mo18385b(i, (Node[]) C6421b.m26390b(this).parseFragmentInput(str, parent() instanceof Element ? (Element) parent() : null, baseUri()).toArray(new Node[0]));
    }

    /* renamed from: k */
    private Element m26356k(Element element) {
        Elements children = element.children();
        return children.size() > 0 ? m26356k((Element) children.get(0)) : element;
    }

    /* renamed from: t */
    private void m26357t(int i) {
        List<Node> i2 = mo18341i();
        while (i < i2.size()) {
            i2.get(i).mo18413z(i);
            i++;
        }
    }

    public String absUrl(String str) {
        Validate.notEmpty(str);
        return !hasAttr(str) ? BuildConfig.FLAVOR : StringUtil.resolve(baseUri(), attr(str));
    }

    public Node after(String str) {
        m26355d(this.f18128g + 1, str);
        return this;
    }

    public Node after(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f18127f);
        this.f18127f.mo18385b(this.f18128g + 1, node);
        return this;
    }

    public String attr(String str) {
        Validate.notNull(str);
        if (!mo18348l()) {
            return BuildConfig.FLAVOR;
        }
        String ignoreCase = attributes().getIgnoreCase(str);
        return ignoreCase.length() > 0 ? ignoreCase : str.startsWith("abs:") ? absUrl(str.substring(4)) : BuildConfig.FLAVOR;
    }

    public Node attr(String str, String str2) {
        attributes().mo18197B(C6421b.m26390b(this).settings().normalizeAttribute(str), str2);
        return this;
    }

    public abstract Attributes attributes();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18385b(int i, Node... nodeArr) {
        Validate.noNullElements(nodeArr);
        List<Node> i2 = mo18341i();
        for (Node v : nodeArr) {
            mo18410v(v);
        }
        i2.addAll(i, Arrays.asList(nodeArr));
        m26357t(i);
    }

    public abstract String baseUri();

    public Node before(String str) {
        m26355d(this.f18128g, str);
        return this;
    }

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f18127f);
        this.f18127f.mo18385b(this.f18128g, node);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18386c(Node... nodeArr) {
        List<Node> i = mo18341i();
        for (Node node : nodeArr) {
            mo18410v(node);
            i.add(node);
            node.mo18413z(i.size() - 1);
        }
    }

    public Node childNode(int i) {
        return mo18341i().get(i);
    }

    public abstract int childNodeSize();

    public List<Node> childNodes() {
        return Collections.unmodifiableList(mo18341i());
    }

    public List<Node> childNodesCopy() {
        List<Node> i = mo18341i();
        ArrayList arrayList = new ArrayList(i.size());
        for (Node clone : i) {
            arrayList.add(clone.clone());
        }
        return arrayList;
    }

    public Node clearAttributes() {
        Iterator<Attribute> it = attributes().iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        return this;
    }

    public Node clone() {
        Node f = mo18311f((Node) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(f);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            int childNodeSize = node.childNodeSize();
            for (int i = 0; i < childNodeSize; i++) {
                List<Node> i2 = node.mo18341i();
                Node f2 = i2.get(i).mo18311f(node);
                i2.set(i, f2);
                linkedList.add(f2);
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Node[] mo18391e() {
        return (Node[]) mo18341i().toArray(new Node[0]);
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Node mo18311f(Node node) {
        try {
            Node node2 = (Node) super.clone();
            node2.f18127f = node;
            node2.f18128g = node == null ? 0 : this.f18128g;
            return node2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Node filter(NodeFilter nodeFilter) {
        Validate.notNull(nodeFilter);
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo18313g(String str);

    public boolean hasAttr(String str) {
        Validate.notNull(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (attributes().hasKeyIgnoreCase(substring) && !absUrl(substring).equals(BuildConfig.FLAVOR)) {
                return true;
            }
        }
        return attributes().hasKeyIgnoreCase(str);
    }

    public boolean hasParent() {
        return this.f18127f != null;
    }

    public boolean hasSameValue(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return outerHtml().equals(((Node) obj).outerHtml());
    }

    public <T extends Appendable> T html(T t) {
        mo18401q(t);
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract List<Node> mo18341i();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo18348l();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo18396n(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(10).append(StringUtil.padding(i * outputSettings.indentAmount()));
    }

    public Node nextSibling() {
        Node node = this.f18127f;
        if (node == null) {
            return null;
        }
        List<Node> i = node.mo18341i();
        int i2 = this.f18128g + 1;
        if (i.size() > i2) {
            return i.get(i2);
        }
        return null;
    }

    public abstract String nodeName();

    public String outerHtml() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        mo18401q(borrowBuilder);
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public Document ownerDocument() {
        Node root = root();
        if (root instanceof Document) {
            return (Document) root;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18354p() {
    }

    public Node parent() {
        return this.f18127f;
    }

    public final Node parentNode() {
        return this.f18127f;
    }

    public Node previousSibling() {
        Node node = this.f18127f;
        if (node != null && this.f18128g > 0) {
            return node.mo18341i().get(this.f18128g - 1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo18401q(Appendable appendable) {
        NodeTraversor.traverse((NodeVisitor) new C6419b(appendable, C6421b.m26389a(this)), this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract void mo18234r(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException;

    public void remove() {
        Validate.notNull(this.f18127f);
        this.f18127f.mo18384u(this);
    }

    public Node removeAttr(String str) {
        Validate.notNull(str);
        attributes().removeIgnoreCase(str);
        return this;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f18127f);
        this.f18127f.mo18411x(this, node);
    }

    public Node root() {
        Node node = this;
        while (true) {
            Node node2 = node.f18127f;
            if (node2 == null) {
                return node;
            }
            node = node2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo18235s(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException;

    public void setBaseUri(String str) {
        Validate.notNull(str);
        traverse(new C6418a(this, str));
    }

    public Node shallowClone() {
        return mo18311f((Node) null);
    }

    public int siblingIndex() {
        return this.f18128g;
    }

    public List<Node> siblingNodes() {
        Node node = this.f18127f;
        if (node == null) {
            return Collections.emptyList();
        }
        List<Node> i = node.mo18341i();
        ArrayList arrayList = new ArrayList(i.size() - 1);
        for (Node next : i) {
            if (next != this) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String toString() {
        return outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18384u(Node node) {
        Validate.isTrue(node.f18127f == this);
        int i = node.f18128g;
        mo18341i().remove(i);
        m26357t(i);
        node.f18127f = null;
    }

    public Node unwrap() {
        Validate.notNull(this.f18127f);
        List<Node> i = mo18341i();
        Node node = i.size() > 0 ? i.get(0) : null;
        this.f18127f.mo18385b(this.f18128g, mo18391e());
        remove();
        return node;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo18410v(Node node) {
        node.mo18412y(this);
    }

    public Node wrap(String str) {
        Validate.notEmpty(str);
        List<Node> parseFragmentInput = C6421b.m26390b(this).parseFragmentInput(str, parent() instanceof Element ? (Element) parent() : null, baseUri());
        Node node = parseFragmentInput.get(0);
        if (!(node instanceof Element)) {
            return null;
        }
        Element element = (Element) node;
        Element k = m26356k(element);
        this.f18127f.mo18411x(this, element);
        k.mo18386c(this);
        if (parseFragmentInput.size() > 0) {
            for (int i = 0; i < parseFragmentInput.size(); i++) {
                Node node2 = parseFragmentInput.get(i);
                node2.f18127f.mo18384u(node2);
                element.appendChild(node2);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18411x(Node node, Node node2) {
        Validate.isTrue(node.f18127f == this);
        Validate.notNull(node2);
        Node node3 = node2.f18127f;
        if (node3 != null) {
            node3.mo18384u(node2);
        }
        int i = node.f18128g;
        mo18341i().set(i, node2);
        node2.f18127f = this;
        node2.mo18413z(i);
        node.f18127f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo18412y(Node node) {
        Validate.notNull(node);
        Node node2 = this.f18127f;
        if (node2 != null) {
            node2.mo18384u(this);
        }
        this.f18127f = node;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo18413z(int i) {
        this.f18128g = i;
    }
}
