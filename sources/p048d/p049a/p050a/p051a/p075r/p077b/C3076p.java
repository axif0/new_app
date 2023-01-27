package p048d.p049a.p050a.p051a.p075r.p077b;

import android.content.Context;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0636d;
import com.karumi.dexter.C2722R;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p078s.C3098k;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p390p.p391a.C6550a;

/* renamed from: d.a.a.a.r.b.p */
public class C3076p extends C2961b {

    /* renamed from: d0 */
    private C2971d f9798d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Context f9799e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C0636d f9800f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public LinearLayout f9801g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public TableLayout f9802h0;

    /* renamed from: d.a.a.a.r.b.p$b */
    private class C3078b extends AsyncTask<Void, Void, NodeList> {
        private C3078b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public NodeList doInBackground(Void... voidArr) {
            try {
                String entityUtils = EntityUtils.toString(C3098k.m13276a().execute(new HttpPost(C3076p.this.mo3158M().getString(C2722R.string.base_url).concat(C3076p.this.mo3169S(C2722R.string.endpoint_notices_for_android)))).getEntity());
                if (entityUtils.contains("html")) {
                    entityUtils = "<?xml version='1.0' encoding='UTF-8'?><map><entry key='isError'>true</entry><entry key='status'>denied</entry><entry key='errorMessage'>Exception Occurred</entry></map>";
                }
                DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                InputSource inputSource = new InputSource();
                inputSource.setCharacterStream(new StringReader(entityUtils));
                return newDocumentBuilder.parse(inputSource).getElementsByTagName("map");
            } catch (Exception e) {
                C3101n.m13300N(C3076p.this.f9799e0, "Sorry, Notice Can not be loaded");
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(NodeList nodeList) {
            Toast makeText;
            C3076p.this.mo10294J1();
            C6550a.m26771a("onPostExecute: " + nodeList.toString(), new Object[0]);
            try {
                NodeList childNodes = nodeList.item(0).getChildNodes();
                String textContent = ((Element) childNodes.item(childNodes.getLength() - 2)).getTextContent();
                if (textContent.equals("denied")) {
                    C3076p.this.mo10295K1(C3076p.this.f9800f0);
                    return;
                }
                if (!textContent.equals("false")) {
                    makeText = Toast.makeText(C3076p.this.f9799e0, "Notice Can not be loaded", 1);
                } else if (nodeList.getLength() > 1) {
                    C3076p.this.f9801g0.setVisibility(0);
                    int i = 1;
                    while (i < nodeList.getLength()) {
                        View view = new View(C3076p.this.f9799e0);
                        view.setLayoutParams(new TableRow.LayoutParams(-1, 1));
                        view.setBackgroundColor(C3076p.this.f9799e0.getResources().getColor(C2722R.color.color_white_100));
                        view.setPadding(10, 0, 0, 20);
                        NodeList childNodes2 = nodeList.item(i).getChildNodes();
                        TableRow tableRow = (TableRow) LayoutInflater.from(C3076p.this.f9799e0).inflate(C2722R.layout.row_notice, (ViewGroup) null);
                        TableRow tableRow2 = (TableRow) LayoutInflater.from(C3076p.this.f9799e0).inflate(C2722R.layout.row_notice, (ViewGroup) null);
                        Element element = (Element) childNodes2.item(0);
                        String concat = i != 1 ? "\n".concat(element.getTextContent()) : element.getTextContent();
                        ((TextView) tableRow.findViewById(C2722R.C2724id.title)).setText(concat + " : ");
                        ((TextView) tableRow.findViewById(C2722R.C2724id.title)).setTextSize(15.0f);
                        ((TextView) tableRow.findViewById(C2722R.C2724id.title)).setTypeface(Typeface.DEFAULT_BOLD);
                        C3076p.this.f9802h0.addView(tableRow);
                        C3076p.this.f9802h0.addView(view);
                        ((TextView) tableRow2.findViewById(C2722R.C2724id.title)).setText(((Element) childNodes2.item(1)).getTextContent());
                        C3076p.this.f9802h0.addView(tableRow2);
                        i++;
                    }
                    View view2 = new View(C3076p.this.f9799e0);
                    view2.setLayoutParams(new TableRow.LayoutParams(-1, 1));
                    view2.setBackgroundColor(C3076p.this.f9799e0.getResources().getColor(C2722R.color.colorAccent));
                    view2.setPadding(10, 0, 0, 20);
                    view2.getLayoutParams().height = 50;
                    C3076p.this.f9802h0.addView(view2);
                    return;
                } else {
                    makeText = Toast.makeText(C3076p.this.f9799e0, "No Notice Found", 1);
                }
                makeText.show();
            } catch (Exception e) {
                C3101n.m13300N(C3076p.this.f9799e0, "Sorry, Notice Can not be loaded");
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C3076p pVar = C3076p.this;
            pVar.mo10296L1(pVar.mo3169S(C2722R.string.loading_wait_message));
        }
    }

    static {
        Class<C3076p> cls = C3076p.class;
    }

    /* renamed from: Q1 */
    public static C3076p m13180Q1() {
        return new C3076p();
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9802h0 = (TableLayout) view.findViewById(C2722R.C2724id.tl_notice);
        this.f9801g0 = (LinearLayout) view.findViewById(C2722R.C2724id.ll_notice_details);
        new C3078b().execute(new Void[0]);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9798d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_notice));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_student_notice, viewGroup, false);
        this.f9799e0 = mo3242y();
        this.f9800f0 = mo3215o();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9798d0 = null;
    }
}
