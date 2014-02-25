package com.rpl.tugasppl1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static junit.framework.Assert.assertEquals;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MainProgTest 
    extends TestCase
{
    private ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MainProgTest( String testName )
    {
        super( testName );
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outputContent));
        super.setUp();
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MainProgTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Test of main method, of class MainProg. 
     */
    public void testMain() {
        System.out.println("main testing");
        String[] args = null;
        //MainProg.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        MainProg mainProg = new MainProg();
        mainProg.main(null);
        String[] tempPrinted = outputContent.toString().split(System.getProperty("line.separator")); 
        assertEquals("ctor-A", tempPrinted[1]); 
        assertEquals("ctor-AB", tempPrinted[2]); 
        assertEquals("ctor-ABB", tempPrinted[3]); 
        assertEquals("ctor-P", tempPrinted[4]); 
        assertEquals("ctor-Q", tempPrinted[5]); 
        assertEquals("ABB", tempPrinted[6]); 
        assertEquals("Nilai Vector-1= [1]", tempPrinted[7]); 
        assertEquals("Nilai Vector-2= [2]", tempPrinted[8]); 
        assertEquals("Nilai Vector-3= [3]", tempPrinted[9]); 
        assertEquals("Nilai Vector-4= [4]", tempPrinted[10]); 
        assertEquals("Nilai Vector-5= [5]", tempPrinted[11]); 
        assertEquals("Nilai Vector-6= [6]", tempPrinted[12]); 
        assertEquals("Nilai Vector-7= [7]", tempPrinted[13]);
        assertEquals("Nilai Vector-8= [8]", tempPrinted[14]);
    }

    /**
     * Test of w method, of class MainProg. 
     */
    public void testW() {
        System.out.println("w");
        MainProg instance = new MainProg();
        int expResult = 2;
        int result = instance.w();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
