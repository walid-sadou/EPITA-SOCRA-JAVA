package com.epita.socra.app.tools;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RomanConverterTest {

    public void given5_ThenConvertToV() {
        RomanConverter mock = mock(RomanConverter.class);
        assertEquals(mock.convertToRoman(5), "V");
    }
}
