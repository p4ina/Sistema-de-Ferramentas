package modelo;

import java.time.LocalDateTime;
import java.util.Date;

public class Emprestimo {
    //atributos da classe

    private LocalDateTime dataDeEmprestimo;
    private Date dataDeDevolucao;
    private Amigo amigo;
    private Ferramenta ferramenta;

    //Construtor da Classe
    public Emprestimo(Amigo amigo, Ferramenta ferramenta, Date dataDeDevolucao) {
        this.dataDeEmprestimo = LocalDateTime.now();
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    //getters para Data do emprestimo
    public LocalDateTime getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }
    //getter para data de devolução

    public Date getDataDeDevolucao() {
        return dataDeDevolucao;
    }
    //getter para amigo

    public Amigo getAmigo() {
        return amigo;
    }
    //setter para amigo

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    //getter para ferramenta
    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    //setter para ferramenta
    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }
}
