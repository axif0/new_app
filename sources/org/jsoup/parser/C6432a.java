package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.a */
enum C6432a {
    Initial {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (C6432a.m26569o(token)) {
                return true;
            }
            if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
            } else if (token.mo18568i()) {
                Token.C6426e c = token.mo18562c();
                DocumentType documentType = new DocumentType(htmlTreeBuilder.f18357h.normalizeTag(c.mo18579p()), c.mo18581r(), c.mo18582s());
                documentType.setPubSysKey(c.mo18580q());
                htmlTreeBuilder.mo18517w().appendChild(documentType);
                if (c.mo18583t()) {
                    htmlTreeBuilder.mo18517w().quirksMode(Document.QuirksMode.quirks);
                }
                htmlTreeBuilder.mo18458B0(C6432a.BeforeHtml);
            } else {
                htmlTreeBuilder.mo18458B0(C6432a.BeforeHtml);
                return htmlTreeBuilder.mo18486f(token);
            }
            return true;
        }
    },
    BeforeHtml {
        /* renamed from: r */
        private boolean m26594r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.mo18475V("html");
            htmlTreeBuilder.mo18458B0(C6432a.BeforeHead);
            return htmlTreeBuilder.mo18486f(token);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18568i()) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            }
            if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
            } else if (C6432a.m26569o(token)) {
                return true;
            } else {
                if (token.mo18571l() && token.mo18564e().mo18591D().equals("html")) {
                    htmlTreeBuilder.mo18466L(token.mo18564e());
                    htmlTreeBuilder.mo18458B0(C6432a.BeforeHead);
                } else if (token.mo18570k() && StringUtil.m26277in(token.mo18563d().mo18591D(), "head", "body", "html", "br")) {
                    return m26594r(token, htmlTreeBuilder);
                } else {
                    if (!token.mo18570k()) {
                        return m26594r(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                }
            }
            return true;
        }
    },
    BeforeHead {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (C6432a.m26569o(token)) {
                return true;
            }
            if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
            } else if (token.mo18568i()) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            } else if (token.mo18571l() && token.mo18564e().mo18591D().equals("html")) {
                return C6432a.InBody.mo18637q(token, htmlTreeBuilder);
            } else {
                if (token.mo18571l() && token.mo18564e().mo18591D().equals("head")) {
                    htmlTreeBuilder.mo18524z0(htmlTreeBuilder.mo18466L(token.mo18564e()));
                    htmlTreeBuilder.mo18458B0(C6432a.InHead);
                } else if (token.mo18570k() && StringUtil.m26277in(token.mo18563d().mo18591D(), "head", "body", "html", "br")) {
                    htmlTreeBuilder.mo18665h("head");
                    return htmlTreeBuilder.mo18486f(token);
                } else if (token.mo18570k()) {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                } else {
                    htmlTreeBuilder.mo18665h("head");
                    return htmlTreeBuilder.mo18486f(token);
                }
            }
            return true;
        }
    },
    InHead {
        /* renamed from: r */
        private boolean m26597r(Token token, C6527d dVar) {
            dVar.mo18664g("head");
            return dVar.mo18486f(token);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            C6432a aVar;
            if (C6432a.m26569o(token)) {
                htmlTreeBuilder.mo18468N(token.mo18560a());
                return true;
            }
            int i = C6448p.f18236a[token.f18189a.ordinal()];
            if (i == 1) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
            } else if (i != 2) {
                if (i == 3) {
                    Token.C6429h e = token.mo18564e();
                    String D = e.mo18591D();
                    if (D.equals("html")) {
                        return C6432a.InBody.mo18637q(token, htmlTreeBuilder);
                    }
                    if (StringUtil.m26277in(D, "base", "basefont", "bgsound", "command", "link")) {
                        Element P = htmlTreeBuilder.mo18470P(e);
                        if (D.equals("base") && P.hasAttr("href")) {
                            htmlTreeBuilder.mo18485e0(P);
                        }
                    } else if (D.equals("meta")) {
                        htmlTreeBuilder.mo18470P(e);
                    } else if (D.equals("title")) {
                        C6432a.m26567m(e, htmlTreeBuilder);
                    } else if (StringUtil.m26277in(D, "noframes", "style")) {
                        C6432a.m26566l(e, htmlTreeBuilder);
                    } else if (D.equals("noscript")) {
                        htmlTreeBuilder.mo18466L(e);
                        aVar = C6432a.InHeadNoscript;
                    } else if (D.equals("script")) {
                        htmlTreeBuilder.f18352c.mo18659u(C6459c.ScriptData);
                        htmlTreeBuilder.mo18483d0();
                        htmlTreeBuilder.mo18458B0(C6432a.Text);
                        htmlTreeBuilder.mo18466L(e);
                    } else if (!D.equals("head")) {
                        return m26597r(token, htmlTreeBuilder);
                    } else {
                        htmlTreeBuilder.mo18502p(this);
                        return false;
                    }
                } else if (i != 4) {
                    return m26597r(token, htmlTreeBuilder);
                } else {
                    String D2 = token.mo18563d().mo18591D();
                    if (D2.equals("head")) {
                        htmlTreeBuilder.mo18490i0();
                        aVar = C6432a.AfterHead;
                    } else if (StringUtil.m26277in(D2, "body", "html", "br")) {
                        return m26597r(token, htmlTreeBuilder);
                    } else {
                        htmlTreeBuilder.mo18502p(this);
                        return false;
                    }
                }
                htmlTreeBuilder.mo18458B0(aVar);
            } else {
                htmlTreeBuilder.mo18502p(this);
                return false;
            }
            return true;
        }
    },
    InHeadNoscript {
        /* renamed from: r */
        private boolean m26599r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.mo18502p(this);
            Token.C6424c cVar = new Token.C6424c();
            cVar.mo18575p(token.toString());
            htmlTreeBuilder.mo18468N(cVar);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18568i()) {
                htmlTreeBuilder.mo18502p(this);
                return true;
            } else if (token.mo18571l() && token.mo18564e().mo18591D().equals("html")) {
                return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
            } else {
                if (token.mo18570k() && token.mo18563d().mo18591D().equals("noscript")) {
                    htmlTreeBuilder.mo18490i0();
                    htmlTreeBuilder.mo18458B0(C6432a.InHead);
                    return true;
                } else if (C6432a.m26569o(token) || token.mo18567h() || (token.mo18571l() && StringUtil.m26277in(token.mo18564e().mo18591D(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
                    return htmlTreeBuilder.mo18497m0(token, C6432a.InHead);
                } else {
                    if (token.mo18570k() && token.mo18563d().mo18591D().equals("br")) {
                        return m26599r(token, htmlTreeBuilder);
                    }
                    if ((!token.mo18571l() || !StringUtil.m26277in(token.mo18564e().mo18591D(), "head", "noscript")) && !token.mo18570k()) {
                        return m26599r(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                }
            }
        }
    },
    AfterHead {
        /* renamed from: r */
        private boolean m26601r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.mo18665h("body");
            htmlTreeBuilder.mo18505q(true);
            return htmlTreeBuilder.mo18486f(token);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            C6432a aVar;
            Token token2 = token;
            HtmlTreeBuilder htmlTreeBuilder2 = htmlTreeBuilder;
            if (C6432a.m26569o(token)) {
                htmlTreeBuilder2.mo18468N(token.mo18560a());
                return true;
            } else if (token.mo18567h()) {
                htmlTreeBuilder2.mo18469O(token.mo18561b());
                return true;
            } else if (token.mo18568i()) {
                htmlTreeBuilder2.mo18502p(this);
                return true;
            } else {
                if (token.mo18571l()) {
                    Token.C6429h e = token.mo18564e();
                    String D = e.mo18591D();
                    if (D.equals("html")) {
                        return htmlTreeBuilder2.mo18497m0(token2, C6432a.InBody);
                    }
                    if (D.equals("body")) {
                        htmlTreeBuilder2.mo18466L(e);
                        htmlTreeBuilder2.mo18505q(false);
                        aVar = C6432a.InBody;
                    } else if (D.equals("frameset")) {
                        htmlTreeBuilder2.mo18466L(e);
                        aVar = C6432a.InFrameset;
                    } else if (StringUtil.m26277in(D, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title")) {
                        htmlTreeBuilder2.mo18502p(this);
                        Element z = htmlTreeBuilder.mo18523z();
                        htmlTreeBuilder2.mo18499n0(z);
                        htmlTreeBuilder2.mo18497m0(token2, C6432a.InHead);
                        htmlTreeBuilder2.mo18508r0(z);
                        return true;
                    } else if (D.equals("head")) {
                        htmlTreeBuilder2.mo18502p(this);
                        return false;
                    }
                    htmlTreeBuilder2.mo18458B0(aVar);
                    return true;
                } else if (token.mo18570k() && !StringUtil.m26277in(token.mo18563d().mo18591D(), "body", "html")) {
                    htmlTreeBuilder2.mo18502p(this);
                    return false;
                }
                m26601r(token, htmlTreeBuilder);
                return true;
            }
        }
    },
    InBody {
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e5, code lost:
            if (r18.mo18662a().normalName().equals(r5) == false) goto L_0x01b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0269, code lost:
            if (r18.mo18662a().normalName().equals(r5) == false) goto L_0x01b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x028e, code lost:
            if (r18.mo18662a().normalName().equals(r5) == false) goto L_0x01b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0369, code lost:
            if (r2.mo18459C("p") != false) goto L_0x036b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x03c0, code lost:
            if (r2.mo18459C("p") != false) goto L_0x036b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:301:0x0571, code lost:
            if (r2.mo18459C("p") != false) goto L_0x036b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:335:0x062b, code lost:
            if (r2.mo18470P(r3).attr("type").equalsIgnoreCase("hidden") == false) goto L_0x0358;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b1, code lost:
            if (r18.mo18662a().normalName().equals(r5) == false) goto L_0x01b3;
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo18637q(org.jsoup.parser.Token r17, org.jsoup.parser.HtmlTreeBuilder r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                int[] r3 = org.jsoup.parser.C6432a.C6448p.f18236a
                org.jsoup.parser.Token$TokenType r4 = r1.f18189a
                int r4 = r4.ordinal()
                r3 = r3[r4]
                r4 = 1
                if (r3 == r4) goto L_0x07f3
                r5 = 2
                r6 = 0
                if (r3 == r5) goto L_0x07ef
                java.lang.String r7 = "name"
                java.lang.String r8 = "html"
                java.lang.String r9 = "span"
                r10 = 3
                java.lang.String r11 = "form"
                java.lang.String r12 = "li"
                java.lang.String r13 = "body"
                java.lang.String r14 = "p"
                if (r3 == r10) goto L_0x0316
                r5 = 4
                if (r3 == r5) goto L_0x0062
                r5 = 5
                if (r3 == r5) goto L_0x0031
            L_0x002e:
                r1 = 1
                goto L_0x07fc
            L_0x0031:
                org.jsoup.parser.Token$c r1 = r17.mo18560a()
                java.lang.String r3 = r1.mo18576q()
                java.lang.String r5 = org.jsoup.parser.C6432a.f18213C
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L_0x0047
                r2.mo18502p(r0)
                return r6
            L_0x0047:
                boolean r3 = r18.mo18507r()
                if (r3 == 0) goto L_0x005a
                boolean r3 = org.jsoup.parser.C6432a.m26569o(r1)
                if (r3 == 0) goto L_0x005a
                r18.mo18503p0()
                r2.mo18468N(r1)
                goto L_0x002e
            L_0x005a:
                r18.mo18503p0()
                r2.mo18468N(r1)
                goto L_0x0358
            L_0x0062:
                org.jsoup.parser.Token$g r3 = r17.mo18563d()
                java.lang.String r5 = r3.mo18591D()
                java.lang.String[] r15 = org.jsoup.parser.C6432a.C6457y.f18252p
                boolean r15 = org.jsoup.internal.StringUtil.inSorted(r5, r15)
                r10 = 0
                if (r15 == 0) goto L_0x0190
                r3 = 0
            L_0x0074:
                r7 = 8
                if (r3 >= r7) goto L_0x002e
                org.jsoup.nodes.Element r7 = r2.mo18514u(r5)
                if (r7 != 0) goto L_0x0083
                boolean r1 = r16.mo18638r(r17, r18)
                return r1
            L_0x0083:
                boolean r8 = r2.mo18488g0(r7)
                if (r8 != 0) goto L_0x0090
                r2.mo18502p(r0)
            L_0x008c:
                r2.mo18506q0(r7)
                return r4
            L_0x0090:
                java.lang.String r8 = r7.normalName()
                boolean r8 = r2.mo18461E(r8)
                if (r8 != 0) goto L_0x009e
                r2.mo18502p(r0)
                return r6
            L_0x009e:
                org.jsoup.nodes.Element r8 = r18.mo18662a()
                if (r8 == r7) goto L_0x00a7
                r2.mo18502p(r0)
            L_0x00a7:
                java.util.ArrayList r8 = r18.mo18457B()
                int r9 = r8.size()
                r13 = r10
                r11 = 0
                r12 = 0
            L_0x00b2:
                if (r11 >= r9) goto L_0x00d7
                r14 = 64
                if (r11 >= r14) goto L_0x00d7
                java.lang.Object r14 = r8.get(r11)
                org.jsoup.nodes.Element r14 = (org.jsoup.nodes.Element) r14
                if (r14 != r7) goto L_0x00cb
                int r12 = r11 + -1
                java.lang.Object r12 = r8.get(r12)
                r13 = r12
                org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
                r12 = 1
                goto L_0x00d4
            L_0x00cb:
                if (r12 == 0) goto L_0x00d4
                boolean r15 = r2.mo18480b0(r14)
                if (r15 == 0) goto L_0x00d4
                goto L_0x00d8
            L_0x00d4:
                int r11 = r11 + 1
                goto L_0x00b2
            L_0x00d7:
                r14 = r10
            L_0x00d8:
                if (r14 != 0) goto L_0x00e2
                java.lang.String r1 = r7.normalName()
                r2.mo18494k0(r1)
                goto L_0x008c
            L_0x00e2:
                r9 = r14
                r11 = r9
                r8 = 0
            L_0x00e5:
                r12 = 3
                if (r8 >= r12) goto L_0x012a
                boolean r15 = r2.mo18488g0(r9)
                if (r15 == 0) goto L_0x00f2
                org.jsoup.nodes.Element r9 = r2.mo18491j(r9)
            L_0x00f2:
                boolean r15 = r2.mo18478Z(r9)
                if (r15 != 0) goto L_0x00fc
                r2.mo18508r0(r9)
                goto L_0x0126
            L_0x00fc:
                if (r9 != r7) goto L_0x00ff
                goto L_0x012a
            L_0x00ff:
                org.jsoup.nodes.Element r15 = new org.jsoup.nodes.Element
                java.lang.String r12 = r9.nodeName()
                org.jsoup.parser.ParseSettings r4 = org.jsoup.parser.ParseSettings.preserveCase
                org.jsoup.parser.Tag r4 = org.jsoup.parser.Tag.valueOf(r12, r4)
                java.lang.String r12 = r18.mo18515v()
                r15.<init>(r4, r12)
                r2.mo18512t0(r9, r15)
                r2.mo18516v0(r9, r15)
                org.jsoup.nodes.Element r4 = r11.parent()
                if (r4 == 0) goto L_0x0121
                r11.remove()
            L_0x0121:
                r15.appendChild(r11)
                r9 = r15
                r11 = r9
            L_0x0126:
                int r8 = r8 + 1
                r4 = 1
                goto L_0x00e5
            L_0x012a:
                java.lang.String r4 = r13.normalName()
                java.lang.String[] r8 = org.jsoup.parser.C6432a.C6457y.f18253q
                boolean r4 = org.jsoup.internal.StringUtil.inSorted(r4, r8)
                if (r4 == 0) goto L_0x0143
                org.jsoup.nodes.Element r4 = r11.parent()
                if (r4 == 0) goto L_0x013f
                r11.remove()
            L_0x013f:
                r2.mo18472R(r11)
                goto L_0x014f
            L_0x0143:
                org.jsoup.nodes.Element r4 = r11.parent()
                if (r4 == 0) goto L_0x014c
                r11.remove()
            L_0x014c:
                r13.appendChild(r11)
            L_0x014f:
                org.jsoup.nodes.Element r4 = new org.jsoup.nodes.Element
                org.jsoup.parser.Tag r8 = r7.tag()
                java.lang.String r9 = r18.mo18515v()
                r4.<init>(r8, r9)
                org.jsoup.nodes.Attributes r8 = r4.attributes()
                org.jsoup.nodes.Attributes r9 = r7.attributes()
                r8.addAll(r9)
                java.util.List r8 = r14.childNodes()
                org.jsoup.nodes.Node[] r9 = new org.jsoup.nodes.Node[r6]
                java.lang.Object[] r8 = r8.toArray(r9)
                org.jsoup.nodes.Node[] r8 = (org.jsoup.nodes.Node[]) r8
                int r9 = r8.length
                r11 = 0
            L_0x0175:
                if (r11 >= r9) goto L_0x017f
                r12 = r8[r11]
                r4.appendChild(r12)
                int r11 = r11 + 1
                goto L_0x0175
            L_0x017f:
                r14.appendChild(r4)
                r2.mo18506q0(r7)
                r2.mo18508r0(r7)
                r2.mo18474U(r14, r4)
                int r3 = r3 + 1
                r4 = 1
                goto L_0x0074
            L_0x0190:
                java.lang.String[] r4 = org.jsoup.parser.C6432a.C6457y.f18251o
                boolean r4 = org.jsoup.internal.StringUtil.inSorted(r5, r4)
                if (r4 == 0) goto L_0x01bb
                boolean r1 = r2.mo18461E(r5)
                if (r1 != 0) goto L_0x01a2
                r2.mo18502p(r0)
                return r6
            L_0x01a2:
                r18.mo18509s()
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01b6
            L_0x01b3:
                r2.mo18502p(r0)
            L_0x01b6:
                r2.mo18494k0(r5)
                goto L_0x002e
            L_0x01bb:
                boolean r4 = r5.equals(r9)
                if (r4 == 0) goto L_0x01c6
                boolean r1 = r16.mo18638r(r17, r18)
                return r1
            L_0x01c6:
                boolean r4 = r5.equals(r12)
                if (r4 == 0) goto L_0x01e8
                boolean r1 = r2.mo18460D(r5)
                if (r1 != 0) goto L_0x01d6
                r2.mo18502p(r0)
                return r6
            L_0x01d6:
                r2.mo18511t(r5)
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01b6
                goto L_0x01b3
            L_0x01e8:
                boolean r4 = r5.equals(r13)
                if (r4 == 0) goto L_0x01ff
                boolean r1 = r2.mo18461E(r13)
                if (r1 != 0) goto L_0x01f8
                r2.mo18502p(r0)
                return r6
            L_0x01f8:
                org.jsoup.parser.a r1 = org.jsoup.parser.C6432a.AfterBody
            L_0x01fa:
                r2.mo18458B0(r1)
                goto L_0x002e
            L_0x01ff:
                boolean r4 = r5.equals(r8)
                if (r4 == 0) goto L_0x0210
                boolean r1 = r2.mo18664g(r13)
                if (r1 == 0) goto L_0x002e
                boolean r1 = r2.mo18486f(r3)
                return r1
            L_0x0210:
                boolean r4 = r5.equals(r11)
                if (r4 == 0) goto L_0x0243
                org.jsoup.nodes.FormElement r1 = r18.mo18519x()
                r2.mo18520x0(r10)
                if (r1 == 0) goto L_0x023f
                boolean r3 = r2.mo18461E(r5)
                if (r3 != 0) goto L_0x0226
                goto L_0x023f
            L_0x0226:
                r18.mo18509s()
                org.jsoup.nodes.Element r3 = r18.mo18662a()
                java.lang.String r3 = r3.normalName()
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x023a
                r2.mo18502p(r0)
            L_0x023a:
                r2.mo18508r0(r1)
                goto L_0x002e
            L_0x023f:
                r2.mo18502p(r0)
                return r6
            L_0x0243:
                boolean r4 = r5.equals(r14)
                if (r4 == 0) goto L_0x026d
                boolean r1 = r2.mo18459C(r5)
                if (r1 != 0) goto L_0x025a
                r2.mo18502p(r0)
                r2.mo18665h(r5)
                boolean r1 = r2.mo18486f(r3)
                return r1
            L_0x025a:
                r2.mo18511t(r5)
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01b6
                goto L_0x01b3
            L_0x026d:
                java.lang.String[] r3 = org.jsoup.parser.C6432a.C6457y.f18242f
                boolean r3 = org.jsoup.internal.StringUtil.inSorted(r5, r3)
                if (r3 == 0) goto L_0x0292
                boolean r1 = r2.mo18461E(r5)
                if (r1 != 0) goto L_0x027f
                r2.mo18502p(r0)
                return r6
            L_0x027f:
                r2.mo18511t(r5)
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01b6
                goto L_0x01b3
            L_0x0292:
                java.lang.String[] r3 = org.jsoup.parser.C6432a.C6457y.f18239c
                boolean r3 = org.jsoup.internal.StringUtil.inSorted(r5, r3)
                if (r3 == 0) goto L_0x02c1
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18239c
                boolean r1 = r2.mo18463G(r1)
                if (r1 != 0) goto L_0x02a6
                r2.mo18502p(r0)
                return r6
            L_0x02a6:
                r2.mo18511t(r5)
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x02ba
                r2.mo18502p(r0)
            L_0x02ba:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18239c
                r2.mo18495l0(r1)
                goto L_0x002e
            L_0x02c1:
                java.lang.String r3 = "sarcasm"
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L_0x02ce
                boolean r1 = r16.mo18638r(r17, r18)
                return r1
            L_0x02ce:
                java.lang.String[] r3 = org.jsoup.parser.C6432a.C6457y.f18244h
                boolean r3 = org.jsoup.internal.StringUtil.inSorted(r5, r3)
                if (r3 == 0) goto L_0x0302
                boolean r1 = r2.mo18461E(r7)
                if (r1 != 0) goto L_0x002e
                boolean r1 = r2.mo18461E(r5)
                if (r1 != 0) goto L_0x02e6
                r2.mo18502p(r0)
                return r6
            L_0x02e6:
                r18.mo18509s()
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x02fa
                r2.mo18502p(r0)
            L_0x02fa:
                r2.mo18494k0(r5)
                r18.mo18493k()
                goto L_0x002e
            L_0x0302:
                java.lang.String r3 = "br"
                boolean r4 = r5.equals(r3)
                if (r4 == 0) goto L_0x0311
                r2.mo18502p(r0)
                r2.mo18665h(r3)
                return r6
            L_0x0311:
                boolean r1 = r16.mo18638r(r17, r18)
                return r1
            L_0x0316:
                org.jsoup.parser.Token$h r3 = r17.mo18564e()
                java.lang.String r4 = r3.mo18591D()
                java.lang.String r10 = "a"
                boolean r15 = r4.equals(r10)
                if (r15 == 0) goto L_0x034a
                org.jsoup.nodes.Element r1 = r2.mo18514u(r10)
                if (r1 == 0) goto L_0x033e
                r2.mo18502p(r0)
                r2.mo18664g(r10)
                org.jsoup.nodes.Element r1 = r2.mo18521y(r10)
                if (r1 == 0) goto L_0x033e
                r2.mo18506q0(r1)
                r2.mo18508r0(r1)
            L_0x033e:
                r18.mo18503p0()
            L_0x0341:
                org.jsoup.nodes.Element r1 = r2.mo18466L(r3)
                r2.mo18501o0(r1)
                goto L_0x002e
            L_0x034a:
                java.lang.String[] r10 = org.jsoup.parser.C6432a.C6457y.f18245i
                boolean r10 = org.jsoup.internal.StringUtil.inSorted(r4, r10)
                if (r10 == 0) goto L_0x035d
                r18.mo18503p0()
            L_0x0355:
                r2.mo18470P(r3)
            L_0x0358:
                r2.mo18505q(r6)
                goto L_0x002e
            L_0x035d:
                java.lang.String[] r10 = org.jsoup.parser.C6432a.C6457y.f18238b
                boolean r10 = org.jsoup.internal.StringUtil.inSorted(r4, r10)
                if (r10 == 0) goto L_0x036f
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0378
            L_0x036b:
                r2.mo18664g(r14)
                goto L_0x0378
            L_0x036f:
                boolean r9 = r4.equals(r9)
                if (r9 == 0) goto L_0x037d
            L_0x0375:
                r18.mo18503p0()
            L_0x0378:
                r2.mo18466L(r3)
                goto L_0x002e
            L_0x037d:
                boolean r9 = r4.equals(r12)
                if (r9 == 0) goto L_0x03c3
                r2.mo18505q(r6)
                java.util.ArrayList r1 = r18.mo18457B()
                int r4 = r1.size()
                r5 = 1
                int r4 = r4 - r5
            L_0x0390:
                if (r4 <= 0) goto L_0x03bc
                java.lang.Object r5 = r1.get(r4)
                org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
                java.lang.String r6 = r5.normalName()
                boolean r6 = r6.equals(r12)
                if (r6 == 0) goto L_0x03a6
                r2.mo18664g(r12)
                goto L_0x03bc
            L_0x03a6:
                boolean r6 = r2.mo18480b0(r5)
                if (r6 == 0) goto L_0x03b9
                java.lang.String r5 = r5.normalName()
                java.lang.String[] r6 = org.jsoup.parser.C6432a.C6457y.f18241e
                boolean r5 = org.jsoup.internal.StringUtil.inSorted(r5, r6)
                if (r5 != 0) goto L_0x03b9
                goto L_0x03bc
            L_0x03b9:
                int r4 = r4 + -1
                goto L_0x0390
            L_0x03bc:
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0378
                goto L_0x036b
            L_0x03c3:
                boolean r8 = r4.equals(r8)
                if (r8 == 0) goto L_0x03fc
                r2.mo18502p(r0)
                java.util.ArrayList r1 = r18.mo18457B()
                java.lang.Object r1 = r1.get(r6)
                org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
                org.jsoup.nodes.Attributes r2 = r3.mo18601y()
                java.util.Iterator r2 = r2.iterator()
            L_0x03de:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x002e
                java.lang.Object r3 = r2.next()
                org.jsoup.nodes.Attribute r3 = (org.jsoup.nodes.Attribute) r3
                java.lang.String r4 = r3.getKey()
                boolean r4 = r1.hasAttr(r4)
                if (r4 != 0) goto L_0x03de
                org.jsoup.nodes.Attributes r4 = r1.attributes()
                r4.put(r3)
                goto L_0x03de
            L_0x03fc:
                java.lang.String[] r8 = org.jsoup.parser.C6432a.C6457y.f18237a
                boolean r8 = org.jsoup.internal.StringUtil.inSorted(r4, r8)
                if (r8 == 0) goto L_0x040b
                org.jsoup.parser.a r3 = org.jsoup.parser.C6432a.InHead
                boolean r1 = r2.mo18497m0(r1, r3)
                return r1
            L_0x040b:
                boolean r1 = r4.equals(r13)
                if (r1 == 0) goto L_0x0466
                r2.mo18502p(r0)
                java.util.ArrayList r1 = r18.mo18457B()
                int r4 = r1.size()
                r7 = 1
                if (r4 == r7) goto L_0x0465
                int r4 = r1.size()
                if (r4 <= r5) goto L_0x0436
                java.lang.Object r4 = r1.get(r7)
                org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
                java.lang.String r4 = r4.normalName()
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0436
                goto L_0x0465
            L_0x0436:
                r2.mo18505q(r6)
                java.lang.Object r1 = r1.get(r7)
                org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
                org.jsoup.nodes.Attributes r2 = r3.mo18601y()
                java.util.Iterator r2 = r2.iterator()
            L_0x0447:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x002e
                java.lang.Object r3 = r2.next()
                org.jsoup.nodes.Attribute r3 = (org.jsoup.nodes.Attribute) r3
                java.lang.String r4 = r3.getKey()
                boolean r4 = r1.hasAttr(r4)
                if (r4 != 0) goto L_0x0447
                org.jsoup.nodes.Attributes r4 = r1.attributes()
                r4.put(r3)
                goto L_0x0447
            L_0x0465:
                return r6
            L_0x0466:
                java.lang.String r1 = "frameset"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x04c1
                r2.mo18502p(r0)
                java.util.ArrayList r1 = r18.mo18457B()
                int r4 = r1.size()
                r7 = 1
                if (r4 == r7) goto L_0x04c0
                int r4 = r1.size()
                if (r4 <= r5) goto L_0x0493
                java.lang.Object r4 = r1.get(r7)
                org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
                java.lang.String r4 = r4.normalName()
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0493
                goto L_0x04c0
            L_0x0493:
                boolean r4 = r18.mo18507r()
                if (r4 != 0) goto L_0x049a
                return r6
            L_0x049a:
                java.lang.Object r4 = r1.get(r7)
                org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
                org.jsoup.nodes.Element r5 = r4.parent()
                if (r5 == 0) goto L_0x04a9
                r4.remove()
            L_0x04a9:
                int r4 = r1.size()
                if (r4 <= r7) goto L_0x04b9
                int r4 = r1.size()
                int r4 = r4 - r7
                r1.remove(r4)
                r7 = 1
                goto L_0x04a9
            L_0x04b9:
                r2.mo18466L(r3)
                org.jsoup.parser.a r1 = org.jsoup.parser.C6432a.InFrameset
                goto L_0x01fa
            L_0x04c0:
                return r6
            L_0x04c1:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18239c
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r4, r1)
                if (r1 == 0) goto L_0x04ea
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x04d2
                r2.mo18664g(r14)
            L_0x04d2:
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                java.lang.String[] r4 = org.jsoup.parser.C6432a.C6457y.f18239c
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r1, r4)
                if (r1 == 0) goto L_0x0378
                r2.mo18502p(r0)
                r18.mo18490i0()
                goto L_0x0378
            L_0x04ea:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18240d
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r4, r1)
                if (r1 == 0) goto L_0x0507
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x04fb
                r2.mo18664g(r14)
            L_0x04fb:
                r2.mo18466L(r3)
                org.jsoup.parser.CharacterReader r1 = r2.f18351b
                java.lang.String r3 = "\n"
                r1.mo18444q(r3)
                goto L_0x0358
            L_0x0507:
                boolean r1 = r4.equals(r11)
                if (r1 == 0) goto L_0x0526
                org.jsoup.nodes.FormElement r1 = r18.mo18519x()
                if (r1 == 0) goto L_0x0517
                r2.mo18502p(r0)
                return r6
            L_0x0517:
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0520
                r2.mo18664g(r14)
            L_0x0520:
                r1 = 1
                r2.mo18471Q(r3, r1)
                goto L_0x07fc
            L_0x0526:
                r1 = 1
                java.lang.String[] r5 = org.jsoup.parser.C6432a.C6457y.f18242f
                boolean r5 = org.jsoup.internal.StringUtil.inSorted(r4, r5)
                if (r5 == 0) goto L_0x0575
                r2.mo18505q(r6)
                java.util.ArrayList r4 = r18.mo18457B()
                int r5 = r4.size()
                int r5 = r5 - r1
            L_0x053b:
                if (r5 <= 0) goto L_0x056d
                java.lang.Object r1 = r4.get(r5)
                org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
                java.lang.String r6 = r1.normalName()
                java.lang.String[] r7 = org.jsoup.parser.C6432a.C6457y.f18242f
                boolean r6 = org.jsoup.internal.StringUtil.inSorted(r6, r7)
                if (r6 == 0) goto L_0x0557
                java.lang.String r1 = r1.normalName()
                r2.mo18664g(r1)
                goto L_0x056d
            L_0x0557:
                boolean r6 = r2.mo18480b0(r1)
                if (r6 == 0) goto L_0x056a
                java.lang.String r1 = r1.normalName()
                java.lang.String[] r6 = org.jsoup.parser.C6432a.C6457y.f18241e
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r1, r6)
                if (r1 != 0) goto L_0x056a
                goto L_0x056d
            L_0x056a:
                int r5 = r5 + -1
                goto L_0x053b
            L_0x056d:
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0378
                goto L_0x036b
            L_0x0575:
                java.lang.String r1 = "plaintext"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0592
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0586
                r2.mo18664g(r14)
            L_0x0586:
                r2.mo18466L(r3)
                org.jsoup.parser.b r1 = r2.f18352c
                org.jsoup.parser.c r2 = org.jsoup.parser.C6459c.PLAINTEXT
                r1.mo18659u(r2)
                goto L_0x002e
            L_0x0592:
                java.lang.String r1 = "button"
                boolean r5 = r4.equals(r1)
                if (r5 == 0) goto L_0x05b3
                boolean r4 = r2.mo18459C(r1)
                if (r4 == 0) goto L_0x05ab
                r2.mo18502p(r0)
                r2.mo18664g(r1)
                r2.mo18486f(r3)
                goto L_0x002e
            L_0x05ab:
                r18.mo18503p0()
                r2.mo18466L(r3)
                goto L_0x0358
            L_0x05b3:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18243g
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r4, r1)
                if (r1 == 0) goto L_0x05bd
                goto L_0x033e
            L_0x05bd:
                java.lang.String r1 = "nobr"
                boolean r5 = r4.equals(r1)
                if (r5 == 0) goto L_0x05d6
                r18.mo18503p0()
                boolean r4 = r2.mo18461E(r1)
                if (r4 == 0) goto L_0x0341
                r2.mo18502p(r0)
                r2.mo18664g(r1)
                goto L_0x033e
            L_0x05d6:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18244h
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r4, r1)
                if (r1 == 0) goto L_0x05e9
                r18.mo18503p0()
                r2.mo18466L(r3)
                r18.mo18473S()
                goto L_0x0358
            L_0x05e9:
                java.lang.String r1 = "table"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0610
                org.jsoup.nodes.Document r1 = r18.mo18517w()
                org.jsoup.nodes.Document$QuirksMode r1 = r1.quirksMode()
                org.jsoup.nodes.Document$QuirksMode r4 = org.jsoup.nodes.Document.QuirksMode.quirks
                if (r1 == r4) goto L_0x0606
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0606
                r2.mo18664g(r14)
            L_0x0606:
                r2.mo18466L(r3)
                r2.mo18505q(r6)
                org.jsoup.parser.a r1 = org.jsoup.parser.C6432a.InTable
                goto L_0x01fa
            L_0x0610:
                java.lang.String r1 = "input"
                boolean r5 = r4.equals(r1)
                if (r5 == 0) goto L_0x062f
                r18.mo18503p0()
                org.jsoup.nodes.Element r1 = r2.mo18470P(r3)
                java.lang.String r3 = "type"
                java.lang.String r1 = r1.attr(r3)
                java.lang.String r3 = "hidden"
                boolean r1 = r1.equalsIgnoreCase(r3)
                if (r1 != 0) goto L_0x002e
                goto L_0x0358
            L_0x062f:
                java.lang.String[] r5 = org.jsoup.parser.C6432a.C6457y.f18246j
                boolean r5 = org.jsoup.internal.StringUtil.inSorted(r4, r5)
                if (r5 == 0) goto L_0x063c
                r2.mo18470P(r3)
                goto L_0x002e
            L_0x063c:
                java.lang.String r5 = "hr"
                boolean r8 = r4.equals(r5)
                if (r8 == 0) goto L_0x064f
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0355
                r2.mo18664g(r14)
                goto L_0x0355
            L_0x064f:
                java.lang.String r8 = "image"
                boolean r8 = r4.equals(r8)
                if (r8 == 0) goto L_0x0669
                java.lang.String r1 = "svg"
                org.jsoup.nodes.Element r1 = r2.mo18521y(r1)
                if (r1 != 0) goto L_0x0378
                java.lang.String r1 = "img"
                r3.mo18589B(r1)
                boolean r1 = r2.mo18486f(r3)
                return r1
            L_0x0669:
                java.lang.String r8 = "isindex"
                boolean r9 = r4.equals(r8)
                if (r9 == 0) goto L_0x06f7
                r2.mo18502p(r0)
                org.jsoup.nodes.FormElement r4 = r18.mo18519x()
                if (r4 == 0) goto L_0x067b
                return r6
            L_0x067b:
                r2.mo18665h(r11)
                org.jsoup.nodes.Attributes r4 = r3.f18207j
                java.lang.String r6 = "action"
                boolean r4 = r4.hasKey(r6)
                if (r4 == 0) goto L_0x0695
                org.jsoup.nodes.FormElement r4 = r18.mo18519x()
                org.jsoup.nodes.Attributes r9 = r3.f18207j
                java.lang.String r9 = r9.get(r6)
                r4.attr((java.lang.String) r6, (java.lang.String) r9)
            L_0x0695:
                r2.mo18665h(r5)
                java.lang.String r4 = "label"
                r2.mo18665h(r4)
                org.jsoup.nodes.Attributes r4 = r3.f18207j
                java.lang.String r6 = "prompt"
                boolean r4 = r4.hasKey(r6)
                if (r4 == 0) goto L_0x06b0
                org.jsoup.nodes.Attributes r4 = r3.f18207j
                java.lang.String r6 = "prompt"
                java.lang.String r4 = r4.get(r6)
                goto L_0x06b2
            L_0x06b0:
                java.lang.String r4 = "This is a searchable index. Enter search keywords: "
            L_0x06b2:
                org.jsoup.parser.Token$c r6 = new org.jsoup.parser.Token$c
                r6.<init>()
                r6.mo18575p(r4)
                r2.mo18486f(r6)
                org.jsoup.nodes.Attributes r4 = new org.jsoup.nodes.Attributes
                r4.<init>()
                org.jsoup.nodes.Attributes r3 = r3.f18207j
                java.util.Iterator r3 = r3.iterator()
            L_0x06c8:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x06e4
                java.lang.Object r6 = r3.next()
                org.jsoup.nodes.Attribute r6 = (org.jsoup.nodes.Attribute) r6
                java.lang.String r9 = r6.getKey()
                java.lang.String[] r10 = org.jsoup.parser.C6432a.C6457y.f18247k
                boolean r9 = org.jsoup.internal.StringUtil.inSorted(r9, r10)
                if (r9 != 0) goto L_0x06c8
                r4.put(r6)
                goto L_0x06c8
            L_0x06e4:
                r4.put((java.lang.String) r7, (java.lang.String) r8)
                r2.processStartTag(r1, r4)
                java.lang.String r1 = "label"
                r2.mo18664g(r1)
                r2.mo18665h(r5)
                r2.mo18664g(r11)
                goto L_0x002e
            L_0x06f7:
                java.lang.String r1 = "textarea"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0713
                r2.mo18466L(r3)
                org.jsoup.parser.b r1 = r2.f18352c
                org.jsoup.parser.c r3 = org.jsoup.parser.C6459c.Rcdata
                r1.mo18659u(r3)
                r18.mo18483d0()
                r2.mo18505q(r6)
                org.jsoup.parser.a r1 = org.jsoup.parser.C6432a.Text
                goto L_0x01fa
            L_0x0713:
                java.lang.String r1 = "xmp"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0728
                boolean r1 = r2.mo18459C(r14)
                if (r1 == 0) goto L_0x0724
                r2.mo18664g(r14)
            L_0x0724:
                r18.mo18503p0()
                goto L_0x0730
            L_0x0728:
                java.lang.String r1 = "iframe"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0738
            L_0x0730:
                r2.mo18505q(r6)
            L_0x0733:
                org.jsoup.parser.C6432a.m26566l(r3, r2)
                goto L_0x002e
            L_0x0738:
                java.lang.String r1 = "noembed"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0741
                goto L_0x0733
            L_0x0741:
                java.lang.String r1 = "select"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0787
                r18.mo18503p0()
                r2.mo18466L(r3)
                r2.mo18505q(r6)
                org.jsoup.parser.a r1 = r18.mo18456A0()
                org.jsoup.parser.a r3 = org.jsoup.parser.C6432a.InTable
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0783
                org.jsoup.parser.a r3 = org.jsoup.parser.C6432a.InCaption
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0783
                org.jsoup.parser.a r3 = org.jsoup.parser.C6432a.InTableBody
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0783
                org.jsoup.parser.a r3 = org.jsoup.parser.C6432a.InRow
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0783
                org.jsoup.parser.a r3 = org.jsoup.parser.C6432a.InCell
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x077f
                goto L_0x0783
            L_0x077f:
                org.jsoup.parser.a r1 = org.jsoup.parser.C6432a.InSelect
                goto L_0x01fa
            L_0x0783:
                org.jsoup.parser.a r1 = org.jsoup.parser.C6432a.InSelectInTable
                goto L_0x01fa
            L_0x0787:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18248l
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r4, r1)
                if (r1 == 0) goto L_0x07a6
                org.jsoup.nodes.Element r1 = r18.mo18662a()
                java.lang.String r1 = r1.normalName()
                java.lang.String r4 = "option"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0375
                java.lang.String r1 = "option"
                r2.mo18664g(r1)
                goto L_0x0375
            L_0x07a6:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18249m
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r4, r1)
                if (r1 == 0) goto L_0x07cf
                java.lang.String r1 = "ruby"
                boolean r4 = r2.mo18461E(r1)
                if (r4 == 0) goto L_0x002e
                r18.mo18509s()
                org.jsoup.nodes.Element r4 = r18.mo18662a()
                java.lang.String r4 = r4.normalName()
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L_0x0378
                r2.mo18502p(r0)
                r2.mo18492j0(r1)
                goto L_0x0378
            L_0x07cf:
                java.lang.String r1 = "math"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x07d9
                goto L_0x0375
            L_0x07d9:
                java.lang.String r1 = "svg"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x07e3
                goto L_0x0375
            L_0x07e3:
                java.lang.String[] r1 = org.jsoup.parser.C6432a.C6457y.f18250n
                boolean r1 = org.jsoup.internal.StringUtil.inSorted(r4, r1)
                if (r1 == 0) goto L_0x0375
                r2.mo18502p(r0)
                return r6
            L_0x07ef:
                r2.mo18502p(r0)
                return r6
            L_0x07f3:
                org.jsoup.parser.Token$d r1 = r17.mo18561b()
                r2.mo18469O(r1)
                goto L_0x002e
            L_0x07fc:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6432a.C6454v.mo18637q(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo18638r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            String str = token.mo18563d().f18200c;
            ArrayList<Element> B = htmlTreeBuilder.mo18457B();
            int size = B.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Element element = B.get(size);
                if (element.normalName().equals(str)) {
                    htmlTreeBuilder.mo18511t(str);
                    if (!str.equals(htmlTreeBuilder.mo18662a().normalName())) {
                        htmlTreeBuilder.mo18502p(this);
                    }
                    htmlTreeBuilder.mo18494k0(str);
                } else if (htmlTreeBuilder.mo18480b0(element)) {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }
    },
    Text {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18566g()) {
                htmlTreeBuilder.mo18468N(token.mo18560a());
                return true;
            } else if (token.mo18569j()) {
                htmlTreeBuilder.mo18502p(this);
                htmlTreeBuilder.mo18490i0();
                htmlTreeBuilder.mo18458B0(htmlTreeBuilder.mo18489h0());
                return htmlTreeBuilder.mo18486f(token);
            } else if (!token.mo18570k()) {
                return true;
            } else {
                htmlTreeBuilder.mo18490i0();
                htmlTreeBuilder.mo18458B0(htmlTreeBuilder.mo18489h0());
                return true;
            }
        }
    },
    InTable {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            C6432a aVar;
            Token token2 = token;
            HtmlTreeBuilder htmlTreeBuilder2 = htmlTreeBuilder;
            if (token.mo18566g()) {
                htmlTreeBuilder.mo18487f0();
                htmlTreeBuilder.mo18483d0();
                htmlTreeBuilder2.mo18458B0(C6432a.InTableText);
                return htmlTreeBuilder2.mo18486f(token2);
            } else if (token.mo18567h()) {
                htmlTreeBuilder2.mo18469O(token.mo18561b());
                return true;
            } else if (token.mo18568i()) {
                htmlTreeBuilder2.mo18502p(this);
                return false;
            } else if (token.mo18571l()) {
                Token.C6429h e = token.mo18564e();
                String D = e.mo18591D();
                if (D.equals("caption")) {
                    htmlTreeBuilder.mo18498n();
                    htmlTreeBuilder.mo18473S();
                    htmlTreeBuilder2.mo18466L(e);
                    aVar = C6432a.InCaption;
                } else if (D.equals("colgroup")) {
                    htmlTreeBuilder.mo18498n();
                    htmlTreeBuilder2.mo18466L(e);
                    aVar = C6432a.InColumnGroup;
                } else if (D.equals("col")) {
                    htmlTreeBuilder2.mo18665h("colgroup");
                    return htmlTreeBuilder2.mo18486f(token2);
                } else if (StringUtil.m26277in(D, "tbody", "tfoot", "thead")) {
                    htmlTreeBuilder.mo18498n();
                    htmlTreeBuilder2.mo18466L(e);
                    aVar = C6432a.InTableBody;
                } else if (StringUtil.m26277in(D, "td", "th", "tr")) {
                    htmlTreeBuilder2.mo18665h("tbody");
                    return htmlTreeBuilder2.mo18486f(token2);
                } else {
                    if (D.equals("table")) {
                        htmlTreeBuilder2.mo18502p(this);
                        if (htmlTreeBuilder2.mo18664g("table")) {
                            return htmlTreeBuilder2.mo18486f(token2);
                        }
                    } else if (StringUtil.m26277in(D, "style", "script")) {
                        return htmlTreeBuilder2.mo18497m0(token2, C6432a.InHead);
                    } else {
                        if (D.equals("input")) {
                            if (!e.f18207j.get("type").equalsIgnoreCase("hidden")) {
                                return mo18639r(token, htmlTreeBuilder);
                            }
                            htmlTreeBuilder2.mo18470P(e);
                        } else if (!D.equals("form")) {
                            return mo18639r(token, htmlTreeBuilder);
                        } else {
                            htmlTreeBuilder2.mo18502p(this);
                            if (htmlTreeBuilder.mo18519x() != null) {
                                return false;
                            }
                            htmlTreeBuilder2.mo18471Q(e, false);
                        }
                    }
                    return true;
                }
                htmlTreeBuilder2.mo18458B0(aVar);
                return true;
            } else if (token.mo18570k()) {
                String D2 = token.mo18563d().mo18591D();
                if (D2.equals("table")) {
                    if (!htmlTreeBuilder2.mo18465K(D2)) {
                        htmlTreeBuilder2.mo18502p(this);
                        return false;
                    }
                    htmlTreeBuilder2.mo18494k0("table");
                    htmlTreeBuilder.mo18518w0();
                    return true;
                } else if (!StringUtil.m26277in(D2, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return mo18639r(token, htmlTreeBuilder);
                } else {
                    htmlTreeBuilder2.mo18502p(this);
                    return false;
                }
            } else if (!token.mo18569j()) {
                return mo18639r(token, htmlTreeBuilder);
            } else {
                if (htmlTreeBuilder.mo18662a().normalName().equals("html")) {
                    htmlTreeBuilder2.mo18502p(this);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo18639r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.mo18502p(this);
            if (!StringUtil.m26277in(htmlTreeBuilder.mo18662a().normalName(), "table", "tbody", "tfoot", "thead", "tr")) {
                return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
            }
            htmlTreeBuilder.mo18522y0(true);
            boolean m0 = htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
            htmlTreeBuilder.mo18522y0(false);
            return m0;
        }
    },
    InTableText {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (C6448p.f18236a[token.f18189a.ordinal()] != 5) {
                if (htmlTreeBuilder.mo18455A().size() > 0) {
                    for (String next : htmlTreeBuilder.mo18455A()) {
                        if (!C6432a.m26568n(next)) {
                            htmlTreeBuilder.mo18502p(this);
                            if (StringUtil.m26277in(htmlTreeBuilder.mo18662a().normalName(), "table", "tbody", "tfoot", "thead", "tr")) {
                                htmlTreeBuilder.mo18522y0(true);
                                Token.C6424c cVar = new Token.C6424c();
                                cVar.mo18575p(next);
                                htmlTreeBuilder.mo18497m0(cVar, C6432a.InBody);
                                htmlTreeBuilder.mo18522y0(false);
                            } else {
                                Token.C6424c cVar2 = new Token.C6424c();
                                cVar2.mo18575p(next);
                                htmlTreeBuilder.mo18497m0(cVar2, C6432a.InBody);
                            }
                        } else {
                            Token.C6424c cVar3 = new Token.C6424c();
                            cVar3.mo18575p(next);
                            htmlTreeBuilder.mo18468N(cVar3);
                        }
                    }
                    htmlTreeBuilder.mo18487f0();
                }
                htmlTreeBuilder.mo18458B0(htmlTreeBuilder.mo18489h0());
                return htmlTreeBuilder.mo18486f(token);
            }
            Token.C6424c a = token.mo18560a();
            if (a.mo18576q().equals(C6432a.f18213C)) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            }
            htmlTreeBuilder.mo18455A().add(a.mo18576q());
            return true;
        }
    },
    InCaption {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!token.mo18570k() || !token.mo18563d().mo18591D().equals("caption")) {
                if ((token.mo18571l() && StringUtil.m26277in(token.mo18564e().mo18591D(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (token.mo18570k() && token.mo18563d().mo18591D().equals("table"))) {
                    htmlTreeBuilder.mo18502p(this);
                    if (htmlTreeBuilder.mo18664g("caption")) {
                        return htmlTreeBuilder.mo18486f(token);
                    }
                    return true;
                } else if (!token.mo18570k() || !StringUtil.m26277in(token.mo18563d().mo18591D(), "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
                } else {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                }
            } else if (!htmlTreeBuilder.mo18465K(token.mo18563d().mo18591D())) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            } else {
                htmlTreeBuilder.mo18509s();
                if (!htmlTreeBuilder.mo18662a().normalName().equals("caption")) {
                    htmlTreeBuilder.mo18502p(this);
                }
                htmlTreeBuilder.mo18494k0("caption");
                htmlTreeBuilder.mo18493k();
                htmlTreeBuilder.mo18458B0(C6432a.InTable);
                return true;
            }
        }
    },
    InColumnGroup {
        /* renamed from: r */
        private boolean m26573r(Token token, C6527d dVar) {
            if (dVar.mo18664g("colgroup")) {
                return dVar.mo18486f(token);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
            if (r2.equals("html") == false) goto L_0x009a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo18637q(org.jsoup.parser.Token r9, org.jsoup.parser.HtmlTreeBuilder r10) {
            /*
                r8 = this;
                boolean r0 = org.jsoup.parser.C6432a.m26569o(r9)
                r1 = 1
                if (r0 == 0) goto L_0x000f
                org.jsoup.parser.Token$c r9 = r9.mo18560a()
                r10.mo18468N(r9)
                return r1
            L_0x000f:
                int[] r0 = org.jsoup.parser.C6432a.C6448p.f18236a
                org.jsoup.parser.Token$TokenType r2 = r9.f18189a
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto L_0x00b3
                r2 = 2
                if (r0 == r2) goto L_0x00af
                r2 = 3
                r3 = 0
                java.lang.String r4 = "html"
                if (r0 == r2) goto L_0x0071
                r2 = 4
                if (r0 == r2) goto L_0x0043
                r2 = 6
                if (r0 == r2) goto L_0x002f
                boolean r9 = r8.m26573r(r9, r10)
                return r9
            L_0x002f:
                org.jsoup.nodes.Element r0 = r10.mo18662a()
                java.lang.String r0 = r0.normalName()
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x003e
                return r1
            L_0x003e:
                boolean r9 = r8.m26573r(r9, r10)
                return r9
            L_0x0043:
                org.jsoup.parser.Token$g r0 = r9.mo18563d()
                java.lang.String r0 = r0.f18200c
                java.lang.String r2 = "colgroup"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x006c
                org.jsoup.nodes.Element r9 = r10.mo18662a()
                java.lang.String r9 = r9.normalName()
                boolean r9 = r9.equals(r4)
                if (r9 == 0) goto L_0x0063
                r10.mo18502p(r8)
                return r3
            L_0x0063:
                r10.mo18490i0()
                org.jsoup.parser.a r9 = org.jsoup.parser.C6432a.InTable
                r10.mo18458B0(r9)
                goto L_0x00ba
            L_0x006c:
                boolean r9 = r8.m26573r(r9, r10)
                return r9
            L_0x0071:
                org.jsoup.parser.Token$h r0 = r9.mo18564e()
                java.lang.String r2 = r0.mo18591D()
                r5 = -1
                int r6 = r2.hashCode()
                r7 = 98688(0x18180, float:1.38291E-40)
                if (r6 == r7) goto L_0x0090
                r7 = 3213227(0x3107ab, float:4.50269E-39)
                if (r6 == r7) goto L_0x0089
                goto L_0x009a
            L_0x0089:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009a
                goto L_0x009b
            L_0x0090:
                java.lang.String r3 = "col"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x009a
                r3 = 1
                goto L_0x009b
            L_0x009a:
                r3 = -1
            L_0x009b:
                if (r3 == 0) goto L_0x00a8
                if (r3 == r1) goto L_0x00a4
                boolean r9 = r8.m26573r(r9, r10)
                return r9
            L_0x00a4:
                r10.mo18470P(r0)
                goto L_0x00ba
            L_0x00a8:
                org.jsoup.parser.a r0 = org.jsoup.parser.C6432a.InBody
                boolean r9 = r10.mo18497m0(r9, r0)
                return r9
            L_0x00af:
                r10.mo18502p(r8)
                goto L_0x00ba
            L_0x00b3:
                org.jsoup.parser.Token$d r9 = r9.mo18561b()
                r10.mo18469O(r9)
            L_0x00ba:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6432a.C6435c.mo18637q(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    InTableBody {
        /* renamed from: r */
        private boolean m26575r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.mo18497m0(token, C6432a.InTable);
        }

        /* renamed from: s */
        private boolean m26576s(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (htmlTreeBuilder.mo18465K("tbody") || htmlTreeBuilder.mo18465K("thead") || htmlTreeBuilder.mo18461E("tfoot")) {
                htmlTreeBuilder.mo18496m();
                htmlTreeBuilder.mo18664g(htmlTreeBuilder.mo18662a().normalName());
                return htmlTreeBuilder.mo18486f(token);
            }
            htmlTreeBuilder.mo18502p(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            C6432a aVar;
            int i = C6448p.f18236a[token.f18189a.ordinal()];
            if (i == 3) {
                Token.C6429h e = token.mo18564e();
                String D = e.mo18591D();
                if (D.equals("template")) {
                    htmlTreeBuilder.mo18466L(e);
                    return true;
                } else if (D.equals("tr")) {
                    htmlTreeBuilder.mo18496m();
                    htmlTreeBuilder.mo18466L(e);
                    aVar = C6432a.InRow;
                } else if (!StringUtil.m26277in(D, "th", "td")) {
                    return StringUtil.m26277in(D, "caption", "col", "colgroup", "tbody", "tfoot", "thead") ? m26576s(token, htmlTreeBuilder) : m26575r(token, htmlTreeBuilder);
                } else {
                    htmlTreeBuilder.mo18502p(this);
                    htmlTreeBuilder.mo18665h("tr");
                    return htmlTreeBuilder.mo18486f(e);
                }
            } else if (i != 4) {
                return m26575r(token, htmlTreeBuilder);
            } else {
                String D2 = token.mo18563d().mo18591D();
                if (StringUtil.m26277in(D2, "tbody", "tfoot", "thead")) {
                    if (!htmlTreeBuilder.mo18465K(D2)) {
                        htmlTreeBuilder.mo18502p(this);
                        return false;
                    }
                    htmlTreeBuilder.mo18496m();
                    htmlTreeBuilder.mo18490i0();
                    aVar = C6432a.InTable;
                } else if (D2.equals("table")) {
                    return m26576s(token, htmlTreeBuilder);
                } else {
                    if (!StringUtil.m26277in(D2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                        return m26575r(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                }
            }
            htmlTreeBuilder.mo18458B0(aVar);
            return true;
        }
    },
    InRow {
        /* renamed from: r */
        private boolean m26578r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.mo18497m0(token, C6432a.InTable);
        }

        /* renamed from: s */
        private boolean m26579s(Token token, C6527d dVar) {
            if (dVar.mo18664g("tr")) {
                return dVar.mo18486f(token);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18571l()) {
                Token.C6429h e = token.mo18564e();
                String D = e.mo18591D();
                if (D.equals("template")) {
                    htmlTreeBuilder.mo18466L(e);
                    return true;
                } else if (!StringUtil.m26277in(D, "th", "td")) {
                    return StringUtil.m26277in(D, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr") ? m26579s(token, htmlTreeBuilder) : m26578r(token, htmlTreeBuilder);
                } else {
                    htmlTreeBuilder.mo18500o();
                    htmlTreeBuilder.mo18466L(e);
                    htmlTreeBuilder.mo18458B0(C6432a.InCell);
                    htmlTreeBuilder.mo18473S();
                    return true;
                }
            } else if (!token.mo18570k()) {
                return m26578r(token, htmlTreeBuilder);
            } else {
                String D2 = token.mo18563d().mo18591D();
                if (D2.equals("tr")) {
                    if (!htmlTreeBuilder.mo18465K(D2)) {
                        htmlTreeBuilder.mo18502p(this);
                        return false;
                    }
                    htmlTreeBuilder.mo18500o();
                    htmlTreeBuilder.mo18490i0();
                    htmlTreeBuilder.mo18458B0(C6432a.InTableBody);
                    return true;
                } else if (D2.equals("table")) {
                    return m26579s(token, htmlTreeBuilder);
                } else {
                    if (StringUtil.m26277in(D2, "tbody", "tfoot", "thead")) {
                        if (!htmlTreeBuilder.mo18465K(D2)) {
                            htmlTreeBuilder.mo18502p(this);
                            return false;
                        }
                        htmlTreeBuilder.mo18664g("tr");
                        return htmlTreeBuilder.mo18486f(token);
                    } else if (!StringUtil.m26277in(D2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                        return m26578r(token, htmlTreeBuilder);
                    } else {
                        htmlTreeBuilder.mo18502p(this);
                        return false;
                    }
                }
            }
        }
    },
    InCell {
        /* renamed from: r */
        private boolean m26581r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
        }

        /* renamed from: s */
        private void m26582s(HtmlTreeBuilder htmlTreeBuilder) {
            String str = "td";
            if (!htmlTreeBuilder.mo18465K(str)) {
                str = "th";
            }
            htmlTreeBuilder.mo18664g(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18570k()) {
                String D = token.mo18563d().mo18591D();
                if (StringUtil.inSorted(D, C6457y.f18254r)) {
                    if (!htmlTreeBuilder.mo18465K(D)) {
                        htmlTreeBuilder.mo18502p(this);
                        htmlTreeBuilder.mo18458B0(C6432a.InRow);
                        return false;
                    }
                    htmlTreeBuilder.mo18509s();
                    if (!htmlTreeBuilder.mo18662a().normalName().equals(D)) {
                        htmlTreeBuilder.mo18502p(this);
                    }
                    htmlTreeBuilder.mo18494k0(D);
                    htmlTreeBuilder.mo18493k();
                    htmlTreeBuilder.mo18458B0(C6432a.InRow);
                    return true;
                } else if (StringUtil.inSorted(D, C6457y.f18255s)) {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                } else if (!StringUtil.inSorted(D, C6457y.f18256t)) {
                    return m26581r(token, htmlTreeBuilder);
                } else {
                    if (!htmlTreeBuilder.mo18465K(D)) {
                        htmlTreeBuilder.mo18502p(this);
                        return false;
                    }
                }
            } else if (!token.mo18571l() || !StringUtil.inSorted(token.mo18564e().mo18591D(), C6457y.f18257u)) {
                return m26581r(token, htmlTreeBuilder);
            } else {
                if (!htmlTreeBuilder.mo18465K("td") && !htmlTreeBuilder.mo18465K("th")) {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                }
            }
            m26582s(htmlTreeBuilder);
            return htmlTreeBuilder.mo18486f(token);
        }
    },
    InSelect {
        /* renamed from: r */
        private boolean m26584r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.mo18502p(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
            if (r12.mo18662a().normalName().equals("option") != false) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e8, code lost:
            if (r12.mo18662a().normalName().equals("optgroup") != false) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0112, code lost:
            if (r12.mo18662a().normalName().equals("option") != false) goto L_0x0114;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
            if (r12.mo18662a().normalName().equals("html") == false) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
            r12.mo18502p(r10);
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo18637q(org.jsoup.parser.Token r11, org.jsoup.parser.HtmlTreeBuilder r12) {
            /*
                r10 = this;
                int[] r0 = org.jsoup.parser.C6432a.C6448p.f18236a
                org.jsoup.parser.Token$TokenType r1 = r11.f18189a
                int r1 = r1.ordinal()
                r0 = r0[r1]
                java.lang.String r1 = "html"
                r2 = 1
                java.lang.String r3 = "select"
                r4 = 0
                java.lang.String r5 = "optgroup"
                java.lang.String r6 = "option"
                switch(r0) {
                    case 1: goto L_0x018b;
                    case 2: goto L_0x0187;
                    case 3: goto L_0x00eb;
                    case 4: goto L_0x004a;
                    case 5: goto L_0x002f;
                    case 6: goto L_0x001c;
                    default: goto L_0x0017;
                }
            L_0x0017:
                boolean r11 = r10.m26584r(r11, r12)
                return r11
            L_0x001c:
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r1)
                if (r11 != 0) goto L_0x0192
            L_0x002a:
                r12.mo18502p(r10)
                goto L_0x0192
            L_0x002f:
                org.jsoup.parser.Token$c r11 = r11.mo18560a()
                java.lang.String r0 = r11.mo18576q()
                java.lang.String r1 = org.jsoup.parser.C6432a.f18213C
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0045
                r12.mo18502p(r10)
                return r4
            L_0x0045:
                r12.mo18468N(r11)
                goto L_0x0192
            L_0x004a:
                org.jsoup.parser.Token$g r0 = r11.mo18563d()
                java.lang.String r0 = r0.mo18591D()
                r1 = -1
                int r7 = r0.hashCode()
                r8 = -1010136971(0xffffffffc3ca8875, float:-405.06607)
                r9 = 2
                if (r7 == r8) goto L_0x0078
                r8 = -906021636(0xffffffffc9ff34fc, float:-2090655.5)
                if (r7 == r8) goto L_0x0070
                r3 = -80773204(0xfffffffffb2f7fac, float:-9.1124144E35)
                if (r7 == r3) goto L_0x0068
                goto L_0x007f
            L_0x0068:
                boolean r3 = r0.equals(r5)
                if (r3 == 0) goto L_0x007f
                r1 = 0
                goto L_0x007f
            L_0x0070:
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L_0x007f
                r1 = 2
                goto L_0x007f
            L_0x0078:
                boolean r3 = r0.equals(r6)
                if (r3 == 0) goto L_0x007f
                r1 = 1
            L_0x007f:
                if (r1 == 0) goto L_0x00af
                if (r1 == r2) goto L_0x009c
                if (r1 == r9) goto L_0x008a
                boolean r11 = r10.m26584r(r11, r12)
                return r11
            L_0x008a:
                boolean r11 = r12.mo18464H(r0)
                if (r11 != 0) goto L_0x0094
                r12.mo18502p(r10)
                return r4
            L_0x0094:
                r12.mo18494k0(r0)
                r12.mo18518w0()
                goto L_0x0192
            L_0x009c:
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r6)
                if (r11 == 0) goto L_0x002a
            L_0x00aa:
                r12.mo18490i0()
                goto L_0x0192
            L_0x00af:
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r6)
                if (r11 == 0) goto L_0x00dc
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                org.jsoup.nodes.Element r11 = r12.mo18491j(r11)
                if (r11 == 0) goto L_0x00dc
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                org.jsoup.nodes.Element r11 = r12.mo18491j(r11)
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r5)
                if (r11 == 0) goto L_0x00dc
                r12.mo18664g(r6)
            L_0x00dc:
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r5)
                if (r11 == 0) goto L_0x002a
                goto L_0x00aa
            L_0x00eb:
                org.jsoup.parser.Token$h r0 = r11.mo18564e()
                java.lang.String r7 = r0.mo18591D()
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0100
                org.jsoup.parser.a r11 = org.jsoup.parser.C6432a.InBody
                boolean r11 = r12.mo18497m0(r0, r11)
                return r11
            L_0x0100:
                boolean r1 = r7.equals(r6)
                if (r1 == 0) goto L_0x011c
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r6)
                if (r11 == 0) goto L_0x0117
            L_0x0114:
                r12.mo18664g(r6)
            L_0x0117:
                r12.mo18466L(r0)
                goto L_0x0192
            L_0x011c:
                boolean r1 = r7.equals(r5)
                if (r1 == 0) goto L_0x0143
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r6)
                if (r11 == 0) goto L_0x0131
                goto L_0x0114
            L_0x0131:
                org.jsoup.nodes.Element r11 = r12.mo18662a()
                java.lang.String r11 = r11.normalName()
                boolean r11 = r11.equals(r5)
                if (r11 == 0) goto L_0x0117
                r12.mo18664g(r5)
                goto L_0x0117
            L_0x0143:
                boolean r1 = r7.equals(r3)
                if (r1 == 0) goto L_0x0151
                r12.mo18502p(r10)
                boolean r11 = r12.mo18664g(r3)
                return r11
            L_0x0151:
                java.lang.String r1 = "input"
                java.lang.String r2 = "keygen"
                java.lang.String r5 = "textarea"
                java.lang.String[] r1 = new java.lang.String[]{r1, r2, r5}
                boolean r1 = org.jsoup.internal.StringUtil.m26277in(r7, r1)
                if (r1 == 0) goto L_0x0173
                r12.mo18502p(r10)
                boolean r11 = r12.mo18464H(r3)
                if (r11 != 0) goto L_0x016b
                return r4
            L_0x016b:
                r12.mo18664g(r3)
                boolean r11 = r12.mo18486f(r0)
                return r11
            L_0x0173:
                java.lang.String r0 = "script"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0182
                org.jsoup.parser.a r0 = org.jsoup.parser.C6432a.InHead
                boolean r11 = r12.mo18497m0(r11, r0)
                return r11
            L_0x0182:
                boolean r11 = r10.m26584r(r11, r12)
                return r11
            L_0x0187:
                r12.mo18502p(r10)
                return r4
            L_0x018b:
                org.jsoup.parser.Token$d r11 = r11.mo18561b()
                r12.mo18469O(r11)
            L_0x0192:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6432a.C6439g.mo18637q(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    InSelectInTable {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18571l() && StringUtil.m26277in(token.mo18564e().mo18591D(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                htmlTreeBuilder.mo18502p(this);
                htmlTreeBuilder.mo18664g("select");
                return htmlTreeBuilder.mo18486f(token);
            } else if (!token.mo18570k() || !StringUtil.m26277in(token.mo18563d().mo18591D(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                return htmlTreeBuilder.mo18497m0(token, C6432a.InSelect);
            } else {
                htmlTreeBuilder.mo18502p(this);
                if (!htmlTreeBuilder.mo18465K(token.mo18563d().mo18591D())) {
                    return false;
                }
                htmlTreeBuilder.mo18664g("select");
                return htmlTreeBuilder.mo18486f(token);
            }
        }
    },
    AfterBody {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (C6432a.m26569o(token)) {
                return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
            }
            if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
                return true;
            } else if (token.mo18568i()) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            } else if (token.mo18571l() && token.mo18564e().mo18591D().equals("html")) {
                return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
            } else {
                if (!token.mo18570k() || !token.mo18563d().mo18591D().equals("html")) {
                    if (token.mo18569j()) {
                        return true;
                    }
                    htmlTreeBuilder.mo18502p(this);
                    htmlTreeBuilder.mo18458B0(C6432a.InBody);
                    return htmlTreeBuilder.mo18486f(token);
                } else if (htmlTreeBuilder.mo18477Y()) {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                } else {
                    htmlTreeBuilder.mo18458B0(C6432a.AfterAfterBody);
                    return true;
                }
            }
        }
    },
    InFrameset {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            C6432a aVar;
            if (C6432a.m26569o(token)) {
                htmlTreeBuilder.mo18468N(token.mo18560a());
            } else if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
            } else if (token.mo18568i()) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            } else if (token.mo18571l()) {
                Token.C6429h e = token.mo18564e();
                String D = e.mo18591D();
                char c = 65535;
                switch (D.hashCode()) {
                    case -1644953643:
                        if (D.equals("frameset")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3213227:
                        if (D.equals("html")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 97692013:
                        if (D.equals("frame")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (D.equals("noframes")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    aVar = C6432a.InBody;
                } else if (c == 1) {
                    htmlTreeBuilder.mo18466L(e);
                } else if (c == 2) {
                    htmlTreeBuilder.mo18470P(e);
                } else if (c != 3) {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                } else {
                    aVar = C6432a.InHead;
                }
                return htmlTreeBuilder.mo18497m0(e, aVar);
            } else if (!token.mo18570k() || !token.mo18563d().mo18591D().equals("frameset")) {
                if (!token.mo18569j()) {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                } else if (!htmlTreeBuilder.mo18662a().normalName().equals("html")) {
                    htmlTreeBuilder.mo18502p(this);
                }
            } else if (htmlTreeBuilder.mo18662a().normalName().equals("html")) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            } else {
                htmlTreeBuilder.mo18490i0();
                if (!htmlTreeBuilder.mo18477Y() && !htmlTreeBuilder.mo18662a().normalName().equals("frameset")) {
                    htmlTreeBuilder.mo18458B0(C6432a.AfterFrameset);
                }
            }
            return true;
        }
    },
    AfterFrameset {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            C6432a aVar;
            if (C6432a.m26569o(token)) {
                htmlTreeBuilder.mo18468N(token.mo18560a());
                return true;
            } else if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
                return true;
            } else if (token.mo18568i()) {
                htmlTreeBuilder.mo18502p(this);
                return false;
            } else {
                if (token.mo18571l() && token.mo18564e().mo18591D().equals("html")) {
                    aVar = C6432a.InBody;
                } else if (token.mo18570k() && token.mo18563d().mo18591D().equals("html")) {
                    htmlTreeBuilder.mo18458B0(C6432a.AfterAfterFrameset);
                    return true;
                } else if (token.mo18571l() && token.mo18564e().mo18591D().equals("noframes")) {
                    aVar = C6432a.InHead;
                } else if (token.mo18569j()) {
                    return true;
                } else {
                    htmlTreeBuilder.mo18502p(this);
                    return false;
                }
                return htmlTreeBuilder.mo18497m0(token, aVar);
            }
        }
    },
    AfterAfterBody {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
                return true;
            } else if (token.mo18568i() || C6432a.m26569o(token) || (token.mo18571l() && token.mo18564e().mo18591D().equals("html"))) {
                return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
            } else {
                if (token.mo18569j()) {
                    return true;
                }
                htmlTreeBuilder.mo18502p(this);
                htmlTreeBuilder.mo18458B0(C6432a.InBody);
                return htmlTreeBuilder.mo18486f(token);
            }
        }
    },
    AfterAfterFrameset {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.mo18567h()) {
                htmlTreeBuilder.mo18469O(token.mo18561b());
                return true;
            } else if (token.mo18568i() || C6432a.m26569o(token) || (token.mo18571l() && token.mo18564e().mo18591D().equals("html"))) {
                return htmlTreeBuilder.mo18497m0(token, C6432a.InBody);
            } else {
                if (token.mo18569j()) {
                    return true;
                }
                if (token.mo18571l() && token.mo18564e().mo18591D().equals("noframes")) {
                    return htmlTreeBuilder.mo18497m0(token, C6432a.InHead);
                }
                htmlTreeBuilder.mo18502p(this);
                return false;
            }
        }
    },
    ForeignContent {
        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return true;
        }
    };
    
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static String f18213C;

    /* renamed from: org.jsoup.parser.a$p */
    static /* synthetic */ class C6448p {

        /* renamed from: a */
        static final /* synthetic */ int[] f18236a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.jsoup.parser.Token$TokenType[] r0 = org.jsoup.parser.Token.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18236a = r0
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Comment     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18236a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Doctype     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18236a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.StartTag     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18236a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EndTag     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18236a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Character     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18236a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6432a.C6448p.<clinit>():void");
        }
    }

    /* renamed from: org.jsoup.parser.a$y */
    static final class C6457y {

        /* renamed from: a */
        static final String[] f18237a = null;

        /* renamed from: b */
        static final String[] f18238b = null;

        /* renamed from: c */
        static final String[] f18239c = null;

        /* renamed from: d */
        static final String[] f18240d = null;

        /* renamed from: e */
        static final String[] f18241e = null;

        /* renamed from: f */
        static final String[] f18242f = null;

        /* renamed from: g */
        static final String[] f18243g = null;

        /* renamed from: h */
        static final String[] f18244h = null;

        /* renamed from: i */
        static final String[] f18245i = null;

        /* renamed from: j */
        static final String[] f18246j = null;

        /* renamed from: k */
        static final String[] f18247k = null;

        /* renamed from: l */
        static final String[] f18248l = null;

        /* renamed from: m */
        static final String[] f18249m = null;

        /* renamed from: n */
        static final String[] f18250n = null;

        /* renamed from: o */
        static final String[] f18251o = null;

        /* renamed from: p */
        static final String[] f18252p = null;

        /* renamed from: q */
        static final String[] f18253q = null;

        /* renamed from: r */
        static final String[] f18254r = null;

        /* renamed from: s */
        static final String[] f18255s = null;

        /* renamed from: t */
        static final String[] f18256t = null;

        /* renamed from: u */
        static final String[] f18257u = null;

        static {
            f18237a = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
            f18238b = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            f18239c = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            f18240d = new String[]{"listing", "pre"};
            f18241e = new String[]{"address", "div", "p"};
            f18242f = new String[]{"dd", "dt"};
            f18243g = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
            f18244h = new String[]{"applet", "marquee", "object"};
            f18245i = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
            f18246j = new String[]{"param", "source", "track"};
            f18247k = new String[]{"action", "name", "prompt"};
            f18248l = new String[]{"optgroup", "option"};
            f18249m = new String[]{"rp", "rt"};
            f18250n = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f18251o = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            f18252p = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            f18253q = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f18254r = new String[]{"td", "th"};
            f18255s = new String[]{"body", "caption", "col", "colgroup", "html"};
            f18256t = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f18257u = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        }
    }

    static {
        f18213C = String.valueOf(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m26566l(Token.C6429h hVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.f18352c.mo18659u(C6459c.Rawtext);
        htmlTreeBuilder.mo18483d0();
        htmlTreeBuilder.mo18458B0(Text);
        htmlTreeBuilder.mo18466L(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m26567m(Token.C6429h hVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.f18352c.mo18659u(C6459c.Rcdata);
        htmlTreeBuilder.mo18483d0();
        htmlTreeBuilder.mo18458B0(Text);
        htmlTreeBuilder.mo18466L(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m26568n(String str) {
        return StringUtil.isBlank(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static boolean m26569o(Token token) {
        if (token.mo18566g()) {
            return m26568n(token.mo18560a().mo18576q());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo18637q(Token token, HtmlTreeBuilder htmlTreeBuilder);
}
