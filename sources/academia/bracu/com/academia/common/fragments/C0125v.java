package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.io.IOException;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p067n.p069b.C2999g;
import p048d.p049a.p050a.p051a.p067n.p070c.C3004a;
import p048d.p049a.p050a.p051a.p078s.C3098k;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p340io.realm.C5648d0;
import p340io.realm.C5781q;
import p340io.realm.C5782q0;

/* renamed from: academia.bracu.com.academia.common.fragments.v */
public class C0125v extends C2961b {

    /* renamed from: d0 */
    private View f447d0 = null;

    /* renamed from: e0 */
    private String f448e0;

    /* renamed from: f0 */
    private String f449f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public Context f450g0;

    /* renamed from: h0 */
    private Bundle f451h0;

    /* renamed from: i0 */
    private C5648d0 f452i0;

    /* renamed from: academia.bracu.com.academia.common.fragments.v$b */
    private class C0127b extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private String f453a;

        C0127b(String str) {
            this.f453a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            try {
                return EntityUtils.toString(C3098k.m13276a().execute(new HttpGet(this.f453a)).getEntity());
            } catch (Exception e) {
                e.printStackTrace();
                return BuildConfig.FLAVOR;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            C0125v.this.m451S1(str);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C0125v vVar = C0125v.this;
            vVar.mo10296L1(vVar.mo3169S(C2722R.string.loading_wait_message));
        }
    }

    /* renamed from: academia.bracu.com.academia.common.fragments.v$c */
    private class C0128c extends ArrayAdapter<C3004a> {

        /* renamed from: f */
        private List<C3004a> f455f;

        /* renamed from: academia.bracu.com.academia.common.fragments.v$c$a */
        private class C0129a {

            /* renamed from: a */
            TextView f456a;

            /* renamed from: b */
            TextView f457b;

            /* renamed from: c */
            TextView f458c;

            private C0129a(C0128c cVar) {
            }
        }

        C0128c(C0125v vVar, List<C3004a> list) {
            super(vVar.f450g0, C2722R.layout.calendar_row);
            this.f455f = list;
        }

