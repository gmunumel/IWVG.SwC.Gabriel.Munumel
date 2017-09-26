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
	
	@Test
	public void testGetNumber() {
		assertEquals(5, this.usr.getNumber());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Perico", this.usr.getName());
	}
	
	@Test
	public void testGetFamilyName() {
		assertEquals("Delgado", this.usr.getFamilyName());
	}
	
	@Test
	public void testFullName() {
		assertEquals("Perico Delgado", this.usr.fullName());
	}
	
	@Test
	public void testInitials() {
		assertEquals("P.", this.usr.initials());
	}

}
