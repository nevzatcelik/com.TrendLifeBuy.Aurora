package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class US_076 {

    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "O+e3!xmZcO]";

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Kullanici JDBC ile database'e baglanir")
    public void kullanici_jdbc_ile_database_e_baglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


    }
}
