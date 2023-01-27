package org.jsoup.select;

import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.C6539a;
import org.jsoup.select.C6542b;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class QueryParser {

    /* renamed from: d */
    private static final String[] f18399d = {",", ">", "+", "~", " "};

    /* renamed from: e */
    private static final String[] f18400e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f */
    private static final Pattern f18401f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g */
    private static final Pattern f18402g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a */
    private TokenQueue f18403a;

    /* renamed from: b */
    private String f18404b;

    /* renamed from: c */
    private List<Evaluator> f18405c = new ArrayList();

    private QueryParser(String str) {
        this.f18404b = str;
        this.f18403a = new TokenQueue(str);
    }

    /* renamed from: a */
    private void m26747a() {
        this.f18405c.add(new Evaluator.AllElements());
    }

    /* renamed from: b */
    private void m26748b() {
        List<Evaluator> list;
        Object attributeWithValueMatching;
        Object obj;
        List<Evaluator> list2;
        TokenQueue tokenQueue = new TokenQueue(this.f18403a.chompBalanced('[', ']'));
        String consumeToAny = tokenQueue.consumeToAny(f18400e);
        Validate.notEmpty(consumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            if (consumeToAny.startsWith("^")) {
                list2 = this.f18405c;
                obj = new Evaluator.AttributeStarting(consumeToAny.substring(1));
            } else {
                list2 = this.f18405c;
                obj = new Evaluator.Attribute(consumeToAny);
            }
            list2.add(obj);
            return;
        }
        if (tokenQueue.matchChomp("=")) {
            list = this.f18405c;
            attributeWithValueMatching = new Evaluator.AttributeWithValue(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("!=")) {
            list = this.f18405c;
            attributeWithValueMatching = new Evaluator.AttributeWithValueNot(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("^=")) {
            list = this.f18405c;
            attributeWithValueMatching = new Evaluator.AttributeWithValueStarting(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("$=")) {
            list = this.f18405c;
            attributeWithValueMatching = new Evaluator.AttributeWithValueEnding(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("*=")) {
            list = this.f18405c;
            attributeWithValueMatching = new Evaluator.AttributeWithValueContaining(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("~=")) {
            list = this.f18405c;
            attributeWithValueMatching = new Evaluator.AttributeWithValueMatching(consumeToAny, Pattern.compile(tokenQueue.remainder()));
        } else {
            throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.f18404b, tokenQueue.remainder());
        }
        list.add(attributeWithValueMatching);
    }

    /* renamed from: c */
    private void m26749c() {
        String consumeCssIdentifier = this.f18403a.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.f18405c.add(new Evaluator.Class(consumeCssIdentifier.trim()));
    }

    /* renamed from: d */
    private void m26750d() {
        String consumeCssIdentifier = this.f18403a.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.f18405c.add(new Evaluator.C6538Id(consumeCssIdentifier));
    }

    /* renamed from: e */
    private void m26751e() {
        String consumeElementSelector = this.f18403a.consumeElementSelector();
        Validate.notEmpty(consumeElementSelector);
        if (consumeElementSelector.startsWith("*|")) {
            this.f18405c.add(new C6539a.C6541b(new Evaluator.Tag(Normalizer.normalize(consumeElementSelector)), new Evaluator.TagEndsWith(Normalizer.normalize(consumeElementSelector.replace("*|", ":")))));
            return;
        }
        if (consumeElementSelector.contains("|")) {
            consumeElementSelector = consumeElementSelector.replace("|", ":");
        }
        this.f18405c.add(new Evaluator.Tag(consumeElementSelector.trim()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26752f(char r11) {
        /*
            r10 = this;
            org.jsoup.parser.TokenQueue r0 = r10.f18403a
            r0.consumeWhitespace()
            java.lang.String r0 = r10.m26754h()
            org.jsoup.select.Evaluator r0 = parse(r0)
            java.util.List<org.jsoup.select.Evaluator> r1 = r10.f18405c
            int r1 = r1.size()
            r2 = 44
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0033
            java.util.List<org.jsoup.select.Evaluator> r1 = r10.f18405c
            java.lang.Object r1 = r1.get(r4)
            org.jsoup.select.Evaluator r1 = (org.jsoup.select.Evaluator) r1
            boolean r5 = r1 instanceof org.jsoup.select.C6539a.C6541b
            if (r5 == 0) goto L_0x003a
            if (r11 == r2) goto L_0x003a
            r5 = r1
            org.jsoup.select.a$b r5 = (org.jsoup.select.C6539a.C6541b) r5
            org.jsoup.select.Evaluator r5 = r5.mo18768b()
            r6 = 1
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x003c
        L_0x0033:
            org.jsoup.select.a$a r1 = new org.jsoup.select.a$a
            java.util.List<org.jsoup.select.Evaluator> r5 = r10.f18405c
            r1.<init>((java.util.Collection<org.jsoup.select.Evaluator>) r5)
        L_0x003a:
            r5 = r1
            r6 = 0
        L_0x003c:
            java.util.List<org.jsoup.select.Evaluator> r7 = r10.f18405c
            r7.clear()
            r7 = 62
            r8 = 2
            if (r11 != r7) goto L_0x0057
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.b$b r0 = new org.jsoup.select.b$b
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x0057:
            r7 = 32
            if (r11 != r7) goto L_0x006c
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.b$e r0 = new org.jsoup.select.b$e
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x006c:
            r7 = 43
            if (r11 != r7) goto L_0x0081
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.b$c r0 = new org.jsoup.select.b$c
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x0081:
            r7 = 126(0x7e, float:1.77E-43)
            if (r11 != r7) goto L_0x0096
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.b$f r0 = new org.jsoup.select.b$f
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x0096:
            if (r11 != r2) goto L_0x00be
            boolean r11 = r1 instanceof org.jsoup.select.C6539a.C6541b
            if (r11 == 0) goto L_0x00a3
            org.jsoup.select.a$b r1 = (org.jsoup.select.C6539a.C6541b) r1
            r1.mo18771d(r0)
            r11 = r1
            goto L_0x00ae
        L_0x00a3:
            org.jsoup.select.a$b r11 = new org.jsoup.select.a$b
            r11.<init>()
            r11.mo18771d(r1)
            r11.mo18771d(r0)
        L_0x00ae:
            if (r6 == 0) goto L_0x00b7
            r0 = r5
            org.jsoup.select.a$b r0 = (org.jsoup.select.C6539a.C6541b) r0
            r0.mo18767a(r11)
            goto L_0x00b8
        L_0x00b7:
            r5 = r11
        L_0x00b8:
            java.util.List<org.jsoup.select.Evaluator> r11 = r10.f18405c
            r11.add(r5)
            return
        L_0x00be:
            org.jsoup.select.Selector$SelectorParseException r0 = new org.jsoup.select.Selector$SelectorParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown combinator: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0.<init>(r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.m26752f(char):void");
    }

    /* renamed from: g */
    private int m26753g() {
        String trim = this.f18403a.chompTo(")").trim();
        Validate.isTrue(StringUtil.isNumeric(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    /* renamed from: h */
    private String m26754h() {
        String str;
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        while (!this.f18403a.isEmpty()) {
            if (this.f18403a.matches("(")) {
                borrowBuilder.append("(");
                borrowBuilder.append(this.f18403a.chompBalanced('(', ')'));
                str = ")";
            } else if (this.f18403a.matches("[")) {
                borrowBuilder.append("[");
                borrowBuilder.append(this.f18403a.chompBalanced('[', ']'));
                str = "]";
            } else if (this.f18403a.matchesAny(f18399d)) {
                break;
            } else {
                borrowBuilder.append(this.f18403a.consume());
            }
            borrowBuilder.append(str);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    /* renamed from: i */
    private void m26755i(boolean z) {
        List<Evaluator> list;
        Object obj;
        this.f18403a.consume(z ? ":containsOwn" : ":contains");
        String unescape = TokenQueue.unescape(this.f18403a.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, ":contains(text) query must not be empty");
        if (z) {
            list = this.f18405c;
            obj = new Evaluator.ContainsOwnText(unescape);
        } else {
            list = this.f18405c;
            obj = new Evaluator.ContainsText(unescape);
        }
        list.add(obj);
    }

    /* renamed from: j */
    private void m26756j() {
        this.f18403a.consume(":containsData");
        String unescape = TokenQueue.unescape(this.f18403a.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, ":containsData(text) query must not be empty");
        this.f18405c.add(new Evaluator.ContainsData(unescape));
    }

    /* renamed from: k */
    private void m26757k(boolean z, boolean z2) {
        Object obj;
        List<Evaluator> list;
        String normalize = Normalizer.normalize(this.f18403a.chompTo(")"));
        Matcher matcher = f18401f.matcher(normalize);
        Matcher matcher2 = f18402g.matcher(normalize);
        int i = 2;
        int i2 = 0;
        if ("odd".equals(normalize)) {
            i2 = 1;
        } else if (!"even".equals(normalize)) {
            if (matcher.matches()) {
                int parseInt = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", BuildConfig.FLAVOR)) : 1;
                if (matcher.group(4) != null) {
                    i2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", BuildConfig.FLAVOR));
                }
                i = parseInt;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", BuildConfig.FLAVOR));
                i = 0;
            } else {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", normalize);
            }
        }
        if (z2) {
            if (z) {
                list = this.f18405c;
                obj = new Evaluator.IsNthLastOfType(i, i2);
            } else {
                list = this.f18405c;
                obj = new Evaluator.IsNthOfType(i, i2);
            }
        } else if (z) {
            list = this.f18405c;
            obj = new Evaluator.IsNthLastChild(i, i2);
        } else {
            list = this.f18405c;
            obj = new Evaluator.IsNthChild(i, i2);
        }
        list.add(obj);
    }

    /* renamed from: l */
    private void m26758l() {
        List<Evaluator> list;
        Object matchText;
        if (this.f18403a.matchChomp("#")) {
            m26750d();
        } else if (this.f18403a.matchChomp(".")) {
            m26749c();
        } else if (this.f18403a.matchesWord() || this.f18403a.matches("*|")) {
            m26751e();
        } else if (this.f18403a.matches("[")) {
            m26748b();
        } else if (this.f18403a.matchChomp("*")) {
            m26747a();
        } else if (this.f18403a.matchChomp(":lt(")) {
            m26762p();
        } else if (this.f18403a.matchChomp(":gt(")) {
            m26761o();
        } else if (this.f18403a.matchChomp(":eq(")) {
            m26760n();
        } else if (this.f18403a.matches(":has(")) {
            m26759m();
        } else if (this.f18403a.matches(":contains(")) {
            m26755i(false);
        } else if (this.f18403a.matches(":containsOwn(")) {
            m26755i(true);
        } else if (this.f18403a.matches(":containsData(")) {
            m26756j();
        } else if (this.f18403a.matches(":matches(")) {
            m26763q(false);
        } else if (this.f18403a.matches(":matchesOwn(")) {
            m26763q(true);
        } else if (this.f18403a.matches(":not(")) {
            m26764r();
        } else if (this.f18403a.matchChomp(":nth-child(")) {
            m26757k(false, false);
        } else if (this.f18403a.matchChomp(":nth-last-child(")) {
            m26757k(true, false);
        } else if (this.f18403a.matchChomp(":nth-of-type(")) {
            m26757k(false, true);
        } else if (this.f18403a.matchChomp(":nth-last-of-type(")) {
            m26757k(true, true);
        } else {
            if (this.f18403a.matchChomp(":first-child")) {
                list = this.f18405c;
                matchText = new Evaluator.IsFirstChild();
            } else if (this.f18403a.matchChomp(":last-child")) {
                list = this.f18405c;
                matchText = new Evaluator.IsLastChild();
            } else if (this.f18403a.matchChomp(":first-of-type")) {
                list = this.f18405c;
                matchText = new Evaluator.IsFirstOfType();
            } else if (this.f18403a.matchChomp(":last-of-type")) {
                list = this.f18405c;
                matchText = new Evaluator.IsLastOfType();
            } else if (this.f18403a.matchChomp(":only-child")) {
                list = this.f18405c;
                matchText = new Evaluator.IsOnlyChild();
            } else if (this.f18403a.matchChomp(":only-of-type")) {
                list = this.f18405c;
                matchText = new Evaluator.IsOnlyOfType();
            } else if (this.f18403a.matchChomp(":empty")) {
                list = this.f18405c;
                matchText = new Evaluator.IsEmpty();
            } else if (this.f18403a.matchChomp(":root")) {
                list = this.f18405c;
                matchText = new Evaluator.IsRoot();
            } else if (this.f18403a.matchChomp(":matchText")) {
                list = this.f18405c;
                matchText = new Evaluator.MatchText();
            } else {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f18404b, this.f18403a.remainder());
            }
            list.add(matchText);
        }
    }

    /* renamed from: m */
    private void m26759m() {
        this.f18403a.consume(":has");
        String chompBalanced = this.f18403a.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":has(el) subselect must not be empty");
        this.f18405c.add(new C6542b.C6543a(parse(chompBalanced)));
    }

    /* renamed from: n */
    private void m26760n() {
        this.f18405c.add(new Evaluator.IndexEquals(m26753g()));
    }

    /* renamed from: o */
    private void m26761o() {
        this.f18405c.add(new Evaluator.IndexGreaterThan(m26753g()));
    }

    /* renamed from: p */
    private void m26762p() {
        this.f18405c.add(new Evaluator.IndexLessThan(m26753g()));
    }

    public static Evaluator parse(String str) {
        try {
            return new QueryParser(str).mo18766s();
        } catch (IllegalArgumentException e) {
            throw new Selector.SelectorParseException(e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: q */
    private void m26763q(boolean z) {
        List<Evaluator> list;
        Object obj;
        this.f18403a.consume(z ? ":matchesOwn" : ":matches");
        String chompBalanced = this.f18403a.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":matches(regex) query must not be empty");
        if (z) {
            list = this.f18405c;
            obj = new Evaluator.MatchesOwn(Pattern.compile(chompBalanced));
        } else {
            list = this.f18405c;
            obj = new Evaluator.Matches(Pattern.compile(chompBalanced));
        }
        list.add(obj);
    }

    /* renamed from: r */
    private void m26764r() {
        this.f18403a.consume(":not");
        String chompBalanced = this.f18403a.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":not(selector) subselect must not be empty");
        this.f18405c.add(new C6542b.C6546d(parse(chompBalanced)));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.select.Evaluator mo18766s() {
        /*
            r3 = this;
            org.jsoup.parser.TokenQueue r0 = r3.f18403a
            r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r0 = r3.f18403a
            java.lang.String[] r1 = f18399d
            boolean r0 = r0.matchesAny((java.lang.String[]) r1)
            if (r0 == 0) goto L_0x0023
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.f18405c
            org.jsoup.select.b$g r1 = new org.jsoup.select.b$g
            r1.<init>()
            r0.add(r1)
        L_0x0019:
            org.jsoup.parser.TokenQueue r0 = r3.f18403a
            char r0 = r0.consume()
        L_0x001f:
            r3.m26752f(r0)
            goto L_0x0026
        L_0x0023:
            r3.m26758l()
        L_0x0026:
            org.jsoup.parser.TokenQueue r0 = r3.f18403a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0044
            org.jsoup.parser.TokenQueue r0 = r3.f18403a
            boolean r0 = r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r1 = r3.f18403a
            java.lang.String[] r2 = f18399d
            boolean r1 = r1.matchesAny((java.lang.String[]) r2)
            if (r1 == 0) goto L_0x003f
            goto L_0x0019
        L_0x003f:
            if (r0 == 0) goto L_0x0023
            r0 = 32
            goto L_0x001f
        L_0x0044:
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.f18405c
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0057
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.f18405c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.jsoup.select.Evaluator r0 = (org.jsoup.select.Evaluator) r0
            return r0
        L_0x0057:
            org.jsoup.select.a$a r0 = new org.jsoup.select.a$a
            java.util.List<org.jsoup.select.Evaluator> r1 = r3.f18405c
            r0.<init>((java.util.Collection<org.jsoup.select.Evaluator>) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.mo18766s():org.jsoup.select.Evaluator");
    }
}
