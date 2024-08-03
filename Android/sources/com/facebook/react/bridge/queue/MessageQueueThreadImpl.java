package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;
    private MessageQueueThreadPerfStats mPerfStats;

    /* renamed from: com.facebook.react.bridge.queue.MessageQueueThreadImpl$5 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10965 {

        /* renamed from: $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType */
        static final /* synthetic */ int[] f4359x16463f8b = new int[MessageQueueThreadSpec.ThreadType.values().length];

        static {
            try {
                f4359x16463f8b[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4359x16463f8b[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this(str, looper, queueThreadExceptionHandler, null);
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.mIsFinished = false;
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.mPerfStats = messageQueueThreadPerfStats;
        this.mAssertionErrorMessage = "Expected to be called from the '" + getName() + "' thread!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assignToPerfStats(MessageQueueThreadPerfStats messageQueueThreadPerfStats, long j, long j2) {
        messageQueueThreadPerfStats.wallTime = j;
        messageQueueThreadPerfStats.cpuTime = j2;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        int i = C10965.f4359x16463f8b[messageQueueThreadSpec.getThreadType().ordinal()];
        if (i == 1) {
            return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
        }
        if (i == 2) {
            return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
        }
        throw new RuntimeException("Unknown thread type: " + messageQueueThreadSpec.getThreadType());
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
        if (UiThreadUtil.isOnUiThread()) {
            Process.setThreadPriority(-4);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(-4);
                }
            });
        }
        return messageQueueThreadImpl;
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        new Thread(null, new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.4
            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-4);
                Looper.prepare();
                MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
                MessageQueueThreadImpl.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
                SimpleSettableFuture.this.m5189a((SimpleSettableFuture) new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
                Looper.loop();
            }
        }, "mqt_" + str, j).start();
        Pair pair = (Pair) simpleSettableFuture.m5187a();
        return new MessageQueueThreadImpl(str, (Looper) pair.first, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) pair.second);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public void assertIsOnThread(String str) {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage + " " + str);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    simpleSettableFuture.m5189a((SimpleSettableFuture) callable.call());
                } catch (Exception e2) {
                    simpleSettableFuture.m5188a(e2);
                }
            }
        });
        return simpleSettableFuture;
    }

    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.mPerfStats;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public boolean isOnThread() {
        return this.mLooper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public void quitSynchronous() {
        this.mIsFinished = true;
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.mName);
            }
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public void resetPerfStats() {
        assignToPerfStats(this.mPerfStats, -1L, -1L);
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.2
            @Override // java.lang.Runnable
            public void run() {
                MessageQueueThreadImpl.assignToPerfStats(MessageQueueThreadImpl.this.mPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
            }
        });
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC2039a
    public void runOnQueue(Runnable runnable) {
        if (this.mIsFinished) {
            C1700a.m7015d("ReactNative", "Tried to enqueue runnable on already finished thread: '" + getName() + "... dropping Runnable.");
        }
        this.mHandler.post(runnable);
    }
}
