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
 * @author user
 */


public class ABTest extends TestCase {
    
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public ABTest(String testName) {
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
    public void testAB(){
        AB instance = new AB();
        String[] temp = outContent.toString()
                .split(System.getProperty("line.separator"));
        assertEquals("ctor-AB",temp[1]);
    }
    /**
     * Test of f method, of class AB.
     */
    public void testF() {
        //System.out.println("f");
        AB instance = new AB();
        instance.f();
        String[] temp = outContent.toString()
                .split(System.getProperty("line.separator"));
        assertEquals("AB",temp[2]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of v method, of class AB.
     */
    public void testV() {
        //System.out.println("v");
        AB instance = new AB();
        instance.v();
        String[] temp = outContent.toString()
                .split(System.getProperty("line.separator"));
        assertEquals("AB.v()",temp[2]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of g method, of class AB.
     */
    public void testG() {
        //System.out.println("g");
        AB instance = new AB();
        instance.g();
        String[] temp = outContent.toString()
                .split(System.getProperty("line.separator"));
        assertEquals("AB.g()",temp[2]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
