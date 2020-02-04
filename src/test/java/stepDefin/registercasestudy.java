package stepDefin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registercasestudy {
	WebDriver driver;
	@When("launches Chrome and registration page")
	public void launches_Chrome_and_registration_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		System.out.println("open chrome");
		driver=new ChromeDriver();
	}

	@When("user enters Username as {string} in us field")
	public void user_enters_Username_as_in_us_field(String us) {
		System.out.println("enter the userName " +us);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	    driver.findElement(By.name("userName")).sendKeys(us);
	    
	}

	@When("user enters Firstname as {string} in fn field")
	public void user_enters_Firstname_as_in_fn_field(String fn) {
		System.out.println("enters the first name " +fn);
	    driver.findElement(By.name("firstName")).sendKeys(fn);
	    
	}

	@When("user enters Lastname as {string} in la field")
	public void user_enters_Lastname_as_in_la_field(String la) {
		System.out.println("enters the last name " +la);
		driver.findElement(By.name("lastName")).sendKeys(la);
	}

	@When("user enters Password as {string} in password field")
	public void user_enters_Password_as_in_password_field(String pwd) {
		System.out.println("enter the password " +pwd);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("user enters Confirmpassword as {string} in confirmpassword field")
	public void user_enters_Confirmpassword_as_in_confirmpassword_field(String conpwd) {
		System.out.println("reenters the confirm password" +conpwd);
	    driver.findElement(By.name("confirmPassword")).sendKeys(conpwd); 
	}

	@When("user selects Gender as {string} in gender")
	public void user_selects_Gender_as_in_gender(String ge) {
		System.out.println("select the gender " +ge);
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click(); 
	}

	@When("user enters emailid as {string} in email field")
	public void user_enters_emailid_as_in_email_field(String email) {
		System.out.println("enter the email address " +email);
	    driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enters mobileno {string} in mobilenumber field")
	public void user_enters_mobileno_in_mobilenumber_field(String mob) {
		System.out.println("enter the mobile " +mob);
	    driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(mob);
	    
	}

	@When("user enters dateofbirth {string} in dateofbirth field")
	public void user_enters_dateofbirth_in_dateofbirth_field(String dob) {
		System.out.println("enter the date of birth " +dob);
	    driver.findElement(By.name("dob")).sendKeys(dob);
	    
	}

	@When("user enters Address {string} in address field")
	public void user_enters_Address_in_address_field(String add) {
		System.out.println("enter the address " +add);
		driver.findElement(By.name("address")).sendKeys(add);
	    
	}

	@When("user selects Security question {string} in security question field")
	public void user_selects_Security_question_in_security_question_field(String secur) {
		System.out.println("selects the security question " +secur);
	    driver.findElement(By.name("securityQuestion")).sendKeys(secur);
	}

	@When("user selects Answer for security question {string} in answer field")
	public void user_selects_Answer_for_security_question_in_answer_field(String ans) {
	    System.out.println("answer the security question " +ans);
	    driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@When("Click on Register Button")
	public void click_on_Register_Button() {
		System.out.println("click register button");  
		 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click(); 
	}

	@Then("validates Registration is passed")
	public void validates_Registration_is_passed() {
		Assert.assertEquals( "home",driver.getTitle());
	    System.out.println("registered successfully");
	}


	
	
	
	
	
}
