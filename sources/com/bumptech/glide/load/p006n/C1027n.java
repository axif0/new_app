package com.bumptech.glide.load.p006n;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.n */
public class C1027n extends C1025l<InputStream> {

    /* renamed from: i */
    private static final UriMatcher f3991i;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3991i = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f3991i.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f3991i.addURI("com.android.contacts", "contacts/#/photo", 2);
        f3991i.addURI("com.android.contacts", "contacts/#", 3);
        f3991i.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f3991i.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C1027n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: i */
    private InputStream m5625i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f3991i.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m5626j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m5626j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    private InputStream m5626j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: a */
    public Class<InputStream> mo5162a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5163c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo5164d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i = m5625i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
