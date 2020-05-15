package com.epita.socra.app.tools;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanConverterTest {
    @Test
    public void given1_ThenConvertToI() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("I", romanConverter.convertToRoman(1));
    }

    @Test
    public void given5_ThenConvertToV() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("V", romanConverter.convertToRoman(5));
    }
    @Test
    public void given10_ThenConvertToX() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("X", romanConverter.convertToRoman(10));
    }
    @Test
    public void given50_ThenConvertToL() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("L", romanConverter.convertToRoman(50) );
    }
    @Test
    public void given100_ThenConvertToC() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("C", romanConverter.convertToRoman(100));
    }
    @Test
    public void given500_ThenConvertToD() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("D", romanConverter.convertToRoman(500));
    }
    @Test
    public void given1000_ThenConvertToM() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("M", romanConverter.convertToRoman(1000));
    }

    @Test
    public void given42_ThenConvertToXLII() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("XLII", romanConverter.convertToRoman(42));
    }
    @Test
    public void given83_ThenConvertToLXXXIII() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("LXXXIII", romanConverter.convertToRoman(83));
    }
    @Test
    public void given1903_ThenConvertToMCMIII() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("MCMIII", romanConverter.convertToRoman(1903));
    }
    @Test
    public void given999_ThenConvertToCMXCIX() {
        RomanConverter romanConverter = new RomanConverter();
        assertEquals("CMXCIX", romanConverter.convertToRoman(999));
    }
}
