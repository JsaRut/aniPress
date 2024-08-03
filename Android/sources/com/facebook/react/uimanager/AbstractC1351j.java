package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.C1163b;

/* renamed from: com.facebook.react.uimanager.j */
/* loaded from: classes.dex */
public abstract class AbstractC1351j extends C1163b.a {

    /* renamed from: b */
    private final ReactContext f5007b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1351j(ReactContext reactContext) {
        this.f5007b = reactContext;
    }

    @Override // com.facebook.react.modules.core.C1163b.a
    /* renamed from: a */
    public final void mo5272a(long j) {
        try {
            mo5158b(j);
        } catch (RuntimeException e2) {
            this.f5007b.handleException(e2);
        }
    }

    /* renamed from: b */
    protected abstract void mo5158b(long j);
}
