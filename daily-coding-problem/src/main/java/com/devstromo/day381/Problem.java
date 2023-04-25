package com.devstromo.day381;

import java.util.Base64;

class Problem {
    public static String hexToBase64(String hex) {
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < hex.length(); i += 2) {
            bytes[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
        }
        return Base64.getEncoder()
          .encodeToString(bytes);
    }
}
