package com.stepdef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.adactin.runner.Test_Runner;
import com.base.adactin.Base_class;
import com.object.Page_obj_manager_adactin;
import com.property.reader.Adactin_Filereader_Manager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends Base_class {
	public static WebDriver driver = Test_Runner.driver;
	public static Page_obj_manager_adactin pom = new Page_obj_manager_adactin(driver);

	@Before
	private void before_Hooks(Scenario s) {
		String name = s.getName();
		
		
		System.out.println("scenario name is : " + name);

	}

	@After
	public static void after_Hooks(Scenario s) throws IOException {
		if (s.isFailed()) {
			screenshot("img.png");
		}
		Status status = s.getStatus();
		System.out.println("status: " + status);
	}

	@Given("user Launch The Application")
	public void user_launch_the_application() {
		geturl("http://adactinhotelapp.com/");
	}

	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
		pom.get_instance_hp().getUsername();
		sendkeys(pom.get_instance_hp().getUsername(), username);

	}

	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String password) {
		pom.get_instance_hp().getPassword();
		sendkeys(pom.get_instance_hp().getPassword(), password);
	}

	@Then("user Clicks In The Login Button And Navigates To The Search Hotel Page")
	public void user_clicks_in_the_login_button_and_navigates_to_the_search_hotel_page() {
		pom.get_instance_hp().getLogin();
		click(pom.get_instance_hp().getLogin());
	}

	@When("user Select The {string}")
	public void user_select_the(String location) {
		pom.get_Instance_search().getLocation();
		dropdown("ByValue", pom.get_Instance_search().getLocation(), location);

	}

	@When("user Select The Hotels")
	public void user_select_the_hotels() {
		pom.get_Instance_search().getHotel();
		dropdown("ByValue", pom.get_Instance_search().getHotel(), "Hotel Sunshine");
	}

	@When("user Select The Room Type")
	public void user_select_the_room_type() {
		pom.get_Instance_search().getRoom_type();
		dropdown("byindex", pom.get_Instance_search().getRoom_type(), "4");
	}

	@When("user Select The Number Of Rooms")
	public void user_select_the_number_of_rooms() {
		pom.get_Instance_search().getRoom_no();
		dropdown("byindex", pom.get_Instance_search().getRoom_no(), "1");
	}

	@When("user Enter Check In Date In Check In Date Field")
	public void user_enter_check_in_date_in_check_in_date_field() throws IOException {
		pom.get_Instance_search().getCheckin();
		clear(pom.get_Instance_search().getCheckin());
		String checkin = Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_checkin();
		sendkeys(pom.get_Instance_search().getCheckin(), checkin);

	}

	@When("user Enter Check Out Date In Check Out Date Field")
	public void user_enter_check_out_date_in_check_out_date_field() throws IOException {
		pom.get_Instance_search().getCheckout();
		clear(pom.get_Instance_search().getCheckout());
		String checkout = Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_checkout();
		sendkeys(pom.get_Instance_search().getCheckout(), checkout);

	}

	@When("user Select Adults Per Room")
	public void user_select_adults_per_room() {

	}

	@Then("user Clicks Search Button And Navigates To The Select Hotel Page")
	public void user_clicks_search_button_and_navigates_to_the_select_hotel_page() {
		pom.get_Instance_search().getSubmit();
		click(pom.get_Instance_search().getSubmit());
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {
		pom.get_Instance_selpg().getRadio_btn();
		click(pom.get_Instance_selpg().getRadio_btn());
	}

	@Then("user Clicks Continue Button And Navigates To Book A Hotel Page")
	public void user_clicks_continue_button_and_navigates_to_book_a_hotel_page() {
		pom.get_Instance_selpg().getCont();
		click(pom.get_Instance_selpg().getCont());
	}

	@When("user Enter First Name In First Name Field")
	public void user_enter_first_name_in_first_name_field() throws IOException {
		pom.get_Instance_bk().getFirst_name();
		String first_name = Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_firstname();
		sendkeys(pom.get_Instance_bk().getFirst_name(), first_name);

	}

	@When("user Enter Last Name In Last Name Field")
	public void user_enter_last_name_in_last_name_field() throws IOException {
		pom.get_Instance_bk().getLast_name();
		String last_name = Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_lastname();
		sendkeys(pom.get_Instance_bk().getLast_name(), last_name);

	}

	@When("user Enter Address In Billing Address Field")
	public void user_enter_address_in_billing_address_field() throws IOException {
		pom.get_Instance_bk().getAddress();
		// sendkeys(pomad.get_Instance_bk().getAddress(),particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test
		// case.xlsx", 24, 5));
		String address = Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_address();
		sendkeys(pom.get_Instance_bk().getAddress(), address);
	}

	@When("user Enter Credit Card Number In Credit Card Field")
	public void user_enter_credit_card_number_in_credit_card_field() throws IOException {
		pom.get_Instance_bk().getCredit_card();
		// sendkeys(pomad.get_Instance_bk().getCredit_card(),
		// particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test
		// case.xlsx", 25, 5));
		String credit_card = Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR()
				.get_Instance_creditcard();
		sendkeys(pom.get_Instance_bk().getCredit_card(), credit_card);
	}

	@When("user Select Credi Card Type")
	public void user_select_credi_card_type() {
		pom.get_Instance_bk().getCard_type();
		dropdown("byvalue", pom.get_Instance_bk().getCard_type(), "VISA");
	}

	@When("user Select Expiry Date")
	public void user_select_expiry_date() {
		pom.get_Instance_bk().getEx_month();
		dropdown("byindex", pom.get_Instance_bk().getEx_month(), "6");
		pom.get_Instance_bk().getEx_yr();
		dropdown("byvalue", pom.get_Instance_bk().getEx_yr(), "2022");
	}

	@When("user Enter Cvv Number In Cvv Field")
	public void user_enter_cvv_number_in_cvv_field() throws IOException {
		pom.get_Instance_bk().getCvv();
		// sendkeys(pomad.get_Instance_bk().getCvv(),particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test
		// case.xlsx", 28, 5));
		String cvv = Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_cvv();
		sendkeys(pom.get_Instance_bk().getCvv(), cvv);
	}

	@Then("user Clicks Book Now Button And Navigates To Hotel Booking Page")
	public void user_clicks_book_now_button_and_navigates_to_hotel_booking_page() {
		pom.get_Instance_bk().getBook();
		click(pom.get_Instance_bk().getBook());
	}

	@When("user Clicks Logout Button And Navigates To Logout Page")
	public void user_clicks_logout_button_and_navigates_to_logout_page() {
		pom.get_Instance_it().getLogout();
		click(pom.get_Instance_it().getLogout());

	}

}
