package okhttp3;

import p275e.C2711F;

/* loaded from: classes.dex */
public interface Call extends Cloneable {

    /* loaded from: classes.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C2711F timeout();
}
