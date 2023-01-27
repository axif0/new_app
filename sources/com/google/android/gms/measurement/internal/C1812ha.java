package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.ha */
final class C1812ha extends SSLSocket {

    /* renamed from: f */
    private final SSLSocket f5911f;

    C1812ha(C1836ja jaVar, SSLSocket sSLSocket) {
        this.f5911f = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f5911f.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f5911f.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f5911f.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f5911f.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f5911f.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.f5911f.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f5911f.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f5911f.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f5911f.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f5911f.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f5911f.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f5911f.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f5911f.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f5911f.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f5911f.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f5911f.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f5911f.getNeedClientAuth();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f5911f.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f5911f.getOutputStream();
    }

    public final int getPort() {
        return this.f5911f.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f5911f.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f5911f.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f5911f.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f5911f.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f5911f.getSession();
    }

    public final int getSoLinger() throws SocketException {
        return this.f5911f.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f5911f.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f5911f.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f5911f.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f5911f.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f5911f.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f5911f.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f5911f.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f5911f.isBound();
    }

    public final boolean isClosed() {
        return this.f5911f.isClosed();
    }

    public final boolean isConnected() {
        return this.f5911f.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f5911f.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f5911f.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f5911f.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) throws IOException {
        this.f5911f.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f5911f.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f5911f.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f5911f.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f5911f.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.f5911f.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f5911f.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.f5911f.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f5911f.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.f5911f.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.f5911f.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.f5911f.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f5911f.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.f5911f.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f5911f.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.f5911f.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f5911f.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f5911f.setWantClientAuth(z);
    }

    public final void shutdownInput() throws IOException {
        this.f5911f.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f5911f.shutdownOutput();
    }

    public final void startHandshake() throws IOException {
        this.f5911f.startHandshake();
    }

    public final String toString() {
        return this.f5911f.toString();
    }
}
