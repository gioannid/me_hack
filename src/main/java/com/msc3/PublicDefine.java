/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.util.StringTokenizer
 */
package com.msc3;

import java.util.StringTokenizer;
import java.util.logging.Logger;

public class PublicDefine {
    public static final String ADD_CAM_CMD = "add_cam";
    public static final String ADD_CAM_PARAM_1 = "&email=";
    public static final String ADD_CAM_PARAM_2 = "&pass=";
    public static final String ADD_CAM_PARAM_3 = "&macaddress=";
    public static final String ADD_CAM_PARAM_4 = "&cam_name=";
    public static final String ADD_CAM_PARAM_5 = "&pass_len=";
    public static final String ADD_CAM_PARAM_6 = "&codec=";
    public static final String BASIC_AUTH_USR_PWD_CHANGE = "save_http_usr_passwd";
    public static final String BASIC_AUTH_USR_PWD_CHANGE_PARAM_1 = "&setup=";
    public static final String BM_HTTP_CMD_PART = "action=command&command=";
    public static final String BM_SERVER = "https://monitoreverywhere.com/BMS/phoneservice?";
    public static final String BM_SERVER_ADDR = "http://monitoreverywhere.com/BMS";
    public static final String BM_SERVER_CAM = "https://monitoreverywhere.com/BMS/cameraservice?";
    public static final int BM_SERVER_CONNECTION_TIMEOUT = 10000;
    public static final int BM_SERVER_READ_TIMEOUT = 10000;
    public static final int BUFFER_EMPTY = 0;
    public static final int BUFFER_FULL = 2;
    public static final int BUFFER_PROCESSING = 1;
    public static final String CHECK_UPNP = "check_upnp";
    public static final String CLOSE_RELAY_SESSION = "close_relay_session";
    public static final String CLOSE_UDT_SESSION = "close_session";
    public static final String COLD_ALARM = "TEMP_LOW:";
    public static final int DEFAULT_ALARM_DEACTIVATE_PORT = 51111;
    public static final int DEFAULT_ALARM_LISTEN_PORT = 51110;
    public static final int DEFAULT_ALARM_TCP_PORT = 51109;
    public static final int DEFAULT_AUDIO_PORT = 51108;
    public static final String DEFAULT_BASIC_AUTH_USR = "camera";
    public static final String DEFAULT_CAM_NAME = "Camera";
    public static final String DEFAULT_CAM_PWD = "000000";
    public static final String DEFAULT_DEVICE_PORT = "80";
    public static final String DEFAULT_HTTP = "http://192.168.2.1:80";
    public static final String DEFAULT_SSID = "Camera-";
    public static final String DEL_CAM_CMD = "delete_cam";
    public static final String DEL_CAM_PARAM_1 = "&email=";
    public static final String DEL_CAM_PARAM_2 = "&macaddress=";
    public static final String DEL_RESET_CAM_CMD = "delete_reset_cam";
    public static final String DEL_RESET_CAM_PARAM_1 = "&macaddress=";
    public static final String DEL_RESET_CAM_PARAM_2 = "&email=";
    public static final String DEVICE_IP = "192.168.2.1";
    public static final int DEVICE_RESTART_INFRA_TOTAL_TIME = 60000;
    public static final int DEVICE_RESTART_TOTAL_TIME = 40000;
    public static final String DIR_FB_STOP = "fb_stop";
    public static final String DIR_LR_STOP = "lr_stop";
    public static final String DIR_MOVE_BWD = "move_backward";
    public static final String DIR_MOVE_FWD = "move_forward";
    public static final String DIR_MOVE_LEFT = "move_left";
    public static final String DIR_MOVE_RIGHT = "move_right";
    public static final String DISABLE_NOTIFICATIONS_CMD = "disable_notifications_gcm";
    public static final String DISABLE_NOTIFICATIONS_U_CMD = "disable_notifications";
    public static final String ENABLE_NOTIFICATIONS_CMD = "enable_notifications_gcm";
    public static final String ENABLE_NOTIFICATIONS_PARAM_1 = "&registrationId=";
    public static final String ENABLE_NOTIFICATIONS_PARAM_2 = "&mac=";
    public static final String ENABLE_NOTIFICATIONS_PARAM_3 = "&alert=";
    public static final String ENABLE_NOTIFICATIONS_U_CMD = "enable_notifications";
    public static final String ENABLE_NOTIFICATIONS_U_PARAM_1 = "&username=";
    public static final String ENABLE_NOTIFICATIONS_U_PARAM_2 = "&mac=";
    public static final String ENABLE_NOTIFICATIONS_U_PARAM_3 = "&alert=";
    public static final String FLIP_IMAGE = "flipup";
    public static final String GET_AV_STREAM_CMD = "/?action=appletvastream";
    public static final String GET_AV_STREAM_PARAM_1 = "&remote_session=";
    public static final String GET_AV_STREAM_UDT_CMD = "action=appletvastream";
    public static final String GET_A_STREAM_CMD = "/?action=appletastream";
    public static final String GET_A_STREAM_UDT_CMD = "action=appletastream";
    public static final String GET_BRIGHTNESS_MINUS = "brightness_minus";
    public static final String GET_BRIGHTNESS_PLUS = "brightness_plus";
    public static final String GET_BRIGHTNESS_VALUE = "value_brightness";
    public static final String GET_CAM_LIST4_CMD = "camera_list4";
    public static final String GET_CAM_LIST5_CMD = "camera_list5";
    public static final String GET_CAM_LIST6_CMD = "camera_list6";
    public static final String GET_CAM_LIST_CMD = "camera_list";
    public static final String GET_CAM_LIST_PARAM = "&email=";
    public static final String GET_CHANNEL_ID_CMD = "get_channelid";
    public static final String GET_CODECS_SUPPORT = "get_codecs_support";
    public static final String GET_CONTRAST_MINUS = "contrast_minus";
    public static final String GET_CONTRAST_PLUS = "contrast_plus";
    public static final String GET_CONTRAST_VALUE = "value_contract";
    public static final String GET_DEFAULT_VERSION = "get_default_version";
    public static final String GET_DISABLED_NOTIFICATIONS_CMD = "get_disabled_alerts_gcm";
    public static final String GET_DISABLED_NOTIFICATIONS_PARAM_1 = "&registrationId=";
    public static final String GET_DISABLED_NOTIFICATIONS_PARAM_2 = "&mac=";
    public static final String GET_DISABLED_NOTIFICATIONS_U_CMD = "get_disabled_alerts";
    public static final String GET_DISABLED_NOTIFICATIONS_U_PARAM_1 = "&username=";
    public static final String GET_DISABLED_NOTIFICATIONS_U_PARAM_2 = "&mac=";
    public static final String GET_H264_STREAM_CMD = "/?action=h264stream";
    public static final String GET_IMG_CMD = "get_image";
    public static final String GET_IMG_PARAM_1 = "&macaddress=";
    public static final String GET_LED = "value_setupled";
    public static final String GET_MAC_ADDRESS = "get_mac_address";
    public static final String GET_MELODY_VALUE = "value_melody";
    public static final String GET_MODEL = "get_model";
    public static final String GET_PORT_CMD = "get_port_info";
    public static final String GET_PORT_PARAM_1 = "&macaddress=";
    public static final String GET_RELAY_SECURITY = "get_relaysec_info";
    public static final String GET_RELAY_SECURITY_PARAM_1 = "&macaddress=";
    public static final String GET_RESOLUTION = "value_resolution";
    public static final String GET_ROUTER_LIST = "get_routers_list";
    public static final String GET_SECURITY_INFO = "get_security_info";
    public static final String GET_SECURITY_INFO_PARAM_1 = "&email=";
    public static final String GET_SECURITY_INFO_PARAM_2 = "&pass=";
    public static final String GET_STREAM_MODE_CMD = "get_stream_mode";
    public static final String GET_STREAM_MODE_PARAM_1 = "&mac=";
    public static final String GET_TEMP_VALUE = "value_temperature";
    public static final String GET_UPNP_PORT = "get_upnp_port";
    public static final String GET_VERSION = "get_version";
    public static final String GET_VIDEO_FORMAT = "get_video_format";
    public static final String GET_VOLUME = "get_spk_volume";
    public static final int HIGH_C_TEMPERATURE_THRESHOLD = 29;
    public static final int HIGH_F_TEMPERATURE_THRESHOLD = 84;
    public static final String HOT_ALARM = "TEMP_HIGH:";
    public static final String HTTP_CMD_PART = "/?action=command&command=";
    public static final String IS_CAM_AVAIL = "is_cam_available";
    public static final String IS_CAM_AVAILABLE_ONLOAD2_CMD = "is_cam_available_onload2";
    public static final String IS_CAM_AVAILABLE_ONLOAD2_PARAM_1 = "&macaddress=";
    public static final String IS_CAM_AVAILABLE_ONLOAD_CMD = "is_cam_available_onload";
    public static final String IS_CAM_AVAILABLE_ONLOAD_PARAM_1 = "&macaddress=";
    public static final String IS_CAM_AVAILABLE_UPNP_CMD = "is_cam_available_upnp";
    public static final String IS_CAM_AVAILABLE_UPNP_CMD_PARAM_1 = "&macaddress=";
    public static final String IS_CAM_AVIL_PARAM_1 = "&macaddress=";
    public static final String IS_PORT_OPEN = "is_port_open";
    public static final String IS_PORT_OPEN_PARAM_1 = "&mac=";
    public static final String IS_PORT_OPEN_PARAM_2 = "&port=";
    public static final int LOW_C_TEMPERATURE_THRESHOLD = 14;
    public static final int LOW_F_TEMPERATURE_THRESHOLD = 57;
    public static final String MASTER_KEY_RESPONSE = "set_master_key: ";
    public static final int MAX_AUDIO_BUF_LEN = 1010;
    public static final int MAX_AUDIO_BUR_NUMBER = 16;
    public static final int MAX_IMAGE_BUF_LEN = 65536;
    public static final int MAX_IMAGE_BUF_NUMBER = 16;
    public static final int MAX_REACHED = 2;
    public static final int MAX_RECORD_SIZE_DEFAULT = 50;
    public static final String PHONE_IHOMEPHONE5 = "A13MID";
    public static final String PHONE_MBP1k = "MBP1000";
    public static final String PHONE_MBP2k = "Home Phone MBP2000";
    public static String PREFS_APP_CRASHED = "app_crashed_msc3";
    public static final String PREFS_APP_LAUNCHED_NOT_FIRST_TIME = "bool_appLaunched2ndtime";
    public static final String PREFS_AUTO_SHOW_CAM_LIST = "bool_autoShowCamList";
    public static final String PREFS_BLOCK_USER_FROM_LOGIN_START_TIME = "long_block_user_from_login_start_time";
    public static final String PREFS_CAM_BEING_VIEWED = "string_CameraBeingViewed";
    public static final String PREFS_CAM_VOLUME = "int_Volume";
    public static final String PREFS_CURRENT_CAMERA_MODE = "int_ConnectionMode";
    public static final String PREFS_CURRENT_DEVICE = "string_CurrentDevice";
    public static final String PREFS_CURRENT_DEVICE_MAC = "string_CurrentDeviceMac";
    public static final String PREFS_CURRENT_NW_SEC = "string_CurrentNwSec";
    public static final String PREFS_CURRENT_SSID = "string_CurrentSSID";
    public static final String PREFS_DONT_ASK_ME_AGAIN = "bool_dont_ask_me_again";
    public static final String PREFS_DONT_SHOW_MEM_WARNING_AGAIN = "bool_dont_show_mem_warning_again";
    public static final String PREFS_HOME_WIFI_SSID_NO_QUOTE = "string_home_wifi_ssid";
    public static final String PREFS_LOCAL_VIEW_MUTED = "bool_audio_is_muted";
    public static final String PREFS_MBP_CAMERA_DISCONNECT_ALERT = "bool_camera_disconnect_alert";
    public static final String PREFS_MBP_CAMERA_DISCONNECT_HOME_WIFI = "string_camera_home_wifi";
    public static final String PREFS_MBP_DISCONNECT_ALERT = "bool_disconnect_alert";
    public static final String PREFS_MBP_VOX_ALERT_ENABLED_IN_CALL = "bool_vox_alarm_enabled_on_call";
    public static final String PREFS_MBP_VOX_ALERT_IS_RECURRING = "bool_vox_alarm_is_recurring";
    public static final String PREFS_MULTI_MODE = "bool_IsMultiMode";
    public static final String PREFS_NAME = "MBP_SETTINGS";
    public static final String PREFS_NEED_RELOGIN = "need_relogin";
    public static final String PREFS_PUSH_NOTIFICATION_ID = "string_push_notification_reg_id";
    public static final String PREFS_PUSH_REG_STATUS = "bool_has_registered_with_BMS";
    public static final String PREFS_SAVED_CAM_SSID_IN_DIRECT_MODE = "string_DirectModeSsid";
    public static final String PREFS_SAVED_PORTAL_ID = "string_PortalUsrId";
    public static final String PREFS_SAVED_PORTAL_PWD = "string_PortalPass";
    public static final String PREFS_SAVED_PORTAL_USR = "string_PortalUsr";
    public static final String PREFS_SAVED_WIFI_HIDDEN_SSID = "string_SavedHiddenSsid";
    public static final String PREFS_SAVED_WIFI_PWD = "string_SavedSsidPass";
    public static final String PREFS_SAVED_WIFI_SEC = "string_SavedWFSec";
    public static final String PREFS_SAVED_WIFI_SEC_WEP_AUTH = "string_SavedWFSecAuth";
    public static final String PREFS_SAVED_WIFI_SEC_WEP_IDX = "string_SavedWFSecKeyIdx";
    public static final String PREFS_SAVED_WIFI_SSID = "string_SavedSsid";
    public static final String PREFS_SHOULD_ALLOW_USER_LOGIN = "bool_should_allow_user_login";
    public static final String PREFS_SHOULD_TURN_ON_WIFI = "bool_should_turn_on_wifi";
    public static final String PREFS_TEMPERATURE_UNIT = "int_tempUnit";
    public static final String PREFS_TEMP_PORTAL_PWD = "string_TempPass";
    public static final String PREFS_TEMP_PORTAL_USR = "string_TempUsr";
    public static final String PREFS_TRANSIENT_DEV_IP = "string_DevIp";
    public static final String PREFS_TRANSIENT_DEV_MAC = "string_DevMac";
    public static final String PREFS_TRANSIENT_DEV_PORT = "int_DevPort";
    public static final String PREFS_TRANSIENT_PASSWD = "string_Passwd";
    public static final String PREFS_TRANSIENT_USERNAME = "string_UserName";
    public static final String PREFS_USED_SAVED_USR_PWD = "bool_UseSavedPortalUsr";
    public static final String PREFS_USER_ACCES_INFRA_OFFLINE = "bool_InfraOfflineMode";
    public static final String PREFS_VOX_SHOULD_TAKE_WAKELOCK = "bool_VoxShouldTakeWakelock";
    public static final String PREFS_VQUALITY = "int_VideoQuality";
    public static final String PUSH_REGISTER = "register_gcm_device";
    public static final String PUSH_REGISTER_PARAM_1 = "&email=";
    public static final String PUSH_REGISTER_PARAM_2 = "&registrationId=";
    public static final String PUSH_UNREGISTER = "unregister_gcm_device";
    public static final String PUSH_UNREGISTER_PARAM_1 = "&registrationId=";
    public static final String RELAY_SERVER = "relay.monitoreverywhere.com";
    public static final String RELAY_SERVER2 = "relay2.monitoreverywhere.com";
    public static final int RELAY_SERVER_PRT = 44444;
    public static final String RESET_FACTORY = "reset_factory";
    public static final String RESET_PWD_CMD = "reset_password";
    public static final String RESET_PWD_PARAM_1 = "&email=";
    public static final String RESET_UPNP = "reset_upnp";
    public static final int RESOLUTON_QQVGA = 2;
    public static final int RESOLUTON_QVGA = 1;
    public static final int RESOLUTON_VGA = 0;
    public static final String RESTART_APP_HTTP_CMD = "http://192.168.2.1:80/?action=command&command=restart_app";
    public static final String RESTART_DEVICE = "restart_system";
    public static final String RESTART_DEVICE_HTTP_CMD = "http://192.168.2.1:80/?action=command&command=restart_system";
    public static final String RESTART_DEVICE_RESPONSE = "restart_system: ";
    public static final int RUN = 1;
    public static final String SEND_CTRL_CMD = "send_stun_command";
    public static final String SEND_CTRL_PARAM_1 = "&macaddress=";
    public static final String SEND_CTRL_PARAM_2 = "&channelid=";
    public static final String SEND_CTRL_PARAM_3 = "&query=";
    public static final String SETUP_READ_WIRELESS_HTTP_CMD = "http://192.168.2.1:80/?action=command&command=setup_wireless_read";
    public static final String SETUP_WIRELESS_HTTP_CMD = "http://192.168.2.1:80/?action=command&command=setup_wireless_save&setup=";
    public static final String SET_DEVICE_AUDIO_OFF = "audio_out1";
    public static final String SET_DEVICE_AUDIO_ON = "audio_out0";
    public static final String SET_LED_OFF = "setup_led0";
    public static final String SET_LED_ON = "setup_led1";
    public static final String SET_MELODY = "melody";
    public static final String SET_MELODY_OFF = "melodystop";
    public static final String SET_MKEY_HTTP_CMD = "http://192.168.2.1:80/?action=command&command=set_master_key&setup=";
    public static final String SET_RESOLUTION_QQVGA = "QQVGA160_120";
    public static final String SET_RESOLUTION_QVGA = "QVGA320_240";
    public static final String SET_RESOLUTION_VGA = "VGA640_480";
    public static final String SET_UPNP_PORT = "set_upnp_port";
    public static final String SET_UPNP_PORT_PARAM_1 = "&setup=";
    public static final String SET_VOLUME = "spk_volume";
    public static final String SET_VOLUME_PARAM_1 = "&setup=";
    public static final int STOP = 0;
    public static final String SWITCH_TO_DIRECT_MODE = "switch_to_uap";
    public static final int TEMPERATURE_UNIT_DEG_C = 1;
    public static final int TEMPERATURE_UNIT_DEG_F = 0;
    public static final String UDT_SERVER = "udt.monitoreverywhere.com";
    public static final int UDT_SERVER_PORT = 8000;
    public static final String UPDATE_CAM_CMD = "update_user_cam";
    public static final String UPDATE_CAM_PARAM_1 = "&email=";
    public static final String UPDATE_CAM_PARAM_2 = "&macaddress=";
    public static final String UPDATE_CAM_PARAM_3 = "&cam_name=";
    public static final String UPLOAD_LOG_SERVER_URL = "http://218.189.253.98/androidlog/AndroiduploadFile";
    public static final String USR_ACT_CMD = "user_activation";
    public static final String USR_ACT_PARAM_1 = "&email=";
    public static final String USR_ACT_PARAM_2 = "&key=";
    public static final String USR_LOGIN_CMD = "user_login";
    public static final String USR_LOGIN_PARAM_1 = "&email=";
    public static final String USR_LOGIN_PARAM_2 = "&pass=";
    public static final String USR_LOGIN_PARAM_3 = "&device=";
    public static final String USR_LOGIN_PARAM_4 = "&app_type=";
    public static final String USR_LOGIN_PARAM_5 = "&pass_len=";
    public static final String USR_REG1_CMD = "user_registration";
    public static final String USR_REG1_PARAM_1 = "&email=";
    public static final String USR_REG1_PARAM_2 = "&pass=";
    public static final String USR_REG1_PARAM_3 = "&username=";
    public static final String USR_REG_CMD = "user_register";
    public static final String USR_REG_PARAM_1 = "&email=";
    public static final String USR_REG_PARAM_2 = "&pass=";
    public static final String USR_REG_PARAM_3 = "&pass_len=";
    public static final String VIEW_CAM_CMD = "view_cam";
    public static final String VIEW_CAM_PARAM_1 = "&email=";
    public static final String VIEW_CAM_PARAM_2 = "&macaddress=";
    public static final String VIEW_CAM_RELAY_CMD = "view_cam_relay";
    public static final String VIEW_CAM_RELAY_PARAM_1 = "&macaddress=";
    public static final String VIEW_CAM_RELAY_PARAM_2 = "&email=";
    public static final String VOX_ALARM = "VOX:";
    public static final String VOX_DISABLE = "vox_disable";
    public static final String VOX_ENABLE = "vox_enable";
    public static final String VOX_GET_THRESHOLD = "vox_get_threshold";
    public static final int VOX_SENSITIVITY_DISABLED = -1;
    public static final int VOX_SENSITIVITY_HI = -25;
    public static final int VOX_SENSITIVITY_LOW = -10;
    public static final int VOX_SENSITIVITY_MED = -20;
    public static final int VOX_SENSITIVITY_V_HI = -30;
    public static final String VOX_SET_THRESHOLD = "vox_set_threshold";
    public static final String VOX_SET_THRESHOLD_VALUE = "setup=";
    public static final String VOX_STATUS = "vox_get_status";
    public static final String WIRELESS_SETUP_SAVE_RESPONSE = "setup_wireless_save: ";
    public static final String _SEND_CTRL_CMD = "send_control_command";
    public static final String _SEND_CTRL_PARAM_1 = "&macaddress=";
    public static final String _SEND_CTRL_PARAM_2 = "&channelid=";
    public static final String _SEND_CTRL_PARAM_3 = "&query=";
    public static final boolean start_to_use = true;

