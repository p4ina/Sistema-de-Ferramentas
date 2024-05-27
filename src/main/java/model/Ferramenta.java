package projeto.aluguel.ferramenta.Model;

import java.util.ArrayList;
import DAO.FerramentaDAO;

public class Ferramenta {

    private int id;
    private String ferramenta;
    private String marca;
    private Double preco;

    public Ferramenta(int id, String ferramenta, String marca, Double preco) {
        this.id = id;
        this.ferramenta = ferramenta;
        this.marca = marca;
        this.preco = preco;
    }
    public Ferramenta(){
    this(0, "", "", 0.0);
}  


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

    @Override
    public String toString() {
        return "Ferramenta{" + "id=" + id + ", ferramenta=" + ferramenta + ", marca=" + marca + ", preco=" + preco + '}';
    }
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDAO.getMinhaLista();
    }
    public boolean insertFerramentaBD(String ferramenta, String marca, double preco) {
        int id = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id, ferramenta, marca, preco);
        FerramentaDAO.minhaLista.add(objeto);
        return true;
    }
    public boolean deleteFerramentaBD(int id) {
        int indice = this.procuraIndice(id);
        FerramentaDAO.minhaLista.remove(indice);
        return true;
}
    public boolean updateFerramentaBD(String ferramenta, int id) {
        Ferramenta objeto = new Ferramenta(id, ferramenta, marca, preco);
        int indice = this.procuraIndice(id);
        FerramentaDAO.minhaLista.set(indice, objeto);
        return true;
    }
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FerramentaDAO.minhaLista.size(); i++) {
            if (FerramentaDAO.minhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    public Ferramenta carregaFerramenta(int id) {
        int indice = this.procuraIndice(id);
        return FerramentaDAO.minhaLista.get(indice);
    }
    public int maiorID() {
        return FerramentaDAO.maiorID();
    }


   

}