/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.widget.ImageView
 *  com.msc3.CamProfile
 *  com.msc3.ViewRemoteCamRequestTask
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.InetAddress
 */
package com.msc3;

import com.msc3.CamProfile;
//import com.msc3.GetRemoteCamPortTask;
//import com.msc3.ViewRemoteCamRequestTask;
import java.io.Serializable;
import java.net.InetAddress;

public class CamChannel
implements Serializable {
    public static final int CONFIGURE_STATUS_ASSIGNED = 258;
    public static final int CONFIGURE_STATUS_AWAITING_FOR_ASSIGNMENT = 257;
    public static final int CONFIGURE_STATUS_NOT_ASSIGNED = 256;
    public static final int LOCAL_VIEW = 1;
    public static final int REMOTE_HTTP_VIEW = 2;
    public static final int REMOTE_RELAY_VIEW = 4;
    public static final int REMOTE_UDT_VIEW = 3;
    public static final int RV_GET_PORT_STATE = 1;
    public static final int RV_INVALID_STATE = -1;
    public static final int RV_STREAM_STATE = 3;
    public static final int RV_VIEW_REQ_STATE = 2;
    private static final long serialVersionUID = -4306588857336898530L;
    private int channel_configure_status;
    private int channel_index;
//    private transient ImageView channel_view;
    private int channel_view_disable_res_id;
    private int channel_view_enable_res_id;
    private transient int currentViewSession;
//    private transient GetRemoteCamPortTask getPortTask;
    private CamProfile profile;
    private transient boolean relinkMode;
    private transient int remoteViewSessionState;
//    private transient ViewRemoteCamRequestTask viewRMTask;

    public CamChannel(int n) {
        this.channel_index = n;
        this.profile = null;
        this.channel_configure_status = 256;
        this.currentViewSession = 1;
        this.remoteViewSessionState = -1;
        this.relinkMode = false;
    }

    public static void copyCamChannel(CamChannel camChannel, CamChannel camChannel2) {
        if (camChannel == null || camChannel2 == null) {
            return;
        }
        camChannel.setState(camChannel2.getState());
        camChannel.setCurrentViewSession(camChannel2.getCurrentViewSession());
        camChannel.setRemoteViewSessionState(camChannel2.getRemoteViewSessionState());
        CamProfile camProfile = camChannel2.getCamProfile();
        if (camProfile != null) {
            CamProfile camProfile2 = camChannel.getCamProfile();
            if (camProfile2 == null) {
                camProfile2 = new CamProfile(camProfile.get_inetAddress(), camProfile.get_MAC());
            }
            CamProfile.copyCamProfile((CamProfile)camProfile2, (CamProfile)camProfile);
            camChannel.setCamProfile(camProfile2);
            return;
        }
        camChannel.setCamProfile(null);
    }

    public static void copySessionData(CamChannel camChannel, CamChannel camChannel2) {
    }

    private void setRemoteViewSessionState(int n) {
        this.remoteViewSessionState = n;
    }

    private boolean setState(int n) {
        if (n >= 256 && n <= 258) {
            this.channel_configure_status = n;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cancelRemoteConnection() {
        System.out.println("CamChannel.cancelRemoteConnection!");
 /*       boolean bl = true;
        CamChannel camChannel = this;
        synchronized (camChannel) {
            block11 : {
                StringBuilder stringBuilder = null;
                block12 : {
                    switch (this.remoteViewSessionState) {
                        case 1: {
                            StringBuilder stringBuilder2 = new StringBuilder("Current state: RV_GET_PORT_STATE (getPortTask != null)? ");
                            if (this.getPortTask == null) {
                                bl = false;
                            }
                            System.out.println((String)stringBuilder2.append(bl).toString());
                            if (this.getPortTask != null) {
                                this.getPortTask.cancel(true);
                                this.getPortTask = null;
                            }
                            break block11;
                        }
                        case 2: {
                            stringBuilder = new StringBuilder("Current state: RV_VIEW_REQ_STATE (viewRMTask != null)? ");
                            if (this.viewRMTask == null) break;
                            break block12;
                        }
                        case 3: {
                            System.out.println((String)"Current state: RV_STREAM_STATE");
                            break block11;
                        }
                    }
                    bl = false;
                }
                System.out.println(stringBuilder.append(bl).toString());
                if (this.viewRMTask != null) {
                    this.viewRMTask.cancel(true);
                    this.viewRMTask = null;
                }
            }
            this.remoteViewSessionState = -1;
            this.relinkMode = false;
            return;
        }*/
    }

    public CamProfile getCamProfile() {
        return this.profile;
    }

    public int getChannel() {
        return this.channel_index;
    }

    public int getCurrentViewSession() {
        return this.currentViewSession;
    }

    public int getRemoteViewSessionState() {
        return this.remoteViewSessionState;
    }

    public int getState() {
        return this.channel_configure_status;
    }

    public void refresh() {
        if (this.channel_configure_status == 258 && this.profile != null /*&& this.channel_view != null*/) {
            System.out.println("CamChannel.refresh!");
            //this.channel_view.setImageResource(this.channel_view_enable_res_id);
            return;
        }
        this.reset();
    }

    public void reset() {
        this.setState(256);
        this.profile = null;
        System.out.println("CamChannel.reset!");
//        if (this.channel_view != null) {
//            this.channel_view.setImageResource(this.channel_view_disable_res_id);
//        }
    }

    public boolean setCamProfile(CamProfile camProfile) {
        if (camProfile == null) {
            return false;
        }
        setState(258);
        this.profile = camProfile;
        return true;
    }

    public void setChannelHighlightImage(int n) {
        this.channel_view_enable_res_id = n;
    }

    public void setChannelImage(Object imageView) {
        System.out.println("CamChannel.setChannelImage!");
//        this.channel_view = imageView;
    }

    public void setChannelNormalImage(int n) {
        this.channel_view_disable_res_id = n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean setConfigure() {
        switch (this.channel_configure_status) {
            default: {
//                do {
                    return true;
//                    break;
//                } while (true);
            }
            case 256: 
            case 258: 
        }
        if (this.profile != null) {
            this.profile.bind(false);
            this.profile.setChannel(null);
            this.profile = null;
        }
        System.out.println("CamChannel.setConfigure!");
//        this.channel_view.setImageResource(this.channel_view_disable_res_id);
        this.channel_configure_status = 257;
        return true;
    }

    public void setCurrentViewSession(int n) {
        this.currentViewSession = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean setGetPortState(Object getRemoteCamPortTask) {
        if (this.currentViewSession == 2 && 3 == this.remoteViewSessionState) {
            System.out.println((String)"Was in RV_STREAM_STATE before this -- set relink to TRUE");
            this.relinkMode = true;
        }
        Object var4_2 = this;
        synchronized (var4_2) {
         System.out.println("CamChannel.setGetPortState!");
//           this.getPortTask = getRemoteCamPortTask;
 //           this.getPortTask.setRetryUntilSuccess(this.relinkMode);
            this.remoteViewSessionState = 1;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean setStreamingState() {
        if (2 != this.remoteViewSessionState) {
            System.out.println((String)"setStreamingState():invalid state at: setStream -- return false; ");
            return false;
        }
        CamChannel camChannel = this;
        synchronized (camChannel) {
            this.remoteViewSessionState = 3;
            return true;
        }
    }

    public void setViewEnable() {
 /*       if (this.channel_view != null) {
            this.channel_view.setImageResource(this.channel_view_enable_res_id);
        }*/
         System.out.println("CamChannel.setViewEnable!");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean setViewReqState(Object viewRemoteCamRequestTask) {
        if (this.currentViewSession == 2 && 1 != this.remoteViewSessionState && this.currentViewSession != 3 && this.currentViewSession != 4) {
            System.out.println((String)"invalid state at: setViewreq -- return false; ");
            return false;
        }
        if (this.currentViewSession == 3 && 3 == this.remoteViewSessionState) {
            System.out.println((String)"UDT STREAM : Was in RV_STREAM_STATE before this -- set relink to TRUE");
            this.relinkMode = true;
        }
        Object var5_2 = this;
        synchronized (var5_2) {
                     System.out.println("CamChannel.setViewReqState!");
 //           this.viewRMTask = viewRemoteCamRequestTask;
 //           this.viewRMTask.setRetryUntilSuccess(this.relinkMode);
            this.remoteViewSessionState = 2;
            return true;
        }
    }

    public String toString() {
        if (this.channel_configure_status == 258) {
            Object[] arrobject = new Object[]{1 + this.channel_index, this.profile.getName()};
            return String.format((String)"Channel %d: %s", (Object[])arrobject);
        }
        Object[] arrobject = new Object[]{1 + this.channel_index};
        return String.format((String)"Channel %d: ", (Object[])arrobject);
    }
}

