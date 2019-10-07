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
public class NodoAuxiliar extends Nodo {
    
    private NodoPrincipal primerPrincipal = null;
    private NodoPrincipal segundoPrincipal = null;

    public NodoAuxiliar(int valor) {
        super(valor);
    }

    public NodoPrincipal getPrimerPrincipal() {
        return primerPrincipal;
    }

    public void setPrimerPrincipal(NodoPrincipal primerPrincipal) {
        this.primerPrincipal = primerPrincipal;
    }

    public NodoPrincipal getSegundoPrincipal() {
        return segundoPrincipal;
    }

    public void setSegundoPrincipal(NodoPrincipal segundoPrincipal) {
        this.segundoPrincipal = segundoPrincipal;
    }
    
    
}
