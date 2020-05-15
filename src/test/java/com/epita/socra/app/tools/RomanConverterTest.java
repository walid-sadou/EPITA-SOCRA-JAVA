package com.epita.socra.app.tools;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanConverterTest {
    private RomanConverter romanConverter;
    @Before
    public void setUp() throws Exception {
        romanConverter = new RomanConverter();
    }

    @Test
    public void given1_ThenConvertToI() {
        assertEquals("I", romanConverter.convertToRoman(1));
    }

    @Test
    public void given5_ThenConvertToV() {
        assertEquals("V", romanConverter.convertToRoman(5));
    }
    @Test
    public void given10_ThenConvertToX() {
        assertEquals("X", romanConverter.convertToRoman(10));
    }
    @Test
    public void given50_ThenConvertToL() {
        assertEquals("L", romanConverter.convertToRoman(50) );
    }
    @Test
    public void given100_ThenConvertToC() {
        assertEquals("C", romanConverter.convertToRoman(100));
    }
    @Test
    public void given500_ThenConvertToD() {
        assertEquals("D", romanConverter.convertToRoman(500));
    }
    @Test
    public void given1000_ThenConvertToM() {
        assertEquals("M", romanConverter.convertToRoman(1000));
    }

    @Test
    public void given42_ThenConvertToXLII() {
        assertEquals("XLII", romanConverter.convertToRoman(42));
    }
    @Test
    public void given83_ThenConvertToLXXXIII() {
        assertEquals("LXXXIII", romanConverter.convertToRoman(83));
    }
    @Test
    public void given1903_ThenConvertToMCMIII() {
        assertEquals("MCMIII", romanConverter.convertToRoman(1903));
    }
    @Test
    public void given999_ThenConvertToCMXCIX() {
        assertEquals("CMXCIX", romanConverter.convertToRoman(999));
    }

    @Test
    public void given3000_ThenConvertToMMM() {
        assertEquals("MMM", romanConverter.convertToRoman(3000));
    }

    @Test
    public void given3999_ThenConvertToMMMCMXCIX() {
        assertEquals("MMMCMXCIX", romanConverter.convertToRoman(3999));
    }

    @Test(expected = IllegalArgumentException.class)
    public void given4000_ThenShouldThrowIllegalArgumentExecption() {
        System.out.println(romanConverter.convertToRoman(4000));
    }
}
