package com.facebook.react.bridge;

import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public interface JavaJSExecutor {

    /* loaded from: classes.dex */
    public interface Factory {
        JavaJSExecutor create();
    }

    /* loaded from: classes.dex */
    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @InterfaceC2039a
    String executeJSCall(String str, String str2);

    @InterfaceC2039a
    void loadApplicationScript(String str);

    @InterfaceC2039a
    void setGlobalVariable(String str, String str2);
}
