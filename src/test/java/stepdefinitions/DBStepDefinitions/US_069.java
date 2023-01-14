package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class US_069 {

    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "O+e3!xmZcO]";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir

    @Given("gursel JDBC ile database ebaglanir {string} tablosundaki verileri alir")
    public void gurselJDBCIleDatabaseEbaglanirTablosundakiVerileriAlir(String table) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(table);
        resultSet = statement.executeQuery(query);
    }

    @Then("Kullanici listenen idleri litede oldugunu dogrular {string}")
    public void kullaniciListenenIdleriLitedeOldugunuDogrular(String arg0) throws SQLException {

        resultSet.absolute(1);
        String expected ="1";
        String actual = resultSet.getString("id");
        Assert.assertEquals(expected, actual);
        resultSet.next();
        String expected2="2";
        String actual2=resultSet.getString("id");
        Assert.assertEquals(expected2, actual2);

    }
}
