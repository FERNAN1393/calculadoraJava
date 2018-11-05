package TestUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.hcl.javaSeBasic.training.operations.Addition;


public class AdditionTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	private Addition operation;

    

	@Before
	public void setUpStreams() {
		operation = new Addition();
		System.setOut(new PrintStream(outContent));

	}

	@Test
	public void testAddition() {
		double num1 = 5;
		double num2 = 3;
		operation.performOperation(num1, num2);
		String expected = "The resoult by adding " + num1 + " + " + num2 + " = " + (num1 + num2) + "\r\n";
		assertEquals(expected, outContent.toString());

	}

	

	@Test
	public void AddingBy0() {
		double num1 = 12;
		double num2 = 0;
		operation.performOperation(num1, num2);
		String expected = "The resoult by adding " + num1 + " + " + num2 + " = " + (num1 + num2) + "\r\n";
		assertEquals(expected, outContent.toString());

	}

	

	@Test
	public void AddingByDecimals() {
		double num1 = 12.12121212121121;
		double num2 = 4.1151621216261261212;
		operation.performOperation(num1, num2);
		String expected = "The resoult by adding " + num1 + " + " + num2 + " = " + (num1 + num2) + "\r\n";
		assertEquals(expected, outContent.toString());

	}

	

	@Test
	public void AddingByNegativeNumber() {

		double num1 = -12.12;

		double num2 = 4.11;
		operation.performOperation(num1, num2);
		String expected = "The resoult by adding " + num1 + " + " + num2 + " = " + (num1 + num2) + "\r\n";
		assertEquals(expected, outContent.toString());

	}

	



}
