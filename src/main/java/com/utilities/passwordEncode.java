package com.utilities;

import java.security.MessageDigest;

public final class passwordEncode {
    /***
     *
     * @param inStr
     * @return
     */
    public static String md5Encode(String inStr) throws Exception {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
    /**
     * test
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        String str = new String("yigenliang");
        System.out.println("origin" + str);
        System.out.println("after_MD5" + md5Encode(str));
    }
}
