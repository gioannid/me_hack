/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.ObjectInputStream
 *  java.lang.ClassNotFoundException
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.net.InetAddress
 *  java.util.ArrayList
 */
package com.msc3;

import com.discovery.ScanProfile;
import com.msc3.CamChannel;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.util.ArrayList;

public class CamProfile
extends ScanProfile {
    private static final int CAMERA_UNREACHABLE_THRESHOLD = 10;
    public static final int CAMERA_UPNP_IN_PROGRESS = 2;
    public static final int CAMERA_UPNP_NOT_OK = 0;
    public static final int CAMERA_UPNP_OK = 1;
    public static final String CODEC_H264 = "H264";
    public static final String CODEC_MJPEG = "MJPEG";
    public static final String MODEL_BLINK1 = "blink1";
    public static final String MODEL_BLINK1_1 = "blink1_1";
    public static final String MODEL_BLINKHD = "blink1_hd";
    private static final int SHORT_CLIP_SIZE = 2;
    private static final long serialVersionUID = 3199093442896698501L;
    private String basicAuth_pass;
    private String basicAuth_usr;
    private String camName;
    private String codec;
    private String firmwareVersion;
    private boolean isBound;
    private boolean isUpgradingFirmware;
    private String lastCommStatus;
    private CamChannel mChannel;
    private boolean melodyIsOn;
    private int minutesSinceLastComm;
    private String model;
    private int ptt_port;
    private int remoteCommMode;
    private ArrayList<byte[]> shortclip;
    private boolean soundAlertEnabled;
    private boolean tempHiAlertEnabled;
    private boolean tempLoAlertEnabled;
    private String version_string;
    private boolean voxEnabled;

    public CamProfile(InetAddress inetAddress, int n, String string) {
        super(inetAddress, n, string);
        this.ptt_port = 51108;
        this.isBound = false;
        this.mChannel = null;
        this.shortclip = new ArrayList(2);
        this.camName = null;
        this.lastCommStatus = "none";
        this.minutesSinceLastComm = 10;
        this.melodyIsOn = false;
        this.remoteCommMode = 0;
        this.firmwareVersion = "0";
        this.codec = CODEC_MJPEG;
        this.model = MODEL_BLINK1;
        this.isUpgradingFirmware = false;
    }

    public CamProfile(InetAddress inetAddress, String string) {
        super(inetAddress, string);
        this.inet_addr = inetAddress;
        this.MAC_addr = string;
        this.port = 80;
        this.ptt_port = 51108;
        this.isBound = false;
        this.mChannel = null;
        this.shortclip = new ArrayList(2);
        this.camName = null;
        this.lastCommStatus = "none";
        this.minutesSinceLastComm = 10;
        this.melodyIsOn = false;
        this.remoteCommMode = 0;
        this.firmwareVersion = "0";
        this.codec = CODEC_MJPEG;
        this.model = MODEL_BLINK1;
        this.isUpgradingFirmware = false;
    }

    public static void copyCamProfile(CamProfile camProfile, CamProfile camProfile2) {
        if (camProfile == null || camProfile2 == null) {
            return;
        }
        camProfile.setInetAddr(camProfile2.get_inetAddress());
        camProfile.set_MAC(camProfile2.get_MAC());
        camProfile.setPort(camProfile2.get_port());
        camProfile.setPTTPort(camProfile2.get_ptt_port());
        camProfile.bind(camProfile2.isBound());
        camProfile.setChannel(camProfile2.getChannel());
        camProfile.setName(camProfile2.getName());
        camProfile.setReachableInRemote(camProfile2.isReachableInRemote());
        camProfile.setInLocal(camProfile2.isInLocal());
        camProfile.setRemoteCommMode(camProfile2.getRemoteCommMode());
        camProfile.setFirmwareVersion(camProfile2.getFirmwareVersion());
        camProfile.setCodec(camProfile2.getCodec());
        camProfile.setModel(camProfile2.getModel());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.hasUpdateLocalStatus = false;
    }

    public void bind(boolean bl) {
        this.isBound = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(CamProfile camProfile) {
        return camProfile != null && camProfile.get_MAC() != null && this.MAC_addr.equalsIgnoreCase(camProfile.get_MAC());
    }

    @Override
    public String getBasicAuth_pass() {
        return this.basicAuth_pass;
    }

    @Override
    public String getBasicAuth_usr() {
        return this.basicAuth_usr;
    }

    public CamChannel getChannel() {
        return this.mChannel;
    }

    public String getCodec() {
        return this.codec;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getLastCommStatus() {
        return this.lastCommStatus;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.camName;
    }

    public int getRemoteCommMode() {
        return this.remoteCommMode;
    }

    public ArrayList<byte[]> getShortClip() {
        return this.shortclip;
    }

    public int get_ptt_port() {
        return this.ptt_port;
    }

    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    public boolean isBound() {
        return this.isBound;
    }

    public boolean isSoundAlertEnabled() {
        return this.soundAlertEnabled;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isSupportNewRelay() {
        int n;
        boolean bl;
        int n2;
        n2 = -1;
        n = -1;
        boolean bl2 = this.firmwareVersion.equals((Object)"0");
        bl = false;
        if (bl2) return bl;
        try {
            int n3;
            n2 = Integer.parseInt((String)this.firmwareVersion.substring(0, 2));
            n = n3 = Integer.parseInt((String)this.firmwareVersion.substring(3));
        }
        catch (NumberFormatException numberFormatException) {}
        if (n2 > 8) return true;
        bl = false;
        if (n2 != 8) return bl;
        bl = false;
        if (n < 39) return bl;
        return true;
    }

    public boolean isTempHiAlertEnabled() {
        return this.tempHiAlertEnabled;
    }

    public boolean isTempLoAlertEnabled() {
        return this.tempLoAlertEnabled;
    }

    public boolean isUpgradingFirmware() {
        return this.isUpgradingFirmware;
    }

    @Override
    public boolean isVoxEnabled() {
        return this.voxEnabled;
    }

    @Override
    public void setBasicAuth_pass(String string) {
        this.basicAuth_pass = string;
    }

    @Override
    public void setBasicAuth_usr(String string) {
        this.basicAuth_usr = string;
    }

    public void setChannel(CamChannel camChannel) {
        this.mChannel = camChannel;
    }

    public void setCodec(String string) {
        if (string == null) {
            this.codec = CODEC_MJPEG;
            return;
        }
        this.codec = string;
    }

    public void setFirmwareVersion(String string) {
        if (string == null) {
            this.firmwareVersion = "0";
            return;
        }
        this.firmwareVersion = string;
    }

    public void setLastCommStatus(String string) {
        this.lastCommStatus = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setMinutesSinceLastComm(int n) {
        this.minutesSinceLastComm = n > 10 ? 10 : n;
        if (this.minutesSinceLastComm < 10) {
            this.camLocation = 18;
            return;
        }
        this.camLocation = 19;
    }

    public void setModel(String string) {
        if (string == null) {
            this.model = MODEL_BLINK1;
            return;
        }
        if (string.equalsIgnoreCase("blink11")) {
            this.model = MODEL_BLINK1_1;
            return;
        }
        if (string.equalsIgnoreCase("blinkhd")) {
            this.model = MODEL_BLINKHD;
            return;
        }
        this.model = MODEL_BLINK1;
    }

    public void setName(String string) {
        this.camName = string;
    }

    public void setPTTPort(int n) {
        this.ptt_port = n;
    }

    public void setRemoteCommMode(int n) {
        this.remoteCommMode = n;
    }

    public void setShortClip(ArrayList<byte[]> arrayList) {
        this.shortclip = arrayList;
    }

    public void setSoundAlertEnabled(boolean bl) {
        this.soundAlertEnabled = bl;
    }

    public void setTempHiAlertEnabled(boolean bl) {
        this.tempHiAlertEnabled = bl;
    }

    public void setTempLoAlertEnabled(boolean bl) {
        this.tempLoAlertEnabled = bl;
    }

    public void setUpgradingFirmware(boolean bl) {
        this.isUpgradingFirmware = bl;
    }

    @Override
    public void setVoxEnabled(boolean bl) {
        this.voxEnabled = bl;
    }

    public String toString() {
        return this.MAC_addr;
    }

    public void unSelect() {
        this.isBound = false;
        if (this.mChannel != null) {
            this.mChannel.reset();
            this.mChannel = null;
        }
    }
}

