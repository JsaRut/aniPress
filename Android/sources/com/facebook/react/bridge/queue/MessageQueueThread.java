package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public interface MessageQueueThread {
    @InterfaceC2039a
    void assertIsOnThread();

    @InterfaceC2039a
    void assertIsOnThread(String str);

    @InterfaceC2039a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @InterfaceC2039a
    MessageQueueThreadPerfStats getPerfStats();

    @InterfaceC2039a
    boolean isOnThread();

    @InterfaceC2039a
    void quitSynchronous();

    @InterfaceC2039a
    void resetPerfStats();

    @InterfaceC2039a
    void runOnQueue(Runnable runnable);
}
