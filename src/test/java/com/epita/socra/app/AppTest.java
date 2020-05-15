package com.epita.socra.app;

import com.epita.socra.app.tools.NumberConverter;
import com.epita.socra.app.tools.RomanConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private NumberConverter numberConverter;

    @Before
    public void setUp() throws Exception {
        numberConverter = new NumberConverter();
    }

    /**
     * Rigorous Test.
     */
    @Test
    public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("X");
        App app = new App(mock, numberConverter);
        app.run();

        verify(mock).write("Welcome to roman-arabic converter. Please enter your number (case unsensitive): ");
        verify(mock).write(argThat(message -> message.contains("Translation: 10")));
    }
}
