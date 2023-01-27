package org.jsoup.parser;

import com.karumi.dexter.BuildConfig;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;

abstract class Token {

    /* renamed from: a */
    TokenType f18189a;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* renamed from: org.jsoup.parser.Token$b */
    static final class C6423b extends C6424c {
        C6423b(String str) {
            mo18575p(str);
        }

        public String toString() {
            return "<![CDATA[" + mo18576q() + "]]>";
        }
    }

    /* renamed from: org.jsoup.parser.Token$c */
    static class C6424c extends Token {

        /* renamed from: b */
        private String f18191b;

        C6424c() {
            super();
            this.f18189a = TokenType.Character;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Token mo18572m() {
            this.f18191b = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C6424c mo18575p(String str) {
            this.f18191b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public String mo18576q() {
            return this.f18191b;
        }

        public String toString() {
            return mo18576q();
        }
    }

    /* renamed from: org.jsoup.parser.Token$d */
    static final class C6425d extends Token {

        /* renamed from: b */
        final StringBuilder f18192b = new StringBuilder();

        /* renamed from: c */
        boolean f18193c = false;

        C6425d() {
            super();
            this.f18189a = TokenType.Comment;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Token mo18572m() {
            Token.m26501n(this.f18192b);
            this.f18193c = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public String mo18577p() {
            return this.f18192b.toString();
        }

        public String toString() {
            return "<!--" + mo18577p() + "-->";
        }
    }

    /* renamed from: org.jsoup.parser.Token$e */
    static final class C6426e extends Token {

        /* renamed from: b */
        final StringBuilder f18194b = new StringBuilder();

        /* renamed from: c */
        String f18195c = null;

        /* renamed from: d */
        final StringBuilder f18196d = new StringBuilder();

        /* renamed from: e */
        final StringBuilder f18197e = new StringBuilder();

        /* renamed from: f */
        boolean f18198f = false;

        C6426e() {
            super();
            this.f18189a = TokenType.Doctype;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Token mo18572m() {
            Token.m26501n(this.f18194b);
            this.f18195c = null;
            Token.m26501n(this.f18196d);
            Token.m26501n(this.f18197e);
            this.f18198f = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public String mo18579p() {
            return this.f18194b.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public String mo18580q() {
            return this.f18195c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public String mo18581r() {
            return this.f18196d.toString();
        }

        /* renamed from: s */
        public String mo18582s() {
            return this.f18197e.toString();
        }

        /* renamed from: t */
        public boolean mo18583t() {
            return this.f18198f;
        }
    }

    /* renamed from: org.jsoup.parser.Token$f */
    static final class C6427f extends Token {
        C6427f() {
            super();
            this.f18189a = TokenType.EOF;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Token mo18572m() {
            return this;
        }
    }

    /* renamed from: org.jsoup.parser.Token$g */
    static final class C6428g extends C6430i {
        C6428g() {
            this.f18189a = TokenType.EndTag;
        }

        public String toString() {
            return "</" + mo18588A() + ">";
        }
    }

    /* renamed from: org.jsoup.parser.Token$h */
    static final class C6429h extends C6430i {
        C6429h() {
            this.f18207j = new Attributes();
            this.f18189a = TokenType.StartTag;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public C6430i mo18585E() {
            super.mo18572m();
            this.f18207j = new Attributes();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public C6429h mo18586G(String str, Attributes attributes) {
            this.f18199b = str;
            this.f18207j = attributes;
            this.f18200c = Normalizer.lowerCase(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public /* bridge */ /* synthetic */ Token mo18572m() {
            mo18585E();
            return this;
        }

        public String toString() {
            StringBuilder sb;
            String A;
            Attributes attributes = this.f18207j;
            if (attributes == null || attributes.size() <= 0) {
                sb = new StringBuilder();
                sb.append("<");
                A = mo18588A();
            } else {
                sb = new StringBuilder();
                sb.append("<");
                sb.append(mo18588A());
                sb.append(" ");
                A = this.f18207j.toString();
            }
            sb.append(A);
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: org.jsoup.parser.Token$i */
    static abstract class C6430i extends Token {

        /* renamed from: b */
        protected String f18199b;

        /* renamed from: c */
        protected String f18200c;

        /* renamed from: d */
        private String f18201d;

        /* renamed from: e */
        private StringBuilder f18202e = new StringBuilder();

        /* renamed from: f */
        private String f18203f;

        /* renamed from: g */
        private boolean f18204g = false;

        /* renamed from: h */
        private boolean f18205h = false;

        /* renamed from: i */
        boolean f18206i = false;

        /* renamed from: j */
        Attributes f18207j;

        C6430i() {
            super();
        }

        /* renamed from: w */
        private void m26531w() {
            this.f18205h = true;
            String str = this.f18203f;
            if (str != null) {
                this.f18202e.append(str);
                this.f18203f = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public final String mo18588A() {
            String str = this.f18199b;
            Validate.isFalse(str == null || str.length() == 0);
            return this.f18199b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public final C6430i mo18589B(String str) {
            this.f18199b = str;
            this.f18200c = Normalizer.lowerCase(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public final void mo18590C() {
            if (this.f18207j == null) {
                this.f18207j = new Attributes();
            }
            String str = this.f18201d;
            if (str != null) {
                String trim = str.trim();
                this.f18201d = trim;
                if (trim.length() > 0) {
                    this.f18207j.put(this.f18201d, this.f18205h ? this.f18202e.length() > 0 ? this.f18202e.toString() : this.f18203f : this.f18204g ? BuildConfig.FLAVOR : null);
                }
            }
            this.f18201d = null;
            this.f18204g = false;
            this.f18205h = false;
            Token.m26501n(this.f18202e);
            this.f18203f = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public final String mo18591D() {
            return this.f18200c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public C6430i mo18572m() {
            this.f18199b = null;
            this.f18200c = null;
            this.f18201d = null;
            Token.m26501n(this.f18202e);
            this.f18203f = null;
            this.f18204g = false;
            this.f18205h = false;
            this.f18206i = false;
            this.f18207j = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public final void mo18592F() {
            this.f18204g = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public final void mo18593p(char c) {
            mo18594q(String.valueOf(c));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public final void mo18594q(String str) {
            String str2 = this.f18201d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f18201d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public final void mo18595r(char c) {
            m26531w();
            this.f18202e.append(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public final void mo18596s(String str) {
            m26531w();
            if (this.f18202e.length() == 0) {
                this.f18203f = str;
            } else {
                this.f18202e.append(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo18597t(int[] iArr) {
            m26531w();
            for (int appendCodePoint : iArr) {
                this.f18202e.appendCodePoint(appendCodePoint);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public final void mo18598u(char c) {
            mo18599v(String.valueOf(c));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo18599v(String str) {
            String str2 = this.f18199b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f18199b = str;
            this.f18200c = Normalizer.lowerCase(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public final void mo18600x() {
            if (this.f18201d != null) {
                mo18590C();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final Attributes mo18601y() {
            return this.f18207j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public final boolean mo18602z() {
            return this.f18206i;
        }
    }

    private Token() {
    }

    /* renamed from: n */
    static void m26501n(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6424c mo18560a() {
        return (C6424c) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6425d mo18561b() {
        return (C6425d) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C6426e mo18562c() {
        return (C6426e) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C6428g mo18563d() {
        return (C6428g) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C6429h mo18564e() {
        return (C6429h) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo18565f() {
        return this instanceof C6423b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo18566g() {
        return this.f18189a == TokenType.Character;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo18567h() {
        return this.f18189a == TokenType.Comment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo18568i() {
        return this.f18189a == TokenType.Doctype;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo18569j() {
        return this.f18189a == TokenType.EOF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo18570k() {
        return this.f18189a == TokenType.EndTag;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo18571l() {
        return this.f18189a == TokenType.StartTag;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract Token mo18572m();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo18573o() {
        return getClass().getSimpleName();
    }
}
