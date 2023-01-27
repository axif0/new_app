package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class TokenQueue {

    /* renamed from: a */
    private String f18208a;

    /* renamed from: b */
    private int f18209b = 0;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.f18208a = str;
    }

    /* renamed from: a */
    private int m26549a() {
        return this.f18208a.length() - this.f18209b;
    }

    public static String unescape(String str) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || (c != 0 && c == '\\')) {
                borrowBuilder.append(c2);
            }
            i++;
            c = c2;
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public void addFirst(Character ch) {
        addFirst(ch.toString());
    }

    public void addFirst(String str) {
        this.f18208a = str + this.f18208a.substring(this.f18209b);
        this.f18209b = 0;
    }

    public void advance() {
        if (!isEmpty()) {
            this.f18209b++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0078 A[EDGE_INSN: B:41:0x0078->B:34:0x0078 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String chompBalanced(char r10, char r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0007:
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L_0x000f
            goto L_0x0078
        L_0x000f:
            char r7 = r9.consume()
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            if (r0 == 0) goto L_0x001d
            r8 = 92
            if (r0 == r8) goto L_0x006c
        L_0x001d:
            r8 = 39
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0034
            char r8 = r7.charValue()
            if (r8 == r10) goto L_0x0034
            if (r2 != 0) goto L_0x0034
            r3 = r3 ^ 1
            goto L_0x004a
        L_0x0034:
            r8 = 34
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x004a
            char r8 = r7.charValue()
            if (r8 == r10) goto L_0x004a
            if (r3 != 0) goto L_0x004a
            r2 = r2 ^ 1
        L_0x004a:
            if (r3 != 0) goto L_0x0076
            if (r2 == 0) goto L_0x004f
            goto L_0x0076
        L_0x004f:
            java.lang.Character r8 = java.lang.Character.valueOf(r10)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0060
            int r4 = r4 + 1
            if (r5 != r1) goto L_0x006c
            int r5 = r9.f18209b
            goto L_0x006c
        L_0x0060:
            java.lang.Character r8 = java.lang.Character.valueOf(r11)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x006c
            int r4 = r4 + -1
        L_0x006c:
            if (r4 <= 0) goto L_0x0072
            if (r0 == 0) goto L_0x0072
            int r6 = r9.f18209b
        L_0x0072:
            char r0 = r7.charValue()
        L_0x0076:
            if (r4 > 0) goto L_0x0007
        L_0x0078:
            if (r6 < 0) goto L_0x0081
            java.lang.String r10 = r9.f18208a
            java.lang.String r10 = r10.substring(r5, r6)
            goto L_0x0083
        L_0x0081:
            java.lang.String r10 = ""
        L_0x0083:
            if (r4 <= 0) goto L_0x009e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            org.jsoup.helper.Validate.fail(r11)
        L_0x009e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.chompBalanced(char, char):java.lang.String");
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public char consume() {
        String str = this.f18208a;
        int i = this.f18209b;
        this.f18209b = i + 1;
        return str.charAt(i);
    }

    public void consume(String str) {
        if (matches(str)) {
            int length = str.length();
            if (length <= m26549a()) {
                this.f18209b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public String consumeAttributeKey() {
        int i = this.f18209b;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_', ':'))) {
            this.f18209b++;
        }
        return this.f18208a.substring(i, this.f18209b);
    }

    public String consumeCssIdentifier() {
        int i = this.f18209b;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.f18209b++;
        }
        return this.f18208a.substring(i, this.f18209b);
    }

    public String consumeElementSelector() {
        int i = this.f18209b;
        while (!isEmpty() && (matchesWord() || matchesAny("*|", "|", "_", "-"))) {
            this.f18209b++;
        }
        return this.f18208a.substring(i, this.f18209b);
    }

    public String consumeTagName() {
        int i = this.f18209b;
        while (!isEmpty() && (matchesWord() || matchesAny(':', '_', '-'))) {
            this.f18209b++;
        }
        return this.f18208a.substring(i, this.f18209b);
    }

    public String consumeTo(String str) {
        int indexOf = this.f18208a.indexOf(str, this.f18209b);
        if (indexOf == -1) {
            return remainder();
        }
        String substring = this.f18208a.substring(this.f18209b, indexOf);
        this.f18209b += substring.length();
        return substring;
    }

    public String consumeToAny(String... strArr) {
        int i = this.f18209b;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.f18209b++;
        }
        return this.f18208a.substring(i, this.f18209b);
    }

    public String consumeToIgnoreCase(String str) {
        int i;
        int i2;
        int i3 = this.f18209b;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (equals) {
                int indexOf = this.f18208a.indexOf(substring, this.f18209b);
                int i4 = this.f18209b;
                int i5 = indexOf - i4;
                if (i5 == 0) {
                    i2 = i4 + 1;
                } else if (i5 < 0) {
                    i = this.f18208a.length();
                } else {
                    i2 = i4 + i5;
                }
                this.f18209b = i2;
            } else {
                i = this.f18209b + 1;
            }
            this.f18209b = i;
        }
        return this.f18208a.substring(i3, this.f18209b);
    }

    public boolean consumeWhitespace() {
        boolean z = false;
        while (matchesWhitespace()) {
            this.f18209b++;
            z = true;
        }
        return z;
    }

    public String consumeWord() {
        int i = this.f18209b;
        while (matchesWord()) {
            this.f18209b++;
        }
        return this.f18208a.substring(i, this.f18209b);
    }

    public boolean isEmpty() {
        return m26549a() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.f18209b += str.length();
        return true;
    }

    public boolean matches(String str) {
        return this.f18208a.regionMatches(true, this.f18209b, str, 0, str.length());
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c : cArr) {
            if (this.f18208a.charAt(this.f18209b) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAny(String... strArr) {
        for (String matches : strArr) {
            if (matches(matches)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.f18208a.startsWith(str, this.f18209b);
    }

    public boolean matchesStartTag() {
        return m26549a() >= 2 && this.f18208a.charAt(this.f18209b) == '<' && Character.isLetter(this.f18208a.charAt(this.f18209b + 1));
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.f18208a.charAt(this.f18209b));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.f18208a.charAt(this.f18209b));
    }

    public char peek() {
        if (isEmpty()) {
            return 0;
        }
        return this.f18208a.charAt(this.f18209b);
    }

    public String remainder() {
        String str = this.f18208a;
        String substring = str.substring(this.f18209b, str.length());
        this.f18209b = this.f18208a.length();
        return substring;
    }

    public String toString() {
        return this.f18208a.substring(this.f18209b);
    }
}
