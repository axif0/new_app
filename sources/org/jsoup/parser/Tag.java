package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class Tag {

    /* renamed from: k */
    private static final Map<String, Tag> f18171k = new HashMap();

    /* renamed from: l */
    private static final String[] f18172l;

    /* renamed from: m */
    private static final String[] f18173m = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};

    /* renamed from: n */
    private static final String[] f18174n = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: o */
    private static final String[] f18175o = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: p */
    private static final String[] f18176p = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: q */
    private static final String[] f18177q = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: r */
    private static final String[] f18178r = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: a */
    private String f18179a;

    /* renamed from: b */
    private String f18180b;

    /* renamed from: c */
    private boolean f18181c = true;

    /* renamed from: d */
    private boolean f18182d = true;

    /* renamed from: e */
    private boolean f18183e = true;

    /* renamed from: f */
    private boolean f18184f = false;

    /* renamed from: g */
    private boolean f18185g = false;

    /* renamed from: h */
    private boolean f18186h = false;

    /* renamed from: i */
    private boolean f18187i = false;

    /* renamed from: j */
    private boolean f18188j = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center"};
        f18172l = strArr;
        for (String tag : strArr) {
            m26499a(new Tag(tag));
        }
        for (String tag2 : f18173m) {
            Tag tag3 = new Tag(tag2);
            tag3.f18181c = false;
            tag3.f18182d = false;
            m26499a(tag3);
        }
        for (String str : f18174n) {
            Tag tag4 = f18171k.get(str);
            Validate.notNull(tag4);
            tag4.f18183e = false;
            tag4.f18184f = true;
        }
        for (String str2 : f18175o) {
            Tag tag5 = f18171k.get(str2);
            Validate.notNull(tag5);
            tag5.f18182d = false;
        }
        for (String str3 : f18176p) {
            Tag tag6 = f18171k.get(str3);
            Validate.notNull(tag6);
            tag6.f18186h = true;
        }
        for (String str4 : f18177q) {
            Tag tag7 = f18171k.get(str4);
            Validate.notNull(tag7);
            tag7.f18187i = true;
        }
        for (String str5 : f18178r) {
            Tag tag8 = f18171k.get(str5);
            Validate.notNull(tag8);
            tag8.f18188j = true;
        }
    }

    private Tag(String str) {
        this.f18179a = str;
        this.f18180b = Normalizer.lowerCase(str);
    }

    /* renamed from: a */
    private static void m26499a(Tag tag) {
        f18171k.put(tag.f18179a, tag);
    }

    public static boolean isKnownTag(String str) {
        return f18171k.containsKey(str);
    }

    public static Tag valueOf(String str) {
        return valueOf(str, ParseSettings.preserveCase);
    }

    public static Tag valueOf(String str, ParseSettings parseSettings) {
        Validate.notNull(str);
        Tag tag = f18171k.get(str);
        if (tag != null) {
            return tag;
        }
        String normalizeTag = parseSettings.normalizeTag(str);
        Validate.notEmpty(normalizeTag);
        Tag tag2 = f18171k.get(normalizeTag);
        if (tag2 != null) {
            return tag2;
        }
        Tag tag3 = new Tag(normalizeTag);
        tag3.f18181c = false;
        return tag3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Tag mo18543b() {
        this.f18185g = true;
        return this;
    }

    public boolean canContainBlock() {
        return this.f18181c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.f18179a.equals(tag.f18179a) && this.f18183e == tag.f18183e && this.f18184f == tag.f18184f && this.f18182d == tag.f18182d && this.f18181c == tag.f18181c && this.f18186h == tag.f18186h && this.f18185g == tag.f18185g && this.f18187i == tag.f18187i && this.f18188j == tag.f18188j;
    }

    public boolean formatAsBlock() {
        return this.f18182d;
    }

    public String getName() {
        return this.f18179a;
    }

    public int hashCode() {
        return (((((((((((((((this.f18179a.hashCode() * 31) + (this.f18181c ? 1 : 0)) * 31) + (this.f18182d ? 1 : 0)) * 31) + (this.f18183e ? 1 : 0)) * 31) + (this.f18184f ? 1 : 0)) * 31) + (this.f18185g ? 1 : 0)) * 31) + (this.f18186h ? 1 : 0)) * 31) + (this.f18187i ? 1 : 0)) * 31) + (this.f18188j ? 1 : 0);
    }

    public boolean isBlock() {
        return this.f18181c;
    }

    public boolean isData() {
        return !this.f18183e && !isEmpty();
    }

    public boolean isEmpty() {
        return this.f18184f;
    }

    public boolean isFormListed() {
        return this.f18187i;
    }

    public boolean isFormSubmittable() {
        return this.f18188j;
    }

    public boolean isInline() {
        return !this.f18181c;
    }

    public boolean isKnownTag() {
        return f18171k.containsKey(this.f18179a);
    }

    public boolean isSelfClosing() {
        return this.f18184f || this.f18185g;
    }

    public String normalName() {
        return this.f18180b;
    }

    public boolean preserveWhitespace() {
        return this.f18186h;
    }

    public String toString() {
        return this.f18179a;
    }
}
