package DAO;

import java.util.ArrayList;
import projeto.aluguel.ferramenta.Model.Ferramenta;

public class FerramentaDAO {
   //lista que armazena os objetos ferramentas
    public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();

    public static ArrayList<Ferramenta> getMinhaLista() {
        return minhaLista;
    }
    
    //modifica o ArrayList
    //@param minhaLista um ArrayList
    public static void setMinhaLista(ArrayList<Ferramenta> minhaLista) {
        FerramentaDAO.minhaLista = minhaLista;
    }

    // Retorna o maior id do aluno do ArrayList.
    // @return Um id com o maior id de aluno.
    
    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() > maiorID) {
                maiorID = minhaLista.get(i).getId();
            }
        }
        return maiorID;
    }
}
