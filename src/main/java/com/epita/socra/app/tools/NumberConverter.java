package com.epita.socra.app.tools;

public class NumberConverter {

    private RomanConverter romanConverter;
    // private ArabicConverter arabicConverter;

    public String convertToRoman(int number) {
        return romanConverter.convertToRoman(number);
    }

    //public int convertToArabic(String romanNumber) {
    //    return arabicConverter.convertToArabic(romanNumber);
    //}
}
