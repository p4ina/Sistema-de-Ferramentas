package dao;

import java.util.ArrayList;
import modelo.Ferramenta;

public class FerramentaDAO {
    
    public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();
    //armazenar ferramentas na lista
    public static ArrayList<Ferramenta> getMinhaLista() {
        return minhaLista;
     //metodo para obter a lista de ferramenta
    }

    public static void setMinhaLista(ArrayList<Ferramenta> minhaLista) {
        FerramentaDAO.minhaLista = minhaLista;
        //define a lista de ferramentas
    }

    public static int maiorID() {
        //procura o maior ID da lista
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() > maiorID) {
                maiorID = minhaLista.get(i).getId();
            }
        }
        return maiorID;
        //retorna o maior ID da lista
    }
}