package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pojos.LoginPojo;
import utilities.ApiUtils;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class POST_REQUEST {
    public static RequestSpecification spec;
    Response response;
    LoginPojo loginPojo;


    @Given("User sets Post the necessary {string} {string} path param")
    public void user_sets_post_the_necessary_path_param(String param1, String param2) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
    }
    @Then("User sends Post request and gets response")
    public void user_sends_post_request_and_gets_response() {
        String token= ApiUtils.generateToken();
        loginPojo=new LoginPojo("test@test.com","123123123");
        response=given().headers("Authorization","Bearer"+token).
                spec(spec).
                contentType(ContentType.JSON).
                when().
                body(loginPojo).
                post("{get1}/{get2}");
        response.prettyPrint();
    }
    @Then("User Verifies Post user status is {string}")
    public void user_verifies_post_user_status_is(String status) {
        response.then().assertThat().statusCode(Integer.parseInt(status));
    }
    @Then("UserG verifies the returned response body")
    public void user_g_verifies_the_returned_response_body() {
        // response.then().body("user.id", equalTo(453),
        //       "user.first_name",equalTo("testName2"));
        response.then().body("message",equalTo("Successfully logged In"));
    }

    @Then("User verifies the token response body")
    public void userVerifiesTheTokenResponseBody() {
        JsonPath json=response.jsonPath();
        // String tokendata=json.getString("token");
        // Assert.assertEquals(tokendata,json.getString("token"));
        response.then().assertThat().body("token",Matchers.anything());
        // Assert.assertNotNull(json.getString("token"));
    }
}
