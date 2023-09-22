
package com.infinite.security;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Testsecurity {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		final Logger logger = Logger.getLogger(Testsecurity.class);

		PropertyConfigurator.configure("log4j.properties");

		final String secretKey = "bcd1243$";

		String originalString = "mysql@123";

		String encryptedString = Javasecurity.encrypt(originalString, secretKey);

		String decryptedString = Javasecurity.decrypt(encryptedString, secretKey);

		logger.info(originalString);

		logger.info(encryptedString);

		logger.info(decryptedString);

	}

}
