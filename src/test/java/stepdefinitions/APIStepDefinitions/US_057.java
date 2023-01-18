package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import pojos.LoginPojo;
import utilities.ApiUtils;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utilities.ApiUtils.generateToken;

public class US_057 {
    public static RequestSpecification spec;
      LoginPojo loginPojo;
    Response response;
    @Then("nese gerekli path {string} {string} {string} param ayarlarini yapar")
    public void neseGerekliPathParamAyarlariniYapar(String param1, String param2, String param3) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
    }
    @Then("Kullanici GET request islemi yapar ve response alir")
    public void kullanici_get_request_islemi_yapar_ve_response_alir() {

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
    @Then("KullaniciN statusunun {string} oldugunu dogrular")
    public void kullanicinStatusununOldugunuDogrular(String status) {
        response.then().assertThat().statusCode(Integer.parseInt(status));
    }
    @Then("Kullanici response body bilgelerini dogrular")
    public void kullanici_response_body_bilgelerini_dogrular() {
        response.then().
                body("user.id", equalTo(453),
                     "user.customer_addresses[0].id",equalTo(19),
                        "user.customer_addresses[1].city",equalTo("quisquam"),
                        "user.currency.code",equalTo("USD"),
                        "user.language.name",equalTo("English"),
                        "message",equalTo("success"));


    }



}
