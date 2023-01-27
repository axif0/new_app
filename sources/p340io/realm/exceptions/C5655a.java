package p340io.realm.exceptions;

import p340io.realm.C5804v0;

/* renamed from: io.realm.exceptions.a */
public class C5655a extends RuntimeException {
    public C5655a(C5804v0 v0Var, String str) {
        super("Realm was interrupted while downloading the latest changes from the server: " + v0Var.mo16315k() + "\n" + str);
    }

    public C5655a(C5804v0 v0Var, Throwable th) {
        super("Realm was interrupted while downloading the latest changes from the server: " + v0Var.mo16315k(), th);
    }
}
