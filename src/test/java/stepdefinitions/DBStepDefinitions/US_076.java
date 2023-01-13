package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;

import java.sql.*;

public class US_076 {

    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "O+e3!xmZcO]";

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Kullanici JDBC ile database'e baglanir")
    public void kullaniciJDBCIleDatabaseEBaglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Then("carts tablosundaki id verilerini alir")
    public void usersTablosundakiIsimVerileriniAlir() throws SQLException {
        String query = "SELECT id FROM carts";
        resultSet = statement.executeQuery(query);
    }

    @And("id verilerini test eder")
    public void isimVerileriniTestEder() throws SQLException {
        resultSet.absolute(4);
        System.out.println(resultSet.getString("id"));
    }






}



