/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.lab.classi.esercizi;

/**
 *
 * @author pierpaolo
 */
public class Quadrato extends Rettangolo {

    public Quadrato(double lato) {
        super(lato, lato);
    }

    public String toString() {
        return "Quadrato di lato " + super.dim1;
    }

}
