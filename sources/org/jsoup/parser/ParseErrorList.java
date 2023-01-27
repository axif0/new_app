package org.jsoup.parser;

import java.util.ArrayList;

public class ParseErrorList extends ArrayList<ParseError> {

    /* renamed from: f */
    private final int f18165f;

    ParseErrorList(int i, int i2) {
        super(i);
        this.f18165f = i2;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i) {
        return new ParseErrorList(16, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo18528c() {
        return size() < this.f18165f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo18529d() {
        return this.f18165f;
    }
}
