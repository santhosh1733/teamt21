package TestNGTest;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test
public void createorg() {
	System.out.println("create organization");
	System.out.println(System.getProperty("url"));
	System.out.println(System.getProperty("browser"));
	System.out.println(System.getProperty("username"));
	System.out.println(System.getProperty("password"));
}
}
