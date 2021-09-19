/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnidis.me_hack;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

/**
 *
 * @author gioannid
 */
public class HTTPRequestSendRecv {

    public static String getModel(String... var0) throws SocketException {
        if (var0.length != 4) {
            return null;
        }
        String var1_1 = var0[0];
        String var2_2 = var0[1];
        String var3_3 = var0[2];
        String var4_4 = var0[3];
        if (var3_3 == null) {
            var3_3 = "";
        }
        if (var4_4 == null) {
            var4_4 = "";
        }
        String var5_5 = "http://" + var1_1 + ":" + var2_2 + "/?action=command&command=" + "get_model";
        String var6_6 = String.format((String) "%s:%s", (Object[]) new Object[]{var3_3, var4_4});
        try {
            URL var7_7 = new URL(var5_5);
            URLConnection var13_8 = var7_7.openConnection();
            var13_8.setConnectTimeout(5000);
            var13_8.addRequestProperty("Authorization", "Basic " + Base64.getEncoder().encodeToString((byte[]) var6_6.getBytes("UTF-8")));
            if (((HttpURLConnection) var13_8).getResponseCode() == 401) {
                System.err.println((String) "Auth failed! " + var6_6);
                return null;
            }
            DataInputStream var14_9 = new DataInputStream((InputStream) new BufferedInputStream(var13_8.getInputStream(), 4096));
            String var17_10 = var13_8.getContentType();
            if (var17_10 == null) {
                return null;
            }
            if (var17_10.equalsIgnoreCase("text/plain") == false) {
                return null;
            }
            String var18_11 = var14_9.readLine();
            String var19_12 = null;
            if (var18_11 == null) {
                return var19_12;
            }
            boolean var20_13 = var18_11.startsWith("get_model");
            var19_12 = null;
            if (var20_13 == false) {
                return var19_12;
            }
            String var21_14 = var18_11.substring(2 + "get_model".length());
            return var21_14;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SocketException(e.getMessage());
        }
    }

    public static String getFirmwareVersion(String... var0) throws SocketException {
        if (var0.length != 4) {
            return null;
        }
        String var1_1 = var0[0];
        String var2_2 = var0[1];
        String var3_3 = var0[2];
        String var4_4 = var0[3];
        if (var3_3 == null) {
            var3_3 = "";
        }
        if (var4_4 == null) {
            var4_4 = "";
        }
        String var5_5 = "http://" + var1_1 + ":" + var2_2 + "/?action=command&command=" + "get_version";
        String var6_6 = String.format((String) "%s:%s", (Object[]) new Object[]{var3_3, var4_4});
        try {
        URL var7_7 = new URL(var5_5);
        URLConnection var13_8 = var7_7.openConnection();
        var13_8.setConnectTimeout(5000);
        var13_8.addRequestProperty("Authorization", "Basic " + Base64.getEncoder().encodeToString((byte[]) var6_6.getBytes("UTF-8")));
        if (((HttpURLConnection) var13_8).getResponseCode() == 401) {
            System.err.println((String) "Auth failed! " + var6_6);
            return null;
        }
        DataInputStream var14_9 = new DataInputStream((InputStream) new BufferedInputStream(var13_8.getInputStream(), 4096));
        String var17_10 = var13_8.getContentType();
        if (var17_10 == null) {
            return null;
        }
        if (var17_10.equalsIgnoreCase("text/plain") == false) {
            return null;
        }
        String var18_11 = var14_9.readLine();
        String var19_12 = null;
        if (var18_11 == null) {
            return var19_12;
        }
        boolean var20_13 = var18_11.startsWith("get_version");
        var19_12 = null;
        if (var20_13 == false) {
            return var19_12;
        }
        String var21_14 = var18_11.substring(2 + "get_version".length());
        return var21_14;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SocketException(e.getMessage());
        }
    }
    
}
