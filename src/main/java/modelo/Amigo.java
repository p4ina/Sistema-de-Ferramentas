package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo{

    // Atributos
    private String nome;
    private String telefone;
    private AmigoDAO amigo = new AmigoDAO();

    // Construtor Default
    public Amigo(){
        this("", "");
    }
    // Construtor 
    public Amigo(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters 
    public String getNome(){
        return amigo.getNomeDAO(this.getAmigoid(this.nome, this.telefone));
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    public int getAmigoid(String nome, String telefone){
        return amigo.getAmigoidDAO(nome, telefone);
    }
    // ----------

    // Setters
    public void setNome(String nome) {
        String auxNome = this.nome;
        this.nome = nome;
        amigo.setNomeDAO(this.getAmigoid(auxNome, this.telefone), nome);
    }
    
    public void setTelefone(String telefone){
        String auxTelefone = this.telefone;
        this.telefone = telefone;
        amigo.setTelefoneDAO(this.getAmigoid(this.nome, auxTelefone), telefone);
    }
    // ----------
    
    // Adiciona o amigo ao banco de dados
    public void addAmigo(){
        amigo.addAmigoDAO(this.nome, this.telefone);
    }
    
    // Deleta o amigo do banco de dados
    public void delAmigo(){
        amigo.delAmigoDAO(this.nome, this.telefone);
    }
    
    // Retorna todos os amigos cadastrados
    public ArrayList getMinhaListaAmigo(){
        return amigo.getMinhaListaAmigoDAO();
    }

}