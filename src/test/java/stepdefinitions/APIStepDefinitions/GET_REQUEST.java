package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import pojos.LoginPojo;
import utilities.ApiUtils;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utilities.ApiUtils.generateToken;

public class GET_REQUEST {
    public static RequestSpecification spec;
    Response response;
    LoginPojo loginPojo;



    //---------------------------------------------Fatih---------------------------------------------------------------------------//
    @Given("User sets the necessary {string} {string} path param")
    public void user_sets_the_necessary_path_param(String param1, String param2) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
    }
    @Then("User sends GET request and gets response")
    public void user_sends_get_request_and_gets_response() {
        String token = generateToken();
        loginPojo = new LoginPojo("test@test.com", "123123123");

        response = given().
                headers("Authorization","Bearer "+ token).
                spec(spec).
                contentType(ContentType.JSON).
                when().
                body(loginPojo).
                get("{get1}/{get2}");
        response.prettyPrint();
    }
    @Then("User Verifies user status is {string}")
    public void user_verifies_user_status_is(String statusCode) {
        response.then().assertThat().statusCode(Integer.parseInt(statusCode));
    }
    @Then("UserF verifies the returned response body")
    public void user_f_verifies_the_returned_response_body() {
        response.then().body(
                "wallet_running_balance",Matchers.equalTo(1949.99F),
                "wallet_pending_balance",equalTo(0),
                   "total_coupon",equalTo(0),
                   "total_wishlist",equalTo(7),
                    "total_cancel_order",equalTo(2),
                     "message",equalTo("success")
        );
    }


    //---------------------------------------------------Nese------------------------------------------------------------------------------//
    @Then("UserN verifies the returned response body")
    public void usernVerifiesTheReturnedResponseBody() {
        response.then().
                body("user.id", equalTo(453),
                        "user.customer_addresses[0].id",equalTo(19),
                        "user.customer_addresses[1].city",equalTo("quisquam"),
                        "user.currency.code",equalTo("USD"),
                        "user.language.name",equalTo("English"),
                        "message",equalTo("success"));

    }
//----------------------------------------------------Bora------------------------------------------------------------------------------//
    @Then("UserB verifies the returned response body")
    public void userbVerifiesTheReturnedResponseBody() {

        response.then().body("addresses[0].id",Matchers.equalTo(19),
                "addresses[0].get_country.name",Matchers.equalTo("United States")
                ,"addresses[0].get_state.name",Matchers.equalTo("New Jersey"),
                "addresses[0].get_city.created_at",Matchers.equalTo(null),
                "addresses[1].email",Matchers.equalTo("enim@enim.com"),
                "message",Matchers.equalTo("success"));

    }
}
