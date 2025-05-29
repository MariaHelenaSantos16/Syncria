/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class alunoModel {
    
 private String nomeAlluno;
private String turmaAluno;
private String bimestreAluno;
 private int quantidadeDeLivrosEmDivida;
 private int quantidadeDeLivrosEmprestados;
 private int quantidadeDeLivrosDevolvidos;
 private String livrosAlugadosPeloAluno;

    
    
  

    public alunoModel(String nomeAlluno, String turmaAluno, String bimestreAluno, int quantidadeDeLivrosEmDivida, int quantidadeDeLivrosEmprestados, int quantidadeDeLivrosDevolvidos, String livrosAlugadosPeloAluno) {
        this.nomeAlluno = nomeAlluno;
        this.turmaAluno = turmaAluno;
        this.bimestreAluno = bimestreAluno;
        this.quantidadeDeLivrosEmDivida = quantidadeDeLivrosEmDivida;
        this.quantidadeDeLivrosEmprestados = quantidadeDeLivrosEmprestados;
        this.quantidadeDeLivrosDevolvidos = quantidadeDeLivrosDevolvidos;
        this.livrosAlugadosPeloAluno = livrosAlugadosPeloAluno;
    }
    
    
      public alunoModel() {
    }
  
    
    //Getter e Setter

    public String getNomeAlluno() {
        return nomeAlluno;
    }

    public void setNomeAlluno(String nomeAlluno) {
        this.nomeAlluno = nomeAlluno;
    }

    public String getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(String turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    public String getBimestreAluno() {
        return bimestreAluno;
    }

    public void setBimestreAluno(String bimestreAluno) {
        this.bimestreAluno = bimestreAluno;
    }

    public int getQuantidadeDeLivrosEmDivida() {
        return quantidadeDeLivrosEmDivida;
    }

    public void setQuantidadeDeLivrosEmDivida(int quantidadeDeLivrosEmDivida) {
        this.quantidadeDeLivrosEmDivida = quantidadeDeLivrosEmDivida;
    }

    public int getQuantidadeDeLivrosEmprestados() {
        return quantidadeDeLivrosEmprestados;
    }

    public void setQuantidadeDeLivrosEmprestados(int quantidadeDeLivrosEmprestados) {
        this.quantidadeDeLivrosEmprestados = quantidadeDeLivrosEmprestados;
    }

    public int getQuantidadeDeLivrosDevolvidos() {
        return quantidadeDeLivrosDevolvidos;
    }

    public void setQuantidadeDeLivrosDevolvidos(int quantidadeDeLivrosDevolvidos) {
        this.quantidadeDeLivrosDevolvidos = quantidadeDeLivrosDevolvidos;
    }

    public String getLivrosAlugadosPeloAluno() {
        return livrosAlugadosPeloAluno;
    }

    public void setLivrosAlugadosPeloAluno(String livrosAlugadosPeloAluno) {
        this.livrosAlugadosPeloAluno = livrosAlugadosPeloAluno;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
