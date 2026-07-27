package com.cognizant.loan;

import com.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LoanApplicationTests {

//	@Test
//	void contextLoads() {
//	}
@Test
public void testAdd() {

	Calculator c = new Calculator();

	assertEquals(15, c.add(10, 5));
	assertTrue(c.add(2, 3) > 4);
	assertFalse(c.add(1, 1) == 3);
	assertNotNull(c);
}
}
