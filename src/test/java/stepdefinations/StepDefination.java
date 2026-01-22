package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

		@Given("user is on facebook register page")
		public void user_is_on_facebook_register_page() { System.out.println("User is on facebook register page.");
		}

		@When("user enter {string} and {string}")
		public void user_enter_and(String firstname, String lastname) {
			System.out.println("user firstname" +firstname +" ,user lastname"+lastname);
		}

		@When("user enter valid {int} and {string}")
		public void user_enter_valid_and(Integer mobile, String email) {
			System.out.println("user's mobile number: "+mobile+" ,users mail id: "+email);
		}

		@When("user enter {int} and {string} and {int}")
		public void user_enter_and_and(Integer date, String month, Integer year) {
			System.out.println("user's birth date: "+date+" ,users birth month: "+month+" ,users birth year: "+year);
		}

		@Then("user click on Register button")
		public void user_click_on_register_button() {
			System.out.println("user clicks on register button.");
		}
}
