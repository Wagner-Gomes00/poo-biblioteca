package com.biblioteca.classes;

public class Emprestimo {

    private int emprestimoId;
    private String dataEmprestimo;
    private String dataPrevDev;

    // Constructor
    public Emprestimo(int emprestimoId, String dataEmprestimo, String dataPrevDev) {
        this.emprestimoId = emprestimoId;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevDev = dataPrevDev;
    }

    // Getters e Setters
    public int getEmprestimoId() {
        return emprestimoId;
    }

    public void setEmprestimoId(int emprestimoId) {
        this.emprestimoId = emprestimoId;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPrevDev() {
        return dataPrevDev;
    }

    public void setDataPrevDev(String dataPrevDev) {
        this.dataPrevDev = dataPrevDev;
    }
}