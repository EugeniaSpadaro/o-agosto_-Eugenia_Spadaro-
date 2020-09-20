package Practico_7_Ejercicio_3;


import java.util.Scanner;

public class ValidarVehiculos {

    public static void  main (String args [])
    {
        /*Crear desde el main, dos motocicletas y dos semirremolques*/

        Scanner input = new Scanner(System.in);

        /*Ingresamos dos motocicletas*/

        System.out.println("***Datos de la motocicleta****");
        Vehiculo motocicleta = new Motocicleta(4,"Verde",250,"Mayor");

        System.out.println("Ingrese la cantidad de ruedas de la moto");
        int cantRuedas = input.nextInt();
        System.out.println("Ingrese el color de la moto");
        String colorMoto = input.next();
        System.out.println("Ingrese la velocidad de la moto");
        int velocidadMoto = input.nextInt();
        System.out.println("Ingrese la cilindrada de la moto");
        String cilindradaMoto = input.next();
        Vehiculo motocicleta1 = new Motocicleta(cantRuedas,colorMoto,velocidadMoto,cilindradaMoto);

        System.out.println("***Actualizando datos de la moto ***");
        System.out.println(motocicleta);
        System.out.println(motocicleta1);

        /*Ingresamos dos semiremlque*/
        System.out.println("***Datos del Semiremolque****");
        Vehiculo semiremolque = new Semiremolque(8,"Violeta",3);


        System.out.println("Ingrese la cantidad de ruedas remolque");
        int cantRuedasSemiRemolque = input.nextInt();
        System.out.println("Ingrese el color del semiremolque");
        String colorRemolque = input.next();
        System.out.println("Ingrese la cantidad de ejes del remolque");
        int cantEjes = input.nextInt();

        Vehiculo semiremolque1 = new Semiremolque(cantRuedasSemiRemolque,colorRemolque,cantEjes);
        System.out.println("***Actualizando datos del semiremolque ***");
        System.out.println(semiremolque);
        System.out.println(semiremolque1);

    }
}
