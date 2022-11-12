package org.example.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {
        Connection conn = getConnect();
        if (conn != null) {
            System.out.println("thanhcong");
        } else {
            System.out.println(("thatbai"));
        }
    }

    public static Connection getConnect() {

        final String url = "jdbc:mysql://localhost:3306/banhang2";
        final String user = "root";
        final String password = "1231234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            return null;

        } catch (SQLException e) {
            return null;

        }
    }
}
