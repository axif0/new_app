package p340io.realm.exceptions;

import java.util.Locale;
import p340io.realm.internal.Keep;

@Keep
/* renamed from: io.realm.exceptions.RealmFileException */
public class RealmFileException extends RuntimeException {
    private final Kind kind;

    @Keep
    /* renamed from: io.realm.exceptions.RealmFileException$Kind */
    public enum Kind {
        ACCESS_ERROR,
        BAD_HISTORY,
        PERMISSION_DENIED,
        EXISTS,
        NOT_FOUND,
        INCOMPATIBLE_LOCK_FILE,
        FORMAT_UPGRADE_REQUIRED,
        INCOMPATIBLE_SYNC_FILE;

        static Kind getKind(byte b) {
            switch (b) {
                case 0:
                    return ACCESS_ERROR;
                case 1:
                    return BAD_HISTORY;
                case 2:
                    return PERMISSION_DENIED;
                case 3:
                    return EXISTS;
                case 4:
                    return NOT_FOUND;
                case 5:
                    return INCOMPATIBLE_LOCK_FILE;
                case 6:
                    return FORMAT_UPGRADE_REQUIRED;
                case 7:
                    return INCOMPATIBLE_SYNC_FILE;
                default:
                    throw new RuntimeException("Unknown value for RealmFileException kind.");
            }
        }
    }

    public RealmFileException(byte b, String str) {
        super(str);
        this.kind = Kind.getKind(b);
    }

    public RealmFileException(Kind kind2, String str) {
        super(str);
        this.kind = kind2;
    }

    public RealmFileException(Kind kind2, String str, Throwable th) {
        super(str, th);
        this.kind = kind2;
    }

    public RealmFileException(Kind kind2, Throwable th) {
        super(th);
        this.kind = kind2;
    }

    public Kind getKind() {
        return this.kind;
    }

    public String toString() {
        return String.format(Locale.US, "%s Kind: %s.", new Object[]{super.toString(), this.kind});
    }
}
