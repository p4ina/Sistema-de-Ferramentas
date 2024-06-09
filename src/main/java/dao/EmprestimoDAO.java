
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;


public class EmprestimoDAO {
    

    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    
    // getters
    public String getAmigoDAO(int amigoid){
        String sql = "SELECT nome FROM db_amigos\n" + "WHERE amigoid = (?)";
        String amigo = "";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, amigoid);
            stmt.execute();
            ResultSet rs = stmt.executeQuery(); // Executando a consulta e obtendo o resultado

            if (rs.next()) {
                amigo = rs.getString("nome"); // Obtendo a data da consulta
            }

            rs.close(); // Fechando o ResultSet
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
        return amigo;
    }
    
    public String getFerramentaDAO(int ferramentaid){
        String sql = "SELECT nome FROM db_ferramentas\n" + "WHERE ferramentaid = (?)";
        String ferramenta = "";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, ferramentaid);
            stmt.execute();
            ResultSet rs = stmt.executeQuery(); // Executando a consulta e obtendo o resultado

            if (rs.next()) {
                ferramenta = rs.getString("nome"); // Obtendo a data da consulta
            }

            rs.close(); // Fechando o ResultSet
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
        return ferramenta;
    }
    
    public String getDataEmprestimoDAO(int emprestimoid) {
        String sql = "SELECT data_emprestimo FROM db_emprestimos\n" + "WHERE emprestimoid = (?)";
        String dataEmprestimoReturn = "";

        try {
            // Supondo que `conexao` é uma instância de uma classe que retorna a conexão com o banco de dados
            Connection connection = conexao.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, emprestimoid); // Definindo o parâmetro da consulta
            ResultSet rs = stmt.executeQuery(); // Executando a consulta e obtendo o resultado

            if (rs.next()) {
                dataEmprestimoReturn = rs.getString("data_emprestimo"); // Obtendo a data da consulta
            }

            rs.close(); // Fechando o ResultSet
            stmt.close(); // Fechando o PreparedStatement
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }

        return dataEmprestimoReturn;
    }
    
    public String getDataDevolucaoDAO(int emprestimoid) {
        String sql = "SELECT data_devolucao FROM db_emprestimos\n" + "WHERE emprestimoid = (?)";
        String dataDevolucao = null;

        try {
            // Supondo que `conexao` é uma instância de uma classe que retorna a conexão com o banco de dados
            Connection connection = conexao.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, emprestimoid); // Definindo o parâmetro da consulta
            ResultSet rs = stmt.executeQuery(); // Executando a consulta e obtendo o resultado

            if (rs.next()) {
                dataDevolucao = rs.getString("data_devolucao"); // Obtendo a data da consulta
            }

            rs.close(); // Fechando o ResultSet
            stmt.close(); // Fechando o PreparedStatement
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }

        return dataDevolucao;
    }
    public ArrayList getEmprestimosDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_emprestimos");
            while (res.next()) {
                int amigoid = res.getInt("amigoid");
                int ferramentaid = res.getInt("ferramentaid");
                String dataEmprestimo = res.getString("data_emprestimo");
                String dataDevolucao = res.getString("data_devolucao");
                Emprestimo objeto = new Emprestimo(dataEmprestimo, dataDevolucao, amigoid, ferramentaid);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    public int getEmprestimoIDDAO(int amigoid, int ferramentaid) {
        String sql = "SELECT COUNT(*) AS total FROM db_emprestimos WHERE amigoid = ? AND ferramentaid = ?";
        int emprestimoid = 0;

        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setInt(1, amigoid);
            stmt.setInt(2, ferramentaid);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalEmprestimos = res.getInt("total");
                    if (totalEmprestimos > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT emprestimoid\n" + "FROM db_emprestimos\n" + "WHERE amigoid = ? AND ferramentaid = ?\n" + "ORDER BY emprestimoid DESC\n" + "LIMIT 1";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setInt(1, amigoid);
                            stmt2.setInt(2, ferramentaid);
                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                emprestimoid = res2.getInt("emprestimoid");
                            }
                        }
                    } else {
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar emprestimo: " + e.getMessage());
        }
        return emprestimoid;
    }
    // ----------
    
    // setters
    public void setDataEmprestimoDAO(int emprestimoid, String novaDataEmprestimo){  
    String sql = "UPDATE db_emprestimos\n" + "SET data_emprestimo = (?)\n" + "WHERE emprestimoid = (?);";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, novaDataEmprestimo);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setDataDevolucaoDAO(int emprestimoid, String novaDataDevolucao){
      String sql = "UPDATE db_emprestimos\n" + "SET data_devolucao = (?)\n" + "WHERE emprestimoid = (?);";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, novaDataDevolucao);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    // ----------  

    // Adiciona Emprestimo ao banco de dados
    public void addEmprestimoDAO(int amigoid, int ferramentaid, String data_emprestimo) {
        String sql = "INSERT INTO db_emprestimos\n" + "(amigoid, ferramentaid, usuarioid, data_emprestimo, data_devolucao)\n" + "VALUES(?,?,?,?,?)\n";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, amigoid);
            stmt.setInt(2, ferramentaid);
            stmt.setString(3, data_emprestimo);
            stmt.setString(4, "");
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Adiciona devolucao ao banco de dados
    public void addDevolucaoDAO(int emprestimoid, String dataDevolucao) {
        String sql = "UPDATE db_emprestimos\n" + "SET data_devolucao = (?)\n" + "WHERE  emprestimoid = (?)\n";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, dataDevolucao);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Verifica se amigo tem emprestimos ativos
    public int verificarAmigoDAO(int amigoid){
        String sql = "SELECT data_devolucao FROM db_emprestimos\n" + "WHERE amigoid = (?)\n" + "ORDER BY emprestimoid DESC\n" + "LIMIT 1\n";
        String dataDevolucao = "a";

        try {
            // Supondo que `conexao` é uma instância de uma classe que retorna a conexão com o banco de dados
            Connection connection = conexao.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, amigoid); // Definindo o parâmetro da consulta
            ResultSet rs = stmt.executeQuery(); // Executando a consulta e obtendo o resultado
            if (rs.next()) {
                dataDevolucao = rs.getString("data_devolucao"); // Obtendo a data da consulta
            }

            rs.close(); // Fechando o ResultSet
            stmt.close(); // Fechando o PreparedStatement
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
        if (dataDevolucao.compareTo("") == 0){
            return -1;
        }else{
            return amigoid;
        }
    }
    
    // Retorna a Lista de emprestimos ativos
    public ArrayList relatorioAtivosDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_emprestimos WHERE data_devolucao = ''");
            while (res.next()) {
                int amigoid = res.getInt("amigoid");
                int ferramentaid = res.getInt("ferramentaid");
                String data_emprestimo = res.getString("data_emprestimo");
                Emprestimo objeto = new Emprestimo("", data_emprestimo, amigoid, ferramentaid);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Retorna o hist[orico de empréstimos
    public ArrayList relatorioHistoricoDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        Amigo amigoNome = new Amigo();
        Ferramenta FerramentaNome = new Ferramenta();
        try {
            Statement stmt = conexao.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_emprestimos WHERE data_devolucao  <> ''");
            while (res.next()) {
                int amigoid = res.getInt("amigoid");
                int ferramentaid = res.getInt("ferramentaid");
                String data_emprestimo = res.getString("data_emprestimo");
                String data_devolucao = res.getString("data_devolucao");
                Emprestimo objeto = new Emprestimo(data_devolucao, data_emprestimo, amigoid, ferramentaid);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Retorna o amigo com mais emprestimos
    public String maisEmprestimosDAO(){
        String sql = "SELECT a.nome, COUNT(e.amigoid) AS ocorrencias\n" + "FROM db_amigos a\n" + "JOIN db_emprestimos e ON a.amigoid = e.amigoid\n" + "GROUP BY a.nome\n" + "ORDER BY ocorrencias DESC\n" + "LIMIT 1";
        String nomeMaisFrequente = "";
        try (Connection conn = conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet res = stmt.executeQuery()) {
            if (res.next()) {
                nomeMaisFrequente = res.getString("nome");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o nome mais frequente: " + e.getMessage());
        }
        return nomeMaisFrequente;
    }
}