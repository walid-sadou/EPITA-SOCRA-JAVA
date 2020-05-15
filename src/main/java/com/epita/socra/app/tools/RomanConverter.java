package com.epita.socra.app.tools;

public class RomanConverter {

    public String convertToRoman(int number) {
        String result = "";

        switch (number) {
            case 1:
                result += "I";
                break;
            case 5:
                result += "V";
                break;
            case 10:
                result += "X";
                break;
            case 50:
                result += "L";
                break;
            case 100:
                result += "C";
                break;
            case 500:
                result += "D";
                break;
            case 1000:
                result += "M";
                break;
        }

        return result;
    }

}

