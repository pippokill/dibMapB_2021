/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.lab.collection.esercizi;

/**
 *
 * @author pierpaolo
 */
public class Articolo {

    private int id;

    private String desc;

    private double prezzo;

    private double peso;

    public Articolo(int id) {
        this.id = id;
    }

    public Articolo(int id, String desc, double prezzo, double peso) {
        this.id = id;
        this.desc = desc;
        this.prezzo = prezzo;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articolo other = (Articolo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public String toString() {
        return id + ", " + desc + ", prezzo=" + prezzo + ", peso=" + peso;
    }

}
