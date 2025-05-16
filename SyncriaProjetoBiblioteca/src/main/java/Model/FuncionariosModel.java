/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
//Funcionario login é cadastro
public class FuncionariosModel {
    private String login;
    private String senha;
    private String cadastro;
    private String senhacadastro;

    public FuncionariosModel(String login, String senha, String cadastro, String senhacadastro) {
        this.login = login;
        this.senha = senha;
        this.cadastro = cadastro;
        this.senhacadastro = senhacadastro;
    }

    public FuncionariosModel() {
    }
    
    
    
    
    
     
    //metodos getter e setter
//setter serve para visualizar os dados
    public String getLogin() {
        return login;
    }
    //setter serve para guardar os dados
    public void setLogin(String login) {
        this.login = login;
    }
    //metodo com retorno tipo String
    public String getSenha() {
        return senha;
    }
    //metodo com parametro e sem retorno
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public String getSenhacadastro() {
        return senhacadastro;
    }

    public void setSenhacadastro(String senhacadastro) {
        this.senhacadastro = senhacadastro;
    }

    public void setNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}//chave da classe
