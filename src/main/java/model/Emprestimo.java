
package projeto.aluguel.ferramenta.Model;
import java.time.LocalDateTime;
import java.util.Date;

public class Emprestimo {

    private LocalDateTime dataDeEmprestimo;
    private Date dataDeDevolucao;
    private Amigo amigo;
    private Ferramenta ferramenta;


    public Emprestimo(Amigo amigo, Ferramenta ferramenta, Date dataDeDevolucao) {
        this.dataDeEmprestimo = LocalDateTime.now();
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public LocalDateTime getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public Date getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }
}