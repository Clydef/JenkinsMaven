package com.qualogy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void printGreeting() {
        String str1 = "Hello World!";
        assertEquals("Hello World!", App.printMsg(str1));
    }
}