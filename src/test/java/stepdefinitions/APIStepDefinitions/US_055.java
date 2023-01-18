package stepdefinitions.APIStepDefinitions;

import com.google.protobuf.Api;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pojos.LoginPojo;
import utilities.ApiUtils;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US_055 {
    public static RequestSpecification spec;
    Response response;
    LoginPojo loginPojo;



///api/login
      @Then("Kullanici gerekli path {string} {string} {string} param ayarlarini yapar")
      public void kullaniciGerekliPathParamAyarlariniYapar(String param1, String param2, String param3) {
       spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
       spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
}
    @Given("Kullanici request islemi yapar ve response alir")
    public void kullanici_request_islemi_yapar_ve_response_alir() {
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
    @Given("Kullanici statusunun {string} oldugunu dogrular")
    public void kullanici_statusunun_oldugunu_dogrular(String status) {
      response.then().assertThat().statusCode(Integer.parseInt(status));
    }
    @Given("User degerlerini Matcher class yontemi ile dogrular")
    public void user_degerlerini_matcher_class_yontemi_ile_dogrular() {
     // response.then().body("user.id", equalTo(453),
       //       "user.first_name",equalTo("testName2"));
        response.then().body("message",equalTo("Successfully logged In"));
    }

    @Then("Kullanici token oldugunu dogrular")
    public void kullaniciTokenOldugunuDogrular() {

      //  JsonPath json=response.jsonPath();
       // String tokendata=json.getString("token");
       // Assert.assertEquals(tokendata,json.getString("token"));
        response.then().assertThat().body(Matchers.hasItem("token"));
       // Assert.assertNotNull(json.getString("token"));


    }


}
