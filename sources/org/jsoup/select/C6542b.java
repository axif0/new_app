package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.nodes.Element;

/* renamed from: org.jsoup.select.b */
abstract class C6542b extends Evaluator {

    /* renamed from: a */
    Evaluator f18408a;

    /* renamed from: org.jsoup.select.b$a */
    static class C6543a extends C6542b {
        public C6543a(Evaluator evaluator) {
            this.f18408a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            Iterator it = element2.getAllElements().iterator();
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                if (element3 != element2 && this.f18408a.matches(element, element3)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", new Object[]{this.f18408a});
        }
    }

    /* renamed from: org.jsoup.select.b$b */
    static class C6544b extends C6542b {
        public C6544b(Evaluator evaluator) {
            this.f18408a = evaluator;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.parent();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean matches(org.jsoup.nodes.Element r3, org.jsoup.nodes.Element r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                org.jsoup.nodes.Element r4 = r4.parent()
                if (r4 == 0) goto L_0x0013
                org.jsoup.select.Evaluator r1 = r2.f18408a
                boolean r3 = r1.matches(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.C6542b.C6544b.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element):boolean");
        }

        public String toString() {
            return String.format(":ImmediateParent%s", new Object[]{this.f18408a});
        }
    }

    /* renamed from: org.jsoup.select.b$c */
    static class C6545c extends C6542b {
        public C6545c(Evaluator evaluator) {
            this.f18408a = evaluator;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.previousElementSibling();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean matches(org.jsoup.nodes.Element r3, org.jsoup.nodes.Element r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                org.jsoup.nodes.Element r4 = r4.previousElementSibling()
                if (r4 == 0) goto L_0x0013
                org.jsoup.select.Evaluator r1 = r2.f18408a
                boolean r3 = r1.matches(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.C6542b.C6545c.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element):boolean");
        }

        public String toString() {
            return String.format(":prev%s", new Object[]{this.f18408a});
        }
    }

    /* renamed from: org.jsoup.select.b$d */
    static class C6546d extends C6542b {
        public C6546d(Evaluator evaluator) {
            this.f18408a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            return !this.f18408a.matches(element, element2);
        }

        public String toString() {
            return String.format(":not%s", new Object[]{this.f18408a});
        }
    }

    /* renamed from: org.jsoup.select.b$e */
    static class C6547e extends C6542b {
        public C6547e(Evaluator evaluator) {
            this.f18408a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            do {
                element2 = element2.parent();
                if (this.f18408a.matches(element, element2)) {
                    return true;
                }
            } while (element2 != element);
            return false;
        }

        public String toString() {
            return String.format(":parent%s", new Object[]{this.f18408a});
        }
    }

    /* renamed from: org.jsoup.select.b$f */
    static class C6548f extends C6542b {
        public C6548f(Evaluator evaluator) {
            this.f18408a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            do {
                element2 = element2.previousElementSibling();
                if (element2 == null) {
                    return false;
                }
            } while (!this.f18408a.matches(element, element2));
            return true;
        }

        public String toString() {
            return String.format(":prev*%s", new Object[]{this.f18408a});
        }
    }

    /* renamed from: org.jsoup.select.b$g */
    static class C6549g extends Evaluator {
        C6549g() {
        }

        public boolean matches(Element element, Element element2) {
            return element == element2;
        }
    }

    C6542b() {
    }
}
