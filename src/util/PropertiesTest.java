package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		InputStream inStream = PropertiesTest.class.getResourceAsStream("/trng/Resource.properties");
		properties.load(inStream);
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("user.password"));
		System.out.println(properties.getProperty("user.unknown"));

	}

}
