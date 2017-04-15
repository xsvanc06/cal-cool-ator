/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal.cool.ator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marek
 */
public class CalCoolAtorTest {
    
    
    private CalCoolAtor testClass;
    public CalCoolAtorTest() {
    }
    
    /*  /**
    *
    */
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    testClass = new CalCoolAtor();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method
     */
    @Test
    public void testAdd() {
        double x1 = 0.0;
        double x2 = 0.0;
        double expResult = 0.0;
        assertEquals(expResult, testClass.add(x1, x2), 0.000001);
        x1 = 1.2;
        x2 = 0.1;
        expResult = 1.3;
        assertEquals(expResult, testClass.add(x1, x2), 0.000001);
        x1 = 8.2;
        x2 = -9.1;
        expResult = -0.9;
        assertEquals(expResult, testClass.add(x1, x2), 0.000001);
        x1 = 1212128.924233;
        x2 = 5453439.12566;
        expResult = 6665568.049893;
        assertEquals(expResult, testClass.add(x1, x2), 0.000001);
    }

    /**
     * Test of factorial method
     */
    @Test
    public void testFactorial() {
        int x1 = 0;
        long expResult = 1;
        assertEquals(expResult, testClass.factorial(x1));
        x1 = 1;
        expResult = 1;
        assertEquals(expResult, testClass.factorial(x1));
        x1 = 8;
        expResult = 40320;
        assertEquals(expResult, testClass.factorial(x1));
    }
    
    /**
     * Test of factorial method with negative base
     */
    @Test(expected=IllegalArgumentException.class)
    public void testFactorialIllegal() {
        int x1 = -5;
        long expResult = 1;
        assertEquals(expResult, testClass.factorial(x1));
    }

    /**
     * Test of sub method
     */
    @Test
    public void testSub() {
        double x1 = 0.0;
        double x2 = 0.1;
        double expResult = -0.1;
        assertEquals(expResult, testClass.sub(x1, x2), 0.000001);
        x1 = 0.0;
        x2 = -0.5;
        expResult = 0.5;
        assertEquals(expResult, testClass.sub(x1, x2), 0.000001);
        x1 = 421354.567643;
        x2 = 4643432.500001;
        expResult = -4222077.932358;
        assertEquals(expResult, testClass.sub(x1, x2), 0.000001);
    }

    /**
     * Test of multiply method
     */
    @Test
    public void testMultiply() {
        double x1 = 0.0;
        double x2 = 0.0;
        double expResult = 0.0;
        assertEquals(expResult, testClass.multiply(x1, x2), 0.000001);
        x1 = 2.5;
        x2 = -2.5;
        expResult = -6.25;
        assertEquals(expResult, testClass.multiply(x1, x2), 0.000001);
        x1 = 111112.5;
        x2 = 54542.564139;
        expResult = 6060360657.8946375;
        assertEquals(expResult, testClass.multiply(x1, x2), 0.000001);
    }

    /**
     * Test of divide method
     */
    @Test
    public void testDivide() {
        double x1 = 0.0;
        double x2 = 1.0;
        double expResult = 0.0;
        assertEquals(expResult, testClass.divide(x1, x2), 0.000001);
        x1 = 4.20;
        x2 = 21.0;
        expResult = 0.2;
        assertEquals(expResult, testClass.divide(x1, x2), 0.000001);
        x1 = 432413.91213;
        x2 = -7342.5232;
        expResult = -58.89173249462;
        assertEquals(expResult, testClass.divide(x1, x2), 0.000001);
    }
    
    /**
     * Test of division by 0
     */
    @Test(expected=IllegalArgumentException.class)
    public void testDivideIllegal() {
        double x1 = 12345.0;
        double x2 = 0.0;
        double expResult = 0.0;
        assertEquals(expResult, testClass.divide(x1,x2), 0.0000001);
    }
    
    /**
     * Test of square root method
     */
    @Test
    public void testRoot() {
        double x1 = 0.0;
        double expResult = 0.0;
        assertEquals(expResult, testClass.root(x1), 0.000001);
        x1 = 9.0;
        expResult = 3.0;
        assertEquals(expResult, testClass.root(x1), 0.000001);
    }
    
    
    /**
     * Test of square root method with negative base
     */
    @Test(expected=IllegalArgumentException.class)
    public void testRootIllegal() {
        double x1 = -4.0;
        double expResult = 0;
        assertEquals(expResult, testClass.root(x1), 0.0000001);
        x1 = -3.2;
        expResult = 0;
        assertEquals(expResult, testClass.root(x1), 0.0000001);
    }
    

    /**
     * Test of power method
     */
    @Test
    public void testPower() {
        double x1 = 9.0;
        int y1 = 2;
        double expResult = 81.0;
        assertEquals(expResult, testClass.power(x1, y1), 0.0000001);
        x1 = 4.5;
        y1 = 4;
        expResult = 410.0625;
        assertEquals(expResult, testClass.power(x1, y1), 0.0000001);
    }

    /**
     * Test of neg method
     */
    @Test
    public void testNeg() {
        double x1 = 4.0;
        double expResult = -4.0;
        assertEquals(expResult, testClass.neg(x1), 0.0);
        x1 = 345232131.0;
        expResult = -345232131.0;
        assertEquals(expResult, testClass.neg(x1), 0.0); 
        x1 = 0.0;
        expResult = 0.0;
        assertEquals(expResult, testClass.neg(x1), 0.0); 
    }
    
}
