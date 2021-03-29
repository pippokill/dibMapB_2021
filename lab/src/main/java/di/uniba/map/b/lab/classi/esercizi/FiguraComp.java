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
public abstract class FiguraComp implements Figura, Comparable {

    double dim1;

    double dim2;

    public FiguraComp(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int compareTo(Object o) {
        if (((Figura) o).area() == this.area()) {
            return 0;
        } else if (((Figura) o).area() < this.area()) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean equals(Object o) {
        return (((Figura) o).area() == this.area());
    }

    public abstract double area();

}
