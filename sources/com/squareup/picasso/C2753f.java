package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.IOException;
import java.io.InputStream;
import p385n.C6288l;

/* renamed from: com.squareup.picasso.f */
class C2753f extends C2793y {

    /* renamed from: b */
    private static final UriMatcher f8797b;

    /* renamed from: a */
    private final Context f8798a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f8797b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f8797b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f8797b.addURI("com.android.contacts", "contacts/#/photo", 2);
        f8797b.addURI("com.android.contacts", "contacts/#", 3);
        f8797b.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C2753f(Context context) {
        this.f8798a = context;
    }

    /* renamed from: j */
    private InputStream m12160j(C2789w wVar) throws IOException {
        ContentResolver contentResolver = this.f8798a.getContentResolver();
        Uri uri = wVar.f8909d;
        int match = f8797b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: c */
    public boolean mo10008c(C2789w wVar) {
        Uri uri = wVar.f8909d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f8797b.match(wVar.f8909d) != -1;
    }

    /* renamed from: f */
    public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
        InputStream j = m12160j(wVar);
        if (j == null) {
            return null;
        }
        return new C2793y.C2794a(C6288l.m25940k(j), C2776t.C2782e.DISK);
    }
}
