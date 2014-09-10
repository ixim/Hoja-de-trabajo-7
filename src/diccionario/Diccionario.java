
package diccionario;
import java.util.Scanner;
import java.io.*;

public class Diccionario 
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader archivo = new FileReader("diccionario.txt"); //Abrir el fichero indicado en la variable 
            int caracter1 = 0;
            do
            {
                caracter1 = archivo.read(); //Leer el primer carácter	
            }
            while(caracter1 != 0); //Se recorre el fichero hasta encontrar el carácter -1 que marca el final del fichero
				
            archivo.close(); //Cerrar el fichero
        }
        catch (Exception e)
        {
            System.out.println("Error de lectura del fichero");
        }
    }
}
