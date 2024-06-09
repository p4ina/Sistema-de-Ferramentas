package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;

public class Emprestimo {
    private String DataDevolucao;
    private String DataEmprestimo;
    private int Amigoid;
    private int Ferramentaid;
    
    EmprestimoDAO emprestimo = new EmprestimoDAO();

    public Emprestimo() {
        this("","",0,0);
    }

    public Emprestimo(String DataDevolucao, String DataEmprestimo, int Amigoid, int Ferramentaid) {
        this.DataDevolucao = DataDevolucao;
        this.DataEmprestimo = DataEmprestimo;
        this.Amigoid = Amigoid;
        this.Ferramentaid = Ferramentaid;
    }

    // getters 
    public String getAmigo(){
        return emprestimo.getAmigoDAO(this.Amigoid);
    }
    public String getFerramenta(){
        return emprestimo.getFerramentaDAO(this.Ferramentaid);
    }
    public String getDataEmprestimo() {
        return emprestimo.getDataEmprestimoDAO(this.getEmprestimoid(this.Amigoid, this.Ferramentaid));
    }
    public String getDataDevolucao() {
        return emprestimo.getDataDevolucaoDAO(this.getEmprestimoid(this.Amigoid, this.Ferramentaid));
    }
    public int getEmprestimoid(int amigoid, int ferramentaid) {
        return emprestimo.getEmprestimoIDDAO(amigoid, ferramentaid);
    }
    // ----------
    
    // setters 
    public void setDataDevolucao(String DataDevolucao) {
        emprestimo.setDataDevolucaoDAO(this.getEmprestimoid(this.Amigoid, this.Ferramentaid), DataDevolucao);
        this.DataDevolucao = DataDevolucao;
    }
    public void setDataEmprestimo(String DataEmprestimo) {
        emprestimo.setDataEmprestimoDAO(this.getEmprestimoid(this.Amigoid, this.Ferramentaid), DataEmprestimo);
        this.DataEmprestimo = DataEmprestimo;
    }
    // ----------
    
    public void addEmprestimo(int amigoid, int ferramentaid, String data_emprestimo){
        emprestimo.addEmprestimoDAO(amigoid, ferramentaid, data_emprestimo);
    }
    
    public void addDevolucao(int emprestimoid, String dataDevolucao){
        emprestimo.addDevolucaoDAO(emprestimoid, dataDevolucao);
    }
    
    public int verificarAmigo(int amigoid){
        return emprestimo.verificarAmigoDAO(amigoid);
    }
    
    public ArrayList getrelatorioAtivos(){
        return emprestimo.relatorioAtivosDAO();
    }
    
    public ArrayList getrelatorioHistorico(){
        return emprestimo.relatorioHistoricoDAO();
    }
    
    public String maisEmprestimos(){
        return emprestimo.maisEmprestimosDAO();
    }
    
}