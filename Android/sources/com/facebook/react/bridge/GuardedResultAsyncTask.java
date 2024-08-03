package com.facebook.react.bridge;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final ReactContext mReactContext;

    /* JADX INFO: Access modifiers changed from: protected */
    public GuardedResultAsyncTask(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e2) {
            this.mReactContext.handleException(e2);
            throw e2;
        }
    }

    protected abstract Result doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e2) {
            this.mReactContext.handleException(e2);
        }
    }

    protected abstract void onPostExecuteGuarded(Result result);
}
