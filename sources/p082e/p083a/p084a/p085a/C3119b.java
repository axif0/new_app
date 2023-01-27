package p082e.p083a.p084a.p085a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p082e.p083a.p084a.p085a.C3116a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: e.a.a.a.b */
public class C3119b implements Parcelable {
    public static final Parcelable.Creator<C3119b> CREATOR = new C3120a();

    /* renamed from: f */
    final Handler f9924f = null;

    /* renamed from: g */
    C3116a f9925g;

    /* renamed from: e.a.a.a.b$a */
    class C3120a implements Parcelable.Creator<C3119b> {
        C3120a() {
        }

        /* renamed from: a */
        public C3119b createFromParcel(Parcel parcel) {
            return new C3119b(parcel);
        }

        /* renamed from: b */
        public C3119b[] newArray(int i) {
            return new C3119b[i];
        }
    }

    /* renamed from: e.a.a.a.b$b */
    class C3121b extends C3116a.C3117a {
        C3121b() {
        }

        /* renamed from: P0 */
        public void mo10754P0(int i, Bundle bundle) {
            C3119b bVar = C3119b.this;
            Handler handler = bVar.f9924f;
            if (handler != null) {
                handler.post(new C3122c(i, bundle));
            } else {
                bVar.mo586a(i, bundle);
            }
        }
    }

    /* renamed from: e.a.a.a.b$c */
    class C3122c implements Runnable {

        /* renamed from: f */
        final int f9927f;

        /* renamed from: g */
        final Bundle f9928g;

        C3122c(int i, Bundle bundle) {
            this.f9927f = i;
            this.f9928g = bundle;
        }

        public void run() {
            C3119b.this.mo586a(this.f9927f, this.f9928g);
        }
    }

    C3119b(Parcel parcel) {
        this.f9925g = C3116a.C3117a.m13378n(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo586a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f9925g == null) {
                this.f9925g = new C3121b();
            }
            parcel.writeStrongBinder(this.f9925g.asBinder());
        }
    }
}
