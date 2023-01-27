package p086f.p087a.p094o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0341j;
import androidx.appcompat.view.menu.C0354o;
import java.util.ArrayList;
import p086f.p087a.p094o.C3155b;
import p086f.p102e.C3203g;
import p086f.p111h.p115g.p116a.C3303a;
import p086f.p111h.p115g.p116a.C3304b;

/* renamed from: f.a.o.f */
public class C3160f extends ActionMode {

    /* renamed from: a */
    final Context f10032a;

    /* renamed from: b */
    final C3155b f10033b;

    /* renamed from: f.a.o.f$a */
    public static class C3161a implements C3155b.C3156a {

        /* renamed from: a */
        final ActionMode.Callback f10034a;

        /* renamed from: b */
        final Context f10035b;

        /* renamed from: c */
        final ArrayList<C3160f> f10036c = new ArrayList<>();

        /* renamed from: d */
        final C3203g<Menu, Menu> f10037d = new C3203g<>();

        public C3161a(Context context, ActionMode.Callback callback) {
            this.f10035b = context;
            this.f10034a = callback;
        }

        /* renamed from: f */
        private Menu m13532f(Menu menu) {
            Menu menu2 = this.f10037d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0354o oVar = new C0354o(this.f10035b, (C3303a) menu);
            this.f10037d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public boolean mo932a(C3155b bVar, Menu menu) {
            return this.f10034a.onPrepareActionMode(mo10938e(bVar), m13532f(menu));
        }

        /* renamed from: b */
        public void mo933b(C3155b bVar) {
            this.f10034a.onDestroyActionMode(mo10938e(bVar));
        }

        /* renamed from: c */
        public boolean mo934c(C3155b bVar, MenuItem menuItem) {
            return this.f10034a.onActionItemClicked(mo10938e(bVar), new C0341j(this.f10035b, (C3304b) menuItem));
        }

        /* renamed from: d */
        public boolean mo935d(C3155b bVar, Menu menu) {
            return this.f10034a.onCreateActionMode(mo10938e(bVar), m13532f(menu));
        }

        /* renamed from: e */
        public ActionMode mo10938e(C3155b bVar) {
            int size = this.f10036c.size();
            for (int i = 0; i < size; i++) {
                C3160f fVar = this.f10036c.get(i);
                if (fVar != null && fVar.f10033b == bVar) {
                    return fVar;
                }
            }
            C3160f fVar2 = new C3160f(this.f10035b, bVar);
            this.f10036c.add(fVar2);
            return fVar2;
        }
    }

    public C3160f(Context context, C3155b bVar) {
        this.f10032a = context;
        this.f10033b = bVar;
    }

    public void finish() {
        this.f10033b.mo1016c();
    }

    public View getCustomView() {
        return this.f10033b.mo1017d();
    }

    public Menu getMenu() {
        return new C0354o(this.f10032a, (C3303a) this.f10033b.mo1018e());
    }

    public MenuInflater getMenuInflater() {
        return this.f10033b.mo1019f();
    }

    public CharSequence getSubtitle() {
        return this.f10033b.mo1020g();
    }

    public Object getTag() {
        return this.f10033b.mo10909h();
    }

    public CharSequence getTitle() {
        return this.f10033b.mo1021i();
    }

    public boolean getTitleOptionalHint() {
        return this.f10033b.mo10910j();
    }

    public void invalidate() {
        this.f10033b.mo1022k();
    }

    public boolean isTitleOptional() {
        return this.f10033b.mo1023l();
    }

    public void setCustomView(View view) {
        this.f10033b.mo1024m(view);
    }

    public void setSubtitle(int i) {
        this.f10033b.mo1025n(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f10033b.mo1026o(charSequence);
    }

    public void setTag(Object obj) {
        this.f10033b.mo10911p(obj);
    }

    public void setTitle(int i) {
        this.f10033b.mo1027q(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10033b.mo1028r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f10033b.mo1029s(z);
    }
}
