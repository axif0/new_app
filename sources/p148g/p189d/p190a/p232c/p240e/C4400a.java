package p148g.p189d.p190a.p232c.p240e;

import android.os.IBinder;
import android.os.IInterface;
import p148g.p189d.p190a.p232c.p241f.p245d.C4420a;
import p148g.p189d.p190a.p232c.p241f.p245d.C4421b;

/* renamed from: g.d.a.c.e.a */
public interface C4400a extends IInterface {

    /* renamed from: g.d.a.c.e.a$a */
    public static abstract class C4401a extends C4421b implements C4400a {

        /* renamed from: g.d.a.c.e.a$a$a */
        public static class C4402a extends C4420a implements C4400a {
            C4402a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C4401a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: r */
        public static C4400a m18642r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C4400a ? (C4400a) queryLocalInterface : new C4402a(iBinder);
        }
    }
}
