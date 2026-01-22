package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

		@Given("user is on facebook register page")
		public void user_is_on_facebook_register_page() { System.out.println("Register page.");
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
		
		@Given("employee is on address page")
		public void employee_is_on_address_page() { System.out.println("Address page");
		}

		@When("employee write {string} and {string}")
		public void employee_write_and(String firstname, String lastname) {System.out.println("emp firstname: "+firstname+" ,emp lastname: "+lastname);
		}

		@When("employee write valid {int} and {string}")
		public void employee_write_valid_and(Integer mobile, String email) {System.out.println("emp mobile: "+mobile+" ,emp email: "+email);
		}

		@When("employee write {int} and {string} and {int}")
		public void employee_write_and_and(Integer date, String month, Integer year) {System.out.println("emp Bday date: "+date+" ,emp bday month: "+month+", emp bday year: "+year);
		}

		@When("employee write city name {string}")
		public void employee_write_city_name(String city) {System.out.println("emp city name: "+city);
		}

		@When("employee write state name {string}")
		public void employee_write_state_name(String state) {System.out.println("emp state name: "+state);
		}

		@When("employee write {int}")
		public void employee_write(Integer pincode) {System.out.println("emp pincode: "+pincode);
		}

		@Then("employee click on mail button")
		public void employee_click_on_mail_button() {System.out.println("emp click on mail button.");
		}
		
		@Given("staff is on login page")
		public void staff_is_on_login_page() {  System.out.println("Login page.");
		}

		@When("staff enter the username and password")
		public void staff_enter_the_username_and_password() {System.out.println("staff enter username and password");
		}

		@When("staff click on login button")
		public void staff_click_on_login_button() {System.out.println("Staff click on login button");
		}

		@Then("staff is on home page")
		public void staff_is_on_home_page() {System.out.println("Staff is on Home page.");
		}
}
