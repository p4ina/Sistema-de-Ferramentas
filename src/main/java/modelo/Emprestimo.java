package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;

public class Emprestimo {

    private String DataDevolucao;
    private String Devolvida;
    private String nome;
    private String Ferramenta;
    private int telefone;
    private int id;

    public Emprestimo() {
        this("", "", "", "", 0, 0);
    }

    public Emprestimo(String DataDevolucao, String Devolvida, String nome, String Ferramenta, int telefone, int id) {
        this.DataDevolucao = DataDevolucao;
        this.Devolvida = Devolvida;
        this.nome = nome;
        this.Ferramenta = Ferramenta;
        this.telefone = telefone;
        this.id = id;
    }

    public String getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(String DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

    public String getDevolvida() {
        return Devolvida;
    }

    public void setDevolvida(String Devolvida) {
        this.Devolvida = Devolvida;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFerramenta() {
        return Ferramenta;
    }

    public void setFerramenta(String Ferramenta) {
        this.Ferramenta = Ferramenta;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "DataDevolucao=" + DataDevolucao + ", Devolvida=" + Devolvida + ", Nome=" + nome + ", Ferramenta=" + Ferramenta + ", telefone=" + telefone + ", id=" + id + '}';
    }

    public ArrayList<Emprestimo> getMinhaLista() {
        return EmprestimoDAO.getMinhaLista();
    }

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < EmprestimoDAO.minhaLista.size(); i++) {
            if (EmprestimoDAO.minhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    // metodo para carregar ferramenta
    public Emprestimo carregaEmprestimo(int id) {
        int indice = this.procuraIndice(id);
        return EmprestimoDAO.minhaLista.get(indice);
    }

    // metodo para obter o maior id da lista
    public int maiorID() {
        return EmprestimoDAO.maiorID();
    }

}