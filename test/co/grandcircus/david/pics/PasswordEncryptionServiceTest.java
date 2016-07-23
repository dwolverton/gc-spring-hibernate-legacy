package co.grandcircus.david.pics;

import static org.junit.Assert.*;

import org.junit.Test;

import co.grandcircus.david.pics.service.PasswordEncryptionService;

public class PasswordEncryptionServiceTest {

	private PasswordEncryptionService service = new PasswordEncryptionService();
	
	@Test
	public void itEncryptsAPassword() {
		assertEquals("divaD", service.encryptPassword("David"));
	}
}
