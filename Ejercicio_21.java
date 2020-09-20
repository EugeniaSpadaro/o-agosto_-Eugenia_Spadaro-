package Practico_6_Arreglos;

import java.util.Scanner;

public class Ejercicio_21 {

    /*21. Crear un branch llamada practico6/ejercicio21 partiendo de dev y crear una pull request con lo siguiente programa:
     Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros. Los numeros deben ser ingresados por el usuario. Luego, mostrar la cantidad de números positivos, negativos y ceros:
    Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”*/

    public static void main(String args[])
    {
        int[] arregloEnteroAValidar = arregloAImprimir(5);
        imprimirResultado(arregloEnteroAValidar);

    }


        public static int[] arregloAImprimir(int largo)
        {
            int[] arregloResultado = new int[largo];
            return arregloResultado;
        }

        public static void imprimirResultado(int[] arrayEnteros) {
            Scanner input = new Scanner(System.in);
            int valor = 0;
            int sumaPositivos = 0;
            int sumaNegativos = 0;
            int sumaCeros = 0;
            for (int i = 0; i < arrayEnteros.length; i++)
            {
                System.out.println("Ingrese un valor");
                valor = input.nextInt();
                arrayEnteros[i] = valor;

                if (arrayEnteros[i] < 0)
                {
                    sumaNegativos++;
                }
                if (arrayEnteros[i] > 0)
                {
                    sumaPositivos++;
                }
                if (arrayEnteros[i] == 0)
                {
                    sumaCeros++;
                }
            }

            System.out.println("Se ingresaron "+sumaPositivos+" números positivos, "+sumaNegativos+" número negativo y "+sumaCeros+ " cero");

        }
}
