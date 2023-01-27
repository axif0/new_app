package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

/* renamed from: org.jsoup.select.a */
abstract class C6539a extends Evaluator {

    /* renamed from: a */
    final ArrayList<Evaluator> f18406a;

    /* renamed from: b */
    int f18407b;

    /* renamed from: org.jsoup.select.a$a */
    static final class C6540a extends C6539a {
        C6540a(Collection<Evaluator> collection) {
            super(collection);
        }

        C6540a(Evaluator... evaluatorArr) {
            this((Collection<Evaluator>) Arrays.asList(evaluatorArr));
        }

        public boolean matches(Element element, Element element2) {
            for (int i = 0; i < this.f18407b; i++) {
                if (!this.f18406a.get(i).matches(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.join((Collection) this.f18406a, " ");
        }
    }

    /* renamed from: org.jsoup.select.a$b */
    static final class C6541b extends C6539a {
        C6541b() {
        }

        C6541b(Collection<Evaluator> collection) {
            if (this.f18407b > 1) {
                this.f18406a.add(new C6540a(collection));
            } else {
                this.f18406a.addAll(collection);
            }
            mo18769c();
        }

        C6541b(Evaluator... evaluatorArr) {
            this((Collection<Evaluator>) Arrays.asList(evaluatorArr));
        }

        /* renamed from: d */
        public void mo18771d(Evaluator evaluator) {
            this.f18406a.add(evaluator);
            mo18769c();
        }

        public boolean matches(Element element, Element element2) {
            for (int i = 0; i < this.f18407b; i++) {
                if (this.f18406a.get(i).matches(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return StringUtil.join((Collection) this.f18406a, ", ");
        }
    }

    C6539a() {
        this.f18407b = 0;
        this.f18406a = new ArrayList<>();
    }

    C6539a(Collection<Evaluator> collection) {
        this();
        this.f18406a.addAll(collection);
        mo18769c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18767a(Evaluator evaluator) {
        this.f18406a.set(this.f18407b - 1, evaluator);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Evaluator mo18768b() {
        int i = this.f18407b;
        if (i > 0) {
            return this.f18406a.get(i - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18769c() {
        this.f18407b = this.f18406a.size();
    }
}
