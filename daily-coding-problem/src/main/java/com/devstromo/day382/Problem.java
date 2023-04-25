package com.devstromo.day382;

import java.util.Base64;

class Problem {

    static String base64ToHex(String base64) {
        byte[] bytes = Base64.getDecoder()
          .decode(base64);
        StringBuilder hex = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }
}
