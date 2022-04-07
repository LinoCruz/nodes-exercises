package com.codingdojo.lino;

public class ListaSimpleEnlazada {
	 public Nodo head;
	 public Nodo tail;
	 private int cantidadNodos = 0; 
	 
	 
	 public ListaSimpleEnlazada() {
	        this.head = null;
	        this.tail= null;
	    }
	    
	    

	    
	 //Nodo que creado va al final de la lista
	 public void addAtEnd(String value) {
	        Nodo newNodo = new Nodo(value);
	        cantidadNodos++;
	        if(this.head == null) {
	            this.head = newNodo;
	            this.tail = newNodo;
	        } else {
	            Nodo ultimoNodo = this.tail;
	            ultimoNodo.next = newNodo;
	            newNodo.previous = ultimoNodo;
	            this.tail= newNodo;
	        }
	    }   
	 
	//Nodo que creado va al inicio de la lista
	 public void addAsFirst(String value) {
	        Nodo nuevoNodo = new Nodo(value);
	        cantidadNodos++;
	        if(head == null) {
	            this.head  =  nuevoNodo;
	            this.tail = nuevoNodo;
	        }else {
	        Nodo primerNodo = this.head;
	        nuevoNodo.next = primerNodo;
	        primerNodo.previous = nuevoNodo;
	        this.head = nuevoNodo;
	        }  
	    }
	
	//Saber si existe algún nodo o no
	 private boolean IsEmpty() {
	        return this.head == null;
	    }
	//Eliminar el último nodo
	 public String removeBack() {
	        Nodo runner = head;
	        String valToReturn;
	        cantidadNodos--;
	        // if we have 0 nodes return null
	        if(IsEmpty())
	            return null;

	        // if we have just one node, remove head
	        if(head.next == null) {
	            valToReturn = head.value;
	            head = null;
	            return valToReturn;
	        }

	        // otherwise, loop til we are right before the last node
	        while(runner.next.next != null) {
	            runner = runner.next;
	        }
	        valToReturn = runner.next.value;
	        runner.next = null;
	        return valToReturn;
	        
	    }  
	 
	 
	 //Imprimir nodos
	    public void printValues(){
		    Nodo actual = this.head;
		    while(actual != null) {
		    	System.out.println(actual.value);
		    	actual = actual.next;
		    }
	    }
	    
	  //Imprimir nodos al revés
	    public void printBackward(){
	    	Nodo actual = this.tail;
	    	
	    	while(actual != null) {
	    		System.out.println(actual.value);
	    		actual = actual.previous;
	    	}
	    }
	    
	  //Mostrar último elemento y eliminarlo
	    public void pop() {
	    	Nodo nodoFinal = this.tail;
	    	System.out.println(nodoFinal.value);
	    	this.tail = nodoFinal.previous;
	    	nodoFinal = null;
	    	cantidadNodos--;
	   
	    }
	    
	  //Identificar si un valor existe entre los nodos disponibles
	    public boolean contains (String valor) {
	    	
	    	Nodo actual = this.head;
	    	String valorActual = actual.value;
	    	Nodo nodoFinal = this.tail;
	    	String valorFinal = nodoFinal.value;
	    	
	    	if(valorActual.equals(valor)) {
	    		return true;
	    		}	else {
		    			while(actual.next.next != null) {
		    				if(actual.value.equals(valor)==true) {return true;}else {actual = actual.next;}
		 	     
		    			}
	    		}
	    	if(valorFinal.equals(valor)) {
	    		return true;
	    	}else {
	    		return false;
	    	}
	    
	    }
	    
	  //Conocer la cantidad de nodos que tenemos
	   public int size() {
		  return cantidadNodos;
	   }
	    
}
