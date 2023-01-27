package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class FormElement extends Element {

    /* renamed from: o */
    private final Elements f18126o = new Elements();

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
    }

    public FormElement addElement(Element element) {
        this.f18126o.add(element);
        return this;
    }

    public Elements elements() {
        return this.f18126o;
    }

    public List<Connection.KeyVal> formData() {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f18126o.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.tag().isFormSubmittable() && !element.hasAttr("disabled")) {
                String attr = element.attr("name");
                if (attr.length() != 0) {
                    String attr2 = element.attr("type");
                    if ("select".equals(element.tagName())) {
                        boolean z = false;
                        Iterator it2 = element.select("option[selected]").iterator();
                        while (it2.hasNext()) {
                            arrayList.add(HttpConnection.KeyVal.create(attr, ((Element) it2.next()).val()));
                            z = true;
                        }
                        if (!z) {
                            element = element.select("option").first();
                            if (element == null) {
                            }
                        }
                    } else if ("checkbox".equalsIgnoreCase(attr2) || "radio".equalsIgnoreCase(attr2)) {
                        if (element.hasAttr("checked")) {
                            if (element.val().length() <= 0) {
                                str = "on";
                                arrayList.add(HttpConnection.KeyVal.create(attr, str));
                            }
                        }
                    }
                    str = element.val();
                    arrayList.add(HttpConnection.KeyVal.create(attr, str));
                }
            }
        }
        return arrayList;
    }

    public Connection submit() {
        String absUrl = hasAttr("action") ? absUrl("action") : baseUri();
        Validate.notEmpty(absUrl, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        return Jsoup.connect(absUrl).data((Collection<Connection.KeyVal>) formData()).method(attr("method").toUpperCase().equals("POST") ? Connection.Method.POST : Connection.Method.GET);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18384u(Node node) {
        super.mo18384u(node);
        this.f18126o.remove(node);
    }
}
