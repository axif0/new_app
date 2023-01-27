package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4442a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4800u;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
public final class C1985w3 extends C4442a implements C1961u3 {
    C1985w3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: A */
    public final List<C1776ea> mo7121A(String str, String str2, boolean z, C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20440d(n, z);
        C4800u.m20439c(n, laVar);
        Parcel r = mo13768r(14, n);
        ArrayList<C1776ea> createTypedArrayList = r.createTypedArrayList(C1776ea.CREATOR);
        r.recycle();
        return createTypedArrayList;
    }

    /* renamed from: A0 */
    public final void mo7122A0(long j, String str, String str2, String str3) throws RemoteException {
        Parcel n = mo13767n();
        n.writeLong(j);
        n.writeString(str);
        n.writeString(str2);
        n.writeString(str3);
        mo13769w(10, n);
    }

    /* renamed from: B */
    public final List<C1776ea> mo7123B(C1860la laVar, boolean z) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, laVar);
        C4800u.m20440d(n, z);
        Parcel r = mo13768r(7, n);
        ArrayList<C1776ea> createTypedArrayList = r.createTypedArrayList(C1776ea.CREATOR);
        r.recycle();
        return createTypedArrayList;
    }

    /* renamed from: C */
    public final void mo7124C(C1968ua uaVar, C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, uaVar);
        C4800u.m20439c(n, laVar);
        mo13769w(12, n);
    }

    /* renamed from: D */
    public final void mo7125D(C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, laVar);
        mo13769w(4, n);
    }

    /* renamed from: E0 */
    public final void mo7126E0(C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, laVar);
        mo13769w(18, n);
    }

    /* renamed from: F0 */
    public final List<C1968ua> mo7127F0(String str, String str2, String str3) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        n.writeString(str3);
        Parcel r = mo13768r(17, n);
        ArrayList<C1968ua> createTypedArrayList = r.createTypedArrayList(C1968ua.CREATOR);
        r.recycle();
        return createTypedArrayList;
    }

    /* renamed from: G0 */
    public final void mo7128G0(C1933s sVar, String str, String str2) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, sVar);
        n.writeString(str);
        n.writeString(str2);
        mo13769w(5, n);
    }

    /* renamed from: H0 */
    public final List<C1968ua> mo7129H0(String str, String str2, C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20439c(n, laVar);
        Parcel r = mo13768r(16, n);
        ArrayList<C1968ua> createTypedArrayList = r.createTypedArrayList(C1968ua.CREATOR);
        r.recycle();
        return createTypedArrayList;
    }

    /* renamed from: I */
    public final void mo7130I(C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, laVar);
        mo13769w(20, n);
    }

    /* renamed from: P */
    public final void mo7131P(C1968ua uaVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, uaVar);
        mo13769w(13, n);
    }

    /* renamed from: T */
    public final void mo7132T(C1776ea eaVar, C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, eaVar);
        C4800u.m20439c(n, laVar);
        mo13769w(2, n);
    }

    /* renamed from: W */
    public final void mo7134W(C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, laVar);
        mo13769w(6, n);
    }

    /* renamed from: X */
    public final List<C1776ea> mo7135X(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        n.writeString(str3);
        C4800u.m20440d(n, z);
        Parcel r = mo13768r(15, n);
        ArrayList<C1776ea> createTypedArrayList = r.createTypedArrayList(C1776ea.CREATOR);
        r.recycle();
        return createTypedArrayList;
    }

    /* renamed from: Z */
    public final byte[] mo7136Z(C1933s sVar, String str) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, sVar);
        n.writeString(str);
        Parcel r = mo13768r(9, n);
        byte[] createByteArray = r.createByteArray();
        r.recycle();
        return createByteArray;
    }

    /* renamed from: a0 */
    public final void mo7137a0(C1933s sVar, C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, sVar);
        C4800u.m20439c(n, laVar);
        mo13769w(1, n);
    }

    /* renamed from: n0 */
    public final String mo7138n0(C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, laVar);
        Parcel r = mo13768r(11, n);
        String readString = r.readString();
        r.recycle();
        return readString;
    }

    /* renamed from: q0 */
    public final void mo7139q0(Bundle bundle, C1860la laVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, bundle);
        C4800u.m20439c(n, laVar);
        mo13769w(19, n);
    }
}
