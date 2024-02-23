package okhttp3.internal.connection;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p007ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
/* loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final ConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    public int successCount;
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    public long idleAtNanos = Long.MAX_VALUE;

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.connectionPool = connectionPool;
        this.route = route;
    }

    public static RealConnection testConnection(ConnectionPool connectionPool, Route route, Socket socket, long idleAtNanos) {
        RealConnection result = new RealConnection(connectionPool, route);
        result.socket = socket;
        result.idleAtNanos = idleAtNanos;
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:15:0x0072, B:17:0x007a, B:19:0x0081, B:18:0x007e), top: B:43:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:15:0x0072, B:17:0x007a, B:19:0x0081, B:18:0x007e), top: B:43:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void connect(int r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            okhttp3.Protocol r0 = r8.protocol
            if (r0 != 0) goto Lca
            r0 = 0
            okhttp3.Route r1 = r8.route
            okhttp3.Address r1 = r1.address()
            java.util.List r1 = r1.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r2 = new okhttp3.internal.connection.ConnectionSpecSelector
            r2.<init>(r1)
            okhttp3.Route r3 = r8.route
            okhttp3.Address r3 = r3.address()
            javax.net.ssl.SSLSocketFactory r3 = r3.sslSocketFactory()
            if (r3 != 0) goto L72
            okhttp3.ConnectionSpec r3 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L65
            okhttp3.Route r3 = r8.route
            okhttp3.Address r3 = r3.address()
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r3.host()
            okhttp3.internal.platform.Platform r4 = okhttp3.internal.platform.Platform.get()
            boolean r4 = r4.isCleartextTrafficPermitted(r3)
            if (r4 == 0) goto L41
            goto L72
        L41:
            okhttp3.internal.connection.RouteException r4 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r5 = new java.net.UnknownServiceException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "CLEARTEXT communication to "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = " not permitted by network security policy"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            r4.<init>(r5)
            throw r4
        L65:
            okhttp3.internal.connection.RouteException r3 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r4 = new java.net.UnknownServiceException
            java.lang.String r5 = "CLEARTEXT communication not enabled for client"
            r4.<init>(r5)
            r3.<init>(r4)
            throw r3
        L72:
            okhttp3.Route r3 = r8.route     // Catch: java.io.IOException -> L9a
            boolean r3 = r3.requiresTunnel()     // Catch: java.io.IOException -> L9a
            if (r3 == 0) goto L7e
            r8.connectTunnel(r9, r10, r11)     // Catch: java.io.IOException -> L9a
            goto L81
        L7e:
            r8.connectSocket(r9, r10)     // Catch: java.io.IOException -> L9a
        L81:
            r8.establishProtocol(r2)     // Catch: java.io.IOException -> L9a
            okhttp3.internal.http2.Http2Connection r3 = r8.http2Connection
            if (r3 == 0) goto L99
            okhttp3.ConnectionPool r3 = r8.connectionPool
            monitor-enter(r3)
            okhttp3.internal.http2.Http2Connection r4 = r8.http2Connection     // Catch: java.lang.Throwable -> L96
            int r4 = r4.maxConcurrentStreams()     // Catch: java.lang.Throwable -> L96
            r8.allocationLimit = r4     // Catch: java.lang.Throwable -> L96
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L96
            goto L99
        L96:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L96
            throw r4
        L99:
            return
        L9a:
            r3 = move-exception
            java.net.Socket r4 = r8.socket
            okhttp3.internal.Util.closeQuietly(r4)
            java.net.Socket r4 = r8.rawSocket
            okhttp3.internal.Util.closeQuietly(r4)
            r4 = 0
            r8.socket = r4
            r8.rawSocket = r4
            r8.source = r4
            r8.sink = r4
            r8.handshake = r4
            r8.protocol = r4
            r8.http2Connection = r4
            if (r0 != 0) goto Lbd
            okhttp3.internal.connection.RouteException r4 = new okhttp3.internal.connection.RouteException
            r4.<init>(r3)
            r0 = r4
            goto Lc0
        Lbd:
            r0.addConnectException(r3)
        Lc0:
            if (r12 == 0) goto Lc9
            boolean r4 = r2.connectionFailed(r3)
            if (r4 == 0) goto Lc9
            goto L72
        Lc9:
            throw r0
        Lca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, boolean):void");
    }

    private void connectTunnel(int connectTimeout, int readTimeout, int writeTimeout) throws IOException {
        Request tunnelRequest = createTunnelRequest();
        HttpUrl url = tunnelRequest.url();
        int attemptedConnections = 0;
        while (true) {
            attemptedConnections++;
            if (attemptedConnections > 21) {
                throw new ProtocolException("Too many tunnel connections attempted: 21");
            }
            connectSocket(connectTimeout, readTimeout);
            tunnelRequest = createTunnel(readTimeout, writeTimeout, tunnelRequest, url);
            if (tunnelRequest != null) {
                Util.closeQuietly(this.rawSocket);
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
            } else {
                return;
            }
        }
    }

    private void connectSocket(int connectTimeout, int readTimeout) throws IOException {
        Socket createSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            createSocket = address.socketFactory().createSocket();
        } else {
            createSocket = new Socket(proxy);
        }
        this.rawSocket = createSocket;
        createSocket.setSoTimeout(readTimeout);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), connectTimeout);
            try {
                this.source = Okio.buffer(Okio.source(this.rawSocket));
                this.sink = Okio.buffer(Okio.sink(this.rawSocket));
            } catch (NullPointerException npe) {
                if (NPE_THROW_WITH_NULL.equals(npe.getMessage())) {
                    throw new IOException(npe);
                }
            }
        } catch (ConnectException e) {
            ConnectException ce = new ConnectException("Failed to connect to " + this.route.socketAddress());
            ce.initCause(e);
            throw ce;
        }
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            this.protocol = Protocol.HTTP_1_1;
            this.socket = this.rawSocket;
            return;
        }
        connectTls(connectionSpecSelector);
        if (this.protocol == Protocol.HTTP_2) {
            this.socket.setSoTimeout(0);
            Http2Connection build = new Http2Connection.Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).build();
            this.http2Connection = build;
            build.start();
        }
    }

    private void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        String maybeProtocol;
        Protocol protocol;
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        boolean success = false;
        SSLSocket sslSocket = null;
        try {
            try {
                sslSocket = (SSLSocket) sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
                ConnectionSpec connectionSpec = connectionSpecSelector.configureSecureSocket(sslSocket);
                if (connectionSpec.supportsTlsExtensions()) {
                    Platform.get().configureTlsExtensions(sslSocket, address.url().host(), address.protocols());
                }
                sslSocket.startHandshake();
                Handshake unverifiedHandshake = Handshake.get(sslSocket.getSession());
                if (!address.hostnameVerifier().verify(address.url().host(), sslSocket.getSession())) {
                    X509Certificate cert = (X509Certificate) unverifiedHandshake.peerCertificates().get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified:\n    certificate: " + CertificatePinner.pin(cert) + "\n    DN: " + cert.getSubjectDN().getName() + "\n    subjectAltNames: " + OkHostnameVerifier.allSubjectAltNames(cert));
                }
                address.certificatePinner().check(address.url().host(), unverifiedHandshake.peerCertificates());
                if (connectionSpec.supportsTlsExtensions()) {
                    maybeProtocol = Platform.get().getSelectedProtocol(sslSocket);
                } else {
                    maybeProtocol = null;
                }
                this.socket = sslSocket;
                this.source = Okio.buffer(Okio.source(sslSocket));
                this.sink = Okio.buffer(Okio.sink(this.socket));
                this.handshake = unverifiedHandshake;
                if (maybeProtocol != null) {
                    protocol = Protocol.get(maybeProtocol);
                } else {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                success = true;
            } catch (AssertionError e) {
                if (!Util.isAndroidGetsocknameError(e)) {
                    throw e;
                }
                throw new IOException(e);
            }
        } finally {
            if (sslSocket != null) {
                Platform.get().afterHandshake(sslSocket);
            }
            if (!success) {
                Util.closeQuietly((Socket) sslSocket);
            }
        }
    }

    private Request createTunnel(int readTimeout, int writeTimeout, Request tunnelRequest, HttpUrl url) throws IOException {
        Response response;
        String requestLine = "CONNECT " + Util.hostHeader(url, true) + " HTTP/1.1";
        do {
            Http1Codec tunnelConnection = new Http1Codec(null, null, this.source, this.sink);
            this.source.timeout().timeout(readTimeout, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout(writeTimeout, TimeUnit.MILLISECONDS);
            tunnelConnection.writeRequest(tunnelRequest.headers(), requestLine);
            tunnelConnection.finishRequest();
            response = tunnelConnection.readResponseHeaders(false).request(tunnelRequest).build();
            long contentLength = HttpHeaders.contentLength(response);
            if (contentLength == -1) {
                contentLength = 0;
            }
            Source body = tunnelConnection.newFixedLengthSource(contentLength);
            Util.skipAll(body, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            body.close();
            switch (response.code()) {
                case ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                    if (this.source.buffer().exhausted() && this.sink.buffer().exhausted()) {
                        return null;
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                case 407:
                    tunnelRequest = this.route.address().proxyAuthenticator().authenticate(this.route, response);
                    if (tunnelRequest != null) {
                        break;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                default:
                    throw new IOException("Unexpected response code for CONNECT: " + response.code());
            }
        } while (!"close".equalsIgnoreCase(response.header("Connection")));
        return tunnelRequest;
    }

    private Request createTunnelRequest() {
        return new Request.Builder().url(this.route.address().url()).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
    }

    public boolean isEligible(Address address, @Nullable Route route) {
        if (this.allocations.size() >= this.allocationLimit || this.noNewStreams || !Internal.instance.equalsNonHost(this.route.address(), address)) {
            return false;
        }
        if (address.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.http2Connection != null && route != null && route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && this.route.socketAddress().equals(route.socketAddress()) && route.address().hostnameVerifier() == OkHostnameVerifier.INSTANCE && supportsUrl(address.url())) {
            try {
                address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
                return true;
            } catch (SSLPeerUnverifiedException e) {
                return false;
            }
        }
        return false;
    }

    public boolean supportsUrl(HttpUrl url) {
        if (url.port() != this.route.address().url().port()) {
            return false;
        }
        if (url.host().equals(this.route.address().url().host())) {
            return true;
        }
        return this.handshake != null && OkHostnameVerifier.INSTANCE.verify(url.host(), (X509Certificate) this.handshake.peerCertificates().get(0));
    }

    public HttpCodec newCodec(OkHttpClient client, StreamAllocation streamAllocation) throws SocketException {
        if (this.http2Connection != null) {
            return new Http2Codec(client, streamAllocation, this.http2Connection);
        }
        this.socket.setSoTimeout(client.readTimeoutMillis());
        this.source.timeout().timeout(client.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.sink.timeout().timeout(client.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1Codec(client, streamAllocation, this.source, this.sink);
    }

    public RealWebSocket.Streams newWebSocketStreams(final StreamAllocation streamAllocation) {
        return new RealWebSocket.Streams(true, this.source, this.sink) { // from class: okhttp3.internal.connection.RealConnection.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                StreamAllocation streamAllocation2 = streamAllocation;
                streamAllocation2.streamFinished(true, streamAllocation2.codec());
            }
        };
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    public void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        return this.socket;
    }

    public boolean isHealthy(boolean doExtensiveChecks) {
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return !http2Connection.isShutdown();
        }
        if (doExtensiveChecks) {
            try {
                int readTimeout = this.socket.getSoTimeout();
                try {
                    this.socket.setSoTimeout(1);
                    return !this.source.exhausted();
                } finally {
                    this.socket.setSoTimeout(readTimeout);
                }
            } catch (SocketTimeoutException e) {
            } catch (IOException e2) {
                return false;
            }
        }
        return true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream stream) throws IOException {
        stream.close(ErrorCode.REFUSED_STREAM);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(Http2Connection connection) {
        synchronized (this.connectionPool) {
            this.allocationLimit = connection.maxConcurrentStreams();
        }
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public boolean isMultiplexed() {
        return this.http2Connection != null;
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        return this.protocol;
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append("Connection{").append(this.route.address().url().host()).append(":").append(this.route.address().url().port()).append(", proxy=").append(this.route.proxy()).append(" hostAddress=").append(this.route.socketAddress()).append(" cipherSuite=");
        Handshake handshake = this.handshake;
        return append.append(handshake != null ? handshake.cipherSuite() : "none").append(" protocol=").append(this.protocol).append('}').toString();
    }
}
