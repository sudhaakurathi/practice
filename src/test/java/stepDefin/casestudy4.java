package stepDefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy4 {
WebDriver driver;
	@Given("user has registered in to TestMeApp")
	public void user_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
	    System.out.println("open chrome");
	    driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   driver.findElement(By.name("userName")).sendKeys("akurathi");
	   driver.findElement(By.name("password")).sendKeys("sudha123");
	    System.out.println("password");
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    System.out.println("login button");
	    System.out.println("user login successfully");
	}

	@When("user search a particular product like headphones")
	public void user_search_a_particular_product_like_headphones() {
	    driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("head");
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("try to proceed to payment without adding anyitem in the cart")
	public void try_to_proceed_to_payment_without_adding_anyitem_in_the_cart() {
	    String cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText();
	    Assert.assertFalse(cart, false);
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
		System.out.println("testme app has no products");
	    
	}


}
