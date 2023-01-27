package academia.bracu.com.academia.common.fragments;

import academia.bracu.com.academia.app.C0001a;
import android.os.Bundle;
import androidx.preference.C0785g;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.karumi.dexter.C2722R;
import java.util.HashMap;
import java.util.Map;
import p048d.p049a.p050a.p051a.p078s.C3099l;

/* renamed from: academia.bracu.com.academia.common.fragments.d0 */
public class C0101d0 extends C0785g {

    /* renamed from: k0 */
    private Map<String, Integer> f409k0 = new HashMap();

    static {
        Class<C0101d0> cls = C0101d0.class;
    }

    /* renamed from: Q1 */
    public void mo371Q1(Bundle bundle, String str) {
        mo3945Y1(C2722R.xml.preferences, str);
        String[] stringArray = mo3158M().getStringArray(C2722R.array.theme_entry_array);
        for (int i = 0; i < stringArray.length; i++) {
            this.f409k0.put(stringArray[i], Integer.valueOf(i));
        }
        ListPreference listPreference = (ListPreference) mo3745e(mo3169S(C2722R.string.theme_pref_key));
        String d = C3099l.m13277b(mo3242y()).mo10691d(mo3169S(C2722R.string.theme_pref_key));
        if (this.f409k0.containsKey(d)) {
            listPreference.mo3747W0(this.f409k0.get(d).intValue());
        }
        listPreference.mo3849x0(new C0118p(this));
    }

    /* renamed from: a2 */
    public /* synthetic */ boolean mo372a2(Preference preference, Object obj) {
        String str = (String) obj;
        C3099l.m13277b(mo3242y()).mo10696i(mo3169S(C2722R.string.theme_pref_key), str);
        C0001a.f0a.mo3a(str);
        return true;
    }
}
