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
public class CTest extends TestCase {
    
    public CTest(String testName) {
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
     * Test of g method, of class C.
     */
    public void testG() {
        System.out.println("g");
        C instance = new CImpl();
        instance.g();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class CImpl implements C {

        public void g() {
        }
    }
    
}
