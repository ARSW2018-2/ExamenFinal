/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal.model;

/**
 *
 * @author 2098325
 */
public class Temperature {
    
    double grados;
    String tipo;
    public Temperature(){}
    
    public Temperature(Double grados,String tipo){
        this.grados=grados;
        this.tipo=tipo;
    
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setGrados(double grados){
        this.grados=grados;
    }
    public double getGrados(){
        return grados;
    }
    
   @Override
    public String toString(){
        return String.format("Compania con [grados=%s]", grados);
    }
    
}
