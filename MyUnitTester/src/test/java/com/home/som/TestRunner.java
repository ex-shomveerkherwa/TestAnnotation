package com.home.som;

import com.home.som.annotation.MyTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {

    public void runTests(Object object) throws InvocationTargetException, IllegalAccessException {
        Method[] allMethods = object.getClass().getDeclaredMethods();
        for(Method method : allMethods){
            if(method.isAnnotationPresent(MyTest.class))
                method.invoke(object);
        }
    }

}
