package practiceMaven;

import org.testng.annotations.Test;

public class CreateMOrg {

	@Test(groups = "smoke")
	public void createOrg() {
		System.out.println("---ABC=create Org");
	}
	
	@Test(groups = "regression")
	public void createOrgTwo() {
		System.out.println("---ABC2=create Org Two");
	}



}
