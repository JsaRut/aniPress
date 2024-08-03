package p139d.p143b.p208m;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.C1104f;
import java.util.Map;

/* renamed from: d.b.m.t */
/* loaded from: classes.dex */
public class C2129t {

    /* renamed from: a */
    private static final Map<Integer, String> f7617a;

    /* renamed from: b */
    private int f7618b = -1;

    /* renamed from: c */
    private final C2056P f7619c;

    static {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a(23, "select");
        m5175a.m5184a(66, "select");
        m5175a.m5184a(62, "select");
        m5175a.m5184a(85, "playPause");
        m5175a.m5184a(89, "rewind");
        m5175a.m5184a(90, "fastForward");
        m5175a.m5184a(19, "up");
        m5175a.m5184a(22, "right");
        m5175a.m5184a(20, "down");
        m5175a.m5184a(21, "left");
        f7617a = m5175a.m5185a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2129t(C2056P c2056p) {
        this.f7619c = c2056p;
    }

    /* renamed from: a */
    private void m8496a(String str, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.f7619c.m8410a("onHWKeyEvent", writableNativeMap);
    }

    /* renamed from: a */
    public void m8497a() {
        int i = this.f7618b;
        if (i != -1) {
            m8496a("blur", i);
        }
        this.f7618b = -1;
    }

    /* renamed from: a */
    public void m8498a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 1 && f7617a.containsKey(Integer.valueOf(keyCode))) {
            m8496a(f7617a.get(Integer.valueOf(keyCode)), this.f7618b);
        }
    }

    /* renamed from: a */
    public void m8499a(View view) {
        if (this.f7618b == view.getId()) {
            return;
        }
        int i = this.f7618b;
        if (i != -1) {
            m8496a("blur", i);
        }
        this.f7618b = view.getId();
        m8496a("focus", view.getId());
    }
}
