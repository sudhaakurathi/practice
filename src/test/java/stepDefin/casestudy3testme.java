package stepDefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;
import junit.framework.Assert;

public class casestudy3testme {

	WebDriver driver;
	@When("launches chrome and sign in for testme")
	public void launches_chrome_and_sign_in_for_testme() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
	    System.out.println("open chrome");
	    driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters {string} in us field")
	public void user_enters_in_us_field(String us) {
		driver.findElement(By.name("userName")).sendKeys(us);
	    System.out.println("username"); 
	}

	@When("user enters {string} in pwd field")
	public void user_enters_in_pwd_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	    System.out.println("password");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    System.out.println("login button");
	}

	@When("user type product to find in search")
	public void user_type_product_to_find_in_search() {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("HeadPhone");
		
	}

	@When("user click to search link")
	public void user_click_to_search_link() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	     
	}

	@When("Validates products")
	public void validates_products() {
	    Assert.assertEquals("Search", driver.getTitle());
	}


	
	
}
