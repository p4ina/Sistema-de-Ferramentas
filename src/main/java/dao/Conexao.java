package dao;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/aaa";
    private static final String USER = "root";
    private static final String PASS = "13904725,?Xg";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados: " + ex);

        }
    }

    public static void closeConnection(Connection conn) {

        try {
            if (conn != null) {

                conn.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stmt) {

        closeConnection(conn);

        try {
            if (stmt != null) {

                stmt.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);

        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {

        closeConnection(conn, stmt);

        try {
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);

        }
    }

}
