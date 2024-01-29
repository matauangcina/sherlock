package com.google.crypto.tink;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class KmsClients {
    private static List<KmsClient> autoClients;
    private static final CopyOnWriteArrayList<KmsClient> clients = new CopyOnWriteArrayList<>();

    public static void add(KmsClient client) {
        clients.add(client);
    }

    public static KmsClient get(String keyUri) throws GeneralSecurityException {
        Iterator<KmsClient> it = clients.iterator();
        while (it.hasNext()) {
            KmsClient client = it.next();
            if (client.doesSupport(keyUri)) {
                return client;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + keyUri);
    }

    public static synchronized KmsClient getAutoLoaded(String keyUri) throws GeneralSecurityException {
        KmsClient client;
        synchronized (KmsClients.class) {
            if (autoClients == null) {
                autoClients = loadAutoKmsClients();
            }
            Iterator<KmsClient> it = autoClients.iterator();
            while (it.hasNext()) {
                client = it.next();
                if (client.doesSupport(keyUri)) {
                }
            }
            throw new GeneralSecurityException("No KMS client does support: " + keyUri);
        }
        return client;
    }

    static void reset() {
        clients.clear();
    }

    private static List<KmsClient> loadAutoKmsClients() {
        List<KmsClient> clients2 = new ArrayList<>();
        ServiceLoader<KmsClient> clientLoader = ServiceLoader.load(KmsClient.class);
        Iterator<KmsClient> it = clientLoader.iterator();
        while (it.hasNext()) {
            KmsClient element = it.next();
            clients2.add(element);
        }
        return Collections.unmodifiableList(clients2);
    }

    private KmsClients() {
    }
}
