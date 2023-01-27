package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.d */
abstract class C6527d {

    /* renamed from: a */
    protected Parser f18350a;

    /* renamed from: b */
    CharacterReader f18351b;

    /* renamed from: c */
    C6458b f18352c;

    /* renamed from: d */
    protected Document f18353d;

    /* renamed from: e */
    protected ArrayList<Element> f18354e;

    /* renamed from: f */
    protected String f18355f;

    /* renamed from: g */
    protected Token f18356g;

    /* renamed from: h */
    protected ParseSettings f18357h;

    /* renamed from: i */
    private Token.C6429h f18358i = new Token.C6429h();

    /* renamed from: j */
    private Token.C6428g f18359j = new Token.C6428g();

    C6527d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Element mo18662a() {
        int size = this.f18354e.size();
        if (size > 0) {
            return this.f18354e.get(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract ParseSettings mo18479b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18481c(Reader reader, String str, Parser parser) {
        Validate.notNull(reader, "String input must not be null");
        Validate.notNull(str, "BaseURI must not be null");
        Document document = new Document(str);
        this.f18353d = document;
        document.parser(parser);
        this.f18350a = parser;
        this.f18357h = parser.settings();
        this.f18351b = new CharacterReader(reader);
        this.f18356g = null;
        this.f18352c = new C6458b(this.f18351b, parser.getErrors());
        this.f18354e = new ArrayList<>(32);
        this.f18355f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Document mo18663d(Reader reader, String str, Parser parser) {
        mo18481c(reader, str, parser);
        mo18666i();
        return this.f18353d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract List<Node> mo18484e(String str, Element element, String str2, Parser parser);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo18486f(Token token);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo18664g(String str) {
        Token token = this.f18356g;
        Token.C6428g gVar = this.f18359j;
        if (token == gVar) {
            Token.C6428g gVar2 = new Token.C6428g();
            gVar2.mo18589B(str);
            return mo18486f(gVar2);
        }
        gVar.mo18572m();
        gVar.mo18589B(str);
        return mo18486f(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo18665h(String str) {
        Token token = this.f18356g;
        Token.C6429h hVar = this.f18358i;
        if (token == hVar) {
            Token.C6429h hVar2 = new Token.C6429h();
            hVar2.mo18589B(str);
            return mo18486f(hVar2);
        }
        hVar.mo18585E();
        hVar.mo18589B(str);
        return mo18486f(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo18666i() {
        Token t;
        do {
            t = this.f18352c.mo18658t();
            mo18486f(t);
            t.mo18572m();
        } while (t.f18189a != Token.TokenType.EOF);
    }

    public boolean processStartTag(String str, Attributes attributes) {
        Token token = this.f18356g;
        Token.C6429h hVar = this.f18358i;
        if (token == hVar) {
            Token.C6429h hVar2 = new Token.C6429h();
            hVar2.mo18586G(str, attributes);
            return mo18486f(hVar2);
        }
        hVar.mo18585E();
        this.f18358i.mo18586G(str, attributes);
        return mo18486f(this.f18358i);
    }
}
