/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rpl.tugasppl1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 *
 * @author Junta
 */
public class ATest extends TestCase {
    
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public ATest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        System.setOut(null);
        super.tearDown();
    }

    /**
     * Test of f method, of class A.
     */
    public void testA(){
        A instance = new A();
        String[] temp = outContent.toString().split(System.getProperty("line.separator"));
        assertEquals("ctor-A", temp[0]);
    }
    public void testF() {
        A instance = new A();
        instance.f();
        String[] temp = outContent.toString().split(System.getProperty("line.separator"));
        assertEquals("A", temp[1]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
