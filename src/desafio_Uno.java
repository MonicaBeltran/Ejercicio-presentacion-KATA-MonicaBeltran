import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio_Uno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = 2;

        System.out.println("cantidad de numeros que contendra la lista");
        int n = scan.nextInt();

        List<Integer> lista = new ArrayList<>();
        if (n <= 100) {
            System.out.println("Registre los numeros ");
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                lista.add(num);
            }
        } else {
            System.out.println("La cantidad de numeros no debe ser superior a 100");
        }
        // Empleando la parte logica

        System.out.println("Lista original: " + lista);
        modificarLista(lista, S);
        System.out.print("Lista modificada orden Inverso:");
        mostrarListaAlReves(lista);

    }

    /*
     * Este metodo recorre cada número en la lista, lo convierte en una cadena,
     * elimina los dígitos mayores o iguales que S=2 de cada número y actualiza la
     * lista.
     */

    public static void modificarLista(List<Integer> lista, int S) {
        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i);
            String numStr = String.valueOf(num);
            StringBuilder nuevoNumStr = new StringBuilder();// se utilizará para construir el nuevo número después de
                                                            // eliminar los dígitos mayores o iguales que S.
            for (char c : numStr.toCharArray()) {// itera sobre cada carácter en la cadena numStr
                if (Character.getNumericValue(c) < S) {
                    nuevoNumStr.append(c);
                }
            }
            if (nuevoNumStr.length() > 0) { // Si nuevoNumStr contiene caracteres, convierte la cadena a un entero
                // y reemplaza el elemento original en la lista con este nuevo número.
                lista.set(i, Integer.parseInt(nuevoNumStr.toString()));
            } else {
                lista.remove(i);
                i--; // para ajustar el índice y evitar saltarse elementos en la siguiente iteración.
            }
        }
    }

    public static void mostrarListaAlReves(List<Integer> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print("["+lista.get(i) + "]");
        }
        System.out.println();
    }
}