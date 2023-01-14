package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US_070 {
    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "O+e3!xmZcO]";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir
    @Given("Levent gets the data in the table {string} by connecting to the database")
    public void levent_gets_the_data_in_the_table_by_connecting_to_the_database(String levent) throws SQLException {

        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query =ConfigReader.getProperty(levent);
        resultSet = statement.executeQuery(query);
    }
    @Then("Levent verifies that {string} in the list {string}")
    public void levent_verifies_that_in_the_list(String address, String string2) throws SQLException {

    }
    @Then("Levent verifies LIST that {string} in the list {string}")
    public void leventVerifiesLISTThatInTheList(String address, String expected) throws SQLException {
        resultSet.absolute(0);
        List<String> adressList = new ArrayList<String>();
        while(resultSet.next()) {
            adressList.add(resultSet.getNString(address));

        }
        Assert.assertTrue(adressList.contains(expected));
    }
}
