package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import projeto.aluguel.ferramenta.Connection.Conexao;

public class teste {
    
    public static void main (String[] args){
    
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        String sql = "insert into teste10.amigo(idamigo, nome) values('3', 'leo')";
        
        
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
