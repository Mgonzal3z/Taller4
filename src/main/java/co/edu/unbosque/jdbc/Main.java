package co.edu.unbosque.jdbc;

import java.util.*;
import java.sql.*;

import co.edu.unbosque.jdbc.dtos.Owner;
import co.edu.unbosque.jdbc.dtos.UserApp;
import co.edu.unbosque.jdbc.services.OwnersService;
import co.edu.unbosque.jdbc.services.PetsService;
import co.edu.unbosque.jdbc.services.UserService;

public class Main {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost/fourpows";

    // Database credentials
    static final String USER = "postgres";
    static final String PASS = "";

    public static void main(String[] args) {

        // Objects for handling connection
        Connection conn = null;

        try {

            // Registering the JDBC driver
            Class.forName(JDBC_DRIVER);

            // Opening database connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            UserService usersService = new UserService(conn);
            usersService.listUsers();

            PetsService petsService = new PetsService(conn);
            petsService.countBySpecies("dog");

            OwnersService ownersService = new OwnersService(conn);
            ownersService.updateOwner(new Owner(6698, null, "Pepito Perez"));

            // Closing database connection
            conn.close();

        } catch(SQLException se) {
            se.printStackTrace(); // Handling errors from database
        } catch(ClassNotFoundException e) {
            e.printStackTrace(); // Handling errors from JDBC driver
        } finally {
            // Cleaning-up environment
            try {
                if(conn != null) conn.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }

    }
}
