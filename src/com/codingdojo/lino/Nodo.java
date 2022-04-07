package com.codingdojo.lino;

public class Nodo {
	public String value;
    public Nodo next;
    public Nodo previous;
    
    public Nodo(String value) {
        this.value = value;
        this.next =  null;
        this.previous= null;
    }
    
    
}
