package com.facebook.react.modules.core;

import com.facebook.react.modules.core.Timing;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.core.j */
/* loaded from: classes.dex */
public class C1171j implements Comparator<Timing.C1160c> {

    /* renamed from: a */
    final /* synthetic */ Timing f4514a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1171j(Timing timing) {
        this.f4514a = timing;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Timing.C1160c c1160c, Timing.C1160c c1160c2) {
        long j = c1160c.f4488d - c1160c2.f4488d;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
