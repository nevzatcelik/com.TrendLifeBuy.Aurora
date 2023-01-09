package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_074 {
    String url="jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username="u480337000_tbl_training_u";
    String password="O+e3!xmZcO]";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir
    @Given("Kullanici JDBC ile database ebaglanir")
    public void kullanici_jdbc_ile_database_ebaglanir() throws SQLException {
        connection= DriverManager.getConnection(url,username,password);
        statement= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Then("{string} tablosundaki verilerini alir")
    public void tablosundakiVerileriniAlir(String query2) throws SQLException {
       String query="SELECT * FROM u480337000_tlb_training.users";
       resultSet=statement.executeQuery(query);
    }

    @And("User verifies {string} {string} {string} {string} {string} from data base")
    public void userVerifiesFromDataBase(String id, String firstname, String lastname, String email, String role_id) throws SQLException {
        System.out.println(resultSet.absolute(1));
        String actualName=resultSet.getString(firstname);
        String expected="Super";
        Assert.assertEquals(expected,actualName);
        String actualName2=resultSet.getString(lastname);
        String expectedLastname="admin";
        Assert.assertEquals(expectedLastname,actualName2);
        resultSet.absolute(2);
        String actualfirstname=resultSet.getString(firstname);
        String expectedFirstname="Admin";
        Assert.assertEquals(expectedFirstname,actualfirstname);





        /* List<String> costumer=new ArrayList<>();
        costumer.add(DBUtils.getCostumer(id).toString());
        System.out.println(costumer);
        Assert.assertTrue(costumer.contains("Super"));

        */


    }


}
