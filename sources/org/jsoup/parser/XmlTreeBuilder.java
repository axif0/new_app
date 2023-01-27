package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;

public class XmlTreeBuilder extends C6527d {

    /* renamed from: org.jsoup.parser.XmlTreeBuilder$a */
    static /* synthetic */ class C6431a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18210a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.jsoup.parser.Token$TokenType[] r0 = org.jsoup.parser.Token.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18210a = r0
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.StartTag     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18210a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EndTag     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18210a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Comment     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18210a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Character     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18210a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Doctype     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18210a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.XmlTreeBuilder.C6431a.<clinit>():void");
        }
    }

    /* renamed from: n */
    private void m26550n(Node node) {
        mo18662a().appendChild(node);
    }

    /* renamed from: p */
    private void m26551p(Token.C6428g gVar) {
        Element element;
        String normalizeTag = this.f18357h.normalizeTag(gVar.f18199b);
        int size = this.f18354e.size() - 1;
        while (true) {
            if (size < 0) {
                element = null;
                break;
            }
            element = this.f18354e.get(size);
            if (element.nodeName().equals(normalizeTag)) {
                break;
            }
            size--;
        }
        if (element != null) {
            int size2 = this.f18354e.size() - 1;
            while (size2 >= 0) {
                Element element2 = this.f18354e.get(size2);
                this.f18354e.remove(size2);
                if (element2 != element) {
                    size2--;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ParseSettings mo18479b() {
        return ParseSettings.preserveCase;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18481c(Reader reader, String str, Parser parser) {
        super.mo18481c(reader, str, parser);
        this.f18354e.add(this.f18353d);
        this.f18353d.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<Node> mo18484e(String str, Element element, String str2, Parser parser) {
        return mo18636o(str, str2, parser);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo18486f(Token token) {
        switch (C6431a.f18210a[token.f18189a.ordinal()]) {
            case 1:
                mo18632j(token.mo18564e());
                return true;
            case 2:
                m26551p(token.mo18563d());
                return true;
            case 3:
                mo18634l(token.mo18561b());
                return true;
            case 4:
                mo18633k(token.mo18560a());
                return true;
            case 5:
                mo18635m(token.mo18562c());
                return true;
            case 6:
                return true;
            default:
                Validate.fail("Unexpected token type: " + token.f18189a);
                return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Element mo18632j(Token.C6429h hVar) {
        Tag valueOf = Tag.valueOf(hVar.mo18588A(), this.f18357h);
        String str = this.f18355f;
        ParseSettings parseSettings = this.f18357h;
        Attributes attributes = hVar.f18207j;
        parseSettings.mo18530a(attributes);
        Element element = new Element(valueOf, str, attributes);
        m26550n(element);
        if (!hVar.mo18602z()) {
            this.f18354e.add(element);
        } else if (!valueOf.isKnownTag()) {
            valueOf.mo18543b();
        }
        return element;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo18633k(Token.C6424c cVar) {
        String q = cVar.mo18576q();
        m26550n(cVar.mo18565f() ? new CDataNode(q) : new TextNode(q));
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [org.jsoup.nodes.XmlDeclaration] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18634l(org.jsoup.parser.Token.C6425d r3) {
        /*
            r2 = this;
            org.jsoup.nodes.Comment r0 = new org.jsoup.nodes.Comment
            java.lang.String r1 = r3.mo18577p()
            r0.<init>(r1)
            boolean r3 = r3.f18193c
            if (r3 == 0) goto L_0x001a
            boolean r3 = r0.isXmlDeclaration()
            if (r3 == 0) goto L_0x001a
            org.jsoup.nodes.XmlDeclaration r3 = r0.asXmlDeclaration()
            if (r3 == 0) goto L_0x001a
            r0 = r3
        L_0x001a:
            r2.m26550n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.XmlTreeBuilder.mo18634l(org.jsoup.parser.Token$d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo18635m(Token.C6426e eVar) {
        DocumentType documentType = new DocumentType(this.f18357h.normalizeTag(eVar.mo18579p()), eVar.mo18581r(), eVar.mo18582s());
        documentType.setPubSysKey(eVar.mo18580q());
        m26550n(documentType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public List<Node> mo18636o(String str, String str2, Parser parser) {
        mo18481c(new StringReader(str), str2, parser);
        mo18666i();
        return this.f18353d.childNodes();
    }

    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }
}
