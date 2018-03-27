package com.home.som;

import com.home.som.annotation.MyTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    public AppTest() {

    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @MyTest
    public void firstTest(){
        System.out.println("FirstTest");
    }

    @MyTest
    public void secondTest(){
        System.out.println("SecondTest");
    }

    public void thirdTest(){
        System.out.println("ThirdTest");
    }
}
