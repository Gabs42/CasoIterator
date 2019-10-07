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
public class NodoPrincipal extends Nodo {
    
    private NodoAuxiliar primerAuxiliar = null;
    private NodoAuxiliar segundoAuxiliar = null;
    private NodoAuxiliar terceroAuxiliar = null;
    private NodoAuxiliar cuartoAuxiliar = null;
    
    public NodoPrincipal(int valor) {
        super(valor);
    }

    public NodoAuxiliar getPrimerAuxiliar() {
        return primerAuxiliar;
    }

    public void setPrimerAuxiliar(NodoAuxiliar primerAuxiliar) {
        this.primerAuxiliar = primerAuxiliar;
    }

    public NodoAuxiliar getSegundoAuxiliar() {
        return segundoAuxiliar;
    }

    public void setSegundoAuxiliar(NodoAuxiliar segundoAuxiliar) {
        this.segundoAuxiliar = segundoAuxiliar;
    }

    public NodoAuxiliar getTerceroAuxiliar() {
        return terceroAuxiliar;
    }

    public void setTerceroAuxiliar(NodoAuxiliar terceroAuxiliar) {
        this.terceroAuxiliar = terceroAuxiliar;
    }

    public NodoAuxiliar getCuartoAuxiliar() {
        return cuartoAuxiliar;
    }

    public void setCuartoAuxiliar(NodoAuxiliar cuartoAuxiliar) {
        this.cuartoAuxiliar = cuartoAuxiliar;
    }
    
}
