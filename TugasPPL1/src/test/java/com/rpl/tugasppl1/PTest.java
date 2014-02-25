/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rpl.tugasppl1;

import java.io.ByteArrayOutputStream;
import junit.framework.TestCase;
import java.io.PrintStream;

/**
 *
 * @author zieg_32
 */
public class PTest extends TestCase {
    private ByteArrayOutputStream outputContent=new ByteArrayOutputStream();
    public PTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outputContent));
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        System.setOut(null);
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
   //test contrusctor P
    public void testP() {
    P instance=new P();
    assertEquals("ctor-P", outputContent.toString().split(System.getProperty("line.separator"))[0]);
    }
}
