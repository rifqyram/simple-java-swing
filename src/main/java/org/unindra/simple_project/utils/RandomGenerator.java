package org.unindra.simple_project.utils;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class RandomGenerator {

    private static final String CHARACTERS = "0123456789";
    private static final int STRING_LENGTH = 4;
    private static final String PREFIX = "P-";

    public static String generate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy-HHmmss");
        String currentDate = dateFormat.format(new Date());
        SecureRandom random = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder(20);

        stringBuilder.append(PREFIX);
        stringBuilder.append(currentDate);
        for (int i = 0; i < STRING_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(index));
        }

        return stringBuilder.toString();
    }

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

}
