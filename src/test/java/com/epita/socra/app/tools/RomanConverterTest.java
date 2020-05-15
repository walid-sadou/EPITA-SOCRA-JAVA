package com.epita.socra.app.tools;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RomanConverterTest {
    @Test
    public void given1_ThenConvertToI() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals("I", mock.convertToRoman(1));
    }

    @Test
    public void given5_ThenConvertToV() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals("V", mock.convertToRoman(5));
    }
    @Test
    public void given10_ThenConvertToX() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals("X", mock.convertToRoman(10));
    }
    @Test
    public void given50_ThenConvertToL() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals("L", mock.convertToRoman(50) );
    }
    @Test
    public void given100_ThenConvertToC() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals("C", mock.convertToRoman(100));
    }
    @Test
    public void given500_ThenConvertToD() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals("D", mock.convertToRoman(500));
    }
    @Test
    public void given1000_ThenConvertToM() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals("M", mock.convertToRoman(1000));
    }
}
