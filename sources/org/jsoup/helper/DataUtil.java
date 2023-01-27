package org.jsoup.helper;

import com.karumi.dexter.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;

public final class DataUtil {

    /* renamed from: a */
    private static final Pattern f18023a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b */
    private static final char[] f18024b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: org.jsoup.helper.DataUtil$a */
    private static class C6406a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f18025a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f18026b;

        public C6406a(String str, boolean z) {
            this.f18025a = str;
            this.f18026b = z;
        }
    }

    private DataUtil() {
    }

    /* renamed from: a */
    static void m26242a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[32768];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private static C6406a m26243b(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        if ((bArr[0] == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (bArr[0] == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new C6406a("UTF-32", false);
        }
        if ((bArr[0] == -2 && bArr[1] == -1) || (bArr[0] == -1 && bArr[1] == -2)) {
            return new C6406a("UTF-16", false);
        }
        if (bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new C6406a("UTF-8", true);
        }
        return null;
    }

    /* renamed from: c */
    static ByteBuffer m26244c() {
        return ByteBuffer.allocate(0);
    }

    /* renamed from: d */
    static String m26245d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f18023a.matcher(str);
        if (matcher.find()) {
            return m26248g(matcher.group(1).trim().replace("charset=", BuildConfig.FLAVOR));
        }
        return null;
    }

    /* renamed from: e */
    static String m26246e() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = f18024b;
            borrowBuilder.append(cArr[random.nextInt(cArr.length)]);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    /* renamed from: f */
    static Document m26247f(InputStream inputStream, String str, String str2, Parser parser) throws IOException {
        XmlDeclaration xmlDeclaration;
        if (inputStream == null) {
            return new Document(str2);
        }
        ConstrainableInputStream wrap = ConstrainableInputStream.wrap(inputStream, 32768, 0);
        wrap.mark(32768);
        ByteBuffer readToByteBuffer = readToByteBuffer(wrap, 5119);
        boolean z = wrap.read() == -1;
        wrap.reset();
        C6406a b = m26243b(readToByteBuffer);
        if (b != null) {
            str = b.f18025a;
        }
        Document document = null;
        if (str == null) {
            try {
                Document parseInput = parser.parseInput(Charset.forName("UTF-8").decode(readToByteBuffer).toString(), str2);
                Iterator it = parseInput.select("meta[http-equiv=content-type], meta[charset]").iterator();
                String str3 = null;
                while (it.hasNext()) {
                    Element element = (Element) it.next();
                    if (element.hasAttr("http-equiv")) {
                        str3 = m26245d(element.attr("content"));
                    }
                    if (str3 == null && element.hasAttr("charset")) {
                        str3 = element.attr("charset");
                        continue;
                    }
                    if (str3 != null) {
                        break;
                    }
                }
                if (str3 == null && parseInput.childNodeSize() > 0) {
                    Node childNode = parseInput.childNode(0);
                    if (childNode instanceof XmlDeclaration) {
                        xmlDeclaration = (XmlDeclaration) childNode;
                    } else {
                        if (childNode instanceof Comment) {
                            Comment comment = (Comment) childNode;
                            if (comment.isXmlDeclaration()) {
                                xmlDeclaration = comment.asXmlDeclaration();
                            }
                        }
                        xmlDeclaration = null;
                    }
                    if (xmlDeclaration != null && xmlDeclaration.name().equalsIgnoreCase("xml")) {
                        str3 = xmlDeclaration.attr("encoding");
                    }
                }
                String g = m26248g(str3);
                if (g != null && !g.equalsIgnoreCase("UTF-8")) {
                    str = g.trim().replaceAll("[\"']", BuildConfig.FLAVOR);
                } else if (z) {
                    document = parseInput;
                }
            } catch (UncheckedIOException e) {
                throw e.ioException();
            }
        } else {
            Validate.notEmpty(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (document == null) {
            if (str == null) {
                str = "UTF-8";
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(wrap, str), 32768);
            if (b != null && b.f18026b) {
                bufferedReader.skip(1);
            }
            try {
                document = parser.parseInput((Reader) bufferedReader, str2);
                Charset forName = Charset.forName(str);
                document.outputSettings().charset(forName);
                if (!forName.canEncode()) {
                    document.charset(Charset.forName("UTF-8"));
                }
            } catch (UncheckedIOException e2) {
                throw e2.ioException();
            }
        }
        wrap.close();
        return document;
    }

    /* renamed from: g */
    private static String m26248g(String str) {
        if (!(str == null || str.length() == 0)) {
            String replaceAll = str.trim().replaceAll("[\"']", BuildConfig.FLAVOR);
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }

    public static Document load(File file, String str, String str2) throws IOException {
        return m26247f(new FileInputStream(file), str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2) throws IOException {
        return m26247f(inputStream, str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2, Parser parser) throws IOException {
        return m26247f(inputStream, str, str2, parser);
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i) throws IOException {
        Validate.isTrue(i >= 0, "maxSize must be 0 (unlimited) or larger");
        return ConstrainableInputStream.wrap(inputStream, 32768, i).readToByteBuffer(i);
    }
}
