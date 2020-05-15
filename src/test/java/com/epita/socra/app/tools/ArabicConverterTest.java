package com.epita.socra.app.tools;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArabicConverterTest {
    private ArabicConverter arabicConverter;

    @Before
    public void setUp() throws Exception {
        arabicConverter = new ArabicConverter();
    }

    @Test
    public void giveni_ThenConvertTo1() {
        assertEquals(1, arabicConverter.convertToArabic("i"));
    }

    @Test
    public void givenI_ThenConvertTo1() {
        assertEquals(1, arabicConverter.convertToArabic("I"));
    }

    @Test
    public void givenV_ThenConvertTo5() {
        assertEquals(5, arabicConverter.convertToArabic("V"));
    }
    @Test
    public void givenX_ThenConvertTo10() {
        assertEquals(10, arabicConverter.convertToArabic("X"));
    }
    @Test
    public void givenL_ThenConvertTo50() {
        assertEquals(50, arabicConverter.convertToArabic("L") );
    }
    @Test
    public void givenC_ThenConvertTo100() {
        assertEquals(100, arabicConverter.convertToArabic("C"));
    }
    @Test
    public void givenD_ThenConvertTo500() {
        assertEquals(500, arabicConverter.convertToArabic("D"));
    }
    @Test
    public void givenM_ThenConvertTo1000() {
        assertEquals(1000, arabicConverter.convertToArabic("M"));
    }

    @Test
    public void givenXLII_ThenConvertTo42() {
        assertEquals(42, arabicConverter.convertToArabic("XLII"));
    }
    @Test
    public void givenLXXXIII_ThenConvertTo83() {
        assertEquals(83, arabicConverter.convertToArabic("LXXXIII"));
    }
    @Test
    public void givenMCMIII_ThenConvertTo1903() {
        assertEquals(1903, arabicConverter.convertToArabic("MCMIII"));
    }
    @Test
    public void givenCMXCIX_ThenConvertTo999() {
        assertEquals(999, arabicConverter.convertToArabic("CMXCIX"));
    }

    @Test
    public void givenMMM_ThenConvertTo3000() {
        assertEquals(3000, arabicConverter.convertToArabic("MMM"));
    }

    @Test
    public void givenMMMCMXCIX_ThenConvertTo3999() {
        assertEquals(3999, arabicConverter.convertToArabic("MMMCMXCIX"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void given4000_ThenShouldThrowIllegalArgumentExecption() {
        System.out.println(arabicConverter.convertToArabic("MMMM"));
    }
}
