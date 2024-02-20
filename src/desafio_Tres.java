import java.util.Arrays;

public class desafio_Tres {

        public static int cambioMinimo(int[] arrayMonedas) {

            Arrays.sort(arrayMonedas); //método que se utiliza para ordenar un array en orden ascendente
            int cambio_minimo = 0; 
            
            for (int moneda : arrayMonedas) { //moneda tomará el valor de cada elemento del array
                if (moneda > cambio_minimo +1) { 
                    break; 
                }
                cambio_minimo += moneda;//se actualiza el cambio mínimo sumando el valor de la moneda actual
            }
            return cambio_minimo + 1;
        }

        public static void main(String[] args) {
            int[] monedas1 = {5, 7, 1, 1, 2, 3, 22};
            int[] monedas2 = {1, 1, 1, 1, 1};
            int[] monedas3 = {1, 5, 1, 1, 1, 10, 15, 20, 100};
            int[] monedas4 = {1, 2,4,9};
    //se trata de encontrar el mínimo cambio que no se puede dar con las monedas disponibles
    System.out.print("Moneda");
    for(int valor : monedas1){
        System.out.print("["+ valor +"]");
    }
            System.out.println("-->" + cambioMinimo(monedas1)); // Resultado esperado: 20
            System.out.println("Cambio mínimo para el conjunto de monedas 2: " + cambioMinimo(monedas2)); // Resultado esperado: 6
            System.out.println("Cambio mínimo para el conjunto de monedas 3: " + cambioMinimo(monedas3)); // Resultado esperado: 55
            System.out.println("Cambio mínimo para el conjunto de monedas 4: " + cambioMinimo(monedas4)); // Resultado esperado: 8
        }



    }
