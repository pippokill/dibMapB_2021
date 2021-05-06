/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.lab.collection.esercizi;

import java.util.Objects;

/**
 *
 * @author pierpaolo
 */
public class HolderQuantity<T> implements Comparable<HolderQuantity<T>> {
    
    private T item;
    
    private int q;

    public HolderQuantity(T item, int q) {
        this.item = item;
        this.q = q;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.item);
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
        final HolderQuantity<?> other = (HolderQuantity<?>) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(HolderQuantity<T> o) {
        return Integer.compare(q, o.q);
    }

    
    
}
