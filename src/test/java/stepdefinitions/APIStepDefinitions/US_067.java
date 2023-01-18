package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import pojos.LoginPojo;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtils.generateToken;

public class US_067 {
    public static RequestSpecification spec;
    LoginPojo loginPojo;
    Response response;
    @Given("Bora gerekli path {string} {string} {string} param ayarlarini yapar")
    public void bora_gerekli_path_param_ayarlarini_yapar(String api, String profile, String addressList) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(api),"get2",ConfigReader.getProperty(profile));
    }
    @Then("KullaniciB GET request islemi yapar ve response alir")
    public void kullanici_b_get_request_islemi_yapar_ve_response_alir() {
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
    @Then("KullaniciB statusunun {string} oldugunu dogrular")
    public void kullanici_b_statusunun_oldugunu_dogrular(String status) {
        response.then().assertThat().statusCode(Integer.parseInt(status));
    }
    @Then("KullaniciB Kullanici response body bilgelerini dogrular")
    public void kullanici_b_kullanici_response_body_bilgelerini_dogrular() {

        response.then().body("addresses[0].id",Matchers.equalTo(19),
                "addresses[0].get_country.name",Matchers.equalTo("United States")
                        ,"addresses[0].get_state.name",Matchers.equalTo("New Jersey"),
                         "addresses[0].get_city.created_at",Matchers.equalTo(null),
                         "addresses[1].email",Matchers.equalTo("enim@enim.com"),
                         "message",Matchers.equalTo("success"));

    }
}
