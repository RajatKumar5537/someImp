import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitimeProject.generic.BaseClass;

public class customerModule extends BaseClass{
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("Modify Customer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}
}

