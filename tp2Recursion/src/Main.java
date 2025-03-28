public class Main {
    final static int MAXARR = 5;
    public static void main(String[] args) {

        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {5, 3, 8, 10};

        //System.out.println("Arreglo 1 está ordenado: " + estaOrdenado(arreglo1, 0)); // true
       // System.out.println("Arreglo 2 está ordenado: " + estaOrdenado(arreglo2, 0)); // false
       // System.out.println(busquedaBinaria(0,MAXARR,1,arreglo1));
        System.out.println(aBinario(25));


    }

   //ejercicio1
    public static boolean estaOrdenado(int[] arr, int index) {
        // Caso base: si llegamos al último elemento o el array está vacío, está ordenado
        if (index == arr.length - 1 || arr.length == 0) {
            return true;
        }

        // Si el elemento actual es mayor que el siguiente, el arreglo no está ordenado
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Llamada recursiva para el siguiente elemento
        return estaOrdenado(arr, index + 1);
    }

   //ejercicio2

    public static boolean busquedaBinaria(int ini, int fin, int num, int[] arrResultante) {
        if (arrResultante.length == 0) {
            return false;
        }

        if (ini >= fin) {
            return false;
        }

        int mitad = ini + (fin - ini) / 2;



        if (arrResultante[mitad] == num) {
            return true;
        }

        if (num > arrResultante[mitad]) {
            return busquedaBinaria(mitad + 1, fin, num, arrResultante);
        }

        return busquedaBinaria(ini, mitad - 1, num, arrResultante);
    }

    public static String aBinario(int convertir) {//TODO CHAT GTP NO HIZO NADA ACA LO PROMETO
        if (convertir == 0) {
            return "0";
        }
        if (convertir == 1) {
            return "1";
        }
        return aBinario(convertir / 2) + (convertir % 2);
    }

}