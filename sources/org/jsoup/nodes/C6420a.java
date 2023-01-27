package org.jsoup.nodes;

import com.karumi.dexter.BuildConfig;
import java.util.Collections;
import java.util.List;
import org.jsoup.helper.Validate;

/* renamed from: org.jsoup.nodes.a */
abstract class C6420a extends Node {

    /* renamed from: i */
    private static final List<Node> f18133i = Collections.emptyList();

    /* renamed from: h */
    Object f18134h;

    C6420a() {
    }

    /* renamed from: C */
    private void m26383C() {
        if (!mo18348l()) {
            Object obj = this.f18134h;
            Attributes attributes = new Attributes();
            this.f18134h = attributes;
            if (obj != null) {
                attributes.put(nodeName(), (String) obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public String mo18420A() {
        return attr(nodeName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo18421B(String str) {
        attr(nodeName(), str);
    }

    public String absUrl(String str) {
        m26383C();
        return super.absUrl(str);
    }

    public String attr(String str) {
        Validate.notNull(str);
        return !mo18348l() ? str.equals(nodeName()) ? (String) this.f18134h : BuildConfig.FLAVOR : super.attr(str);
    }

    public Node attr(String str, String str2) {
        if (mo18348l() || !str.equals(nodeName())) {
            m26383C();
            super.attr(str, str2);
        } else {
            this.f18134h = str2;
        }
        return this;
    }

    public final Attributes attributes() {
        m26383C();
        return (Attributes) this.f18134h;
    }

    public String baseUri() {
        return hasParent() ? parent().baseUri() : BuildConfig.FLAVOR;
    }

    public int childNodeSize() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo18313g(String str) {
    }

    public boolean hasAttr(String str) {
        m26383C();
        return super.hasAttr(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public List<Node> mo18341i() {
        return f18133i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo18348l() {
        return this.f18134h instanceof Attributes;
    }

    public Node removeAttr(String str) {
        m26383C();
        return super.removeAttr(str);
    }
}
