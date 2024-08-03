package com.facebook.react.bridge;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class ContextBaseJavaModule extends BaseJavaModule {
    private final Context mContext;

    public ContextBaseJavaModule(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getContext() {
        return this.mContext;
    }
}
