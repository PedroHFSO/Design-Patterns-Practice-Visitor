/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class Estado implements Local {

    public Estado(Pais pais, String nome, String abreviacao) {
        this.pais = pais;
        this.nome = nome;
        this.abreviacao = abreviacao;
    }

    
    
    private Pais pais;
    private String nome;
    private String abreviacao;
    
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }
    
    @Override
    public String accept(Visitor v){
        return v.visitEstado(this);
    }
    
}
