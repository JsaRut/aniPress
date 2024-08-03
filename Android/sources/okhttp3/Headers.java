package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;

/* loaded from: classes.dex */
public final class Headers {
    private final String[] namesAndValues;

    /* loaded from: classes.dex */
    public static final class Builder {
        final List<String> namesAndValues = new ArrayList(20);

        public Builder add(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return add(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: " + str);
        }

        public Builder add(String str, String str2) {
            Headers.checkName(str);
            Headers.checkValue(str2, str);
            return addLenient(str, str2);
        }

        public Builder add(String str, Date date) {
            if (date != null) {
                add(str, HttpDate.format(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public Builder addAll(Headers headers) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient(headers.name(i), headers.value(i));
            }
            return this;
        }

        public Builder addLenient(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? addLenient(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? addLenient("", str.substring(1)) : addLenient("", str);
        }

        public Builder addLenient(String str, String str2) {
            this.namesAndValues.add(str);
            this.namesAndValues.add(str2.trim());
            return this;
        }

        public Builder addUnsafeNonAscii(String str, String str2) {
            Headers.checkName(str);
            return addLenient(str, str2);
        }

        public Headers build() {
            return new Headers(this);
        }

        public String get(String str) {
            for (int size = this.namesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
            }
            return null;
        }

        public Builder removeAll(String str) {
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i))) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public Builder set(String str, String str2) {
            Headers.checkName(str);
            Headers.checkValue(str2, str);
            removeAll(str);
            addLenient(str, str2);
            return this;
        }

        public Builder set(String str, Date date) {
            if (date != null) {
                set(str, HttpDate.format(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }
    }

    Headers(Builder builder) {
        List<String> list = builder.namesAndValues;
        this.namesAndValues = (String[]) list.toArray(new String[list.size()]);
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static void checkName(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static void checkValue(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
            }
        }
    }

    private static String get(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: of */
    public static Headers m11767of(Map<String, String> map) {
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String trim = entry.getKey().trim();
            String trim2 = entry.getValue().trim();
            checkName(trim);
            checkValue(trim2, trim);
            strArr[i] = trim;
            strArr[i + 1] = trim2;
            i += 2;
        }
        return new Headers(strArr);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: of */
    public static Headers m11768of(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = strArr2[i].trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            checkName(str);
            checkValue(str2, str);
        }
        return new Headers(strArr2);
    }

    public long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(((Headers) obj).namesAndValues, this.namesAndValues);
    }

    public String get(String str) {
        return get(this.namesAndValues, str);
    }

    public Date getDate(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return HttpDate.parse(str2);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        Collections.addAll(builder.namesAndValues, this.namesAndValues);
        return builder;
    }

    public int size() {
        return this.namesAndValues.length / 2;
    }

    public Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = name(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(name(i));
            sb.append(": ");
            sb.append(value(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }
}
