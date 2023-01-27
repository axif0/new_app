package academia.bracu.com.academia.spinner;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.fragment.app.C0632c;
import androidx.fragment.app.C0636d;
import com.karumi.dexter.C2722R;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* renamed from: academia.bracu.com.academia.spinner.b */
public class C0179b extends C0632c implements SearchView.OnQueryTextListener, SearchView.OnCloseListener {

    /* renamed from: p0 */
    private ArrayAdapter f622p0;

    /* renamed from: q0 */
    private ListView f623q0;

    /* renamed from: r0 */
    private C0181b f624r0;

    /* renamed from: s0 */
    private C0180a f625s0;

    /* renamed from: t0 */
    private SearchView f626t0;

    /* renamed from: u0 */
    private String f627u0;

    /* renamed from: v0 */
    private String f628v0;

    /* renamed from: w0 */
    private Context f629w0;

    /* renamed from: x0 */
    private DialogInterface.OnClickListener f630x0;

    /* renamed from: academia.bracu.com.academia.spinner.b$a */
    public interface C0180a {
        /* renamed from: a */
        void mo551a(String str);
    }

    /* renamed from: academia.bracu.com.academia.spinner.b$b */
    public interface C0181b<T> extends Serializable {
        /* renamed from: C */
        void mo527C(T t, int i);
    }

    /* renamed from: Y1 */
    public static C0179b m650Y1(List list) {
        C0179b bVar = new C0179b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("items", (Serializable) list);
        bVar.mo3233u1(bundle);
        return bVar;
    }

    /* renamed from: Z1 */
    private void m651Z1(View view) {
        SearchView searchView = (SearchView) view.findViewById(C2722R.C2724id.search);
        this.f626t0 = searchView;
        searchView.setSearchableInfo(((SearchManager) ((C0636d) Objects.requireNonNull(mo3215o())).getSystemService("search")).getSearchableInfo(mo3215o().getComponentName()));
        this.f626t0.setIconifiedByDefault(false);
        this.f626t0.setOnQueryTextListener(this);
        this.f626t0.setOnCloseListener(this);
        this.f626t0.clearFocus();
        ((InputMethodManager) mo3215o().getSystemService("input_method")).hideSoftInputFromWindow(this.f626t0.getWindowToken(), 0);
        this.f623q0 = (ListView) view.findViewById(C2722R.C2724id.listItems);
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo3215o(), 17367043, (List) Objects.requireNonNull((List) ((Bundle) Objects.requireNonNull(mo3237w())).getSerializable("items")));
        this.f622p0 = arrayAdapter;
        this.f623q0.setAdapter(arrayAdapter);
        this.f623q0.setTextFilterEnabled(true);
        this.f623q0.setOnItemClickListener(new C0178a(this));
    }

    /* renamed from: F0 */
    public void mo539F0() {
        super.mo539F0();
        mo3284L1();
    }

    /* renamed from: K0 */
    public void mo540K0() {
        super.mo540K0();
        double d = (double) this.f629w0.getResources().getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        int i = this.f629w0.getResources().getDisplayMetrics().heightPixels;
        Dialog O1 = mo3286O1();
        ((Window) Objects.requireNonNull(O1.getWindow())).setLayout((int) (d * 0.75d), i);
        Window window = O1.getWindow();
        window.setLayout(-1, -2);
        window.setGravity(17);
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        bundle.putSerializable("item", this.f624r0);
        super.mo541L0(bundle);
    }

    /* renamed from: Q1 */
    public Dialog mo542Q1(Bundle bundle) {
        LayoutInflater from = LayoutInflater.from(mo3215o());
        if (bundle != null) {
            this.f624r0 = (C0181b) bundle.getSerializable("item");
        }
        View inflate = from.inflate(C2722R.layout.searchable_list_dialog, (ViewGroup) null);
        m651Z1(inflate);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo3215o());
        builder.setView(inflate);
        String str = this.f628v0;
        if (str == null) {
            str = "CLOSE";
        }
        builder.setPositiveButton(str, this.f630x0);
        String str2 = this.f627u0;
        if (str2 == null) {
            str2 = "Select Item";
        }
        builder.setTitle(str2);
        AlertDialog create = builder.create();
        ((Window) Objects.requireNonNull(create.getWindow())).setSoftInputMode(2);
        return create;
    }

    /* renamed from: X1 */
    public /* synthetic */ void mo543X1(AdapterView adapterView, View view, int i, long j) {
        this.f624r0.mo527C(this.f622p0.getItem(i), i);
        mo3286O1().dismiss();
    }

    /* renamed from: a2 */
    public void mo544a2(C0180a aVar) {
        this.f625s0 = aVar;
    }

    /* renamed from: b2 */
    public void mo545b2(C0181b bVar) {
        this.f624r0 = bVar;
    }

    /* renamed from: c2 */
    public void mo546c2(String str) {
        this.f628v0 = str;
    }

    /* renamed from: d2 */
    public void mo547d2(String str) {
        this.f627u0 = str;
    }

    public boolean onClose() {
        return false;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ArrayAdapter) this.f623q0.getAdapter()).getFilter().filter((CharSequence) null);
        } else {
            ((ArrayAdapter) this.f623q0.getAdapter()).getFilter().filter(str);
        }
        C0180a aVar = this.f625s0;
        if (aVar == null) {
            return true;
        }
        aVar.mo551a(str);
        return true;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f626t0.clearFocus();
        return true;
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        this.f629w0 = mo3242y();
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Window) Objects.requireNonNull(mo3286O1().getWindow())).setSoftInputMode(2);
        mo3289S1(false);
        return super.mo345t0(layoutInflater, viewGroup, bundle);
    }
}
