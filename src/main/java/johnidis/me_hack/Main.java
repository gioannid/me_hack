package johnidis.me_hack;

import com.msc3.CamConfiguration;
import com.msc3.PublicDefine;

/**
 *
 * @author gioannid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ssid = "__your_WiFi_SSID__";
        String password = "__your_Wifi_WPA_key__";
        
        if (args.length == 2) {
            ssid = args[0];
            password = args[1];
        }
        
        CamConfiguration configuration = new CamConfiguration(
                ssid,
                "WPA/WPA2",
                password,
                null,
                null,
                null,
                null,
                null,
                null,
                PublicDefine.DEFAULT_BASIC_AUTH_USR,
                PublicDefine.DEFAULT_CAM_PWD,
                "Camera-",
                "4"
        );
        configuration.send_request(configuration.build_setup_request());
        configuration.send_request("http://192.168.2.1:80/?action=command&command=restart_system");
    }

}