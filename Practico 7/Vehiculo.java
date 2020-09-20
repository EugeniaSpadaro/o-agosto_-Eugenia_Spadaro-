package Practico_7_Ejercicio_3;

public class Vehiculo {

    /*Crear una clase Vehiculo con los atributos ruedas y color. Realizar los constructores, getters y
setters así también como el método toString.*/

    protected int ruedas;
    protected String color;

        public Vehiculo ()
        {
            this.ruedas = 4;
            this.color= "Rojo";
        }

        public Vehiculo (int cantRuedas, String unColor)
        {
            this.ruedas = cantRuedas;
            this.color = unColor;
        }

        public void setRuedas ( int unRueda)
        {
            this.ruedas = unRueda;
        }

        public int getRuedas ()
        {
            return this.ruedas;
        }

        public void setColor (String colorVehiculo)
        {
            this.color = colorVehiculo;
        }
        public String getColor ()
        {
            return  this.color;
        }

        public String toString ()
        {
            return "La cantidad de ruedas es: "+ this.getRuedas()+ " Y el color del vehiculo es: "+ this.getColor();
        }

}
