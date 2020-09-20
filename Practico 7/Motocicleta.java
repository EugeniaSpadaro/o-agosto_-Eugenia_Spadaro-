package Practico_7_Ejercicio_3;

public class Motocicleta extends Vehiculo{

    /*Crear una clase Motocicleta con los atributos velocidad y cilindrada de tipo int y String
respectivamente. Realizar los constructores, getters y setters así también como el método
toString. */

    private int velocidad;
    private String cilindrada;

        public Motocicleta()
        {
            this.velocidad = 200;
            this.cilindrada = "Baja";
        }

        public Motocicleta (int ruedasAuto, String color,int velocidadMoto, String cilindradaMoto)
        {
            super(ruedasAuto,color);
            this.velocidad = velocidadMoto;
            this.cilindrada = cilindradaMoto;
        }

        public void setVelocidad (int velocidadMoto)
        {
            this.velocidad = velocidadMoto;
        }
        public int getVelocidad ()
        {
            return  this.velocidad;
        }

        public void setCilindrada (String ciliMoto)
        {
            this.cilindrada = ciliMoto;
        }
        public String getCilindrada ()
        {
            return this.cilindrada;
        }

        public String toString ()
        {
            return super.toString()+" La velocidad de la motor es: "+this.getVelocidad()+ " y la cilindrada de la moto es: "+this.getCilindrada();
        }
}
