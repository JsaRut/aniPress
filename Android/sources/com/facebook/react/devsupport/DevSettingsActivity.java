package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import p139d.p143b.p208m.C2123n;
import p139d.p143b.p208m.C2125p;

/* loaded from: classes.dex */
public class DevSettingsActivity extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(C2123n.catalyst_settings_title));
        addPreferencesFromResource(C2125p.rn_dev_preferences);
    }
}
