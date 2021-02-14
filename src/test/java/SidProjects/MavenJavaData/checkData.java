package SidProjects.MavenJavaData;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class checkData { 

	@AfterTest
	public void maveDats() {
		System.out.println("This is before dat Mav dddddddddddddd");
	}
	
	@Test
	public void mavenDats() {
		System.out.println("This is before datddddd Mav ");
	}
	
}
