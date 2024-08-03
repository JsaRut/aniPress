package p139d.p143b.p208m.p221i;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d.b.m.i.a */
/* loaded from: classes.dex */
public class C2113a {

    /* renamed from: a */
    private static final Pattern f7592a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    /* renamed from: a */
    private static String m8452a(ReadableMap readableMap) {
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String) {
            return "";
        }
        Matcher matcher = f7592a.matcher(readableMap.getString("file"));
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }

    /* renamed from: a */
    public static String m8453a(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(map.getString("methodName"));
            sb.append("@");
            sb.append(m8452a(map));
            sb.append((map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) ? map.getInt("lineNumber") : -1);
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb.append(":");
                sb.append(map.getInt("column"));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
