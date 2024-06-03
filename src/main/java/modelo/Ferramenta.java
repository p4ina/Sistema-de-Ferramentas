package modelo;

import java.util.ArrayList;
import dao.FerramentaDAO;

public class Ferramenta {
   //atributos da classe
    private int id;
    private String ferramenta;
    private String marca;
    private Double preco;
   //construtor 
    public Ferramenta(int id, String ferramenta, String marca, Double preco) {
        this.id = id;
        this.ferramenta = ferramenta;
        this.marca = marca;
        this.preco = preco;
    }
    //construtor padrão
    public Ferramenta(){
    this(0, "", "", 0.0);
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
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }   
    // Método para retornar uma representação em string do objeto
    @Override
    public String toString() {
        return "Ferramenta{" + "id=" + id + ", ferramenta=" + ferramenta + ", marca=" + marca + ", preco=" + preco + '}';
    }
    //Metodo para obter obter a lista de ferramentas pelo DAO
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDAO.getMinhaLista();
    }
    //metodo para inserir uma nova ferramenta
    public boolean insertFerramentaBD(String ferramenta, String marca, double preco) {
        int id = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id, ferramenta, marca, preco);
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
    public boolean updateFerramentaBD(String ferramenta, int id) {
        Ferramenta objeto = new Ferramenta(id, ferramenta, marca, preco);
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