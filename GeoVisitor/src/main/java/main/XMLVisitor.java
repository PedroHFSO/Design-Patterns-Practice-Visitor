/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class XMLVisitor implements Visitor {
    
    public String visit(Local l){
        return l.accept(this);
    }
    
    @Override
    public String visitPais(Pais p){
        return "<Pais><nome>"+p.getNome()+"</nome><abreviacao>"+p.getAbreviacao()+"</abreviacao></Pais>";
    }
    
    @Override
    public String visitEstado(Estado e){
        return "<Estado><nome>"+e.getNome()+"</nome><abreviacao>"+e.getAbreviacao()+"</abreviacao>"+this.visit(e.getPais())+"</Estado>";
    }
    
    @Override
    public String visitCidade(Cidade c){
    	return "<Cidade><nome>"+c.getNome()+"</nome>"+this.visit(c.getEstado())+"</Cidade>";
    }
}
