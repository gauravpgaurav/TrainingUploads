package com.training.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.domains.NewShowRoom;
import com.training.ifaces.Automobileable;

public class NewShowRmIncorrOptTest {

	NewShowRoom newShowRoom = null;
	
	
	@Before
	public void setUp() throws Exception {
		newShowRoom = new NewShowRoom();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIncorrectOption() {
		Automobileable auto = newShowRoom.getItem(5);

		// assertTrue(auto instanceof Automobile);

		assertNull(auto);
	}

}
