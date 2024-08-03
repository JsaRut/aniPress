package p139d.p143b.p184i.p191e;

/* renamed from: d.b.i.e.d */
/* loaded from: classes.dex */
public enum EnumC1880d {
    LOW,
    MEDIUM,
    HIGH;

    /* renamed from: a */
    public static EnumC1880d m7659a(EnumC1880d enumC1880d, EnumC1880d enumC1880d2) {
        return enumC1880d == null ? enumC1880d2 : (enumC1880d2 != null && enumC1880d.ordinal() <= enumC1880d2.ordinal()) ? enumC1880d2 : enumC1880d;
    }
}
