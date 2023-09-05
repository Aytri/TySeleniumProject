package practiceMaven;

import org.testng.annotations.Test;

public class LoginMOrg {
	

	@Test(groups = "regression")
	public void loginOrg() {
		System.out.println("---DEF=Login Org");
	}
	@Test(groups = "smoke")
	public void loginOrgTwo() {
		System.out.println("---DEF=Login Org Two");
	}

}
