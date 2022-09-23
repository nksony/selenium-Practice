package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {

	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_Amazon_page() {
		System.out.println("inside step-user on search field");
	}

	@When("I  search a product with name\"apple macbook pro\"and price {int}")
	public void i_search_a_product_with_name_apple_macbook_pro_and_price(Integer int1) {
		System.out.println("inside step-search a product");
	}

	@Then("product with name\"apple macbook pro\"should be displayed")
	public void product_with_name_apple_macbook_pro_should_be_displayed() {
	    System.err.println("inside steps-product should be displayed");

	}
	
}

