package com.springauth.SpringAuth.model;

import java.security.SecureRandom;

public class UID {
    public static String generate() {
        String value;
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[8];
        secureRandom.nextBytes(randomBytes);

        long timestamp = System.currentTimeMillis();
        String timestampHex = Long.toHexString(timestamp);
        timestampHex = String.format("%10s", timestampHex).replace(' ', '0');

        StringBuilder randomValueHex = new StringBuilder();
        for (byte b : randomBytes) {
            String hex = String.format("%02x", b);
            randomValueHex.append(hex);
        }

        value = timestampHex + randomValueHex.toString();
        return value;
    }

}
