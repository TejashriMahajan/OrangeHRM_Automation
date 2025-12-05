package applicationjournies;

import org.testng.annotations.Test;

import CommonUtils.Commonmeths;
import loginRepo.LoginRepo;
import loginRepo.OrangeAddEmpRepo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AddEmployee {
	WebDriver driver;
	Commonmeths cm;
	LoginRepo lr;
	OrangeAddEmpRepo hrm;
	
  @Test(dataProvider = "dp")
  public void f(String uname, String pass,String fname,String Midname,String lname,String code,String usern,String pwrd,String cpwrd ) throws InterruptedException {
	  //Login
	  lr.username().sendKeys(uname);
	  lr.password().sendKeys(pass);
	  lr.submitButton().click();
	  System.out.println("Logged in sucessfully");
	  Thread.sleep(2000);
	  
	  //Add Employee
	  hrm.PIM().click();
	  Thread.sleep(2000);	  hrm.AddEmployee().click();
	  hrm.firstname().sendKeys(fname);
	  hrm.middlename().sendKeys(Midname);
	  hrm.Lastname().sendKeys(lname);
	  
	  hrm.EmpCode().clear();
	  hrm.EmpCode().sendKeys(code);
	  Thread.sleep(2000);
	  hrm.enabledRadio().click();
	  Thread.sleep(2000);
	  System.out.println("Employee added with Enabled login details");
	  
	  hrm.uname().sendKeys(usern);
	  hrm.pwrd().sendKeys(pwrd);
	  hrm.cpwrd().sendKeys(cpwrd);
	  hrm.savebtn().click();
	  System.out.println("Employee added succesfully");
	  
	  
  }
  
 // @Test(dataProvider = "dp")
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  cm.launchApplication();
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Admin","admin123","Jemmi","P","xyz","0378","Harsh21","H@r#2131","H@r#2131"},
     // new Object[] { ,  },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  cm = new Commonmeths();
	  driver = cm.launchbrowserChrome();
	  lr=new LoginRepo(driver);
	  hrm=new OrangeAddEmpRepo(driver);
  }

  @AfterClass
  public void afterClass() {
	  cm.doLogout();
  }

}

//[RemoteTestNG] detected TestNG version 7.11.0

//Logged in sucessfully
//Employee added with Enabled login details
//Employee added succesfully
//PASSED: applicationjournies.AddEmployee.f("Admin", "admin123", "Jemmi", "P", "xyz", "0378", "Harsh21", "H@r#2131", "H@r#2131")
//
//===============================================
//    Default test
//    Tests run: 1, Failures: 0, Skips: 0
//===============================================
//
//
//===============================================
//Default suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
//
//
