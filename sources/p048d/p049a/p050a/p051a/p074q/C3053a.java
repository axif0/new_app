package p048d.p049a.p050a.p051a.p074q;

import com.karumi.dexter.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: d.a.a.a.q.a */
public class C3053a {

    /* renamed from: a */
    private static SecretKeySpec f9746a;

    /* renamed from: b */
    private static Cipher f9747b;

    /* renamed from: c */
    public static String f9748c;

    public C3053a() throws Exception {
        if (f9746a == null && f9747b == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                sb.append("abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ0123456789".charAt(new Random().nextInt(60) + 0));
            }
            f9746a = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(sb.toString().getBytes(StandardCharsets.UTF_8)), "AES");
            f9747b = Cipher.getInstance("AES/ECB/PKCS5Padding");
            f9748c = sb.toString();
        }
    }

    public C3053a(String str) throws Exception {
        if (f9746a == null && f9747b == null) {
            f9746a = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8)), "AES");
            f9747b = Cipher.getInstance("AES/ECB/PKCS5Padding");
        }
    }

    /* renamed from: a */
    public String mo10644a(String str) {
        try {
            String[] split = str.replace("[", BuildConfig.FLAVOR).replace("]", BuildConfig.FLAVOR).split(",");
            byte[] bArr = new byte[split.length];
            for (int i = 0; i < split.length; i++) {
                bArr[i] = Byte.parseByte(split[i].trim());
            }
            return new String(mo10645b(bArr), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public byte[] mo10645b(byte[] bArr) throws Exception {
        f9747b.init(2, f9746a);
        return f9747b.doFinal(bArr);
    }

    /* renamed from: c */
    public String mo10646c(String str) {
        try {
            return Arrays.toString(mo10647d(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public byte[] mo10647d(byte[] bArr) throws Exception {
        f9747b.init(1, f9746a);
        return f9747b.doFinal(bArr);
    }
}
