package com.epita.socra.app.tools;

public class RomanConverter {

    /**
     * Convert decimal number to roman
     * @param number The number to convert (< 3000)
     * @return String corresponding to the roman number
     */
    public String convertToRoman(int number) {
        if (number > 3999) {
            throw new IllegalArgumentException();
        }

        StringBuilder result = new StringBuilder();

        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabic = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < roman.length; i++) {
            while (arabic[i] <= number) {
                result.append(roman[i]);
                number -= arabic[i];
            }
        }

        return result.toString();
    }
}

