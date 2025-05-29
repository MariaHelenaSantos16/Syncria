/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class TurmaModel {
    
    private int idTurma;
    private String turno;
    private String codigoDaTurma;

    public TurmaModel(int idTurma, String turno, String codigoDaTurma) {
        this.idTurma = idTurma;
        this.turno = turno;
        this.codigoDaTurma = codigoDaTurma;
  
    }//fim do construtor cheio

    //Construtor vazio
    public TurmaModel() {
    }
    
    //Getter e Setter

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCodigoDaTurma() {
        return codigoDaTurma;
    }

    public void setCodigoDaTurma(String codigoDaTurma) {
        this.codigoDaTurma = codigoDaTurma;
    }
    

     
            
            
}// fim da chave da classe
