package com.bumptech.glide.load.p014q.p017f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p008o.C1141v;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.f.d */
public class C1289d implements C1004k<Uri, Drawable> {

    /* renamed from: a */
    private final Context f4508a;

    public C1289d(Context context) {
        this.f4508a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m6460d(Uri uri, String str) {
        if (str.equals(this.f4508a.getPackageName())) {
            return this.f4508a;
        }
        try {
            return this.f4508a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f4508a.getPackageName())) {
                return this.f4508a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    private int m6461e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    private int m6462f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    private int m6463g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m6462f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m6461e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public C1141v<Drawable> mo5158a(Uri uri, int i, int i2, C1002i iVar) {
        Context d = m6460d(uri, uri.getAuthority());
        return C1288c.m6456f(C1286a.m6450b(this.f4508a, d, m6463g(d, uri)));
    }

    /* renamed from: h */
    public boolean mo5159b(Uri uri, C1002i iVar) {
        return uri.getScheme().equals("android.resource");
    }
}
