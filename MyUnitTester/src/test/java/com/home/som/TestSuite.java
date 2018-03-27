package com.home.som;

import java.lang.reflect.InvocationTargetException;

public class TestSuite {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestRunner testRunner = new TestRunner();
        testRunner.runTests(new AppTest());
    }
}
