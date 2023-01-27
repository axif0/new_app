package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.d9 */
final class C4508d9 extends C4545f9<FieldDescriptorType, Object> {
    C4508d9(int i) {
        super(i, (C4508d9) null);
    }

    /* renamed from: e */
    public final void mo14046e() {
        if (!mo14128i()) {
            for (int i = 0; i < mo14129j(); i++) {
                Map.Entry h = mo14126h(i);
                if (((C4808u6) h.getKey()).mo14673d()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo14130m()) {
                if (((C4808u6) entry.getKey()).mo14673d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo14046e();
    }
}
