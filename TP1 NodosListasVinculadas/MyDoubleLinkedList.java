package ProgramacionIII.tp1;


import java.util.Iterator;

public class MyDoubleLinkedList<T>{

        private NodeDouble<T> first;
        private int size;

        public MyDoubleLinkedList() {
            this.first = null;
            this.size = 0;
        }

        public void insertFront(T info) {
            NodeDouble<T> tmp = new NodeDouble<T>(info,null,null);
            tmp.setNext(this.first);//nuevo nodo setea puntero next con direcc first
            if (this.first != null){
                this.first.setBack(tmp);// primer nodo setea como direc back al nuevo nodo
            }
            this.first = tmp;// nuevo nodo pasa a ser primer nodo
            this.first.setBack(null);// el nuevo primer nodo setea su direc back null
            size++;
        }

        public T extractFront() {
            NodeDouble<T> tmp = first;
            this.first = first.getNext();
            this.first.setBack(null);
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
                NodeDouble<T> puntero = this.first;
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
            NodeDouble<T> nodoActual = this.first;
            while (nodoActual != null){
                resultado += " punteroBack: "+ nodoActual.getBack() +" info: " + nodoActual.getInfo() +" punteroNext: "+ nodoActual.getNext();
                nodoActual = nodoActual.getNext();
            }

            return resultado;
        }

        public int indexOf(T info){
            NodeDouble<T> nodoActual = this.first;
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


    }

