
//https://www.java.com/es/

// Así es un comentario en una sola linea.

/*
Así es un
comentario de
varias lineas.
*/

/**
Asi es un comentario
de manera oficial en Java
*/

public class camilo-suarez0{
  public static void main (String[] args){
    var my_variable = "Camilo";/*Con la actualización de Java no es necesario especificar el tipo de dato, solo colocando 'var' y el valor, 
    Java infiere el tipo de dato*/
    var my_variable = "Andres";//Nuevo nombre en mi variable

    final String MY_CONSTANT = "Suarez";//Mi constante

    //Forma tradicional para declarar variables
    byte my_bite = 1;
    short my_short = 10;
    int my_int = 100;
    long my_long = 1000;
    float my_float = 1.5;
    double my_double = 1.5712;
    boolean my_boolean = false;
    char my_char = 'C';
    String my_string = "Cadena de texto";

    //Forma moderna para declarar variables con actualización de Java
    var my_byte = 100;
    var my_short = 1000;
    var my_int = 10000; 
    var my_long = 100000L;
    var my_float = 3.14f;
    var my_double = 3.1416;
    var my_boolean = true;
    var my_char = 'A';
    var my_string = "Nueva cadena de texto";

    System.out.println("¡Hola, Java!");
  }
}
