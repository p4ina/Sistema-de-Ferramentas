package dao;

import java.util.ArrayList;
import modelo.Emprestimo;

public class EmprestimoDAO {

    public static ArrayList<Emprestimo> minhaLista = new ArrayList<>();
    //armazenar os emprestimos
    public static ArrayList<Emprestimo> getMinhaLista() {
        return minhaLista;
    //retorna a lista de emprestimo
    }
    //metodo para definir a lista de emprestimo
    public static void setMinhaLista(ArrayList<Emprestimo> minhaLista) {
        EmprestimoDAO.minhaLista = minhaLista;
    }
    //metodo para obter o maior id da lista de empréstimo
    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() > maiorID) {
                maiorID = minhaLista.get(i).getId();
            }
        }
        return maiorID;
        //retorna o maior id
    }
}