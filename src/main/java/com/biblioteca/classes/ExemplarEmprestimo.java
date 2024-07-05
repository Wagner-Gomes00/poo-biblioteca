package com.biblioteca.classes;

public class ExemplarEmprestimo {
    public static int contador = 0;
    private int exemplarEmprestimoId;

       
    // Construtor/contador
    public ExemplarEmprestimo(int exemplarEmprestimoId) {
        this.exemplarEmprestimoId = exemplarEmprestimoId;
        this.exemplarEmprestimoId = contador;
        contador++;
    }

    // Getters e Setters
    public int getExemplarEmprestimoId() {
        return exemplarEmprestimoId;
    }

    public void setExemplarEmprestimoId(int exemplarEmprestimoId) {
        this.exemplarEmprestimoId = exemplarEmprestimoId;
    }
}
