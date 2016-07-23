package co.grandcircus.david.pics.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordEncryptionService {

	public String encryptPassword(String plaintextPassword) {
		StringBuilder sb = new StringBuilder(plaintextPassword.length());
		for (int i = plaintextPassword.length() - 1; i >= 0; i--) {
			sb.append(plaintextPassword.charAt(i));
		}
		return sb.toString();
	}
}
