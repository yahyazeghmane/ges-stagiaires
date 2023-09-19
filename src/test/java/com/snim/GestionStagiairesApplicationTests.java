package com.snim;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GestionStagiairesApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(GestionStagiairesApplicationTests.class);
	@Test
	void contextLoads() {
		//first test:
		logger.info("first test");
		Assert.assertEquals(1+1, 2);
		Assert.assertEquals(2, 2);
	}


}
