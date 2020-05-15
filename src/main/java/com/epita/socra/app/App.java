package com.epita.socra.app;

import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;
    private NumberConverter numberConverter;

    private App() {
        this(new ConsoleAdapter(), new NumberConverter());
    }

    public App(IOAdapter adapter, NumberConverter numberConverter) {
        this.adapter = adapter;
        this.numberConverter = numberConverter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public void run(){
        adapter.write("Welcome to roman-arabic converter. Please enter your number (case unsensitive): ");
        String number = adapter.read();
        adapter.write("Translation: " + numberConverter.convert(number));
    }
}
