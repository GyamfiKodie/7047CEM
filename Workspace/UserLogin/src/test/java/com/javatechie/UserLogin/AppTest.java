package com.javatechie.UserLogin;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	App app = new App();
	
	@Test
	public void isNotUserAdmin() {
		assertFalse(app.processRequest("null",1));
	}
	
	@Test
	public void isUserAdminDelete() {
		assertTrue(app.processRequest("DELETE",1));
	}
	
	@Test
	public void isUserAdminCancel() {
		assertTrue(app.processRequest("CREATE",1));
	}
	
	@Test
	public void isNotUserAdminLogin() {
		assertFalse(app.processRequest("null",0));
	}
	
	@Test
	public void isUserAdminDeleteLogin() {
		assertFalse(app.processRequest("DELETE",0));
	}
	
	@Test
	public void isUserAdminCreateLogin() {
		assertFalse(app.processRequest("CREATE",0));
	}
	
	@Test
	public void isUserAdminCreateRequest() {
		assertFalse(app.processRequest("",0));
	}
}
