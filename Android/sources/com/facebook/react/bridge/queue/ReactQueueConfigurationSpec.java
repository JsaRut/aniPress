package com.facebook.react.bridge.queue;

import android.os.Build;
import p139d.p143b.p204k.p205a.C2038a;

/* loaded from: classes.dex */
public class ReactQueueConfigurationSpec {
    private static final long LEGACY_STACK_SIZE_BYTES = 2000000;
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    /* loaded from: classes.dex */
    public static class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            MessageQueueThreadSpec messageQueueThreadSpec = this.mNativeModulesQueueSpec;
            C2038a.m8318a(messageQueueThreadSpec);
            MessageQueueThreadSpec messageQueueThreadSpec2 = this.mJSQueueSpec;
            C2038a.m8318a(messageQueueThreadSpec2);
            return new ReactQueueConfigurationSpec(messageQueueThreadSpec, messageQueueThreadSpec2);
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            C2038a.m8321a(this.mJSQueueSpec == null, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            C2038a.m8321a(this.mNativeModulesQueueSpec == null, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    private ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(Build.VERSION.SDK_INT < 21 ? MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", LEGACY_STACK_SIZE_BYTES) : MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules")).build();
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }
}
