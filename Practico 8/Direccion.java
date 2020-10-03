package Preactico_8_Ejercicio_14;

public class Direccion {

        private String calle;
        private String ciudad;
        private String estado;
        private String pais;

        public Direccion ()
        {
            this.calle = "Aguirre 295";
            this.ciudad = "Buenos Aires";
            this.estado = "Capital Federal";
            this.pais = "Argentina";

        }

        public Direccion (String unaCalle, String unaCiudad, String unEstado, String unPais)
        {
            this.calle = unaCalle;
            this.ciudad = unaCiudad;
            this.estado = unEstado;
            this.pais = unPais;
        }

        public void setCalle (String calleAValidar)
        {
            this.calle = calleAValidar;
        }

        public String getCalle ()
        {
            return this.calle;
        }
        public void setCiudad (String ciudadAValidar)
        {
            this.ciudad = ciudadAValidar;
        }

        public String getCiudad ()
        {
            return this.ciudad;
        }


        public void setPais (String paisAValidar)
        {
            this.pais = paisAValidar;
        }

        public String getPais ()
        {
            return this.pais;
        }

        public void setEstado (String estadoAValidar)
        {
            this.estado = estadoAValidar;
        }

        public String getEstado ()
        {
            return this.estado;
        }

        public String toString ()
        {
            return  "La calle es: "+ this.getCalle() + " la ciudad es: "+this.getCiudad()+" El estado es: "+this.getCiudad()+" el pais es: "+this.getPais();
        }

}
