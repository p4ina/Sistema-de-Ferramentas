package dao;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/emprestimo"; //url de conexão banco de dados
    private static final String USER = ""; //user do banco de dados
    private static final String PASS = ""; //senha banco de dados

    public static Connection getConnection() {
    //metodo para obter a conexão com o bancho de dados
        try {
         //tenta estabelecer a conexão com banco de dados
            return DriverManager.getConnection(URL, USER, PASS);
        
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados: " + ex);
        //Lança uma exceção de erro na conexão
        }
    }
    
    public static void closeConnection(Connection conn) {
        //fechar conexão
        try {
            if (conn != null) {
         //fecha a conexão se ela não for nula
                conn.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);
            //lança uma exceção em caso de erro
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stmt) {
       //fecha conexão
        closeConnection(conn);
       
        try {
            if (stmt != null) {
           //fecha o preparedStatement se ele não for nulo
                stmt.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);
          //lança uma exceção em caso de erro
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {
       //fecha conexão
        closeConnection(conn, stmt);
        
        try {
            if (rs != null) {
                rs.close();
                //fecha o ResultSet se não for nulo
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);
       //lança uma exceção em caso de erro ao fechar o ResultSet
        }
    }

}
