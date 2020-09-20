package Practico_7_Ejercicio_3;

public class Auto extends Vehiculo {
    /*Crear una clase Auto con los atributos velocidadMáxima y cilindrada de tipo int y String
respectivamente. Realizar los constructores, getters y setters así también como el método
toString.*/

    private  int velocidadMáxima;
    private  String cilindrada;

        public Auto ()
        {
            this.velocidadMáxima = 150;
            this.cilindrada = "Alta";
        }
        public Auto (int ruedasAuto, String color, int velocidadMáximaAuto, String cilindradaAuto)
        {
            super (ruedasAuto, color);
            this.velocidadMáxima = velocidadMáximaAuto;
            this.cilindrada = cilindradaAuto;
        }

        public void setVelocidadMáxima (int velocidadAuto)
        {
            this.velocidadMáxima = velocidadAuto;
        }

        public int getVelocidadMáxima ()
        {
            return this.velocidadMáxima;
        }

        public void setCilindrada (String cilindradaAuto)
        {
            this.cilindrada = cilindradaAuto;
        }
        public String getCilindrada ()
        {
            return this.cilindrada;
        }

        public String toString ()
        {
            return super.toString()+ " La velocidad maxima es: "+ this.getVelocidadMáxima()+ " y la cilindrada es: "+this.getCilindrada();
        }
}

