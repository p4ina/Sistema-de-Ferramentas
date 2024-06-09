package modelo;

import java.util.ArrayList;
import dao.AmigoDAO;

public class Amigo {

    //atributos da classe

    private String nome;
    private String telefone;
        private AmigoDAO amigo = new AmigoDAO();


    //construtor principal
    public Amigo(String nome, String telefone) {
 
        this.nome = nome;
        this.telefone = telefone;
    }

    //construtor padrão
    public Amigo() {
        this( "", "");
    }

    //getters e setters para os atributos definidos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    //metodo para retornar o objeto
    @Override
    public String toString() {
        return "Amigo{"+ ", nome=" + nome + ", telefone=" + telefone +'}';

        //metodo para obter a lista de amigos a partir do DAO
    }

    public ArrayList<Amigo> getMinhaLista() {
        return AmigoDAO.getMinhaLista();
    }

    //metodo para inserir um novo amigo no BD
    public boolean insertAmigoBD(String nome, String telefone) {
        int id = this.maiorID() + 1;
        AmigoDAO objetoDAO = new AmigoDAO();
        objetoDAO.addAmigoDAO(nome,telefone);
        return true;
    }

    //metodo para deletar um amigo
    public boolean deleteAmigoBD(int id) {
        int indice = this.procuraIndice(id);
        AmigoDAO.minhaLista.remove(indice);
        return true;
    }

    //metodo para atualizar os dados de algum amigo que ja existe
    public boolean updateTelefoneBD(int amigoid, String novoTelefone) {
        AmigoDAO objetoDAO = new AmigoDAO();
        objetoDAO.setTelefoneDAO(amigoid, novoTelefone);
        return true;
    }
   
    public boolean updateAmigoBD(int amigoid, String nome) {
        AmigoDAO objetoDAO = new AmigoDAO();
        objetoDAO.setNomeDAO(amigoid, nome);
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
