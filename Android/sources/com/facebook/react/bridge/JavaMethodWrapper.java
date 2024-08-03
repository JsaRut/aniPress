package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.C1552c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p139d.p143b.p162e.p165b.C1747c;
import p139d.p143b.p162e.p166c.C1748a;
import p139d.p143b.p204k.p205a.C2038a;

/* loaded from: classes.dex */
public class JavaMethodWrapper implements NativeModule.NativeMethod {
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType;
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.1
        C10741() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.2
        C10762() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.3
        C10773() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.4
        C10784() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.5
        C10795() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    };
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.6
        C10806() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.7
        C10817() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.8
        C10828() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    };
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.9
        C10839() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.10
        C107510() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }
    };
    private static final boolean DEBUG = C1747c.m7161a().mo7160a(C1748a.f6323d);

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$1 */
    /* loaded from: classes.dex */
    public static class C10741 extends ArgumentExtractor<Boolean> {
        C10741() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$10 */
    /* loaded from: classes.dex */
    static class C107510 extends ArgumentExtractor<Promise> {
        C107510() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$2 */
    /* loaded from: classes.dex */
    static class C10762 extends ArgumentExtractor<Double> {
        C10762() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$3 */
    /* loaded from: classes.dex */
    static class C10773 extends ArgumentExtractor<Float> {
        C10773() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$4 */
    /* loaded from: classes.dex */
    static class C10784 extends ArgumentExtractor<Integer> {
        C10784() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$5 */
    /* loaded from: classes.dex */
    static class C10795 extends ArgumentExtractor<String> {
        C10795() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$6 */
    /* loaded from: classes.dex */
    static class C10806 extends ArgumentExtractor<ReadableArray> {
        C10806() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$7 */
    /* loaded from: classes.dex */
    static class C10817 extends ArgumentExtractor<Dynamic> {
        C10817() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$8 */
    /* loaded from: classes.dex */
    static class C10828 extends ArgumentExtractor<ReadableMap> {
        C10828() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    }

    /* renamed from: com.facebook.react.bridge.JavaMethodWrapper$9 */
    /* loaded from: classes.dex */
    static class C10839 extends ArgumentExtractor<Callback> {
        C10839() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ArgumentExtractor<T> {
        private ArgumentExtractor() {
        }

        /* synthetic */ ArgumentExtractor(C10741 c10741) {
            this();
        }

        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        String str;
        this.mType = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        this.mMethod.setAccessible(true);
        this.mParameterTypes = this.mMethod.getParameterTypes();
        Class[] clsArr = this.mParameterTypes;
        this.mParamLength = clsArr.length;
        if (z) {
            str = BaseJavaModule.METHOD_TYPE_SYNC;
        } else {
            int i = this.mParamLength;
            if (i <= 0 || clsArr[i - 1] != Promise.class) {
                return;
            } else {
                str = BaseJavaModule.METHOD_TYPE_PROMISE;
            }
        }
        this.mType = str;
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        int i = 0;
        while (i < clsArr.length) {
            Class cls = clsArr[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_PROMISE;
                C2038a.m8321a(i == clsArr.length - 1, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
            } else {
                if (cls != Dynamic.class) {
                    throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
                }
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
            }
            i += argumentExtractorArr[i].getJSArgumentsNeeded();
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        int i = 0;
        while (i < clsArr.length) {
            Class cls = clsArr[i];
            if (cls == Promise.class) {
                C2038a.m8321a(i == clsArr.length - 1, "Promise must be used as last parameter only");
            }
            sb.append(paramTypeToChar(cls));
            i++;
        }
        return sb.toString();
    }

    private int calculateJSArgumentsNeeded() {
        ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
        C2038a.m8318a(argumentExtractorArr);
        int i = 0;
        for (ArgumentExtractor argumentExtractor : argumentExtractorArr) {
            i += argumentExtractor.getJSArgumentsNeeded();
        }
        return i;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : (char) 0;
    }

    private String getAffectedRange(int i, int i2) {
        if (i2 <= 1) {
            return "" + i;
        }
        return "" + i + "-" + ((i + i2) - 1);
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private void processArguments() {
        if (this.mArgumentsProcessed) {
            return;
        }
        C1552c.a m6467a = C1552c.m6467a(0L, "processArguments");
        m6467a.mo6469a("method", this.mModuleWrapper.getName() + "." + this.mMethod.getName());
        m6467a.mo6470a();
        try {
            this.mArgumentsProcessed = true;
            this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
            this.mArguments = new Object[this.mParameterTypes.length];
            this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            C1552c.m6466a(0L).mo6470a();
        }
    }

    private static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        String str = this.mSignature;
        C2038a.m8318a(str);
        return str;
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public String getType() {
        return this.mType;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        C1552c.a m6467a = C1552c.m6467a(0L, "callJavaModuleMethod");
        m6467a.mo6469a("method", str);
        m6467a.mo6470a();
        if (DEBUG) {
            C1747c.m7161a().mo7159a(C1748a.f6323d, "JS->Java: %s.%s()", this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                throw new Error("processArguments failed");
            }
            if (this.mJSArgumentsNeeded != readableArray.size()) {
                throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
            }
            int i = 0;
            for (int i2 = 0; i2 < this.mArgumentExtractors.length; i2++) {
                try {
                    this.mArguments[i2] = this.mArgumentExtractors[i2].extractArgument(jSInstance, readableArray, i);
                    i += this.mArgumentExtractors[i2].getJSArgumentsNeeded();
                } catch (UnexpectedNativeTypeException e2) {
                    throw new NativeArgumentsParseException(e2.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i, this.mArgumentExtractors[i2].getJSArgumentsNeeded()) + ")", e2);
                }
            }
            try {
                this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Could not invoke " + str, e3);
            } catch (IllegalArgumentException e4) {
                throw new RuntimeException("Could not invoke " + str, e4);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e5.getCause());
                }
                throw new RuntimeException("Could not invoke " + str, e5);
            }
        } finally {
            C1552c.m6466a(0L).mo6470a();
        }
    }
}
