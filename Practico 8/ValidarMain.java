package Preactico_8_Ejercicio_14;

import java.util.Scanner;

public class ValidarMain {

        public static void main (String args [])
        {
            Persona prof = new Profesor();
            Direccion validarDire = new Direccion();
            prof.setDireccion(validarDire);
            System.out.println(prof);
            int valor = obtenerCodigoTel();
            System.out.println("El codigo ingresado es: "+valor);
        }

        public static  int obtenerCodigoTel ()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el codigo de area del telefono");
            int codigo = input.nextInt();
            return codigo;
        }
}
