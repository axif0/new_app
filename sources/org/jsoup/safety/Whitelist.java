package org.jsoup.safety;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class Whitelist {

    /* renamed from: a */
    private Set<C6534d> f18367a = new HashSet();

    /* renamed from: b */
    private Map<C6534d, Set<C6531a>> f18368b = new HashMap();

    /* renamed from: c */
    private Map<C6534d, Map<C6531a, C6532b>> f18369c = new HashMap();

    /* renamed from: d */
    private Map<C6534d, Map<C6531a, Set<C6533c>>> f18370d = new HashMap();

    /* renamed from: e */
    private boolean f18371e = false;

    /* renamed from: org.jsoup.safety.Whitelist$a */
    static class C6531a extends C6535e {
        C6531a(String str) {
            super(str);
        }

        /* renamed from: a */
        static C6531a m26729a(String str) {
            return new C6531a(str);
        }
    }

    /* renamed from: org.jsoup.safety.Whitelist$b */
    static class C6532b extends C6535e {
        C6532b(String str) {
            super(str);
        }

        /* renamed from: a */
        static C6532b m26730a(String str) {
            return new C6532b(str);
        }
    }

    /* renamed from: org.jsoup.safety.Whitelist$c */
    static class C6533c extends C6535e {
        C6533c(String str) {
            super(str);
        }

        /* renamed from: a */
        static C6533c m26731a(String str) {
            return new C6533c(str);
        }
    }

    /* renamed from: org.jsoup.safety.Whitelist$d */
    static class C6534d extends C6535e {
        C6534d(String str) {
            super(str);
        }

        /* renamed from: a */
        static C6534d m26732a(String str) {
            return new C6534d(str);
        }
    }

    /* renamed from: org.jsoup.safety.Whitelist$e */
    static abstract class C6535e {

        /* renamed from: a */
        private String f18372a;

        C6535e(String str) {
            Validate.notNull(str);
            this.f18372a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.f18372a;
            String str2 = ((C6535e) obj).f18372a;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            String str = this.f18372a;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f18372a;
        }
    }

    public static Whitelist basic() {
        return new Whitelist().addTags("a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul").addAttributes("a", "href").addAttributes("blockquote", "cite").addAttributes("q", "cite").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addEnforcedAttribute("a", "rel", "nofollow");
    }

    public static Whitelist basicWithImages() {
        return basic().addTags("img").addAttributes("img", "align", "alt", "height", "src", "title", "width").addProtocols("img", "src", "http", "https");
    }

    /* renamed from: d */
    private boolean m26724d(String str) {
        return str.startsWith("#") && !str.matches(".*\\s.*");
    }

    /* renamed from: e */
    private boolean m26725e(Element element, Attribute attribute, Set<C6533c> set) {
        String absUrl = element.absUrl(attribute.getKey());
        if (absUrl.length() == 0) {
            absUrl = attribute.getValue();
        }
        if (!this.f18371e) {
            attribute.setValue(absUrl);
        }
        for (C6533c eVar : set) {
            String eVar2 = eVar.toString();
            if (!eVar2.equals("#")) {
                if (Normalizer.lowerCase(absUrl).startsWith(eVar2 + ":")) {
                    return true;
                }
            } else if (m26724d(absUrl)) {
                return true;
            }
        }
        return false;
    }

    public static Whitelist none() {
        return new Whitelist();
    }

    public static Whitelist relaxed() {
        return new Whitelist().addTags("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").addAttributes("a", "href", "title").addAttributes("blockquote", "cite").addAttributes("col", "span", "width").addAttributes("colgroup", "span", "width").addAttributes("img", "align", "alt", "height", "src", "title", "width").addAttributes("ol", "start", "type").addAttributes("q", "cite").addAttributes("table", "summary", "width").addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width").addAttributes("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").addAttributes("ul", "type").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addProtocols("img", "src", "http", "https").addProtocols("q", "cite", "http", "https");
    }

    public static Whitelist simpleText() {
        return new Whitelist().addTags("b", "em", "i", "strong", "u");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Attributes mo18670a(String str) {
        Attributes attributes = new Attributes();
        C6534d a = C6534d.m26732a(str);
        if (this.f18369c.containsKey(a)) {
            for (Map.Entry entry : this.f18369c.get(a).entrySet()) {
                attributes.put(((C6531a) entry.getKey()).toString(), ((C6532b) entry.getValue()).toString());
            }
        }
        return attributes;
    }

    public Whitelist addAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attribute names supplied.");
        C6534d a = C6534d.m26732a(str);
        this.f18367a.add(a);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(C6531a.m26729a(str2));
        }
        if (this.f18368b.containsKey(a)) {
            this.f18368b.get(a).addAll(hashSet);
        } else {
            this.f18368b.put(a, hashSet);
        }
        return this;
    }

    public Whitelist addEnforcedAttribute(String str, String str2, String str3) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notEmpty(str3);
        C6534d a = C6534d.m26732a(str);
        this.f18367a.add(a);
        C6531a a2 = C6531a.m26729a(str2);
        C6532b a3 = C6532b.m26730a(str3);
        if (this.f18369c.containsKey(a)) {
            this.f18369c.get(a).put(a2, a3);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(a2, a3);
            this.f18369c.put(a, hashMap);
        }
        return this;
    }

    public Whitelist addProtocols(String str, String str2, String... strArr) {
        Map map;
        Set set;
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        C6534d a = C6534d.m26732a(str);
        C6531a a2 = C6531a.m26729a(str2);
        if (this.f18370d.containsKey(a)) {
            map = this.f18370d.get(a);
        } else {
            HashMap hashMap = new HashMap();
            this.f18370d.put(a, hashMap);
            map = hashMap;
        }
        if (map.containsKey(a2)) {
            set = (Set) map.get(a2);
        } else {
            HashSet hashSet = new HashSet();
            map.put(a2, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            set.add(C6533c.m26731a(str3));
        }
        return this;
    }

    public Whitelist addTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            this.f18367a.add(C6534d.m26732a(str));
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18675b(String str, Element element, Attribute attribute) {
        C6534d a = C6534d.m26732a(str);
        C6531a a2 = C6531a.m26729a(attribute.getKey());
        Set set = this.f18368b.get(a);
        if (set == null || !set.contains(a2)) {
            if (this.f18369c.get(a) != null) {
                Attributes a3 = mo18670a(str);
                String key = attribute.getKey();
                if (a3.hasKeyIgnoreCase(key)) {
                    return a3.getIgnoreCase(key).equals(attribute.getValue());
                }
            }
            return !str.equals(":all") && mo18675b(":all", element, attribute);
        } else if (!this.f18370d.containsKey(a)) {
            return true;
        } else {
            Map map = this.f18370d.get(a);
            return !map.containsKey(a2) || m26725e(element, attribute, (Set) map.get(a2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo18676c(String str) {
        return this.f18367a.contains(C6534d.m26732a(str));
    }

    public Whitelist preserveRelativeLinks(boolean z) {
        this.f18371e = z;
        return this;
    }

    public Whitelist removeAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attribute names supplied.");
        C6534d a = C6534d.m26732a(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(C6531a.m26729a(str2));
        }
        if (this.f18367a.contains(a) && this.f18368b.containsKey(a)) {
            Set set = this.f18368b.get(a);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.f18368b.remove(a);
            }
        }
        if (str.equals(":all")) {
            for (C6534d next : this.f18368b.keySet()) {
                Set set2 = this.f18368b.get(next);
                set2.removeAll(hashSet);
                if (set2.isEmpty()) {
                    this.f18368b.remove(next);
                }
            }
        }
        return this;
    }

    public Whitelist removeEnforcedAttribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        C6534d a = C6534d.m26732a(str);
        if (this.f18367a.contains(a) && this.f18369c.containsKey(a)) {
            C6531a a2 = C6531a.m26729a(str2);
            Map map = this.f18369c.get(a);
            map.remove(a2);
            if (map.isEmpty()) {
                this.f18369c.remove(a);
            }
        }
        return this;
    }

    public Whitelist removeProtocols(String str, String str2, String... strArr) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        C6534d a = C6534d.m26732a(str);
        C6531a a2 = C6531a.m26729a(str2);
        Validate.isTrue(this.f18370d.containsKey(a), "Cannot remove a protocol that is not set.");
        Map map = this.f18370d.get(a);
        Validate.isTrue(map.containsKey(a2), "Cannot remove a protocol that is not set.");
        Set set = (Set) map.get(a2);
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            set.remove(C6533c.m26731a(str3));
        }
        if (set.isEmpty()) {
            map.remove(a2);
            if (map.isEmpty()) {
                this.f18370d.remove(a);
            }
        }
        return this;
    }

    public Whitelist removeTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            C6534d a = C6534d.m26732a(str);
            if (this.f18367a.remove(a)) {
                this.f18368b.remove(a);
                this.f18369c.remove(a);
                this.f18370d.remove(a);
            }
        }
        return this;
    }
}
