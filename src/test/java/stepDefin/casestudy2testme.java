package stepDefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy2testme {
	WebDriver driver;
	@When("launches chrome and login testme")
	public void launches_chrome_and_login_testme() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
	    System.out.println("open chrome");
	    driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enter the {string} in us field")
	public void user_enter_the_in_us_field(String us) {
		driver.findElement(By.name("userName")).sendKeys(us);
	    System.out.println("username");  
	}

	@When("user enter the {string} in pwd field")
	public void user_enter_the_in_pwd_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	    System.out.println("password");

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    System.out.println("login button");
	}

	@Then("validates login is passed")
	public void validates_login_is_passed() {
		
		Assert.assertEquals( "home",driver.getTitle());
	    System.out.println("user login successfully");
	}


}
