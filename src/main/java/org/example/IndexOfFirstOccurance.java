package org.example;

public class IndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {

        boolean found = false;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                found = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j > haystack.length() - 1) {
                        found = false;
                        break;
                    }
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        if (haystack.charAt(i + j) == needle.charAt(0)) {
                            i = i + j - 1;
                        }
                        found = false;
                        break;

                    }
                }
            }
            if (found)
                return i;
        }
        return -1;
    }
}

