/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class Cidade implements Local {

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }

    
    
    private String nome;
    private Estado estado;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    @Override
    public String accept(Visitor v){
        return v.visitCidade(this);
    }
    
}
