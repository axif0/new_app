package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.jsoup.select.Elements;

public class HtmlTreeBuilder extends C6527d {

    /* renamed from: A */
    static final String[] f18143A = {"html", "table"};

    /* renamed from: B */
    static final String[] f18144B = {"optgroup", "option"};

    /* renamed from: C */
    static final String[] f18145C = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};

    /* renamed from: D */
    static final String[] f18146D = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public static final int MaxScopeSearchDepth = 100;

    /* renamed from: x */
    static final String[] f18147x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: y */
    static final String[] f18148y = {"ol", "ul"};

    /* renamed from: z */
    static final String[] f18149z = {"button"};

    /* renamed from: k */
    private C6432a f18150k;

    /* renamed from: l */
    private C6432a f18151l;

    /* renamed from: m */
    private boolean f18152m;

    /* renamed from: n */
    private Element f18153n;

    /* renamed from: o */
    private FormElement f18154o;

    /* renamed from: p */
    private Element f18155p;

    /* renamed from: q */
    private ArrayList<Element> f18156q;

    /* renamed from: r */
    private List<String> f18157r;

    /* renamed from: s */
    private Token.C6428g f18158s;

    /* renamed from: t */
    private boolean f18159t;

    /* renamed from: u */
    private boolean f18160u;

    /* renamed from: v */
    private boolean f18161v;

    /* renamed from: w */
    private String[] f18162w = {null};

    /* renamed from: I */
    private boolean m26421I(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f18162w;
        strArr3[0] = str;
        return m26422J(strArr3, strArr, strArr2);
    }

    /* renamed from: J */
    private boolean m26422J(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f18354e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String normalName = this.f18354e.get(size).normalName();
            if (StringUtil.inSorted(normalName, strArr)) {
                return true;
            }
            if (StringUtil.inSorted(normalName, strArr2)) {
                return false;
            }
            if (strArr3 != null && StringUtil.inSorted(normalName, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26423T(org.jsoup.nodes.Node r2) {
        /*
            r1 = this;
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r1.f18354e
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000e
            org.jsoup.nodes.Document r0 = r1.f18353d
        L_0x000a:
            r0.appendChild(r2)
            goto L_0x001d
        L_0x000e:
            boolean r0 = r1.mo18476X()
            if (r0 == 0) goto L_0x0018
            r1.mo18472R(r2)
            goto L_0x001d
        L_0x0018:
            org.jsoup.nodes.Element r0 = r1.mo18662a()
            goto L_0x000a
        L_0x001d:
            boolean r0 = r2 instanceof org.jsoup.nodes.Element
            if (r0 == 0) goto L_0x0034
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            org.jsoup.parser.Tag r0 = r2.tag()
            boolean r0 = r0.isFormListed()
            if (r0 == 0) goto L_0x0034
            org.jsoup.nodes.FormElement r0 = r1.f18154o
            if (r0 == 0) goto L_0x0034
            r0.addElement(r2)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.m26423T(org.jsoup.nodes.Node):void");
    }

    /* renamed from: W */
    private boolean m26424W(ArrayList<Element> arrayList, Element element) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == element) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m26425a0(Element element, Element element2) {
        return element.normalName().equals(element2.normalName()) && element.attributes().equals(element2.attributes());
    }

    /* renamed from: l */
    private void m26426l(String... strArr) {
        int size = this.f18354e.size() - 1;
        while (size >= 0) {
            Element element = this.f18354e.get(size);
            if (!StringUtil.m26277in(element.normalName(), strArr) && !element.normalName().equals("html")) {
                this.f18354e.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    /* renamed from: u0 */
    private void m26427u0(ArrayList<Element> arrayList, Element element, Element element2) {
        int lastIndexOf = arrayList.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        arrayList.set(lastIndexOf, element2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public List<String> mo18455A() {
        return this.f18157r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public C6432a mo18456A0() {
        return this.f18150k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public ArrayList<Element> mo18457B() {
        return this.f18354e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo18458B0(C6432a aVar) {
        this.f18150k = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo18459C(String str) {
        return mo18462F(str, f18149z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo18460D(String str) {
        return mo18462F(str, f18148y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo18461E(String str) {
        return mo18462F(str, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo18462F(String str, String[] strArr) {
        return m26421I(str, f18147x, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo18463G(String[] strArr) {
        return m26422J(strArr, f18147x, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo18464H(String str) {
        for (int size = this.f18354e.size() - 1; size >= 0; size--) {
            String normalName = this.f18354e.get(size).normalName();
            if (normalName.equals(str)) {
                return true;
            }
            if (!StringUtil.inSorted(normalName, f18144B)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo18465K(String str) {
        return m26421I(str, f18143A, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public Element mo18466L(Token.C6429h hVar) {
        if (hVar.mo18602z()) {
            Element P = mo18470P(hVar);
            this.f18354e.add(P);
            this.f18352c.mo18659u(C6459c.Data);
            C6458b bVar = this.f18352c;
            Token.C6428g gVar = this.f18158s;
            gVar.mo18572m();
            gVar.mo18589B(P.tagName());
            bVar.mo18649k(gVar);
            return P;
        }
        Tag valueOf = Tag.valueOf(hVar.mo18588A(), this.f18357h);
        String str = this.f18355f;
        ParseSettings parseSettings = this.f18357h;
        Attributes attributes = hVar.f18207j;
        parseSettings.mo18530a(attributes);
        Element element = new Element(valueOf, str, attributes);
        mo18467M(element);
        return element;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo18467M(Element element) {
        m26423T(element);
        this.f18354e.add(element);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo18468N(Token.C6424c cVar) {
        Element a = mo18662a();
        String tagName = a.tagName();
        String q = cVar.mo18576q();
        a.appendChild(cVar.mo18565f() ? new CDataNode(q) : (tagName.equals("script") || tagName.equals("style")) ? new DataNode(q) : new TextNode(q));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo18469O(Token.C6425d dVar) {
        m26423T(new Comment(dVar.mo18577p()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public Element mo18470P(Token.C6429h hVar) {
        Tag valueOf = Tag.valueOf(hVar.mo18588A(), this.f18357h);
        Element element = new Element(valueOf, this.f18355f, hVar.f18207j);
        m26423T(element);
        if (hVar.mo18602z()) {
            if (!valueOf.isKnownTag()) {
                valueOf.mo18543b();
            } else if (!valueOf.isEmpty()) {
                this.f18352c.mo18655q("Tag cannot be self closing; not a void tag");
            }
        }
        return element;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public FormElement mo18471Q(Token.C6429h hVar, boolean z) {
        FormElement formElement = new FormElement(Tag.valueOf(hVar.mo18588A(), this.f18357h), this.f18355f, hVar.f18207j);
        mo18520x0(formElement);
        m26423T(formElement);
        if (z) {
            this.f18354e.add(formElement);
        }
        return formElement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo18472R(Node node) {
        Element element;
        Element y = mo18521y("table");
        boolean z = false;
        if (y == null) {
            element = this.f18354e.get(0);
        } else if (y.parent() != null) {
            element = y.parent();
            z = true;
        } else {
            element = mo18491j(y);
        }
        if (z) {
            Validate.notNull(y);
            y.before(node);
            return;
        }
        element.appendChild(node);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo18473S() {
        this.f18156q.add((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo18474U(Element element, Element element2) {
        int lastIndexOf = this.f18354e.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        this.f18354e.add(lastIndexOf + 1, element2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public Element mo18475V(String str) {
        Element element = new Element(Tag.valueOf(str, this.f18357h), this.f18355f);
        mo18467M(element);
        return element;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo18476X() {
        return this.f18160u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo18477Y() {
        return this.f18161v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo18478Z(Element element) {
        return m26424W(this.f18156q, element);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ParseSettings mo18479b() {
        return ParseSettings.htmlDefault;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo18480b0(Element element) {
        return StringUtil.inSorted(element.normalName(), f18146D);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18481c(Reader reader, String str, Parser parser) {
        super.mo18481c(reader, str, parser);
        this.f18150k = C6432a.Initial;
        this.f18151l = null;
        this.f18152m = false;
        this.f18153n = null;
        this.f18154o = null;
        this.f18155p = null;
        this.f18156q = new ArrayList<>();
        this.f18157r = new ArrayList();
        this.f18158s = new Token.C6428g();
        this.f18159t = true;
        this.f18160u = false;
        this.f18161v = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public Element mo18482c0() {
        if (this.f18156q.size() <= 0) {
            return null;
        }
        ArrayList<Element> arrayList = this.f18156q;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo18483d0() {
        this.f18151l = this.f18150k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<Node> mo18484e(String str, Element element, String str2, Parser parser) {
        Element element2;
        C6458b bVar;
        C6459c cVar;
        this.f18150k = C6432a.Initial;
        mo18481c(new StringReader(str), str2, parser);
        this.f18155p = element;
        this.f18161v = true;
        if (element != null) {
            if (element.ownerDocument() != null) {
                this.f18353d.quirksMode(element.ownerDocument().quirksMode());
            }
            String tagName = element.tagName();
            if (StringUtil.m26277in(tagName, "title", "textarea")) {
                bVar = this.f18352c;
                cVar = C6459c.Rcdata;
            } else if (StringUtil.m26277in(tagName, "iframe", "noembed", "noframes", "style", "xmp")) {
                bVar = this.f18352c;
                cVar = C6459c.Rawtext;
            } else if (tagName.equals("script")) {
                bVar = this.f18352c;
                cVar = C6459c.ScriptData;
            } else {
                if (!tagName.equals("noscript")) {
                    boolean equals = tagName.equals("plaintext");
                }
                bVar = this.f18352c;
                cVar = C6459c.Data;
            }
            bVar.mo18659u(cVar);
            element2 = new Element(Tag.valueOf("html", this.f18357h), str2);
            this.f18353d.appendChild(element2);
            this.f18354e.add(element2);
            mo18518w0();
            Elements parents = element.parents();
            parents.add(0, element);
            Iterator it = parents.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Element element3 = (Element) it.next();
                if (element3 instanceof FormElement) {
                    this.f18154o = (FormElement) element3;
                    break;
                }
            }
        } else {
            element2 = null;
        }
        mo18666i();
        return element != null ? element2.childNodes() : this.f18353d.childNodes();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo18485e0(Element element) {
        if (!this.f18152m) {
            String absUrl = element.absUrl("href");
            if (absUrl.length() != 0) {
                this.f18355f = absUrl;
                this.f18152m = true;
                this.f18353d.setBaseUri(absUrl);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo18486f(Token token) {
        this.f18356g = token;
        return this.f18150k.mo18637q(token, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo18487f0() {
        this.f18157r = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public boolean mo18488g0(Element element) {
        return m26424W(this.f18354e, element);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public C6432a mo18489h0() {
        return this.f18151l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public Element mo18490i0() {
        return this.f18354e.remove(this.f18354e.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Element mo18491j(Element element) {
        for (int size = this.f18354e.size() - 1; size >= 0; size--) {
            if (this.f18354e.get(size) == element) {
                return this.f18354e.get(size - 1);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo18492j0(String str) {
        int size = this.f18354e.size() - 1;
        while (size >= 0 && !this.f18354e.get(size).normalName().equals(str)) {
            this.f18354e.remove(size);
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18493k() {
        /*
            r1 = this;
        L_0x0000:
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r1.f18156q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            org.jsoup.nodes.Element r0 = r1.mo18510s0()
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.mo18493k():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo18494k0(String str) {
        int size = this.f18354e.size() - 1;
        while (size >= 0) {
            this.f18354e.remove(size);
            if (!this.f18354e.get(size).normalName().equals(str)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo18495l0(String... strArr) {
        int size = this.f18354e.size() - 1;
        while (size >= 0) {
            this.f18354e.remove(size);
            if (!StringUtil.inSorted(this.f18354e.get(size).normalName(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo18496m() {
        m26426l("tbody", "tfoot", "thead", "template");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public boolean mo18497m0(Token token, C6432a aVar) {
        this.f18356g = token;
        return aVar.mo18637q(token, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo18498n() {
        m26426l("table");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo18499n0(Element element) {
        this.f18354e.add(element);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo18500o() {
        m26426l("tr", "template");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo18501o0(Element element) {
        int size = this.f18156q.size() - 1;
        int i = 0;
        while (true) {
            if (size >= 0) {
                Element element2 = this.f18156q.get(size);
                if (element2 == null) {
                    break;
                }
                if (m26425a0(element, element2)) {
                    i++;
                }
                if (i == 3) {
                    this.f18156q.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.f18156q.add(element);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18502p(C6432a aVar) {
        if (this.f18350a.getErrors().mo18528c()) {
            this.f18350a.getErrors().add(new ParseError(this.f18351b.pos(), "Unexpected token [%s] when in state [%s]", this.f18356g.mo18573o(), aVar));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: p0 */
    void mo18503p0() {
        /*
            r7 = this;
            org.jsoup.nodes.Element r0 = r7.mo18482c0()
            if (r0 == 0) goto L_0x0056
            boolean r1 = r7.mo18488g0(r0)
            if (r1 == 0) goto L_0x000d
            goto L_0x0056
        L_0x000d:
            java.util.ArrayList<org.jsoup.nodes.Element> r1 = r7.f18156q
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = r1
        L_0x0016:
            r4 = 0
            if (r3 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r7.f18156q
            int r3 = r3 + -1
            java.lang.Object r0 = r0.get(r3)
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            if (r0 == 0) goto L_0x002c
            boolean r5 = r7.mo18488g0(r0)
            if (r5 == 0) goto L_0x0016
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r2 != 0) goto L_0x0039
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r7.f18156q
            int r3 = r3 + 1
            java.lang.Object r0 = r0.get(r3)
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
        L_0x0039:
            org.jsoup.helper.Validate.notNull(r0)
            java.lang.String r2 = r0.normalName()
            org.jsoup.nodes.Element r2 = r7.mo18475V(r2)
            org.jsoup.nodes.Attributes r5 = r2.attributes()
            org.jsoup.nodes.Attributes r6 = r0.attributes()
            r5.addAll(r6)
            java.util.ArrayList<org.jsoup.nodes.Element> r5 = r7.f18156q
            r5.set(r3, r2)
            if (r3 != r1) goto L_0x002c
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.mo18503p0():void");
    }

    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo18505q(boolean z) {
        this.f18159t = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo18506q0(Element element) {
        for (int size = this.f18156q.size() - 1; size >= 0; size--) {
            if (this.f18156q.get(size) == element) {
                this.f18156q.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo18507r() {
        return this.f18159t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo18508r0(Element element) {
        for (int size = this.f18354e.size() - 1; size >= 0; size--) {
            if (this.f18354e.get(size) == element) {
                this.f18354e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo18509s() {
        mo18511t((String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public Element mo18510s0() {
        int size = this.f18156q.size();
        if (size > 0) {
            return this.f18156q.remove(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo18511t(String str) {
        while (str != null && !mo18662a().normalName().equals(str) && StringUtil.inSorted(mo18662a().normalName(), f18145C)) {
            mo18490i0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo18512t0(Element element, Element element2) {
        m26427u0(this.f18156q, element, element2);
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f18356g + ", state=" + this.f18150k + ", currentElement=" + mo18662a() + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Element mo18514u(String str) {
        for (int size = this.f18156q.size() - 1; size >= 0; size--) {
            Element element = this.f18156q.get(size);
            if (element == null) {
                return null;
            }
            if (element.normalName().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public String mo18515v() {
        return this.f18355f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo18516v0(Element element, Element element2) {
        m26427u0(this.f18354e, element, element2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Document mo18517w() {
        return this.f18353d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo18518w0() {
        C6432a aVar;
        int size = this.f18354e.size() - 1;
        boolean z = false;
        while (size >= 0) {
            Element element = this.f18354e.get(size);
            if (size == 0) {
                element = this.f18155p;
                z = true;
            }
            String normalName = element.normalName();
            if ("select".equals(normalName)) {
                aVar = C6432a.InSelect;
            } else if ("td".equals(normalName) || ("th".equals(normalName) && !z)) {
                aVar = C6432a.InCell;
            } else if ("tr".equals(normalName)) {
                aVar = C6432a.InRow;
            } else if ("tbody".equals(normalName) || "thead".equals(normalName) || "tfoot".equals(normalName)) {
                aVar = C6432a.InTableBody;
            } else if ("caption".equals(normalName)) {
                aVar = C6432a.InCaption;
            } else if ("colgroup".equals(normalName)) {
                aVar = C6432a.InColumnGroup;
            } else if ("table".equals(normalName)) {
                aVar = C6432a.InTable;
            } else {
                if (!"head".equals(normalName) && !"body".equals(normalName)) {
                    if ("frameset".equals(normalName)) {
                        aVar = C6432a.InFrameset;
                    } else if ("html".equals(normalName)) {
                        aVar = C6432a.BeforeHead;
                    } else if (!z) {
                        size--;
                    }
                }
                aVar = C6432a.InBody;
            }
            mo18458B0(aVar);
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public FormElement mo18519x() {
        return this.f18154o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo18520x0(FormElement formElement) {
        this.f18154o = formElement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public Element mo18521y(String str) {
        for (int size = this.f18354e.size() - 1; size >= 0; size--) {
            Element element = this.f18354e.get(size);
            if (element.normalName().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo18522y0(boolean z) {
        this.f18160u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Element mo18523z() {
        return this.f18153n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo18524z0(Element element) {
        this.f18153n = element;
    }
}
