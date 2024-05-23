
package DAO;

import java.util.ArrayList;
import projeto.aluguel.ferramenta.Model.Amigo;

public class AmigoDAO {
     public static ArrayList<Amigo> minhaLista = new ArrayList<>();

    /**
     * Retorna o ArrayList.
     *
     * @return O ArrayList.
     */
    public static ArrayList<Amigo> getMinhaLista() {
        return minhaLista;
    }

    /**
     * Modificada o ArrayList.
     *
     * @param minhaLista Um ArrayList.
     */
    public static void setMinhaLista(ArrayList<Amigo> minhaLista) {
        AmigoDAO.minhaLista = minhaLista;
    }

    /**
     * Retorna o maior id do aluno do ArrayList.
     *
     * @return Um id com o maior id de aluno.
     */
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


