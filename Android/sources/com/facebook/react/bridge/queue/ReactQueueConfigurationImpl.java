package com.facebook.react.bridge.queue;

import android.os.Looper;
import com.facebook.react.common.C1104f;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ReactQueueConfigurationImpl implements ReactQueueConfiguration {
    private final MessageQueueThreadImpl mJSQueueThread;
    private final MessageQueueThreadImpl mNativeModulesQueueThread;
    private final MessageQueueThreadImpl mUIQueueThread;

    private ReactQueueConfigurationImpl(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3) {
        this.mUIQueueThread = messageQueueThreadImpl;
        this.mNativeModulesQueueThread = messageQueueThreadImpl2;
        this.mJSQueueThread = messageQueueThreadImpl3;
    }

    public static ReactQueueConfigurationImpl create(ReactQueueConfigurationSpec reactQueueConfigurationSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        HashMap m5182b = C1104f.m5182b();
        MessageQueueThreadSpec mainThreadSpec = MessageQueueThreadSpec.mainThreadSpec();
        MessageQueueThreadImpl create = MessageQueueThreadImpl.create(mainThreadSpec, queueThreadExceptionHandler);
        m5182b.put(mainThreadSpec, create);
        MessageQueueThreadImpl messageQueueThreadImpl = (MessageQueueThreadImpl) m5182b.get(reactQueueConfigurationSpec.getJSQueueThreadSpec());
        if (messageQueueThreadImpl == null) {
            messageQueueThreadImpl = MessageQueueThreadImpl.create(reactQueueConfigurationSpec.getJSQueueThreadSpec(), queueThreadExceptionHandler);
        }
        MessageQueueThreadImpl messageQueueThreadImpl2 = (MessageQueueThreadImpl) m5182b.get(reactQueueConfigurationSpec.getNativeModulesQueueThreadSpec());
        if (messageQueueThreadImpl2 == null) {
            messageQueueThreadImpl2 = MessageQueueThreadImpl.create(reactQueueConfigurationSpec.getNativeModulesQueueThreadSpec(), queueThreadExceptionHandler);
        }
        return new ReactQueueConfigurationImpl(create, messageQueueThreadImpl2, messageQueueThreadImpl);
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public void destroy() {
        if (this.mNativeModulesQueueThread.getLooper() != Looper.getMainLooper()) {
            this.mNativeModulesQueueThread.quitSynchronous();
        }
        if (this.mJSQueueThread.getLooper() != Looper.getMainLooper()) {
            this.mJSQueueThread.quitSynchronous();
        }
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getJSQueueThread() {
        return this.mJSQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getNativeModulesQueueThread() {
        return this.mNativeModulesQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getUIQueueThread() {
        return this.mUIQueueThread;
    }
}
