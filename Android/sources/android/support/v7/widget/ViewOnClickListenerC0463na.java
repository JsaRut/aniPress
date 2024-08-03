package android.support.v7.widget;

import android.R;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.AbstractC0302t;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0117f;

/* renamed from: android.support.v7.widget.na */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0463na extends AbstractC0302t implements View.OnClickListener {

    /* renamed from: l */
    private final SearchManager f2400l;

    /* renamed from: m */
    private final SearchView f2401m;

    /* renamed from: n */
    private final SearchableInfo f2402n;

    /* renamed from: o */
    private final Context f2403o;

    /* renamed from: p */
    private final WeakHashMap<String, Drawable.ConstantState> f2404p;

    /* renamed from: q */
    private final int f2405q;

    /* renamed from: r */
    private boolean f2406r;

    /* renamed from: s */
    private int f2407s;

    /* renamed from: t */
    private ColorStateList f2408t;

    /* renamed from: u */
    private int f2409u;

    /* renamed from: v */
    private int f2410v;

    /* renamed from: w */
    private int f2411w;

    /* renamed from: x */
    private int f2412x;

    /* renamed from: y */
    private int f2413y;

    /* renamed from: z */
    private int f2414z;

    /* renamed from: android.support.v7.widget.na$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f2415a;

        /* renamed from: b */
        public final TextView f2416b;

        /* renamed from: c */
        public final ImageView f2417c;

        /* renamed from: d */
        public final ImageView f2418d;

        /* renamed from: e */
        public final ImageView f2419e;

        public a(View view) {
            this.f2415a = (TextView) view.findViewById(R.id.text1);
            this.f2416b = (TextView) view.findViewById(R.id.text2);
            this.f2417c = (ImageView) view.findViewById(R.id.icon1);
            this.f2418d = (ImageView) view.findViewById(R.id.icon2);
            this.f2419e = (ImageView) view.findViewById(C0117f.edit_query);
        }
    }

    public ViewOnClickListenerC0463na(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f2406r = false;
        this.f2407s = 1;
        this.f2409u = -1;
        this.f2410v = -1;
        this.f2411w = -1;
        this.f2412x = -1;
        this.f2413y = -1;
        this.f2414z = -1;
        this.f2400l = (SearchManager) this.f1298d.getSystemService("search");
        this.f2401m = searchView;
        this.f2402n = searchableInfo;
        this.f2405q = searchView.getSuggestionCommitIconResId();
        this.f2403o = context;
        this.f2404p = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m2482a(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f1298d.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e2) {
            nameNotFoundException = e2.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", nameNotFoundException);
        return null;
    }

    /* renamed from: a */
    private Drawable m2483a(String str) {
        Drawable.ConstantState constantState = this.f2404p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private static String m2484a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static String m2485a(Cursor cursor, String str) {
        return m2484a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m2486a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m2487a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m2488a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2404p.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m2489b(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f2404p.containsKey(flattenToShortString)) {
            Drawable m2482a = m2482a(componentName);
            this.f2404p.put(flattenToShortString, m2482a != null ? m2482a.getConstantState() : null);
            return m2482a;
        }
        Drawable.ConstantState constantState = this.f2404p.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f2403o.getResources());
    }

    /* renamed from: b */
    private Drawable m2490b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m2498a(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f2403o.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    /* renamed from: b */
    private Drawable m2491b(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2403o.getPackageName() + "/" + parseInt;
            Drawable m2483a = m2483a(str2);
            if (m2483a != null) {
                return m2483a;
            }
            Drawable m92c = C0022a.m92c(this.f2403o, parseInt);
            m2488a(str2, m92c);
            return m92c;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m2483a2 = m2483a(str);
            if (m2483a2 != null) {
                return m2483a2;
            }
            Drawable m2490b = m2490b(Uri.parse(str));
            m2488a(str, m2490b);
            return m2490b;
        }
    }

    /* renamed from: b */
    private CharSequence m2492b(CharSequence charSequence) {
        if (this.f2408t == null) {
            TypedValue typedValue = new TypedValue();
            this.f1298d.getTheme().resolveAttribute(C0112a.textColorSearchUrl, typedValue, true);
            this.f2408t = this.f1298d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2408t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: c */
    private Drawable m2493c(Cursor cursor) {
        Drawable m2489b = m2489b(this.f2402n.getSearchActivity());
        return m2489b != null ? m2489b : this.f1298d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: d */
    private Drawable m2494d(Cursor cursor) {
        int i = this.f2412x;
        if (i == -1) {
            return null;
        }
        Drawable m2491b = m2491b(cursor.getString(i));
        return m2491b != null ? m2491b : m2493c(cursor);
    }

    /* renamed from: e */
    private Drawable m2495e(Cursor cursor) {
        int i = this.f2413y;
        if (i == -1) {
            return null;
        }
        return m2491b(cursor.getString(i));
    }

    /* renamed from: f */
    private void m2496f(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    Cursor m2497a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1298d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.support.v4.widget.C0291i.a
    /* renamed from: a */
    public Cursor mo1627a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2401m.getVisibility() == 0 && this.f2401m.getWindowVisibility() == 0) {
            try {
                Cursor m2497a = m2497a(this.f2402n, charSequence2, 50);
                if (m2497a != null) {
                    m2497a.getCount();
                    return m2497a;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    /* renamed from: a */
    Drawable m2498a(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1298d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: a */
    public void m2499a(int i) {
        this.f2407s = i;
    }

    @Override // android.support.v4.widget.AbstractC0290h, android.support.v4.widget.C0291i.a
    /* renamed from: a */
    public void mo1622a(Cursor cursor) {
        if (this.f2406r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1622a(cursor);
            if (cursor != null) {
                this.f2409u = cursor.getColumnIndex("suggest_text_1");
                this.f2410v = cursor.getColumnIndex("suggest_text_2");
                this.f2411w = cursor.getColumnIndex("suggest_text_2_url");
                this.f2412x = cursor.getColumnIndex("suggest_icon_1");
                this.f2413y = cursor.getColumnIndex("suggest_icon_2");
                this.f2414z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // android.support.v4.widget.AbstractC0290h
    /* renamed from: a */
    public void mo1623a(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i = this.f2414z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f2415a != null) {
            m2487a(aVar.f2415a, m2484a(cursor, this.f2409u));
        }
        if (aVar.f2416b != null) {
            String m2484a = m2484a(cursor, this.f2411w);
            CharSequence m2492b = m2484a != null ? m2492b((CharSequence) m2484a) : m2484a(cursor, this.f2410v);
            if (TextUtils.isEmpty(m2492b)) {
                TextView textView = aVar.f2415a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2415a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2415a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2415a.setMaxLines(1);
                }
            }
            m2487a(aVar.f2416b, m2492b);
        }
        ImageView imageView = aVar.f2417c;
        if (imageView != null) {
            m2486a(imageView, m2494d(cursor), 4);
        }
        ImageView imageView2 = aVar.f2418d;
        if (imageView2 != null) {
            m2486a(imageView2, m2495e(cursor), 8);
        }
        int i3 = this.f2407s;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            aVar.f2419e.setVisibility(8);
            return;
        }
        aVar.f2419e.setVisibility(0);
        aVar.f2419e.setTag(aVar.f2415a.getText());
        aVar.f2419e.setOnClickListener(this);
    }

    @Override // android.support.v4.widget.AbstractC0302t, android.support.v4.widget.AbstractC0290h
    /* renamed from: b */
    public View mo1625b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1625b = super.mo1625b(context, cursor, viewGroup);
        mo1625b.setTag(new a(mo1625b));
        ((ImageView) mo1625b.findViewById(C0117f.edit_query)).setImageResource(this.f2405q);
        return mo1625b;
    }

    @Override // android.support.v4.widget.AbstractC0290h, android.support.v4.widget.C0291i.a
    public CharSequence convertToString(Cursor cursor) {
        String m2485a;
        String m2485a2;
        if (cursor == null) {
            return null;
        }
        String m2485a3 = m2485a(cursor, "suggest_intent_query");
        if (m2485a3 != null) {
            return m2485a3;
        }
        if (this.f2402n.shouldRewriteQueryFromData() && (m2485a2 = m2485a(cursor, "suggest_intent_data")) != null) {
            return m2485a2;
        }
        if (!this.f2402n.shouldRewriteQueryFromText() || (m2485a = m2485a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m2485a;
    }

    @Override // android.support.v4.widget.AbstractC0290h, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View mo1620a = mo1620a(this.f1298d, this.f1297c, viewGroup);
            if (mo1620a != null) {
                ((a) mo1620a.getTag()).f2415a.setText(e2.toString());
            }
            return mo1620a;
        }
    }

    @Override // android.support.v4.widget.AbstractC0290h, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View mo1625b = mo1625b(this.f1298d, this.f1297c, viewGroup);
            if (mo1625b != null) {
                ((a) mo1625b.getTag()).f2415a.setText(e2.toString());
            }
            return mo1625b;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2496f(mo1619a());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2496f(mo1619a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2401m.m2330a((CharSequence) tag);
        }
    }
}