    public static String add_colon_to_mac(String string2) {
        if (string2.length() != 12) {
            System.err.println((String)("add_colon_to_mac-ERROR mac:" + string2));
            return "";
        }
        return String.valueOf((Object)string2.substring(0, 2)) + ":" + string2.substring(2, 4) + ":" + string2.substring(4, 6) + ":" + string2.substring(6, 8) + ":" + string2.substring(8, 10) + ":" + string2.substring(10);
    }

    public static String get_error_description(int n) {
            switch (n) {
                default: {
                    return "Unknown server error - " + n;
                }
                case 119: {
                    return "Camera not connected. Either the camera is switched off or this could be because of the low/weak internet connection. Please try in a while again.";
                }
                case 120: {
                    return "Insufficient parameters passed.";
                }
                case 121: {
                    return "bind exception";
                }
                case 122: {
                    return "local discovery failure.";
                }
                case 123: {
                    return "Audio plugin is disabled on your system.";
                }
                case 124: {
                    return "camera initial and control commands have some problem.";
                }
                case 400: {
                    return "Invalid parameters received.";
                }
                case 401: {
                    return "Looks like the registration for this camera was not completed. You need delete this camera and add again.";
                }
                case 404: {
                    return "Server is temporarily not available";
                }
                case 505: {
                    return "Username cannot have space and special character";
                }
                case 601: {
                    return "Invalid command passed. Please check the query.";
                }
                case 602: {
                    return "Required parameter(s) are missing. Please check the query.";
                }
                case 603: {
                    return "Length of the parameter is out of expected boundaries. Please check the query.";
                }
                case 604: {
                    return "Camera is busy or not available.";
                }
                case 606: {
                    return "Unable to send email. Email format is invalid.";
                }
                case 611: {
                    return "Camera does not exist. Please check the query.";
                }
                case 612: {
                    return "We are having problems to access your camera currently. Your action is required. Because of your network configuration - manual configuration might be required. Please visit FAQ to fix this issue.";
                }
                case 613: {
                    return "Cannot communicate with camera. Either IP Address or the port information is unavailable.";
                }
                case 614: {
                    return "Your camera is being accessed by other user currently and not available for streaming. Please try in a while again.";
                }
                case 621: {
                    return "User credentials entered are incorrect.";
                }
                case 622: {
                    return "Email Id is registered but not activated.";
                }
                case 623: {
                    return "Email Id is already activated.";
                }
                case 624: {
                    return "Activation failed. Either user is not registered or the activation period is expired. Please register again.";
                }
                case 625: {
                    return "Activation failed. Invalid activation key.";
                }
                case 626: {
                    return "Username or Password entered is incorrect.";
                }
                case 627: {
                    return "Camera is not associated with any user (email id).";
                }
                case 628: {
                    return "User registration failed. Email is already registered.";
                }
                case 629: {
                    return "Streaming port is closed on camera. Please restart the camera and try again.";
                }
                case 630: {
                    return "Requested image does not exist.";
                }
                case 631: {
                    return "Port forwarding needs to be done again, please contact administrator.";
                }
                case 632: {
                    return "We are having problems to access your camera currently. This could be because of the internet connection. Please try in a while again.";
                }
                case 636: {
                    return "User registration failed. Username is already registered.";
                }
                case 699: {
                    return "Unhandled exception occured, please contact administrator.";
                }
                case 701: {
                    return "Camera not connected. Either the camera is switched off or this could be because of the low/weak internet connection. Please try in a while again.";
                }
                case 702: {
                    return "Camera is busy or not available, Please try again";
                }
                case 703: {
                    return "Unable to communicate with camera, Please try again";
                }
                case 704: {
                    return "Unable to communicate with server, Please try again";
                }
                case 705: {
                    return "Unable to communicate with server, Please try again";
                }
                case 706: {
                    return "Server not reachable or not started, Please try again";
                }
                case 707: {
                    return "Can not connect to camera, please make sure that it is turned on.";
                }
                case 708: {
                    return "Your previous request is already in process, please wait...";
                }
                case 709: {
                    return "Camera not connected. Either the camera is switched off or this could be because of the low/weak internet connection. Please try in a while again.";
                }
                case 901: {
                    return "Server is busy,Please try after sometime.";
                }
                case 902: {
                    return "Network failure,Please reload the page.";
                }
                case 903: {
                    return "Relay Server failed to connect to camera, please try again.";
                }
                case 904: {
                    return "Relay Server is busy, Please Reload the page.";
                }
                case 905: {
                    return "Relay Server is down, Please reload after some time.";
                }
                case 906: {
                    return "There is a possible Symmetric NAT connection in your network.";
                }
                case 907: {
                    return "Problem in getting Relay server location. Please try again.";
                }
                case 908: {
                    return "Problem in getting relay secret key.";
                }
                case 12007: {
                    return "Internet not accessible! Check your network connection! ";
                }
                case 12029: 
            }
            return "Internet not accessible! Check your network connection! ";
    }

}

