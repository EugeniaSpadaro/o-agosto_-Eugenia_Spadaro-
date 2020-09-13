package Practico_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Libreria {

    public static  void main (String args [])
    {
    /*c) Crear en una clase llamada Librería que contenga el main, y cree 2 objetos Libro (los
         valores que serán ingresados por el usuario) y mostrarlos por pantalla.*/

        Scanner input = new Scanner(System.in);

        /*ingreso datos del primer libro*/
        System.out.println("INGRESE EL ISBN 1");
        int nuevoIsbn = input.nextInt();
        System.out.println("INGRESE EL TITULO 1");
        String tituloIngresado = input.next();
        System.out.println("INGRESE EL NOMBRE DEL AUTOR 1");
        String vacio = input.nextLine();
        System.out.println(" ");
        String nombreIngresadoAutor = input.nextLine();
        System.out.println("INGRESE EL CANTIDAD DE PAGINAS 1");
        int cantidadPaginasIngresadas = input.nextInt();

        Libro libroUnoConsultado = new Libro();

        libroUnoConsultado.setAutor(nombreIngresadoAutor);
        libroUnoConsultado.setISBN(nuevoIsbn);
        if (nombreIngresadoAutor.isEmpty())
        {
            libroUnoConsultado.setAutor("Desconocido");
        }else {
            libroUnoConsultado.setAutor(nombreIngresadoAutor);
        }
        libroUnoConsultado.setNroDePaginas(cantidadPaginasIngresadas);


        /*ingreso datos del segundo libro*/
        System.out.println("INGRESE EL ISBN 2");
        int nuevoIsbn2 = input.nextInt();
        System.out.println("INGRESE EL TITULO 2");
        String tituloIngresado2 = input.next();
        System.out.println("INGRESE EL NOMBRE DEL AUTOR 2");
        String vacio2 = input.nextLine();
        System.out.println(" ");
        String nombreIngresadoAutor2 = input.nextLine();
        System.out.println("INGRESE EL CANTIDAD DE PAGINAS 2");
        int cantidadPaginasIngresadas2 = input.nextInt();

        Libro libroDosConsultado = new Libro();
        libroDosConsultado.setISBN(nuevoIsbn2);
        libroDosConsultado.setAutor(tituloIngresado2);

        if (nombreIngresadoAutor2.isEmpty())
        {
            libroDosConsultado.setAutor("Desconocido");
        }else {
            libroDosConsultado.setAutor(nombreIngresadoAutor2);
        }
        libroDosConsultado.setNroDePaginas(cantidadPaginasIngresadas2);

        System.out.println(libroUnoConsultado);
        System.out.println(libroDosConsultado);
    }
}
