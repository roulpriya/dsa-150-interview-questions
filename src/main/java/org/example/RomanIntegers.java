package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanIntegers {
    public int romanToInt(String s) {

        int ans = 0;
        Map<String, Integer> m = new HashMap<>();

        m.put("I", 1);
        m.put("V", 5);
        m.put("X", 10);
        m.put("L", 50);
        m.put("C", 100);
        m.put("D", 500);
        m.put("M", 1000);
        m.put("IV", 4);
        m.put("IX", 9);
        m.put("XL", 40);
        m.put("XC", 90);
        m.put("CD", 400);
        m.put("CM", 900);

        //decode s

        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            int value = 0;
            if(i+1 < s.length()){
                char c2 = s.charAt(i+1);
                value = m.getOrDefault("%s%s".formatted(c1, c2), 0);
            }

            if(value == 0){
                value = m.get(c1 + "");
            }
            else{
                i++;
            }
            ans = ans + value;
        }

        return ans;
    }
}
