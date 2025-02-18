/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class CSVVisitor implements Visitor {
    
    public String visit(Local l){
        return l.accept(this);
    }
    
    @Override
    public String visitPais(Pais p){
        return "nome, abreviacao\n'"+p.getNome()+"', '"+p.getAbreviacao()+"'";
    }
    
    @Override
    public String visitEstado(Estado e){
        return "nome, abreviacao, abreviacao_pais,\n'"+e.getNome()+"', '"+e.getAbreviacao()+"', '"+e.getPais().getAbreviacao()+"'";
    }
    
    @Override
    public String visitCidade(Cidade c){
        return "nome, abreviacao_estado, abreviacao_pais,\n'"+c.getNome()+"', '"+c.getEstado().getAbreviacao()+"', '"+c.getEstado().getPais().getAbreviacao()+"'";
    }
}
