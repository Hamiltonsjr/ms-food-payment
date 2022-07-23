package br.com.food.server;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentApplicationTests {

	@Test
	void contextLoads() {
		final String txt = "Teste";
		Assertions.assertEquals("Teste",txt);
	}

}
