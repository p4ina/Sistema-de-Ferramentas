package modelo;

import java.util.ArrayList;
import dao.FerramentaDAO;


public class Ferramenta {
    //atributos da classe

    private String nome;
    private String marca;
    private Double custo;
    private FerramentaDAO ferramentaDAO = new FerramentaDAO();
    //construtor 
    private int id;

    public Ferramenta(String nome, String marca, Double custo) {
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }

    //construtor padrão
    public Ferramenta() {
        this("", "", 0.0);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

  public int getId(){
        return ferramentaDAO.getFerramentaidDAO(nome, marca, custo);
    }

    // Método para retornar uma representação em string do objeto
    @Override
    public String toString() {
        return "Ferramenta{" + ", ferramenta=" + nome + ", marca=" + marca + ", preco=" + custo + '}';
    }

    //Metodo para obter obter a lista de ferramentas pelo DAO
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDAO.getMinhaLista();
    }

    //metodo para inserir uma nova ferramenta
    public boolean insertFerramentaBD(String nome, String marca, double custo) {
        int id = this.maiorID() + 1;
       FerramentaDAO objetoDAO = new FerramentaDAO();
       objetoDAO.addFerramentaDAO(nome, marca, custo);
        return true;
    }

    //metodo para deletar ferramenta
    public boolean deleteFerramentaBD(int id) {
        int indice = this.procuraIndice(id);
        FerramentaDAO.minhaLista.remove(indice);
        return true;
    }

    // metodo para atualizar ferramentas
    public boolean updateFerramentaBD(int ferramentaid, String novoNome, String marca1, double custo1) {
       FerramentaDAO objetoDAO = new FerramentaDAO();
       objetoDAO.setFerramentaDAO(ferramentaid, novoNome);
        return true;
    }

    // metodo para procurar pelo indice
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FerramentaDAO.minhaLista.size(); i++) {
            if (FerramentaDAO.minhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

    // metodo para carregar ferramenta
    public Ferramenta carregaFerramenta(int id) {
        int indice = this.procuraIndice(id);
        return FerramentaDAO.minhaLista.get(indice);
    }

    // metodo para obter o maior id da lista
    public int maiorID() {
        return FerramentaDAO.maiorID();
    }

}
