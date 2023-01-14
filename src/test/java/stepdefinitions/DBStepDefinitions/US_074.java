package stepdefinitions.DBStepDefinitions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.US022_023_024_053_Page;
import utilities.ConfigReader;

import java.sql.*;
import java.util.*;

public class US_074 {

    String url="jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username="u480337000_tbl_training_u";
    String password="O+e3!xmZcO]";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir


    @Given("nevzat JDBC ile database ebaglanir {string} tablosundaki verileri alir")
    public void nevzatJDBCIleDatabaseEbaglanirTablosundakiVerileriAlir(String arg0) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(arg0);
        resultSet = statement.executeQuery(query);
    }



    @And("User verifies {string} {string} {string} {string} {string} {string} {string} {string} {string}from data base")
    public void userVerifiesFromDataBase(String id, String firstname, String lastname, String email, String role_id, String fnA, String lnA, String emA, String rlA) throws SQLException {

        resultSet.absolute(0);
        List<String> resultsFirstname = new ArrayList<String>();
        while(resultSet.next()) {
            resultsFirstname.add(resultSet.getNString(firstname));

        }
        System.out.println(resultsFirstname);
        Assert.assertTrue(resultsFirstname.contains(fnA));

        resultSet.absolute(0);
        List<String> resultsLastname = new ArrayList<String>();
        while(resultSet.next()) {
            resultsLastname.add(resultSet.getNString(lastname));
         //   System.out.println(resultsLastname);
        }
         Assert.assertTrue(resultsLastname.contains(lnA));

        resultSet.absolute(0);
        List<String> resultsEmail = new ArrayList<String>();
        while(resultSet.next()) {
            resultsEmail.add(resultSet.getNString(email));
           // System.out.println(resultsEmail)
        }
         Assert.assertTrue(resultsEmail.contains(emA));

         resultSet.absolute(0);
        List<String> resultsroleId = new ArrayList<String>();
        while(resultSet.next()) {
            resultsroleId.add(String.valueOf(resultSet.getInt(role_id)));
           // System.out.println(resultsroleId);
        }
        Assert.assertTrue(resultsroleId.contains(rlA));









    }
}
