package dao;

import java.util.ArrayList;
import modelo.Amigo;

public class AmigoDAO {
    //lista que armazema os objetos
     public static ArrayList<Amigo> minhaLista = new ArrayList<>();

    //retorna o ArrayList
    public static ArrayList<Amigo> getMinhaLista() {
        return minhaLista;
    }

    //Modifica o ArrayList @param minhaLista Um ArrayList
    public static void setMinhaLista(ArrayList<Amigo> minhaLista) {
        AmigoDAO.minhaLista = minhaLista;
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
}


