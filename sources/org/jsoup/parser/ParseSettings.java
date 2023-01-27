package org.jsoup.parser;

import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;

public class ParseSettings {
    public static final ParseSettings htmlDefault = new ParseSettings(false, false);
    public static final ParseSettings preserveCase = new ParseSettings(true, true);

    /* renamed from: a */
    private final boolean f18166a;

    /* renamed from: b */
    private final boolean f18167b;

    public ParseSettings(boolean z, boolean z2) {
        this.f18166a = z;
        this.f18167b = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Attributes mo18530a(Attributes attributes) {
        if (!this.f18167b) {
            attributes.normalize();
        }
        return attributes;
    }

    public String normalizeAttribute(String str) {
        String trim = str.trim();
        return !this.f18167b ? Normalizer.lowerCase(trim) : trim;
    }

    public String normalizeTag(String str) {
        String trim = str.trim();
        return !this.f18166a ? Normalizer.lowerCase(trim) : trim;
    }
}
