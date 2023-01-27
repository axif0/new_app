package org.jsoup.select;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

public abstract class Evaluator {

    public static final class AllElements extends Evaluator {
        public boolean matches(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class Attribute extends Evaluator {

        /* renamed from: a */
        private String f18379a;

        public Attribute(String str) {
            this.f18379a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f18379a);
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.f18379a});
        }
    }

    public static abstract class AttributeKeyPair extends Evaluator {

        /* renamed from: a */
        String f18380a;

        /* renamed from: b */
        String f18381b;

        public AttributeKeyPair(String str, String str2) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            this.f18380a = Normalizer.normalize(str);
            if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            this.f18381b = Normalizer.normalize(str2);
        }
    }

    public static final class AttributeStarting extends Evaluator {

        /* renamed from: a */
        private String f18382a;

        public AttributeStarting(String str) {
            Validate.notEmpty(str);
            this.f18382a = Normalizer.lowerCase(str);
        }

        public boolean matches(Element element, Element element2) {
            for (org.jsoup.nodes.Attribute key : element2.attributes().asList()) {
                if (Normalizer.lowerCase(key.getKey()).startsWith(this.f18382a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", new Object[]{this.f18382a});
        }
    }

    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f18380a) && this.f18381b.equalsIgnoreCase(element2.attr(this.f18380a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", new Object[]{this.f18380a, this.f18381b});
        }
    }

    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f18380a) && Normalizer.lowerCase(element2.attr(this.f18380a)).contains(this.f18381b);
        }

        public String toString() {
            return String.format("[%s*=%s]", new Object[]{this.f18380a, this.f18381b});
        }
    }

    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f18380a) && Normalizer.lowerCase(element2.attr(this.f18380a)).endsWith(this.f18381b);
        }

        public String toString() {
            return String.format("[%s$=%s]", new Object[]{this.f18380a, this.f18381b});
        }
    }

    public static final class AttributeWithValueMatching extends Evaluator {

        /* renamed from: a */
        String f18383a;

        /* renamed from: b */
        Pattern f18384b;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.f18383a = Normalizer.normalize(str);
            this.f18384b = pattern;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f18383a) && this.f18384b.matcher(element2.attr(this.f18383a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", new Object[]{this.f18383a, this.f18384b.toString()});
        }
    }

    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return !this.f18381b.equalsIgnoreCase(element2.attr(this.f18380a));
        }

        public String toString() {
            return String.format("[%s!=%s]", new Object[]{this.f18380a, this.f18381b});
        }
    }

    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f18380a) && Normalizer.lowerCase(element2.attr(this.f18380a)).startsWith(this.f18381b);
        }

        public String toString() {
            return String.format("[%s^=%s]", new Object[]{this.f18380a, this.f18381b});
        }
    }

    public static final class Class extends Evaluator {

        /* renamed from: a */
        private String f18385a;

        public Class(String str) {
            this.f18385a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasClass(this.f18385a);
        }

        public String toString() {
            return String.format(".%s", new Object[]{this.f18385a});
        }
    }

    public static final class ContainsData extends Evaluator {

        /* renamed from: a */
        private String f18386a;

        public ContainsData(String str) {
            this.f18386a = Normalizer.lowerCase(str);
        }

        public boolean matches(Element element, Element element2) {
            return Normalizer.lowerCase(element2.data()).contains(this.f18386a);
        }

        public String toString() {
            return String.format(":containsData(%s)", new Object[]{this.f18386a});
        }
    }

    public static final class ContainsOwnText extends Evaluator {

        /* renamed from: a */
        private String f18387a;

        public ContainsOwnText(String str) {
            this.f18387a = Normalizer.lowerCase(str);
        }

        public boolean matches(Element element, Element element2) {
            return Normalizer.lowerCase(element2.ownText()).contains(this.f18387a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", new Object[]{this.f18387a});
        }
    }

    public static final class ContainsText extends Evaluator {

        /* renamed from: a */
        private String f18388a;

        public ContainsText(String str) {
            this.f18388a = Normalizer.lowerCase(str);
        }

        public boolean matches(Element element, Element element2) {
            return Normalizer.lowerCase(element2.text()).contains(this.f18388a);
        }

        public String toString() {
            return String.format(":contains(%s)", new Object[]{this.f18388a});
        }
    }

    public static abstract class CssNthEvaluator extends Evaluator {

        /* renamed from: a */
        protected final int f18389a;

        /* renamed from: b */
        protected final int f18390b;

        public CssNthEvaluator(int i) {
            this(0, i);
        }

        public CssNthEvaluator(int i, int i2) {
            this.f18389a = i;
            this.f18390b = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo18747a(Element element, Element element2);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo18748b();

        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            int a = mo18747a(element, element2);
            int i = this.f18389a;
            if (i == 0) {
                return a == this.f18390b;
            }
            int i2 = this.f18390b;
            return (a - i2) * i >= 0 && (a - i2) % i == 0;
        }

        public String toString() {
            if (this.f18389a == 0) {
                return String.format(":%s(%d)", new Object[]{mo18748b(), Integer.valueOf(this.f18390b)});
            } else if (this.f18390b == 0) {
                return String.format(":%s(%dn)", new Object[]{mo18748b(), Integer.valueOf(this.f18389a)});
            } else {
                return String.format(":%s(%dn%+d)", new Object[]{mo18748b(), Integer.valueOf(this.f18389a), Integer.valueOf(this.f18390b)});
            }
        }
    }

    /* renamed from: org.jsoup.select.Evaluator$Id */
    public static final class C6538Id extends Evaluator {

        /* renamed from: a */
        private String f18391a;

        public C6538Id(String str) {
            this.f18391a = str;
        }

        public boolean matches(Element element, Element element2) {
            return this.f18391a.equals(element2.mo18342id());
        }

        public String toString() {
            return String.format("#%s", new Object[]{this.f18391a});
        }
    }

    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex() == this.f18392a;
        }

        public String toString() {
            return String.format(":eq(%d)", new Object[]{Integer.valueOf(this.f18392a)});
        }
    }

    public static abstract class IndexEvaluator extends Evaluator {

        /* renamed from: a */
        int f18392a;

        public IndexEvaluator(int i) {
            this.f18392a = i;
        }
    }

    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex() > this.f18392a;
        }

        public String toString() {
            return String.format(":gt(%d)", new Object[]{Integer.valueOf(this.f18392a)});
        }
    }

    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element != element2 && element2.elementSiblingIndex() < this.f18392a;
        }

        public String toString() {
            return String.format(":lt(%d)", new Object[]{Integer.valueOf(this.f18392a)});
        }
    }

    public static final class IsEmpty extends Evaluator {
        public boolean matches(Element element, Element element2) {
            for (Node next : element2.childNodes()) {
                if (!(next instanceof Comment) && !(next instanceof XmlDeclaration) && !(next instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class IsFirstChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.elementSiblingIndex() == 0;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class IsLastChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.elementSiblingIndex() == parent.children().size() - 1;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        public String toString() {
            return ":last-of-type";
        }
    }

    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo18747a(Element element, Element element2) {
            return element2.elementSiblingIndex() + 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo18748b() {
            return "nth-child";
        }
    }

    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo18747a(Element element, Element element2) {
            return element2.parent().children().size() - element2.elementSiblingIndex();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo18748b() {
            return "nth-last-child";
        }
    }

    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo18747a(Element element, Element element2) {
            Elements children = element2.parent().children();
            int i = 0;
            for (int elementSiblingIndex = element2.elementSiblingIndex(); elementSiblingIndex < children.size(); elementSiblingIndex++) {
                if (((Element) children.get(elementSiblingIndex)).tag().equals(element2.tag())) {
                    i++;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo18748b() {
            return "nth-last-of-type";
        }
    }

    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo18747a(Element element, Element element2) {
            Iterator it = element2.parent().children().iterator();
            int i = 0;
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                if (element3.tag().equals(element2.tag())) {
                    i++;
                    continue;
                }
                if (element3 == element2) {
                    break;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo18748b() {
            return "nth-of-type";
        }
    }

    public static final class IsOnlyChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.siblingElements().size() == 0;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class IsOnlyOfType extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            Iterator it = parent.children().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((Element) it.next()).tag().equals(element2.tag())) {
                    i++;
                }
            }
            return i == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class IsRoot extends Evaluator {
        public boolean matches(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.child(0);
            }
            return element2 == element;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class MatchText extends Evaluator {
        public boolean matches(Element element, Element element2) {
            if (element2 instanceof PseudoTextElement) {
                return true;
            }
            for (TextNode next : element2.textNodes()) {
                PseudoTextElement pseudoTextElement = new PseudoTextElement(org.jsoup.parser.Tag.valueOf(element2.tagName()), element2.baseUri(), element2.attributes());
                next.replaceWith(pseudoTextElement);
                pseudoTextElement.appendChild(next);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    public static final class Matches extends Evaluator {

        /* renamed from: a */
        private Pattern f18393a;

        public Matches(Pattern pattern) {
            this.f18393a = pattern;
        }

        public boolean matches(Element element, Element element2) {
            return this.f18393a.matcher(element2.text()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", new Object[]{this.f18393a});
        }
    }

    public static final class MatchesOwn extends Evaluator {

        /* renamed from: a */
        private Pattern f18394a;

        public MatchesOwn(Pattern pattern) {
            this.f18394a = pattern;
        }

        public boolean matches(Element element, Element element2) {
            return this.f18394a.matcher(element2.ownText()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", new Object[]{this.f18394a});
        }
    }

    public static final class Tag extends Evaluator {

        /* renamed from: a */
        private String f18395a;

        public Tag(String str) {
            this.f18395a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.tagName().equalsIgnoreCase(this.f18395a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f18395a});
        }
    }

    public static final class TagEndsWith extends Evaluator {

        /* renamed from: a */
        private String f18396a;

        public TagEndsWith(String str) {
            this.f18396a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.tagName().endsWith(this.f18396a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f18396a});
        }
    }

    protected Evaluator() {
    }

    public abstract boolean matches(Element element, Element element2);
}
