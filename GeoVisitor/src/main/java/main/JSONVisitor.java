/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class JSONVisitor implements Visitor {
    
    public String visit(Local l){
        return l.accept(this);
    }
    
    @Override
    public String visitPais(Pais p){
        return "Pais{nome='" + p.getNome() + "', abreviacao='" + p.getAbreviacao() + "'}";
    }
    
    @Override
    public String visitEstado(Estado e){
        return "Estado{nome='"+e.getNome()+"', abreviacao='"+e.getAbreviacao()+"', "+this.visit(e.getPais())+"}";
    }
    
    @Override
    public String visitCidade(Cidade c){
    	return "Cidade{nome='"+c.getNome()+"', "+this.visit(c.getEstado())+"}";
    }
}
