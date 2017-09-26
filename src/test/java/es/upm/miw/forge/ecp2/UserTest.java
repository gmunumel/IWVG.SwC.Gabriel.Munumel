package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User usr;
	
	@Before
	public void before() {
		this.usr = new User(5,"Perico", "delgado");
	}
	
		
	@Test
	public void testUserNameToUpperCase() {
		assertEquals("PERICO", this.usr.userNameToUpperCase());
	}

}
