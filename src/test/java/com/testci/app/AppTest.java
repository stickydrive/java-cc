package com.testci.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App a_test_object = new App();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnTrue(){

        assertEquals(a_test_object.basicSum(5,5) ,10);
    }
    @Test
    public void shouldGoDown(){
        App a = new App();
        assertEquals(a_test_object.basicSum(5,1) ,12);
    }
}
