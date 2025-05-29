/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


/**
 *
 * @author ALUNO
 */
public class NovoLivroModel {

    private int idLivro;
    private String tituloObra;
    private int numeroCopias;
    private Date dataCadastro;
    private String generosLiterarios;
    private String subgenerosLiterarios;
    private String autor;
    private int numeroRegistro;
    private String edicao;
    private int volume;
    private String localizacao;
    private String editora;
    private int anoFabricacao;
    private int anoPublicacao;
    private String aquisicao;
    private String exemplar;
    private String numeroChamada;
    private String isbn;
    private String status;
    private String observacoes;
    private int quantidadeTituloEmprestado;
    private int quantidadeTituloAcervo;

    public NovoLivroModel(int idLivro, String tituloObra, int numeroCopias, Date dataCadastro, String generosLiterarios, String subgenerosLiterarios, String autor, int numeroRegistro, String edicao, int volume, String localizacao, String editora, int anoFabricacao, int anoPublicacao, String aquisicao, String exemplar, String numeroChamada, String isbn, String status, String observacoes, int quantidadeTituloEmprestado, int quantidadeTituloAcervo) {
        this.idLivro = idLivro;
        this.tituloObra = tituloObra;
        this.numeroCopias = numeroCopias;
        this.dataCadastro = dataCadastro;
        this.generosLiterarios = generosLiterarios;
        this.subgenerosLiterarios = subgenerosLiterarios;
        this.autor = autor;
        this.numeroRegistro = numeroRegistro;
        this.edicao = edicao;
        this.volume = volume;
        this.localizacao = localizacao;
        this.editora = editora;
        this.anoFabricacao = anoFabricacao;
        this.anoPublicacao = anoPublicacao;
        this.aquisicao = aquisicao;
        this.exemplar = exemplar;
        this.numeroChamada = numeroChamada;
        this.isbn = isbn;
        this.status = status;
        this.observacoes = observacoes;
        this.quantidadeTituloEmprestado = quantidadeTituloEmprestado;
        this.quantidadeTituloAcervo = quantidadeTituloAcervo;
    }

    public NovoLivroModel() {
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTituloObra() {
        return tituloObra;
    }

    public void setTituloObra(String tituloObra) {
        this.tituloObra = tituloObra;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getGenerosLiterarios() {
        return generosLiterarios;
    }

    public void setGenerosLiterarios(String generosLiterarios) {
        this.generosLiterarios = generosLiterarios;
    }

    public String getSubgenerosLiterarios() {
        return subgenerosLiterarios;
    }

    public void setSubgenerosLiterarios(String subgenerosLiterarios) {
        this.subgenerosLiterarios = subgenerosLiterarios;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAquisicao() {
        return aquisicao;
    }

    public void setAquisicao(String aquisicao) {
        this.aquisicao = aquisicao;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getNumeroChamada() {
        return numeroChamada;
    }

    public void setNumeroChamada(String numeroChamada) {
        this.numeroChamada = numeroChamada;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getQuantidadeTituloEmprestado() {
        return quantidadeTituloEmprestado;
    }

    public void setQuantidadeTituloEmprestado(int quantidadeTituloEmprestado) {
        this.quantidadeTituloEmprestado = quantidadeTituloEmprestado;
    }

    public int getQuantidadeTituloAcervo() {
        return quantidadeTituloAcervo;
    }

    public void setQuantidadeTituloAcervo(int quantidadeTituloAcervo) {
        this.quantidadeTituloAcervo = quantidadeTituloAcervo;
    }
 
    
    
    
}

    

