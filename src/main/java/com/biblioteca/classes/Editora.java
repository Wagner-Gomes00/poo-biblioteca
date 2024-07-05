package com.biblioteca.classes;
import java.util.*;
public class Editora {
    private int editoraID;
    private String nome;

    //Constructor
    public Editora(int editoraID, String nome){
        this.editoraID = editoraID;
        this.nome = nome;
    }

    //Getters e sett
    public int geteditoraID(){
        return editoraID;
    }

    public void seteditoraID(int editoraID){
        this.editoraID = editoraID;
    }

    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

}
