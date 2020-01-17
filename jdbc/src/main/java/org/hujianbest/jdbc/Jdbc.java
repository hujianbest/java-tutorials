package org.hujianbest.jdbc;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author hujian
 */
public class Jdbc {
    private String url = "jdbc:mysql://localhost:3306/whut?useSSL=false&serverTimezone=UTC";
    private String username = "root";
    private String password = "Root1992!";

    @SneakyThrows
    private Connection getConnection() {
        Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
        return conn;
    }

    public static void main(String[] args) {
        Jdbc jdbc = new Jdbc();
        Connection conn = jdbc.getConnection();
    }
}
