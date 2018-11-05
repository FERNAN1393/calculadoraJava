/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUnit;

import com.hcl.javaSeBasic.training.operations.RecursiveFactorial;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.IsNot.not;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import static org.junit.matchers.JUnitMatchers.containsString;
import org.junit.runner.RunWith;

/**
 *
 * @author FRK
 */

public class BadTest {
    
    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public BadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("We are going to start, so please take a sit.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Questions?, no. perfect. Thank you!");
    }
    
    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }
 
    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }
    
    @Category(BadTest.class)
    @Test
    public void testNegativeFactorial() {
         RecursiveFactorial facto = new RecursiveFactorial( -110);
         facto.getFactorial();    
         String outputExpeected = "Factorial Encontrado<< "+ -110 +" >>";
         assertThat(outContent.toString() ,containsString(outputExpeected));
         
    }  
    // public void hello() {}
}
