package org.jsoup.nodes;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class Attributes implements Iterable<Attribute>, Cloneable {

    /* renamed from: i */
    private static final String[] f18077i = new String[0];
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f18078f = 0;

    /* renamed from: g */
    String[] f18079g;

    /* renamed from: h */
    String[] f18080h;

    /* renamed from: org.jsoup.nodes.Attributes$a */
    class C6409a implements Iterator<Attribute> {

        /* renamed from: f */
        int f18081f = 0;

        C6409a() {
        }

        /* renamed from: b */
        public Attribute next() {
            Attributes attributes = Attributes.this;
            String[] strArr = attributes.f18079g;
            int i = this.f18081f;
            Attribute attribute = new Attribute(strArr[i], attributes.f18080h[i], attributes);
            this.f18081f++;
            return attribute;
        }

        public boolean hasNext() {
            return this.f18081f < Attributes.this.f18078f;
        }

        public void remove() {
            Attributes attributes = Attributes.this;
            int i = this.f18081f - 1;
            this.f18081f = i;
            attributes.m26285C(i);
        }
    }

    /* renamed from: org.jsoup.nodes.Attributes$b */
    private static class C6410b extends AbstractMap<String, String> {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Attributes f18083f;

        /* renamed from: org.jsoup.nodes.Attributes$b$a */
        private class C6411a implements Iterator<Map.Entry<String, String>> {

            /* renamed from: f */
            private Iterator<Attribute> f18084f;

            /* renamed from: g */
            private Attribute f18085g;

            private C6411a() {
                this.f18084f = C6410b.this.f18083f.iterator();
            }

            /* synthetic */ C6411a(C6410b bVar, C6409a aVar) {
                this();
            }

            /* renamed from: b */
            public Map.Entry<String, String> next() {
                return new Attribute(this.f18085g.getKey().substring(5), this.f18085g.getValue());
            }

            public boolean hasNext() {
                while (this.f18084f.hasNext()) {
                    Attribute next = this.f18084f.next();
                    this.f18085g = next;
                    if (next.mo18187e()) {
                        return true;
                    }
                }
                return false;
            }

            public void remove() {
                C6410b.this.f18083f.remove(this.f18085g.getKey());
            }
        }

        /* renamed from: org.jsoup.nodes.Attributes$b$b */
        private class C6412b extends AbstractSet<Map.Entry<String, String>> {
            private C6412b() {
            }

            /* synthetic */ C6412b(C6410b bVar, C6409a aVar) {
                this();
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new C6411a(C6410b.this, (C6409a) null);
            }

            public int size() {
                int i = 0;
                while (new C6411a(C6410b.this, (C6409a) null).hasNext()) {
                    i++;
                }
                return i;
            }
        }

        private C6410b(Attributes attributes) {
            this.f18083f = attributes;
        }

        /* synthetic */ C6410b(Attributes attributes, C6409a aVar) {
            this(attributes);
        }

        /* renamed from: b */
        public String put(String str, String str2) {
            String f = Attributes.m26293t(str);
            String str3 = this.f18083f.hasKey(f) ? this.f18083f.get(f) : null;
            this.f18083f.put(f, str2);
            return str3;
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return new C6412b(this, (C6409a) null);
        }
    }

    public Attributes() {
        String[] strArr = f18077i;
        this.f18079g = strArr;
        this.f18080h = strArr;
    }

    /* renamed from: A */
    private int m26284A(String str) {
        Validate.notNull(str);
        for (int i = 0; i < this.f18078f; i++) {
            if (str.equalsIgnoreCase(this.f18079g[i])) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m26285C(int i) {
        Validate.isFalse(i >= this.f18078f);
        int i2 = (this.f18078f - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f18079g;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f18080h;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f18078f - 1;
        this.f18078f = i4;
        this.f18079g[i4] = null;
        this.f18080h[i4] = null;
    }

    /* renamed from: i */
    private void m26289i(String str, String str2) {
        m26290p(this.f18078f + 1);
        String[] strArr = this.f18079g;
        int i = this.f18078f;
        strArr[i] = str;
        this.f18080h[i] = str2;
        this.f18078f = i + 1;
    }

    /* renamed from: p */
    private void m26290p(int i) {
        Validate.isTrue(i >= this.f18078f);
        int length = this.f18079g.length;
        if (length < i) {
            int i2 = 4;
            if (length >= 4) {
                i2 = this.f18078f * 2;
            }
            if (i <= i2) {
                i = i2;
            }
            this.f18079g = m26292r(this.f18079g, i);
            this.f18080h = m26292r(this.f18080h, i);
        }
    }

    /* renamed from: q */
    static String m26291q(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: r */
    private static String[] m26292r(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static String m26293t(String str) {
        return "data-" + str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo18197B(String str, String str2) {
        int A = m26284A(str);
        if (A != -1) {
            this.f18080h[A] = str2;
            if (!this.f18079g[A].equals(str)) {
                this.f18079g[A] = str;
                return;
            }
            return;
        }
        m26289i(str, str2);
    }

    public void addAll(Attributes attributes) {
        if (attributes.size() != 0) {
            m26290p(this.f18078f + attributes.f18078f);
            Iterator<Attribute> it = attributes.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
        }
    }

    public List<Attribute> asList() {
        ArrayList arrayList = new ArrayList(this.f18078f);
        for (int i = 0; i < this.f18078f; i++) {
            arrayList.add(this.f18080h[i] == null ? new BooleanAttribute(this.f18079g[i]) : new Attribute(this.f18079g[i], this.f18080h[i], this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attributes clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.f18078f = this.f18078f;
            this.f18079g = m26292r(this.f18079g, this.f18078f);
            this.f18080h = m26292r(this.f18080h, this.f18078f);
            return attributes;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, String> dataset() {
        return new C6410b(this, (C6409a) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Attributes.class != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.f18078f == attributes.f18078f && Arrays.equals(this.f18079g, attributes.f18079g)) {
            return Arrays.equals(this.f18080h, attributes.f18080h);
        }
        return false;
    }

    public String get(String str) {
        int x = mo18219x(str);
        return x == -1 ? BuildConfig.FLAVOR : m26291q(this.f18080h[x]);
    }

    public String getIgnoreCase(String str) {
        int A = m26284A(str);
        return A == -1 ? BuildConfig.FLAVOR : m26291q(this.f18080h[A]);
    }

    public boolean hasKey(String str) {
        return mo18219x(str) != -1;
    }

    public boolean hasKeyIgnoreCase(String str) {
        return m26284A(str) != -1;
    }

    public int hashCode() {
        return (((this.f18078f * 31) + Arrays.hashCode(this.f18079g)) * 31) + Arrays.hashCode(this.f18080h);
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            mo18218u(borrowBuilder, new Document(BuildConfig.FLAVOR).outputSettings());
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    public Iterator<Attribute> iterator() {
        return new C6409a();
    }

    public void normalize() {
        for (int i = 0; i < this.f18078f; i++) {
            String[] strArr = this.f18079g;
            strArr[i] = Normalizer.lowerCase(strArr[i]);
        }
    }

    public Attributes put(String str, String str2) {
        int x = mo18219x(str);
        if (x != -1) {
            this.f18080h[x] = str2;
        } else {
            m26289i(str, str2);
        }
        return this;
    }

    public Attributes put(String str, boolean z) {
        if (z) {
            mo18197B(str, (String) null);
        } else {
            remove(str);
        }
        return this;
    }

    public Attributes put(Attribute attribute) {
        Validate.notNull(attribute);
        put(attribute.getKey(), attribute.getValue());
        attribute.f18076h = this;
        return this;
    }

    public void remove(String str) {
        int x = mo18219x(str);
        if (x != -1) {
            m26285C(x);
        }
    }

    public void removeIgnoreCase(String str) {
        int A = m26284A(str);
        if (A != -1) {
            m26285C(A);
        }
    }

    public int size() {
        return this.f18078f;
    }

    public String toString() {
        return html();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo18218u(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        int i = this.f18078f;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f18079g[i2];
            String str2 = this.f18080h[i2];
            appendable.append(' ').append(str);
            if (!Attribute.m26281g(str, str2, outputSettings)) {
                appendable.append("=\"");
                if (str2 == null) {
                    str2 = BuildConfig.FLAVOR;
                }
                Entities.m26340d(appendable, str2, outputSettings, true, false, false);
                appendable.append('\"');
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo18219x(String str) {
        Validate.notNull(str);
        for (int i = 0; i < this.f18078f; i++) {
            if (str.equals(this.f18079g[i])) {
                return i;
            }
        }
        return -1;
    }
}
