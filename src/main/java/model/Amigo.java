package projeto.aluguel.ferramenta.Model;

import java.util.ArrayList;
import DAO.AmigoDAO;

public class Amigo {

    private int id;
    private String nome;
    private int telefone;
    private int ferramentasPegas;

    public Amigo(int id, String nome, int telefone, int ferramentasPegas) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.ferramentasPegas = ferramentasPegas;
    }
    

public Amigo(){
    this(0, "", 0, 0);
}    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Amigo{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone +
                ", ferramentasPegas=" + ferramentasPegas + '}';
    }
    public ArrayList<Amigo> getMinhaLista() {
        return AmigoDAO.getMinhaLista();
    }
    public boolean insertAmigoBD(String nome, int ind) {
        int id = this.maiorID() + 1;
        Amigo objeto = new Amigo();
        AmigoDAO.minhaLista.add(objeto);
        return true;
    }
    public boolean deleteAmigoBD(int id) {
        int indice = this.procuraIndice(id);
        AmigoDAO.minhaLista.remove(indice);
        return true;
}
    public boolean updateAmigoBD(String nome, int id) {
        Amigo objeto = new Amigo(id, nome, telefone, ferramentasPegas);
        int indice = this.procuraIndice(id);
        AmigoDAO.minhaLista.set(indice, objeto);
        return true;
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
    public Amigo carregaAmigo(int id) {
        int indice = this.procuraIndice(id);
        return AmigoDAO.minhaLista.get(indice);
    }
    public int maiorID() {
        return AmigoDAO.maiorID();
    }

}