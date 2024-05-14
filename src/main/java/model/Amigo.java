package projeto.aluguel.ferramenta.Model;

public class Amigo {

    private int id;
    private String nome;
    private int telefone;
    private int ferramentasPegas;

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
}