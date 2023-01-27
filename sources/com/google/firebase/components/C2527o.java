package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.o */
public class C2527o extends C2528p {
    public C2527o(List<C2508d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
    }
}
