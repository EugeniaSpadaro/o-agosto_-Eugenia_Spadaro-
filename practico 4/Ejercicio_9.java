package Practico_3_Metodos_ParteDos;



import java.util.Scanner;

public class Ejercicio_9 {
    /*9)	Realizar un método llamado calcularPromedio, que solicite el ingreso de
    números hasta que se ingrese 0, y que calcule el promedio de los mismos.
     Se debe utilizar el método ingresarNumero realizado previamente.*/

    public static void main (String args [])
    {
         int validarNumero = ingresarNumero();
         int resultado = calcularPromedio(validarNumero);
         System.out.println("El resultado del promedio es: "+ resultado);

    }

    public static int ingresarNumero ()
    {
        Scanner input  = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numeroIngresado = input.nextInt();
        return numeroIngresado;
    }
    public static int calcularPromedio (int numeroACalcular)
    {
        Scanner input  = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (numeroACalcular!=0)
        {
            suma = suma + numeroACalcular;
            contador = contador +1;
            System.out.println("Ingrese otro numero");
            numeroACalcular = input.nextInt();
        }
         int promedio = suma/contador;
        return promedio;
    }

}
