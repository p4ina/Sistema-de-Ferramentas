package modelo;

import java.util.ArrayList;
import dao.FerramentaDAO;


public class Ferramenta {
    //atributos da classe

    private String ferramenta;
    private String marca;
    private Double preco;
    private FerramentaDAO ferramentaDAO = new FerramentaDAO();
    //construtor 
    private int id;

    public Ferramenta(String ferramenta, String marca, Double preco) {
        this.ferramenta = ferramenta;
        this.marca = marca;
        this.preco = preco;
    }

    //construtor padrão
    public Ferramenta() {
        this("", "", 0.0);
    }

    //getters e setters
    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

  public int getId(){
        return ferramentaDAO.getFerramentaidDAO(ferramenta, marca, preco);
    }

    // Método para retornar uma representação em string do objeto
    @Override
    public String toString() {
        return "Ferramenta{" + ", ferramenta=" + ferramenta + ", marca=" + marca + ", preco=" + preco + '}';
    }

    //Metodo para obter obter a lista de ferramentas pelo DAO
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDAO.getMinhaLista();
    }

    //metodo para inserir uma nova ferramenta
    public boolean insertFerramentaBD(String ferramenta, String marca, double preco) {
        int id = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(ferramenta, marca, preco);
        FerramentaDAO.minhaLista.add(objeto);
        return true;
    }

    //metodo para deletar ferramenta
    public boolean deleteFerramentaBD(int id) {
        int indice = this.procuraIndice(id);
        FerramentaDAO.minhaLista.remove(indice);
        return true;
    }

    // metodo para atualizar ferramentas
    public boolean updateFerramentaBD(String ferramenta, String marca, double preco) {
        Ferramenta objeto = new Ferramenta(ferramenta, marca, preco);
        int indice = this.procuraIndice(id);
        FerramentaDAO.minhaLista.set(indice, objeto);
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
