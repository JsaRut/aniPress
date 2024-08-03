package p031c.p101b.p102a.p116n.p117a;

import android.text.TextUtils;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.n.a.d */
/* loaded from: classes.dex */
public class C0947d {

    /* renamed from: a */
    private HashMap<String, Method> f3987a;

    /* renamed from: b */
    private String f3988b;

    /* renamed from: c */
    private String f3989c;

    public C0947d(String str, Class cls) {
        String m4760a;
        try {
            if (TextUtils.isEmpty(str)) {
                throw new Exception("injected name can not be null");
            }
            this.f3988b = str;
            this.f3987a = new HashMap<>();
            Method[] declaredMethods = cls.getDeclaredMethods();
            StringBuilder sb = new StringBuilder("javascript:(function(b){console.log(\"");
            sb.append(this.f3988b);
            sb.append(" initialization begin\");var a={queue:[],callback:function(){var d=Array.prototype.slice.call(arguments,0);var c=d.shift();var e=d.shift();this.queue[c].apply(this,d);if(!e){delete this.queue[c]}}};");
            for (Method method : declaredMethods) {
                if (method.getModifiers() == 9 && (m4760a = m4760a(method)) != null) {
                    this.f3987a.put(m4760a, method);
                    sb.append(String.format(Locale.ENGLISH, "a.%s=", method.getName()));
                }
            }
            sb.append("function(){var f=Array.prototype.slice.call(arguments,0);if(f.length<1){throw\"");
            sb.append(this.f3988b);
            sb.append(" call error, message:miss method name\"}var e=[];for(var h=1;h<f.length;h++){var c=f[h];var j=typeof c;e[e.length]=j;if(j==\"function\"){var d=a.queue.length;a.queue[d]=c;f[h]=d}}var g=JSON.parse(prompt(JSON.stringify({method:f.shift(),types:e,args:f})));if(g.code!=200){throw\"");
            sb.append(this.f3988b);
            sb.append(" call error, code:\"+g.code+\", message:\"+g.result}return g.result};Object.getOwnPropertyNames(a).forEach(function(d){var c=a[d];if(typeof c===\"function\"&&d!==\"callback\"){a[d]=function(){return c.apply(a,[d].concat(Array.prototype.slice.call(arguments,0)))}}});b.");
            sb.append(this.f3988b);
            sb.append("=a;console.log(\"");
            sb.append(this.f3988b);
            sb.append(" initialization end\")})(window);");
            this.f3989c = sb.toString();
            C0923b.m4642a("JsCallJava", "----------" + sb.toString());
        } catch (Exception e2) {
            C0923b.m4646c("JsCallJava", "init js error:" + e2.getMessage());
        }
    }

    /* renamed from: a */
    private String m4759a(String str, int i, Object obj) {
        String valueOf;
        if (obj == null) {
            valueOf = "null";
        } else if (obj instanceof String) {
            valueOf = "\"" + ((Object) ((String) obj).replace("\"", "\\\"")) + "\"";
        } else {
            valueOf = ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof JSONObject)) ? String.valueOf(obj) : "";
        }
        String format = String.format(Locale.ENGLISH, "{\"code\": %d, \"result\": %s}", Integer.valueOf(i), valueOf);
        C0923b.m4642a("JsCallJava", this.f3988b + " call json: " + str + " result:" + format);
        return format;
    }

    /* renamed from: a */
    private String m4760a(Method method) {
        StringBuilder sb;
        String str;
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        if (length < 1 || parameterTypes[0] != WebView.class) {
            C0923b.m4653i("JsCallJava", "method(" + name + ") must use webview to be first parameter, will be pass");
            return null;
        }
        for (int i = 1; i < length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls == String.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_S";
            } else if (cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_N";
            } else if (cls == Boolean.TYPE) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_B";
            } else if (cls == JSONObject.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_O";
            } else {
                sb = new StringBuilder();
                sb.append(name);
                str = "_P";
            }
            sb.append(str);
            name = sb.toString();
        }
        return name;
    }

    /* renamed from: a */
    public String m4761a() {
        return this.f3989c;
    }

    /* renamed from: a */
    public String m4762a(WebView webView, String str) {
        StringBuilder sb;
        String message;
        String sb2;
        if (TextUtils.isEmpty(str)) {
            sb2 = "call data empty";
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("method");
                JSONArray jSONArray = jSONObject.getJSONArray("types");
                JSONArray jSONArray2 = jSONObject.getJSONArray("args");
                int length = jSONArray.length();
                Object[] objArr = new Object[length + 1];
                int i = 0;
                objArr[0] = webView;
                int i2 = 0;
                while (true) {
                    Object obj = null;
                    if (i >= length) {
                        break;
                    }
                    String optString = jSONArray.optString(i);
                    if ("string".equals(optString)) {
                        string = string + "_S";
                        int i3 = i + 1;
                        if (!jSONArray2.isNull(i)) {
                            obj = jSONArray2.getString(i);
                        }
                        objArr[i3] = obj;
                    } else if ("number".equals(optString)) {
                        string = string + "_N";
                        i2 = (i2 * 10) + i + 1;
                    } else if ("boolean".equals(optString)) {
                        string = string + "_B";
                        objArr[i + 1] = Boolean.valueOf(jSONArray2.getBoolean(i));
                    } else if ("object".equals(optString)) {
                        string = string + "_O";
                        int i4 = i + 1;
                        if (!jSONArray2.isNull(i)) {
                            obj = jSONArray2.getJSONObject(i);
                        }
                        objArr[i4] = obj;
                    } else {
                        string = string + "_P";
                    }
                    i++;
                }
                Method method = this.f3987a.get(string);
                if (method == null) {
                    return m4759a(str, 500, "not found method(" + string + ") with valid parameters");
                }
                if (i2 > 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    while (i2 > 0) {
                        int i5 = i2 - ((i2 / 10) * 10);
                        Class<?> cls = parameterTypes[i5];
                        if (cls == Integer.TYPE) {
                            objArr[i5] = Integer.valueOf(jSONArray2.getInt(i5 - 1));
                        } else if (cls == Long.TYPE) {
                            objArr[i5] = Long.valueOf(Long.parseLong(jSONArray2.getString(i5 - 1)));
                        } else {
                            objArr[i5] = Double.valueOf(jSONArray2.getDouble(i5 - 1));
                        }
                        i2 /= 10;
                    }
                }
                return m4759a(str, 200, method.invoke(null, objArr));
            } catch (Exception e2) {
                if (e2.getCause() != null) {
                    sb = new StringBuilder();
                    sb.append("method execute error:");
                    message = e2.getCause().getMessage();
                } else {
                    sb = new StringBuilder();
                    sb.append("method execute error:");
                    message = e2.getMessage();
                }
                sb.append(message);
                sb2 = sb.toString();
            }
        }
        return m4759a(str, 500, sb2);
    }
}
