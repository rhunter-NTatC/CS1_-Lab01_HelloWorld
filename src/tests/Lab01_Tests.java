package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import labs.Lab01;

class Lab01_Tests {

	
	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	void test() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		
		Lab01.main(null);
		
		try {
			assertTrue(inOut.getOutputStream().equals("Hello World!"));
		}
		catch (AssertionError e) {
			
			inOut.resetSystem();
			
			System.out.println("Error: Failed to print \"Hello World!\" to the console.");
			
			fail();
			
		}
		
		inOut.resetSystem();
		
	}

}
