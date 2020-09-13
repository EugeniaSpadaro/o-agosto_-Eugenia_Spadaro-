package Practico_5;

public class Libro {

    /*En tu proyecto crear una clase Libro que contenga los siguientes atributos:
● ISBN: int
● Titulo: String
● Autor: String
● Número de páginas: in*/

    private  int ISBN;
    private  String titulo;
    private  String autor;
    private  int nroDePaginas;

    /*b) Crear un constructor sin parámetros, y un constructor que contenga todos los
parámetros del libro. El constructor sin parámetros, debe setear el título del libro como
“Sin título”.*/

    public  Libro ()
    {
        this.ISBN = 4585;
        this.titulo = "Sin titulo";
        this.autor = "Euge Spadaro";
        this.nroDePaginas = 1526;
    }

    public  Libro (int ISBNIngresado, String tituloLibro, String nombreDelAutor, int cantidadPaginas)
    {
      this.ISBN = ISBNIngresado;
      this.titulo = tituloLibro;

      this.autor = nombreDelAutor;
      this.nroDePaginas = cantidadPaginas;
    }
    /*Crear sus respectivos métodos get y set para cada atributo*/

        public int getISBN ()
        {
            return  this.ISBN;
        }

        public void setISBN (int nuevoISBN)
        {
            this.ISBN = nuevoISBN;
        }

        public String getTitulo ()
        {
            return  this.titulo;
        }
        public void setTitulo (String nuevoTitulo)
        {
            this.titulo = nuevoTitulo;
        }

        public String getAutor ()
        {
            return this.autor;
        }
        public  void setAutor (String nuevoAutor)
        {
            this.autor = nuevoAutor;
        }
        public int getNroDePaginas ()
        {
            return this.nroDePaginas;
        }
        public void setNroDePaginas (int nuevoNroDePaginas)
        {
            this.nroDePaginas = nuevoNroDePaginas;
        }

        /*Crear el método toString()
para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN xxxx creado por el autor yyyy tiene zz páginas”
*/
        public String toString ()
        {
           String leyenda = "El libro con ISBN: " + this.ISBN + " creado por el autor : " + this.autor + " y tiene  "+this.nroDePaginas+" paginas";


           return leyenda;
        }

}
