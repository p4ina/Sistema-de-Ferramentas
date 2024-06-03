package modelo;

import java.util.ArrayList;
import dao.AmigoDAO;

public class Amigo {
    
    //atributos da classe
    private int id;
    private String nome;
    private int telefone;
    private int ferramentasPegas;

    //construtor principal
    public Amigo(int id, String nome, int telefone, int ferramentasPegas) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.ferramentasPegas = ferramentasPegas;
    }
    
    //construtor padrão
public Amigo(){
    this(0, "", 0, 0);
}    
    
    //getters e setters para os atributos definidos
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

    //metodo para retornar o objeto
    @Override
    public String toString() {
        return "Amigo{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone +
                ", ferramentasPegas=" + ferramentasPegas + '}';
        
     //metodo para obter a lista de amigos a partir do DAO
    }
    public ArrayList<Amigo> getMinhaLista() {
        return AmigoDAO.getMinhaLista();
    }
    //metodo para inserir um novo amigo no BD
    public boolean insertAmigoBD(String nome, int ind) {
        int id = this.maiorID() + 1;
        Amigo objeto = new Amigo(id, nome, ind, ferramentasPegas);
        AmigoDAO.minhaLista.add(objeto);
        return true;
    }
    //metodo para deletar um amigo
    public boolean deleteAmigoBD(int id) {
        int indice = this.procuraIndice(id);
        AmigoDAO.minhaLista.remove(indice);
        return true;
}
    
    //metodo para atualizar os dados de algum amigo que ja existe
    public boolean updateAmigoBD(String nome, int id) {
        Amigo objeto = new Amigo(id, nome, telefone, ferramentasPegas);
        int indice = this.procuraIndice(id);
        AmigoDAO.minhaLista.set(indice, objeto);
        return true;
    }
    //metodo para encontrar algum amigo pelo seu id
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AmigoDAO.minhaLista.size(); i++) {
            if (AmigoDAO.minhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    //metodo para carregar um amigo pelo ID
    public Amigo carregaAmigo(int id) {
        int indice = this.procuraIndice(id);
        return AmigoDAO.minhaLista.get(indice);
    }
    //metodo para obter o maior ID da lista
    public int maiorID() {
        return AmigoDAO.maiorID();
    }
    
}