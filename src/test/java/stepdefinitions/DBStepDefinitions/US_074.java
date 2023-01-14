package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US022_023_024_053_Page;
import utilities.ConfigReader;
import utilities.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class US_074 {
    US022_023_024_053_Page nevzat=new US022_023_024_053_Page();
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


    @And("User verifies {string} {string} {string} {string} {string} from data base")
    public void userVerifiesFromDataBase(String id, String firstname, String lastname, String email, String role_id) throws SQLException {



      String emailListToplam ="";
      String lastnameToplam="";
      String firstnameToplam="";
      String roleidToplamList="";




       while (resultSet.next())
       {
           List<String> listfirstname= new ArrayList<>(Collections.singletonList(resultSet.getString(firstname)));
           System.out.println(listfirstname);
           firstnameToplam= listfirstname.toString();
           listfirstname.add(firstnameToplam);
       }
        System.err.println(firstnameToplam);
       resultSet.absolute(0);
       while (resultSet.next()){
           String listlastname=resultSet.getString(lastname);
           System.out.println(listlastname);
           lastnameToplam=listlastname;


       }
       resultSet.absolute(0);
       while (resultSet.next()) {
           String list=resultSet.getString(email);
           System.out.println(list);
           emailListToplam=list;


       }
       resultSet.absolute(0);
       while (resultSet.next()){
           String roleidlist=resultSet.getString(role_id);
           System.out.println(roleidlist);
           roleidToplamList=roleidlist;

       }


     //  Assert.assertTrue(firstnameToplam.contains("Ali"));




        /*resultSet.first();
        String actualName=resultSet.getString(firstname);
        String expected="Super";
        Assert.assertEquals(expected,actualName);
        /*
        String actualName2=resultSet.getString(lastname);
        String expectedLastname="admin";
        Assert.assertEquals(expectedLastname,actualName2);
        resultSet.absolute(2);
        String actualfirstname=resultSet.getString(firstname);
        String expectedFirstname="Admin";
        Assert.assertEquals(expectedFirstname,actualfirstname);

         */









    }



}
