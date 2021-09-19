/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 */
package com.discovery;

import java.io.Serializable;
import java.net.InetAddress;

public class ScanProfile
implements Serializable {
    public static final int CAMERA_AWAITING_LOCAL_UPDATE = 256;
    public static final int CAMERA_REACHABLE_IN_LOCAL_NW = 17;
    public static final int CAMERA_REACHABLE_IN_REMOTE_NW = 18;
    public static final int CAMERA_UNREACHABLE = 19;
    protected String MAC_addr;
    protected String basicAuth_pass;
    protected String basicAuth_usr;
    protected int camLocation;
    protected transient boolean hasUpdateLocalStatus;
    protected InetAddress inet_addr;
    protected int port;
    protected boolean voxEnabled;

    public ScanProfile(InetAddress inetAddress, int n, String string2) {
        this.inet_addr = inetAddress;
        this.port = n;
        this.MAC_addr = string2;
        this.camLocation = 256;
        this.hasUpdateLocalStatus = false;
    }

    public ScanProfile(InetAddress inetAddress, String string2) {
        this.inet_addr = inetAddress;
        this.port = 80;
        this.MAC_addr = string2;
        this.camLocation = 256;
        this.hasUpdateLocalStatus = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(ScanProfile scanProfile) {
        return scanProfile != null && scanProfile.get_MAC() != null && this.MAC_addr.equalsIgnoreCase(scanProfile.get_MAC());
    }

    public String getBasicAuth_pass() {
        return this.basicAuth_pass;
    }

    public String getBasicAuth_usr() {
        return this.basicAuth_usr;
    }

    public String get_MAC() {
        return this.MAC_addr;
    }

    public InetAddress get_inetAddress() {
        return this.inet_addr;
    }

    public int get_port() {
        return this.port;
    }

    public boolean hasUpdatedLocation() {
        return this.hasUpdateLocalStatus;
    }

    public boolean isInLocal() {
        return this.camLocation == 17;
    }

    public boolean isReachableInRemote() {
        return this.camLocation == 18;
    }

    public boolean isVoxEnabled() {
        return this.voxEnabled;
    }

    public void setBasicAuth_pass(String string2) {
        this.basicAuth_pass = string2;
    }

    public void setBasicAuth_usr(String string2) {
        this.basicAuth_usr = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setInLocal(boolean bl) {
        this.hasUpdateLocalStatus = true;
        if (bl) {
            this.camLocation = 17;
            return;
        } else {
            if (this.camLocation != 17) return;
            {
                this.camLocation = 18;
                return;
            }
        }
    }

    public void setInetAddr(InetAddress inetAddress) {
        this.inet_addr = inetAddress;
    }

    public void setPort(int n) {
        this.port = n;
    }

    public void setReachableInRemote(boolean bl) {
        if (bl) {
            this.camLocation = 18;
            return;
        }
        this.camLocation = 19;
    }

    public void setVoxEnabled(boolean bl) {
        this.voxEnabled = bl;
    }

    public void set_MAC(String string2) {
        this.MAC_addr = string2;
    }
}

