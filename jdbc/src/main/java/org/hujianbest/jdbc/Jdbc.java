package org.hujianbest.jdbc;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.sql.*;

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

    @SneakyThrows
    private ResultSet query(Connection conn, String sql) {
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }

    @SneakyThrows
    private ResultSet query(PreparedStatement statement) {
        return statement.executeQuery();
    }

    @SneakyThrows
    public static void main(String[] args) {
        Jdbc jdbc = new Jdbc();
        Connection conn = jdbc.getConnection();
        ResultSet resultSet = jdbc.query(conn, "select * from tb_user");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }

        String sql = "select * from tb_user where user_id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, 1);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            System.out.println(set.getString("username"));
        }
    }


}
