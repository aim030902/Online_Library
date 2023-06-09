package com.company.library.configs;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordConfigurer {
    public static String encode(String rawPassword) {
        return BCrypt.hashpw(rawPassword, BCrypt.gensalt(12));
    }

    public static boolean matchPassword(String rawPassword, String encodedPassword) {
        return BCrypt.checkpw(rawPassword, encodedPassword);
    }

}
