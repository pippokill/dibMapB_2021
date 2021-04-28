/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.lab.collection.esercizi;

import java.util.Map;

/**
 *
 * @author pierpaolo
 */
public class Ordine {

    private Utente utente;

    private Map<Articolo, Integer> articoli;

    private double costoMerce;

    private double costoSpedizione;

    public Ordine(Utente utente, Map<Articolo, Integer> articoli) {
        this.utente = utente;
        this.articoli = articoli;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public double getCostoMerce() {
        return costoMerce;
    }

    public void setCostoMerce(double costoMerce) {
        this.costoMerce = costoMerce;
    }

    public double getCostoSpedizione() {
        return costoSpedizione;
    }

    public void setCostoSpedizione(double costoSpedizione) {
        this.costoSpedizione = costoSpedizione;
    }

    public Map<Articolo, Integer> getArticoli() {
        return articoli;
    }

    public void setArticoli(Map<Articolo, Integer> articoli) {
        this.articoli = articoli;
    }

    public void calcolaCostoMerce() {
        costoMerce = 0;
        for (Map.Entry<Articolo, Integer> e : articoli.entrySet()) {
            costoMerce += e.getKey().getPrezzo() * e.getValue();
        }
    }

    public double getPeso() {
        double peso = 0;
        for (Map.Entry<Articolo, Integer> e : articoli.entrySet()) {
            peso += e.getKey().getPeso() * e.getValue();
        }
        return peso;
    }

    public String toString() {
        return "Utente=" + utente.getUsername() + ", " + costoMerce + ", " + costoSpedizione;
    }

}
