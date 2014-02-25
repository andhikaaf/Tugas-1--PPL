/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rpl.tugasppl1;

import junit.framework.TestCase;

/**
 *
 * @author Junta
 */
public class BTest extends TestCase {
    
    public BTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of v method, of class B.
     */
    public void testV() {
        System.out.println("v");
        B instance = new BImpl();
        instance.v();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class BImpl implements B {

        public void v() {
        }
    }
    
}
