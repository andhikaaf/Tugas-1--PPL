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
public class ABBTest extends TestCase {
    
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public ABBTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        
        super.tearDown();
    }

    /**
     * Test of f method, of class ABB.
     */
    public void testABB(){
        ABB instance = new ABB();
        String[] temp = outContent.toString()
                .split(System.getProperty("line.separator"));
        assertEquals("ctor-ABB",temp[2]);
    }
        
    public void testF() {
        //System.out.println("f");
        ABB instance = new ABB();
        instance.f();
        String[] temp = outContent.toString()
                .split(System.getProperty("line.separator"));
        assertEquals("ABB",temp[3]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class ABB.
     */
    public void testGetX() {
        //System.out.println("getX");
        ABB instance = new ABB();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ABB.
     */
    public void testToString() {
        //System.out.println("toString");
        ABB instance = new ABB();
        int temp = instance.getX();
        String expResult = "" + temp;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
