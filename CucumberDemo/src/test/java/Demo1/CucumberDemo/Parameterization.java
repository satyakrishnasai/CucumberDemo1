package Demo1.CucumberDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Parameterization {

WebDriver driver;

@Given("I am launching the test me application in chrome")
public void i_am_launching_the_test_me_application_in_chrome() {
   // Write code here that turns the phrase above into concrete actions
//	   throw new cucumber.api.PendingException();
 System.out.println("code for launch");
 System.setProperty("webdriver.chrome.driver","C:\\data\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("http://10.232.237.143:443/TestMeApp");
 driver.manage().window().maximize();

}

@Given("I click on SignIn Link")
public void i_click_on_SignIn_Link() {
   // Write code here that turns the phrase above into concrete actions
//	   throw new cucumber.api.PendingException();
System.out.println("code for SignIn");
driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();

}

@When("I provide username {string}")
public void i_provide_username(String string) {
   // Write code here that turns the phrase above into concrete actions
//	   throw new cucumber.api.PendingException();
System.out.println("Username is: "+string);
driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);

}

@When("I provide password {string}")
public void i_provide_password(String string) {
   // Write code here that turns the phrase above into concrete actions
//	   throw new cucumber.api.PendingException();
System.out.println("Password is: "+string);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
}

@Then("I click on login and verify the login status")
public void i_click_on_login_and_verify_the_login_status() {
   // Write code here that turns the phrase above into concrete actions
//	   throw new cucumber.api.PendingException();
System.out.println("code for login and verify");
driver.findElement(By.xpath("//input[@name='Login']")).click();
String LoginVal = driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).getText();
Assert.assertEquals("SignOut",LoginVal);
}

}