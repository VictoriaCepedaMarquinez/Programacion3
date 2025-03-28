package ProgramacionIII.tp1;

public class Main {
    public static void main(String[] args) {

     /*
        MySimpleLinkedList <Integer>lista1 = new MySimpleLinkedList<>();
        MySimpleLinkedList <Integer>lista2 = new MySimpleLinkedList<>();
        lista2.insertFront(7);
        lista2.insertFront(2);
        lista2.insertFront(5);
      //  System.out.println(lista1.isEmpty());
        lista1.insertFront(7);
        lista1.insertFront(8);
        lista1.insertFront(5);

      */

       // System.out.println(lista1.elementosDiferentes(lista2));

       // System.out.println(lista1.reunirIguales(lista2));
       // System.out.println(lista1.isEmpty());

       //System.out.println(lista1);

       // System.out.println( lista1.indexOf(5));


       // System.out.println( lista1.extractFront());


      //  for (Integer infoNodo : lista1) {
      //      System.out.println(infoNodo);
     //   }


    // prueba con lista doblemente vinculada

        MyDoubleLinkedList <Integer>lista2 = new MyDoubleLinkedList<>();
        lista2.insertFront(7);
        lista2.insertFront(2);

        System.out.println(lista2);
        System.out.println( lista2.extractFront());

    }
}
