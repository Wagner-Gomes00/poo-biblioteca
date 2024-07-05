package com.biblioteca.classes;

public class Pessoa {
    private int pessoaId;
    private String rg;
    private String cpf;
    private String nome;

    // Constructor
    public Pessoa(int pessoaId, String rg, String cpf, String nome) {
        this.pessoaId = pessoaId;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
    }

    // Getters e Setters
    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}