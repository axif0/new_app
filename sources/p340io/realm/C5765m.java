package p340io.realm;

import java.util.Locale;
import p340io.realm.log.RealmLog;

/* renamed from: io.realm.m */
public enum C5765m {
    UNKNOWN("unknown", -1),
    IO_EXCEPTION("java", 0, C5766a.RECOVERABLE),
    JSON_EXCEPTION("auth", 1),
    CLIENT_RESET("realm::sync::ProtocolError", 7),
    CONNECTION_CLOSED("realm::sync::ProtocolError", 100, C5766a.RECOVERABLE),
    OTHER_ERROR("realm::sync::ProtocolError", 101),
    UNKNOWN_MESSAGE("realm::sync::ProtocolError", 102),
    BAD_SYNTAX("realm::sync::ProtocolError", 103),
    LIMITS_EXCEEDED("realm::sync::ProtocolError", 104),
    WRONG_PROTOCOL_VERSION("realm::sync::ProtocolError", 105),
    BAD_SESSION_IDENT("realm::sync::ProtocolError", 106),
    REUSE_OF_SESSION_IDENT("realm::sync::ProtocolError", 107),
    BOUND_IN_OTHER_SESSION("realm::sync::ProtocolError", 108),
    BAD_MESSAGE_ORDER("realm::sync::ProtocolError", 109),
    BAD_DECOMPRESSION("realm::sync::ProtocolError", 110),
    BAD_CHANGESET_HEADER_SYNTAX("realm::sync::ProtocolError", 111),
    BAD_CHANGESET_SIZE("realm::sync::ProtocolError", 112),
    BAD_CHANGESETS("realm::sync::ProtocolError", 113),
    SESSION_CLOSED("realm::sync::ProtocolError", 200, C5766a.RECOVERABLE),
    OTHER_SESSION_ERROR("realm::sync::ProtocolError", 201, C5766a.RECOVERABLE),
    TOKEN_EXPIRED("realm::sync::ProtocolError", 202, C5766a.RECOVERABLE),
    BAD_AUTHENTICATION("realm::sync::ProtocolError", 203),
    ILLEGAL_REALM_PATH("realm::sync::ProtocolError", 204),
    NO_SUCH_PATH("realm::sync::ProtocolError", 205),
    PERMISSION_DENIED("realm::sync::ProtocolError", 206),
    BAD_SERVER_FILE_IDENT("realm::sync::ProtocolError", 207),
    BAD_CLIENT_FILE_IDENT("realm::sync::ProtocolError", 208),
    BAD_SERVER_VERSION("realm::sync::ProtocolError", 209),
    BAD_CLIENT_VERSION("realm::sync::ProtocolError", 210),
    DIVERGING_HISTORIES("realm::sync::ProtocolError", 211),
    BAD_CHANGESET("realm::sync::ProtocolError", 212),
    DISABLED_SESSION("realm::sync::ProtocolError", 213),
    PARTIAL_SYNC_DISABLED("realm::sync::ProtocolError", 214),
    UNSUPPORTED_SESSION_FEATURE("realm::sync::ProtocolError", 215),
    BAD_ORIGIN_FILE_IDENT("realm::sync::ProtocolError", 216),
    CLIENT_CONNECTION_CLOSED("realm::sync::Client::Error", 100),
    CLIENT_UNKNOWN_MESSAGE("realm::sync::Client::Error", 101),
    CLIENT_LIMITS_EXCEEDED("realm::sync::Client::Error", 103),
    CLIENT_BAD_SESSION_IDENT("realm::sync::Client::Error", 104),
    CLIENT_BAD_MESSAGE_ORDER("realm::sync::Client::Error", 105),
    CLIENT_BAD_CLIENT_FILE_IDENT("realm::sync::Client::Error", 106),
    CLIENT_BAD_PROGRESS("realm::sync::Client::Error", 107),
    CLIENT_BAD_CHANGESET_HEADER_SYNTAX("realm::sync::Client::Error", 108),
    CLIENT_BAD_CHANGESET_SIZE("realm::sync::Client::Error", 109),
    CLIENT_BAD_ORIGIN_FILE_IDENT("realm::sync::Client::Error", 110),
    CLIENT_BAD_SERVER_VERSION("realm::sync::Client::Error", 111),
    CLIENT_BAD_CHANGESET("realm::sync::Client::Error", 112),
    BAD_REQUEST_IDENT("realm::sync::Client::Error", 113),
    BAD_ERROR_CODE("realm::sync::Client::Error", 114),
    BAD_COMPRESSION("realm::sync::Client::Error", 115),
    BAD_CLIENT_VERSION_DOWNLOAD("realm::sync::Client::Error", 116),
    SSL_SERVER_CERT_REJECTED("realm::sync::Client::Error", 117),
    PONG_TIMEOUT("realm::sync::Client::Error", 118),
    CLIENT_BAD_CLIENT_FILE_IDENT_SALT("realm::sync::Client::Error", 119),
    CLIENT_FILE_IDENT("realm::sync::Client::Error", 120),
    CLIENT_CONNECT_TIMEOUT("realm::sync::Client::Error", 121),
    CLIENT_BAD_TIMESTAMP("realm::sync::Client::Error", 122),
    MULTIPLE_CHOICES("http", 300),
    MOVED_PERMANENTLY("http", 301),
    FOUND("http", 302),
    SEE_OTHER("http", 303),
    NOT_MODIFIED("http", 304),
    USE_PROXY("http", 305),
    TEMPORARY_REDIRECT("http", 307),
    PERMANENT_REDIRECT("http", 308),
    BAD_REQUEST("http", 400),
    UNAUTHORIZED("http", 401),
    PAYMENT_REQUIRED("http", 402),
    FORBIDDEN("http", 403),
    NOT_FOUND("http", 404),
    METHOD_NOT_ALLOWED("http", 405),
    NOT_ACCEPTABLE("http", 406),
    PROXY_AUTHENTICATION_REQUIRED("http", 407),
    REQUEST_TIMEOUT("http", 408),
    CONFLICT("http", 409),
    GONE("http", 410),
    LENGTH_REQUIRED("http", 411),
    PRECONDITION_FAILED("http", 412),
    PAYLOAD_TOO_LARGE("http", 413),
    URI_TOO_LONG("http", 414),
    UNSUPPORTED_MEDIA_TYPE("http", 415),
    RANGE_NOT_SATISFIABLE("http", 416),
    EXPECTATION_FAILED("http", 417),
    MISDIRECTED_REQUEST("http", 421),
    UNPROCESSABLE_ENTITY("http", 422),
    LOCKED("http", 423),
    FAILED_DEPENDENCY("http", 424),
    UPGRADE_REQUIRED("http", 426),
    PRECONDITION_REQUIRED("http", 428),
    TOO_MANY_REQUESTS("http", 429),
    REQUEST_HEADER_FIELDS_TOO_LARGE("http", 431),
    UNAVAILABLE_FOR_LEGAL_REASONS("http", 451),
    INTERNAL_SERVER_ERROR("http", 500),
    NOT_IMPLEMENTED("http", 501),
    BAD_GATEWAY("http", 502),
    SERVICE_UNAVAILABLE("http", 503),
    GATEWAY_TIMEOUT("http", 504),
    HTTP_VERSION_NOT_SUPPORTED("http", 505),
    VARIANT_ALSO_NEGOTIATES("http", 506),
    INSUFFICIENT_STORAGE("http", 507),
    LOOP_DETECTED("http", 508),
    NOT_EXTENDED("http", 510),
    NETWORK_AUTHENTICATION_REQUIRED("http", 511),
    INVALID_PARAMETERS("auth", 601),
    MISSING_PARAMETERS("auth", 602),
    INVALID_CREDENTIALS("auth", 611),
    UNKNOWN_ACCOUNT("auth", 612),
    EXISTING_ACCOUNT("auth", 613),
    ACCESS_DENIED("auth", 614),
    EXPIRED_REFRESH_TOKEN("auth", 615),
    INVALID_HOST("auth", 616),
    REALM_NOT_FOUND("auth", 617),
    UNKNOWN_USER("auth", 618),
    WRONG_REALM_TYPE("auth", 619),
    EXPIRED_PERMISSION_OFFER("auth", 701),
    AMBIGUOUS_PERMISSION_OFFER_TOKEN("auth", 702),
    FILE_MAY_NOT_BE_SHARED("auth", 703),
    SERVER_MISCONFIGURATION("auth", 801),
    CONNECTION_RESET_BY_PEER("realm.basic_system", 104, C5766a.RECOVERABLE),
    CONNECTION_SOCKET_SHUTDOWN("realm.basic_system", 110, C5766a.RECOVERABLE),
    CONNECTION_REFUSED("realm.basic_system", 111, C5766a.RECOVERABLE),
    CONNECTION_ADDRESS_IN_USE("realm.basic_system", 112, C5766a.RECOVERABLE),
    CONNECTION_CONNECTION_ABORTED("realm.basic_system", 113, C5766a.RECOVERABLE),
    MISC_END_OF_INPUT("realm.util.misc_ext", 1),
    MISC_PREMATURE_END_OF_INPUT("realm.util.misc_ext", 2),
    MISC_DELIMITER_NOT_FOUND("realm.util.misc_ext", 3);
    

