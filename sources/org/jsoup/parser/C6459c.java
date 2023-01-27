package org.jsoup.parser;

import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.c */
enum C6459c {
    Data {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char current = characterReader.current();
            if (current != 0) {
                if (current == '&') {
                    cVar = C6459c.CharacterReferenceInData;
                } else if (current == '<') {
                    cVar = C6459c.TagOpen;
                } else if (current != 65535) {
                    bVar.mo18648j(characterReader.mo18430d());
                    return;
                } else {
                    bVar.mo18649k(new Token.C6427f());
                    return;
                }
                bVar.mo18640a(cVar);
                return;
            }
            bVar.mo18656r(this);
            bVar.mo18647i(characterReader.mo18426c());
        }
    },
    CharacterReferenceInData {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26638q(bVar, C6459c.Data);
        }
    },
    Rcdata {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char current = characterReader.current();
            if (current != 0) {
                if (current == '&') {
                    cVar = C6459c.CharacterReferenceInRcdata;
                } else if (current == '<') {
                    cVar = C6459c.RcdataLessthanSign;
                } else if (current != 65535) {
                    bVar.mo18648j(characterReader.consumeToAny('&', '<', 0));
                    return;
                } else {
                    bVar.mo18649k(new Token.C6427f());
                    return;
                }
                bVar.mo18640a(cVar);
                return;
            }
            bVar.mo18656r(this);
            characterReader.advance();
            bVar.mo18647i(65533);
        }
    },
    CharacterReferenceInRcdata {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26638q(bVar, C6459c.Rcdata);
        }
    },
    Rawtext {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26639r(bVar, characterReader, this, C6459c.RawtextLessthanSign);
        }
    },
    ScriptData {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26639r(bVar, characterReader, this, C6459c.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                bVar.mo18656r(this);
                characterReader.advance();
                bVar.mo18647i(65533);
            } else if (current != 65535) {
                bVar.mo18648j(characterReader.consumeTo(0));
            } else {
                bVar.mo18649k(new Token.C6427f());
            }
        }
    },
    TagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            C6459c cVar2;
            char current = characterReader.current();
            if (current == '!') {
                cVar = C6459c.MarkupDeclarationOpen;
            } else if (current == '/') {
                cVar = C6459c.EndTagOpen;
            } else if (current != '?') {
                if (characterReader.mo18453y()) {
                    bVar.mo18645g(true);
                    cVar2 = C6459c.TagName;
                } else {
                    bVar.mo18656r(this);
                    bVar.mo18647i('<');
                    cVar2 = C6459c.Data;
                }
                bVar.mo18659u(cVar2);
                return;
            } else {
                cVar = C6459c.BogusComment;
            }
            bVar.mo18640a(cVar);
        }
    },
    EndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.isEmpty()) {
                bVar.mo18654p(this);
                bVar.mo18648j("</");
                cVar = C6459c.Data;
            } else if (characterReader.mo18453y()) {
                bVar.mo18645g(false);
                cVar = C6459c.TagName;
            } else {
                boolean s = characterReader.mo18446s('>');
                bVar.mo18656r(this);
                bVar.mo18640a(s ? C6459c.Data : C6459c.BogusComment);
                return;
            }
            bVar.mo18659u(cVar);
        }
    },
    TagName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            bVar.f18268i.mo18599v(characterReader.mo18435i());
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != ' ') {
                    if (c != '/') {
                        if (c == '<') {
                            bVar.mo18656r(this);
                            characterReader.mo18424D();
                        } else if (c != '>') {
                            if (c == 65535) {
                                bVar.mo18654p(this);
                                cVar = C6459c.Data;
                            } else if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                                bVar.f18268i.mo18598u(c);
                                return;
                            }
                        }
                        bVar.mo18653o();
                        cVar = C6459c.Data;
                    } else {
                        cVar = C6459c.SelfClosingStartTag;
                    }
                    bVar.mo18659u(cVar);
                    return;
                }
                cVar = C6459c.BeforeAttributeName;
                bVar.mo18659u(cVar);
                return;
            }
            bVar.f18268i.mo18599v(C6459c.f18347y0);
        }
    },
    RcdataLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.mo18446s('/')) {
                bVar.mo18646h();
                bVar.mo18640a(C6459c.RCDATAEndTagOpen);
                return;
            }
            if (characterReader.mo18453y() && bVar.mo18641b() != null) {
                if (!characterReader.mo18440m("</" + bVar.mo18641b())) {
                    Token.C6430i g = bVar.mo18645g(false);
                    g.mo18589B(bVar.mo18641b());
                    bVar.f18268i = g;
                    bVar.mo18653o();
                    characterReader.mo18424D();
                    cVar = C6459c.Data;
                    bVar.mo18659u(cVar);
                }
            }
            bVar.mo18648j("<");
            cVar = C6459c.Rcdata;
            bVar.mo18659u(cVar);
        }
    },
    RCDATAEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            if (characterReader.mo18453y()) {
                bVar.mo18645g(false);
                bVar.f18268i.mo18598u(characterReader.current());
                bVar.f18267h.append(characterReader.current());
                bVar.mo18640a(C6459c.RCDATAEndTagName);
                return;
            }
            bVar.mo18648j("</");
            bVar.mo18659u(C6459c.Rcdata);
        }
    },
    RCDATAEndTagName {
        /* renamed from: t */
        private void m26651t(C6458b bVar, CharacterReader characterReader) {
            bVar.mo18648j("</" + bVar.f18267h.toString());
            characterReader.mo18424D();
            bVar.mo18659u(C6459c.Rcdata);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.mo18453y()) {
                String g = characterReader.mo18433g();
                bVar.f18268i.mo18599v(g);
                bVar.f18267h.append(g);
                return;
            }
            char c = characterReader.mo18426c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                if (bVar.mo18657s()) {
                    cVar = C6459c.BeforeAttributeName;
                    bVar.mo18659u(cVar);
                    return;
                }
            } else if (c != '/') {
                if (c == '>' && bVar.mo18657s()) {
                    bVar.mo18653o();
                    cVar = C6459c.Data;
                    bVar.mo18659u(cVar);
                    return;
                }
            } else if (bVar.mo18657s()) {
                cVar = C6459c.SelfClosingStartTag;
                bVar.mo18659u(cVar);
                return;
            }
            m26651t(bVar, characterReader);
        }
    },
    RawtextLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            if (characterReader.mo18446s('/')) {
                bVar.mo18646h();
                bVar.mo18640a(C6459c.RawtextEndTagOpen);
                return;
            }
            bVar.mo18647i('<');
            bVar.mo18659u(C6459c.Rawtext);
        }
    },
    RawtextEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26640s(bVar, characterReader, C6459c.RawtextEndTagName, C6459c.Rawtext);
        }
    },
    RawtextEndTagName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26637n(bVar, characterReader, C6459c.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c == '!') {
                bVar.mo18648j("<!");
                cVar = C6459c.ScriptDataEscapeStart;
            } else if (c != '/') {
                bVar.mo18648j("<");
                characterReader.mo18424D();
                cVar = C6459c.ScriptData;
            } else {
                bVar.mo18646h();
                cVar = C6459c.ScriptDataEndTagOpen;
            }
            bVar.mo18659u(cVar);
        }
    },
    ScriptDataEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26640s(bVar, characterReader, C6459c.ScriptDataEndTagName, C6459c.ScriptData);
        }
    },
    ScriptDataEndTagName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26637n(bVar, characterReader, C6459c.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            if (characterReader.mo18446s('-')) {
                bVar.mo18647i('-');
                bVar.mo18640a(C6459c.ScriptDataEscapeStartDash);
                return;
            }
            bVar.mo18659u(C6459c.ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            if (characterReader.mo18446s('-')) {
                bVar.mo18647i('-');
                bVar.mo18640a(C6459c.ScriptDataEscapedDashDash);
                return;
            }
            bVar.mo18659u(C6459c.ScriptData);
        }
    },
    ScriptDataEscaped {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.isEmpty()) {
                bVar.mo18654p(this);
                bVar.mo18659u(C6459c.Data);
                return;
            }
            char current = characterReader.current();
            if (current != 0) {
                if (current == '-') {
                    bVar.mo18647i('-');
                    cVar = C6459c.ScriptDataEscapedDash;
                } else if (current != '<') {
                    bVar.mo18648j(characterReader.consumeToAny('-', '<', 0));
                    return;
                } else {
                    cVar = C6459c.ScriptDataEscapedLessthanSign;
                }
                bVar.mo18640a(cVar);
                return;
            }
            bVar.mo18656r(this);
            characterReader.advance();
            bVar.mo18647i(65533);
        }
    },
    ScriptDataEscapedDash {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.isEmpty()) {
                bVar.mo18654p(this);
                bVar.mo18659u(C6459c.Data);
                return;
            }
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c == '-') {
                    bVar.mo18647i(c);
                    cVar = C6459c.ScriptDataEscapedDashDash;
                } else if (c == '<') {
                    cVar = C6459c.ScriptDataEscapedLessthanSign;
                }
                bVar.mo18659u(cVar);
            }
            bVar.mo18656r(this);
            c = 65533;
            bVar.mo18647i(c);
            cVar = C6459c.ScriptDataEscaped;
            bVar.mo18659u(cVar);
        }
    },
    ScriptDataEscapedDashDash {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.isEmpty()) {
                bVar.mo18654p(this);
                bVar.mo18659u(C6459c.Data);
                return;
            }
            char c = characterReader.mo18426c();
            if (c == 0) {
                bVar.mo18656r(this);
                bVar.mo18647i(65533);
            } else if (c != '-') {
                if (c != '<') {
                    bVar.mo18647i(c);
                    if (c == '>') {
                        cVar = C6459c.ScriptData;
                    }
                } else {
                    cVar = C6459c.ScriptDataEscapedLessthanSign;
                }
                bVar.mo18659u(cVar);
            } else {
                bVar.mo18647i(c);
                return;
            }
            cVar = C6459c.ScriptDataEscaped;
            bVar.mo18659u(cVar);
        }
    },
    ScriptDataEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.mo18453y()) {
                bVar.mo18646h();
                bVar.f18267h.append(characterReader.current());
                bVar.mo18648j("<" + characterReader.current());
                cVar = C6459c.ScriptDataDoubleEscapeStart;
            } else if (characterReader.mo18446s('/')) {
                bVar.mo18646h();
                cVar = C6459c.ScriptDataEscapedEndTagOpen;
            } else {
                bVar.mo18647i('<');
                bVar.mo18659u(C6459c.ScriptDataEscaped);
                return;
            }
            bVar.mo18640a(cVar);
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            if (characterReader.mo18453y()) {
                bVar.mo18645g(false);
                bVar.f18268i.mo18598u(characterReader.current());
                bVar.f18267h.append(characterReader.current());
                bVar.mo18640a(C6459c.ScriptDataEscapedEndTagName);
                return;
            }
            bVar.mo18648j("</");
            bVar.mo18659u(C6459c.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26637n(bVar, characterReader, C6459c.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26636m(bVar, characterReader, C6459c.ScriptDataDoubleEscaped, C6459c.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char current = characterReader.current();
            if (current != 0) {
                if (current == '-') {
                    bVar.mo18647i(current);
                    cVar = C6459c.ScriptDataDoubleEscapedDash;
                } else if (current == '<') {
                    bVar.mo18647i(current);
                    cVar = C6459c.ScriptDataDoubleEscapedLessthanSign;
                } else if (current != 65535) {
                    bVar.mo18648j(characterReader.consumeToAny('-', '<', 0));
                    return;
                } else {
                    bVar.mo18654p(this);
                    bVar.mo18659u(C6459c.Data);
                    return;
                }
                bVar.mo18640a(cVar);
                return;
            }
            bVar.mo18656r(this);
            characterReader.advance();
            bVar.mo18647i(65533);
        }
    },
    ScriptDataDoubleEscapedDash {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c == '-') {
                    bVar.mo18647i(c);
                    cVar = C6459c.ScriptDataDoubleEscapedDashDash;
                } else if (c == '<') {
                    bVar.mo18647i(c);
                    cVar = C6459c.ScriptDataDoubleEscapedLessthanSign;
                } else if (c == 65535) {
                    bVar.mo18654p(this);
                    cVar = C6459c.Data;
                }
                bVar.mo18659u(cVar);
            }
            bVar.mo18656r(this);
            c = 65533;
            bVar.mo18647i(c);
            cVar = C6459c.ScriptDataDoubleEscaped;
            bVar.mo18659u(cVar);
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c == 0) {
                bVar.mo18656r(this);
                c = 65533;
            } else if (c != '-') {
                if (c == '<') {
                    bVar.mo18647i(c);
                    cVar = C6459c.ScriptDataDoubleEscapedLessthanSign;
                } else if (c == '>') {
                    bVar.mo18647i(c);
                    cVar = C6459c.ScriptData;
                } else if (c == 65535) {
                    bVar.mo18654p(this);
                    cVar = C6459c.Data;
                }
                bVar.mo18659u(cVar);
            } else {
                bVar.mo18647i(c);
                return;
            }
            bVar.mo18647i(c);
            cVar = C6459c.ScriptDataDoubleEscaped;
            bVar.mo18659u(cVar);
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            if (characterReader.mo18446s('/')) {
                bVar.mo18647i('/');
                bVar.mo18646h();
                bVar.mo18640a(C6459c.ScriptDataDoubleEscapeEnd);
                return;
            }
            bVar.mo18659u(C6459c.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c.m26636m(bVar, characterReader, C6459c.ScriptDataEscaped, C6459c.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
            r3.mo18653o();
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18661o(org.jsoup.parser.C6458b r3, org.jsoup.parser.CharacterReader r4) {
            /*
                r2 = this;
                char r0 = r4.mo18426c()
                if (r0 == 0) goto L_0x0053
                r1 = 32
                if (r0 == r1) goto L_0x0061
                r1 = 34
                if (r0 == r1) goto L_0x0045
                r1 = 39
                if (r0 == r1) goto L_0x0045
                r1 = 47
                if (r0 == r1) goto L_0x0042
                r1 = 65535(0xffff, float:9.1834E-41)
                if (r0 == r1) goto L_0x003e
                r1 = 9
                if (r0 == r1) goto L_0x0061
                r1 = 10
                if (r0 == r1) goto L_0x0061
                r1 = 12
                if (r0 == r1) goto L_0x0061
                r1 = 13
                if (r0 == r1) goto L_0x0061
                switch(r0) {
                    case 60: goto L_0x002f;
                    case 61: goto L_0x0045;
                    case 62: goto L_0x0035;
                    default: goto L_0x002e;
                }
            L_0x002e:
                goto L_0x0056
            L_0x002f:
                r3.mo18656r(r2)
                r4.mo18424D()
            L_0x0035:
                r3.mo18653o()
            L_0x0038:
                org.jsoup.parser.c r4 = org.jsoup.parser.C6459c.Data
            L_0x003a:
                r3.mo18659u(r4)
                goto L_0x0061
            L_0x003e:
                r3.mo18654p(r2)
                goto L_0x0038
            L_0x0042:
                org.jsoup.parser.c r4 = org.jsoup.parser.C6459c.SelfClosingStartTag
                goto L_0x003a
            L_0x0045:
                r3.mo18656r(r2)
                org.jsoup.parser.Token$i r4 = r3.f18268i
                r4.mo18590C()
                org.jsoup.parser.Token$i r4 = r3.f18268i
                r4.mo18593p(r0)
                goto L_0x005e
            L_0x0053:
                r3.mo18656r(r2)
            L_0x0056:
                org.jsoup.parser.Token$i r0 = r3.f18268i
                r0.mo18590C()
                r4.mo18424D()
            L_0x005e:
                org.jsoup.parser.c r4 = org.jsoup.parser.C6459c.AttributeName
                goto L_0x003a
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6459c.C6461a0.mo18661o(org.jsoup.parser.b, org.jsoup.parser.CharacterReader):void");
        }
    },
    AttributeName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            Token.C6430i iVar;
            C6459c cVar;
            bVar.f18268i.mo18594q(characterReader.mo18438k(C6459c.f18343w0));
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != ' ') {
                    if (!(c == '\"' || c == '\'')) {
                        if (c != '/') {
                            if (c != 65535) {
                                if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                                    switch (c) {
                                        case '<':
                                            break;
                                        case '=':
                                            cVar = C6459c.BeforeAttributeValue;
                                            break;
                                        case '>':
                                            bVar.mo18653o();
                                            break;
                                    }
                                }
                            } else {
                                bVar.mo18654p(this);
                            }
                            cVar = C6459c.Data;
                        } else {
                            cVar = C6459c.SelfClosingStartTag;
                        }
                        bVar.mo18659u(cVar);
                        return;
                    }
                    bVar.mo18656r(this);
                    iVar = bVar.f18268i;
                }
                cVar = C6459c.AfterAttributeName;
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            iVar = bVar.f18268i;
            c = 65533;
            iVar.mo18593p(c);
        }
    },
    AfterAttributeName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            Token.C6430i iVar;
            char c = characterReader.mo18426c();
            if (c == 0) {
                bVar.mo18656r(this);
                iVar = bVar.f18268i;
                c = 65533;
            } else if (c != ' ') {
                if (!(c == '\"' || c == '\'')) {
                    if (c != '/') {
                        if (c != 65535) {
                            if (c != 9 && c != 10 && c != 12 && c != 13) {
                                switch (c) {
                                    case '<':
                                        break;
                                    case '=':
                                        cVar = C6459c.BeforeAttributeValue;
                                        break;
                                    case '>':
                                        bVar.mo18653o();
                                        break;
                                    default:
                                        bVar.f18268i.mo18590C();
                                        characterReader.mo18424D();
                                        break;
                                }
                            } else {
                                return;
                            }
                        } else {
                            bVar.mo18654p(this);
                        }
                        cVar = C6459c.Data;
                    } else {
                        cVar = C6459c.SelfClosingStartTag;
                    }
                    bVar.mo18659u(cVar);
                }
                bVar.mo18656r(this);
                bVar.f18268i.mo18590C();
                iVar = bVar.f18268i;
            } else {
                return;
            }
            iVar.mo18593p(c);
            cVar = C6459c.AttributeName;
            bVar.mo18659u(cVar);
        }
    },
    BeforeAttributeValue {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            Token.C6430i iVar;
            char c = characterReader.mo18426c();
            if (c == 0) {
                bVar.mo18656r(this);
                iVar = bVar.f18268i;
                c = 65533;
            } else if (c != ' ') {
                if (c != '\"') {
                    if (c != '`') {
                        if (c == 65535) {
                            bVar.mo18654p(this);
                        } else if (c != 9 && c != 10 && c != 12 && c != 13) {
                            if (c != '&') {
                                if (c != '\'') {
                                    switch (c) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            bVar.mo18656r(this);
                                            break;
                                    }
                                } else {
                                    cVar = C6459c.AttributeValue_singleQuoted;
                                }
                            }
                            characterReader.mo18424D();
                            cVar = C6459c.AttributeValue_unquoted;
                        } else {
                            return;
                        }
                        bVar.mo18653o();
                        cVar = C6459c.Data;
                    }
                    bVar.mo18656r(this);
                    iVar = bVar.f18268i;
                } else {
                    cVar = C6459c.AttributeValue_doubleQuoted;
                }
                bVar.mo18659u(cVar);
            } else {
                return;
            }
            iVar.mo18595r(c);
            cVar = C6459c.AttributeValue_unquoted;
            bVar.mo18659u(cVar);
        }
    },
    AttributeValue_doubleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            Token.C6430i iVar;
            C6459c cVar;
            String consumeToAny = characterReader.consumeToAny(C6459c.f18341v0);
            if (consumeToAny.length() > 0) {
                bVar.f18268i.mo18596s(consumeToAny);
            } else {
                bVar.f18268i.mo18592F();
            }
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c == '\"') {
                    cVar = C6459c.AfterAttributeValue_quoted;
                } else if (c == '&') {
                    int[] d = bVar.mo18642d('\"', true);
                    Token.C6430i iVar2 = bVar.f18268i;
                    if (d != null) {
                        iVar2.mo18597t(d);
                        return;
                    } else {
                        iVar2.mo18595r('&');
                        return;
                    }
                } else if (c != 65535) {
                    iVar = bVar.f18268i;
                } else {
                    bVar.mo18654p(this);
                    cVar = C6459c.Data;
                }
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            iVar = bVar.f18268i;
            c = 65533;
            iVar.mo18595r(c);
        }
    },
    AttributeValue_singleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            Token.C6430i iVar;
            C6459c cVar;
            String consumeToAny = characterReader.consumeToAny(C6459c.f18339u0);
            if (consumeToAny.length() > 0) {
                bVar.f18268i.mo18596s(consumeToAny);
            } else {
                bVar.f18268i.mo18592F();
            }
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c == 65535) {
                    bVar.mo18654p(this);
                    cVar = C6459c.Data;
                } else if (c == '&') {
                    int[] d = bVar.mo18642d('\'', true);
                    Token.C6430i iVar2 = bVar.f18268i;
                    if (d != null) {
                        iVar2.mo18597t(d);
                        return;
                    } else {
                        iVar2.mo18595r('&');
                        return;
                    }
                } else if (c != '\'') {
                    iVar = bVar.f18268i;
                } else {
                    cVar = C6459c.AfterAttributeValue_quoted;
                }
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            iVar = bVar.f18268i;
            c = 65533;
            iVar.mo18595r(c);
        }
    },
    AttributeValue_unquoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            Token.C6430i iVar;
            C6459c cVar;
            String k = characterReader.mo18438k(C6459c.f18345x0);
            if (k.length() > 0) {
                bVar.f18268i.mo18596s(k);
            }
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != ' ') {
                    if (!(c == '\"' || c == '`')) {
                        if (c == 65535) {
                            bVar.mo18654p(this);
                        } else if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                            if (c != '&') {
                                if (c != '\'') {
                                    switch (c) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            bVar.mo18653o();
                                            break;
                                    }
                                }
                            } else {
                                int[] d = bVar.mo18642d('>', true);
                                Token.C6430i iVar2 = bVar.f18268i;
                                if (d != null) {
                                    iVar2.mo18597t(d);
                                    return;
                                } else {
                                    iVar2.mo18595r('&');
                                    return;
                                }
                            }
                        }
                        cVar = C6459c.Data;
                        bVar.mo18659u(cVar);
                        return;
                    }
                    bVar.mo18656r(this);
                    iVar = bVar.f18268i;
                }
                cVar = C6459c.BeforeAttributeName;
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            iVar = bVar.f18268i;
            c = 65533;
            iVar.mo18595r(c);
        }
    },
    AfterAttributeValue_quoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                if (c != '/') {
                    if (c == '>') {
                        bVar.mo18653o();
                    } else if (c != 65535) {
                        bVar.mo18656r(this);
                        characterReader.mo18424D();
                    } else {
                        bVar.mo18654p(this);
                    }
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.SelfClosingStartTag;
                }
                bVar.mo18659u(cVar);
            }
            cVar = C6459c.BeforeAttributeName;
            bVar.mo18659u(cVar);
        }
    },
    SelfClosingStartTag {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c == '>') {
                bVar.f18268i.f18206i = true;
                bVar.mo18653o();
            } else if (c != 65535) {
                bVar.mo18656r(this);
                characterReader.mo18424D();
                cVar = C6459c.BeforeAttributeName;
                bVar.mo18659u(cVar);
            } else {
                bVar.mo18654p(this);
            }
            cVar = C6459c.Data;
            bVar.mo18659u(cVar);
        }
    },
    BogusComment {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            characterReader.mo18424D();
            Token.C6425d dVar = new Token.C6425d();
            dVar.f18193c = true;
            dVar.f18192b.append(characterReader.consumeTo('>'));
            bVar.mo18649k(dVar);
            bVar.mo18640a(C6459c.Data);
        }
    },
    MarkupDeclarationOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.mo18444q("--")) {
                bVar.mo18643e();
                cVar = C6459c.CommentStart;
            } else if (characterReader.mo18445r("DOCTYPE")) {
                cVar = C6459c.Doctype;
            } else if (characterReader.mo18444q("[CDATA[")) {
                bVar.mo18646h();
                cVar = C6459c.CdataSection;
            } else {
                bVar.mo18656r(this);
                bVar.mo18640a(C6459c.BogusComment);
                return;
            }
            bVar.mo18659u(cVar);
        }
    },
    CommentStart {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != '-') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        bVar.f18273n.f18192b.append(c);
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.mo18651m();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.CommentStartDash;
                }
                bVar.mo18659u(cVar);
            }
            bVar.mo18656r(this);
            bVar.f18273n.f18192b.append(65533);
            cVar = C6459c.Comment;
            bVar.mo18659u(cVar);
        }
    },
    CommentStartDash {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != '-') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        bVar.f18273n.f18192b.append(c);
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.mo18651m();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.CommentStartDash;
                }
                bVar.mo18659u(cVar);
            }
            bVar.mo18656r(this);
            bVar.f18273n.f18192b.append(65533);
            cVar = C6459c.Comment;
            bVar.mo18659u(cVar);
        }
    },
    Comment {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                bVar.mo18656r(this);
                characterReader.advance();
                bVar.f18273n.f18192b.append(65533);
            } else if (current == '-') {
                bVar.mo18640a(C6459c.CommentEndDash);
            } else if (current != 65535) {
                bVar.f18273n.f18192b.append(characterReader.consumeToAny('-', 0));
            } else {
                bVar.mo18654p(this);
                bVar.mo18651m();
                bVar.mo18659u(C6459c.Data);
            }
        }
    },
    CommentEndDash {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c == '-') {
                    cVar = C6459c.CommentEnd;
                } else if (c != 65535) {
                    StringBuilder sb = bVar.f18273n.f18192b;
                    sb.append('-');
                    sb.append(c);
                } else {
                    bVar.mo18654p(this);
                    bVar.mo18651m();
                    cVar = C6459c.Data;
                }
                bVar.mo18659u(cVar);
            }
            bVar.mo18656r(this);
            StringBuilder sb2 = bVar.f18273n.f18192b;
            sb2.append('-');
            sb2.append(65533);
            cVar = C6459c.Comment;
            bVar.mo18659u(cVar);
        }
    },
    CommentEnd {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c == '!') {
                    bVar.mo18656r(this);
                    cVar = C6459c.CommentEndBang;
                } else if (c != '-') {
                    if (c != '>') {
                        if (c != 65535) {
                            bVar.mo18656r(this);
                            StringBuilder sb = bVar.f18273n.f18192b;
                            sb.append("--");
                            sb.append(c);
                        } else {
                            bVar.mo18654p(this);
                        }
                    }
                    bVar.mo18651m();
                    cVar = C6459c.Data;
                } else {
                    bVar.mo18656r(this);
                    bVar.f18273n.f18192b.append('-');
                    return;
                }
                bVar.mo18659u(cVar);
            }
            bVar.mo18656r(this);
            StringBuilder sb2 = bVar.f18273n.f18192b;
            sb2.append("--");
            sb2.append(65533);
            cVar = C6459c.Comment;
            bVar.mo18659u(cVar);
        }
    },
    CommentEndBang {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != '-') {
                    if (c != '>') {
                        if (c != 65535) {
                            StringBuilder sb = bVar.f18273n.f18192b;
                            sb.append("--!");
                            sb.append(c);
                        } else {
                            bVar.mo18654p(this);
                        }
                    }
                    bVar.mo18651m();
                    cVar = C6459c.Data;
                } else {
                    bVar.f18273n.f18192b.append("--!");
                    cVar = C6459c.CommentEndDash;
                }
                bVar.mo18659u(cVar);
            }
            bVar.mo18656r(this);
            StringBuilder sb2 = bVar.f18273n.f18192b;
            sb2.append("--!");
            sb2.append(65533);
            cVar = C6459c.Comment;
            bVar.mo18659u(cVar);
        }
    },
    Doctype {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                if (c != '>') {
                    if (c != 65535) {
                        bVar.mo18656r(this);
                    } else {
                        bVar.mo18654p(this);
                    }
                }
                bVar.mo18656r(this);
                bVar.mo18644f();
                bVar.f18272m.f18198f = true;
                bVar.mo18652n();
                cVar = C6459c.Data;
                bVar.mo18659u(cVar);
            }
            cVar = C6459c.BeforeDoctypeName;
            bVar.mo18659u(cVar);
        }
    },
    BeforeDoctypeName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            if (characterReader.mo18453y()) {
                bVar.mo18644f();
                bVar.mo18659u(C6459c.DoctypeName);
                return;
            }
            char c = characterReader.mo18426c();
            if (c == 0) {
                bVar.mo18656r(this);
                bVar.mo18644f();
                bVar.f18272m.f18194b.append(65533);
            } else if (c == ' ') {
                return;
            } else {
                if (c == 65535) {
                    bVar.mo18654p(this);
                    bVar.mo18644f();
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                    bVar.mo18659u(cVar);
                } else if (c != 9 && c != 10 && c != 12 && c != 13) {
                    bVar.mo18644f();
                    bVar.f18272m.f18194b.append(c);
                } else {
                    return;
                }
            }
            cVar = C6459c.DoctypeName;
            bVar.mo18659u(cVar);
        }
    },
    DoctypeName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            StringBuilder sb;
            C6459c cVar;
            if (characterReader.mo18453y()) {
                bVar.f18272m.f18194b.append(characterReader.mo18433g());
                return;
            }
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != ' ') {
                    if (c != '>') {
                        if (c == 65535) {
                            bVar.mo18654p(this);
                            bVar.f18272m.f18198f = true;
                        } else if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                            sb = bVar.f18272m.f18194b;
                        }
                    }
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                    bVar.mo18659u(cVar);
                    return;
                }
                cVar = C6459c.AfterDoctypeName;
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            sb = bVar.f18272m.f18194b;
            c = 65533;
            sb.append(c);
        }
    },
    AfterDoctypeName {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            C6459c cVar2;
            if (characterReader.isEmpty()) {
                bVar.mo18654p(this);
                bVar.f18272m.f18198f = true;
                bVar.mo18652n();
                bVar.mo18659u(C6459c.Data);
            } else if (characterReader.mo18449u(9, 10, 13, 12, ' ')) {
                characterReader.advance();
            } else {
                if (characterReader.mo18446s('>')) {
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    if (characterReader.mo18445r(DocumentType.PUBLIC_KEY)) {
                        bVar.f18272m.f18195c = DocumentType.PUBLIC_KEY;
                        cVar2 = C6459c.AfterDoctypePublicKeyword;
                    } else if (characterReader.mo18445r(DocumentType.SYSTEM_KEY)) {
                        bVar.f18272m.f18195c = DocumentType.SYSTEM_KEY;
                        cVar2 = C6459c.AfterDoctypeSystemKeyword;
                    } else {
                        bVar.mo18656r(this);
                        bVar.f18272m.f18198f = true;
                        cVar = C6459c.BogusDoctype;
                    }
                    bVar.mo18659u(cVar2);
                    return;
                }
                bVar.mo18640a(cVar);
            }
        }
    },
    AfterDoctypePublicKeyword {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                cVar = C6459c.BeforeDoctypePublicIdentifier;
            } else if (c == '\"') {
                bVar.mo18656r(this);
                cVar = C6459c.DoctypePublicIdentifier_doubleQuoted;
            } else if (c != '\'') {
                if (c == '>') {
                    bVar.mo18656r(this);
                } else if (c != 65535) {
                    bVar.mo18656r(this);
                    bVar.f18272m.f18198f = true;
                    cVar = C6459c.BogusDoctype;
                } else {
                    bVar.mo18654p(this);
                }
                bVar.f18272m.f18198f = true;
                bVar.mo18652n();
                cVar = C6459c.Data;
            } else {
                bVar.mo18656r(this);
                cVar = C6459c.DoctypePublicIdentifier_singleQuoted;
            }
            bVar.mo18659u(cVar);
        }
    },
    BeforeDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c == '\"') {
                    cVar = C6459c.DoctypePublicIdentifier_doubleQuoted;
                } else if (c != '\'') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        bVar.mo18656r(this);
                        bVar.f18272m.f18198f = true;
                        cVar = C6459c.BogusDoctype;
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.DoctypePublicIdentifier_singleQuoted;
                }
                bVar.mo18659u(cVar);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            StringBuilder sb;
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != '\"') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        sb = bVar.f18272m.f18196d;
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.AfterDoctypePublicIdentifier;
                }
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            sb = bVar.f18272m.f18196d;
            c = 65533;
            sb.append(c);
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            StringBuilder sb;
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != '\'') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        sb = bVar.f18272m.f18196d;
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.AfterDoctypePublicIdentifier;
                }
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            sb = bVar.f18272m.f18196d;
            c = 65533;
            sb.append(c);
        }
    },
    AfterDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                cVar = C6459c.BetweenDoctypePublicAndSystemIdentifiers;
            } else if (c == '\"') {
                bVar.mo18656r(this);
                cVar = C6459c.DoctypeSystemIdentifier_doubleQuoted;
            } else if (c != '\'') {
                if (c != '>') {
                    if (c != 65535) {
                        bVar.mo18656r(this);
                        bVar.f18272m.f18198f = true;
                        cVar = C6459c.BogusDoctype;
                    } else {
                        bVar.mo18654p(this);
                        bVar.f18272m.f18198f = true;
                    }
                }
                bVar.mo18652n();
                cVar = C6459c.Data;
            } else {
                bVar.mo18656r(this);
                cVar = C6459c.DoctypeSystemIdentifier_singleQuoted;
            }
            bVar.mo18659u(cVar);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c == '\"') {
                    bVar.mo18656r(this);
                    cVar = C6459c.DoctypeSystemIdentifier_doubleQuoted;
                } else if (c != '\'') {
                    if (c != '>') {
                        if (c != 65535) {
                            bVar.mo18656r(this);
                            bVar.f18272m.f18198f = true;
                            cVar = C6459c.BogusDoctype;
                        } else {
                            bVar.mo18654p(this);
                            bVar.f18272m.f18198f = true;
                        }
                    }
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    bVar.mo18656r(this);
                    cVar = C6459c.DoctypeSystemIdentifier_singleQuoted;
                }
                bVar.mo18659u(cVar);
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                cVar = C6459c.BeforeDoctypeSystemIdentifier;
            } else if (c == '\"') {
                bVar.mo18656r(this);
                cVar = C6459c.DoctypeSystemIdentifier_doubleQuoted;
            } else if (c != '\'') {
                if (c == '>') {
                    bVar.mo18656r(this);
                } else if (c != 65535) {
                    bVar.mo18656r(this);
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    return;
                } else {
                    bVar.mo18654p(this);
                }
                bVar.f18272m.f18198f = true;
                bVar.mo18652n();
                cVar = C6459c.Data;
            } else {
                bVar.mo18656r(this);
                cVar = C6459c.DoctypeSystemIdentifier_singleQuoted;
            }
            bVar.mo18659u(cVar);
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c == '\"') {
                    cVar = C6459c.DoctypeSystemIdentifier_doubleQuoted;
                } else if (c != '\'') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        bVar.mo18656r(this);
                        bVar.f18272m.f18198f = true;
                        cVar = C6459c.BogusDoctype;
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.DoctypeSystemIdentifier_singleQuoted;
                }
                bVar.mo18659u(cVar);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            StringBuilder sb;
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != '\"') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        sb = bVar.f18272m.f18197e;
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.AfterDoctypeSystemIdentifier;
                }
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            sb = bVar.f18272m.f18197e;
            c = 65533;
            sb.append(c);
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            StringBuilder sb;
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 0) {
                if (c != '\'') {
                    if (c == '>') {
                        bVar.mo18656r(this);
                    } else if (c != 65535) {
                        sb = bVar.f18272m.f18197e;
                    } else {
                        bVar.mo18654p(this);
                    }
                    bVar.f18272m.f18198f = true;
                    bVar.mo18652n();
                    cVar = C6459c.Data;
                } else {
                    cVar = C6459c.AfterDoctypeSystemIdentifier;
                }
                bVar.mo18659u(cVar);
                return;
            }
            bVar.mo18656r(this);
            sb = bVar.f18272m.f18197e;
            c = 65533;
            sb.append(c);
        }
    },
    AfterDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            C6459c cVar;
            char c = characterReader.mo18426c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c != '>') {
                    if (c != 65535) {
                        bVar.mo18656r(this);
                        cVar = C6459c.BogusDoctype;
                        bVar.mo18659u(cVar);
                    }
                    bVar.mo18654p(this);
                    bVar.f18272m.f18198f = true;
                }
                bVar.mo18652n();
                cVar = C6459c.Data;
                bVar.mo18659u(cVar);
            }
        }
    },
    BogusDoctype {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            char c = characterReader.mo18426c();
            if (c == '>' || c == 65535) {
                bVar.mo18652n();
                bVar.mo18659u(C6459c.Data);
            }
        }
    },
    CdataSection {
        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo18661o(C6458b bVar, CharacterReader characterReader) {
            bVar.f18267h.append(characterReader.mo18437j("]]>"));
            if (characterReader.mo18444q("]]>") || characterReader.isEmpty()) {
                bVar.mo18649k(new Token.C6423b(bVar.f18267h.toString()));
                bVar.mo18659u(C6459c.Data);
            }
        }
    };
    

    /* renamed from: u0 */
    static final char[] f18339u0 = null;

    /* renamed from: v0 */
    static final char[] f18341v0 = null;

    /* renamed from: w0 */
    static final char[] f18343w0 = null;

    /* renamed from: x0 */
    static final char[] f18345x0 = null;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public static final String f18347y0 = null;

    static {
        f18339u0 = new char[]{0, '&', '\''};
        f18341v0 = new char[]{0, '\"', '&'};
        f18343w0 = new char[]{0, 9, 10, 12, 13, ' ', '\"', '\'', '/', '<', '=', '>'};
        f18345x0 = new char[]{0, 9, 10, 12, 13, ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        f18347y0 = String.valueOf(65533);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m26636m(C6458b bVar, CharacterReader characterReader, C6459c cVar, C6459c cVar2) {
        if (characterReader.mo18453y()) {
            String g = characterReader.mo18433g();
            bVar.f18267h.append(g);
            bVar.mo18648j(g);
            return;
        }
        char c = characterReader.mo18426c();
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ' || c == '/' || c == '>') {
            if (bVar.f18267h.toString().equals("script")) {
                bVar.mo18659u(cVar);
            } else {
                bVar.mo18659u(cVar2);
            }
            bVar.mo18647i(c);
            return;
        }
        characterReader.mo18424D();
        bVar.mo18659u(cVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m26637n(C6458b bVar, CharacterReader characterReader, C6459c cVar) {
        C6459c cVar2;
        if (characterReader.mo18453y()) {
            String g = characterReader.mo18433g();
            bVar.f18268i.mo18599v(g);
            bVar.f18267h.append(g);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (bVar.mo18657s() && !characterReader.isEmpty()) {
            char c = characterReader.mo18426c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                cVar2 = BeforeAttributeName;
            } else if (c == '/') {
                cVar2 = SelfClosingStartTag;
            } else if (c != '>') {
                bVar.f18267h.append(c);
                z = true;
                z2 = z;
            } else {
                bVar.mo18653o();
                cVar2 = Data;
            }
            bVar.mo18659u(cVar2);
            z2 = z;
        }
        if (z2) {
            bVar.mo18648j("</" + bVar.f18267h.toString());
            bVar.mo18659u(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m26638q(C6458b bVar, C6459c cVar) {
        int[] d = bVar.mo18642d((Character) null, false);
        if (d == null) {
            bVar.mo18647i('&');
        } else {
            bVar.mo18650l(d);
        }
        bVar.mo18659u(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m26639r(C6458b bVar, CharacterReader characterReader, C6459c cVar, C6459c cVar2) {
        char current = characterReader.current();
        if (current == 0) {
            bVar.mo18656r(cVar);
            characterReader.advance();
            bVar.mo18647i(65533);
        } else if (current == '<') {
            bVar.mo18640a(cVar2);
        } else if (current != 65535) {
            bVar.mo18648j(characterReader.consumeToAny('<', 0));
        } else {
            bVar.mo18649k(new Token.C6427f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static void m26640s(C6458b bVar, CharacterReader characterReader, C6459c cVar, C6459c cVar2) {
        if (characterReader.mo18453y()) {
            bVar.mo18645g(false);
            bVar.mo18659u(cVar);
            return;
        }
        bVar.mo18648j("</");
        bVar.mo18659u(cVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo18661o(C6458b bVar, CharacterReader characterReader);
}
