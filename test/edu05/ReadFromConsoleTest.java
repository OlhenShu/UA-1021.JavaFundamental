package edu05;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class ReadFromConsoleTest {

    @Test
    void readNumberFromConsole() {
        String input = "15";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int result = ReadFromConsole.readNumberFromConsole();
        assertEquals(15,result);
    }
}