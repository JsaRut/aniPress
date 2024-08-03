package p139d.p143b.p148c.p152d;

import java.util.Arrays;

/* renamed from: d.b.c.d.i */
/* loaded from: classes.dex */
public final class C1690i {

    /* renamed from: d.b.c.d.i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f6211a;

        /* renamed from: b */
        private C2799a f6212b;

        /* renamed from: c */
        private C2799a f6213c;

        /* renamed from: d */
        private boolean f6214d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d.b.c.d.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C2799a {

            /* renamed from: a */
            String f6215a;

            /* renamed from: b */
            Object f6216b;

            /* renamed from: c */
            C2799a f6217c;

            private C2799a() {
            }
        }

        private a(String str) {
            this.f6212b = new C2799a();
            this.f6213c = this.f6212b;
            this.f6214d = false;
            C1691j.m6971a(str);
            this.f6211a = str;
        }

        /* renamed from: a */
        private C2799a m6964a() {
            C2799a c2799a = new C2799a();
            this.f6213c.f6217c = c2799a;
            this.f6213c = c2799a;
            return c2799a;
        }

        /* renamed from: b */
        private a m6965b(String str, Object obj) {
            C2799a m6964a = m6964a();
            m6964a.f6216b = obj;
            C1691j.m6971a(str);
            m6964a.f6215a = str;
            return this;
        }

        /* renamed from: a */
        public a m6966a(String str, int i) {
            m6965b(str, String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public a m6967a(String str, Object obj) {
            m6965b(str, obj);
            return this;
        }

        /* renamed from: a */
        public a m6968a(String str, boolean z) {
            m6965b(str, String.valueOf(z));
            return this;
        }

        public String toString() {
            boolean z = this.f6214d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f6211a);
            sb.append('{');
            String str = "";
            for (C2799a c2799a = this.f6212b.f6217c; c2799a != null; c2799a = c2799a.f6217c) {
                if (!z || c2799a.f6216b != null) {
                    sb.append(str);
                    String str2 = c2799a.f6215a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(c2799a.f6216b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m6960a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static a m6961a(Object obj) {
        return new a(m6962a(obj.getClass()));
    }

    /* renamed from: a */
    private static String m6962a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    /* renamed from: a */
    public static boolean m6963a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
