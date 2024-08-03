package okhttp3.internal;

import java.net.URL;

/* loaded from: classes.dex */
public interface URLFilter {
    void checkURLPermitted(URL url);
}
