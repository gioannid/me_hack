/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.wifi.WifiConfiguration
 *  android.util.Log
 *  com.msc3.CamProfile
 *  com.msc3.comm.HTTPRequestSendRecv
 *  java.io.UnsupportedEncodingException
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.SocketException
 *  java.net.URLEncoder
 *  java.util.Vector
 */
package com.msc3;

import com.msc3.CamProfile;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import /*com.msc3.comm.*/ johnidis.me_hack.HTTPRequestSendRecv;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Vector;

public class CamConfiguration {

    private String address_mode;
    private String auth_method;
    private CamChannel[] cam_channels;
    private CamProfile[] cam_profiles;
    private Vector<String> device_bssid;
    private String device_ssid;
    private String key_index;
    private String master_key;
    private String max_cam;
    private String netmask;
    private String pass_string;
    private String pass_wd;
    private String security_type;
    private Vector<String> skipped_device_bssid;
    private String ssid;
    private String static_ip;
    private String static_ip_gw;
    private String usr_name;
//    private WifiConfiguration wc;

    /*
     * Enabled aggressive block sorting
     */
    public CamConfiguration(
            String ssid,
            String securityType,
            String password,
            String wepKeyIndex,
            String authMethod,
            String dummy_addressMode,
            String dummy_staticIpGw,
            String dummy_netmask,
            String dummy_staticIp,
            String cameraUsername,
            String cameraPassword,
            String cameraSsid,
            String maxCam) {
        this.ssid = ssid;
        this.security_type = securityType;
        this.pass_string = password;
        this.key_index = wepKeyIndex;
        this.auth_method = authMethod;
        this.address_mode = dummy_addressMode;
        this.static_ip_gw = dummy_staticIpGw;
        this.static_ip = dummy_staticIp;
        this.netmask = dummy_netmask;
        if (cameraUsername == null) {
            cameraUsername = "";
        }
        this.usr_name = cameraUsername;
        if (cameraPassword == null) {
            cameraPassword = "";
        }
        this.pass_wd = cameraPassword;
        this.device_ssid = cameraSsid;
        this.max_cam = maxCam;
        this.device_bssid = null;
        this.cam_profiles = null;
        this.cam_channels = null;
        this.master_key = null;
        this.skipped_device_bssid = new Vector();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean shouldEncodeData() {
        String string2;
        String string3;
        try {
            String string4;
            String[] arrstring = new String[]{"192.168.2.1", "80", this.usr_name, this.pass_wd};
            string2 = string4 = HTTPRequestSendRecv.getModel((String[]) arrstring);
        } catch (SocketException socketException) {
            socketException.printStackTrace();
            string2 = null;
        }
        if (string2 != null) {
            if (string2.equalsIgnoreCase("blink11")) {
                return true;
            }
            if (string2.equalsIgnoreCase("blinkhd")) {
                return true;
            }
        }
        try {
            String string5;
            String[] arrstring = new String[]{"192.168.2.1", "80", this.usr_name, this.pass_wd};
            string3 = string5 = HTTPRequestSendRecv.getFirmwareVersion((String[]) arrstring);
        } catch (SocketException socketException) {
            socketException.printStackTrace();
            string3 = null;
        }
        int n = -1;
        int n2 = -1;
        if (string3 != null) {
            try {
                int n3;
                n = Integer.parseInt((String) string3.substring(0, 2));
                n2 = n3 = Integer.parseInt((String) string3.substring(3));
            } catch (NumberFormatException numberFormatException) {
                System.out.println((String) ("Firmware version from camera is invalid: " + string3));
            }
        }
        if (n > 8) {
            return true;
        }
        boolean bl = false;
        if (n != 8) {
            return bl;
        }
        bl = false;
        if (n2 < 23) {
            return bl;
        }
        return true;
    }

    public String address_mode() {
        return this.address_mode;
    }

    public String auth_method() {
        return this.auth_method;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String build_setup_core_request() {
        String string2;
        String string3;
        if (this.security_type.equalsIgnoreCase("WEP")) {
            string3 = this.auth_method.equalsIgnoreCase("Open") ? "0" : "1";
            Object[] arrobject = new Object[]{-1 + Integer.parseInt((String) this.key_index)};
            string2 = String.format((String) "%d", (Object[]) arrobject);
        } else if (this.security_type.equalsIgnoreCase("OPEN")) {
            string3 = "0";
            string2 = "0";
        } else {
            string3 = "2";
            string2 = "0";
        }
        Object[] arrobject = new Object[]{this.ssid.getBytes().length};
        String string4 = String.format((String) "%03d", (Object[]) arrobject);
        Object[] arrobject2 = new Object[]{this.pass_string.length()};
        String string5 = String.format((String) "%02d", (Object[]) arrobject2);
        Object[] arrobject3 = new Object[]{this.usr_name.length()};
        String string6 = String.format((String) "%02d", (Object[]) arrobject3);
        Object[] arrobject4 = new Object[]{this.pass_wd.length()};
        String string7 = String.format((String) "%02d", (Object[]) arrobject4);
        String string8 = String.valueOf((Object) "1") + "00" + string3 + string2 + "0" + string4 + string5 + "00" + "00" + "00" + "0" + string6 + string7 + this.ssid + this.pass_string + this.usr_name + this.pass_wd;
        if (!this.shouldEncodeData()) {
            System.out.println((String) "No need to encode setup data.");
            return "/?action=command&command=setup_wireless_save&setup=" + string8;
        }
        try {
            String string9;
            string8 = string9 = URLEncoder.encode((String) string8, (String) "UTF-8");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        System.out.println((String) "Encode setup data");
        return "/?action=command&command=setup_wireless_save&setup=" + string8;
    }

    public String build_setup_request() {
        return "http://192.168.2.1:80" + this.build_setup_core_request();
    }

    public String device_ssid() {
        return this.device_ssid;
    }

    public CamChannel[] getCamChannels() {
        return this.cam_channels;
    }

    public CamProfile[] getCamProfiles() {
        return this.cam_profiles;
    }

    public Vector<String> getDeviceBSSIDList() {
        return this.device_bssid;
    }

    public String getHttpPass() {
        return this.pass_wd;
    }

    public String getHttpUsr() {
        return this.usr_name;
    }

    public String getMasterKey() {
        return this.master_key;
    }

    public Vector<String> getSkippedDeviceList() {
        return this.skipped_device_bssid;
    }

    public String key_index() {
        return this.key_index;
    }

    public String max_cam() {
        return this.max_cam;
    }

    public String netmask() {
        return this.netmask;
    }

    public String pass_string() {
        return this.pass_string;
    }

    public String security_type() {
        return this.security_type;
    }

    public void setCamChannels(CamChannel[] arrcamChannel) {
        this.cam_channels = arrcamChannel;
    }

    public void setCamProfiles(CamProfile[] arrcamProfile) {
        this.cam_profiles = arrcamProfile;
    }

    public void setDeviceList(Vector<String> vector) {
        this.device_bssid = vector;
    }

    public void setMasterKey(String string2) {
        this.master_key = string2.toUpperCase();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setWifiConf(Object wifiConfiguration) {
        /*        this.wc = wifiConfiguration;
        StringBuilder stringBuilder = new StringBuilder("setWifiConf: wc is NULL? ");
        boolean bl = wifiConfiguration == null;
        Log.d((String)"mbp", (String)stringBuilder.append(bl).toString());*/
        System.out.println("CamConfiguration.setWifiConfiguration!");
    }

    public String ssid() {
        return this.ssid;
    }

    public String static_ip() {
        return this.static_ip;
    }

    public String static_ip_gw() {
        return this.static_ip_gw;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object wc() {
        /*        StringBuilder stringBuilder = new StringBuilder("wc is NULL? ");
        boolean bl = this.wc == null;
        Log.d((String)"mbp", (String)stringBuilder.append(bl).toString());*/
        System.out.println("CamConfiguration.wc!");
        return null;
    }

    public String send_request(String var1) {
        HttpURLConnection var2_2 = null;
        Object[] var3_3 = new Object[]{usr_name, pass_wd};
        String var4_4 = String.format((String) "%s:%s", (Object[]) var3_3);
        try {
            var2_2 = (HttpURLConnection) new URL(var1).openConnection();
            var2_2.addRequestProperty("Authorization", "Basic " + Base64.getEncoder().encodeToString((byte[]) var4_4.getBytes("UTF-8")));
            var2_2.setConnectTimeout(5000);
            var2_2.setReadTimeout(5000);
            int var8_5 = var2_2.getResponseCode();
            String var9_6 = null;
            if (var8_5 != 200) {
                return null;
            }
            DataInputStream var10_7 = new DataInputStream((InputStream) new BufferedInputStream(var2_2.getInputStream()));
            var2_2.getContentType();
            var9_6 = var10_7.readLine();
            System.out.println("Request " + var1 + " returned " + var9_6);
            return var9_6;
        } catch (MalformedURLException var13_9) {
            var13_9.printStackTrace();
        } catch (IOException var5_10) {
            var5_10.printStackTrace();
        } finally {
            var2_2.disconnect();
        }
        return null;
    }

}
