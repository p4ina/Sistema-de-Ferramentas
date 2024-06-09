package dao;    

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.Conexao;

public class teste {
    
    public static void main (String[] args){
    
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        String sql = "insert into db_amigos(amigoid, nome, telefone) values('2', 'leo', '234245382947')";
        
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println("Erro ao salvar dados" + ex.toString());
            
        }finally{
            Conexao.closeConnection(con, stmt);
        }
        
    }
    
}