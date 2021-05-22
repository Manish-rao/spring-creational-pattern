package com.pattern;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pattern.prototype.ProtoFalse;
import com.pattern.prototype.ProtoTrue;
import com.pattern.singleton.MySingleton;
import com.pattern.singleton.TraditionalSingleton;

@SpringBootTest
class CreationalDesignPatternsApplicationTests {
	
	@Autowired
	MySingleton mySingleton1;
	
	@Autowired
	MySingleton mySingleton2;
	
	@Autowired
	ProtoTrue true1;
	
	@Autowired
	ProtoTrue true2;
	
	@Autowired
	ProtoFalse false1;
	
	@Autowired
	ProtoFalse false2;

	@Test
	void testSingletons() {
		TraditionalSingleton sing1 = TraditionalSingleton.getInstance();
		TraditionalSingleton sing2 = TraditionalSingleton.getInstance(); 
		assertNotNull(sing1);
		assertNotNull(sing2);
		assertSame(sing1, sing2);
		assertNotNull(mySingleton1);
		assertNotNull(mySingleton2);
		assertSame(mySingleton1, mySingleton2);
	}
	
	@Test
	void testPrototypes() {
		assertSame(false1, false2);
		assertNotSame(true1, true2);
	}

}
