package Preactico_8_Ejercicio_14;

public class Profesor extends Persona{

        private float salario;
    
        public Profesor ()
        {
            this.salario = 45000;
        }

        public Profesor (String unNombre, int unTel, String unEmail, float unSalario)
        {
            super(unNombre,unTel,unEmail);
            this.salario = unSalario;
        }

        public void setSalario (float unSueldo)
        {
            this.salario = unSueldo;
        }

        public float getSalario ()
        {
            return this.salario;
        }

        public String toString ()
        {
            return super.toString()+" El salario es: "+ this.getSalario();
        }

}
