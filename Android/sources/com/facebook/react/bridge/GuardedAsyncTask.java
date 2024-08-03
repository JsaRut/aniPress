package com.facebook.react.bridge;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {
    private final ReactContext mReactContext;

    public GuardedAsyncTask(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Params... paramsArr) {
        try {
            doInBackgroundGuarded(paramsArr);
            return null;
        } catch (RuntimeException e2) {
            this.mReactContext.handleException(e2);
            return null;
        }
    }

    protected abstract void doInBackgroundGuarded(Params... paramsArr);
}
