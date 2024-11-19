/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp;

import java.io.Serializable;

/**
 *
 * @author 2dami
 */
public class Temperatura implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private transient String unidad = "C";
    private int valor = 0;
    
    public Temperatura(){
        
    }

    public String getUnidad() {
        return unidad;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
}
