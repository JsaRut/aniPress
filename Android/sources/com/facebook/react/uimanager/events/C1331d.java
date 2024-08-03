package com.facebook.react.uimanager.events;

import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.events.d */
/* loaded from: classes.dex */
class C1331d implements Comparator<AbstractC1330c> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(AbstractC1330c abstractC1330c, AbstractC1330c abstractC1330c2) {
        if (abstractC1330c == null && abstractC1330c2 == null) {
            return 0;
        }
        if (abstractC1330c == null) {
            return -1;
        }
        if (abstractC1330c2 == null) {
            return 1;
        }
        long m5721e = abstractC1330c.m5721e() - abstractC1330c2.m5721e();
        if (m5721e == 0) {
            return 0;
        }
        return m5721e < 0 ? -1 : 1;
    }
}
