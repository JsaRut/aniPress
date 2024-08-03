package p139d.p143b.p145b.p146a;

/* renamed from: d.b.b.a.a */
/* loaded from: classes.dex */
public interface InterfaceC1645a {

    /* renamed from: d.b.b.a.a$a */
    /* loaded from: classes.dex */
    public enum a {
        READ_DECODE,
        READ_FILE,
        READ_FILE_NOT_FOUND,
        READ_INVALID_ENTRY,
        WRITE_ENCODE,
        WRITE_CREATE_TEMPFILE,
        WRITE_UPDATE_FILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND,
        WRITE_RENAME_FILE_OTHER,
        WRITE_CREATE_DIR,
        WRITE_CALLBACK_ERROR,
        WRITE_INVALID_ENTRY,
        DELETE_FILE,
        EVICTION,
        GENERIC_IO,
        OTHER
    }

    /* renamed from: a */
    void mo6808a(a aVar, Class<?> cls, String str, Throwable th);
}
