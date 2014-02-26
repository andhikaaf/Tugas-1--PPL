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
 * @author zieg_32
 * 
 */
public class QTest extends TestCase {
   private ByteArrayOutputStream outputContent=new ByteArrayOutputStream();
    public QTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outputContent));
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
     public void testQ() {
    Q instance=new Q();
    String[] temp=outputContent.toString().split(System.getProperty("line.separator"));
    assertEquals("ctor-Q",temp[0]);
    }
}
