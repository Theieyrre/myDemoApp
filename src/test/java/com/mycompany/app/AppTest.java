package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

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

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testFoundforArrayList(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertTrue(new App().search(array,null,null,4));
    }


    public void testFoundforIntegerArray(){
        Integer[] array = {1,2,3,4};
        assertTrue(new App().search(null,array,null,4));
    }

    public void testFoundforDoubleArray(){
        Double[] array = {1.0,2.0,3.0,4.0};
        assertTrue(new App().search(null,null,array,4));
    }

    public void testNotFoundforArrayList(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertFalse(new App().search(array,null,null,5));
    }

    
    public void testNotFoundforIntegerArray(){
        Integer[] array = {1,2,3,4};
        assertFalse(new App().search(null,array,null,5));
    }

    public void testNotFoundforDoubleArray(){
        Double[] array = {1.0,2.0,3.0,4.0};
        assertFalse(new App().search(null,null,array,5));
    }


    public void testEmptyArrayList(){
        ArrayList<Integer> array = new ArrayList<>();
        assertFalse(new App().search(array,null,null,1));
    }

    
    public void testEmptyIntegerArray(){
        Integer[] array = new Integer[4];
        assertFalse(new App().search(null,array,null,1));
    }

    public void testEmptyDoubleArray(){
        Double[] array = new Double[4];
        assertFalse(new App().search(null,null,array,1));
    }
    public void testNull(){
        assertFalse(new App().search(null,null,null,1));
    }

}
