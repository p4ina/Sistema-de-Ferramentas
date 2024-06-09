package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ferramenta;

public class FerramentaDAO {

    Conexao conexao = new Conexao();
    
    public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();

    public static ArrayList<Ferramenta> getMinhaLista() {
        return minhaLista;
    }

    public static void setMinhaLista(ArrayList<Ferramenta> minhaLista) {
        FerramentaDAO.minhaLista = minhaLista;
    }

    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() > maiorID) {
                maiorID = minhaLista.get(i).getId();
            }
        }
        return maiorID;
    }
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AmigoDAO.minhaLista.size(); i++) {
            if (AmigoDAO.minhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
     // Getters 
    public String getFerramentaDAO(int ferramentaid) {
        String sql = "SELECT nome FROM db_ferramentas WHERE ferramentaid = ?";
        String ferramenta = "";
        try (Connection conn = conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, ferramentaid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    ferramenta = res.getString("ferramenta");
                } else {
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhuma ferramenta encontrado com o id: " + ferramentaid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o nome do amigo: " + e.getMessage());
        }
        return ferramenta;
    }

    public String getMarcaDAO(int ferramentaid) {
        String sql = "SELECT telefone FROM db_ferramentas WHERE ferramentaid = ?";
        String marca = "";
        try (Connection conn = conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, ferramentaid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    marca = res.getString("marca");
                } else {
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhuma ferramenta encontrado com o id: " + ferramentaid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar a marca da ferramenta: " + e.getMessage());
        }
        return marca;
    }
    public String getPrecoDAO(int ferramentaid) {
        String sql = "SELECT telefone FROM db_ferramentas WHERE ferramentaid = ?";
        String preco = "";
        try (Connection conn = conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, ferramentaid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    preco = res.getString("preço");
                } else {
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhuma ferramenta encontrado com o preço: " + ferramentaid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o preço da ferramenta: " + e.getMessage());
        }
        return preco;
    }

    public int getFerramentaidDAO(String ferramenta, String marca, double preco) {
        String sql = "SELECT COUNT(*) AS total FROM db_ferramentas WHERE ferramenta = ? AND marca = ? AND custo = ?";
        int ferramentaid = 0;

        try (Connection conn = conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, ferramenta);
            stmt.setString(2, marca);
            stmt.setDouble(3, preco);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalAmigos = res.getInt("total");
                    if (totalAmigos > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT amigoid FROM db_ferramentas WHERE ferramenta = ? AND marca = ? AND custo = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, ferramenta);
                            stmt2.setString(2, marca);
                            stmt.setDouble(3, preco);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                ferramentaid = res2.getInt("ferramentaid");
                            }
                        }
                    } else {
                        // Nenhuma ferramenta foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar ferramenta: " + e.getMessage());
        }

        return ferramentaid;
    }
    // ----------

    // Setters
    public void setFerramentaDAO(int ferramentaid, String novaFerramenta) {
        String sql= "UPDATE db_ferramentas\n" + "SET ferramenta = (?)\n" + "WHERE ferramentaid = (?);";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, novaFerramenta);
            stmt.setInt(2, ferramentaid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    public void setMarcaDAO(int ferramentaid, String novaMarca) {
        String sql = "\n" + "UPDATE db_ferramentas\n" + "SET marca = (?)\n" + "WHERE ferramentaid = (?);";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, novaMarca);
            stmt.setInt(2, ferramentaid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setPrecoDAO(int ferramentaid, Double novoPreco) {
        String sql = "\n" + "UPDATE db_ferramentas\n" + "SET preco = (?)\n" + "WHERE ferramentaid = (?);";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setDouble(1, novoPreco);
            stmt.setInt(2, ferramentaid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    // ----------

    // Retorna a Lista de Amigos(objetos)
    public ArrayList getMinhaListaFerramentaDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_ferramentas");
            while (res.next()) {
                String ferramenta = res.getString("ferramenta");
                String marca = res.getString("marca");
                double preco = res.getDouble("preço");
                Ferramenta objeto = new Ferramenta(ferramenta, marca, preco);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        return minhaLista;
    }

    // Adiciona Amigos(objetos)
    public void addFerramentaDAO(String ferramenta, String marca, double preco) {
        String sql = "INSERT INTO db_ferramentas(ferramenta,marca, preco) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, ferramenta);
            stmt.setString(2, marca);
            stmt.setDouble(3, preco);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    // Deleta Amigos(objetos)
    public void delFerramentaDAO(String ferramenta, String marca, double preco) {
        String sql = "DELETE FROM db_ferramentas WHERE ferramenta = (?) AND marca = (?) AND preco = (?);";
        try {
            PreparedStatement stmt = conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, ferramenta);
            stmt.setString(2, marca);
            stmt.setDouble(3, preco);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

  
    
}
