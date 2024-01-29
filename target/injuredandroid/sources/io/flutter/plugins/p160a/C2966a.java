package io.flutter.plugins.p160a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p108c.p109a.p110c.p111a.C1515h;
import p108c.p109a.p110c.p111a.C1516i;
/* renamed from: io.flutter.plugins.a.a */
/* loaded from: classes.dex */
class C2966a implements C1516i.InterfaceC1520c {

    /* renamed from: a */
    private final SharedPreferences f7411a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.a.a$a */
    /* loaded from: classes.dex */
    public class AsyncTaskC2967a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences.Editor f7412a;

        /* renamed from: b */
        final /* synthetic */ C1516i.InterfaceC1521d f7413b;

        AsyncTaskC2967a(C2966a c2966a, SharedPreferences.Editor editor, C1516i.InterfaceC1521d interfaceC1521d) {
            this.f7412a = editor;
            this.f7413b = interfaceC1521d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(this.f7412a.commit());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            this.f7413b.mo419c(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2966a(Context context) {
        this.f7411a = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    /* renamed from: a */
    private void m161a(SharedPreferences.Editor editor, C1516i.InterfaceC1521d interfaceC1521d) {
        new AsyncTaskC2967a(this, editor, interfaceC1521d).execute(new Void[0]);
    }

    /* renamed from: c */
    private List<String> m159c(String str) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (ClassNotFoundException e) {
            e = e;
        }
        try {
            List<String> list = (List) objectInputStream.readObject();
            objectInputStream.close();
            return list;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    private String m158d(List<String> list) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            objectOutputStream.close();
            return encodeToString;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: e */
    private Map<String, Object> m157e() {
        Object obj;
        Map<String, ?> all = this.f7411a.getAll();
        HashMap hashMap = new HashMap();
        for (String str : all.keySet()) {
            if (str.startsWith("flutter.")) {
                Object obj2 = all.get(str);
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj2 = m159c(str2.substring(40));
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str2.substring(44), 36);
                        obj2 = obj;
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str2.substring(40));
                    }
                    hashMap.put(str, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        SharedPreferences.Editor remove = this.f7411a.edit().remove(str);
                        obj = arrayList;
                        if (!remove.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + m158d(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                        obj2 = obj;
                    }
                    hashMap.put(str, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
    /* renamed from: b */
    public void mo160b(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        SharedPreferences.Editor putBoolean;
        String str = (String) c1515h.m4040a("key");
        try {
            String str2 = c1515h.f4547a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    putBoolean = this.f7411a.edit().putBoolean(str, ((Boolean) c1515h.m4040a("value")).booleanValue());
                    break;
                case 1:
                    String d = Double.toString(((Number) c1515h.m4040a("value")).doubleValue());
                    SharedPreferences.Editor edit = this.f7411a.edit();
                    putBoolean = edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d);
                    break;
                case 2:
                    Number number = (Number) c1515h.m4040a("value");
                    if (number instanceof BigInteger) {
                        SharedPreferences.Editor edit2 = this.f7411a.edit();
                        putBoolean = edit2.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36));
                        break;
                    } else {
                        putBoolean = this.f7411a.edit().putLong(str, number.longValue());
                        break;
                    }
                case 3:
                    String str3 = (String) c1515h.m4040a("value");
                    if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        putBoolean = this.f7411a.edit().putString(str, str3);
                        break;
                    }
                    interfaceC1521d.mo420b("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", null);
                    return;
                case 4:
                    SharedPreferences.Editor edit3 = this.f7411a.edit();
                    putBoolean = edit3.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + m158d((List) c1515h.m4040a("value")));
                    break;
                case 5:
                    interfaceC1521d.mo419c(Boolean.TRUE);
                    return;
                case 6:
                    interfaceC1521d.mo419c(m157e());
                    return;
                case 7:
                    putBoolean = this.f7411a.edit().remove(str);
                    break;
                case '\b':
                    Set<String> keySet = m157e().keySet();
                    SharedPreferences.Editor edit4 = this.f7411a.edit();
                    for (String str4 : keySet) {
                        edit4.remove(str4);
                    }
                    m161a(edit4, interfaceC1521d);
                    return;
                default:
                    interfaceC1521d.mo421a();
                    return;
            }
            m161a(putBoolean, interfaceC1521d);
        } catch (IOException e) {
            interfaceC1521d.mo420b("IOException encountered", c1515h.f4547a, e);
        }
    }
}
