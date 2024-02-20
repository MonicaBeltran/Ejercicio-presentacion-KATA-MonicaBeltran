
import java.util.Arrays;

public class desafio_Dos {

    public static void main(String[] args) {
        int S = 22;
        int[] array1 = { 1, 2, 3, 5, 6, 8, 9 };
        int[] array2 = { -2, -1 };
        int[] array3 = { -6, -5, 0, 5, 6 };
        System.out.println("Array Inicial ascendente --> Array int cuadrados en el rango de 0,22");
        System.out.print(Arrays.toString(array1) + "-->");
        imprimirArreglo(calculoCuadradosAscendente(array1, S));
        System.out.print(Arrays.toString(array2) + "-->");
        imprimirArreglo(calculoCuadradosAscendente(array2, S));
        System.out.print(Arrays.toString(array3) + "-->");
        imprimirArreglo(calculoCuadradosAscendente(array3, S));
    }

    /*
     * Este método calcula el cuadrado de cada elemento del arreglo, ordena los cuadrados
     * resultantes en orden ascendente y luego filtra los cuadrados que están dentro del rango [0, 22].
     * Retorna un arreglo con los cuadrados dentro de este rango.
     */
    public static int[] calculoCuadradosAscendente(int[] array, int S) {
        int[] arrayCuadrado = new int[array.length];// Inicialización de la matriz de resultados
        for (int i = 0; i < array.length; i++) {
            arrayCuadrado[i] = array[i] * array[i];
        }
        Arrays.sort(arrayCuadrado);
        int[] resultadoFinal = new int[arrayCuadrado.length];
        int indice = 0;
        for (int i = 0; i < arrayCuadrado.length; i++) {
            if (arrayCuadrado[i] >= 0 && arrayCuadrado[i] <= S) {
                resultadoFinal[indice++] = arrayCuadrado[i];
            }
        }
        // se redimensiona el arreglo resultadoFinal utilizando Arrays.copyOf para
        // eliminar los valores sobrantes.
        if (indice < arrayCuadrado.length) {
            resultadoFinal = Arrays.copyOf(resultadoFinal, indice);
        }
        return resultadoFinal;
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + " ]");
        }
        System.out.println();
    }
}
