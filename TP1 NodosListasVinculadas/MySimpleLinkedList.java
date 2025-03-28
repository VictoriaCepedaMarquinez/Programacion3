package ProgramacionIII.tp1;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T>{

	
	private Node<T> first;
	private int size;

	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		size++;
	}
	
	public T extractFront() {
	  Node<T> tmp = first;
	  this.first = first.getNext();
	  size--;

		return tmp.getInfo();
	}

	public boolean isEmpty() {
		return this.first == null;
	}
	
	public T get(int index) {
		if (index < 0 || index >= size ){
			return null;
		}else{
			Node<T> puntero = this.first;
			for (int contador = 0; contador < index; contador++) {
				puntero = puntero.getNext();
			}
			return puntero.getInfo();
		}

	}
	
	public int size() {
		return this.size;
	}

	public String toString() {
	  String resultado = "";
	  Node<T> nodoActual = this.first;
	  while (nodoActual != null){
		  resultado += " info: " + nodoActual.getInfo() +" puntero: "+ nodoActual.getNext();
		  nodoActual = nodoActual.getNext();
	  }

	  return resultado;
	}

	public int indexOf(T info){
		Node<T> nodoActual = this.first;
		int contador = 0 ;
		while(contador < this.size){
			if( nodoActual.getInfo() == info){
				return contador;
			}
			nodoActual = nodoActual.getNext();
			contador++;
		}
		return -1;

	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator(this.first);
	}

	public MySimpleLinkedList<T>elementosDiferentes(MySimpleLinkedList listaComparar){
		MySimpleLinkedList<T> resultado = new MySimpleLinkedList<>();
		Node<T> actual = this.first;
		for (int i = 0; i < this.size; i++) {
			int j = 0;
			Node<T> comparar = listaComparar.first;
			boolean encontro = false;
			while (j < listaComparar.size() && !encontro) {
				if(actual.getInfo() == comparar.getInfo()){
					encontro= true;
				}
				comparar = comparar.getNext();
				j++;
				if(j == listaComparar.size()&& !encontro){
					resultado.insertFront(actual.getInfo());
				}

				/*if(actual.getInfo() != comparar.getInfo()){
					comparar = comparar.getNext();
					j++;
					if(j == listaComparar.size()){
					resultado.insertFront(actual.getInfo());
				}
				}else{
					encontro = true;
				}

				 */
			}

			actual = actual.getNext();

		}

		return resultado;
	}

	public MySimpleLinkedList<T>reunirIguales(MySimpleLinkedList listaComparar){
		MySimpleLinkedList<T> resultado = new MySimpleLinkedList<>();
		Node<T> actual = this.first;
		for (int i = 0; i < this.size; i++) {
			Node<T> comparar = listaComparar.first;
			for (int j = 0; j < listaComparar.size(); j++) {
				if(actual.getInfo() == comparar.getInfo()){
					resultado.insertFront(actual.getInfo());
				}
				comparar = comparar.getNext();
			}
			actual = actual.getNext();

		}

		ordenarLista(resultado);
		return resultado;
	}

	/*public MySimpleLinkedList<T>ordenarLista(MySimpleLinkedList lista){
		Node<T> principio = lista.first;
		Node<T> siguiente = principio.getNext();
		for (int i = 0; i < lista.size; i++) {
			siguiente.getInfo();

		}
	}

	 */



	public MySimpleLinkedList<T> ordenarLista(MySimpleLinkedList<T> lista) {
		if (lista == null || lista.first == null || lista.first.getNext() == null) {
			return lista; // La lista ya está ordenada o vacía
		}
		int i = 0;
		boolean intercambio = false;
		while (i < lista.size - 1 && !intercambio) {
			Node<T> actual = lista.first;
			for (int j = 0; j < lista.size - 1 - i; j++) {
				Node<T> siguiente = actual.getNext();

				if ((int) actual.getInfo() > (int) siguiente.getInfo()){
					// Intercambiamos los valores de los nodos
					T temp = actual.getInfo();
					actual.setInfo(siguiente.getInfo());
					siguiente.setInfo(temp);
					intercambio = true;
				}
				actual = siguiente; // Avanzamos en la lista
			}
			i++;
		}
		return lista;
	}


}
