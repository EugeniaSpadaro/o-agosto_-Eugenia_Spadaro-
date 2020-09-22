package Practico_7_Ejercicio_3;

public class Semiremolque extends  Vehiculo{
    /*Crear una clase SemiRemolque con el atributo de cantidadEjes (int). Realizar los constructores
con y sin parámetros, getters y setters así también como el método toString.*/

    private int cantidadEjes;

        public Semiremolque ()
        {
            this.cantidadEjes = 5;
        }

        public Semiremolque (int ruedasAuto, String color,int cantEjes)
        {
            super(ruedasAuto,color);
            this.cantidadEjes = cantEjes;
        }

        public void setCantidadEjes (int ejesRemolque)
        {
            this.cantidadEjes = ejesRemolque;
        }
        public int getCantidadEjes ()
        {
            return  this.cantidadEjes;
        }

        public String toString ()
        {
            return super.toString()+" La cantidad de ejes del remolque es: "+this.getCantidadEjes();
        }
}
