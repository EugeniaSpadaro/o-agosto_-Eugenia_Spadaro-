package Preactico_8_Ejercicio_14;

public class Persona {

        private String nombre;
        private  int telefono;
        private String email;
        private Direccion direccion;

        public Persona ()
        {
            this.nombre = "Eugenia";
            this.telefono = 48545296;
            this.email = "eugispadaro@gmail.com";
        }

        public Persona (String unNombre, int unTelefono, String unEmail)
        {
            this.nombre = unNombre;
            this.telefono = unTelefono;
            this.email = unEmail;
        }

        public void setDireccion (Direccion unaDireccion)
        {
            this.direccion = unaDireccion;
        }

        public Direccion getDireccion ()
        {
           return this.direccion;
        }
        public void setNombre (String nombrePersona)
        {
            this.nombre = nombrePersona;
        }

        public String getNombre ()
        {
            return  this.nombre;
        }

        public void setTelefono (int valorTel)
        {
            this.telefono = valorTel;
        }

        public int getTelefono ()
        {
            return  this.telefono;
        }

        public void setEmail (String valorEmail)
        {
            this.email = valorEmail;
        }

        public String getEmail ()
        {
            return  this.email;
        }

        public String toString ()
        {
            return "El nombre es: "+ this.getNombre() +  " El telefono es: " +this.getTelefono()+
                    " el mail es: "+this.getEmail() +" "+this.getDireccion();
        }

}
