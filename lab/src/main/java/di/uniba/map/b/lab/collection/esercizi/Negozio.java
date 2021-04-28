/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.lab.collection.esercizi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author pierpaolo
 */
public class Negozio {

    //per semplificazione il negozio ha solo un magazzino
    public final Magazzino magazzino;

    public final Set<Utente> utenti;

    public Negozio(Magazzino magazzino, Set<Utente> utenti) {
        this.magazzino = magazzino;
        this.utenti = utenti;
    }

    public Magazzino getMagazzino() {
        return magazzino;
    }

    public Set<Utente> getUtenti() {
        return utenti;
    }

    public double acquista(Utente utente, Map<Articolo, Integer> carrello) throws NegozioException {
        // controllo disponibilità
        for (Articolo articolo : carrello.keySet()) {
            if (!magazzino.disponibile(articolo, carrello.get(articolo))) {
                throw new NegozioException("Articolo " + articolo.getId() + " non disponibile.");
            }
        }
        // rimuovi merce dal magazzino
        for (Articolo articolo : carrello.keySet()) {
            magazzino.remove(articolo, carrello.get(articolo));
        }
        // crea ordine
        Ordine ordine = new Ordine(utente, carrello);
        utente.calcolaOrdine(ordine);
        utente.getStoricoOrdini().add(ordine);
        return ordine.getCostoMerce() + ordine.getCostoSpedizione();
    }
    
    public List<Ordine> cercaStoricoUtente(Utente utente) {
        for (Utente u:utenti) {
            if (u.equals(utente)) {
                return u.getStoricoOrdini();
            }
        }
        return new ArrayList<>();
    }

}
