package com.training.testing;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.domains.*;
import com.training.ifaces.*;

@RunWith(Parameterized.class)
public class NewShowRoomTest {

	NewShowRoom newShowRoom = null;
	private int key;
	private Class cls;

	public NewShowRoomTest(int key, Class cls) {
		super();
		this.key = key;
		this.cls = cls;
	}

	@Before
	public void setUp() throws Exception {
		newShowRoom = new NewShowRoom();
	}

	@Test
	public void test() {

		Automobileable auto = newShowRoom.getItem(key);

		// assertTrue(auto instanceof Automobile);

		assertEquals(cls, auto.getClass());

	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, PassengerCar.class }, { 2, LuxuryCar.class }, { 3, SportsCar.class },
				{ 4, SportsBike.class } };
		return Arrays.asList(data);
	}

}
