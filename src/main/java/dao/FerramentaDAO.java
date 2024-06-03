package dao;

import java.util.ArrayList;
import modelo.Ferramenta;

public class FerramentaDAO {

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
}
