package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.b */
final class C6458b {

    /* renamed from: r */
    private static final char[] f18258r;

    /* renamed from: s */
    static final int[] f18259s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a */
    private final CharacterReader f18260a;

    /* renamed from: b */
    private final ParseErrorList f18261b;

    /* renamed from: c */
    private C6459c f18262c = C6459c.Data;

    /* renamed from: d */
    private Token f18263d;

    /* renamed from: e */
    private boolean f18264e = false;

    /* renamed from: f */
    private String f18265f = null;

    /* renamed from: g */
    private StringBuilder f18266g = new StringBuilder(1024);

    /* renamed from: h */
    StringBuilder f18267h = new StringBuilder(1024);

    /* renamed from: i */
    Token.C6430i f18268i;

    /* renamed from: j */
    Token.C6429h f18269j = new Token.C6429h();

    /* renamed from: k */
    Token.C6428g f18270k = new Token.C6428g();

    /* renamed from: l */
    Token.C6424c f18271l = new Token.C6424c();

    /* renamed from: m */
    Token.C6426e f18272m = new Token.C6426e();

    /* renamed from: n */
    Token.C6425d f18273n = new Token.C6425d();

    /* renamed from: o */
    private String f18274o;

    /* renamed from: p */
    private final int[] f18275p = new int[1];

    /* renamed from: q */
    private final int[] f18276q = new int[2];

    static {
        char[] cArr = {9, 10, 13, 12, ' ', '<', '&'};
        f18258r = cArr;
        Arrays.sort(cArr);
    }

    C6458b(CharacterReader characterReader, ParseErrorList parseErrorList) {
        this.f18260a = characterReader;
        this.f18261b = parseErrorList;
    }

