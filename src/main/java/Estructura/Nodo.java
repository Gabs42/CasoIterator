/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author Gabriel
 */
public abstract class Nodo {
    private int valor;

    public Nodo(int valor) {
        this.valor = valor;
    }

    
     
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
