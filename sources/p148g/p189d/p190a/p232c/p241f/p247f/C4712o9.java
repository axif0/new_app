package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.o9 */
final class C4712o9 {
    /* renamed from: a */
    static String m20058a(C4773s5 s5Var) {
        String str;
        C4760r9 r9Var = new C4760r9(s5Var);
        StringBuilder sb = new StringBuilder(r9Var.mo14557a());
        for (int i = 0; i < r9Var.mo14557a(); i++) {
            int e = r9Var.mo14558e(i);
            if (e == 34) {
                str = "\\\"";
            } else if (e == 39) {
                str = "\\'";
            } else if (e != 92) {
                switch (e) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (e < 32 || e > 126) {
                            sb.append('\\');
                            sb.append((char) (((e >>> 6) & 3) + 48));
                            sb.append((char) (((e >>> 3) & 7) + 48));
                            e = (e & 7) + 48;
                        }
                        sb.append((char) e);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
