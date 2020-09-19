package Practico_6_Arreglos;

public class Ejercicio_20 {
    /*20. Crear un branch llamada practico6/ejercicio20
    Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los elementos son verdaderos. */

    public static void main (String arg [])
    {
        boolean [] arregloAMostrar = arregloDeBooleanos(3);
        arregloAMostrar[0] = true;
        arregloAMostrar[1] = false;
        arregloAMostrar[2] = true;
            if (imprimirResultadoBooleano(arregloAMostrar) == true)
            {
                System.out.println("Todos los elementos son verdaderos");
            }else {
                System.out.println("Hay al menos un elemento en falso");
            }
    }

            public static boolean [] arregloDeBooleanos (int largoDelArreglo)
            {
                boolean [] arregloAImprimirBooleano = new  boolean [largoDelArreglo];
                return arregloAImprimirBooleano;
            }

            public static boolean  imprimirResultadoBooleano (boolean [] arregloAimprimir)
            {
                for (int i=0; i< arregloAimprimir.length;i++)
                {

                    if (arregloAimprimir[i]==false) {
                        return false;

                    }
                }
                    return true;

            }

}