    /* renamed from: c */
    private void m26608c(String str) {
        if (this.f18261b.mo18528c()) {
            this.f18261b.add(new ParseError(this.f18260a.pos(), "Invalid character reference: %s", str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18640a(C6459c cVar) {
        this.f18260a.advance();
        this.f18262c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo18641b() {
        return this.f18274o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int[] mo18642d(Character ch, boolean z) {
        int i;
        if (this.f18260a.isEmpty()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f18260a.current()) || this.f18260a.mo18450v(f18258r)) {
            return null;
        }
        int[] iArr = this.f18275p;
        this.f18260a.mo18442p();
        if (this.f18260a.mo18444q("#")) {
            boolean r = this.f18260a.mo18445r("X");
            CharacterReader characterReader = this.f18260a;
            String f = r ? characterReader.mo18432f() : characterReader.mo18431e();
            if (f.length() == 0) {
                m26608c("numeric reference with no numerals");
            } else {
                if (!this.f18260a.mo18444q(";")) {
                    m26608c("missing semicolon");
                }
                try {
                    i = Integer.valueOf(f, r ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                    m26608c("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                if (i >= 128 && i < f18259s.length + 128) {
                    m26608c("character is not a valid unicode code point");
                    i = f18259s[i - 128];
                }
                iArr[0] = i;
                return iArr;
            }
        } else {
            String h = this.f18260a.mo18434h();
            boolean s = this.f18260a.mo18446s(';');
            if (!(Entities.isBaseNamedEntity(h) || (Entities.isNamedEntity(h) && s))) {
                this.f18260a.mo18423C();
                if (s) {
                    m26608c(String.format("invalid named reference '%s'", new Object[]{h}));
                }
                return null;
            } else if (!z || (!this.f18260a.mo18453y() && !this.f18260a.mo18451w() && !this.f18260a.mo18449u('=', '-', '_'))) {
                if (!this.f18260a.mo18444q(";")) {
                    m26608c("missing semicolon");
                }
                int codepointsForName = Entities.codepointsForName(h, this.f18276q);
                if (codepointsForName == 1) {
                    iArr[0] = this.f18276q[0];
                    return iArr;
                } else if (codepointsForName == 2) {
                    return this.f18276q;
                } else {
                    Validate.fail("Unexpected characters returned for " + h);
                    return this.f18276q;
                }
            }
        }
        this.f18260a.mo18423C();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo18643e() {
        this.f18273n.mo18572m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo18644f() {
        this.f18272m.mo18572m();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: org.jsoup.parser.Token$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: org.jsoup.parser.Token$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: org.jsoup.parser.Token$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: org.jsoup.parser.Token$g} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.parser.Token.C6430i mo18645g(boolean r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0008
            org.jsoup.parser.Token$h r1 = r0.f18269j
            r1.mo18585E()
            goto L_0x000d
        L_0x0008:
            org.jsoup.parser.Token$g r1 = r0.f18270k
            r1.mo18572m()
        L_0x000d:
            r0.f18268i = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6458b.mo18645g(boolean):org.jsoup.parser.Token$i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo18646h() {
        Token.m26501n(this.f18267h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo18647i(char c) {
        mo18648j(String.valueOf(c));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo18648j(String str) {
        if (this.f18265f == null) {
            this.f18265f = str;
            return;
        }
        if (this.f18266g.length() == 0) {
            this.f18266g.append(this.f18265f);
        }
        this.f18266g.append(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo18649k(Token token) {
        Validate.isFalse(this.f18264e, "There is an unread token pending!");
        this.f18263d = token;
        this.f18264e = true;
        Token.TokenType tokenType = token.f18189a;
        if (tokenType == Token.TokenType.StartTag) {
            this.f18274o = ((Token.C6429h) token).f18199b;
        } else if (tokenType == Token.TokenType.EndTag && ((Token.C6428g) token).f18207j != null) {
            mo18655q("Attributes incorrectly present on end tag");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo18650l(int[] iArr) {
        mo18648j(new String(iArr, 0, iArr.length));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo18651m() {
        mo18649k(this.f18273n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo18652n() {
        mo18649k(this.f18272m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo18653o() {
        this.f18268i.mo18600x();
        mo18649k(this.f18268i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18654p(C6459c cVar) {
        if (this.f18261b.mo18528c()) {
            this.f18261b.add(new ParseError(this.f18260a.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", cVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo18655q(String str) {
        if (this.f18261b.mo18528c()) {
            this.f18261b.add(new ParseError(this.f18260a.pos(), str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18656r(C6459c cVar) {
        if (this.f18261b.mo18528c()) {
            this.f18261b.add(new ParseError(this.f18260a.pos(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f18260a.current()), cVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo18657s() {
        return this.f18274o != null && this.f18268i.mo18588A().equalsIgnoreCase(this.f18274o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Token mo18658t() {
        while (!this.f18264e) {
            this.f18262c.mo18661o(this, this.f18260a);
        }
        if (this.f18266g.length() > 0) {
            String sb = this.f18266g.toString();
            StringBuilder sb2 = this.f18266g;
            sb2.delete(0, sb2.length());
            this.f18265f = null;
            Token.C6424c cVar = this.f18271l;
            cVar.mo18575p(sb);
            return cVar;
        }
        String str = this.f18265f;
        if (str != null) {
            Token.C6424c cVar2 = this.f18271l;
            cVar2.mo18575p(str);
            this.f18265f = null;
            return cVar2;
        }
        this.f18264e = false;
        return this.f18263d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo18659u(C6459c cVar) {
        this.f18262c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public String mo18660v(boolean z) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        while (!this.f18260a.isEmpty()) {
            borrowBuilder.append(this.f18260a.consumeTo('&'));
            if (this.f18260a.mo18446s('&')) {
                this.f18260a.mo18426c();
                int[] d = mo18642d((Character) null, z);
                if (d == null || d.length == 0) {
                    borrowBuilder.append('&');
                } else {
                    borrowBuilder.appendCodePoint(d[0]);
                    if (d.length == 2) {
                        borrowBuilder.appendCodePoint(d[1]);
                    }
                }
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }
}
