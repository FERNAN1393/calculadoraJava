package TestUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.hcl.javaSeBasic.training.operations.RecursiveFactorial;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.core.IsNot.not;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * * @author FRK
 */
@RunWith(Parameterized.class)
public class RecursiveFactorialTest {
   
    private int fInput;    
    private int fExpected;
    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
 
    
    public RecursiveFactorialTest(int input, int expected) {
        this.fInput = input;
        this.fExpected = expected;    
    }
    
    @Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][] {     
                 { 1,1 }, { 2,2 }, { 3, 6 }, { 4, 24 }, { 5, 120 }, { 0, 0}  
           });
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
    
    
    @Test
    public void testFactorial(){
        RecursiveFactorial facto = new RecursiveFactorial(this.fInput);
        facto.getFactorial();    
        String outputExpeected = "Factorial Encontrado<< "+ fExpected +" >>";
        assertThat(outContent.toString() ,containsString(outputExpeected));
        //"Factorial Encontrado<< "+ factorial +" >>"
    }
               
}
