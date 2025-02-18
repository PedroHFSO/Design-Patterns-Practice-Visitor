/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public interface Visitor {
    public String visitPais(Pais p);
    public String visitEstado(Estado e);
    public String visitCidade(Cidade c);
}