    /* renamed from: f */
    private final String f16740f;

    /* renamed from: g */
    private final int f16741g;

    /* renamed from: h */
    private final C5766a f16742h;

    /* renamed from: io.realm.m$a */
    public enum C5766a {
        FATAL,
        RECOVERABLE
    }

    private C5765m(String str, int i) {
        this(r7, r8, str, i, C5766a.FATAL);
    }

    private C5765m(String str, int i, C5766a aVar) {
        this.f16740f = str;
        this.f16741g = i;
        this.f16742h = aVar;
    }

    /* renamed from: e */
    public static C5765m m24090e(String str, int i) {
        C5765m[] values = values();
        for (C5765m mVar : values) {
            if (mVar.mo16735j() == i && mVar.f16740f.equals(str)) {
                return mVar;
            }
        }
        RealmLog.m24088n(String.format(Locale.US, "Unknown error code: '%s:%d'", new Object[]{str, Integer.valueOf(i)}), new Object[0]);
        return UNKNOWN;
    }

    /* renamed from: g */
    public C5766a mo16733g() {
        return this.f16742h;
    }

    /* renamed from: h */
    public String mo16734h() {
        return this.f16740f;
    }

    /* renamed from: j */
    public int mo16735j() {
        return this.f16741g;
    }

    public String toString() {
        return super.toString() + "(" + this.f16740f + ":" + this.f16741g + ")";
    }
}
