package com.epita.socra.app.tools;

public class NumberConverter {

    private RomanConverter romanConverter;
    private ArabicConverter arabicConverter;

    public NumberConverter() {
        super();
        romanConverter = new RomanConverter();
        arabicConverter = new ArabicConverter();
    }

    private String convertToRoman(int number) {
        return romanConverter.convertToRoman(number);
    }

    private int convertToArabic(String romanNumber) {
        return arabicConverter.convertToArabic(romanNumber);
    }

    public Object convert(String toConvert) {
        String errorMessage = "Error: this cannot be converted!";
        try {
            int arabicNumber = Integer.parseInt(toConvert);
            return convertToRoman(arabicNumber);
        } catch (NumberFormatException e) {
            try {
                return convertToArabic(toConvert);
            } catch (IllegalArgumentException e2) {
                return errorMessage;
            }
        } catch (IllegalArgumentException e) {
            return errorMessage;
        }
    }
}
