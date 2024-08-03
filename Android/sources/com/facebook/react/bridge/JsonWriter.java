package com.facebook.react.bridge;

import java.io.Closeable;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public class JsonWriter implements Closeable {
    private final Deque<Scope> mScopes = new ArrayDeque();
    private final Writer mWriter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.bridge.JsonWriter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10871 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$JsonWriter$Scope = new int[Scope.values().length];

        static {
            try {
                $SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[Scope.EMPTY_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[Scope.EMPTY_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[Scope.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[Scope.OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum Scope {
        EMPTY_OBJECT,
        OBJECT,
        EMPTY_ARRAY,
        ARRAY
    }

    public JsonWriter(Writer writer) {
        this.mWriter = writer;
    }

    private void beforeName() {
        Scope peek = this.mScopes.peek();
        int i = C10871.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[peek.ordinal()];
        if (i != 1) {
            if (i == 2) {
                replace(Scope.OBJECT);
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    this.mWriter.write(44);
                    return;
                }
                throw new IllegalStateException("Unknown scope: " + peek);
            }
        }
        throw new IllegalStateException("name not allowed in array");
    }

    private void beforeValue() {
        Scope peek = this.mScopes.peek();
        int i = C10871.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[peek.ordinal()];
        if (i == 1) {
            replace(Scope.ARRAY);
            return;
        }
        if (i == 2) {
            throw new IllegalArgumentException(Scope.EMPTY_OBJECT.name());
        }
        if (i == 3) {
            this.mWriter.write(44);
        } else {
            if (i == 4) {
                return;
            }
            throw new IllegalStateException("Unknown scope: " + peek);
        }
    }

    private void close(char c2) {
        this.mScopes.pop();
        this.mWriter.write(c2);
    }

    private void open(Scope scope, char c2) {
        this.mScopes.push(scope);
        this.mWriter.write(c2);
    }

    private void replace(Scope scope) {
        this.mScopes.pop();
        this.mScopes.push(scope);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x002c. Please report as an issue. */
    private void string(String str) {
        Writer writer;
        String str2;
        Writer writer2;
        Object[] objArr;
        this.mWriter.write(34);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                writer = this.mWriter;
                str2 = "\\f";
            } else if (charAt != '\r') {
                if (charAt == '\"' || charAt == '\\') {
                    this.mWriter.write(92);
                } else {
                    if (charAt == 8232 || charAt == 8233) {
                        writer2 = this.mWriter;
                        objArr = new Object[]{Integer.valueOf(charAt)};
                    } else {
                        switch (charAt) {
                            case '\b':
                                writer = this.mWriter;
                                str2 = "\\b";
                                break;
                            case '\t':
                                writer = this.mWriter;
                                str2 = "\\t";
                                break;
                            case '\n':
                                writer = this.mWriter;
                                str2 = "\\n";
                                break;
                            default:
                                if (charAt <= 31) {
                                    writer2 = this.mWriter;
                                    objArr = new Object[]{Integer.valueOf(charAt)};
                                    break;
                                }
                                break;
                        }
                    }
                    writer2.write(String.format("\\u%04x", objArr));
                }
                this.mWriter.write(charAt);
            } else {
                writer = this.mWriter;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.mWriter.write(34);
    }

    public JsonWriter beginArray() {
        open(Scope.EMPTY_ARRAY, '[');
        return this;
    }

    public JsonWriter beginObject() {
        open(Scope.EMPTY_OBJECT, '{');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mWriter.close();
    }

    public JsonWriter endArray() {
        close(']');
        return this;
    }

    public JsonWriter endObject() {
        close('}');
        return this;
    }

    public JsonWriter name(String str) {
        if (str == null) {
            throw new NullPointerException("name can not be null");
        }
        beforeName();
        string(str);
        this.mWriter.write(58);
        return this;
    }

    public JsonWriter nullValue() {
        beforeValue();
        this.mWriter.write("null");
        return this;
    }

    public JsonWriter rawValue(String str) {
        beforeValue();
        this.mWriter.write(str);
        return this;
    }

    public JsonWriter value(double d2) {
        beforeValue();
        this.mWriter.append((CharSequence) Double.toString(d2));
        return this;
    }

    public JsonWriter value(long j) {
        beforeValue();
        this.mWriter.write(Long.toString(j));
        return this;
    }

    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        beforeValue();
        this.mWriter.append((CharSequence) number.toString());
        return this;
    }

    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z) {
        beforeValue();
        this.mWriter.write(z ? "true" : "false");
        return this;
    }
}
