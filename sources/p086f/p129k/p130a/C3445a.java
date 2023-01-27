package p086f.p129k.p130a;

import android.content.res.AssetManager;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: f.k.a.a */
public class C3445a {

    /* renamed from: A */
    private static final C3448c f10793A = new C3448c("StripOffsets", 273, 3);

    /* renamed from: B */
    private static final C3448c[] f10794B = {new C3448c("ThumbnailImage", 256, 7), new C3448c("CameraSettingsIFDPointer", 8224, 4), new C3448c("ImageProcessingIFDPointer", 8256, 4)};

    /* renamed from: C */
    private static final C3448c[] f10795C = {new C3448c("PreviewImageStart", 257, 4), new C3448c("PreviewImageLength", 258, 4)};

    /* renamed from: D */
    private static final C3448c[] f10796D = {new C3448c("AspectFrame", 4371, 3)};

    /* renamed from: E */
    private static final C3448c[] f10797E;

    /* renamed from: F */
    static final C3448c[][] f10798F;

    /* renamed from: G */
    private static final C3448c[] f10799G = {new C3448c("SubIFDPointer", 330, 4), new C3448c("ExifIFDPointer", 34665, 4), new C3448c("GPSInfoIFDPointer", 34853, 4), new C3448c("InteroperabilityIFDPointer", 40965, 4), new C3448c("CameraSettingsIFDPointer", 8224, 1), new C3448c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: H */
    private static final HashMap<Integer, C3448c>[] f10800H;

    /* renamed from: I */
    private static final HashMap<String, C3448c>[] f10801I;

    /* renamed from: J */
    private static final HashSet<String> f10802J = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: K */
    private static final HashMap<Integer, Integer> f10803K = new HashMap<>();

    /* renamed from: L */
    static final Charset f10804L;

    /* renamed from: M */
    static final byte[] f10805M;

    /* renamed from: m */
    public static final int[] f10806m = {8, 8, 8};

    /* renamed from: n */
    public static final int[] f10807n = {8};

    /* renamed from: o */
    static final byte[] f10808o = {-1, -40, -1};

    /* renamed from: p */
    private static final byte[] f10809p = {79, 76, 89, 77, 80, 0};

    /* renamed from: q */
    private static final byte[] f10810q = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: r */
    private static SimpleDateFormat f10811r;

    /* renamed from: s */
    static final String[] f10812s = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: t */
    static final int[] f10813t = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: u */
    static final byte[] f10814u = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: v */
    private static final C3448c[] f10815v = {new C3448c("NewSubfileType", 254, 4), new C3448c("SubfileType", 255, 4), new C3448c("ImageWidth", 256, 3, 4), new C3448c("ImageLength", 257, 3, 4), new C3448c("BitsPerSample", 258, 3), new C3448c("Compression", 259, 3), new C3448c("PhotometricInterpretation", 262, 3), new C3448c("ImageDescription", 270, 2), new C3448c("Make", 271, 2), new C3448c("Model", 272, 2), new C3448c("StripOffsets", 273, 3, 4), new C3448c("Orientation", 274, 3), new C3448c("SamplesPerPixel", 277, 3), new C3448c("RowsPerStrip", 278, 3, 4), new C3448c("StripByteCounts", 279, 3, 4), new C3448c("XResolution", 282, 5), new C3448c("YResolution", 283, 5), new C3448c("PlanarConfiguration", 284, 3), new C3448c("ResolutionUnit", 296, 3), new C3448c("TransferFunction", 301, 3), new C3448c("Software", 305, 2), new C3448c("DateTime", 306, 2), new C3448c("Artist", 315, 2), new C3448c("WhitePoint", 318, 5), new C3448c("PrimaryChromaticities", 319, 5), new C3448c("SubIFDPointer", 330, 4), new C3448c("JPEGInterchangeFormat", 513, 4), new C3448c("JPEGInterchangeFormatLength", 514, 4), new C3448c("YCbCrCoefficients", 529, 5), new C3448c("YCbCrSubSampling", 530, 3), new C3448c("YCbCrPositioning", 531, 3), new C3448c("ReferenceBlackWhite", 532, 5), new C3448c("Copyright", 33432, 2), new C3448c("ExifIFDPointer", 34665, 4), new C3448c("GPSInfoIFDPointer", 34853, 4), new C3448c("SensorTopBorder", 4, 4), new C3448c("SensorLeftBorder", 5, 4), new C3448c("SensorBottomBorder", 6, 4), new C3448c("SensorRightBorder", 7, 4), new C3448c("ISO", 23, 3), new C3448c("JpgFromRaw", 46, 7)};

    /* renamed from: w */
    private static final C3448c[] f10816w = {new C3448c("ExposureTime", 33434, 5), new C3448c("FNumber", 33437, 5), new C3448c("ExposureProgram", 34850, 3), new C3448c("SpectralSensitivity", 34852, 2), new C3448c("PhotographicSensitivity", 34855, 3), new C3448c("OECF", 34856, 7), new C3448c("ExifVersion", 36864, 2), new C3448c("DateTimeOriginal", 36867, 2), new C3448c("DateTimeDigitized", 36868, 2), new C3448c("ComponentsConfiguration", 37121, 7), new C3448c("CompressedBitsPerPixel", 37122, 5), new C3448c("ShutterSpeedValue", 37377, 10), new C3448c("ApertureValue", 37378, 5), new C3448c("BrightnessValue", 37379, 10), new C3448c("ExposureBiasValue", 37380, 10), new C3448c("MaxApertureValue", 37381, 5), new C3448c("SubjectDistance", 37382, 5), new C3448c("MeteringMode", 37383, 3), new C3448c("LightSource", 37384, 3), new C3448c("Flash", 37385, 3), new C3448c("FocalLength", 37386, 5), new C3448c("SubjectArea", 37396, 3), new C3448c("MakerNote", 37500, 7), new C3448c("UserComment", 37510, 7), new C3448c("SubSecTime", 37520, 2), new C3448c("SubSecTimeOriginal", 37521, 2), new C3448c("SubSecTimeDigitized", 37522, 2), new C3448c("FlashpixVersion", 40960, 7), new C3448c("ColorSpace", 40961, 3), new C3448c("PixelXDimension", 40962, 3, 4), new C3448c("PixelYDimension", 40963, 3, 4), new C3448c("RelatedSoundFile", 40964, 2), new C3448c("InteroperabilityIFDPointer", 40965, 4), new C3448c("FlashEnergy", 41483, 5), new C3448c("SpatialFrequencyResponse", 41484, 7), new C3448c("FocalPlaneXResolution", 41486, 5), new C3448c("FocalPlaneYResolution", 41487, 5), new C3448c("FocalPlaneResolutionUnit", 41488, 3), new C3448c("SubjectLocation", 41492, 3), new C3448c("ExposureIndex", 41493, 5), new C3448c("SensingMethod", 41495, 3), new C3448c("FileSource", 41728, 7), new C3448c("SceneType", 41729, 7), new C3448c("CFAPattern", 41730, 7), new C3448c("CustomRendered", 41985, 3), new C3448c("ExposureMode", 41986, 3), new C3448c("WhiteBalance", 41987, 3), new C3448c("DigitalZoomRatio", 41988, 5), new C3448c("FocalLengthIn35mmFilm", 41989, 3), new C3448c("SceneCaptureType", 41990, 3), new C3448c("GainControl", 41991, 3), new C3448c("Contrast", 41992, 3), new C3448c("Saturation", 41993, 3), new C3448c("Sharpness", 41994, 3), new C3448c("DeviceSettingDescription", 41995, 7), new C3448c("SubjectDistanceRange", 41996, 3), new C3448c("ImageUniqueID", 42016, 2), new C3448c("DNGVersion", 50706, 1), new C3448c("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: x */
    private static final C3448c[] f10817x = {new C3448c("GPSVersionID", 0, 1), new C3448c("GPSLatitudeRef", 1, 2), new C3448c("GPSLatitude", 2, 5), new C3448c("GPSLongitudeRef", 3, 2), new C3448c("GPSLongitude", 4, 5), new C3448c("GPSAltitudeRef", 5, 1), new C3448c("GPSAltitude", 6, 5), new C3448c("GPSTimeStamp", 7, 5), new C3448c("GPSSatellites", 8, 2), new C3448c("GPSStatus", 9, 2), new C3448c("GPSMeasureMode", 10, 2), new C3448c("GPSDOP", 11, 5), new C3448c("GPSSpeedRef", 12, 2), new C3448c("GPSSpeed", 13, 5), new C3448c("GPSTrackRef", 14, 2), new C3448c("GPSTrack", 15, 5), new C3448c("GPSImgDirectionRef", 16, 2), new C3448c("GPSImgDirection", 17, 5), new C3448c("GPSMapDatum", 18, 2), new C3448c("GPSDestLatitudeRef", 19, 2), new C3448c("GPSDestLatitude", 20, 5), new C3448c("GPSDestLongitudeRef", 21, 2), new C3448c("GPSDestLongitude", 22, 5), new C3448c("GPSDestBearingRef", 23, 2), new C3448c("GPSDestBearing", 24, 5), new C3448c("GPSDestDistanceRef", 25, 2), new C3448c("GPSDestDistance", 26, 5), new C3448c("GPSProcessingMethod", 27, 7), new C3448c("GPSAreaInformation", 28, 7), new C3448c("GPSDateStamp", 29, 2), new C3448c("GPSDifferential", 30, 3)};

    /* renamed from: y */
    private static final C3448c[] f10818y = {new C3448c("InteroperabilityIndex", 1, 2)};

    /* renamed from: z */
    private static final C3448c[] f10819z = {new C3448c("NewSubfileType", 254, 4), new C3448c("SubfileType", 255, 4), new C3448c("ThumbnailImageWidth", 256, 3, 4), new C3448c("ThumbnailImageLength", 257, 3, 4), new C3448c("BitsPerSample", 258, 3), new C3448c("Compression", 259, 3), new C3448c("PhotometricInterpretation", 262, 3), new C3448c("ImageDescription", 270, 2), new C3448c("Make", 271, 2), new C3448c("Model", 272, 2), new C3448c("StripOffsets", 273, 3, 4), new C3448c("Orientation", 274, 3), new C3448c("SamplesPerPixel", 277, 3), new C3448c("RowsPerStrip", 278, 3, 4), new C3448c("StripByteCounts", 279, 3, 4), new C3448c("XResolution", 282, 5), new C3448c("YResolution", 283, 5), new C3448c("PlanarConfiguration", 284, 3), new C3448c("ResolutionUnit", 296, 3), new C3448c("TransferFunction", 301, 3), new C3448c("Software", 305, 2), new C3448c("DateTime", 306, 2), new C3448c("Artist", 315, 2), new C3448c("WhitePoint", 318, 5), new C3448c("PrimaryChromaticities", 319, 5), new C3448c("SubIFDPointer", 330, 4), new C3448c("JPEGInterchangeFormat", 513, 4), new C3448c("JPEGInterchangeFormatLength", 514, 4), new C3448c("YCbCrCoefficients", 529, 5), new C3448c("YCbCrSubSampling", 530, 3), new C3448c("YCbCrPositioning", 531, 3), new C3448c("ReferenceBlackWhite", 532, 5), new C3448c("Copyright", 33432, 2), new C3448c("ExifIFDPointer", 34665, 4), new C3448c("GPSInfoIFDPointer", 34853, 4), new C3448c("DNGVersion", 50706, 1), new C3448c("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: a */
    private final String f10820a;

    /* renamed from: b */
    private final AssetManager.AssetInputStream f10821b;

    /* renamed from: c */
    private int f10822c;

    /* renamed from: d */
    private final HashMap<String, C3447b>[] f10823d = new HashMap[f10798F.length];

    /* renamed from: e */
    private Set<Integer> f10824e = new HashSet(f10798F.length);

    /* renamed from: f */
    private ByteOrder f10825f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g */
    private int f10826g;

    /* renamed from: h */
    private int f10827h;

    /* renamed from: i */
    private int f10828i;

    /* renamed from: j */
    private int f10829j;

    /* renamed from: k */
    private int f10830k;

    /* renamed from: l */
    private int f10831l;

    /* renamed from: f.k.a.a$a */
    private static class C3446a extends InputStream implements DataInput {

        /* renamed from: j */
        private static final ByteOrder f10832j = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: k */
        private static final ByteOrder f10833k = ByteOrder.BIG_ENDIAN;

        /* renamed from: f */
        private DataInputStream f10834f;

        /* renamed from: g */
        private ByteOrder f10835g;

        /* renamed from: h */
        final int f10836h;

        /* renamed from: i */
        int f10837i;

        public C3446a(InputStream inputStream) throws IOException {
            this.f10835g = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f10834f = dataInputStream;
            int available = dataInputStream.available();
            this.f10836h = available;
            this.f10837i = 0;
            this.f10834f.mark(available);
        }

        public C3446a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public int mo11813a() {
            return this.f10837i;
        }

        public int available() throws IOException {
            return this.f10834f.available();
        }

        /* renamed from: h */
        public long mo11815h() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: j */
        public void mo11816j(long j) throws IOException {
            int i = this.f10837i;
            if (((long) i) > j) {
                this.f10837i = 0;
                this.f10834f.reset();
                this.f10834f.mark(this.f10836h);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: m */
        public void mo11817m(ByteOrder byteOrder) {
            this.f10835g = byteOrder;
        }

        public int read() throws IOException {
            this.f10837i++;
            return this.f10834f.read();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f10834f.read(bArr, i, i2);
            this.f10837i += read;
            return read;
        }

        public boolean readBoolean() throws IOException {
            this.f10837i++;
            return this.f10834f.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.f10837i + 1;
            this.f10837i = i;
            if (i <= this.f10836h) {
                int read = this.f10834f.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f10837i += 2;
            return this.f10834f.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f10837i + bArr.length;
            this.f10837i = length;
            if (length > this.f10836h) {
                throw new EOFException();
            } else if (this.f10834f.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f10837i + i2;
            this.f10837i = i3;
            if (i3 > this.f10836h) {
                throw new EOFException();
            } else if (this.f10834f.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.f10837i + 4;
            this.f10837i = i;
            if (i <= this.f10836h) {
                int read = this.f10834f.read();
                int read2 = this.f10834f.read();
                int read3 = this.f10834f.read();
                int read4 = this.f10834f.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f10835g;
                    if (byteOrder == f10832j) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f10833k) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f10835g);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i = this.f10837i + 8;
            this.f10837i = i;
            if (i <= this.f10836h) {
                int read = this.f10834f.read();
                int read2 = this.f10834f.read();
                int read3 = this.f10834f.read();
                int read4 = this.f10834f.read();
                int read5 = this.f10834f.read();
                int read6 = this.f10834f.read();
                int read7 = this.f10834f.read();
                int read8 = this.f10834f.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f10835g;
                    if (byteOrder == f10832j) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f10833k) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f10835g);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.f10837i + 2;
            this.f10837i = i;
            if (i <= this.f10836h) {
                int read = this.f10834f.read();
                int read2 = this.f10834f.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f10835g;
                    if (byteOrder == f10832j) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f10833k) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f10835g);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f10837i += 2;
            return this.f10834f.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f10837i++;
            return this.f10834f.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.f10837i + 2;
            this.f10837i = i;
            if (i <= this.f10836h) {
                int read = this.f10834f.read();
                int read2 = this.f10834f.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f10835g;
                    if (byteOrder == f10832j) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f10833k) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f10835g);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f10836h - this.f10837i);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f10834f.skipBytes(min - i2);
            }
            this.f10837i += i2;
            return i2;
        }
    }

    /* renamed from: f.k.a.a$b */
    private static class C3447b {

        /* renamed from: a */
        public final int f10838a;

        /* renamed from: b */
        public final int f10839b;

        /* renamed from: c */
        public final byte[] f10840c;

        C3447b(int i, int i2, byte[] bArr) {
            this.f10838a = i;
            this.f10839b = i2;
            this.f10840c = bArr;
        }

        /* renamed from: a */
        public static C3447b m14923a(String str) {
            byte[] bytes = (str + 0).getBytes(C3445a.f10804L);
            return new C3447b(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C3447b m14924b(long j, ByteOrder byteOrder) {
            return m14925c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C3447b m14925c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C3445a.f10813t[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C3447b(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C3447b m14926d(C3449d dVar, ByteOrder byteOrder) {
            return m14927e(new C3449d[]{dVar}, byteOrder);
        }

        /* renamed from: e */
        public static C3447b m14927e(C3449d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C3445a.f10813t[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (C3449d dVar : dVarArr) {
                wrap.putInt((int) dVar.f10845a);
                wrap.putInt((int) dVar.f10846b);
            }
            return new C3447b(5, dVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C3447b m14928f(int i, ByteOrder byteOrder) {
            return m14929g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C3447b m14929g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C3445a.f10813t[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C3447b(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo11835h(ByteOrder byteOrder) {
            Object k = mo11838k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof C3449d[]) {
                    C3449d[] dVarArr = (C3449d[]) k;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].mo11841a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo11836i(ByteOrder byteOrder) {
            Object k = mo11838k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo11837j(ByteOrder byteOrder) {
            Object k = mo11838k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C3449d[])) {
                return null;
            } else {
                C3449d[] dVarArr = (C3449d[]) k;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f10845a);
                    sb.append('/');
                    sb.append(dVarArr[i].f10846b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01ab A[SYNTHETIC, Splitter:B:164:0x01ab] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo11838k(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                f.k.a.a$a r3 = new f.k.a.a$a     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                byte[] r4 = r10.f10840c     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                r3.mo11817m(r11)     // Catch:{ IOException -> 0x0191 }
                int r11 = r10.f10838a     // Catch:{ IOException -> 0x0191 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x014c;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x014c;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0191 }
            L_0x0016:
                goto L_0x0188
            L_0x0018:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x001c:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0036:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0191 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                f.k.a.a$d[] r11 = new p086f.p129k.p130a.C3445a.C3449d[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0051:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0191 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0191 }
                f.k.a.a$d r4 = new f.k.a.a$d     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0076:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0090:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                f.k.a.a$d[] r11 = new p086f.p129k.p130a.C3445a.C3449d[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00aa:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo11815h()     // Catch:{ IOException -> 0x0191 }
                long r8 = r3.mo11815h()     // Catch:{ IOException -> 0x0191 }
                f.k.a.a$d r4 = new f.k.a.a$d     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00cd:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo11815h()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00e7:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = p086f.p129k.p130a.C3445a.f10814u     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 < r6) goto L_0x011e
                r11 = 0
            L_0x0105:
                byte[] r6 = p086f.p129k.p130a.C3445a.f10814u     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 >= r6) goto L_0x0119
                byte[] r6 = r10.f10840c     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r11]     // Catch:{ IOException -> 0x0191 }
                byte[] r7 = p086f.p129k.p130a.C3445a.f10814u     // Catch:{ IOException -> 0x0191 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0191 }
                if (r6 == r7) goto L_0x0116
                r4 = 0
                goto L_0x0119
            L_0x0116:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0119:
                if (r4 == 0) goto L_0x011e
                byte[] r11 = p086f.p129k.p130a.C3445a.f10814u     // Catch:{ IOException -> 0x0191 }
                int r5 = r11.length     // Catch:{ IOException -> 0x0191 }
            L_0x011e:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191 }
                r11.<init>()     // Catch:{ IOException -> 0x0191 }
            L_0x0123:
                int r4 = r10.f10839b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x013f
                byte[] r4 = r10.f10840c     // Catch:{ IOException -> 0x0191 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0191 }
                if (r4 != 0) goto L_0x012e
                goto L_0x013f
            L_0x012e:
                r6 = 32
                if (r4 < r6) goto L_0x0137
                char r4 = (char) r4     // Catch:{ IOException -> 0x0191 }
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
                goto L_0x013c
            L_0x0137:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
            L_0x013c:
                int r5 = r5 + 1
                goto L_0x0123
            L_0x013f:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0147 }
                goto L_0x014b
            L_0x0147:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x014b:
                return r11
            L_0x014c:
                byte[] r11 = r10.f10840c     // Catch:{ IOException -> 0x0191 }
                int r11 = r11.length     // Catch:{ IOException -> 0x0191 }
                if (r11 != r4) goto L_0x0176
                byte[] r11 = r10.f10840c     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 < 0) goto L_0x0176
                byte[] r11 = r10.f10840c     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 > r4) goto L_0x0176
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = r10.f10840c     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0191 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0191 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0171 }
                goto L_0x0175
            L_0x0171:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0175:
                return r11
            L_0x0176:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                byte[] r4 = r10.f10840c     // Catch:{ IOException -> 0x0191 }
                java.nio.charset.Charset r5 = p086f.p129k.p130a.C3445a.f10804L     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0187:
                return r11
            L_0x0188:
                r3.close()     // Catch:{ IOException -> 0x018c }
                goto L_0x0190
            L_0x018c:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0190:
                return r2
            L_0x0191:
                r11 = move-exception
                goto L_0x0197
            L_0x0193:
                r11 = move-exception
                goto L_0x01a9
            L_0x0195:
                r11 = move-exception
                r3 = r2
            L_0x0197:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x01a7 }
                if (r3 == 0) goto L_0x01a6
                r3.close()     // Catch:{ IOException -> 0x01a2 }
                goto L_0x01a6
            L_0x01a2:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x01a6:
                return r2
            L_0x01a7:
                r11 = move-exception
                r2 = r3
            L_0x01a9:
                if (r2 == 0) goto L_0x01b3
                r2.close()     // Catch:{ IOException -> 0x01af }
                goto L_0x01b3
            L_0x01af:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01b3:
                goto L_0x01b5
            L_0x01b4:
                throw r11
            L_0x01b5:
                goto L_0x01b4
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p129k.p130a.C3445a.C3447b.mo11838k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C3445a.f10812s[this.f10838a] + ", data length:" + this.f10840c.length + ")";
        }
    }

    /* renamed from: f.k.a.a$c */
    static class C3448c {

        /* renamed from: a */
        public final int f10841a;

        /* renamed from: b */
        public final String f10842b;

        /* renamed from: c */
        public final int f10843c;

        /* renamed from: d */
        public final int f10844d;

        C3448c(String str, int i, int i2) {
            this.f10842b = str;
            this.f10841a = i;
            this.f10843c = i2;
            this.f10844d = -1;
        }

        C3448c(String str, int i, int i2, int i3) {
            this.f10842b = str;
            this.f10841a = i;
            this.f10843c = i2;
            this.f10844d = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo11840a(int i) {
            int i2;
            int i3 = this.f10843c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f10844d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.f10843c == 9 || this.f10844d == 9) && i == 8) {
                return true;
            }
            return (this.f10843c == 12 || this.f10844d == 12) && i == 11;
        }
    }

    /* renamed from: f.k.a.a$d */
    private static class C3449d {

        /* renamed from: a */
        public final long f10845a;

        /* renamed from: b */
        public final long f10846b;

        C3449d(long j, long j2) {
            if (j2 == 0) {
                this.f10845a = 0;
                this.f10846b = 1;
                return;
            }
            this.f10845a = j;
            this.f10846b = j2;
        }

        /* renamed from: a */
        public double mo11841a() {
            double d = (double) this.f10845a;
            double d2 = (double) this.f10846b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.f10845a + "/" + this.f10846b;
        }
    }

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        C3448c[] cVarArr = {new C3448c("ColorSpace", 55, 3)};
        f10797E = cVarArr;
        C3448c[] cVarArr2 = f10815v;
        f10798F = new C3448c[][]{cVarArr2, f10816w, f10817x, f10818y, f10819z, cVarArr2, f10794B, f10795C, f10796D, cVarArr};
        C3448c[][] cVarArr3 = f10798F;
        f10800H = new HashMap[cVarArr3.length];
        f10801I = new HashMap[cVarArr3.length];
        Charset forName = Charset.forName("US-ASCII");
        f10804L = forName;
        f10805M = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f10811r = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < f10798F.length; i++) {
            f10800H[i] = new HashMap<>();
            f10801I[i] = new HashMap<>();
            for (C3448c cVar : f10798F[i]) {
                f10800H[i].put(Integer.valueOf(cVar.f10841a), cVar);
                f10801I[i].put(cVar.f10842b, cVar);
            }
        }
        f10803K.put(Integer.valueOf(f10799G[0].f10841a), 5);
        f10803K.put(Integer.valueOf(f10799G[1].f10841a), 1);
        f10803K.put(Integer.valueOf(f10799G[2].f10841a), 2);
        f10803K.put(Integer.valueOf(f10799G[3].f10841a), 3);
        f10803K.put(Integer.valueOf(f10799G[4].f10841a), 7);
        f10803K.put(Integer.valueOf(f10799G[5].f10841a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public C3445a(String str) throws IOException {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f10821b = null;
            this.f10820a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m14911u(fileInputStream2);
                    m14894b(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    m14894b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m14894b(fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    /* renamed from: A */
    private void m14889A(C3446a aVar) throws IOException {
        HashMap<String, C3447b> hashMap = this.f10823d[4];
        C3447b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int i = bVar.mo11836i(this.f10825f);
            this.f10826g = i;
            if (i != 1) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                }
            }
            if (m14909s(hashMap)) {
                m14904n(aVar, hashMap);
                return;
            }
            return;
        }
        this.f10826g = 6;
        m14903m(aVar, hashMap);
    }

    /* renamed from: B */
    private void m14890B(int i, int i2) throws IOException {
        if (!this.f10823d[i].isEmpty() && !this.f10823d[i2].isEmpty()) {
            C3447b bVar = this.f10823d[i].get("ImageLength");
            C3447b bVar2 = this.f10823d[i].get("ImageWidth");
            C3447b bVar3 = this.f10823d[i2].get("ImageLength");
            C3447b bVar4 = this.f10823d[i2].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int i3 = bVar.mo11836i(this.f10825f);
                int i4 = bVar2.mo11836i(this.f10825f);
                int i5 = bVar3.mo11836i(this.f10825f);
                int i6 = bVar4.mo11836i(this.f10825f);
                if (i3 < i5 && i4 < i6) {
                    HashMap<String, C3447b>[] hashMapArr = this.f10823d;
                    HashMap<String, C3447b> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: C */
    private void m14891C(C3446a aVar, int i) throws IOException {
        C3447b bVar;
        C3447b bVar2;
        StringBuilder sb;
        String arrays;
        C3447b bVar3 = this.f10823d[i].get("DefaultCropSize");
        C3447b bVar4 = this.f10823d[i].get("SensorTopBorder");
        C3447b bVar5 = this.f10823d[i].get("SensorLeftBorder");
        C3447b bVar6 = this.f10823d[i].get("SensorBottomBorder");
        C3447b bVar7 = this.f10823d[i].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.f10838a == 5) {
                C3449d[] dVarArr = (C3449d[]) bVar3.mo11838k(this.f10825f);
                if (dVarArr == null || dVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(dVarArr);
                } else {
                    bVar2 = C3447b.m14926d(dVarArr[0], this.f10825f);
                    bVar = C3447b.m14926d(dVarArr[1], this.f10825f);
                    this.f10823d[i].put("ImageWidth", bVar2);
                    this.f10823d[i].put("ImageLength", bVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) bVar3.mo11838k(this.f10825f);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    bVar2 = C3447b.m14928f(iArr[0], this.f10825f);
                    bVar = C3447b.m14928f(iArr[1], this.f10825f);
                    this.f10823d[i].put("ImageWidth", bVar2);
                    this.f10823d[i].put("ImageLength", bVar);
                    return;
                }
            }
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            m14916z(aVar, i);
        } else {
            int i2 = bVar4.mo11836i(this.f10825f);
            int i3 = bVar6.mo11836i(this.f10825f);
            int i4 = bVar7.mo11836i(this.f10825f);
            int i5 = bVar5.mo11836i(this.f10825f);
            if (i3 > i2 && i4 > i5) {
                C3447b f = C3447b.m14928f(i3 - i2, this.f10825f);
                C3447b f2 = C3447b.m14928f(i4 - i5, this.f10825f);
                this.f10823d[i].put("ImageLength", f);
                this.f10823d[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: D */
    private void m14892D(InputStream inputStream) throws IOException {
        m14890B(0, 5);
        m14890B(0, 4);
        m14890B(5, 4);
        C3447b bVar = this.f10823d[1].get("PixelXDimension");
        C3447b bVar2 = this.f10823d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f10823d[0].put("ImageWidth", bVar);
            this.f10823d[0].put("ImageLength", bVar2);
        }
        if (this.f10823d[4].isEmpty() && m14910t(this.f10823d[5])) {
            HashMap<String, C3447b>[] hashMapArr = this.f10823d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m14910t(this.f10823d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: a */
    private void m14893a() {
        String d = mo11811d("DateTimeOriginal");
        if (d != null && mo11811d("DateTime") == null) {
            this.f10823d[0].put("DateTime", C3447b.m14923a(d));
        }
        if (mo11811d("ImageWidth") == null) {
            this.f10823d[0].put("ImageWidth", C3447b.m14924b(0, this.f10825f));
        }
        if (mo11811d("ImageLength") == null) {
            this.f10823d[0].put("ImageLength", C3447b.m14924b(0, this.f10825f));
        }
        if (mo11811d("Orientation") == null) {
            this.f10823d[0].put("Orientation", C3447b.m14924b(0, this.f10825f));
        }
        if (mo11811d("LightSource") == null) {
            this.f10823d[1].put("LightSource", C3447b.m14924b(0, this.f10825f));
        }
    }

    /* renamed from: b */
    private static void m14894b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static long[] m14895c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: f */
    private C3447b m14896f(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f10798F.length; i++) {
            C3447b bVar = this.f10823d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14897g(p086f.p129k.p130a.C3445a.C3446a r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.mo11817m(r0)
            long r0 = (long) r11
            r10.mo11816j(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r0 = r9.f10823d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f10825f
            f.k.a.a$b r5 = p086f.p129k.p130a.C3445a.C3447b.m14924b(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r0 = r9.f10823d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f10825f
            f.k.a.a$b r5 = p086f.p129k.p130a.C3445a.C3447b.m14924b(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.mo11811d(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r5 = r9.f10823d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = f10804L
            r7.<init>(r0, r8)
            f.k.a.a$b r0 = p086f.p129k.p130a.C3445a.C3447b.m14923a(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = f10805M
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f10827h = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.m14914x(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f10825f
            r10.mo11817m(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            goto L_0x016f
        L_0x016e:
            throw r10
        L_0x016f:
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p129k.p130a.C3445a.m14897g(f.k.a.a$a, int, int):void");
    }

    /* renamed from: h */
    private int m14898h(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m14905o(bArr)) {
            return 4;
        }
        if (m14907q(bArr)) {
            return 9;
        }
        if (m14906p(bArr)) {
            return 7;
        }
        return m14908r(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14899i(p086f.p129k.p130a.C3445a.C3446a r7) throws java.io.IOException {
        /*
            r6 = this;
            r6.m14901k(r7)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r7 = r6.f10823d
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            f.k.a.a$b r7 = (p086f.p129k.p130a.C3445a.C3447b) r7
            if (r7 == 0) goto L_0x00f9
            f.k.a.a$a r1 = new f.k.a.a$a
            byte[] r7 = r7.f10840c
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.f10825f
            r1.mo11817m(r7)
            byte[] r7 = f10809p
            int r7 = r7.length
            byte[] r7 = new byte[r7]
            r1.readFully(r7)
            r2 = 0
            r1.mo11816j(r2)
            byte[] r2 = f10810q
            int r2 = r2.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            byte[] r3 = f10809p
            boolean r7 = java.util.Arrays.equals(r7, r3)
            if (r7 == 0) goto L_0x0041
            r2 = 8
        L_0x003d:
            r1.mo11816j(r2)
            goto L_0x004c
        L_0x0041:
            byte[] r7 = f10810q
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x004c
            r2 = 12
            goto L_0x003d
        L_0x004c:
            r7 = 6
            r6.m14915y(r1, r7)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r7 = r6.f10823d
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            f.k.a.a$b r7 = (p086f.p129k.p130a.C3445a.C3447b) r7
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r2 = r6.f10823d
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            f.k.a.a$b r1 = (p086f.p129k.p130a.C3445a.C3447b) r1
            if (r7 == 0) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r2 = r6.f10823d
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r7 = r6.f10823d
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x0080:
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r7 = r6.f10823d
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            f.k.a.a$b r7 = (p086f.p129k.p130a.C3445a.C3447b) r7
            if (r7 == 0) goto L_0x00f9
            java.nio.ByteOrder r1 = r6.f10825f
            java.lang.Object r7 = r7.mo11838k(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00df
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009f
            goto L_0x00df
        L_0x009f:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f9
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f9
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00c0
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00c0:
            java.nio.ByteOrder r7 = r6.f10825f
            f.k.a.a$b r7 = p086f.p129k.p130a.C3445a.C3447b.m14928f(r1, r7)
            java.nio.ByteOrder r0 = r6.f10825f
            f.k.a.a$b r0 = p086f.p129k.p130a.C3445a.C3447b.m14928f(r2, r0)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r1 = r6.f10823d
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r7 = r6.f10823d
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f9
        L_0x00df:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p129k.p130a.C3445a.m14899i(f.k.a.a$a):void");
    }

    /* renamed from: j */
    private void m14900j(C3446a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m14897g(aVar, i, 5);
        aVar.mo11816j((long) i2);
        aVar.mo11817m(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f10793A.f10841a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C3447b f = C3447b.m14928f(readShort, this.f10825f);
                C3447b f2 = C3447b.m14928f(readShort2, this.f10825f);
                this.f10823d[0].put("ImageLength", f);
                this.f10823d[0].put("ImageWidth", f2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: k */
    private void m14901k(C3446a aVar) throws IOException {
        C3447b bVar;
        m14912v(aVar, aVar.available());
        m14915y(aVar, 0);
        m14891C(aVar, 0);
        m14891C(aVar, 5);
        m14891C(aVar, 4);
        m14892D(aVar);
        if (this.f10822c == 8 && (bVar = this.f10823d[1].get("MakerNote")) != null) {
            C3446a aVar2 = new C3446a(bVar.f10840c);
            aVar2.mo11817m(this.f10825f);
            aVar2.mo11816j(6);
            m14915y(aVar2, 9);
            C3447b bVar2 = this.f10823d[9].get("ColorSpace");
            if (bVar2 != null) {
                this.f10823d[1].put("ColorSpace", bVar2);
            }
        }
    }

    /* renamed from: l */
    private void m14902l(C3446a aVar) throws IOException {
        m14901k(aVar);
        if (this.f10823d[0].get("JpgFromRaw") != null) {
            m14897g(aVar, this.f10831l, 5);
        }
        C3447b bVar = this.f10823d[0].get("ISO");
        C3447b bVar2 = this.f10823d[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.f10823d[1].put("PhotographicSensitivity", bVar);
        }
    }

    /* renamed from: m */
    private void m14903m(C3446a aVar, HashMap hashMap) throws IOException {
        int i;
        C3447b bVar = (C3447b) hashMap.get("JPEGInterchangeFormat");
        C3447b bVar2 = (C3447b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int i2 = bVar.mo11836i(this.f10825f);
            int min = Math.min(bVar2.mo11836i(this.f10825f), aVar.available() - i2);
            int i3 = this.f10822c;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i = this.f10827h;
            } else {
                if (i3 == 7) {
                    i = this.f10828i;
                }
                if (i2 > 0 && min > 0 && this.f10820a == null && this.f10821b == null) {
                    aVar.mo11816j((long) i2);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            i2 += i;
            if (i2 > 0) {
            }
        }
    }

    /* renamed from: n */
    private void m14904n(C3446a aVar, HashMap hashMap) throws IOException {
        String str;
        C3447b bVar = (C3447b) hashMap.get("StripOffsets");
        C3447b bVar2 = (C3447b) hashMap.get("StripByteCounts");
        if (bVar != null && bVar2 != null) {
            long[] c = m14895c(bVar.mo11838k(this.f10825f));
            long[] c2 = m14895c(bVar2.mo11838k(this.f10825f));
            if (c == null) {
                str = "stripOffsets should not be null.";
            } else if (c2 == null) {
                str = "stripByteCounts should not be null.";
            } else {
                long j = 0;
                for (long j2 : c2) {
                    j += j2;
                }
                byte[] bArr = new byte[((int) j)];
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < c.length; i3++) {
                    int i4 = (int) c[i3];
                    int i5 = (int) c2[i3];
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    aVar.mo11816j((long) i6);
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    aVar.read(bArr2);
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                return;
            }
            Log.w("ExifInterface", str);
        }
    }

    /* renamed from: o */
    private static boolean m14905o(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f10808o;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: p */
    private boolean m14906p(byte[] bArr) throws IOException {
        C3446a aVar = new C3446a(bArr);
        ByteOrder w = m14913w(aVar);
        this.f10825f = w;
        aVar.mo11817m(w);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: q */
    private boolean m14907q(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private boolean m14908r(byte[] bArr) throws IOException {
        C3446a aVar = new C3446a(bArr);
        ByteOrder w = m14913w(aVar);
        this.f10825f = w;
        aVar.mo11817m(w);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: s */
    private boolean m14909s(HashMap hashMap) throws IOException {
        C3447b bVar;
        C3447b bVar2 = (C3447b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.mo11838k(this.f10825f);
        if (Arrays.equals(f10806m, iArr)) {
            return true;
        }
        if (this.f10822c != 3 || (bVar = (C3447b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i = bVar.mo11836i(this.f10825f);
        return (i == 1 && Arrays.equals(iArr, f10807n)) || (i == 6 && Arrays.equals(iArr, f10806m));
    }

    /* renamed from: t */
    private boolean m14910t(HashMap hashMap) throws IOException {
        C3447b bVar = (C3447b) hashMap.get("ImageLength");
        C3447b bVar2 = (C3447b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.mo11836i(this.f10825f) <= 512 && bVar2.mo11836i(this.f10825f) <= 512;
    }

    /* renamed from: u */
    private void m14911u(InputStream inputStream) throws IOException {
        int i = 0;
        while (i < f10798F.length) {
            try {
                this.f10823d[i] = new HashMap<>();
                i++;
            } catch (IOException unused) {
            } catch (Throwable th) {
                m14893a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f10822c = m14898h(bufferedInputStream);
        C3446a aVar = new C3446a((InputStream) bufferedInputStream);
        switch (this.f10822c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m14901k(aVar);
                break;
            case 4:
                m14897g(aVar, 0, 0);
                break;
            case 7:
                m14899i(aVar);
                break;
            case 9:
                m14900j(aVar);
                break;
            case 10:
                m14902l(aVar);
                break;
        }
        m14889A(aVar);
        m14893a();
    }

    /* renamed from: v */
    private void m14912v(C3446a aVar, int i) throws IOException {
        ByteOrder w = m14913w(aVar);
        this.f10825f = w;
        aVar.mo11817m(w);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f10822c;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: w */
    private ByteOrder m14913w(C3446a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: x */
    private void m14914x(byte[] bArr, int i) throws IOException {
        C3446a aVar = new C3446a(bArr);
        m14912v(aVar, bArr.length);
        m14915y(aVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0235  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14915y(p086f.p129k.p130a.C3445a.C3446a r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.f10824e
            int r4 = r1.f10837i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f10837i
            int r3 = r3 + 2
            int r4 = r1.f10836h
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            int r4 = r1.f10837i
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f10836h
            if (r4 > r5) goto L_0x0305
            if (r3 > 0) goto L_0x002b
            goto L_0x0305
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r9 = "ExifInterface"
            if (r5 >= r3) goto L_0x02a6
            int r10 = r24.readUnsignedShort()
            int r11 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r13 = r24.mo11813a()
            long r13 = (long) r13
            r15 = 4
            long r13 = r13 + r15
            java.util.HashMap<java.lang.Integer, f.k.a.a$c>[] r17 = f10800H
            r4 = r17[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r8)
            f.k.a.a$c r4 = (p086f.p129k.p130a.C3445a.C3448c) r4
            r8 = 7
            if (r4 != 0) goto L_0x006b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "Skip the tag entry since tag number is not defined: "
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
        L_0x0066:
            android.util.Log.w(r9, r6)
            goto L_0x00de
        L_0x006b:
            if (r11 <= 0) goto L_0x00cc
            int[] r6 = f10813t
            int r6 = r6.length
            if (r11 < r6) goto L_0x0073
            goto L_0x00cc
        L_0x0073:
            boolean r6 = r4.mo11840a(r11)
            if (r6 != 0) goto L_0x0095
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = f10812s
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f10842b
            r6.append(r7)
            goto L_0x00d9
        L_0x0095:
            if (r11 != r8) goto L_0x0099
            int r11 = r4.f10843c
        L_0x0099:
            long r6 = (long) r12
            int[] r15 = f10813t
            r15 = r15[r11]
            r16 = r9
            long r8 = (long) r15
            long r6 = r6 * r8
            r8 = 0
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x00b5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            r8 = 1
            r9 = r16
            goto L_0x00e1
        L_0x00b5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            r9 = r16
            android.util.Log.w(r9, r8)
            goto L_0x00e0
        L_0x00cc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format is invalid: "
            r6.append(r7)
            r6.append(r11)
        L_0x00d9:
            java.lang.String r6 = r6.toString()
            goto L_0x0066
        L_0x00de:
            r6 = 0
        L_0x00e0:
            r8 = 0
        L_0x00e1:
            if (r8 != 0) goto L_0x00ec
            r1.mo11816j(r13)
            r16 = r3
            r18 = r5
            goto L_0x029d
        L_0x00ec:
            java.lang.String r8 = "Compression"
            r15 = 4
            int r18 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x0199
            int r15 = r24.readInt()
            r16 = r3
            int r3 = r0.f10822c
            r18 = r5
            r5 = 7
            if (r3 != r5) goto L_0x015c
            java.lang.String r3 = r4.f10842b
            java.lang.String r5 = "MakerNote"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x010e
            r0.f10828i = r15
            goto L_0x0157
        L_0x010e:
            r3 = 6
            if (r2 != r3) goto L_0x0157
            java.lang.String r5 = r4.f10842b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0157
            r0.f10829j = r15
            r0.f10830k = r12
            java.nio.ByteOrder r3 = r0.f10825f
            r5 = 6
            f.k.a.a$b r3 = p086f.p129k.p130a.C3445a.C3447b.m14928f(r5, r3)
            int r5 = r0.f10829j
            r20 = r11
            r19 = r12
            long r11 = (long) r5
            java.nio.ByteOrder r5 = r0.f10825f
            f.k.a.a$b r5 = p086f.p129k.p130a.C3445a.C3447b.m14924b(r11, r5)
            int r11 = r0.f10830k
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.f10825f
            f.k.a.a$b r2 = p086f.p129k.p130a.C3445a.C3447b.m14924b(r11, r2)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r11 = r0.f10823d
            r12 = 4
            r11 = r11[r12]
            r11.put(r8, r3)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r3 = r0.f10823d
            r3 = r3[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r3.put(r11, r5)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r3 = r0.f10823d
            r3 = r3[r12]
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r3.put(r5, r2)
            goto L_0x0170
        L_0x0157:
            r20 = r11
            r19 = r12
            goto L_0x0170
        L_0x015c:
            r20 = r11
            r19 = r12
            r2 = 10
            if (r3 != r2) goto L_0x0170
            java.lang.String r2 = r4.f10842b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0170
            r0.f10831l = r15
        L_0x0170:
            long r2 = (long) r15
            long r11 = r2 + r6
            int r5 = r1.f10836h
            r21 = r4
            long r4 = (long) r5
            int r22 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r22 > 0) goto L_0x0180
            r1.mo11816j(r2)
            goto L_0x01a3
        L_0x0180:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
        L_0x0191:
            android.util.Log.w(r9, r2)
        L_0x0194:
            r1.mo11816j(r13)
            goto L_0x029d
        L_0x0199:
            r16 = r3
            r21 = r4
            r18 = r5
            r20 = r11
            r19 = r12
        L_0x01a3:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f10803K
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r4 = 3
            if (r2 == 0) goto L_0x0235
            r5 = -1
            r11 = r20
            if (r11 == r4) goto L_0x01d9
            r4 = 4
            if (r11 == r4) goto L_0x01d4
            if (r11 == r3) goto L_0x01cf
            r3 = 9
            if (r11 == r3) goto L_0x01ca
            r3 = 13
            if (r11 == r3) goto L_0x01ca
        L_0x01c7:
            r3 = 0
            goto L_0x01df
        L_0x01ca:
            int r3 = r24.readInt()
            goto L_0x01dd
        L_0x01cf:
            short r3 = r24.readShort()
            goto L_0x01dd
        L_0x01d4:
            long r5 = r24.mo11815h()
            goto L_0x01c7
        L_0x01d9:
            int r3 = r24.readUnsignedShort()
        L_0x01dd:
            long r5 = (long) r3
            goto L_0x01c7
        L_0x01df:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0222
            int r3 = r1.f10836h
            long r3 = (long) r3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0222
            java.util.Set<java.lang.Integer> r3 = r0.f10824e
            int r4 = (int) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0202
            r1.mo11816j(r5)
            int r2 = r2.intValue()
            r0.m14915y(r1, r2)
            goto L_0x0194
        L_0x0202:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x0191
        L_0x0222:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L_0x0191
        L_0x0235:
            r11 = r20
            int r2 = (int) r6
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            f.k.a.a$b r5 = new f.k.a.a$b
            r6 = r19
            r5.<init>(r11, r6, r2)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r2 = r0.f10823d
            r2 = r2[r25]
            r6 = r21
            java.lang.String r7 = r6.f10842b
            r2.put(r7, r5)
            java.lang.String r2 = r6.f10842b
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x025b
            r0.f10822c = r4
        L_0x025b:
            java.lang.String r2 = r6.f10842b
            java.lang.String r4 = "Make"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x026f
            java.lang.String r2 = r6.f10842b
            java.lang.String r4 = "Model"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x027d
        L_0x026f:
            java.nio.ByteOrder r2 = r0.f10825f
            java.lang.String r2 = r5.mo11837j(r2)
            java.lang.String r4 = "PENTAX"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0290
        L_0x027d:
            java.lang.String r2 = r6.f10842b
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0292
            java.nio.ByteOrder r2 = r0.f10825f
            int r2 = r5.mo11836i(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x0292
        L_0x0290:
            r0.f10822c = r3
        L_0x0292:
            int r2 = r24.mo11813a()
            long r2 = (long) r2
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x029d
            goto L_0x0194
        L_0x029d:
            int r5 = r18 + 1
            short r5 = (short) r5
            r2 = r25
            r3 = r16
            goto L_0x002c
        L_0x02a6:
            int r2 = r24.mo11813a()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f10836h
            if (r2 > r3) goto L_0x0305
            int r2 = r24.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02f1
            int r5 = r1.f10836h
            if (r2 >= r5) goto L_0x02f1
            java.util.Set<java.lang.Integer> r5 = r0.f10824e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02e9
            r1.mo11816j(r3)
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r2 = r0.f10823d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02dd
        L_0x02d9:
            r0.m14915y(r1, r3)
            goto L_0x0305
        L_0x02dd:
            java.util.HashMap<java.lang.String, f.k.a.a$b>[] r2 = r0.f10823d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0305
            goto L_0x02d9
        L_0x02e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x02f8
        L_0x02f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x02f8:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
        L_0x0305:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p129k.p130a.C3445a.m14915y(f.k.a.a$a, int):void");
    }

    /* renamed from: z */
    private void m14916z(C3446a aVar, int i) throws IOException {
        C3447b bVar;
        C3447b bVar2 = this.f10823d[i].get("ImageLength");
        C3447b bVar3 = this.f10823d[i].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f10823d[i].get("JPEGInterchangeFormat")) != null) {
            m14897g(aVar, bVar.mo11836i(this.f10825f), i);
        }
    }

    /* renamed from: d */
    public String mo11811d(String str) {
        String str2;
        C3447b f = m14896f(str);
        if (f != null) {
            if (!f10802J.contains(str)) {
                return f.mo11837j(this.f10825f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = f.f10838a;
                if (i == 5 || i == 10) {
                    C3449d[] dVarArr = (C3449d[]) f.mo11838k(this.f10825f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].f10845a) / ((float) dVarArr[0].f10846b))), Integer.valueOf((int) (((float) dVarArr[1].f10845a) / ((float) dVarArr[1].f10846b))), Integer.valueOf((int) (((float) dVarArr[2].f10845a) / ((float) dVarArr[2].f10846b)))});
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + f.f10838a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(f.mo11835h(this.f10825f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public int mo11812e(String str, int i) {
        C3447b f = m14896f(str);
        if (f == null) {
            return i;
        }
        try {
            return f.mo11836i(this.f10825f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
