package com.codedifferently.algorithms;

public class AlgoChallenge02 {

    public String encrypt(String message, int shift){

        // Convert the string to a char array
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            // Check if it's an alphabetic character
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                chars[i] = (char) ((c + shift - base) % 26 + base);
            }
        }

        return new String(chars);

    }
}
