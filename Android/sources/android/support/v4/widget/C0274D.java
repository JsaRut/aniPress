package android.support.v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.support.v4.util.C0268n;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p018g.C0065b;

/* renamed from: android.support.v4.widget.D */
/* loaded from: classes.dex */
public final class C0274D {

    /* renamed from: android.support.v4.widget.D$a */
    /* loaded from: classes.dex */
    private static class a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f1164a;

        /* renamed from: b */
        private final TextView f1165b;

        /* renamed from: c */
        private Class f1166c;

        /* renamed from: d */
        private Method f1167d;

        /* renamed from: e */
        private boolean f1168e;

        /* renamed from: f */
        private boolean f1169f = false;

        a(ActionMode.Callback callback, TextView textView) {
            this.f1164a = callback;
            this.f1165b = textView;
        }

        /* renamed from: a */
        private Intent m1442a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: a */
        private Intent m1443a(ResolveInfo resolveInfo, TextView textView) {
            return m1442a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m1447a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private List<ResolveInfo> m1444a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m1442a(), 0)) {
                if (m1446a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m1445a(Menu menu) {
            Context context = this.f1165b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f1169f) {
                this.f1169f = true;
                try {
                    this.f1166c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1167d = this.f1166c.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f1168e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f1166c = null;
                    this.f1167d = null;
                    this.f1168e = false;
                }
            }
            try {
                Method declaredMethod = (this.f1168e && this.f1166c.isInstance(menu)) ? this.f1167d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m1444a = m1444a(context, packageManager);
                for (int i = 0; i < m1444a.size(); i++) {
                    ResolveInfo resolveInfo = m1444a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m1443a(resolveInfo, this.f1165b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: a */
        private boolean m1446a(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            String str = resolveInfo.activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: a */
        private boolean m1447a(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1164a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1164a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f1164a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m1445a(menu);
            return this.f1164a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    private static int m1431a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: a */
    public static int m1432a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: a */
    public static ActionMode.Callback m1433a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof a)) ? callback : new a(callback, textView);
    }

    /* renamed from: a */
    public static void m1434a(TextView textView, int i) {
        C0268n.m1383a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m1435a(TextView textView, C0065b.a aVar) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m1431a(aVar.m271c()));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            textView.getPaint().set(aVar.m272d());
            textView.setBreakStrategy(aVar.m269a());
            textView.setHyphenationFrequency(aVar.m270b());
        } else {
            float textScaleX = aVar.m272d().getTextScaleX();
            textView.getPaint().set(aVar.m272d());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static void m1436a(TextView textView, C0065b c0065b) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 28) {
            precomputedText = c0065b.m268b();
        } else {
            boolean equals = m1439c(textView).equals(c0065b.m267a());
            precomputedText = c0065b;
            if (!equals) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedText);
    }

    /* renamed from: b */
    public static int m1437b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: b */
    public static void m1438b(TextView textView, int i) {
        C0268n.m1383a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static C0065b.a m1439c(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0065b.a(textView.getTextMetricsParams());
        }
        C0065b.a.C2796a c2796a = new C0065b.a.C2796a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            c2796a.m273a(textView.getBreakStrategy());
            c2796a.m276b(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            c2796a.m274a(m1441d(textView));
        }
        return c2796a.m275a();
    }

    /* renamed from: c */
    public static void m1440c(TextView textView, int i) {
        C0268n.m1383a(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m1441d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }
}
