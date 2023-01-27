package p148g.p325e.p326a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: g.e.a.a */
public abstract class C5544a implements Cloneable {

    /* renamed from: f */
    ArrayList<C5545a> f16030f = null;

    /* renamed from: g.e.a.a$a */
    public interface C5545a {
        /* renamed from: a */
        void mo565a(C5544a aVar);

        /* renamed from: b */
        void mo566b(C5544a aVar);

        /* renamed from: c */
        void mo567c(C5544a aVar);
    }

    /* renamed from: b */
    public void mo15959b(C5545a aVar) {
        if (this.f16030f == null) {
            this.f16030f = new ArrayList<>();
        }
        this.f16030f.add(aVar);
    }

    /* renamed from: c */
    public C5544a clone() {
        try {
            C5544a aVar = (C5544a) super.clone();
            if (this.f16030f != null) {
                ArrayList<C5545a> arrayList = this.f16030f;
                aVar.f16030f = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aVar.f16030f.add(arrayList.get(i));
                }
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    public ArrayList<C5545a> mo15962d() {
        return this.f16030f;
    }

    /* renamed from: e */
    public void mo15963e(C5545a aVar) {
        ArrayList<C5545a> arrayList = this.f16030f;
        if (arrayList != null) {
            arrayList.remove(aVar);
            if (this.f16030f.size() == 0) {
                this.f16030f = null;
            }
        }
    }

    /* renamed from: f */
    public abstract C5544a mo15964f(long j);

    /* renamed from: g */
    public abstract void mo15965g(Interpolator interpolator);

    /* renamed from: i */
    public void mo15966i() {
    }
}
