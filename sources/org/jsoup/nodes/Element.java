package org.jsoup.nodes;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

public class Element extends Node {

    /* renamed from: m */
    private static final List<Node> f18103m = Collections.emptyList();

    /* renamed from: n */
    private static final Pattern f18104n = Pattern.compile("\\s+");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Tag f18105h;

    /* renamed from: i */
    private WeakReference<List<Element>> f18106i;

    /* renamed from: j */
    List<Node> f18107j;

    /* renamed from: k */
    private Attributes f18108k;

    /* renamed from: l */
    private String f18109l;

    /* renamed from: org.jsoup.nodes.Element$a */
    class C6413a implements NodeVisitor {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f18110a;

        C6413a(Element element, StringBuilder sb) {
            this.f18110a = sb;
        }

        public void head(Node node, int i) {
            if (node instanceof TextNode) {
                Element.m26319D(this.f18110a, (TextNode) node);
            } else if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f18110a.length() <= 0) {
                    return;
                }
                if ((element.isBlock() || element.f18105h.getName().equals("br")) && !TextNode.m26377D(this.f18110a)) {
                    this.f18110a.append(' ');
                }
            }
        }

        public void tail(Node node, int i) {
            if ((node instanceof Element) && ((Element) node).isBlock() && (node.nextSibling() instanceof TextNode) && !TextNode.m26377D(this.f18110a)) {
                this.f18110a.append(' ');
            }
        }
    }

    /* renamed from: org.jsoup.nodes.Element$b */
    class C6414b implements NodeVisitor {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f18111a;

        C6414b(Element element, StringBuilder sb) {
            this.f18111a = sb;
        }

        public void head(Node node, int i) {
            if (node instanceof TextNode) {
                this.f18111a.append(((TextNode) node).getWholeText());
            }
        }

        public void tail(Node node, int i) {
        }
    }

    /* renamed from: org.jsoup.nodes.Element$c */
    private static final class C6415c extends ChangeNotifyingArrayList<Node> {

        /* renamed from: f */
        private final Element f18112f;

        C6415c(Element element, int i) {
            super(i);
            this.f18112f = element;
        }

        public void onContentsChanged() {
            this.f18112f.mo18354p();
        }
    }

    public Element(String str) {
        this(Tag.valueOf(str), BuildConfig.FLAVOR, new Attributes());
    }

    public Element(Tag tag, String str) {
        this(tag, str, (Attributes) null);
    }

    public Element(Tag tag, String str, Attributes attributes) {
        Validate.notNull(tag);
        Validate.notNull(str);
        this.f18107j = f18103m;
        this.f18109l = str;
        this.f18108k = attributes;
        this.f18105h = tag;
    }

    /* renamed from: C */
    private static void m26318C(Element element, Elements elements) {
        Element parent = element.parent();
        if (parent != null && !parent.tagName().equals("#root")) {
            elements.add(parent);
            m26318C(parent, elements);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static void m26319D(StringBuilder sb, TextNode textNode) {
        String wholeText = textNode.getWholeText();
        if (m26325L(textNode.f18127f) || (textNode instanceof CDataNode)) {
            sb.append(wholeText);
        } else {
            StringUtil.appendNormalisedWhitespace(sb, wholeText, TextNode.m26377D(sb));
        }
    }

    /* renamed from: E */
    private static void m26320E(Element element, StringBuilder sb) {
        if (element.f18105h.getName().equals("br") && !TextNode.m26377D(sb)) {
            sb.append(" ");
        }
    }

    /* renamed from: F */
    private List<Element> m26321F() {
        List<Element> list;
        WeakReference<List<Element>> weakReference = this.f18106i;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f18107j.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Node node = this.f18107j.get(i);
            if (node instanceof Element) {
                arrayList.add((Element) node);
            }
        }
        this.f18106i = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* renamed from: I */
    private static <E extends Element> int m26322I(Element element, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == element) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: J */
    private Elements m26323J(boolean z) {
        Elements elements = new Elements();
        if (this.f18127f == null) {
            return elements;
        }
        elements.add(this);
        return z ? elements.nextAll() : elements.prevAll();
    }

    /* renamed from: K */
    private void m26324K(StringBuilder sb) {
        for (Node next : this.f18107j) {
            if (next instanceof TextNode) {
                m26319D(sb, (TextNode) next);
            } else if (next instanceof Element) {
                m26320E((Element) next, sb);
            }
        }
    }

    /* renamed from: L */
    static boolean m26325L(Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            int i = 0;
            while (!element.f18105h.preserveWhitespace()) {
                element = element.parent();
                i++;
                if (i < 6) {
                    if (element == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public Element mo18311f(Node node) {
        Element element = (Element) super.mo18311f(node);
        Attributes attributes = this.f18108k;
        element.f18108k = attributes != null ? attributes.clone() : null;
        element.f18109l = this.f18109l;
        C6415c cVar = new C6415c(element, this.f18107j.size());
        element.f18107j = cVar;
        cVar.addAll(this.f18107j);
        return element;
    }

    public Element addClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.add(str);
        classNames(classNames);
        return this;
    }

    public Element after(String str) {
        return (Element) super.after(str);
    }

    public Element after(Node node) {
        return (Element) super.after(node);
    }

    public Element append(String str) {
        Validate.notNull(str);
        mo18386c((Node[]) C6421b.m26390b(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]));
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        mo18410v(node);
        mo18341i();
        this.f18107j.add(node);
        node.mo18413z(this.f18107j.size() - 1);
        return this;
    }

    public Element appendElement(String str) {
        Element element = new Element(Tag.valueOf(str, C6421b.m26390b(this).settings()), baseUri());
        appendChild(element);
        return element;
    }

    public Element appendText(String str) {
        Validate.notNull(str);
        appendChild(new TextNode(str));
        return this;
    }

    public Element appendTo(Element element) {
        Validate.notNull(element);
        element.appendChild(this);
        return this;
    }

    public Element attr(String str, String str2) {
        super.attr(str, str2);
        return this;
    }

    public Element attr(String str, boolean z) {
        attributes().put(str, z);
        return this;
    }

    public Attributes attributes() {
        if (!mo18348l()) {
            this.f18108k = new Attributes();
        }
        return this.f18108k;
    }

    public String baseUri() {
        return this.f18109l;
    }

    public Element before(String str) {
        return (Element) super.before(str);
    }

    public Element before(Node node) {
        return (Element) super.before(node);
    }

    public Element child(int i) {
        return m26321F().get(i);
    }

    public int childNodeSize() {
        return this.f18107j.size();
    }

    public Elements children() {
        return new Elements(m26321F());
    }

    public String className() {
        return attr("class").trim();
    }

    public Set<String> classNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f18104n.split(className())));
        linkedHashSet.remove(BuildConfig.FLAVOR);
        return linkedHashSet;
    }

    public Element classNames(Set<String> set) {
        Validate.notNull(set);
        if (set.isEmpty()) {
            attributes().remove("class");
        } else {
            attributes().put("class", StringUtil.join((Collection) set, " "));
        }
        return this;
    }

    public Element clone() {
        return (Element) super.clone();
    }

    public String cssSelector() {
        StringBuilder sb;
        String sb2;
        if (mo18342id().length() > 0) {
            sb = new StringBuilder();
            sb.append("#");
            sb2 = mo18342id();
        } else {
            StringBuilder sb3 = new StringBuilder(tagName().replace(':', '|'));
            String join = StringUtil.join((Collection) classNames(), ".");
            if (join.length() > 0) {
                sb3.append('.');
                sb3.append(join);
            }
            if (parent() == null || (parent() instanceof Document)) {
                return sb3.toString();
            }
            sb3.insert(0, " > ");
            if (parent().select(sb3.toString()).size() > 1) {
                sb3.append(String.format(":nth-child(%d)", new Object[]{Integer.valueOf(elementSiblingIndex() + 1)}));
            }
            sb = new StringBuilder();
            sb.append(parent().cssSelector());
            sb2 = sb3.toString();
        }
        sb.append(sb2);
        return sb.toString();
    }

    public String data() {
        String wholeText;
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        for (Node next : this.f18107j) {
            if (next instanceof DataNode) {
                wholeText = ((DataNode) next).getWholeData();
            } else if (next instanceof Comment) {
                wholeText = ((Comment) next).getData();
            } else if (next instanceof Element) {
                wholeText = ((Element) next).data();
            } else if (next instanceof CDataNode) {
                wholeText = ((CDataNode) next).getWholeText();
            }
            borrowBuilder.append(wholeText);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public List<DataNode> dataNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node next : this.f18107j) {
            if (next instanceof DataNode) {
                arrayList.add((DataNode) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Map<String, String> dataset() {
        return attributes().dataset();
    }

    public int elementSiblingIndex() {
        if (parent() == null) {
            return 0;
        }
        return m26322I(this, parent().m26321F());
    }

    public Element empty() {
        this.f18107j.clear();
        return this;
    }

    public Element firstElementSibling() {
        List<Element> F = parent().m26321F();
        if (F.size() > 1) {
            return F.get(0);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo18313g(String str) {
        this.f18109l = str;
    }

    public Elements getAllElements() {
        return Collector.collect(new Evaluator.AllElements(), this);
    }

    public Element getElementById(String str) {
        Validate.notEmpty(str);
        Elements collect = Collector.collect(new Evaluator.C6538Id(str), this);
        if (collect.size() > 0) {
            return (Element) collect.get(0);
        }
        return null;
    }

    public Elements getElementsByAttribute(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Attribute(str.trim()), this);
    }

    public Elements getElementsByAttributeStarting(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.AttributeStarting(str.trim()), this);
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValue(str, str2), this);
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueContaining(str, str2), this);
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueEnding(str, str2), this);
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
        try {
            return getElementsByAttributeValueMatching(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e);
        }
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
        return Collector.collect(new Evaluator.AttributeWithValueMatching(str, pattern), this);
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueNot(str, str2), this);
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueStarting(str, str2), this);
    }

    public Elements getElementsByClass(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Class(str), this);
    }

    public Elements getElementsByIndexEquals(int i) {
        return Collector.collect(new Evaluator.IndexEquals(i), this);
    }

    public Elements getElementsByIndexGreaterThan(int i) {
        return Collector.collect(new Evaluator.IndexGreaterThan(i), this);
    }

    public Elements getElementsByIndexLessThan(int i) {
        return Collector.collect(new Evaluator.IndexLessThan(i), this);
    }

    public Elements getElementsByTag(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Tag(Normalizer.normalize(str)), this);
    }

    public Elements getElementsContainingOwnText(String str) {
        return Collector.collect(new Evaluator.ContainsOwnText(str), this);
    }

    public Elements getElementsContainingText(String str) {
        return Collector.collect(new Evaluator.ContainsText(str), this);
    }

    public Elements getElementsMatchingOwnText(String str) {
        try {
            return getElementsMatchingOwnText(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }

    public Elements getElementsMatchingText(String str) {
        try {
            return getElementsMatchingText(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        return Collector.collect(new Evaluator.Matches(pattern), this);
    }

    public boolean hasClass(String str) {
        String ignoreCase = attributes().getIgnoreCase("class");
        int length = ignoreCase.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(ignoreCase);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(ignoreCase.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && ignoreCase.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return ignoreCase.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public boolean hasText() {
        for (Node next : this.f18107j) {
            if (next instanceof TextNode) {
                if (!((TextNode) next).isBlank()) {
                    return true;
                }
            } else if ((next instanceof Element) && ((Element) next).hasText()) {
                return true;
            }
        }
        return false;
    }

    public <T extends Appendable> T html(T t) {
        int size = this.f18107j.size();
        for (int i = 0; i < size; i++) {
            this.f18107j.get(i).mo18401q(t);
        }
        return t;
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        html(borrowBuilder);
        String releaseBuilder = StringUtil.releaseBuilder(borrowBuilder);
        return C6421b.m26389a(this).prettyPrint() ? releaseBuilder.trim() : releaseBuilder;
    }

    public Element html(String str) {
        empty();
        append(str);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public List<Node> mo18341i() {
        if (this.f18107j == f18103m) {
            this.f18107j = new C6415c(this, 4);
        }
        return this.f18107j;
    }

    /* renamed from: id */
    public String mo18342id() {
        return attributes().getIgnoreCase("id");
    }

    public Element insertChildren(int i, Collection<? extends Node> collection) {
        Validate.notNull(collection, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i < 0) {
            i += childNodeSize + 1;
        }
        Validate.isTrue(i >= 0 && i <= childNodeSize, "Insert position out of bounds.");
        mo18385b(i, (Node[]) new ArrayList(collection).toArray(new Node[0]));
        return this;
    }

    public Element insertChildren(int i, Node... nodeArr) {
        Validate.notNull(nodeArr, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i < 0) {
            i += childNodeSize + 1;
        }
        Validate.isTrue(i >= 0 && i <= childNodeSize, "Insert position out of bounds.");
        mo18385b(i, nodeArr);
        return this;
    }

    /* renamed from: is */
    public boolean mo18345is(String str) {
        return mo18346is(QueryParser.parse(str));
    }

    /* renamed from: is */
    public boolean mo18346is(Evaluator evaluator) {
        return evaluator.matches((Element) root(), this);
    }

    public boolean isBlock() {
        return this.f18105h.isBlock();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo18348l() {
        return this.f18108k != null;
    }

    public Element lastElementSibling() {
        List<Element> F = parent().m26321F();
        if (F.size() > 1) {
            return F.get(F.size() - 1);
        }
        return null;
    }

    public Element nextElementSibling() {
        if (this.f18127f == null) {
            return null;
        }
        List<Element> F = parent().m26321F();
        Integer valueOf = Integer.valueOf(m26322I(this, F));
        Validate.notNull(valueOf);
        if (F.size() > valueOf.intValue() + 1) {
            return F.get(valueOf.intValue() + 1);
        }
        return null;
    }

    public Elements nextElementSiblings() {
        return m26323J(true);
    }

    public String nodeName() {
        return this.f18105h.getName();
    }

    public String normalName() {
        return this.f18105h.normalName();
    }

    public String ownText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        m26324K(borrowBuilder);
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18354p() {
        super.mo18354p();
        this.f18106i = null;
    }

    public final Element parent() {
        return (Element) this.f18127f;
    }

    public Elements parents() {
        Elements elements = new Elements();
        m26318C(this, elements);
        return elements;
    }

    public Element prepend(String str) {
        Validate.notNull(str);
        mo18385b(0, (Node[]) C6421b.m26390b(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]));
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        mo18385b(0, node);
        return this;
    }

    public Element prependElement(String str) {
        Element element = new Element(Tag.valueOf(str, C6421b.m26390b(this).settings()), baseUri());
        prependChild(element);
        return element;
    }

    public Element prependText(String str) {
        Validate.notNull(str);
        prependChild(new TextNode(str));
        return this;
    }

    public Element previousElementSibling() {
        if (this.f18127f == null) {
            return null;
        }
        List<Element> F = parent().m26321F();
        Integer valueOf = Integer.valueOf(m26322I(this, F));
        Validate.notNull(valueOf);
        if (valueOf.intValue() > 0) {
            return F.get(valueOf.intValue() - 1);
        }
        return null;
    }

    public Elements previousElementSiblings() {
        return m26323J(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18234r(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.prettyPrint() && ((this.f18105h.formatAsBlock() || ((parent() != null && parent().tag().formatAsBlock()) || outputSettings.outline())) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0))) {
            mo18396n(appendable, i, outputSettings);
        }
        appendable.append('<').append(tagName());
        Attributes attributes = this.f18108k;
        if (attributes != null) {
            attributes.mo18218u(appendable, outputSettings);
        }
        if (!this.f18107j.isEmpty() || !this.f18105h.isSelfClosing() || (outputSettings.syntax() == Document.OutputSettings.Syntax.html && this.f18105h.isEmpty())) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    public Element removeClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.remove(str);
        classNames(classNames);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo18235s(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (!this.f18107j.isEmpty() || !this.f18105h.isSelfClosing()) {
            if (outputSettings.prettyPrint() && !this.f18107j.isEmpty() && (this.f18105h.formatAsBlock() || (outputSettings.outline() && (this.f18107j.size() > 1 || (this.f18107j.size() == 1 && !(this.f18107j.get(0) instanceof TextNode)))))) {
                mo18396n(appendable, i, outputSettings);
            }
            appendable.append("</").append(tagName()).append('>');
        }
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Element selectFirst(String str) {
        return Selector.selectFirst(str, this);
    }

    public Element shallowClone() {
        Tag tag = this.f18105h;
        String str = this.f18109l;
        Attributes attributes = this.f18108k;
        return new Element(tag, str, attributes == null ? null : attributes.clone());
    }

    public Elements siblingElements() {
        if (this.f18127f == null) {
            return new Elements(0);
        }
        List<Element> F = parent().m26321F();
        Elements elements = new Elements(F.size() - 1);
        for (Element next : F) {
            if (next != this) {
                elements.add(next);
            }
        }
        return elements;
    }

    public Tag tag() {
        return this.f18105h;
    }

    public String tagName() {
        return this.f18105h.getName();
    }

    public Element tagName(String str) {
        Validate.notEmpty(str, "Tag name must not be empty.");
        this.f18105h = Tag.valueOf(str, C6421b.m26390b(this).settings());
        return this;
    }

    public String text() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        NodeTraversor.traverse((NodeVisitor) new C6413a(this, borrowBuilder), (Node) this);
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }

    public Element text(String str) {
        Validate.notNull(str);
        empty();
        appendChild(new TextNode(str));
        return this;
    }

    public List<TextNode> textNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node next : this.f18107j) {
            if (next instanceof TextNode) {
                arrayList.add((TextNode) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Element toggleClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        if (classNames.contains(str)) {
            classNames.remove(str);
        } else {
            classNames.add(str);
        }
        classNames(classNames);
        return this;
    }

    public String val() {
        return tagName().equals("textarea") ? text() : attr("value");
    }

    public Element val(String str) {
        if (tagName().equals("textarea")) {
            text(str);
        } else {
            attr("value", str);
        }
        return this;
    }

    public String wholeText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        NodeTraversor.traverse((NodeVisitor) new C6414b(this, borrowBuilder), (Node) this);
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public Element wrap(String str) {
        return (Element) super.wrap(str);
    }
}
