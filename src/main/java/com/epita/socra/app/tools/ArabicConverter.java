package com.epita.socra.app.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArabicConverter {

    private int romanValueToArabicNumber(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;

        return -1;
    }


    public int convertToArabic(String romanNumber) {
        romanNumber = romanNumber.toUpperCase();

        Pattern pattern = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        Matcher matcher = pattern.matcher(romanNumber);

        if (!matcher.matches()) {
            throw new IllegalArgumentException();
        }

        int result = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            int first = romanValueToArabicNumber(romanNumber.charAt(i));

            if (i+1 < romanNumber.length()) {
                int second = romanValueToArabicNumber(romanNumber.charAt(i+1));

                if (first >= second) {
                    result = result + first;
                }
                else {
                    result = result + second - first;
                    ++i;
                }
            }
            else {
                result = result + first;
                ++i;
            }
        }

        return result;
    }
}
