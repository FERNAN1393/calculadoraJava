package TestUnit;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.hcl.javaSeBasic.training.operations.Divition;

public class DivitionTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private Divition operation;
    
	@Before
	public void setUpStreams() {
		operation = new Divition();

		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testDivition() {
		double num1 = 5;
		double num2 = 3;
		operation.performOperation(num1, num2);
		String expected = "The resoult by dividing " + num1 + " / " + num2 + " = " + (num1 / num2) + "\r\n";
		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void DivideByDecimals() {
		double num1 = 12.12;
		double num2 = 4.11;

		operation.performOperation(num1, num2);

		String expected = "The resoult by dividing " + num1 + " / " + num2 + " = " + (num1 / num2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	@Test
	public void DivideBy0() {
		double num1 = 12;
		double num2 = 0;

		operation.performOperation(num1, num2);

		String expected = "The resoult by dividing " + num1 + " / " + num2 + " = " + (num1 / num2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void DivideByNegativeNumber() {
		double num1 = -12.12;
		double num2 = 4.11;

		operation.performOperation(num1, num2);

		String expected = "The resoult by dividing " + num1 + " / " + num2 + " = " + (num1 / num2) + "\r\n";

		assertEquals(expected, outContent.toString());
	}
	
	
	
	
	
}
