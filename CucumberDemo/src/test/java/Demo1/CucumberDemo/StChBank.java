package Demo1.CucumberDemo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StChBank {
	
	@Given("Srinivas is done with browswer configuration")
	public void srinivas_is_done_with_browswer_configuration() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	    System.out.println("Srinivas does browser configuration");
	}

	@Then("He launches the applicattion in his favorite chrome browser")
	public void he_launches_the_applicattion_in_his_favorite_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("Srinivas launches application in chrome browser");
	}
	
	public void he_clicks_on_the_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He clicks ib the signin link ");
	}

	@Then("He enters the valid credentials")
	public void he_enters_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He enters valid credentials");
	}

	@Then("he clicks on the submit button")
	public void he_clicks_on_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He clicks on submit button");
	}

	@Given("Guest user clicks on the sign up link")
	public void guest_user_clicks_on_the_sign_up_link() {
		System.out.println("");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("clicks on the sign up link");
	}

	@When("He provides all the mandatory data")
	public void he_provides_all_the_mandatory_data() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He provides all the mandatory data");
	}

	@Then("He clicks on submit and id is generated")
	public void he_clicks_on_submit_and_id_is_generated() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He clicks on submit and id is generated");
	}

	@Given("He clicks on the forgot password link")
	public void he_clicks_on_the_forgot_password_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He clicks on submit and id is generated");
	}

	@Then("He enters the mobile number")
	public void he_enters_the_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He clicks on the forgot password link");
	}

	@Then("He receives the otp and he provides the same")
	public void he_receives_the_otp_and_he_provides_the_same() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("He receives the otp and he provides the same");
	}

}
