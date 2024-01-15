package org.example;

public class Main {
    public static void main(String[] args) {

//        RomanIntegers romanIntegers = new RomanIntegers();
//
//        String s = "IV";
//        var response = romanIntegers.romanToInt(s);

        LengthOfTheLastWord length = new LengthOfTheLastWord();
        String s = " moon pie ";
        var response = length.lengthOfLastWord(s);


        System.out.println(response);
    }
}