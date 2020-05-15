package com.epita.socra.app.tools;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {
    private NumberConverter numberConverter;

    @Before
    public void setUp() throws Exception {
        numberConverter = new NumberConverter();
    }

    @Test
    public void givenStringXV_ThenConvertToArabic15() {
        assertEquals(15, numberConverter.convert("XV"));
    }

    @Test
    public void givenString15_ThenConvertToRomanXV() {
        assertEquals("XV", numberConverter.convert("15"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenStringMMMM_ThenThrowException() {
        assertEquals("Error: this cannot be converted!", numberConverter.convert("MMMM"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenxDlTl50d_ThenThrowException() {
        assertEquals("Error: this cannot be converted!", numberConverter.convert("xDlTl50d"));
    }
}
