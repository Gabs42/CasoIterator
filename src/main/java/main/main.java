/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Estructura.Estructura;
import Estructura.Nodo;
import Estructura.NodoAuxiliar;
import Estructura.NodoPrincipal;
import Iterator.IIterator;

/**
 *
 * @author Gabriel
 */
public class main {
    public static void main(String[] args){
        NodoPrincipal nodoP1 = new NodoPrincipal(3);
        NodoPrincipal nodoP2 = new NodoPrincipal(6);
        NodoPrincipal nodoP3 = new NodoPrincipal(9);
    
        NodoAuxiliar nodoA1 = new NodoAuxiliar(1);
        nodoA1.setSegundoPrincipal(nodoP1);
        NodoAuxiliar nodoA2 = new NodoAuxiliar(2);
        nodoA2.setSegundoPrincipal(nodoP1);
    
        NodoAuxiliar nodoA3 = new NodoAuxiliar(4);
        nodoA3.setSegundoPrincipal(nodoP2);
        NodoAuxiliar nodoA4 = new NodoAuxiliar(5);
        nodoA4.setSegundoPrincipal(nodoP2);
    
        NodoAuxiliar nodoA5 = new NodoAuxiliar(7);
        nodoA5.setSegundoPrincipal(nodoP3);
        NodoAuxiliar nodoA6 = new NodoAuxiliar(8);
        nodoA6.setSegundoPrincipal(nodoP3);
    
        NodoAuxiliar nodoA7 = new NodoAuxiliar(10);;
        NodoAuxiliar nodoA8 = new NodoAuxiliar(11);

    
        nodoP1.setPrimerAuxiliar(nodoA1);
        nodoP1.setSegundoAuxiliar(nodoA2);
        nodoP1.setTerceroAuxiliar(nodoA3);
        nodoP1.setCuartoAuxiliar(nodoA4);
        
        nodoP2.setPrimerAuxiliar(nodoA3);
        nodoP2.setSegundoAuxiliar(nodoA4);
        nodoP2.setTerceroAuxiliar(nodoA5);
        nodoP2.setCuartoAuxiliar(nodoA6);
        
        nodoP3.setPrimerAuxiliar(nodoA5);
        nodoP3.setSegundoAuxiliar(nodoA6);
        nodoP3.setTerceroAuxiliar(nodoA7);
        nodoP3.setCuartoAuxiliar(nodoA8);
        
        Estructura e = new Estructura(nodoP1);
        
        IIterator<Nodo> iterator = e.getIterator();
        
        while(iterator.hasNext()){
            
            System.out.println(iterator.next().getValor());
        }
    }
    
    
}
