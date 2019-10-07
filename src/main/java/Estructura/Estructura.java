/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import Iterator.Aggregate;
import Iterator.IIterator;

/**
 *
 * @author Gabriel
 */
public class Estructura implements Aggregate{
    private Nodo raiz;

    public Estructura(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    @Override
    public IIterator getIterator() {
        return new TreeIterator(this, (NodoPrincipal) this.raiz,1);
    }
    
    private class TreeIterator implements IIterator{
        private Estructura tree;
        private NodoPrincipal nodo;
        private int hijo;

        public TreeIterator(Estructura tree,NodoPrincipal nodo,int hijo) {
            this.tree = tree;
            this.nodo = nodo;
            this.hijo = hijo;
        }
        @Override
        public boolean hasNext() {
            
            if(nodo.getCuartoAuxiliar() !=null){
                if(nodo.getCuartoAuxiliar().getSegundoPrincipal()==null&&this.hijo==6){
                return false;
                }
            }
            
            else if(nodo.getTerceroAuxiliar()!=null){
                if(nodo.getTerceroAuxiliar().getSegundoPrincipal()==null&&this.hijo>=5){
                return false;
                }
            }
            
            return true;
        }

        @Override
        public Object next() {
            switch(hijo){
                case 1:
                    if(this.nodo.getPrimerAuxiliar()==null){
                        this.hijo += 1;
                        return this.next();
                    }
                    else{
                        this.hijo+=1;
                        return this.nodo.getPrimerAuxiliar();
                    }                   
                case 2:
                    if(this.nodo.getSegundoAuxiliar()==null){
                        this.hijo += 1;
                        return this.next();
                    }
                    else{
                        this.hijo+=1;
                        return this.nodo.getSegundoAuxiliar();
                    }
                    
                    
                case 3:
                   
                    this.hijo+=1;
                    return this.nodo;

                    
                case 4:
                    if(this.nodo.getTerceroAuxiliar()==null){
                        this.hijo += 1;
                        return this.next();
                    }
                    else{
                        this.hijo+=1;
                        return this.nodo.getTerceroAuxiliar();
                    }
                    
                    
                case 5:
                    if(this.nodo.getCuartoAuxiliar()==null){
                        this.hijo += 1;
                        
                        return this.next();
                    }
                    else{
                       this.hijo+=1;
                       return this.nodo.getCuartoAuxiliar(); 
                    }
                    
                    
                case 6:
                    if(this.nodo.getTerceroAuxiliar() != null){
                        if(this.nodo.getTerceroAuxiliar().getSegundoPrincipal()==null){
                        this.nodo = this.nodo.getTerceroAuxiliar().getSegundoPrincipal();
                        this.hijo=3;
                        return this.next(); 
                        }
                        this.nodo = this.nodo.getTerceroAuxiliar().getSegundoPrincipal();
                        this.hijo=3;
                        return this.next(); 
                    }
                    else{
                        if(this.nodo.getCuartoAuxiliar().getSegundoPrincipal()==null){
                        this.nodo = this.nodo.getCuartoAuxiliar().getSegundoPrincipal();
                        this.hijo=3;
                        return this.next(); 
                        }
                        this.nodo = this.nodo.getCuartoAuxiliar().getSegundoPrincipal();
                        this.hijo=3;
                        return this.next();
                    }
                    
            }
            return null;
        }
        
        
    }
    
}