        public int getCount() {
            List<C3004a> list = this.f455f;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C0129a aVar;
            C3004a aVar2 = this.f455f.get(i);
            if (view == null) {
                aVar = new C0129a();
                view2 = LayoutInflater.from(getContext()).inflate(C2722R.layout.calendar_row, viewGroup, false);
                aVar.f456a = (TextView) view2.findViewById(C2722R.C2724id.tv_text_date);
                aVar.f457b = (TextView) view2.findViewById(C2722R.C2724id.tv_text_day);
                aVar.f458c = (TextView) view2.findViewById(C2722R.C2724id.tv_text_event);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C0129a) view.getTag();
            }
            aVar.f456a.setText(aVar2.mo10360U());
            aVar.f457b.setText(aVar2.mo10362W());
            aVar.f458c.setText(aVar2.mo10361V());
            return view2;
        }
    }

    static {
        Class<C0125v> cls = C0125v.class;
    }

    /* renamed from: O1 */
    private void m447O1(List<C3004a> list) {
        if (list != null && list.size() > 0) {
            ((ListView) this.f447d0.findViewById(C2722R.C2724id.lv_calendar_list)).setAdapter(new C0128c(this, list));
            TextView textView = (TextView) this.f447d0.findViewById(C2722R.C2724id.calendar_footer_text);
            textView.setText("* Subject to appearance of the moon and Subject to decision by the Government regarding  the official holidays.");
            textView.setTextColor(this.f450g0.getResources().getColor(C2722R.color.color_white_100));
        }
    }

    /* renamed from: Q1 */
    static /* synthetic */ void m449Q1(C3004a aVar, C5648d0 d0Var) {
        C3004a aVar2 = (C3004a) d0Var.mo16272g0(aVar, new C5781q[0]);
    }

    /* renamed from: R1 */
    public static C0125v m450R1(Bundle bundle) {
        C0125v vVar = new C0125v();
        if (bundle != null) {
            vVar.mo3233u1(bundle);
        }
        return vVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public void m451S1(String str) {
        String str2;
        mo10294J1();
        try {
            DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new StringReader(str));
            NodeList elementsByTagName = newDocumentBuilder.parse(inputSource).getElementsByTagName("event");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                ArrayList arrayList = new ArrayList();
                Number u = this.f452i0.mo16277u0(C3004a.class).mo16168u("id");
                long intValue = u == null ? 1 : (long) (u.intValue() + 1);
                int i = 0;
                int i2 = 0;
                while (i2 < elementsByTagName.getLength()) {
                    Element element = (Element) elementsByTagName.item(i2);
                    String textContent = element.getElementsByTagName("date").item(i).getTextContent();
                    String textContent2 = element.getElementsByTagName("title").item(i).getTextContent();
                    String textContent3 = element.getElementsByTagName("start-date").item(i).getTextContent();
                    if (textContent3 != null) {
                        if (textContent3.contains(" ")) {
                            textContent3 = textContent3.substring(i, textContent3.indexOf(32));
                        }
                    }
                    String textContent4 = element.getElementsByTagName("end-date").item(i).getTextContent();
                    if (textContent4 != null && textContent4.contains(" ")) {
                        textContent4 = textContent4.substring(i, textContent4.indexOf(32));
                    }
                    if (textContent3.equals(textContent4)) {
                        str2 = new SimpleDateFormat("EEEE", Locale.getDefault()).format(new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).parse(textContent3));
                    } else {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                        Date parse = simpleDateFormat.parse(textContent3);
                        Date parse2 = simpleDateFormat.parse(textContent4);
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEEE", Locale.getDefault());
                        str2 = simpleDateFormat2.format(parse) + " to " + simpleDateFormat2.format(parse2);
                    }
                    C3004a aVar = new C3004a();
                    aVar.mo10374h0(intValue);
                    aVar.mo10371e0(textContent);
                    aVar.mo10372f0(textContent2);
                    aVar.mo10373g0(str2);
                    aVar.mo10376j0(this.f449f0);
                    aVar.mo10375i0(this.f448e0);
                    arrayList.add(aVar);
                    this.f452i0.mo16275m0(new C0095b(aVar));
                    intValue++;
                    i2++;
                    i = 0;
                }
                m447O1(arrayList);
            }
        } catch (IOException | ParseException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f450g0)) {
            C3101n.m13303R(this.f450g0);
            return true;
        }
        new C0127b("http://www.bracu.ac.bd/academic/" + this.f448e0 + "/" + this.f449f0 + "/rss.xml").execute(new Void[0]);
        return true;
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        mo3236v1(true);
        if (mo3237w() != null) {
            this.f451h0 = mo3237w();
        }
    }

    /* renamed from: s0 */
    public void mo397s0(Menu menu, MenuInflater menuInflater) {
        super.mo397s0(menu, menuInflater);
        menuInflater.inflate(C2722R.C2725menu.menu_refresh, menu);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context y = mo3242y();
        this.f450g0 = y;
        this.f452i0 = C2999g.m12790d(y).mo10336c();
        this.f447d0 = layoutInflater.inflate(C2722R.layout.fragment_calendar, viewGroup, false);
        this.f448e0 = this.f451h0.getString("semester");
        this.f449f0 = this.f451h0.getString("year");
        String b = C2999g.m12790d(this.f450g0).mo10335b();
        if (!b.isEmpty() && !b.equals(this.f449f0)) {
            this.f452i0.mo16275m0(C0092a.f394a);
        }
        C5782q0<C3004a> a = C2999g.m12790d(this.f450g0).mo10334a(this.f448e0);
        if (a == null || a.size() <= 0) {
            new C0127b("http://www.bracu.ac.bd/academic/" + this.f448e0 + "/" + this.f449f0 + "/rss.xml").execute(new Void[0]);
        } else {
            m447O1(a);
        }
        return this.f447d0;
    }
}
