package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta{

    // Atributos
    private String Nome;
    private String Marca;
    private Double Custo;
    private FerramentaDAO ferramenta = new FerramentaDAO();
        
    // Construtor Default
    public Ferramenta(){
        this("", "", 0.0);
    }
    // Construtor 
    public Ferramenta(String Nome, String Marca, Double Custo){
        this.Nome = Nome;
        this.Marca = Marca;
        this.Custo = Custo;
    }

    // Getters 
    public String getNome(){
        return this.Nome;
    }
    public String getMarca(){
        return this.Marca;
    }
    public Double getCusto(){
        return this.Custo;
    }
    public int getFerramentaid(String nome, String marca){
        return ferramenta.getFerramentaidDAO(nome, marca);
    }
    // ----------
    
    // Setters
    public void setNome(String nome){
        String auxNome = this.Nome;
        this.Nome = nome;
        ferramenta.setNomeDAO(this.getFerramentaid(auxNome, this.Marca), nome);
    }
    public void setMarca(String marca){
        String auxMarca = this.Marca;
        this.Marca = marca;
        ferramenta.setMarcaDAO(this.getFerramentaid(this.Nome, auxMarca), marca);
    }
    public void setCusto(Double custo){
        this.Custo = custo;
        ferramenta.setCustoDAO(this.getFerramentaid(this.Nome, this.Marca), custo);
    }
    // ----------
    
    // Adiciona ferramenta ao banco de dados
    public void addFerramenta(){
        ferramenta.addFerramentaDAO(this.Nome, this.Marca, this.Custo);
    }
    
    // Deleta ferramenta do banco de dados
    public void deletaFerramenta(){
        ferramenta.delFerramentaDAO(this.Nome, this.Marca);
    }
    
    // Retorna lista de ferramentas cadastrads
    public ArrayList getMinhaListaFerramenta(){
        return ferramenta.getFerramentaDAO();
    }
    
}