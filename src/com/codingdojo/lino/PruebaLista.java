package com.codingdojo.lino;

public class PruebaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimpleEnlazada sll = new ListaSimpleEnlazada();
//		sll.addAtEnd("Nodo 1");
//        sll.addAtEnd("Nodo 2");
//        sll.addAtEnd("Nodo 3");
//        sll.addAtEnd("Nodo 4");
//        sll.addAtEnd("Nodo 5");
//        sll.addAtEnd("Nodo 6");
//        sll.printValues(); 
        
		
		sll.addAsFirst("Nodo 1");
        sll.addAsFirst("Nodo 2");
        sll.addAsFirst("Nodo 3");
        sll.addAsFirst("Nodo 4");
        sll.addAsFirst("Nodo 5");
        sll.addAsFirst("Nodo 6");
        
        System.out.println("---------");
	
        sll.printValues();
        
        System.out.println("---------");
        
        sll.printBackward();
        System.out.println("-----nodo eliminado : ----");
        sll.pop();
        System.out.println("---------");
        sll.printBackward();
        
        System.out.println("---------");
        boolean isTrueOrNot = sll.contains("Nodo 5");
        System.out.println(isTrueOrNot);
        int nroNodos = sll.size();
        System.out.println(nroNodos);
	}

}
