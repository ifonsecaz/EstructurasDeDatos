/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;

/**
 *
 * @author edi
 */
public interface ConjuntoADT<T> extends Iterable<T> {
    public Iterator<T> iterator();
    
    public boolean agrega(T elem);
    
    public T quita(T elem);
    
    public boolean contiene(T elem);
    
    public int getCardinalidad();
    
    public boolean estaVacio();
    
    public ConjuntoADT<T> u(ConjuntoADT<T> conj2);
    
    public ConjuntoADT<T> inter(ConjuntoADT<T> conj2);
    
    public ConjuntoADT<T> dif(ConjuntoADT<T> conj2);
    
    public String toString();
}
