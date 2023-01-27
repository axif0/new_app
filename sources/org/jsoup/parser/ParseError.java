package org.jsoup.parser;

public class ParseError {

    /* renamed from: a */
    private int f18163a;

    /* renamed from: b */
    private String f18164b;

    ParseError(int i, String str) {
        this.f18163a = i;
        this.f18164b = str;
    }

    ParseError(int i, String str, Object... objArr) {
        this.f18164b = String.format(str, objArr);
        this.f18163a = i;
    }

    public String getErrorMessage() {
        return this.f18164b;
    }

    public int getPosition() {
        return this.f18163a;
    }

    public String toString() {
        return this.f18163a + ": " + this.f18164b;
    }
}
